package android.support.p006v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.p006v4.p007a.C0068a;

/* renamed from: android.support.v4.app.a */
public class C0091a extends C0068a {

    /* renamed from: a */
    private static C0092a f219a;

    /* renamed from: android.support.v4.app.a$a */
    public interface C0092a {
        /* renamed from: a */
        boolean mo294a(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: a */
    public static C0092a m307a() {
        return f219a;
    }

    /* renamed from: a */
    public static void m308a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }
}
