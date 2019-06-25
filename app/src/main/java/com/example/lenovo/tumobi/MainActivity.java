package com.example.lenovo.tumobi;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.tumobi.base.BaseActivity;
import com.example.lenovo.tumobi.interfaces.IPersenter;
import com.example.lenovo.tumobi.interfaces.news.NewsContract;
import com.example.lenovo.tumobi.model.bean.IndexBean;
import com.example.lenovo.tumobi.persenter.MyPersenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements NewsContract.View {

    @BindView(R.id.btn)
    Button mBtn;

    @Override
    public void getIndexReturn(IndexBean indexBean) {
        if(indexBean != null){
            Log.i("YZY", "getIndexReturn: " + indexBean.getData().toString());

            //  新的要上传的
        }
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MyPersenter) persenter).getIndex();
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPersenter createPersenter() {
        return new MyPersenter();
    }
}
