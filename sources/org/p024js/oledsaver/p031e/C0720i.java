package org.p024js.oledsaver.p031e;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import org.p024js.oledsaver.GlobalActionBarService;
import org.p024js.oledsaver.MainService;
import org.p024js.oledsaver.R;

/* renamed from: org.js.oledsaver.e.i */
public class C0720i {
    /* renamed from: a */
    public static void m3489a(Context context, boolean z) {
        if (!z) {
            C0725l.m3505a(context, context.getResources().getString(R.string.stop_service));
            context.startService(new Intent(context, GlobalActionBarService.class).setAction("serviceCommandStopU"));
        } else if (C0716e.m3470a(context) && C0716e.m3471b(context)) {
            C0725l.m3505a(context, context.getResources().getString(R.string.start_service));
            context.startService(new Intent(context, GlobalActionBarService.class).setAction("serviceCommandStartU"));
        }
    }

    /* renamed from: a */
    public static boolean m3490a(Context context) {
        int i;
        String string;
        String str = context.getPackageName() + "/" + GlobalActionBarService.class.getCanonicalName();
        try {
            i = Settings.Secure.getInt(context.getApplicationContext().getContentResolver(), "accessibility_enabled");
        } catch (Settings.SettingNotFoundException e) {
            i = 0;
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        if (i != 1 || (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services")) == null) {
            return false;
        }
        simpleStringSplitter.setString(string);
        while (simpleStringSplitter.hasNext()) {
            if (simpleStringSplitter.next().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3491b(Context context) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (MainService.class.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
