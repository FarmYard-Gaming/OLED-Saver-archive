package android.support.p006v4.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.p006v4.p007a.p008a.C0071c;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: android.support.v4.graphics.f */
public class C0279f extends C0269d {

    /* renamed from: a */
    protected final Class f799a;

    /* renamed from: b */
    protected final Constructor f800b;

    /* renamed from: c */
    protected final Method f801c;

    /* renamed from: d */
    protected final Method f802d;

    /* renamed from: e */
    protected final Method f803e;

    /* renamed from: f */
    protected final Method f804f;

    /* renamed from: g */
    protected final Method f805g;

    public C0279f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor constructor;
        Class cls;
        try {
            cls = mo1152a();
            constructor = mo1153a(cls);
            method5 = mo1154b(cls);
            method4 = mo1155c(cls);
            method3 = mo1156d(cls);
            method2 = mo1157e(cls);
            method = mo1158f(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
            constructor = null;
            cls = null;
        }
        this.f799a = cls;
        this.f800b = constructor;
        this.f801c = method5;
        this.f802d = method4;
        this.f803e = method3;
        this.f804f = method2;
        this.f805g = method;
    }

    /* renamed from: a */
    private boolean m1186a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f801c.invoke(obj, new Object[]{context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private boolean m1187a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f802d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private boolean m1188b() {
        if (this.f801c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f801c != null;
    }

    /* renamed from: b */
    private boolean m1189b(Object obj) {
        try {
            return ((Boolean) this.f803e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private Object m1190c() {
        try {
            return this.f800b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private void m1191c(Object obj) {
        try {
            this.f804f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo1150a(Context context, Resources resources, int i, String str, int i2) {
        if (!m1188b()) {
            return super.mo1150a(context, resources, i, str, i2);
        }
        Object c = m1190c();
        if (!m1186a(context, c, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m1191c(c);
            return null;
        } else if (m1189b(c)) {
            return mo1151a(c);
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d5, code lost:
        r1 = r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo1102a(android.content.Context r10, android.os.CancellationSignal r11, android.support.p006v4.p012d.C0182b.C0188b[] r12, int r13) {
        /*
            r9 = this;
            int r0 = r12.length
            r1 = 1
            if (r0 >= r1) goto L_0x0006
            r0 = 0
        L_0x0005:
            return r0
        L_0x0006:
            boolean r0 = r9.m1188b()
            if (r0 != 0) goto L_0x0079
            android.support.v4.d.b$b r0 = r9.mo1160a((android.support.p006v4.p012d.C0182b.C0188b[]) r12, (int) r13)
            android.content.ContentResolver r1 = r10.getContentResolver()
            android.net.Uri r2 = r0.mo775a()     // Catch:{ IOException -> 0x002f }
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r3 = r1.openFileDescriptor(r2, r3, r11)     // Catch:{ IOException -> 0x002f }
            r2 = 0
            if (r3 != 0) goto L_0x0036
            r0 = 0
            if (r3 == 0) goto L_0x0005
            if (r2 == 0) goto L_0x0032
            r3.close()     // Catch:{ Throwable -> 0x002a }
            goto L_0x0005
        L_0x002a:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x002f }
            goto L_0x0005
        L_0x002f:
            r0 = move-exception
            r0 = 0
            goto L_0x0005
        L_0x0032:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0005
        L_0x0036:
            android.graphics.Typeface$Builder r1 = new android.graphics.Typeface$Builder     // Catch:{ Throwable -> 0x0064, all -> 0x00d4 }
            java.io.FileDescriptor r4 = r3.getFileDescriptor()     // Catch:{ Throwable -> 0x0064, all -> 0x00d4 }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x0064, all -> 0x00d4 }
            int r4 = r0.mo777c()     // Catch:{ Throwable -> 0x0064, all -> 0x00d4 }
            android.graphics.Typeface$Builder r1 = r1.setWeight(r4)     // Catch:{ Throwable -> 0x0064, all -> 0x00d4 }
            boolean r0 = r0.mo778d()     // Catch:{ Throwable -> 0x0064, all -> 0x00d4 }
            android.graphics.Typeface$Builder r0 = r1.setItalic(r0)     // Catch:{ Throwable -> 0x0064, all -> 0x00d4 }
            android.graphics.Typeface r0 = r0.build()     // Catch:{ Throwable -> 0x0064, all -> 0x00d4 }
            if (r3 == 0) goto L_0x0005
            if (r2 == 0) goto L_0x0060
            r3.close()     // Catch:{ Throwable -> 0x005b }
            goto L_0x0005
        L_0x005b:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x002f }
            goto L_0x0005
        L_0x0060:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0005
        L_0x0064:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            r2 = r0
        L_0x0068:
            if (r3 == 0) goto L_0x006f
            if (r2 == 0) goto L_0x0075
            r3.close()     // Catch:{ Throwable -> 0x0070 }
        L_0x006f:
            throw r1     // Catch:{ IOException -> 0x002f }
        L_0x0070:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IOException -> 0x002f }
            goto L_0x006f
        L_0x0075:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x006f
        L_0x0079:
            java.util.Map r7 = android.support.p006v4.p012d.C0182b.m813a((android.content.Context) r10, (android.support.p006v4.p012d.C0182b.C0188b[]) r12, (android.os.CancellationSignal) r11)
            java.lang.Object r1 = r9.m1190c()
            r0 = 0
            int r8 = r12.length
            r2 = 0
            r6 = r2
        L_0x0085:
            if (r6 >= r8) goto L_0x00b9
            r5 = r12[r6]
            android.net.Uri r2 = r5.mo775a()
            java.lang.Object r2 = r7.get(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            if (r2 != 0) goto L_0x0099
        L_0x0095:
            int r2 = r6 + 1
            r6 = r2
            goto L_0x0085
        L_0x0099:
            int r3 = r5.mo776b()
            int r4 = r5.mo777c()
            boolean r0 = r5.mo778d()
            if (r0 == 0) goto L_0x00b5
            r5 = 1
        L_0x00a8:
            r0 = r9
            boolean r0 = r0.m1187a((java.lang.Object) r1, (java.nio.ByteBuffer) r2, (int) r3, (int) r4, (int) r5)
            if (r0 != 0) goto L_0x00b7
            r9.m1191c((java.lang.Object) r1)
            r0 = 0
            goto L_0x0005
        L_0x00b5:
            r5 = 0
            goto L_0x00a8
        L_0x00b7:
            r0 = 1
            goto L_0x0095
        L_0x00b9:
            if (r0 != 0) goto L_0x00c1
            r9.m1191c((java.lang.Object) r1)
            r0 = 0
            goto L_0x0005
        L_0x00c1:
            boolean r0 = r9.m1189b((java.lang.Object) r1)
            if (r0 != 0) goto L_0x00ca
            r0 = 0
            goto L_0x0005
        L_0x00ca:
            android.graphics.Typeface r0 = r9.mo1151a((java.lang.Object) r1)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r13)
            goto L_0x0005
        L_0x00d4:
            r0 = move-exception
            r1 = r0
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.graphics.C0279f.mo1102a(android.content.Context, android.os.CancellationSignal, android.support.v4.d.b$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo1149a(Context context, C0071c.C0073b bVar, Resources resources, int i) {
        if (!m1188b()) {
            return super.mo1149a(context, bVar, resources, i);
        }
        Object c = m1190c();
        for (C0071c.C0074c cVar : bVar.mo244a()) {
            if (!m1186a(context, c, cVar.mo245a(), cVar.mo249e(), cVar.mo246b(), cVar.mo247c() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo248d()))) {
                m1191c(c);
                return null;
            }
        }
        if (!m1189b(c)) {
            return null;
        }
        return mo1151a(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1151a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f799a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f805g.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class mo1152a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Constructor mo1153a(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo1154b(Class cls) {
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo1155c(Class cls) {
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo1156d(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Method mo1157e(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo1158f(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
