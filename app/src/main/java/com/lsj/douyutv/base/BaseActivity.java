package com.lsj.douyutv.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lsj.douyutv.MyApplication;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/*

 * Description: 

 * Author: lishengjiejob@163.com

 * Time:  2017/12/26 14:00

 */

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext;
    protected Unbinder unbinder;


    protected abstract int getLayoutId();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = MyApplication.getmContext();
        if (getLayoutId() != 0) {
            setContentView(getLayoutId());
            unbinder = ButterKnife.bind(this);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }
}
