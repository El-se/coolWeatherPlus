package cn.elseblogger.coolweatherplus.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Else on 2017/10/16.
 */

public class HttpUtil {
    public static void sendOKhttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient Client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        Client.newCall(request).enqueue(callback);
    }
}
