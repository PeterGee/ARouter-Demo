package com.peter.appcoupon;

import android.content.res.Configuration;
import com.cryallen.common.annotation.EFModuleAnnotation;
import com.cryallen.common.framework.module.interfaces.IApplicationDelegate;
import com.cryallen.common.function.tool.log.EFLog;
import java.util.Map;

/**
 * Created by geqipeng
 * date : 2019/2/27
 * desc :
 */

@EFModuleAnnotation(moduleName = "b-coupou", delegateName = "com.peter.appcoupon.CouponApplicationDelegate")
public class CouponApplicationDelegate implements IApplicationDelegate {
    private static final String TAG = "LoginApplicationDelegate";


    @Override
    public void onCreate() {
        EFLog.d(TAG, "*------------------onCreate()---------------->");
    }

    @Override
    public void enterBackground() {
        EFLog.d(TAG, "*------------------enterBackground()---------------->");
    }

    @Override
    public void enterForeground() {
        EFLog.d(TAG, "*------------------enterForeground()---------------->");
    }

    @Override
    public void receiveRemoteNotification(Map<String, String> message) {
        EFLog.d(TAG, "receiveRemoteNotification msg = " + message);
    }

    @Override
    public void onTerminate() {
        EFLog.d(TAG, "*------------------onTerminate()---------------->");
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        EFLog.d(TAG, "*------------------onConfigurationChanged()---------------->");
    }

    @Override
    public void onLowMemory() {
        EFLog.d(TAG, "*------------------onLowMemory()---------------->");
    }

    @Override
    public void onTrimMemory(int var1) {
        EFLog.d(TAG, "*------------------onTrimMemory()---------------->");
    }
}
