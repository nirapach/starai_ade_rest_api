package com.starai.ade.mapper.gsonparser.response;

import com.starai.ade.mapper.gsonparser.paging.JSONResponsePaging;
import com.starai.ade.mapper.gsonparser.resultdata.AdGroupResultData;

import java.util.List;

/**
 * Created by niranjan on 8/17/15.
 */
public class AdGroupResponse {

    public List<AdGroupResultData> data;

    public JSONResponsePaging paging;
}
