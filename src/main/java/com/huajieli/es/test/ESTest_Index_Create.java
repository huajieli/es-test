package com.huajieli.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;

import java.io.IOException;

/**
 * @author huajieli
 * @create 2021-10-17 21:52
 *
 * 索引创建
 */
public class ESTest_Index_Create {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http")));

        //创建索引
        CreateIndexRequest indexRequest = new CreateIndexRequest("user2");
        //发送请求，获取响应
        CreateIndexResponse createIndexResponse = client.indices().create(indexRequest, RequestOptions.DEFAULT);
        boolean acknowledged = createIndexResponse.isAcknowledged();
        System.out.println("操作状态="+acknowledged);

        //关闭连接
        client.close();
    }
}
















