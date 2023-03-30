package android.support.p006v4.p007a.p008a;

import java.lang.reflect.Array;

/* renamed from: android.support.v4.a.a.e */
final class C0078e {

    /* renamed from: a */
    static final /* synthetic */ boolean f192a = (!C0078e.class.desiredAssertionStatus());

    private C0078e() {
    }

    /* renamed from: a */
    public static int m250a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static int[] m251a(int[] iArr, int i, int i2) {
        if (f192a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[m250a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static <T> T[] m252a(T[] tArr, int i, T t) {
        T[] tArr2;
        if (f192a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m250a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
            } else {
                tArr2 = tArr;
            }
            tArr2[i] = t;
            return tArr2;
        }
        throw new AssertionError();
    }
}
