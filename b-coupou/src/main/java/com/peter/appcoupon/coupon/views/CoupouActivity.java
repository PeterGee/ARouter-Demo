package com.peter.appcoupon.coupon.views;

import android.content.Intent;
import android.os.Bundle;
import com.cryallen.common.function.comlib.base.AppActivity;
import com.gee.peter.b_coupou.R;

/**
 * Created by geqipeng
 * date : 2019/2/27
 * desc :  优惠券页面
 */
public class CoupouActivity extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
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
