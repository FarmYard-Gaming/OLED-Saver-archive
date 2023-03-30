package org.p024js.oledsaver.p031e;

/* renamed from: org.js.oledsaver.e.k */
public abstract class C0722k {

    /* renamed from: org.js.oledsaver.e.k$a */
    public static class C0723a extends C0722k {

        /* renamed from: a */
        private final float[] f2618a;

        /* renamed from: b */
        private final float[] f2619b;

        /* renamed from: c */
        private final float[] f2620c;

        public C0723a(float[] fArr, float[] fArr2) {
            if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
                throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
            }
            int length = fArr.length;
            this.f2620c = new float[(length - 1)];
            for (int i = 0; i < length - 1; i++) {
                this.f2620c[i] = (fArr2[i + 1] - fArr2[i]) / (fArr[i + 1] - fArr[i]);
            }
            this.f2618a = fArr;
            this.f2619b = fArr2;
        }

        /* renamed from: a */
        public float mo3532a(float f) {
            int i = 0;
            int length = this.f2618a.length;
            if (Float.isNaN(f)) {
                return f;
            }
            if (f <= this.f2618a[0]) {
                return this.f2619b[0];
            }
            if (f >= this.f2618a[length - 1]) {
                return this.f2619b[length - 1];
            }
            while (f >= this.f2618a[i + 1]) {
                i++;
                if (f == this.f2618a[i]) {
                    return this.f2619b[i];
                }
            }
            return this.f2619b[i] + ((f - this.f2618a[i]) * this.f2620c[i]);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int length = this.f2618a.length;
            sb.append("LinearSpline{[");
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append("(").append(this.f2618a[i]);
                sb.append(", ").append(this.f2619b[i]);
                if (i < length - 1) {
                    sb.append(": ").append(this.f2620c[i]);
                }
                sb.append(")");
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    /* renamed from: org.js.oledsaver.e.k$b */
    public static class C0724b extends C0722k {

        /* renamed from: a */
        private float[] f2621a;

        /* renamed from: b */
        private float[] f2622b;

        /* renamed from: c */
        private float[] f2623c;

        public C0724b(float[] fArr, float[] fArr2) {
            if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
                throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
            }
            int length = fArr.length;
            float[] fArr3 = new float[(length - 1)];
            float[] fArr4 = new float[length];
            for (int i = 0; i < length - 1; i++) {
                float f = fArr[i + 1] - fArr[i];
                if (f <= 0.0f) {
                    throw new IllegalArgumentException("The control points must all have strictly increasing X values.");
                }
                fArr3[i] = (fArr2[i + 1] - fArr2[i]) / f;
            }
            fArr4[0] = fArr3[0];
            for (int i2 = 1; i2 < length - 1; i2++) {
                fArr4[i2] = (fArr3[i2 - 1] + fArr3[i2]) * 0.5f;
            }
            fArr4[length - 1] = fArr3[length - 2];
            for (int i3 = 0; i3 < length - 1; i3++) {
                if (fArr3[i3] == 0.0f) {
                    fArr4[i3] = 0.0f;
                    fArr4[i3 + 1] = 0.0f;
                } else {
                    float f2 = fArr4[i3] / fArr3[i3];
                    float f3 = fArr4[i3 + 1] / fArr3[i3];
                    if (f2 < 0.0f || f3 < 0.0f) {
                        throw new IllegalArgumentException("The control points must have monotonic Y values.");
                    }
                    float hypot = (float) Math.hypot((double) f2, (double) f3);
                    if (hypot > 9.0f) {
                        float f4 = 3.0f / hypot;
                        fArr4[i3] = f2 * f4 * fArr3[i3];
                        fArr4[i3 + 1] = f3 * f4 * fArr3[i3];
                    }
                }
            }
            this.f2621a = fArr;
            this.f2622b = fArr2;
            this.f2623c = fArr4;
        }

        /* renamed from: a */
        public float mo3532a(float f) {
            int i = 0;
            int length = this.f2621a.length;
            if (Float.isNaN(f)) {
                return f;
            }
            if (f <= this.f2621a[0]) {
                return this.f2622b[0];
            }
            if (f >= this.f2621a[length - 1]) {
                return this.f2622b[length - 1];
            }
            while (f >= this.f2621a[i + 1]) {
                i++;
                if (f == this.f2621a[i]) {
                    return this.f2622b[i];
                }
            }
            float f2 = this.f2621a[i + 1] - this.f2621a[i];
            float f3 = (f - this.f2621a[i]) / f2;
            return (((this.f2622b[i] * ((2.0f * f3) + 1.0f)) + (this.f2623c[i] * f2 * f3)) * (1.0f - f3) * (1.0f - f3)) + (((this.f2623c[i + 1] * f2 * (f3 - 1.0f)) + (this.f2622b[i + 1] * (3.0f - (2.0f * f3)))) * f3 * f3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int length = this.f2621a.length;
            sb.append("MonotoneCubicSpline{[");
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append("(").append(this.f2621a[i]);
                sb.append(", ").append(this.f2622b[i]);
                sb.append(": ").append(this.f2623c[i]).append(")");
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static C0722k m3496a(float[] fArr, float[] fArr2) {
        if (m3497a(fArr)) {
            return m3499b(fArr2) ? m3498b(fArr, fArr2) : m3500c(fArr, fArr2);
        }
        throw new IllegalArgumentException("The control points must all have strictly increasing X values.");
    }

    /* renamed from: a */
    private static boolean m3497a(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            throw new IllegalArgumentException("There must be at least two control points.");
        }
        float f = fArr[0];
        int i = 1;
        while (i < fArr.length) {
            float f2 = fArr[i];
            if (f2 <= f) {
                return false;
            }
            i++;
            f = f2;
        }
        return true;
    }

    /* renamed from: b */
    public static C0722k m3498b(float[] fArr, float[] fArr2) {
        return new C0724b(fArr, fArr2);
    }

    /* renamed from: b */
    private static boolean m3499b(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            throw new IllegalArgumentException("There must be at least two control points.");
        }
        float f = fArr[0];
        int i = 1;
        while (i < fArr.length) {
            float f2 = fArr[i];
            if (f2 < f) {
                return false;
            }
            i++;
            f = f2;
        }
        return true;
    }

    /* renamed from: c */
    public static C0722k m3500c(float[] fArr, float[] fArr2) {
        return new C0723a(fArr, fArr2);
    }

    /* renamed from: a */
    public abstract float mo3532a(float f);
}
