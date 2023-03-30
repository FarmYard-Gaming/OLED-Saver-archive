package org.p024js.oledsaver.p031e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import org.p024js.oledsaver.R;

/* renamed from: org.js.oledsaver.e.e */
public class C0716e {
    /* renamed from: a */
    public static boolean m3470a(Context context) {
        if (Build.VERSION.SDK_INT < 23 || Settings.System.canWrite(context)) {
            return true;
        }
        C0715d.m3469a(context);
        C0725l.m3507b(context, context.getResources().getString(R.string.check_settings_permission));
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS", Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        context.startActivity(intent);
        return false;
    }

    /* renamed from: b */
    public static boolean m3471b(Context context) {
        if (C0720i.m3490a(context)) {
            return true;
        }
        C0725l.m3507b(context, context.getResources().getString(R.string.check_accessibility_permission));
        m3472c(context);
        return false;
    }

    /* renamed from: c */
    public static void m3472c(Context context) {
        C0715d.m3469a(context);
        Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
