package com.ryy.nc_login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ryy.ncb_common.ARouterPath;
import com.ryy.ncs_user.SPKey;
import com.ryy.ncs_user.SharePreferenceManager;

/**
 * Created by renyangyang on 2018/8/22.
 */
@Route(path = ARouterPath.PATH_LOGIN_ACTIVITY)
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et_name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_name = (EditText) findViewById(R.id.et_name);
        findViewById(R.id.btn_go).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_go){
            String name = et_name.getText().toString();
            if (TextUtils.isEmpty(name)){
                return;
            }
            //arouter跳转
            SharePreferenceManager.getInstance().putString(SPKey.USER_NAME,name);
            ARouter.getInstance().build(ARouterPath.PATH_MINE_ACTIVITY).navigation();
        }
    }
}
