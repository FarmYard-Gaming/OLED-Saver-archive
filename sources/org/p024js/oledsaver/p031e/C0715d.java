package org.p024js.oledsaver.p031e;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: org.js.oledsaver.e.d */
public class C0715d {
    /* renamed from: a */
    public static void m3469a(Context context) {
        Object systemService = context.getSystemService("statusbar");
        if (systemService != null) {
            try {
                Class<?> cls = Class.forName("android.app.StatusBarManager");
                Method method = Build.VERSION.SDK_INT <= 16 ? cls.getMethod("collapse", new Class[0]) : cls.getMethod("collapsePanels", new Class[0]);
                method.setAccessible(true);
                method.invoke(systemService, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
