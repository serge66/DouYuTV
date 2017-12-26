package com.lsj.douyutv.view.other.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.view.WindowManager;

import com.lsj.douyutv.R;
import com.lsj.douyutv.base.BaseActivity;
import com.lsj.douyutv.view.other.adapter.GuideAdapter;

import butterknife.BindView;

public class GuideActivity extends BaseActivity {

    @BindView(R.id.vp)
    ViewPager mVp;

    int[] guides = new int[]{R.mipmap.guide_bg1, R.mipmap.guide_bg2,
            R.mipmap.guide_bg3, R.mipmap.guide_bg4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppThemeNoTitle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        mVp.setAdapter(new GuideAdapter(guides, this));

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_guide;
    }
}
