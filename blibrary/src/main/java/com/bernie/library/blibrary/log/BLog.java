package com.bernie.library.blibrary.log;

import android.util.Log;

import androidx.annotation.NonNull;

public class BLog {

    public static void v(Object... contents) {
        log(BLogType.V, contents);
    }

    public static void vt(String tag, Object... contents) {
        log(BLogType.V, tag, contents);
    }

    public static void d(Object... contents) {
        log(BLogType.D, contents);
    }

    public static void dt(String tag, Object... contents) {
        log(BLogType.D, tag, contents);
    }

    public static void i(Object... contents) {
        log(BLogType.I, contents);
    }

    public static void it(String tag, Object... contents) {
        log(BLogType.I, tag, contents);
    }

    public static void w(Object... contents) {
        log(BLogType.W, contents);
    }

    public static void wt(String tag, Object... contents) {
        log(BLogType.W, tag, contents);
    }

    public static void e(Object... contents) {
        log(BLogType.E, contents);
    }

    public static void et(String tag, Object... contents) {
        log(BLogType.E, tag, contents);
    }

    public static void a(Object... contents) {
        log(BLogType.A, contents);
    }

    public static void at(String tag, Object... contents) {
        log(BLogType.A, tag, contents);
    }

    public static void log(@BLogType.TYPE int type, Object... contents) {
        log(type, BLogManager.getInstance().getConfig().getGlobalTag(), contents);
    }

    public static void log(@BLogType.TYPE int type, @NonNull String tag, Object... contents) {
        log(BLogManager.getInstance().getConfig(), type, tag, contents);
    }

    public static void log(@NonNull BLogConfig config, @BLogType.TYPE int type, @NonNull String tag, Object... contents) {
        if (!config.enable()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String body = parseBody(contents, config);
        sb.append(body);
        Log.println(type, tag, sb.toString());
    }

    private static String parseBody(@NonNull Object[] contents, @NonNull BLogConfig config) {
        StringBuilder sb = new StringBuilder();
        for (Object o : contents) {
            sb.append(o.toString()).append(";");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
