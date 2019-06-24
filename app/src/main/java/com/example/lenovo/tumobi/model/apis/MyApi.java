package com.example.lenovo.tumobi.model.apis;

import com.example.lenovo.tumobi.model.bean.IndexBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface MyApi {

    @GET("index/index")
    Flowable<IndexBean> getIndexData();

}
