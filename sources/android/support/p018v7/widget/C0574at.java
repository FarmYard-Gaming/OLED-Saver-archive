package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.at */
class C0574at extends C0561al {

    /* renamed from: a */
    private final WeakReference<Context> f2090a;

    public C0574at(Context context, Resources resources) {
        super(resources);
        this.f2090a = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f2090a.get();
        if (!(drawable == null || context == null)) {
            C0608k.m2988a();
            C0608k.m2994a(context, i, drawable);
        }
        return drawable;
    }
}
