package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p015g.C0248p;
import android.support.p006v4.widget.C0336b;
import android.support.p006v4.widget.C0349l;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.g */
public class C0604g extends Button implements C0248p, C0336b {

    /* renamed from: b */
    private final C0603f f2202b;

    /* renamed from: c */
    private final C0633y f2203c;

    public C0604g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.buttonStyle);
    }

    public C0604g(Context context, AttributeSet attributeSet, int i) {
        super(C0572ar.m2814a(context), attributeSet, i);
        this.f2202b = new C0603f(this);
        this.f2202b.mo3045a(attributeSet, i);
        this.f2203c = new C0633y(this);
        this.f2203c.mo3196a(attributeSet, i);
        this.f2203c.mo3191a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2202b != null) {
            this.f2202b.mo3048c();
        }
        if (this.f2203c != null) {
            this.f2203c.mo3191a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (f961a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f2203c != null) {
            return this.f2203c.mo3206g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f961a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f2203c != null) {
            return this.f2203c.mo3205f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f961a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f2203c != null) {
            return this.f2203c.mo3204e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return f961a ? super.getAutoSizeTextAvailableSizes() : this.f2203c != null ? this.f2203c.mo3207h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (f961a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f2203c != null) {
            return this.f2203c.mo3203d();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2202b != null) {
            return this.f2202b.mo3040a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f2202b != null) {
            return this.f2202b.mo3046b();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2203c != null) {
            this.f2203c.mo3199a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f2203c != null && !f961a && this.f2203c.mo3202c()) {
            this.f2203c.mo3201b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f961a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f2203c != null) {
            this.f2203c.mo3194a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f961a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f2203c != null) {
            this.f2203c.mo3200a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f961a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f2203c != null) {
            this.f2203c.mo3192a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2202b != null) {
            this.f2202b.mo3044a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2202b != null) {
            this.f2202b.mo3041a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0349l.m1613a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f2203c != null) {
            this.f2203c.mo3198a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2202b != null) {
            this.f2202b.mo3042a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2202b != null) {
            this.f2202b.mo3043a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2203c != null) {
            this.f2203c.mo3195a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (f961a) {
            super.setTextSize(i, f);
        } else if (this.f2203c != null) {
            this.f2203c.mo3193a(i, f);
        }
    }
}
