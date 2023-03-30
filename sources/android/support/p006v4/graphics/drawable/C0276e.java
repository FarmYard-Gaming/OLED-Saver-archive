package android.support.p006v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p006v4.graphics.drawable.C0273d;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.drawable.e */
class C0276e extends C0273d {

    /* renamed from: d */
    private static Method f794d;

    /* renamed from: android.support.v4.graphics.drawable.e$a */
    private static class C0277a extends C0273d.C0274a {
        C0277a(C0273d.C0274a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0276e(this, resources);
        }
    }

    C0276e(Drawable drawable) {
        super(drawable);
        m1177d();
    }

    C0276e(C0273d.C0274a aVar, Resources resources) {
        super(aVar, resources);
        m1177d();
    }

    /* renamed from: d */
    private void m1177d() {
        if (f794d == null) {
            try {
                f794d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0273d.C0274a mo1110b() {
        return new C0277a(this.f784b, (Resources) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1111c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f785c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f785c.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f785c.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f785c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f785c.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo1111c()) {
            super.setTint(i);
        } else {
            this.f785c.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo1111c()) {
            super.setTintList(colorStateList);
        } else {
            this.f785c.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo1111c()) {
            super.setTintMode(mode);
        } else {
            this.f785c.setTintMode(mode);
        }
    }
}
