package com.xl.test.activity;

import android.os.Bundle;

import com.xl.test.Base.BaseActivity;
import com.xl.test.R;

public class MainActivity extends BaseActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
