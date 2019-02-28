package com.peter.appcoupon.coupon.views;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.cryallen.common.function.comlib.base.AppActivity;
import com.cryallen.common.router.RouterPath;
import com.gee.peter.b_coupou.R;

import org.xutils.common.util.LogUtil;

import java.io.Serializable;

/**
 * Created by geqipeng
 * date : 2019/2/27
 * desc :  优惠券页面
 */
@Route(path = RouterPath.ROUTER_PATH_TO_COUPON_SERVICE, name = "优惠券页面")
public class CoupouActivity extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
        handleIntentExtra();
    }

    private void handleIntentExtra() {
       int age=getIntent().getIntExtra("age",0);
       String name=getIntent().getStringExtra("name");
        Log.d("peter","age-> "+age+ " name-> "+name);
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
