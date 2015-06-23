package pyw.com.weather.util;

/**
 * Created by eleven on 2015/6/10.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
