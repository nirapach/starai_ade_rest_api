package com.starai.ade.mapper.gsonparser.resultdata;

/**
 * Created by niranjan on 6/23/15.
 */
import com.google.gson.annotations.SerializedName;

public class AdSetResultData {

    @SerializedName("id")
    public String id;

    @SerializedName("name")
    public String name;

    @SerializedName("campaign_status")
    public String status;

    @SerializedName("daily_budget")
    public int daily_budget;

    @SerializedName("lifetime_budget")
    public int lifetime_budget;

}
