package com.huajieli.es.test;

import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

/**
 * @author huajieli
 * @create 2021-10-17 21:40
 *
 * 客户端建立测试
 */
public class ESTest_Client {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http")));

        //关闭连接
        client.close();
    }
}



















