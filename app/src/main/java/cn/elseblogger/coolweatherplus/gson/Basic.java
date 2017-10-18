package cn.elseblogger.coolweatherplus.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Else on 2017/10/17.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
