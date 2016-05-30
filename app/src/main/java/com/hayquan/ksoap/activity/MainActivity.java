package com.hayquan.ksoap.activity;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.hayquan.ksoap.R;
import com.hayquan.ksoap.config.AppConfig;
import com.hayquan.ksoap.soap.SoapClient;
import com.hayquan.ksoap.soap.SoapParams;
import com.hayquan.ksoap.soap.SoapParseUtils;
import com.hayquan.ksoap.soap.SoapUtil;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.w3c.dom.Text;

import java.util.LinkedList;

import entity.MonitorBean;

public class MainActivity extends AppCompatActivity
{

    private Button btnSearch;
    private TextView tvResult;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        tvResult= (TextView) findViewById(R.id.tv_result);

    }

    public void onBtnClick(View view)
    {
    getSupSpinerData();
    }

    /**
     * 获取子列表的数据
     */
    private void  getSupSpinerData()
    {
        SoapUtil soapUtil=SoapUtil.getInstance(context);
        soapUtil.setTimeout(AppConfig.TIMEOUT);
        SoapParams params=new SoapParams();
        params.put("areaId",3);//区域ID
        params.put("userId",3);//用户id
        soapUtil.call(AppConfig.SERVICE_URL, AppConfig.SERVICE_NAME_SPACE, AppConfig.MN_GET_AREA_CHILDREN, params, new SoapClient.ISoapUtilCallback() {
            @Override
            public void onSuccess(final SoapSerializationEnvelope envelope) throws Exception
            {
                ((Activity)context).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        SoapObject bodyIn= (SoapObject) envelope.bodyIn;
                        final LinkedList<MonitorBean> monitorBeens= SoapParseUtils.getMonitorBeans(bodyIn.toString());
                        if (monitorBeens==null||monitorBeens.size()==0){
                          Toast.makeText(context,getResources().getString(R.string.error_nothing_sub_menu),Toast.LENGTH_SHORT).show();
                            return;
                        }
                        StringBuffer buffer =new StringBuffer();
                        for (int i = 0; i < monitorBeens.size(); i++) {
                            buffer.append(monitorBeens.get(i).getAreaName()+"  \n     ");
                        }
                        tvResult.setText(buffer);
                    }
                });
            }
            @Override
            public void onFailure(Exception e)
            {
                Toast.makeText(context,"访问失败",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
