package android.support.p018v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p006v4.graphics.drawable.C0272c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.s */
class C0621s {

    /* renamed from: a */
    private static final int[] f2243a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f2244b;

    /* renamed from: c */
    private Bitmap f2245c;

    C0621s(ProgressBar progressBar) {
        this.f2244b = progressBar;
    }

    /* renamed from: a */
    private Drawable mo3146a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m3033a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m3033a(Drawable drawable, boolean z) {
        if (drawable instanceof C0272c) {
            Drawable a = ((C0272c) drawable).mo1108a();
            if (a != null) {
                ((C0272c) drawable).mo1109a(m3033a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m3033a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2245c == null) {
                this.f2245c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo3147b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: b */
    private Shape mo3147b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo3134a() {
        return this.f2245c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3135a(AttributeSet attributeSet, int i) {
        C0575au a = C0575au.m2819a(this.f2244b.getContext(), attributeSet, f2243a, i, 0);
        Drawable b = a.mo2962b(0);
        if (b != null) {
            this.f2244b.setIndeterminateDrawable(mo3146a(b));
        }
        Drawable b2 = a.mo2962b(1);
        if (b2 != null) {
            this.f2244b.setProgressDrawable(m3033a(b2, false));
        }
        a.mo2959a();
    }
}
