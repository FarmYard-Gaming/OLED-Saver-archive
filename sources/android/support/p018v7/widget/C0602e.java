package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p015g.C0248p;
import android.support.p006v4.widget.C0349l;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.e */
public class C0602e extends AutoCompleteTextView implements C0248p {

    /* renamed from: a */
    private static final int[] f2193a = {16843126};

    /* renamed from: b */
    private final C0603f f2194b;

    /* renamed from: c */
    private final C0633y f2195c;

    public C0602e(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0602e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.autoCompleteTextViewStyle);
    }

    public C0602e(Context context, AttributeSet attributeSet, int i) {
        super(C0572ar.m2814a(context), attributeSet, i);
        C0575au a = C0575au.m2819a(getContext(), attributeSet, f2193a, i, 0);
        if (a.mo2972g(0)) {
            setDropDownBackgroundDrawable(a.mo2958a(0));
        }
        a.mo2959a();
        this.f2194b = new C0603f(this);
        this.f2194b.mo3045a(attributeSet, i);
        this.f2195c = new C0633y(this);
        this.f2195c.mo3196a(attributeSet, i);
        this.f2195c.mo3191a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2194b != null) {
            this.f2194b.mo3048c();
        }
        if (this.f2195c != null) {
            this.f2195c.mo3191a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2194b != null) {
            return this.f2194b.mo3040a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f2194b != null) {
            return this.f2194b.mo3046b();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0615m.m3019a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2194b != null) {
            this.f2194b.mo3044a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2194b != null) {
            this.f2194b.mo3041a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0349l.m1613a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0419a.m1949b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2194b != null) {
            this.f2194b.mo3042a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2194b != null) {
            this.f2194b.mo3043a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2195c != null) {
            this.f2195c.mo3195a(context, i);
        }
    }
}
