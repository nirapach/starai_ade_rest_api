package com.starai.ade.mapper.gsonparser.resultdata;

/**
 * Created by niranjan on 6/23/15.
 */
import com.google.gson.annotations.SerializedName;

public class AdCampaignResultData {

    @SerializedName("id")
    public String id;

    @SerializedName("name")
    public String name;

    @SerializedName("campaign_group_status")
    public String status;

    @SerializedName("objective")
    public String objective;


}
