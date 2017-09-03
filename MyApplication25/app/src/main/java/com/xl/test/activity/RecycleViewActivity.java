package com.xl.test.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.xl.test.Base.BaseActivity;
import com.xl.test.R;

import butterknife.BindView;
import hugo.weaving.DebugLog;

public class RecycleViewActivity extends BaseActivity {
    @BindView(R.id.tabs)
    SmartTabLayout tabs;
    @BindView(R.id.appbar)
    AppBarLayout appbar;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.main_content)
    CoordinatorLayout mainContent;


    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.coordinatorlayout);
    }

    @Override
    protected void initVariables() {
        initData();
    }

    @Override
    protected void loadData() {

        FragmentPagerItems pages = FragmentPagerItems.with(this)
                .add(R.string.recent, TopicFragment.class)
                .add(R.string.vote, TopicFragment.class)
                .add(R.string.jobs, TopicFragment.class)
                .create();
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(getSupportFragmentManager()
                , pages);
        viewpager.setOffscreenPageLimit(pages.size());
        viewpager.setAdapter(adapter);
        tabs.setViewPager(viewpager);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @DebugLog
    private void initData() {


    }


}
