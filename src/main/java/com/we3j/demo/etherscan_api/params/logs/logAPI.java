package com.we3j.demo.etherscan_api.params.logs;

import com.we3j.demo.etherscan_api.params.BaseAPI;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * * Created by jambestwick@126.com
 * * on 2021/12/7
 * {@link [log-api] https://docs.etherscan.io/api-endpoints/logs}
 * *
 */
public interface logAPI extends BaseAPI {


    @GET("api")
    String getSampleLog(@Query("module") String api, @Query(value = "action") String action, @Query("fromBlock") long fromBlock, @Query("toBlock") long toBlock, @Query("topic0") String topic, @Query("address") String address, @Query("apikey") String apiKey);

}
