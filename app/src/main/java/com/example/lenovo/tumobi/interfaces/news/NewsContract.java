package com.example.lenovo.tumobi.interfaces.news;

import com.example.lenovo.tumobi.interfaces.IBaseView;
import com.example.lenovo.tumobi.interfaces.IPersenter;
import com.example.lenovo.tumobi.model.bean.IndexBean;

import java.util.List;

public interface NewsContract {

    interface View extends IBaseView {
        void getIndexReturn(IndexBean indexBean);
    }

    interface Presenter extends IPersenter<View> {
        void getIndex();
    }
}