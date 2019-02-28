package com.peter.appcoupon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cryallen.common.router.RouterPath;
import com.cryallen.common.router.provider.ICouponProvider;
import com.peter.appcoupon.coupon.views.CoupouActivity;

/**
 * Created by geqipeng
 * date : 2019/2/27
 * desc : 优惠券
 */
@Route(path = RouterPath.ROUTER_PATH_TO_COUPON_SERVICE, name = "优惠券页面")
public class CouponService implements ICouponProvider {

    @Override
    public void goToCoupon(Activity activity) {
        Intent loginIntent = new Intent(activity, CoupouActivity.class);
        activity.startActivity(loginIntent);
    }

    @Override
    public void init(Context context) {

    }
}
