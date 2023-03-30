package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.az */
public class C0584az extends Resources {

    /* renamed from: a */
    private static boolean f2136a = false;

    /* renamed from: b */
    private final WeakReference<Context> f2137b;

    public C0584az(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2137b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m2898a() {
        return m2899b() && Build.VERSION.SDK_INT <= 20;
    }

    /* renamed from: b */
    public static boolean m2899b() {
        return f2136a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo2993a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f2137b.get();
        return context != null ? C0608k.m2988a().mo3088a(context, this, i) : super.getDrawable(i);
    }
}
