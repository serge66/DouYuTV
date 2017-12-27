package com.lsj.douyutv.view;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.lsj.douyutv.R;
import com.lsj.douyutv.base.BaseActivity;
import com.lsj.douyutv.ui.MyAutoLinearLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.frame)
    FrameLayout frame;
    @BindView(R.id.ll_home)
    MyAutoLinearLayout llHome;
    @BindView(R.id.ll_ive)
    MyAutoLinearLayout llIve;
    @BindView(R.id.ll_video)
    MyAutoLinearLayout llVideo;
    @BindView(R.id.ll_attention)
    MyAutoLinearLayout llAttention;
    @BindView(R.id.ll_my)
    MyAutoLinearLayout llMy;
    @BindView(R.id.ll)
    MyAutoLinearLayout ll;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        llHome.setSelected(true);
    }

    @OnClick({R.id.ll_home, R.id.ll_ive, R.id.ll_video, R.id.ll_attention, R.id.ll_my})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_home:
                break;
            case R.id.ll_ive:
                break;
            case R.id.ll_video:
                break;
            case R.id.ll_attention:
                break;
            case R.id.ll_my:
                break;
        }
    }
}
