package android.support.p018v7.p022c.p023a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p006v4.graphics.drawable.C0270a;

/* renamed from: android.support.v7.c.a.c */
public class C0433c extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private Drawable f1355a;

    public C0433c(Drawable drawable) {
        mo1829a(drawable);
    }

    /* renamed from: a */
    public Drawable mo1828a() {
        return this.f1355a;
    }

    /* renamed from: a */
    public void mo1829a(Drawable drawable) {
        if (this.f1355a != null) {
            this.f1355a.setCallback((Drawable.Callback) null);
        }
        this.f1355a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f1355a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f1355a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f1355a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1355a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1355a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1355a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1355a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1355a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1355a.getPadding(rect);
    }

    public int[] getState() {
        return this.f1355a.getState();
    }

    public Region getTransparentRegion() {
        return this.f1355a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0270a.m1161b(this.f1355a);
    }

    public boolean isStateful() {
        return this.f1355a.isStateful();
    }

    public void jumpToCurrentState() {
        C0270a.m1152a(this.f1355a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f1355a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f1355a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1355a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0270a.m1160a(this.f1355a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f1355a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1355a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1355a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1355a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0270a.m1153a(this.f1355a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0270a.m1155a(this.f1355a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f1355a.setState(iArr);
    }

    public void setTint(int i) {
        C0270a.m1154a(this.f1355a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0270a.m1156a(this.f1355a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0270a.m1159a(this.f1355a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1355a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
