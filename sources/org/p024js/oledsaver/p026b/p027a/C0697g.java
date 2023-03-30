package org.p024js.oledsaver.p026b.p027a;

/* renamed from: org.js.oledsaver.b.a.g */
final class C0697g {

    /* renamed from: a */
    private final float[] f2567a;

    /* renamed from: b */
    private final float[] f2568b;

    /* renamed from: c */
    private final float[] f2569c;

    public C0697g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (iArr.length == iArr2.length && iArr2.length == iArr3.length + 1) {
            this.f2567a = m3417a(iArr, 1000.0f);
            this.f2568b = m3417a(iArr2, 1000.0f);
            this.f2569c = m3417a(iArr3, 1.0f);
            return;
        }
        throw new IllegalArgumentException("Mismatch between hysteresis array lengths.");
    }

    /* renamed from: a */
    private float m3416a(float f, float[] fArr) {
        int i = 0;
        while (this.f2569c.length > i && f >= this.f2569c[i]) {
            i++;
        }
        return fArr[i];
    }

    /* renamed from: a */
    private float[] m3417a(int[] iArr, float f) {
        float[] fArr = new float[iArr.length];
        for (int i = 0; fArr.length > i; i++) {
            fArr[i] = ((float) iArr[i]) / f;
        }
        return fArr;
    }

    /* renamed from: a */
    public float mo3483a(float f) {
        return (m3416a(f, this.f2567a) + 1.0f) * f;
    }

    /* renamed from: b */
    public float mo3484b(float f) {
        return (1.0f - m3416a(f, this.f2568b)) * f;
    }
}
