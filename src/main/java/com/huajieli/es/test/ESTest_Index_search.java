package com.huajieli.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;

import java.io.IOException;

/**
 * @author huajieli
 * @create 2021-10-17 21:59
 *
 * 索引查询
 */
public class ESTest_Index_search {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http")));

        //查询索引-请求对象
        GetIndexRequest getIndexRequest = new GetIndexRequest("user");
        //发送请求获取响应
        GetIndexResponse getIndexResponse = client.indices().get(getIndexRequest, RequestOptions.DEFAULT);

        System.out.println("aliases:"+ getIndexResponse.getAliases());
        System.out.println("aliases:"+ getIndexResponse.getMappings());
        System.out.println("aliases:"+ getIndexResponse.getSettings());
        //关闭连接
        client.close();
    }
}
