package debug;

import android.app.Application;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import org.xutils.x;


/**
 * Created by geqipeng
 * date : 2019/2/27
 * desc :
 */
public class CoupouApplication extends Application {
    public static CoupouApplication couponApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        couponApplication = this;
        init();
    }

    public void init(){
        Logger.addLogAdapter(new AndroidLogAdapter() {
            @Override
            public boolean isLoggable(int priority, String tag) {
                return true;
            }
        });
        x.Ext.init(couponApplication);
        // 设置是否输出debug
        x.Ext.setDebug(false);
    }
}
