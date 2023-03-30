package android.support.p018v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p018v7.widget.C0543af;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C0543af {

    /* renamed from: a */
    private C0543af.C0544a f1773a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f1773a != null) {
            this.f1773a.mo1661a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0543af.C0544a aVar) {
        this.f1773a = aVar;
    }
}
