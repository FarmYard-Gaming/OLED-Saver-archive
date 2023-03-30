package android.support.p006v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.p006v4.p007a.p008a.C0071c;
import android.support.p006v4.p012d.C0182b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: android.support.v4.graphics.h */
class C0281h {

    /* renamed from: android.support.v4.graphics.h$a */
    private interface C0284a<T> {
        /* renamed from: a */
        boolean mo1162a(T t);

        /* renamed from: b */
        int mo1163b(T t);
    }

    C0281h() {
    }

    /* renamed from: a */
    private C0071c.C0074c m1205a(C0071c.C0073b bVar, int i) {
        return (C0071c.C0074c) m1206a(bVar.mo244a(), i, new C0284a<C0071c.C0074c>() {
            /* renamed from: a */
            public int mo1163b(C0071c.C0074c cVar) {
                return cVar.mo246b();
            }

            /* renamed from: b */
            public boolean mo1162a(C0071c.C0074c cVar) {
                return cVar.mo247c();
            }
        });
    }

    /* renamed from: a */
    private static <T> T m1206a(T[] tArr, int i, C0284a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (aVar.mo1162a(t2) == z ? 0 : 1) + (Math.abs(aVar.mo1163b(t2) - i2) * 2);
            if (t == null || i3 > abs) {
                i3 = abs;
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo1150a(Context context, Resources resources, int i, String str, int i2) {
        Typeface typeface = null;
        File a = C0285i.m1222a(context);
        if (a != null) {
            try {
                if (C0285i.m1227a(a, resources, i)) {
                    typeface = Typeface.createFromFile(a.getPath());
                    a.delete();
                }
            } catch (RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }

    /* renamed from: a */
    public Typeface mo1102a(Context context, CancellationSignal cancellationSignal, C0182b.C0188b[] bVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        Typeface typeface = null;
        if (bVarArr.length >= 1) {
            try {
                inputStream2 = context.getContentResolver().openInputStream(mo1160a(bVarArr, i).mo775a());
                try {
                    typeface = mo1159a(context, inputStream2);
                    C0285i.m1226a((Closeable) inputStream2);
                } catch (IOException e) {
                    C0285i.m1226a((Closeable) inputStream2);
                    return typeface;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    C0285i.m1226a((Closeable) inputStream);
                    throw th;
                }
            } catch (IOException e2) {
                inputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                C0285i.m1226a((Closeable) inputStream);
                throw th;
            }
        }
        return typeface;
    }

    /* renamed from: a */
    public Typeface mo1149a(Context context, C0071c.C0073b bVar, Resources resources, int i) {
        C0071c.C0074c a = m1205a(bVar, i);
        if (a == null) {
            return null;
        }
        return C0268c.m1138a(context, resources, a.mo250f(), a.mo245a(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1159a(Context context, InputStream inputStream) {
        Typeface typeface = null;
        File a = C0285i.m1222a(context);
        if (a != null) {
            try {
                if (C0285i.m1228a(a, inputStream)) {
                    typeface = Typeface.createFromFile(a.getPath());
                    a.delete();
                }
            } catch (RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0182b.C0188b mo1160a(C0182b.C0188b[] bVarArr, int i) {
        return (C0182b.C0188b) m1206a(bVarArr, i, new C0284a<C0182b.C0188b>() {
            /* renamed from: a */
            public int mo1163b(C0182b.C0188b bVar) {
                return bVar.mo777c();
            }

            /* renamed from: b */
            public boolean mo1162a(C0182b.C0188b bVar) {
                return bVar.mo778d();
            }
        });
    }
}
