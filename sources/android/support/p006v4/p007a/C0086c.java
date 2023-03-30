package android.support.p006v4.p007a;

import android.content.Context;
import android.os.Process;
import android.support.p006v4.app.C0099b;

/* renamed from: android.support.v4.a.c */
public final class C0086c {
    /* renamed from: a */
    public static int m284a(Context context, String str) {
        return m285a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m285a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0099b.m331a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0099b.m330a(context, a, str2) != 0 ? -2 : 0;
    }
}
