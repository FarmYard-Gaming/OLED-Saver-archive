package android.support.p018v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.widget.C0337c;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.j */
class C0607j {

    /* renamed from: a */
    private final CompoundButton f2207a;

    /* renamed from: b */
    private ColorStateList f2208b = null;

    /* renamed from: c */
    private PorterDuff.Mode f2209c = null;

    /* renamed from: d */
    private boolean f2210d = false;

    /* renamed from: e */
    private boolean f2211e = false;

    /* renamed from: f */
    private boolean f2212f;

    C0607j(CompoundButton compoundButton) {
        this.f2207a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = android.support.p006v4.widget.C0337c.m1580a(r2.f2207a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo3078a(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f2207a
            android.graphics.drawable.Drawable r0 = android.support.p006v4.widget.C0337c.m1580a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.widget.C0607j.mo3078a(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo3079a() {
        return this.f2208b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3080a(ColorStateList colorStateList) {
        this.f2208b = colorStateList;
        this.f2210d = true;
        mo3085d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3081a(PorterDuff.Mode mode) {
        this.f2209c = mode;
        this.f2211e = true;
        mo3085d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3082a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f2207a.getContext().obtainStyledAttributes(attributeSet, C0353a.C0363j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0353a.C0363j.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C0353a.C0363j.CompoundButton_android_button, 0)) != 0) {
                this.f2207a.setButtonDrawable(C0419a.m1949b(this.f2207a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0353a.C0363j.CompoundButton_buttonTint)) {
                C0337c.m1581a(this.f2207a, obtainStyledAttributes.getColorStateList(C0353a.C0363j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0353a.C0363j.CompoundButton_buttonTintMode)) {
                C0337c.m1582a(this.f2207a, C0539ad.m2673a(obtainStyledAttributes.getInt(C0353a.C0363j.CompoundButton_buttonTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo3083b() {
        return this.f2209c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3084c() {
        if (this.f2212f) {
            this.f2212f = false;
            return;
        }
        this.f2212f = true;
        mo3085d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3085d() {
        Drawable a = C0337c.m1580a(this.f2207a);
        if (a == null) {
            return;
        }
        if (this.f2210d || this.f2211e) {
            Drawable mutate = C0270a.m1166f(a).mutate();
            if (this.f2210d) {
                C0270a.m1156a(mutate, this.f2208b);
            }
            if (this.f2211e) {
                C0270a.m1159a(mutate, this.f2209c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2207a.getDrawableState());
            }
            this.f2207a.setButtonDrawable(mutate);
        }
    }
}
