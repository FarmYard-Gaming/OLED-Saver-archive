package android.support.p018v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.f */
class C0603f {

    /* renamed from: a */
    private final View f2196a;

    /* renamed from: b */
    private final C0608k f2197b;

    /* renamed from: c */
    private int f2198c = -1;

    /* renamed from: d */
    private C0573as f2199d;

    /* renamed from: e */
    private C0573as f2200e;

    /* renamed from: f */
    private C0573as f2201f;

    C0603f(View view) {
        this.f2196a = view;
        this.f2197b = C0608k.m2988a();
    }

    /* renamed from: b */
    private boolean m2963b(Drawable drawable) {
        if (this.f2201f == null) {
            this.f2201f = new C0573as();
        }
        C0573as asVar = this.f2201f;
        asVar.mo2954a();
        ColorStateList i = C0249q.m1067i(this.f2196a);
        if (i != null) {
            asVar.f2089d = true;
            asVar.f2086a = i;
        }
        PorterDuff.Mode j = C0249q.m1068j(this.f2196a);
        if (j != null) {
            asVar.f2088c = true;
            asVar.f2087b = j;
        }
        if (!asVar.f2089d && !asVar.f2088c) {
            return false;
        }
        C0608k.m2991a(drawable, asVar, this.f2196a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m2964d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f2199d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo3040a() {
        if (this.f2200e != null) {
            return this.f2200e.f2086a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3041a(int i) {
        this.f2198c = i;
        mo3047b(this.f2197b != null ? this.f2197b.mo3090b(this.f2196a.getContext(), i) : null);
        mo3048c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3042a(ColorStateList colorStateList) {
        if (this.f2200e == null) {
            this.f2200e = new C0573as();
        }
        this.f2200e.f2086a = colorStateList;
        this.f2200e.f2089d = true;
        mo3048c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3043a(PorterDuff.Mode mode) {
        if (this.f2200e == null) {
            this.f2200e = new C0573as();
        }
        this.f2200e.f2087b = mode;
        this.f2200e.f2088c = true;
        mo3048c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3044a(Drawable drawable) {
        this.f2198c = -1;
        mo3047b((ColorStateList) null);
        mo3048c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3045a(AttributeSet attributeSet, int i) {
        C0575au a = C0575au.m2819a(this.f2196a.getContext(), attributeSet, C0353a.C0363j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo2972g(C0353a.C0363j.ViewBackgroundHelper_android_background)) {
                this.f2198c = a.mo2971g(C0353a.C0363j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f2197b.mo3090b(this.f2196a.getContext(), this.f2198c);
                if (b != null) {
                    mo3047b(b);
                }
            }
            if (a.mo2972g(C0353a.C0363j.ViewBackgroundHelper_backgroundTint)) {
                C0249q.m1050a(this.f2196a, a.mo2968e(C0353a.C0363j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo2972g(C0353a.C0363j.ViewBackgroundHelper_backgroundTintMode)) {
                C0249q.m1051a(this.f2196a, C0539ad.m2673a(a.mo2956a(C0353a.C0363j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo2959a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo3046b() {
        if (this.f2200e != null) {
            return this.f2200e.f2087b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3047b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2199d == null) {
                this.f2199d = new C0573as();
            }
            this.f2199d.f2086a = colorStateList;
            this.f2199d.f2089d = true;
        } else {
            this.f2199d = null;
        }
        mo3048c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3048c() {
        Drawable background = this.f2196a.getBackground();
        if (background == null) {
            return;
        }
        if (m2964d() && m2963b(background)) {
            return;
        }
        if (this.f2200e != null) {
            C0608k.m2991a(background, this.f2200e, this.f2196a.getDrawableState());
        } else if (this.f2199d != null) {
            C0608k.m2991a(background, this.f2199d, this.f2196a.getDrawableState());
        }
    }
}
