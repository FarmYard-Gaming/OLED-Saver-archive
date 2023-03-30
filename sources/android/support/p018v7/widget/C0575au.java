package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p007a.p008a.C0079f;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.au */
public class C0575au {

    /* renamed from: a */
    private final Context f2091a;

    /* renamed from: b */
    private final TypedArray f2092b;

    /* renamed from: c */
    private TypedValue f2093c;

    private C0575au(Context context, TypedArray typedArray) {
        this.f2091a = context;
        this.f2092b = typedArray;
    }

    /* renamed from: a */
    public static C0575au m2817a(Context context, int i, int[] iArr) {
        return new C0575au(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0575au m2818a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0575au(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0575au m2819a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0575au(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float mo2955a(int i, float f) {
        return this.f2092b.getFloat(i, f);
    }

    /* renamed from: a */
    public int mo2956a(int i, int i2) {
        return this.f2092b.getInt(i, i2);
    }

    /* renamed from: a */
    public Typeface mo2957a(int i, int i2, C0079f.C0080a aVar) {
        int resourceId = this.f2092b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2093c == null) {
            this.f2093c = new TypedValue();
        }
        return C0079f.m253a(this.f2091a, resourceId, this.f2093c, i2, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f2092b.getResourceId(r3, 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo2958a(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f2092b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f2092b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r1 = r2.f2091a
            android.graphics.drawable.Drawable r0 = android.support.p018v7.p020b.p021a.C0419a.m1949b(r1, r0)
        L_0x0017:
            return r0
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f2092b
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r3)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.widget.C0575au.mo2958a(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public void mo2959a() {
        this.f2092b.recycle();
    }

    /* renamed from: a */
    public boolean mo2960a(int i, boolean z) {
        return this.f2092b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo2961b(int i, int i2) {
        return this.f2092b.getColor(i, i2);
    }

    /* renamed from: b */
    public Drawable mo2962b(int i) {
        int resourceId;
        if (!this.f2092b.hasValue(i) || (resourceId = this.f2092b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0608k.m2988a().mo3087a(this.f2091a, resourceId, true);
    }

    /* renamed from: c */
    public int mo2963c(int i, int i2) {
        return this.f2092b.getInteger(i, i2);
    }

    /* renamed from: c */
    public CharSequence mo2964c(int i) {
        return this.f2092b.getText(i);
    }

    /* renamed from: d */
    public int mo2965d(int i, int i2) {
        return this.f2092b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public String mo2966d(int i) {
        return this.f2092b.getString(i);
    }

    /* renamed from: e */
    public int mo2967e(int i, int i2) {
        return this.f2092b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = android.support.p018v7.p020b.p021a.C0419a.m1946a(r2.f2091a, (r0 = r2.f2092b.getResourceId(r3, 0)));
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo2968e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f2092b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f2092b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f2091a
            android.content.res.ColorStateList r0 = android.support.p018v7.p020b.p021a.C0419a.m1946a(r1, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f2092b
            android.content.res.ColorStateList r0 = r0.getColorStateList(r3)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.widget.C0575au.mo2968e(int):android.content.res.ColorStateList");
    }

    /* renamed from: f */
    public int mo2969f(int i, int i2) {
        return this.f2092b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo2970f(int i) {
        return this.f2092b.getTextArray(i);
    }

    /* renamed from: g */
    public int mo2971g(int i, int i2) {
        return this.f2092b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean mo2972g(int i) {
        return this.f2092b.hasValue(i);
    }
}
