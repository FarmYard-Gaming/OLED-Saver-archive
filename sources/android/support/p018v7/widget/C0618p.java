package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p006v4.p015g.C0248p;
import android.support.p006v4.widget.C0352n;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.p */
public class C0618p extends ImageView implements C0248p, C0352n {

    /* renamed from: a */
    private final C0603f f2236a;

    /* renamed from: b */
    private final C0617o f2237b;

    public C0618p(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0618p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0618p(Context context, AttributeSet attributeSet, int i) {
        super(C0572ar.m2814a(context), attributeSet, i);
        this.f2236a = new C0603f(this);
        this.f2236a.mo3045a(attributeSet, i);
        this.f2237b = new C0617o(this);
        this.f2237b.mo3112a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2236a != null) {
            this.f2236a.mo3048c();
        }
        if (this.f2237b != null) {
            this.f2237b.mo3116d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2236a != null) {
            return this.f2236a.mo3040a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f2236a != null) {
            return this.f2236a.mo3046b();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        if (this.f2237b != null) {
            return this.f2237b.mo3114b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        if (this.f2237b != null) {
            return this.f2237b.mo3115c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f2237b.mo3113a() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2236a != null) {
            this.f2236a.mo3044a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2236a != null) {
            this.f2236a.mo3041a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f2237b != null) {
            this.f2237b.mo3116d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f2237b != null) {
            this.f2237b.mo3116d();
        }
    }

    public void setImageResource(int i) {
        if (this.f2237b != null) {
            this.f2237b.mo3109a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f2237b != null) {
            this.f2237b.mo3116d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2236a != null) {
            this.f2236a.mo3042a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2236a != null) {
            this.f2236a.mo3043a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f2237b != null) {
            this.f2237b.mo3110a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f2237b != null) {
            this.f2237b.mo3111a(mode);
        }
    }
}
