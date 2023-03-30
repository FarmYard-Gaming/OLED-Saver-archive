package android.support.p004b.p005a;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.graphics.drawable.C0271b;

/* renamed from: android.support.b.a.h */
abstract class C0057h extends Drawable implements C0271b {

    /* renamed from: c */
    Drawable f105c;

    C0057h() {
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.f105c != null) {
            C0270a.m1157a(this.f105c, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f105c != null) {
            this.f105c.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f105c != null) {
            return C0270a.m1165e(this.f105c);
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.f105c != null ? this.f105c.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        return this.f105c != null ? this.f105c.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f105c != null ? this.f105c.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.f105c != null ? this.f105c.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        return this.f105c != null ? this.f105c.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        return this.f105c != null ? this.f105c.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f105c != null) {
            C0270a.m1152a(this.f105c);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f105c != null) {
            this.f105c.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f105c != null ? this.f105c.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f105c != null) {
            this.f105c.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.f105c != null) {
            this.f105c.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f105c != null) {
            this.f105c.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f105c != null) {
            C0270a.m1153a(this.f105c, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f105c != null) {
            C0270a.m1155a(this.f105c, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        return this.f105c != null ? this.f105c.setState(iArr) : super.setState(iArr);
    }
}
