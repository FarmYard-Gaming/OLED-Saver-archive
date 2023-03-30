package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.p013e.C0196a;
import android.support.p006v4.p015g.C0248p;
import android.support.p006v4.widget.C0336b;
import android.support.p006v4.widget.C0349l;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: android.support.v7.widget.z */
public class C0635z extends TextView implements C0248p, C0336b {

    /* renamed from: b */
    private final C0603f f2291b;

    /* renamed from: c */
    private final C0633y f2292c;

    /* renamed from: d */
    private Future<C0196a> f2293d;

    public C0635z(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0635z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0635z(Context context, AttributeSet attributeSet, int i) {
        super(C0572ar.m2814a(context), attributeSet, i);
        this.f2291b = new C0603f(this);
        this.f2291b.mo3045a(attributeSet, i);
        this.f2292c = new C0633y(this);
        this.f2292c.mo3196a(attributeSet, i);
        this.f2292c.mo3191a();
    }

    /* renamed from: a */
    private void mo1937a() {
        if (this.f2293d != null) {
            try {
                Future<C0196a> future = this.f2293d;
                this.f2293d = null;
                C0349l.m1616a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2291b != null) {
            this.f2291b.mo3048c();
        }
        if (this.f2292c != null) {
            this.f2292c.mo3191a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (f961a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f2292c != null) {
            return this.f2292c.mo3206g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f961a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f2292c != null) {
            return this.f2292c.mo3205f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f961a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f2292c != null) {
            return this.f2292c.mo3204e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return f961a ? super.getAutoSizeTextAvailableSizes() : this.f2292c != null ? this.f2292c.mo3207h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (f961a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f2292c != null) {
            return this.f2292c.mo3203d();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C0349l.m1612a((TextView) this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0349l.m1617b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2291b != null) {
            return this.f2291b.mo3040a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f2291b != null) {
            return this.f2291b.mo3046b();
        }
        return null;
    }

    public CharSequence getText() {
        mo1937a();
        return super.getText();
    }

    public C0196a.C0197a getTextMetricsParamsCompat() {
        return C0349l.m1619c(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0615m.m3019a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2292c != null) {
            this.f2292c.mo3199a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo1937a();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f2292c != null && !f961a && this.f2292c.mo3202c()) {
            this.f2292c.mo3201b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f961a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f2292c != null) {
            this.f2292c.mo3194a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f961a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f2292c != null) {
            this.f2292c.mo3200a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f961a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f2292c != null) {
            this.f2292c.mo3192a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2291b != null) {
            this.f2291b.mo3044a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2291b != null) {
            this.f2291b.mo3041a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0349l.m1613a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0349l.m1614a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0349l.m1618b(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0349l.m1620c(this, i);
    }

    public void setPrecomputedText(C0196a aVar) {
        C0349l.m1616a((TextView) this, aVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2291b != null) {
            this.f2291b.mo3042a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2291b != null) {
            this.f2291b.mo3043a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2292c != null) {
            this.f2292c.mo3195a(context, i);
        }
    }

    public void setTextFuture(Future<C0196a> future) {
        this.f2293d = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(C0196a.C0197a aVar) {
        C0349l.m1615a((TextView) this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (f961a) {
            super.setTextSize(i, f);
        } else if (this.f2292c != null) {
            this.f2292c.mo3193a(i, f);
        }
    }
}
