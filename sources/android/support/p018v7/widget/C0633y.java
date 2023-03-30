package android.support.p018v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.p007a.p008a.C0079f;
import android.support.p006v4.widget.C0336b;
import android.support.p006v4.widget.C0349l;
import android.support.p018v7.p019a.C0353a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.y */
class C0633y {

    /* renamed from: a */
    private final TextView f2278a;

    /* renamed from: b */
    private C0573as f2279b;

    /* renamed from: c */
    private C0573as f2280c;

    /* renamed from: d */
    private C0573as f2281d;

    /* renamed from: e */
    private C0573as f2282e;

    /* renamed from: f */
    private C0573as f2283f;

    /* renamed from: g */
    private C0573as f2284g;

    /* renamed from: h */
    private final C0536aa f2285h;

    /* renamed from: i */
    private int f2286i = 0;

    /* renamed from: j */
    private Typeface f2287j;

    /* renamed from: k */
    private boolean f2288k;

    C0633y(TextView textView) {
        this.f2278a = textView;
        this.f2285h = new C0536aa(this.f2278a);
    }

    /* renamed from: a */
    private static C0573as m3053a(Context context, C0608k kVar, int i) {
        ColorStateList b = kVar.mo3090b(context, i);
        if (b == null) {
            return null;
        }
        C0573as asVar = new C0573as();
        asVar.f2089d = true;
        asVar.f2086a = b;
        return asVar;
    }

