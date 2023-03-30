package android.support.p006v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: android.support.v4.app.b */
public final class C0099b {
    /* renamed from: a */
    public static int m330a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    /* renamed from: a */
    public static String m331a(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
