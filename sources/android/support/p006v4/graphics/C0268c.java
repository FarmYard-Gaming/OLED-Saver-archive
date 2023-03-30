package android.support.p006v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.p006v4.p007a.p008a.C0071c;
import android.support.p006v4.p007a.p008a.C0079f;
import android.support.p006v4.p012d.C0182b;
import android.support.p006v4.p014f.C0207g;

/* renamed from: android.support.v4.graphics.c */
public class C0268c {

    /* renamed from: a */
    private static final C0281h f767a;

    /* renamed from: b */
    private static final C0207g<String, Typeface> f768b = new C0207g<>(16);

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            f767a = new C0280g();
        } else if (Build.VERSION.SDK_INT >= 26) {
            f767a = new C0279f();
        } else if (Build.VERSION.SDK_INT >= 24 && C0278e.m1181a()) {
            f767a = new C0278e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f767a = new C0269d();
        } else {
            f767a = new C0281h();
        }
    }

    /* renamed from: a */
    public static Typeface m1138a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f767a.mo1150a(context, resources, i, str, i2);
        if (a != null) {
            f768b.mo862a(m1142b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m1139a(Context context, CancellationSignal cancellationSignal, C0182b.C0188b[] bVarArr, int i) {
        return f767a.mo1102a(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m1140a(Context context, C0071c.C0072a aVar, Resources resources, int i, int i2, C0079f.C0080a aVar2, Handler handler, boolean z) {
        Typeface a;
        boolean z2 = true;
        if (aVar instanceof C0071c.C0075d) {
            C0071c.C0075d dVar = (C0071c.C0075d) aVar;
            if (z) {
                if (dVar.mo252b() != 0) {
                    z2 = false;
                }
            } else if (aVar2 != null) {
                z2 = false;
            }
            a = C0182b.m808a(context, dVar.mo251a(), aVar2, handler, z2, z ? dVar.mo253c() : -1, i2);
        } else {
            a = f767a.mo1149a(context, (C0071c.C0073b) aVar, resources, i2);
            if (aVar2 != null) {
                if (a != null) {
                    aVar2.mo257a(a, handler);
                } else {
                    aVar2.mo255a(-3, handler);
                }
            }
        }
        if (a != null) {
            f768b.mo862a(m1142b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m1141a(Resources resources, int i, int i2) {
        return f768b.mo861a(m1142b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m1142b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
