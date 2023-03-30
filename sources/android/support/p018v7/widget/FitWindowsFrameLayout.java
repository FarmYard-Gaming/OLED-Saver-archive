package android.support.p018v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p018v7.widget.C0543af;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.FitWindowsFrameLayout */
public class FitWindowsFrameLayout extends FrameLayout implements C0543af {

    /* renamed from: a */
    private C0543af.C0544a f1772a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f1772a != null) {
            this.f1772a.mo1661a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0543af.C0544a aVar) {
        this.f1772a = aVar;
    }
}
