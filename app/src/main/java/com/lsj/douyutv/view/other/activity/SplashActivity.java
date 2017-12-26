package com.lsj.douyutv.view.other.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.lsj.douyutv.R;
import com.lsj.douyutv.base.BaseActivity;
import com.lsj.douyutv.utils.Constants;
import com.lsj.douyutv.utils.SpUtils;
import com.lsj.douyutv.view.MainActivity;


public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppThemeNoTitle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isFirst = (boolean) SpUtils.get(Constants.SP_IS_FIRST, true);
                if (isFirst) {
                    startActivity(new Intent(mContext, GuideActivity.class));
                } else {
                    startActivity(new Intent(mContext, MainActivity.class));
                }
                SplashActivity.this.finish();

            }
        }, 3000);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }
}
