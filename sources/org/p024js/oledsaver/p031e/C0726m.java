package org.p024js.oledsaver.p031e;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: org.js.oledsaver.e.m */
public final class C0726m {

    /* renamed from: a */
    private static boolean f2624a = false;

    /* renamed from: a */
    public static float m3508a(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static int m3509a(Context context) {
        DisplayMetrics c = m3511c(context);
        if (c != null) {
            return c.heightPixels;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m3510b(Context context) {
        DisplayMetrics c = m3511c(context);
        if (c != null) {
            return c.widthPixels;
        }
        return 0;
    }

    /* renamed from: c */
    private static DisplayMetrics m3511c(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics;
    }
}
