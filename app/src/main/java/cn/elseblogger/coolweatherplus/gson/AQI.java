package cn.elseblogger.coolweatherplus.gson;

/**
 * Created by Else on 2017/10/17.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
