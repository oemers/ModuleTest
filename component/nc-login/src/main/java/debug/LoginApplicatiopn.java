package debug;

import com.alibaba.android.arouter.launcher.ARouter;
import com.ryy.ncb_common.BaseApplication;

/**
 * Created by renyangyang on 2018/8/22.
 */
public class LoginApplicatiopn extends BaseApplication{

    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.openDebug();
        ARouter.init(this);
    }
}
