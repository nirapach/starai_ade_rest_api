package com.starai.ade.mapper.gsonparser.response;

import com.starai.ade.mapper.gsonparser.paging.JSONResponsePaging;
import com.starai.ade.mapper.gsonparser.resultdata.AdCampaignResultData;

import java.util.List;

/**
 * Created by niranjan on 8/17/15.
 */
public class AdCampaignResponse {

    public List<AdCampaignResultData> data;

    public JSONResponsePaging paging;
}
