package com.starai.ade.mapper.gsonparser.resultdata;

/**
 * Created by niranjan on 6/23/15.
 */
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class AdGroupResultData {

    @SerializedName("id")
    public String id;

    @SerializedName("name")
    public String name;

    @SerializedName("adgroup_status")
    public String status;

    @SerializedName("bid_amount")
    public int bid_amount;

    @SerializedName("campaign_group_id")
    public String campaign_id;

    @SerializedName("campaign_id")
    public String adset_id;

    @SerializedName("created_time")
    public String created_at;

    @SerializedName("updated_time")
    public String updated_at;

}
