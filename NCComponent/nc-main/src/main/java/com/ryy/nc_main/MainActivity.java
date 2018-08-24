package com.ryy.nc_main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.ryy.ncb_common.ARouterPath;

/**
 * Created by renyangyang on 2018/8/22.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_log).setOnClickListener(this);
        findViewById(R.id.btn_info).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_log){
            //arouter跳转
            ARouter.getInstance().build(ARouterPath.PATH_LOGIN_ACTIVITY).navigation();
        }else if(view.getId() == R.id.btn_info){
            //arouter跳转
            ARouter.getInstance().build(ARouterPath.PATH_MINE_ACTIVITY).navigation();
        }
    }
}
