package android.support.p018v7.p020b.p021a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.p007a.C0068a;
import android.support.p006v4.p007a.p008a.C0069a;
import android.support.p018v7.widget.C0608k;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.b.a.a */
public final class C0419a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1285a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0420a>> f1286b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f1287c = new Object();

    /* renamed from: android.support.v7.b.a.a$a */
    private static class C0420a {

        /* renamed from: a */
        final ColorStateList f1288a;

        /* renamed from: b */
        final Configuration f1289b;

        C0420a(ColorStateList colorStateList, Configuration configuration) {
            this.f1288a = colorStateList;
            this.f1289b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m1946a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m1951d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m1950c(context, i);
        if (c == null) {
            return C0068a.m210b(context, i);
        }
        m1948a(context, i, c);
        return c;
    }

    /* renamed from: a */
    private static TypedValue m1947a() {
        TypedValue typedValue = f1285a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1285a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m1948a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f1287c) {
            SparseArray sparseArray = f1286b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f1286b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0420a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static Drawable m1949b(Context context, int i) {
        return C0608k.m2988a().mo3086a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m1950c(Context context, int i) {
        if (m1952e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0069a.m212a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m1951d(android.content.Context r5, int r6) {
        /*
            java.lang.Object r2 = f1287c
            monitor-enter(r2)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<android.support.v7.b.a.a$a>> r0 = f1286b     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0032
            int r1 = r0.size()     // Catch:{ all -> 0x0035 }
            if (r1 <= 0) goto L_0x0032
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x0035 }
            android.support.v7.b.a.a$a r1 = (android.support.p018v7.p020b.p021a.C0419a.C0420a) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r1.f1289b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r5.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x002f
            android.content.res.ColorStateList r0 = r1.f1288a     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
        L_0x002e:
            return r0
        L_0x002f:
            r0.remove(r6)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            r0 = 0
            goto L_0x002e
        L_0x0035:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.p020b.p021a.C0419a.m1951d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: e */
    private static boolean m1952e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m1947a();
        resources.getValue(i, a, true);
        return a.type >= 28 && a.type <= 31;
    }
}
