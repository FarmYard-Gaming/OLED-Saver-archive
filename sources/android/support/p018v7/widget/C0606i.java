package android.support.p018v7.widget;

import android.content.Context;
import android.support.p006v4.widget.C0349l;
import android.support.p018v7.p020b.p021a.C0419a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.i */
public class C0606i extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f2205a = {16843016};

    /* renamed from: b */
    private final C0633y f2206b;

    public C0606i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0606i(Context context, AttributeSet attributeSet, int i) {
        super(C0572ar.m2814a(context), attributeSet, i);
        this.f2206b = new C0633y(this);
        this.f2206b.mo3196a(attributeSet, i);
        this.f2206b.mo3191a();
        C0575au a = C0575au.m2819a(getContext(), attributeSet, f2205a, i, 0);
        setCheckMarkDrawable(a.mo2958a(0));
        a.mo2959a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2206b != null) {
            this.f2206b.mo3191a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0615m.m3019a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0419a.m1949b(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0349l.m1613a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2206b != null) {
            this.f2206b.mo3195a(context, i);
        }
    }
}
