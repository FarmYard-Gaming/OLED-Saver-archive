package android.support.p018v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ar */
public class C0572ar extends ContextWrapper {

    /* renamed from: a */
    private static final Object f2082a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0572ar>> f2083b;

    /* renamed from: c */
    private final Resources f2084c;

    /* renamed from: d */
    private final Resources.Theme f2085d;

    private C0572ar(Context context) {
        super(context);
        if (C0584az.m2898a()) {
            this.f2084c = new C0584az(this, context.getResources());
            this.f2085d = this.f2084c.newTheme();
            this.f2085d.setTo(context.getTheme());
            return;
        }
        this.f2084c = new C0574at(this, context.getResources());
        this.f2085d = null;
    }

    /* renamed from: a */
    public static Context m2814a(Context context) {
        if (!m2815b(context)) {
            return context;
        }
        synchronized (f2082a) {
            if (f2083b == null) {
                f2083b = new ArrayList<>();
            } else {
                for (int size = f2083b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f2083b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2083b.remove(size);
                    }
                }
                for (int size2 = f2083b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f2083b.get(size2);
                    C0572ar arVar = weakReference2 != null ? (C0572ar) weakReference2.get() : null;
                    if (arVar != null && arVar.getBaseContext() == context) {
                        return arVar;
                    }
                }
            }
            C0572ar arVar2 = new C0572ar(context);
            f2083b.add(new WeakReference(arVar2));
            return arVar2;
        }
    }

    /* renamed from: b */
    private static boolean m2815b(Context context) {
        if ((context instanceof C0572ar) || (context.getResources() instanceof C0574at) || (context.getResources() instanceof C0584az)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0584az.m2898a();
    }

    public AssetManager getAssets() {
        return this.f2084c.getAssets();
    }

    public Resources getResources() {
        return this.f2084c;
    }

    public Resources.Theme getTheme() {
        return this.f2085d == null ? super.getTheme() : this.f2085d;
    }

    public void setTheme(int i) {
        if (this.f2085d == null) {
            super.setTheme(i);
        } else {
            this.f2085d.applyStyle(i, true);
        }
    }
}
