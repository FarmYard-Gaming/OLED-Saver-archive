package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p006v4.widget.C0351m;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: android.support.v7.widget.t */
public class C0622t extends RadioButton implements C0351m {

    /* renamed from: a */
    private final C0607j f2246a;

    /* renamed from: b */
    private final C0633y f2247b;

    public C0622t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.radioButtonStyle);
    }

    public C0622t(Context context, AttributeSet attributeSet, int i) {
        super(C0572ar.m2814a(context), attributeSet, i);
        this.f2246a = new C0607j(this);
        this.f2246a.mo3082a(attributeSet, i);
        this.f2247b = new C0633y(this);
        this.f2247b.mo3196a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f2246a != null ? this.f2246a.mo3078a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f2246a != null) {
            return this.f2246a.mo3079a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f2246a != null) {
            return this.f2246a.mo3083b();
        }
        return null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0419a.m1949b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f2246a != null) {
            this.f2246a.mo3084c();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f2246a != null) {
            this.f2246a.mo3080a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f2246a != null) {
            this.f2246a.mo3081a(mode);
        }
    }
}
