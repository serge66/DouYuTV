package com.lsj.douyutv.view;

import android.os.Bundle;

import com.lsj.douyutv.R;
import com.lsj.douyutv.base.BaseActivity;
import com.lsj.douyutv.ui.NavigateTabBar;
import com.lsj.douyutv.view.attention.FollowFragment;
import com.lsj.douyutv.view.home.HomeFragment;
import com.lsj.douyutv.view.live.LiveFragment;
import com.lsj.douyutv.view.my.UserFragment;
import com.lsj.douyutv.view.video.VideoFragment;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    private static final String TAG_PAGE_HOME = "首页";
    private static final String TAG_PAGE_LIVE = "直播";
    private static final String TAG_PAGE_VIDEO = "视频";
    private static final String TAG_PAGE_FOLLOW = "关注";
    private static final String TAG_PAGE_USER = "我的";

    @BindView(R.id.mainTabBar)
    NavigateTabBar mNavigateTabBar;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView(savedInstanceState);
    }

    private void initView(Bundle savedInstanceState) {
        mNavigateTabBar.onRestoreInstanceState(savedInstanceState);
        mNavigateTabBar.addTab(HomeFragment.class, new NavigateTabBar.TabParam(R.mipmap.home_pressed, R.mipmap
                .home_selected, TAG_PAGE_HOME));
        mNavigateTabBar.addTab(LiveFragment.class, new NavigateTabBar.TabParam(R.mipmap.live_pressed, R.mipmap
                .live_selected, TAG_PAGE_LIVE));
        mNavigateTabBar.addTab(VideoFragment.class, new NavigateTabBar.TabParam(R.mipmap.video_pressed, R
                .mipmap.video_selected, TAG_PAGE_VIDEO));
        mNavigateTabBar.addTab(FollowFragment.class, new NavigateTabBar.TabParam(R.mipmap.follow_pressed,
                R.mipmap.follow_selected, TAG_PAGE_FOLLOW));
        mNavigateTabBar.addTab(UserFragment.class, new NavigateTabBar.TabParam(R.mipmap.user_pressed, R.mipmap
                .user_selected, TAG_PAGE_USER));
        mNavigateTabBar.setTabSelectListener(new NavigateTabBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(NavigateTabBar.ViewHolder holder) {
                //                Toast.makeText(MainActivity.this, "信息为:"+holder.tag, Toast.LENGTH_SHORT).show();
                switch (holder.tag.toString()) {
                    //                    首页
                    case TAG_PAGE_HOME:
                        mNavigateTabBar.showFragment(holder);
                        break;
                    //                    直播
                    case TAG_PAGE_LIVE:
                        mNavigateTabBar.showFragment(holder);
                        break;
                    //                    视频
                    case TAG_PAGE_VIDEO:
                        mNavigateTabBar.showFragment(holder);
                        break;
                    //                    关注
                    case TAG_PAGE_FOLLOW:
                        mNavigateTabBar.showFragment(holder);
                        break;
                    //                    我的
                    case TAG_PAGE_USER:
                        if (mNavigateTabBar != null)
                            mNavigateTabBar.showFragment(holder);
                        break;
                }
            }
        });
    }


    /**
     * 保存数据状态
     *
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mNavigateTabBar.onSaveInstanceState(outState);
    }


}
