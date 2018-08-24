package com.ryy.nc_mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ryy.ncb_common.ARouterPath;
import com.ryy.ncs_user.SPKey;
import com.ryy.ncs_user.SharePreferenceManager;

/**
 * Created by renyangyang on 2018/8/22.
 */
@Route(path = ARouterPath.PATH_MINE_ACTIVITY)
public class MineActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);

        TextView tvInfo = (TextView) findViewById(R.id.tv_info);
        tvInfo.setText("登录名："+SharePreferenceManager.getInstance().getString(SPKey.USER_NAME));

    }
}
