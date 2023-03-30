package org.p024js.oledsaver;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.List;
import org.p024js.oledsaver.p031e.C0719h;
import org.p024js.oledsaver.p031e.C0725l;

/* renamed from: org.js.oledsaver.MyApp */
public class MyApp extends Application {

    /* renamed from: a */
    private boolean f2328a = false;

    /* renamed from: a */
    public static void m3161a(Context context, boolean z) {
        List<ActivityManager.AppTask> appTasks;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null && appTasks.size() > 0) {
            appTasks.get(0).setExcludeFromRecents(z);
        }
    }

    /* renamed from: a */
    public boolean mo3304a() {
        return this.f2328a;
    }

    /* renamed from: a */
    public boolean mo3305a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        new Throwable(str);
        return true;
    }

    public void onCreate() {
        super.onCreate();
        C0719h.m3482a((Context) this);
        C0725l.m3504a(this);
    }
}
