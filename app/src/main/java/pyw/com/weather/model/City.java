package pyw.com.weather.model;

/**
 * Created by eleven on 2015/6/9.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;
    public  int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public  String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public String getCityCode(){
        return cityCode;
    }
    public void setCityCode(String cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
