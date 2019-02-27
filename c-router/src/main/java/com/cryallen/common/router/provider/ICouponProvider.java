package com.cryallen.common.router.provider;

import android.app.Activity;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 跳转至优惠券
 */

public interface ICouponProvider extends IProvider {

    void goToCoupon(Activity activity);
}
