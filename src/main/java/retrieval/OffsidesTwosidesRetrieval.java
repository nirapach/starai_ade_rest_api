package retrieval;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.io.*;
import java.util.Set;

/**
 * Created by Niranjan on 6/14/2016.
 */
@SuppressWarnings("unchecked")
@Service
public class OffsidesTwosidesRetrieval {
    //address of your redis server
    private static final String redisHost = "127.0.0.1";
    private static final Integer redisPort = 6379;
    private static final int databaseIndex = 2;
    private static final String COMMA_DELIMITER = ",";
    private static final String SEMI_COLON_DELIMITER = ";";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public OffsidesTwosidesRetrieval() {
    }

    public Jedis connectRedis() {
        Jedis jedis = new Jedis(redisHost, redisPort);
        jedis.connect();
        jedis.select(databaseIndex);
        System.out.println("Connected Jedis client");
        return jedis;
    }

    public boolean retrieveParams(String inputName,int databaseIndex) {

        Jedis conn = connectRedis();
        inputName = inputName.toLowerCase().trim();
        Set<String> effectOutput = conn.smembers(inputName);
        System.out.println(makeJsonObject(inputName, effectOutput).toString());

        return true;
    }


    public JSONObject makeJsonObject(String drugName, Set<String> values) {
        JSONObject jsoon = new JSONObject();
        JSONArray arrayOutput = new JSONArray();
        for (String effects : values) {
            arrayOutput.put(effects);
            //writer.append(effects);
            //writer.append(SEMI_COLON_DELIMITER);
        }
        jsoon.put("Values", arrayOutput);
        jsoon.put("Drug", drugName);
        return jsoon;
    }

    public JSONObject retrieveOffsidesOnDrugName(String drugName) {
        Jedis conn = connectRedis();
        drugName = drugName.toLowerCase().trim();
        Set<String> effectOutput = conn.smembers(drugName);
        return makeJsonObject(drugName, effectOutput);

    }

    public JSONObject retrieveTwosidesOnDrugName(String drugName) {
        Jedis conn = connectRedis();
        drugName = drugName.toLowerCase().trim();
        Set<String> effectOutput = conn.smembers(drugName);
        return makeJsonObject(drugName, effectOutput);

    }

    public boolean retrieveOnDruginFile(File fileName, String outputFilePath) {
        Jedis conn = connectRedis();
        boolean isSuccess = false;
        BufferedReader fileReader = null;
        FileWriter writer = null;
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            writer = new FileWriter(outputFilePath);
            String drugLine;
            while ((drugLine = fileReader.readLine()) != null) {
                //writer.append(drugLine);
                //writer.append(COMMA_DELIMITER);
                drugLine = drugLine.toLowerCase().trim();
                Set<String> effectOutput = conn.smembers(drugLine);
                /*for(String effects: effectOutput){
                    arrayOutput.put(effects);
                    //writer.append(effects);
                    //writer.append(SEMI_COLON_DELIMITER);
                }*/
                writer.append(makeJsonObject(drugLine, effectOutput).toString());
                writer.append(NEW_LINE_SEPARATOR);

            }
            isSuccess = true;
            fileReader.close();
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return isSuccess;
        }
    }


}



