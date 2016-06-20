package com.starai.ade.controller;

/**
 * Created by niranjan on 7/1/15.
 */

import com.starai.ade.model.FDAADELevelStats;
import com.starai.ade.model.Success.SuccessMessage;
import com.starai.ade.service.RedisRetrievalService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrieval.MedCanadaRetrieval;

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
    RedisRetrievalService redisRetrievalService;

    @Autowired
    MedCanadaRetrieval medCanadaRetrieval;

    private BindingResult result;
    private ModelMap model;

    @Autowired
    SuccessMessage successmessage;


     /*
        * This method is used to get the adverse vents from redis for fda ADE pairs
        */

    @RequestMapping(value = {"/fda_ade/" }, method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public List<FDAADELevelStats> listfdaadeinfo(@RequestParam("drug_name") String drug_name) throws ParseException, SQLException, PropertyVetoException, IOException, URISyntaxException {

       // List<FDAADELevelStats> adCampaignsList = getcampaignstats(account_id);

       // return adCampaignsList ;
    }

    @RequestMapping(value = {"/fda_ade/indication" }, method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public List<AdCampaigns> listcampaigninfo(@RequestParam("account_id") Long account_id) throws ParseException, SQLException, PropertyVetoException, IOException, URISyntaxException {

        List<AdCampaigns> adCampaignsList = adCampaignsDashboard.getcampaignstats(account_id);

        return adCampaignsList ;
    }

       /*
        * This method is used to get non fda adverse drug events
        */

    @RequestMapping(value = {"/nonfda_ade/drug" }, method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public List<AdGroup> listadgroupinfo(@RequestParam("account_id") Long account_id) throws ParseException, SQLException, PropertyVetoException, IOException, URISyntaxException {

        List<AdGroup> adGroupList = adGroupDashboard.getadgroupstats(account_id);

        return adGroupList;
    }

    @RequestMapping(value = {"/nonfda_ade/drugpairs" }, method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    public List<AdGroup> listadgroupinfo(@RequestParam("account_id") Long account_id) throws ParseException, SQLException, PropertyVetoException, IOException, URISyntaxException {

        List<AdGroup> adGroupList = adGroupDashboard.getadgroupstats(account_id);

        return adGroupList;
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
