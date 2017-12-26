package com.lsj.douyutv.view.other.adapter;
/*

 * Description: 

 * Author: lishengjiejob@163.com

 * Time:  2017/12/26 15:15

 */

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lsj.douyutv.R;
import com.lsj.douyutv.utils.Constants;
import com.lsj.douyutv.utils.SpUtils;
import com.lsj.douyutv.view.MainActivity;
import com.lsj.douyutv.view.other.activity.GuideActivity;
import com.zhy.autolayout.utils.AutoUtils;

public class GuideAdapter extends PagerAdapter {

    private final Context mContext;
    private final int[] mGuides;

    public GuideAdapter(int[] guides, Context context) {
        mGuides = guides;
        mContext = context;
    }

    @Override
    public int getCount() {
        if (mGuides == null)
            return 0;
        return mGuides.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_guide,null);
        ImageView iv = view.findViewById(R.id.iv);
        TextView tv = view.findViewById(R.id.tv);

        if(position==mGuides.length-1){
            tv.setVisibility(View.VISIBLE);
        }else{
            tv.setVisibility(View.GONE);
        }

        iv.setBackgroundResource(mGuides[position]);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpUtils.put(Constants.SP_IS_FIRST,false);
                mContext.startActivity(new Intent(mContext, MainActivity.class));
                ((GuideActivity) mContext).finish();
            }
        });

        AutoUtils.autoSize(view);
        container.addView(view, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
