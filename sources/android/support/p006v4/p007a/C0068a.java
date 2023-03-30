package android.support.p006v4.p007a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

/* renamed from: android.support.v4.a.a */
public class C0068a {

    /* renamed from: a */
    private static final Object f175a = new Object();

    /* renamed from: b */
    private static TypedValue f176b;

    /* renamed from: a */
    public static Drawable m208a(Context context, int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f175a) {
            if (f176b == null) {
                f176b = new TypedValue();
            }
            context.getResources().getValue(i, f176b, true);
            i2 = f176b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: a */
    public static boolean m209a(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: b */
    public static ColorStateList m210b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }
}
