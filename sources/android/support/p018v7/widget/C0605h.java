package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p006v4.widget.C0351m;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: android.support.v7.widget.h */
public class C0605h extends CheckBox implements C0351m {

    /* renamed from: a */
    private final C0607j f2204a;

    public C0605h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.checkboxStyle);
    }

    public C0605h(Context context, AttributeSet attributeSet, int i) {
        super(C0572ar.m2814a(context), attributeSet, i);
        this.f2204a = new C0607j(this);
        this.f2204a.mo3082a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f2204a != null ? this.f2204a.mo3078a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f2204a != null) {
            return this.f2204a.mo3079a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f2204a != null) {
            return this.f2204a.mo3083b();
        }
        return null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0419a.m1949b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f2204a != null) {
            this.f2204a.mo3084c();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f2204a != null) {
            this.f2204a.mo3080a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f2204a != null) {
            this.f2204a.mo3081a(mode);
        }
    }
}
