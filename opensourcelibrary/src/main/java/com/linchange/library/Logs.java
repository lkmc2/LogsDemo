package com.linchange.library;

import android.app.Activity;
import android.util.Log;
import java.util.Arrays;

/**
 * Created by lkmc2 on 2017/12/31.
 * 打印日志工具类
 *
 * PS：
 * 1.如果是想全局打印同一个Log名，直接修改下面的TAG变量的名称，然后使用类名 + 点 + 方法名即可，
 * 如：Log.v("你想输入的信息");
 *
 * 2.如果想每一个Activity都使用不同的Log名，直接在t(String)方法中传入自定义的TAG名，然后再调用方法，
 * 如：Log.t("自定义的TAG名").v("你想输入的信息");
 *
 * 3.如果想每一个Activity都使用不同的Log名，又不想另行定义TAG名，直接在t(Activity)方法中传入Activity的Context，
 * 然后再调用方法，如：Log.t(this).v("你想输入的信息");，这时将类名作为TAG名（不含包名）;
 *
 * 4.使用t(String)或者t(Activity)方法后，全局TAG的名字将永久改变，不建议将Log.v(String)方法与
 * Log.t(String).v(String)混搭使用。要么只使用Log.v(String)，或者只使用Log.t(String).v(String)的方式。
 *
 * 4.如果不喜欢编译器出现黄线警告，可在类上添加@SuppressWarnings("AccessStaticViaInstance")注解。
 */

public final class Logs {

    private static String TAG = "LogInfo"; //全局TAG名
    private static final boolean DEBUG = true; //打印日志的开关，若为false不打印日志

    private static class Holder { //静态内部类
        private static final Logs INSTANCE = new Logs(); //静态实例对象
    }

    /**
     * 设置TAG名
     * @param tag TAG名
     * @return Logs类实例对象
     */
    public static Logs t(final String tag) {
        TAG = tag;
        return Holder.INSTANCE;
    }

    /**
     * 设置TAG名（使用Activity的类名设置）
     * @param activity Activity对象
     * @return Logs类实例对象
     */
    public static Logs t(final Activity activity) {
        if (activity != null) {
            String activityName =  activity.getClass().getName(); //获取类名
            TAG = activityName.substring(activityName.lastIndexOf(".") + 1); //设置TAG名（去掉包名）
        } else {
            throw new ClassCastException("You should use Activity context");
        }
        return Holder.INSTANCE;
    }

    /**
     * 判断是否开启日志打印
     */
    private static void ifDebug() {
        if (!DEBUG) return;
    }
    
    public static void v(final String msg) {
        ifDebug();
        Log.v(TAG, msg);
    }

    public static void e(final String msg) {
        ifDebug();
        Log.e(TAG, msg);
    }

    public static void w(final String msg) {
        ifDebug();
        Log.w(TAG, msg);
    }

    public static void i(final String msg) {
        ifDebug();
        Log.i(TAG, msg);
    }

    public static void d(final String msg) {
        ifDebug();
        Log.d(TAG, msg);
    }

    //以下方法是上面静态方法的重载，防止Android Studio中实例无法调用静态方法

    public void v(final String... msg) {
        ifDebug();
        Log.v(TAG, Arrays.toString(msg));
    }

    public void e(final String... msg) {
        ifDebug();
        Log.e(TAG, Arrays.toString(msg));
    }

    public void w(final String... msg) {
        ifDebug();
        Log.w(TAG, Arrays.toString(msg));
    }

    public void i(final String... msg) {
        ifDebug();
        Log.i(TAG, Arrays.toString(msg));
    }

    public void d(final String... msg) {
        ifDebug();
        Log.d(TAG, Arrays.toString(msg));
    }

}
