package android.support.p006v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p006v4.p007a.p008a.C0071c;
import android.support.p006v4.p012d.C0182b;
import android.support.p006v4.p014f.C0216k;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: android.support.v4.graphics.e */
class C0278e extends C0281h {

    /* renamed from: a */
    private static final Class f795a;

    /* renamed from: b */
    private static final Constructor f796b;

    /* renamed from: c */
    private static final Method f797c;

    /* renamed from: d */
    private static final Method f798d;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method = null;
            method2 = null;
            constructor = null;
            cls = null;
        }
        f796b = constructor;
        f795a = cls;
        f797c = method2;
        f798d = method;
    }

    C0278e() {
    }

    /* renamed from: a */
    private static Typeface m1180a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f795a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f798d.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m1181a() {
        if (f797c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f797c != null;
    }

    /* renamed from: a */
    private static boolean m1182a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f797c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m1183b() {
        try {
            return f796b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo1102a(Context context, CancellationSignal cancellationSignal, C0182b.C0188b[] bVarArr, int i) {
        Object b = m1183b();
        C0216k kVar = new C0216k();
        for (C0182b.C0188b bVar : bVarArr) {
            Uri a = bVar.mo775a();
            ByteBuffer byteBuffer = (ByteBuffer) kVar.get(a);
            if (byteBuffer == null) {
                byteBuffer = C0285i.m1224a(context, cancellationSignal, a);
                kVar.put(a, byteBuffer);
            }
            if (!m1182a(b, byteBuffer, bVar.mo776b(), bVar.mo777c(), bVar.mo778d())) {
                return null;
            }
        }
        return Typeface.create(m1180a(b), i);
    }

    /* renamed from: a */
    public Typeface mo1149a(Context context, C0071c.C0073b bVar, Resources resources, int i) {
        Object b = m1183b();
        for (C0071c.C0074c cVar : bVar.mo244a()) {
            ByteBuffer a = C0285i.m1223a(context, resources, cVar.mo250f());
            if (a == null || !m1182a(b, a, cVar.mo249e(), cVar.mo246b(), cVar.mo247c())) {
                return null;
            }
        }
        return m1180a(b);
    }
}
