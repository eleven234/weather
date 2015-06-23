package pyw.com.weather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by eleven on 2015/6/9.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    public static final String CREATE_PROVINCE="create table Province("+"id integer primary key autoincrement, "
                                                                                +"province_name text, "
                                                                                +"province_code text)";
    public static final String CREATE_CITY="create table City("
            +"id integer primary key autoincrement,"
            +"city_name text, "
            +"city_code text, "
            +"province_id integer)";
    public static final String CREATE_COUNTY="create table County("
            +"id integer primary key autoincrement, "
            +"county_name text, "
            +"county_code text, "
            +"city_id integer)";
    public CoolWeatherOpenHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

    }
    /*static String name="cool_weather.db";
    static int Version=1;
    public CoolWeatherOpenHelper(Context context){
        super(context,name,null,Version);
    }
    public  void onCreate(SQLiteDatabase db){
        //创建用户表
        String sql="create table Province(id integer primary key autoincrement,province_name varchar(20),province_code varchar(20))";
        db.execSQL(sql);
        //创建收入表
        String sqlIncome="create table if not exists City(_id integer primary key autoincrement,city_name varchar(20),province_id integer)";
        db.execSQL(sqlIncome);
        String sqlOutcome="create table if not exists County(_id integer primary key autoincrement,county_name varchar(20),county_code varchar(20),city_id integer)";
        db.execSQL(sqlOutcome);
    }
    public  void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS Province");
        db.execSQL("DROP TABLE IF EXISTS City");
        db.execSQL("DROP TABLE IF EXISTS County");
        onCreate(db);
    }*/
}


