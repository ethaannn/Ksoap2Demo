package com.hayquan.ksoap.config;

/**
 * Created by DongBang on 2016/5/30.
 */
public class AppConfig {
    //http://simpligility.github.io/ksoap2-android/getting-started.html  jar包下载地址
    public static final int TIMEOUT = 5000;
    public static final String SERVICE_URL = "http://120.27.24.137:8687/farm/service/basic?wsdl";

    public static final String SERVICE_NAME_SPACE = "http://definition.webservice.farm.njdobest.com/";
    public static final String MN_GET_AREA_CHILDREN = "GetAreaChildren";//获取区域子监控点
}
