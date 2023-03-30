package android.support.p018v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.h */
class C0407h {

    /* renamed from: a */
    private static Field f1212a;

    /* renamed from: b */
    private static boolean f1213b;

    /* renamed from: c */
    private static Class f1214c;

    /* renamed from: d */
    private static boolean f1215d;

    /* renamed from: e */
    private static Field f1216e;

    /* renamed from: f */
    private static boolean f1217f;

    /* renamed from: g */
    private static Field f1218g;

    /* renamed from: h */
    private static boolean f1219h;

    /* renamed from: a */
    static void m1858a(Resources resources) {
        if (Build.VERSION.SDK_INT < 28) {
            if (Build.VERSION.SDK_INT >= 24) {
                m1862d(resources);
            } else if (Build.VERSION.SDK_INT >= 23) {
                m1861c(resources);
            } else if (Build.VERSION.SDK_INT >= 21) {
                m1860b(resources);
            }
        }
    }

    /* renamed from: a */
    private static void m1859a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1215d) {
            try {
                f1214c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1215d = true;
        }
        if (f1214c != null) {
            if (!f1217f) {
                try {
                    f1216e = f1214c.getDeclaredField("mUnthemedEntries");
                    f1216e.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f1217f = true;
            }
            if (f1216e != null) {
                try {
                    longSparseArray = (LongSparseArray) f1216e.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* renamed from: b */
    private static void m1860b(Resources resources) {
        Map map;
        if (!f1213b) {
            try {
                f1212a = Resources.class.getDeclaredField("mDrawableCache");
                f1212a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1213b = true;
        }
        if (f1212a != null) {
            try {
                map = (Map) f1212a.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1861c(android.content.res.Resources r4) {
        /*
            r3 = 1
            boolean r0 = f1213b
            if (r0 != 0) goto L_0x0017
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r1 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x0025 }
            f1212a = r0     // Catch:{ NoSuchFieldException -> 0x0025 }
            java.lang.reflect.Field r0 = f1212a     // Catch:{ NoSuchFieldException -> 0x0025 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0025 }
        L_0x0015:
            f1213b = r3
        L_0x0017:
            r1 = 0
            java.lang.reflect.Field r0 = f1212a
            if (r0 == 0) goto L_0x0036
            java.lang.reflect.Field r0 = f1212a     // Catch:{ IllegalAccessException -> 0x002e }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IllegalAccessException -> 0x002e }
        L_0x0022:
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            return
        L_0x0025:
            r0 = move-exception
            java.lang.String r1 = "ResourcesFlusher"
            java.lang.String r2 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r2, r0)
            goto L_0x0015
        L_0x002e:
            r0 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r2, r3, r0)
        L_0x0036:
            r0 = r1
            goto L_0x0022
        L_0x0038:
            m1859a((java.lang.Object) r0)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.app.C0407h.m1861c(android.content.res.Resources):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1862d(android.content.res.Resources r6) {
        /*
            r1 = 0
            r5 = 1
            boolean r0 = f1219h
            if (r0 != 0) goto L_0x0018
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r2 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x001d }
            f1218g = r0     // Catch:{ NoSuchFieldException -> 0x001d }
            java.lang.reflect.Field r0 = f1218g     // Catch:{ NoSuchFieldException -> 0x001d }
            r2 = 1
            r0.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x001d }
        L_0x0016:
            f1219h = r5
        L_0x0018:
            java.lang.reflect.Field r0 = f1218g
            if (r0 != 0) goto L_0x0026
        L_0x001c:
            return
        L_0x001d:
            r0 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r2, r3, r0)
            goto L_0x0016
        L_0x0026:
            java.lang.reflect.Field r0 = f1218g     // Catch:{ IllegalAccessException -> 0x0057 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ IllegalAccessException -> 0x0057 }
            r2 = r0
        L_0x002d:
            if (r2 == 0) goto L_0x001c
            boolean r0 = f1213b
            if (r0 != 0) goto L_0x0047
            java.lang.Class r0 = r2.getClass()     // Catch:{ NoSuchFieldException -> 0x0061 }
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0061 }
            f1212a = r0     // Catch:{ NoSuchFieldException -> 0x0061 }
            java.lang.reflect.Field r0 = f1212a     // Catch:{ NoSuchFieldException -> 0x0061 }
            r3 = 1
            r0.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0061 }
        L_0x0045:
            f1213b = r5
        L_0x0047:
            java.lang.reflect.Field r0 = f1212a
            if (r0 == 0) goto L_0x0072
            java.lang.reflect.Field r0 = f1212a     // Catch:{ IllegalAccessException -> 0x006a }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IllegalAccessException -> 0x006a }
        L_0x0051:
            if (r0 == 0) goto L_0x001c
            m1859a((java.lang.Object) r0)
            goto L_0x001c
        L_0x0057:
            r0 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r2, r3, r0)
            r2 = r1
            goto L_0x002d
        L_0x0061:
            r0 = move-exception
            java.lang.String r3 = "ResourcesFlusher"
            java.lang.String r4 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r3, r4, r0)
            goto L_0x0045
        L_0x006a:
            r0 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r2, r3, r0)
        L_0x0072:
            r0 = r1
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.app.C0407h.m1862d(android.content.res.Resources):void");
    }
}
