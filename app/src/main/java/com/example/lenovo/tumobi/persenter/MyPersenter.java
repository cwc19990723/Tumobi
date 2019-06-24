package com.example.lenovo.tumobi.persenter;


import com.example.lenovo.tumobi.base.BasePersenter;
import com.example.lenovo.tumobi.component.CommonSubscriber;
import com.example.lenovo.tumobi.interfaces.news.NewsContract;
import com.example.lenovo.tumobi.model.bean.IndexBean;
import com.example.lenovo.tumobi.model.http.HttpManager;
import com.example.lenovo.tumobi.utils.RxUtils;

public class MyPersenter extends BasePersenter<NewsContract.View> implements NewsContract.Presenter {


    @Override
    public void getIndex() {
        addSubscribe(HttpManager.getMyApi().getIndexData()
        .compose(RxUtils.<IndexBean> rxScheduler())
        .subscribeWith(new CommonSubscriber<IndexBean>(mView){
            @Override
            public void onNext(IndexBean indexBean) {
                mView.getIndexReturn(indexBean);
            }
        }));
    }
}