package com.starai.ade.dao.base.ProductLevel;

import com.starai.ade.dao.base.BaseDAO;
import com.starai.ade.mapper.ProductLevel.ProductLevelAccountsMapper;
import com.starai.ade.mapper.ProductLevel.ProductLevelAdGroupMapper;
import com.starai.ade.mapper.ProductLevel.ProductLevelAdSetMapper;
import com.starai.ade.mapper.ProductLevel.ProductLevelCampaignMapper;
import com.starai.ade.model.Endpoints.ReportParams;
import com.starai.ade.model.FDAADELevelStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.util.List;

/**
 * Created by niranjan on 8/12/15.
 */
@Component
@SuppressWarnings("unchecked")
@Repository("productDAO")
public class ProductLevelDAOImpl extends BaseDAO implements ProductLevelDAO {

    @Autowired
    PDTTimeZone pdtTimeZone;


    //ad account placement stats
    @Override
    public List<FDAADELevelStats> listproductaccountstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException
    {
        long page_id=reportParams.getCustomer_id();
        //converting util.date to sql.date and to PDT zone
        java.sql.Date Stats_date=pdtTimeZone.getTimeZone(reportParams);

        List<FDAADELevelStats> FDAADELevelStatsList;
        String SELECT = "SELECT Application_Client_ID,Application_Ad_Account_ID,Application_Ad_Account_Name,Client_Product_ID,Client_Reports_Impressions,Client_Reports_Clicks," +
                "Client_Reports_Total_Actions,Client_Reports_Social_Impressions,Client_Reports_CPM,Client_Reports_CPC,Client_Reports_CPP,Client_Reports_CTR," +
                "Client_Reports_Spend,Client_Reports_Ad_Activity_Date_End,Client_Reports_Ad_Activity_Date_Start,Stats_Date"
                + " FROM Product_Account_Statistics_Results"
                + " WHERE Application_Client_ID="+page_id+" and Stats_Date="+"'"+Stats_date+" 00:00:00'";

        FDAADELevelStatsList =getJdbcTemplate().query(SELECT,new ProductLevelAccountsMapper());


        return FDAADELevelStatsList;

    }
    //ad set placement stats
    @Override
    public List<FDAADELevelStats> listproductadsetlevelstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException
    {
        long page_id=reportParams.getCustomer_id();
        //converting util.date to sql.date and to PDT zone
        java.sql.Date Stats_date=pdtTimeZone.getTimeZone(reportParams);

        List<FDAADELevelStats> FDAADELevelStatsList;
        String SELECT = "SELECT Application_Client_ID,Application_AdSet_ID,Application_AdSet_ID,Client_Product_ID,Client_Reports_Impressions,Client_Reports_Clicks," +
                "Client_Reports_Total_Actions,Client_Reports_Social_Impressions,Client_Reports_CPM,Client_Reports_CPC,Client_Reports_CPP,Client_Reports_CTR," +
                "Client_Reports_Spend,Client_Reports_Ad_Activity_Date_End,Client_Reports_Ad_Activity_Date_Start,Stats_Date"
                + " FROM Product_AdSet_Statistics_Results"
                + " WHERE Application_Client_ID="+page_id+" and Stats_Date="+"'"+Stats_date+" 00:00:00'";

        FDAADELevelStatsList =getJdbcTemplate().query(SELECT,new ProductLevelAdSetMapper());


        return FDAADELevelStatsList;

    }
    //ad account placement stats
    @Override
    public List<FDAADELevelStats> listproductcampaignlevelstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException
    {
        long page_id=reportParams.getCustomer_id();
        //converting util.date to sql.date and to PDT zone
        java.sql.Date Stats_date=pdtTimeZone.getTimeZone(reportParams);

        List<FDAADELevelStats> FDAADELevelStatsList;
        String SELECT = "SELECT Application_Client_ID,Application_Campaign_ID,Application_Campaign_Name,Client_Product_ID,Client_Reports_Impressions,Client_Reports_Clicks," +
                "Client_Reports_Total_Actions,Client_Reports_Social_Impressions,Client_Reports_CPM,Client_Reports_CPC,Client_Reports_CPP,Client_Reports_CTR," +
                "Client_Reports_Spend,Client_Reports_Ad_Activity_Date_End,Client_Reports_Ad_Activity_Date_Start,Stats_Date"
                + " FROM Product_Campaign_Statistics_Results"
                + " WHERE Application_Client_ID="+page_id+" and Stats_Date="+"'"+Stats_date+" 00:00:00'";

        FDAADELevelStatsList =getJdbcTemplate().query(SELECT,new ProductLevelCampaignMapper());


        return FDAADELevelStatsList;
    }
    //ad set placement stats
    @Override
    public List<FDAADELevelStats> listproductadgrouplevelstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException
    {
        long page_id=reportParams.getCustomer_id();
        //converting util.date to sql.date and to PDT zone
        java.sql.Date Stats_date=pdtTimeZone.getTimeZone(reportParams);

        List<FDAADELevelStats> FDAADELevelStatsList;
        String SELECT = "SELECT Application_Client_ID,Application_Ad_Group_ID,Application_Ad_Group_Name,Client_Product_ID,Client_Reports_Impressions,Client_Reports_Clicks," +
                "Client_Reports_Total_Actions,Client_Reports_Social_Impressions,Client_Reports_CPM,Client_Reports_CPC,Client_Reports_CPP,Client_Reports_CTR," +
                "Client_Reports_Spend,Client_Reports_Ad_Activity_Date_End,Client_Reports_Ad_Activity_Date_Start,Stats_Date"
                + " FROM Product_Ad_Statistics_Results"
                + " WHERE Application_Client_ID="+page_id+" and Stats_Date="+"'"+Stats_date+" 00:00:00'";

        FDAADELevelStatsList =getJdbcTemplate().query(SELECT,new ProductLevelAdGroupMapper());


        return FDAADELevelStatsList;
    }

}
