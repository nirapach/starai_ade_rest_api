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
