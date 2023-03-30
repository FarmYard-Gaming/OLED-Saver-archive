package android.support.p018v7.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.aw */
public class C0579aw {
    /* renamed from: a */
    public static void m2884a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0580ax.m2886a(view, charSequence);
        }
    }
}
