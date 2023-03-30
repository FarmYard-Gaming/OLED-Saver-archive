package android.support.p006v4.graphics;

import android.graphics.Color;

/* renamed from: android.support.v4.graphics.a */
public final class C0264a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f762a = new ThreadLocal<>();

    /* renamed from: a */
    public static int m1119a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int c = m1122c(alpha2, alpha);
        return Color.argb(c, m1120a(Color.red(i), alpha2, Color.red(i2), alpha, c), m1120a(Color.green(i), alpha2, Color.green(i2), alpha, c), m1120a(Color.blue(i), alpha2, Color.blue(i2), alpha, c));
    }

    /* renamed from: a */
    private static int m1120a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: b */
    public static int m1121b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (16777215 & i) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: c */
    private static int m1122c(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }
}
