package com.starai.ade.mapper.gsonparser.paging;

/**
 * Created by niranjan on 6/23/15.
 */

import com.google.gson.annotations.SerializedName;

public class JSONResponsePaging {

    public Cursors cursors;

    public class Cursors{

        @SerializedName("before")
        public String before;

        @SerializedName("after")
        public String after;
    }

}
