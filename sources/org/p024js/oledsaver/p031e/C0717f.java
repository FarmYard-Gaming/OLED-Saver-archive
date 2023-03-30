package org.p024js.oledsaver.p031e;

/* renamed from: org.js.oledsaver.e.f */
public class C0717f {
    /* renamed from: a */
    public static <T> T m3473a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m3474a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m3475a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static float[] m3476a(float[] fArr, float f, float f2, String str) {
        m3474a(fArr, (Object) str + " must not be null");
        int i = 0;
        while (i < fArr.length) {
            float f3 = fArr[i];
            if (Float.isNaN(f3)) {
                throw new IllegalArgumentException(str + "[" + i + "] must not be NaN");
            } else if (f3 < f) {
                throw new IllegalArgumentException(String.format("%s[%d] is out of range of [%f, %f] (too low)", new Object[]{str, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)}));
            } else if (f3 > f2) {
                throw new IllegalArgumentException(String.format("%s[%d] is out of range of [%f, %f] (too high)", new Object[]{str, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)}));
            } else {
                i++;
            }
        }
        return fArr;
    }

    /* renamed from: a */
    public static int[] m3477a(int[] iArr, int i, int i2, String str) {
        m3474a(iArr, (Object) str + " must not be null");
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 < i) {
                throw new IllegalArgumentException(String.format("%s[%d] is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2)}));
            } else if (i4 > i2) {
                throw new IllegalArgumentException(String.format("%s[%d] is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2)}));
            } else {
                i3++;
            }
        }
        return iArr;
    }
}
