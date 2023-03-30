package android.support.p018v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p006v4.widget.C0347j;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.r */
class C0620r extends PopupWindow {

    /* renamed from: a */
    private static final boolean f2241a = (Build.VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f2242b;

    public C0620r(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m3030a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m3030a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0575au a = C0575au.m2819a(context, attributeSet, C0353a.C0363j.PopupWindow, i, i2);
        if (a.mo2972g(C0353a.C0363j.PopupWindow_overlapAnchor)) {
            m3031a(a.mo2960a(C0353a.C0363j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo2958a(C0353a.C0363j.PopupWindow_android_popupBackground));
        a.mo2959a();
    }

    /* renamed from: a */
    private void m3031a(boolean z) {
        if (f2241a) {
            this.f2242b = z;
        } else {
            C0347j.m1608a((PopupWindow) this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f2241a && this.f2242b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2241a && this.f2242b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, (!f2241a || !this.f2242b) ? i2 : i2 - view.getHeight(), i3, i4);
    }
}
