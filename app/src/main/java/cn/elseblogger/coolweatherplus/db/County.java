package cn.elseblogger.coolweatherplus.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Else on 2017/10/16.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weartherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeartherId() {
        return weartherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeartherId(String weartherId) {
        this.weartherId = weartherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
