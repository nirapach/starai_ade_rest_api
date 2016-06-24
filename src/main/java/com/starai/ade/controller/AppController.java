package com.starai.ade.controller;

/**
 * Created by niranjan on 7/1/15.
 */

import com.starai.ade.model.Success.SuccessMessage;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrieval.MedCanadaRetrieval;
import retrieval.OffsidesTwosidesRetrieval;
import retrieval.OpenFDADrugRetrieval;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/")
@SuppressWarnings("unused")
public class AppController {

    Logger logger = LoggerFactory.getLogger(AppController.class);

    @Autowired
    MedCanadaRetrieval medCanadaRetrieval;
    @Autowired
    OpenFDADrugRetrieval fdaDrugRetrieval;
    @Autowired
    OffsidesTwosidesRetrieval offsidesTwosidesRetrieval;

    private BindingResult result;
    private ModelMap model;

    @Autowired
    SuccessMessage successmessage;
     /*
        * This method is used to get the adverse vents from redis for fda ADE pairs
        */

    @RequestMapping(value = {"/fda_ade/" }, method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public JSONObject listfdaadeinfo(@RequestParam("drug_name") String drug_name) throws ParseException, SQLException, PropertyVetoException, IOException, URISyntaxException {

        JSONObject openFDADrugADE = fdaDrugRetrieval.retrieveOnDrugName(drug_name);

        return openFDADrugADE;

    }

    @RequestMapping(value = {"/fda_ade/" }, method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public JSONObject listfdaadeindicationinfo(@RequestParam("drug_indication") String drug_indication) throws ParseException, SQLException, PropertyVetoException, IOException, URISyntaxException {

        JSONObject openFDADrugIndADE = fdaDrugRetrieval.retrieveOnDrugIndicationName(drug_indication);

        return openFDADrugIndADE;
    }

       /*
        * This method is used to get non fda adverse drug events
        */

    @RequestMapping(value = {"/offsides_ade/" }, method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public JSONObject listoffsidesadeindicationinfo(@RequestParam("drug_name") String drug_name) throws ParseException, SQLException, PropertyVetoException, IOException, URISyntaxException {

        JSONObject offsidesOnDrugName = offsidesTwosidesRetrieval.retrieveOffsidesOnDrugName(drug_name);

        return offsidesOnDrugName;

    }

    @RequestMapping(value = {"/twosides_ade/" }, method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public JSONObject listadgroupinfo(@RequestParam("drug_pairs") String drug_pairs) throws ParseException, SQLException, PropertyVetoException, IOException, URISyntaxException {

        JSONObject twosidesOnDrugName = offsidesTwosidesRetrieval.retrieveTwosidesOnDrugName(drug_pairs);

        return twosidesOnDrugName;
    }

      /*
        * This method is used to get non fda adverse drug events
        */

    @RequestMapping(value = {"/medcanada_ade/" }, method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public JSONObject listMedCanadaADE(@RequestParam("drug_name") String drug_name) throws ParseException, SQLException, PropertyVetoException, IOException, URISyntaxException {

        JSONObject medCanadaDrugADE = medCanadaRetrieval.retrieveOnDrugName(drug_name);

        return medCanadaDrugADE;
    }


}
