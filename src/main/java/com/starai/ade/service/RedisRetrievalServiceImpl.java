package com.starai.ade.service;

import com.starai.ade.dao.base.ProductLevel.ProductLevelDAO;
import com.starai.ade.model.Endpoints.ReportParams;
import com.starai.ade.model.FDAADELevelStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.List;

/**
 * Created by niranjan on 8/12/15.
 */
@Service("productservice")
@Transactional
public class RedisRetrievalServiceImpl implements RedisRetrievalService {

    @Autowired
    ProductLevelDAO productLevelDAO;

    @Override
    public List<FDAADELevelStats> listproductaccountstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException {
        return productLevelDAO.listproductaccountstats(FDAADELevelStats, reportParams);
    }

    @Override
    public List<FDAADELevelStats> listproductadsetlevelstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException {
        return productLevelDAO.listproductadsetlevelstats(FDAADELevelStats,reportParams);
    }

    @Override
    public List<FDAADELevelStats> listproductcampaignlevelstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException {
        return productLevelDAO.listproductcampaignlevelstats(FDAADELevelStats, reportParams);
    }

    @Override
    public List<FDAADELevelStats> listproductadgrouplevelstats(FDAADELevelStats FDAADELevelStats, ReportParams reportParams) throws ParseException {
        return productLevelDAO.listproductadgrouplevelstats(FDAADELevelStats, reportParams);
    }
}
