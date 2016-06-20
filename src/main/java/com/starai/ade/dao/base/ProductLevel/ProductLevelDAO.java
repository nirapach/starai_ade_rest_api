package com.starai.ade.dao.base.ProductLevel;

import com.starai.ade.model.Endpoints.ReportParams;
import com.starai.ade.model.FDAADELevelStats;

import java.text.ParseException;
import java.util.List;

/**
 * Created by niranjan on 8/11/15.
 */
public interface ProductLevelDAO {


    //ad account placement stats
    List<FDAADELevelStats> listproductaccountstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException;

    //ad set placement stats
    List<FDAADELevelStats> listproductadsetlevelstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException;

    //ad account placement stats
    List<FDAADELevelStats> listproductcampaignlevelstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException;

    //ad set placement stats
    List<FDAADELevelStats> listproductadgrouplevelstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException;


}
