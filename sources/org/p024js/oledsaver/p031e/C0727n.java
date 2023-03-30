package org.p024js.oledsaver.p031e;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: org.js.oledsaver.e.n */
public class C0727n {
    /* renamed from: a */
    public static String m3512a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