    /* renamed from: a */
    private void m3054a(Context context, C0575au auVar) {
        String d;
        boolean z = true;
        this.f2286i = auVar.mo2956a(C0353a.C0363j.TextAppearance_android_textStyle, this.f2286i);
        if (auVar.mo2972g(C0353a.C0363j.TextAppearance_android_fontFamily) || auVar.mo2972g(C0353a.C0363j.TextAppearance_fontFamily)) {
            this.f2287j = null;
            int i = auVar.mo2972g(C0353a.C0363j.TextAppearance_fontFamily) ? C0353a.C0363j.TextAppearance_fontFamily : C0353a.C0363j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f2278a);
                try {
                    this.f2287j = auVar.mo2957a(i, this.f2286i, (C0079f.C0080a) new C0079f.C0080a() {
                        /* renamed from: a */
                        public void mo254a(int i) {
                        }

                        /* renamed from: a */
                        public void mo256a(Typeface typeface) {
                            C0633y.this.mo3197a((WeakReference<TextView>) weakReference, typeface);
                        }
                    });
                    if (this.f2287j != null) {
                        z = false;
                    }
                    this.f2288k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException e) {
                }
            }
            if (this.f2287j == null && (d = auVar.mo2966d(i)) != null) {
                this.f2287j = Typeface.create(d, this.f2286i);
            }
        } else if (auVar.mo2972g(C0353a.C0363j.TextAppearance_android_typeface)) {
            this.f2288k = false;
            switch (auVar.mo2956a(C0353a.C0363j.TextAppearance_android_typeface, 1)) {
                case 1:
                    this.f2287j = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.f2287j = Typeface.SERIF;
                    return;
                case 3:
                    this.f2287j = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m3055a(Drawable drawable, C0573as asVar) {
        if (drawable != null && asVar != null) {
            C0608k.m2991a(drawable, asVar, this.f2278a.getDrawableState());
        }
    }

    /* renamed from: b */
    private void m3056b(int i, float f) {
        this.f2285h.mo2721a(i, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3191a() {
        if (!(this.f2279b == null && this.f2280c == null && this.f2281d == null && this.f2282e == null)) {
            Drawable[] compoundDrawables = this.f2278a.getCompoundDrawables();
            m3055a(compoundDrawables[0], this.f2279b);
            m3055a(compoundDrawables[1], this.f2280c);
            m3055a(compoundDrawables[2], this.f2281d);
            m3055a(compoundDrawables[3], this.f2282e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f2283f != null || this.f2284g != null) {
            Drawable[] compoundDrawablesRelative = this.f2278a.getCompoundDrawablesRelative();
            m3055a(compoundDrawablesRelative[0], this.f2283f);
            m3055a(compoundDrawablesRelative[2], this.f2284g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3192a(int i) {
        this.f2285h.mo2720a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3193a(int i, float f) {
        if (!C0336b.f961a && !mo3202c()) {
            m3056b(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3194a(int i, int i2, int i3, int i4) {
        this.f2285h.mo2722a(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3195a(Context context, int i) {
        ColorStateList e;
        C0575au a = C0575au.m2817a(context, i, C0353a.C0363j.TextAppearance);
        if (a.mo2972g(C0353a.C0363j.TextAppearance_textAllCaps)) {
            mo3198a(a.mo2960a(C0353a.C0363j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.mo2972g(C0353a.C0363j.TextAppearance_android_textColor) && (e = a.mo2968e(C0353a.C0363j.TextAppearance_android_textColor)) != null) {
            this.f2278a.setTextColor(e);
        }
        if (a.mo2972g(C0353a.C0363j.TextAppearance_android_textSize) && a.mo2967e(C0353a.C0363j.TextAppearance_android_textSize, -1) == 0) {
            this.f2278a.setTextSize(0, 0.0f);
        }
        m3054a(context, a);
        a.mo2959a();
        if (this.f2287j != null) {
            this.f2278a.setTypeface(this.f2287j, this.f2286i);
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo3196a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z;
        boolean z2;
        Context context = this.f2278a.getContext();
        C0608k a = C0608k.m2988a();
        C0575au a2 = C0575au.m2819a(context, attributeSet, C0353a.C0363j.AppCompatTextHelper, i, 0);
        int g = a2.mo2971g(C0353a.C0363j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo2972g(C0353a.C0363j.AppCompatTextHelper_android_drawableLeft)) {
            this.f2279b = m3053a(context, a, a2.mo2971g(C0353a.C0363j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo2972g(C0353a.C0363j.AppCompatTextHelper_android_drawableTop)) {
            this.f2280c = m3053a(context, a, a2.mo2971g(C0353a.C0363j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo2972g(C0353a.C0363j.AppCompatTextHelper_android_drawableRight)) {
            this.f2281d = m3053a(context, a, a2.mo2971g(C0353a.C0363j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo2972g(C0353a.C0363j.AppCompatTextHelper_android_drawableBottom)) {
            this.f2282e = m3053a(context, a, a2.mo2971g(C0353a.C0363j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a2.mo2972g(C0353a.C0363j.AppCompatTextHelper_android_drawableStart)) {
                this.f2283f = m3053a(context, a, a2.mo2971g(C0353a.C0363j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.mo2972g(C0353a.C0363j.AppCompatTextHelper_android_drawableEnd)) {
                this.f2284g = m3053a(context, a, a2.mo2971g(C0353a.C0363j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.mo2959a();
        boolean z3 = this.f2278a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            C0575au a3 = C0575au.m2817a(context, g, C0353a.C0363j.TextAppearance);
            if (z3 || !a3.mo2972g(C0353a.C0363j.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = a3.mo2960a(C0353a.C0363j.TextAppearance_textAllCaps, false);
                z = true;
            }
            m3054a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList3 = a3.mo2972g(C0353a.C0363j.TextAppearance_android_textColor) ? a3.mo2968e(C0353a.C0363j.TextAppearance_android_textColor) : null;
                colorStateList2 = a3.mo2972g(C0353a.C0363j.TextAppearance_android_textColorHint) ? a3.mo2968e(C0353a.C0363j.TextAppearance_android_textColorHint) : null;
                colorStateList = a3.mo2972g(C0353a.C0363j.TextAppearance_android_textColorLink) ? a3.mo2968e(C0353a.C0363j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList = null;
                colorStateList2 = null;
                colorStateList3 = null;
            }
            a3.mo2959a();
        } else {
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            z = false;
            z2 = false;
        }
        C0575au a4 = C0575au.m2819a(context, attributeSet, C0353a.C0363j.TextAppearance, i, 0);
        if (!z3 && a4.mo2972g(C0353a.C0363j.TextAppearance_textAllCaps)) {
            z2 = a4.mo2960a(C0353a.C0363j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.mo2972g(C0353a.C0363j.TextAppearance_android_textColor)) {
                colorStateList3 = a4.mo2968e(C0353a.C0363j.TextAppearance_android_textColor);
            }
            if (a4.mo2972g(C0353a.C0363j.TextAppearance_android_textColorHint)) {
                colorStateList2 = a4.mo2968e(C0353a.C0363j.TextAppearance_android_textColorHint);
            }
            if (a4.mo2972g(C0353a.C0363j.TextAppearance_android_textColorLink)) {
                colorStateList = a4.mo2968e(C0353a.C0363j.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a4.mo2972g(C0353a.C0363j.TextAppearance_android_textSize) && a4.mo2967e(C0353a.C0363j.TextAppearance_android_textSize, -1) == 0) {
            this.f2278a.setTextSize(0, 0.0f);
        }
        m3054a(context, a4);
        a4.mo2959a();
        if (colorStateList3 != null) {
            this.f2278a.setTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f2278a.setHintTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.f2278a.setLinkTextColor(colorStateList);
        }
        if (!z3 && z) {
            mo3198a(z2);
        }
        if (this.f2287j != null) {
            this.f2278a.setTypeface(this.f2287j, this.f2286i);
        }
        this.f2285h.mo2723a(attributeSet, i);
        if (C0336b.f961a && this.f2285h.mo2719a() != 0) {
            int[] e = this.f2285h.mo2728e();
            if (e.length > 0) {
                if (((float) this.f2278a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f2278a.setAutoSizeTextTypeUniformWithConfiguration(this.f2285h.mo2726c(), this.f2285h.mo2727d(), this.f2285h.mo2725b(), 0);
                } else {
                    this.f2278a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
                }
            }
        }
        C0575au a5 = C0575au.m2818a(context, attributeSet, C0353a.C0363j.AppCompatTextView);
        int e2 = a5.mo2967e(C0353a.C0363j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int e3 = a5.mo2967e(C0353a.C0363j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int e4 = a5.mo2967e(C0353a.C0363j.AppCompatTextView_lineHeight, -1);
        a5.mo2959a();
        if (e2 != -1) {
            C0349l.m1614a(this.f2278a, e2);
        }
        if (e3 != -1) {
            C0349l.m1618b(this.f2278a, e3);
        }
        if (e4 != -1) {
            C0349l.m1620c(this.f2278a, e4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3197a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2288k) {
            this.f2287j = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f2286i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3198a(boolean z) {
        this.f2278a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3199a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0336b.f961a) {
            mo3201b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3200a(int[] iArr, int i) {
        this.f2285h.mo2724a(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3201b() {
        this.f2285h.mo2729f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3202c() {
        return this.f2285h.mo2730g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3203d() {
        return this.f2285h.mo2719a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3204e() {
        return this.f2285h.mo2725b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo3205f() {
        return this.f2285h.mo2726c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo3206g() {
        return this.f2285h.mo2727d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo3207h() {
        return this.f2285h.mo2728e();
    }
}
