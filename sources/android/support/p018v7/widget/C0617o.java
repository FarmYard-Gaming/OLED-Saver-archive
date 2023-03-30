package android.support.p018v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p006v4.widget.C0344g;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.o */
public class C0617o {

    /* renamed from: a */
    private final ImageView f2232a;

    /* renamed from: b */
    private C0573as f2233b;

    /* renamed from: c */
    private C0573as f2234c;

    /* renamed from: d */
    private C0573as f2235d;

    public C0617o(ImageView imageView) {
        this.f2232a = imageView;
    }

    /* renamed from: a */
    private boolean m3020a(Drawable drawable) {
        if (this.f2235d == null) {
            this.f2235d = new C0573as();
        }
        C0573as asVar = this.f2235d;
        asVar.mo2954a();
        ColorStateList a = C0344g.m1598a(this.f2232a);
        if (a != null) {
            asVar.f2089d = true;
            asVar.f2086a = a;
        }
        PorterDuff.Mode b = C0344g.m1601b(this.f2232a);
        if (b != null) {
            asVar.f2088c = true;
            asVar.f2087b = b;
        }
        if (!asVar.f2089d && !asVar.f2088c) {
            return false;
        }
        C0608k.m2991a(drawable, asVar, this.f2232a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m3021e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f2233b != null : i == 21;
    }

    /* renamed from: a */
    public void mo3109a(int i) {
        if (i != 0) {
            Drawable b = C0419a.m1949b(this.f2232a.getContext(), i);
            if (b != null) {
                C0539ad.m2674a(b);
            }
            this.f2232a.setImageDrawable(b);
        } else {
            this.f2232a.setImageDrawable((Drawable) null);
        }
        mo3116d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3110a(ColorStateList colorStateList) {
        if (this.f2234c == null) {
            this.f2234c = new C0573as();
        }
        this.f2234c.f2086a = colorStateList;
        this.f2234c.f2089d = true;
        mo3116d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3111a(PorterDuff.Mode mode) {
        if (this.f2234c == null) {
            this.f2234c = new C0573as();
        }
        this.f2234c.f2087b = mode;
        this.f2234c.f2088c = true;
        mo3116d();
    }

    /* renamed from: a */
    public void mo3112a(AttributeSet attributeSet, int i) {
        int g;
        C0575au a = C0575au.m2819a(this.f2232a.getContext(), attributeSet, C0353a.C0363j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f2232a.getDrawable();
            if (!(drawable != null || (g = a.mo2971g(C0353a.C0363j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C0419a.m1949b(this.f2232a.getContext(), g)) == null)) {
                this.f2232a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0539ad.m2674a(drawable);
            }
            if (a.mo2972g(C0353a.C0363j.AppCompatImageView_tint)) {
                C0344g.m1599a(this.f2232a, a.mo2968e(C0353a.C0363j.AppCompatImageView_tint));
            }
            if (a.mo2972g(C0353a.C0363j.AppCompatImageView_tintMode)) {
                C0344g.m1600a(this.f2232a, C0539ad.m2673a(a.mo2956a(C0353a.C0363j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo2959a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3113a() {
        return Build.VERSION.SDK_INT < 21 || !(this.f2232a.getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo3114b() {
        if (this.f2234c != null) {
            return this.f2234c.f2086a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo3115c() {
        if (this.f2234c != null) {
            return this.f2234c.f2087b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3116d() {
        Drawable drawable = this.f2232a.getDrawable();
        if (drawable != null) {
            C0539ad.m2674a(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (m3021e() && m3020a(drawable)) {
            return;
        }
        if (this.f2234c != null) {
            C0608k.m2991a(drawable, this.f2234c, this.f2232a.getDrawableState());
        } else if (this.f2233b != null) {
            C0608k.m2991a(drawable, this.f2233b, this.f2232a.getDrawableState());
        }
    }
}
