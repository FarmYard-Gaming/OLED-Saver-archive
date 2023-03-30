package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.p015g.C0248p;
import android.support.p006v4.widget.C0349l;
import android.support.p018v7.p019a.C0353a;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.l */
public class C0614l extends EditText implements C0248p {

    /* renamed from: a */
    private final C0603f f2228a;

    /* renamed from: b */
    private final C0633y f2229b;

    public C0614l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.editTextStyle);
    }

    public C0614l(Context context, AttributeSet attributeSet, int i) {
        super(C0572ar.m2814a(context), attributeSet, i);
        this.f2228a = new C0603f(this);
        this.f2228a.mo3045a(attributeSet, i);
        this.f2229b = new C0633y(this);
        this.f2229b.mo3196a(attributeSet, i);
        this.f2229b.mo3191a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2228a != null) {
            this.f2228a.mo3048c();
        }
        if (this.f2229b != null) {
            this.f2229b.mo3191a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2228a != null) {
            return this.f2228a.mo3040a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f2228a != null) {
            return this.f2228a.mo3046b();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0615m.m3019a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2228a != null) {
            this.f2228a.mo3044a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2228a != null) {
            this.f2228a.mo3041a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0349l.m1613a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2228a != null) {
            this.f2228a.mo3042a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2228a != null) {
            this.f2228a.mo3043a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2229b != null) {
            this.f2229b.mo3195a(context, i);
        }
    }
}
