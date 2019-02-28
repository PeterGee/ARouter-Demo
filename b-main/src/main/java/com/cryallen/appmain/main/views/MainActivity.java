package com.cryallen.appmain.main.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.cryallen.appmain.R;
import com.cryallen.common.function.comlib.base.AppActivity;
import com.cryallen.common.router.RouterPath;
import com.cryallen.common.router.provider.ICouponProvider;
import com.cryallen.common.router.provider.ILoginProvider;
import com.cryallen.common.router.provider.ISettingProvider;

public class MainActivity extends AppActivity {

    private Button mLogin;
    private Button mSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogin = (Button) findViewById(R.id.login_btn);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ILoginProvider loginService = (ILoginProvider) ARouter.getInstance().build(RouterPath.ROUTER_PATH_TO_LOGIN_SERVICE).navigation();
                if (loginService != null) {
                    loginService.goToLogin(MainActivity.this);
                }
            }
        });

        mSetting = (Button) findViewById(R.id.setting_btn);
        mSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ISettingProvider settingService = (ISettingProvider) ARouter.getInstance().build(RouterPath.ROUTER_PATH_TO_SETTING_SERVICE).navigation();
                if (settingService != null) {
                    settingService.goToSetting(MainActivity.this);
                }
            }
        });

        Button mCoupon = findViewById(R.id.setting_coupon);
        mCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 使用ARouter传递数据
                Bundle bundle=new Bundle();
                bundle.putString("name","优惠券");
                bundle.putInt("age",10);
                bundle.putBoolean("boolean",true);
                 ARouter.getInstance().build(RouterPath.ROUTER_PATH_TO_COUPON_SERVICE)
                        .withInt("age",10)
                         .withString("name","peter")
                        .withBundle("bundle",bundle)
                        .navigation();

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
