package com.yoozoo.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 *
 * Created by guoxx on 2018/8/31.
 */
public class MyHttpClient {

    @Test
    public void test1(){
        String result = "";
        HttpGet get = new HttpGet("http://www.baidu.com");
        HttpClient client = new DefaultHttpClient();
        try {

           HttpResponse res =  client.execute(get);
            result = EntityUtils.toString(res.getEntity(),"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
