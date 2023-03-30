package android.support.p018v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.w */
class C0625w extends C0621s {

    /* renamed from: a */
    private final SeekBar f2250a;

    /* renamed from: b */
    private Drawable f2251b;

    /* renamed from: c */
    private ColorStateList f2252c = null;

    /* renamed from: d */
    private PorterDuff.Mode f2253d = null;

    /* renamed from: e */
    private boolean f2254e = false;

    /* renamed from: f */
    private boolean f2255f = false;

    C0625w(SeekBar seekBar) {
        super(seekBar);
        this.f2250a = seekBar;
    }

    /* renamed from: d */
    private void m3037d() {
        if (this.f2251b == null) {
            return;
        }
        if (this.f2254e || this.f2255f) {
            this.f2251b = C0270a.m1166f(this.f2251b.mutate());
            if (this.f2254e) {
                C0270a.m1156a(this.f2251b, this.f2252c);
            }
            if (this.f2255f) {
                C0270a.m1159a(this.f2251b, this.f2253d);
            }
            if (this.f2251b.isStateful()) {
                this.f2251b.setState(this.f2250a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3145a(Canvas canvas) {
        int max;
        int i = 1;
        if (this.f2251b != null && (max = this.f2250a.getMax()) > 1) {
            int intrinsicWidth = this.f2251b.getIntrinsicWidth();
            int intrinsicHeight = this.f2251b.getIntrinsicHeight();
            int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            if (intrinsicHeight >= 0) {
                i = intrinsicHeight / 2;
            }
            this.f2251b.setBounds(-i2, -i, i2, i);
            float width = ((float) ((this.f2250a.getWidth() - this.f2250a.getPaddingLeft()) - this.f2250a.getPaddingRight())) / ((float) max);
            int save = canvas.save();
            canvas.translate((float) this.f2250a.getPaddingLeft(), (float) (this.f2250a.getHeight() / 2));
            for (int i3 = 0; i3 <= max; i3++) {
                this.f2251b.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3146a(Drawable drawable) {
        if (this.f2251b != null) {
            this.f2251b.setCallback((Drawable.Callback) null);
        }
        this.f2251b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2250a);
            C0270a.m1162b(drawable, C0249q.m1059b(this.f2250a));
            if (drawable.isStateful()) {
                drawable.setState(this.f2250a.getDrawableState());
            }
            m3037d();
        }
        this.f2250a.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3135a(AttributeSet attributeSet, int i) {
        super.mo3135a(attributeSet, i);
        C0575au a = C0575au.m2819a(this.f2250a.getContext(), attributeSet, C0353a.C0363j.AppCompatSeekBar, i, 0);
        Drawable b = a.mo2962b(C0353a.C0363j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f2250a.setThumb(b);
        }
        mo3146a(a.mo2958a(C0353a.C0363j.AppCompatSeekBar_tickMark));
        if (a.mo2972g(C0353a.C0363j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f2253d = C0539ad.m2673a(a.mo2956a(C0353a.C0363j.AppCompatSeekBar_tickMarkTintMode, -1), this.f2253d);
            this.f2255f = true;
        }
        if (a.mo2972g(C0353a.C0363j.AppCompatSeekBar_tickMarkTint)) {
            this.f2252c = a.mo2968e(C0353a.C0363j.AppCompatSeekBar_tickMarkTint);
            this.f2254e = true;
        }
        a.mo2959a();
        m3037d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3147b() {
        if (this.f2251b != null) {
            this.f2251b.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3148c() {
        Drawable drawable = this.f2251b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2250a.getDrawableState())) {
            this.f2250a.invalidateDrawable(drawable);
        }
    }
}
