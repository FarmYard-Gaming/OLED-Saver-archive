package android.support.p006v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.graphics.drawable.d */
class C0273d extends Drawable implements Drawable.Callback, C0271b, C0272c {

    /* renamed from: a */
    static final PorterDuff.Mode f783a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    C0274a f784b;

    /* renamed from: c */
    Drawable f785c;

    /* renamed from: d */
    private int f786d;

    /* renamed from: e */
    private PorterDuff.Mode f787e;

    /* renamed from: f */
    private boolean f788f;

    /* renamed from: g */
    private boolean f789g;

    /* renamed from: android.support.v4.graphics.drawable.d$a */
    protected static abstract class C0274a extends Drawable.ConstantState {

        /* renamed from: a */
        int f790a;

        /* renamed from: b */
        Drawable.ConstantState f791b;

        /* renamed from: c */
        ColorStateList f792c = null;

        /* renamed from: d */
        PorterDuff.Mode f793d = C0273d.f783a;

        C0274a(C0274a aVar, Resources resources) {
            if (aVar != null) {
                this.f790a = aVar.f790a;
                this.f791b = aVar.f791b;
                this.f792c = aVar.f792c;
                this.f793d = aVar.f793d;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1141a() {
            return this.f791b != null;
        }

        public int getChangingConfigurations() {
            return (this.f791b != null ? this.f791b.getChangingConfigurations() : 0) | this.f790a;
        }

        public Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: android.support.v4.graphics.drawable.d$b */
    private static class C0275b extends C0274a {
        C0275b(C0274a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0273d(this, resources);
        }
    }

    C0273d(Drawable drawable) {
        this.f784b = mo1110b();
        mo1109a(drawable);
    }

    C0273d(C0274a aVar, Resources resources) {
        this.f784b = aVar;
        m1170a(resources);
    }

    /* renamed from: a */
    private void m1170a(Resources resources) {
        if (this.f784b != null && this.f784b.f791b != null) {
            mo1109a(this.f784b.f791b.newDrawable(resources));
        }
    }

    /* renamed from: a */
    private boolean m1171a(int[] iArr) {
        if (!mo1111c()) {
            return false;
        }
        ColorStateList colorStateList = this.f784b.f792c;
        PorterDuff.Mode mode = this.f784b.f793d;
        if (colorStateList == null || mode == null) {
            this.f788f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f788f && colorForState == this.f786d && mode == this.f787e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f786d = colorForState;
        this.f787e = mode;
        this.f788f = true;
        return true;
    }

    /* renamed from: a */
    public final Drawable mo1108a() {
        return this.f785c;
    }

    /* renamed from: a */
    public final void mo1109a(Drawable drawable) {
        if (this.f785c != null) {
            this.f785c.setCallback((Drawable.Callback) null);
        }
        this.f785c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f784b != null) {
                this.f784b.f791b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0274a mo1110b() {
        return new C0275b(this.f784b, (Resources) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1111c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f785c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return (this.f784b != null ? this.f784b.getChangingConfigurations() : 0) | super.getChangingConfigurations() | this.f785c.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f784b == null || !this.f784b.mo1141a()) {
            return null;
        }
        this.f784b.f790a = getChangingConfigurations();
        return this.f784b;
    }

    public Drawable getCurrent() {
        return this.f785c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f785c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f785c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f785c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f785c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f785c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f785c.getPadding(rect);
    }

    public int[] getState() {
        return this.f785c.getState();
    }

    public Region getTransparentRegion() {
        return this.f785c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f785c.isAutoMirrored();
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo1111c() || this.f784b == null) ? null : this.f784b.f792c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f785c.isStateful();
    }

    public void jumpToCurrentState() {
        this.f785c.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f789g && super.mutate() == this) {
            this.f784b = mo1110b();
            if (this.f785c != null) {
                this.f785c.mutate();
            }
            if (this.f784b != null) {
                this.f784b.f791b = this.f785c != null ? this.f785c.getConstantState() : null;
            }
            this.f789g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f785c != null) {
            this.f785c.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f785c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f785c.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f785c.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f785c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f785c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f785c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f785c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1171a(iArr) || this.f785c.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f784b.f792c = colorStateList;
        m1171a(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f784b.f793d = mode;
        m1171a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f785c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
