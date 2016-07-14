# starai_ade_rest_api
BackEnd API for ADE

 * Add or deltete the end points in "Controller package"
 * Get request should contain json object
 * Response will be a json object
 * Three types of databases as mentioned in STARAI_ADE client code can be queried using these endpoints


Steps to Deploying the WAR file:

* Clone the repo
* Execute the commands(either in an IDE or commandline)
      *mvn clean install
      *mvn generate-resources
      *mvn package
* A WAR file will be cretaed in the target directory of the repo
* Copy the WAR file and paste it in the Apache Tomcat Webapps folder (Make sure Apache Tomacat is installed and running first)


Guidelines for API call:

Note: If called from external application LocalHost should be replaced by NILS ip address
If called from NILS itself then localhost would be fine


*For getting events from fda database using drug name:

"curl http://localhost:8080/ade_starai_webapi-1.0/fda_ade/?drug_name=something";

*For getting events from fda database using drug indication:

"curl http://localhost:8080/ade_starai_webapi-1.0/fda_ade/di/?drug_indication=something";

*For getting events from offsides database using drug name:

"curl http://localhost:8080/ade_starai_webapi-1.0/offsides_ade/?drug_name=something";

*For getting events from twosides database using drug name:

"curl http://localhost:8080/ade_starai_webapi-1.0/twosides_ade/?drug_pairs=something";

*For getting events from med canada database using drug name:

"curl http://localhost:8080/ade_starai_webapi-1.0/medcanada_ade/?drug_name=something";

Note: Deploy the war file under tomcat webapps folder.
Tomcat will be located in /home/projects/tomcat/
