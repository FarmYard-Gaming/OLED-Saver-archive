package android.support.p018v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: android.support.v7.widget.u */
public class C0623u extends RatingBar {

    /* renamed from: a */
    private final C0621s f2248a;

    public C0623u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.ratingBarStyle);
    }

    public C0623u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2248a = new C0621s(this);
        this.f2248a.mo3135a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f2248a.mo3134a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
