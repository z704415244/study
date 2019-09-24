package com.zh.study.utils;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

/**
 * @Author yexun
 * @Date 2018/8/6
 */
public class HttpUtils {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    // 请求超时时间
    private static final int socketTimeout = 8000;
    // 传输超时时间
    private static final int connectTimeout = 8000;

    /**
     *
     * @param url
     * @param jsonString
     * @return
     */
    public static String sendHttpRequest(String url, String jsonString, Map<String, String> header) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();//设置请求和传输超时时间
        httpPost.setConfig(requestConfig);

        StringEntity entity = new StringEntity(jsonString, "utf-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        if (header != null) {
            header.forEach((key, value) -> {
                httpPost.setHeader(key, value);
            });
        }
        httpPost.setEntity(entity);
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpPost);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            logger.error("http request fail, url = " + url, e);
        } finally {
            if (response != null) {
                try {
                    response.close();
                    httpClient.close();
                } catch (IOException e) {
                    logger.error("http request fail, url = " + url, e);
                }
            }
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    logger.error("http request fail, url = " + url, e);
                }
            }
        }
        return null;
    }

    /**
     *
     * @param url
     * @return
     */
    public static String sendGetRequest(String url, Map<String, String> header) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();//设置请求和传输超时时间
        httpGet.setConfig(requestConfig);
        httpGet.setHeader("Content-Type", "application/json");
        if (header != null) {
            header.forEach((key, value) -> {
                httpGet.setHeader(key, value);
            });
        }
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            logger.error("http request fail, url = " + url, e);
        } finally {
            if (response != null) {
                try {
                    response.close();
                    httpClient.close();
                } catch (IOException e) {
                    logger.error("http request fail, url = " + url, e);
                }
            }
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    logger.error("http request fail, url = " + url, e);
                }
            }
        }
        return null;
    }
}