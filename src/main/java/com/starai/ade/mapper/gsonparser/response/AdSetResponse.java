package com.starai.ade.mapper.gsonparser.response;

import com.starai.ade.mapper.gsonparser.paging.JSONResponsePaging;
import com.starai.ade.mapper.gsonparser.resultdata.AdSetResultData;

import java.util.List;

/**
 * Created by niranjan on 8/17/15.
 */
public class AdSetResponse {

    public List<AdSetResultData> data;

    public JSONResponsePaging paging;
}
