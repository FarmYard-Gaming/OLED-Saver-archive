package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p006v4.graphics.C0264a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.ap */
class C0570ap {

    /* renamed from: a */
    static final int[] f2072a = {-16842910};

    /* renamed from: b */
    static final int[] f2073b = {16842908};

    /* renamed from: c */
    static final int[] f2074c = {16843518};

    /* renamed from: d */
    static final int[] f2075d = {16842919};

    /* renamed from: e */
    static final int[] f2076e = {16842912};

    /* renamed from: f */
    static final int[] f2077f = {16842913};

    /* renamed from: g */
    static final int[] f2078g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f2079h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f2080i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f2081j = new int[1];

    /* renamed from: a */
    public static int m2807a(Context context, int i) {
        f2081j[0] = i;
        C0575au a = C0575au.m2818a(context, (AttributeSet) null, f2081j);
        try {
            return a.mo2961b(0, 0);
        } finally {
            a.mo2959a();
        }
    }

    /* renamed from: a */
    static int m2808a(Context context, int i, float f) {
        int a = m2807a(context, i);
        return C0264a.m1121b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    /* renamed from: a */
    private static TypedValue m2809a() {
        TypedValue typedValue = f2080i.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2080i.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static ColorStateList m2810b(Context context, int i) {
        f2081j[0] = i;
        C0575au a = C0575au.m2818a(context, (AttributeSet) null, f2081j);
        try {
            return a.mo2968e(0);
        } finally {
            a.mo2959a();
        }
    }

    /* renamed from: c */
    public static int m2811c(Context context, int i) {
        ColorStateList b = m2810b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f2072a, b.getDefaultColor());
        }
        TypedValue a = m2809a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m2808a(context, i, a.getFloat());
    }
}
