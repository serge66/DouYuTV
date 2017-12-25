package com.lsj.douyutv.view.other;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.lsj.douyutv.R;
import com.orhanobut.logger.Logger;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppThemeNoTitle);
        getWindow().setFlags(WindowManager.LayoutParams.TYPE_STATUS_BAR,
                WindowManager.LayoutParams.TYPE_STATUS_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Logger.d("hello");
    }
}
