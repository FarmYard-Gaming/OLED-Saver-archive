package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p015g.C0235d;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v7.widget.ah */
public class C0548ah extends ViewGroup {

    /* renamed from: a */
    private boolean f1957a;

    /* renamed from: b */
    private int f1958b;

    /* renamed from: c */
    private int f1959c;

    /* renamed from: d */
    private int f1960d;

    /* renamed from: e */
    private int f1961e;

    /* renamed from: f */
    private int f1962f;

    /* renamed from: g */
    private float f1963g;

    /* renamed from: h */
    private boolean f1964h;

    /* renamed from: i */
    private int[] f1965i;

    /* renamed from: j */
    private int[] f1966j;

    /* renamed from: k */
    private Drawable f1967k;

    /* renamed from: l */
    private int f1968l;

    /* renamed from: m */
    private int f1969m;

    /* renamed from: n */
    private int f1970n;

    /* renamed from: o */
    private int f1971o;

    /* renamed from: android.support.v7.widget.ah$a */
    public static class C0549a extends ViewGroup.MarginLayoutParams {

        /* renamed from: g */
        public float f1972g;

        /* renamed from: h */
        public int f1973h;

        public C0549a(int i, int i2) {
            super(i, i2);
            this.f1973h = -1;
            this.f1972g = 0.0f;
        }

        public C0549a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1973h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0353a.C0363j.LinearLayoutCompat_Layout);
            this.f1972g = obtainStyledAttributes.getFloat(C0353a.C0363j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1973h = obtainStyledAttributes.getInt(C0353a.C0363j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0549a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1973h = -1;
        }
    }

    public C0548ah(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0548ah(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0548ah(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1957a = true;
        this.f1958b = -1;
        this.f1959c = 0;
        this.f1961e = 8388659;
        C0575au a = C0575au.m2819a(context, attributeSet, C0353a.C0363j.LinearLayoutCompat, i, 0);
        int a2 = a.mo2956a(C0353a.C0363j.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo2956a(C0353a.C0363j.LinearLayoutCompat_android_gravity, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo2960a(C0353a.C0363j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f1963g = a.mo2955a(C0353a.C0363j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1958b = a.mo2956a(C0353a.C0363j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1964h = a.mo2960a(C0353a.C0363j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo2958a(C0353a.C0363j.LinearLayoutCompat_divider));
        this.f1970n = a.mo2956a(C0353a.C0363j.LinearLayoutCompat_showDividers, 0);
        this.f1971o = a.mo2967e(C0353a.C0363j.LinearLayoutCompat_dividerPadding, 0);
        a.mo2959a();
    }

    /* renamed from: a */
    private void m2702a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    /* renamed from: c */
    private void m2703c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo2793b(i3);
            if (b.getVisibility() != 8) {
                C0549a aVar = (C0549a) b.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m2704d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo2793b(i3);
            if (b.getVisibility() != 8) {
                C0549a aVar = (C0549a) b.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2785a(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2786a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2787a(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        int max;
        int i7;
        int i8;
        boolean z4;
        float f2;
        this.f1962f = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z5 = true;
        float f3 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        int i13 = this.f1958b;
        boolean z8 = this.f1964h;
        int i14 = 0;
        int i15 = 0;
        while (i15 < virtualChildCount) {
            View b = mo2793b(i15);
            if (b == null) {
                this.f1962f += mo2799d(i15);
                i8 = i14;
                z4 = z7;
                f2 = f3;
                z3 = z5;
            } else if (b.getVisibility() == 8) {
                i15 += mo2786a(b, i15);
                i8 = i14;
                z4 = z7;
                f2 = f3;
                z3 = z5;
            } else {
                if (mo2798c(i15)) {
                    this.f1962f += this.f1969m;
                }
                C0549a aVar = (C0549a) b.getLayoutParams();
                float f4 = f3 + aVar.f1972g;
                if (mode2 == 1073741824 && aVar.height == 0 && aVar.f1972g > 0.0f) {
                    int i16 = this.f1962f;
                    this.f1962f = Math.max(i16, aVar.topMargin + i16 + aVar.bottomMargin);
                    z7 = true;
                } else {
                    int i17 = Integer.MIN_VALUE;
                    if (aVar.height == 0 && aVar.f1972g > 0.0f) {
                        i17 = 0;
                        aVar.height = -2;
                    }
                    int i18 = i17;
                    mo2791a(b, i15, i, 0, i2, f4 == 0.0f ? this.f1962f : 0);
                    if (i18 != Integer.MIN_VALUE) {
                        aVar.height = i18;
                    }
                    int measuredHeight = b.getMeasuredHeight();
                    int i19 = this.f1962f;
                    this.f1962f = Math.max(i19, i19 + measuredHeight + aVar.topMargin + aVar.bottomMargin + mo2792b(b));
                    if (z8) {
                        i14 = Math.max(measuredHeight, i14);
                    }
                }
                if (i13 >= 0 && i13 == i15 + 1) {
                    this.f1959c = this.f1962f;
                }
                if (i15 >= i13 || aVar.f1972g <= 0.0f) {
                    boolean z9 = false;
                    if (mode == 1073741824 || aVar.width != -1) {
                        z2 = z6;
                    } else {
                        z2 = true;
                        z9 = true;
                    }
                    int i20 = aVar.rightMargin + aVar.leftMargin;
                    int measuredWidth = b.getMeasuredWidth() + i20;
                    i9 = Math.max(i9, measuredWidth);
                    i10 = View.combineMeasuredStates(i10, b.getMeasuredState());
                    z3 = z5 && aVar.width == -1;
                    if (aVar.f1972g > 0.0f) {
                        i7 = Math.max(i12, z9 ? i20 : measuredWidth);
                        max = i11;
                    } else {
                        if (!z9) {
                            i20 = measuredWidth;
                        }
                        max = Math.max(i11, i20);
                        i7 = i12;
                    }
                    i15 += mo2786a(b, i15);
                    i8 = i14;
                    z4 = z7;
                    z6 = z2;
                    f2 = f4;
                    i12 = i7;
                    i11 = max;
                } else {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
            }
            i15++;
            i14 = i8;
            z7 = z4;
            f3 = f2;
            z5 = z3;
        }
        if (this.f1962f > 0 && mo2798c(virtualChildCount)) {
            this.f1962f += this.f1969m;
        }
        if (z8 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f1962f = 0;
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View b2 = mo2793b(i21);
                if (b2 == null) {
                    this.f1962f += mo2799d(i21);
                    i6 = i21;
                } else if (b2.getVisibility() == 8) {
                    i6 = mo2786a(b2, i21) + i21;
                } else {
                    C0549a aVar2 = (C0549a) b2.getLayoutParams();
                    int i22 = this.f1962f;
                    this.f1962f = Math.max(i22, aVar2.bottomMargin + i22 + i14 + aVar2.topMargin + mo2792b(b2));
                    i6 = i21;
                }
                i21 = i6 + 1;
            }
        }
        this.f1962f += getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(this.f1962f, getSuggestedMinimumHeight()), i2, 0);
        int i23 = (16777215 & resolveSizeAndState) - this.f1962f;
        if (z7 || (i23 != 0 && f3 > 0.0f)) {
            if (this.f1963g > 0.0f) {
                f3 = this.f1963g;
            }
            this.f1962f = 0;
            int i24 = 0;
            float f5 = f3;
            boolean z10 = z5;
            int i25 = i11;
            int i26 = i10;
            int i27 = i9;
            while (i24 < virtualChildCount) {
                View b3 = mo2793b(i24);
                if (b3.getVisibility() == 8) {
                    f = f5;
                    z = z10;
                } else {
                    C0549a aVar3 = (C0549a) b3.getLayoutParams();
                    float f6 = aVar3.f1972g;
                    if (f6 > 0.0f) {
                        int i28 = (int) ((((float) i23) * f6) / f5);
                        float f7 = f5 - f6;
                        i5 = i23 - i28;
                        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + aVar3.leftMargin + aVar3.rightMargin, aVar3.width);
                        if (aVar3.height == 0 && mode2 == 1073741824) {
                            if (i28 <= 0) {
                                i28 = 0;
                            }
                            b3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
                        } else {
                            int measuredHeight2 = i28 + b3.getMeasuredHeight();
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            b3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                        }
                        f = f7;
                        i26 = View.combineMeasuredStates(i26, b3.getMeasuredState() & -256);
                    } else {
                        f = f5;
                        i5 = i23;
                    }
                    int i29 = aVar3.leftMargin + aVar3.rightMargin;
                    int measuredWidth2 = b3.getMeasuredWidth() + i29;
                    i27 = Math.max(i27, measuredWidth2);
                    if (!(mode != 1073741824 && aVar3.width == -1)) {
                        i29 = measuredWidth2;
                    }
                    i25 = Math.max(i25, i29);
                    boolean z11 = z10 && aVar3.width == -1;
                    int i30 = this.f1962f;
                    this.f1962f = Math.max(i30, aVar3.bottomMargin + b3.getMeasuredHeight() + i30 + aVar3.topMargin + mo2792b(b3));
                    i23 = i5;
                    z = z11;
                }
                i24++;
                f5 = f;
                z10 = z;
            }
            this.f1962f += getPaddingTop() + getPaddingBottom();
            z5 = z10;
            i4 = i25;
            i10 = i26;
            i3 = i27;
        } else {
            int max2 = Math.max(i11, i12);
            if (z8 && mode2 != 1073741824) {
                int i31 = 0;
                while (true) {
                    int i32 = i31;
                    if (i32 >= virtualChildCount) {
                        break;
                    }
                    View b4 = mo2793b(i32);
                    if (!(b4 == null || b4.getVisibility() == 8 || ((C0549a) b4.getLayoutParams()).f1972g <= 0.0f)) {
                        b4.measure(View.MeasureSpec.makeMeasureSpec(b4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                    }
                    i31 = i32 + 1;
                }
            }
            i4 = max2;
            i3 = i9;
        }
        if (z5 || mode == 1073741824) {
            i4 = i3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i4 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i10), resolveSizeAndState);
        if (z6) {
            m2703c(virtualChildCount, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2788a(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f1961e & 112;
        int i9 = this.f1961e & 8388615;
        switch (i8) {
            case 16:
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f1962f) / 2);
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - this.f1962f;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        int i10 = 0;
        int i11 = paddingTop;
        while (i10 < virtualChildCount) {
            View b = mo2793b(i10);
            if (b == null) {
                i11 += mo2799d(i10);
                i5 = i10;
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C0549a aVar = (C0549a) b.getLayoutParams();
                int i12 = aVar.f1973h;
                if (i12 < 0) {
                    i12 = i9;
                }
                switch (C0235d.m1006a(i12, C0249q.m1059b(this)) & 7) {
                    case 1:
                        i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + aVar.leftMargin) - aVar.rightMargin;
                        break;
                    case 5:
                        i6 = (paddingRight - measuredWidth) - aVar.rightMargin;
                        break;
                    default:
                        i6 = paddingLeft + aVar.leftMargin;
                        break;
                }
                int i13 = (mo2798c(i10) ? this.f1969m + i11 : i11) + aVar.topMargin;
                m2702a(b, i6, i13 + mo2785a(b), measuredWidth, measuredHeight);
                i11 = i13 + aVar.bottomMargin + measuredHeight + mo2792b(b);
                i5 = mo2786a(b, i10) + i10;
            } else {
                i5 = i10;
            }
            i10 = i5 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2789a(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View b = mo2793b(i);
            if (!(b == null || b.getVisibility() == 8 || !mo2798c(i))) {
                mo2790a(canvas, (b.getTop() - ((C0549a) b.getLayoutParams()).topMargin) - this.f1969m);
            }
        }
        if (mo2798c(virtualChildCount)) {
            View b2 = mo2793b(virtualChildCount - 1);
            if (b2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f1969m;
            } else {
                bottom = ((C0549a) b2.getLayoutParams()).bottomMargin + b2.getBottom();
            }
            mo2790a(canvas, bottom);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2790a(Canvas canvas, int i) {
        this.f1967k.setBounds(getPaddingLeft() + this.f1971o, i, (getWidth() - getPaddingRight()) - this.f1971o, this.f1969m + i);
        this.f1967k.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2791a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo2792b(View view) {
        return 0;
    }

    /* renamed from: b */
    public C0549a generateLayoutParams(AttributeSet attributeSet) {
        return new C0549a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0549a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0549a(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo2793b(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2794b(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        boolean z;
        int i6;
        float f2;
        int baseline;
        int i7;
        boolean z2;
        boolean z3;
        int max;
        int i8;
        int i9;
        boolean z4;
        float f3;
        int baseline2;
        this.f1962f = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z5 = true;
        float f4 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        if (this.f1965i == null || this.f1966j == null) {
            this.f1965i = new int[4];
            this.f1966j = new int[4];
        }
        int[] iArr = this.f1965i;
        int[] iArr2 = this.f1966j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z8 = this.f1957a;
        boolean z9 = this.f1964h;
        boolean z10 = mode == 1073741824;
        int i14 = 0;
        int i15 = 0;
        while (i15 < virtualChildCount) {
            View b = mo2793b(i15);
            if (b == null) {
                this.f1962f += mo2799d(i15);
                i9 = i14;
                z4 = z7;
                f3 = f4;
                z3 = z5;
            } else if (b.getVisibility() == 8) {
                i15 += mo2786a(b, i15);
                i9 = i14;
                z4 = z7;
                f3 = f4;
                z3 = z5;
            } else {
                if (mo2798c(i15)) {
                    this.f1962f += this.f1968l;
                }
                C0549a aVar = (C0549a) b.getLayoutParams();
                float f5 = f4 + aVar.f1972g;
                if (mode == 1073741824 && aVar.width == 0 && aVar.f1972g > 0.0f) {
                    if (z10) {
                        this.f1962f += aVar.leftMargin + aVar.rightMargin;
                    } else {
                        int i16 = this.f1962f;
                        this.f1962f = Math.max(i16, aVar.leftMargin + i16 + aVar.rightMargin);
                    }
                    if (z8) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        b.measure(makeMeasureSpec, makeMeasureSpec);
                    } else {
                        z7 = true;
                    }
                } else {
                    int i17 = Integer.MIN_VALUE;
                    if (aVar.width == 0 && aVar.f1972g > 0.0f) {
                        i17 = 0;
                        aVar.width = -2;
                    }
                    int i18 = i17;
                    mo2791a(b, i15, i, f5 == 0.0f ? this.f1962f : 0, i2, 0);
                    if (i18 != Integer.MIN_VALUE) {
                        aVar.width = i18;
                    }
                    int measuredWidth = b.getMeasuredWidth();
                    if (z10) {
                        this.f1962f += aVar.leftMargin + measuredWidth + aVar.rightMargin + mo2792b(b);
                    } else {
                        int i19 = this.f1962f;
                        this.f1962f = Math.max(i19, i19 + measuredWidth + aVar.leftMargin + aVar.rightMargin + mo2792b(b));
                    }
                    if (z9) {
                        i14 = Math.max(measuredWidth, i14);
                    }
                }
                boolean z11 = false;
                if (mode2 == 1073741824 || aVar.height != -1) {
                    z2 = z6;
                } else {
                    z2 = true;
                    z11 = true;
                }
                int i20 = aVar.bottomMargin + aVar.topMargin;
                int measuredHeight = b.getMeasuredHeight() + i20;
                i11 = View.combineMeasuredStates(i11, b.getMeasuredState());
                if (z8 && (baseline2 = b.getBaseline()) != -1) {
                    int i21 = ((((aVar.f1973h < 0 ? this.f1961e : aVar.f1973h) & 112) >> 4) & -2) >> 1;
                    iArr[i21] = Math.max(iArr[i21], baseline2);
                    iArr2[i21] = Math.max(iArr2[i21], measuredHeight - baseline2);
                }
                i10 = Math.max(i10, measuredHeight);
                z3 = z5 && aVar.height == -1;
                if (aVar.f1972g > 0.0f) {
                    i8 = Math.max(i13, z11 ? i20 : measuredHeight);
                    max = i12;
                } else {
                    if (!z11) {
                        i20 = measuredHeight;
                    }
                    max = Math.max(i12, i20);
                    i8 = i13;
                }
                i15 += mo2786a(b, i15);
                i9 = i14;
                z4 = z7;
                z6 = z2;
                f3 = f5;
                i13 = i8;
                i12 = max;
            }
            i15++;
            i14 = i9;
            z7 = z4;
            f4 = f3;
            z5 = z3;
        }
        if (this.f1962f > 0 && mo2798c(virtualChildCount)) {
            this.f1962f += this.f1968l;
        }
        int max2 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i10 : Math.max(i10, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z9 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f1962f = 0;
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View b2 = mo2793b(i22);
                if (b2 == null) {
                    this.f1962f += mo2799d(i22);
                    i7 = i22;
                } else if (b2.getVisibility() == 8) {
                    i7 = mo2786a(b2, i22) + i22;
                } else {
                    C0549a aVar2 = (C0549a) b2.getLayoutParams();
                    if (z10) {
                        this.f1962f = aVar2.rightMargin + aVar2.leftMargin + i14 + mo2792b(b2) + this.f1962f;
                        i7 = i22;
                    } else {
                        int i23 = this.f1962f;
                        this.f1962f = Math.max(i23, aVar2.rightMargin + i23 + i14 + aVar2.leftMargin + mo2792b(b2));
                        i7 = i22;
                    }
                }
                i22 = i7 + 1;
            }
        }
        this.f1962f += getPaddingLeft() + getPaddingRight();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(this.f1962f, getSuggestedMinimumWidth()), i, 0);
        int i24 = (16777215 & resolveSizeAndState) - this.f1962f;
        if (z7 || (i24 != 0 && f4 > 0.0f)) {
            if (this.f1963g > 0.0f) {
                f4 = this.f1963g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            int i25 = -1;
            this.f1962f = 0;
            int i26 = 0;
            float f6 = f4;
            boolean z12 = z5;
            int i27 = i12;
            int i28 = i11;
            while (i26 < virtualChildCount) {
                View b3 = mo2793b(i26);
                if (b3 == null) {
                    f = f6;
                    i5 = i24;
                    z = z12;
                    i6 = i25;
                } else if (b3.getVisibility() == 8) {
                    f = f6;
                    i5 = i24;
                    z = z12;
                    i6 = i25;
                } else {
                    C0549a aVar3 = (C0549a) b3.getLayoutParams();
                    float f7 = aVar3.f1972g;
                    if (f7 > 0.0f) {
                        int i29 = (int) ((((float) i24) * f7) / f6);
                        f2 = f6 - f7;
                        i24 -= i29;
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + aVar3.topMargin + aVar3.bottomMargin, aVar3.height);
                        if (aVar3.width == 0 && mode == 1073741824) {
                            if (i29 <= 0) {
                                i29 = 0;
                            }
                            b3.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), childMeasureSpec);
                        } else {
                            int measuredWidth2 = i29 + b3.getMeasuredWidth();
                            if (measuredWidth2 < 0) {
                                measuredWidth2 = 0;
                            }
                            b3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), childMeasureSpec);
                        }
                        i28 = View.combineMeasuredStates(i28, b3.getMeasuredState() & -16777216);
                    } else {
                        f2 = f6;
                    }
                    if (z10) {
                        this.f1962f += b3.getMeasuredWidth() + aVar3.leftMargin + aVar3.rightMargin + mo2792b(b3);
                    } else {
                        int i30 = this.f1962f;
                        this.f1962f = Math.max(i30, b3.getMeasuredWidth() + i30 + aVar3.leftMargin + aVar3.rightMargin + mo2792b(b3));
                    }
                    boolean z13 = mode2 != 1073741824 && aVar3.height == -1;
                    int i31 = aVar3.topMargin + aVar3.bottomMargin;
                    int measuredHeight2 = b3.getMeasuredHeight() + i31;
                    i6 = Math.max(i25, measuredHeight2);
                    i27 = Math.max(i27, z13 ? i31 : measuredHeight2);
                    boolean z14 = z12 && aVar3.height == -1;
                    if (z8 && (baseline = b3.getBaseline()) != -1) {
                        int i32 = ((((aVar3.f1973h < 0 ? this.f1961e : aVar3.f1973h) & 112) >> 4) & -2) >> 1;
                        iArr[i32] = Math.max(iArr[i32], baseline);
                        iArr2[i32] = Math.max(iArr2[i32], measuredHeight2 - baseline);
                    }
                    f = f2;
                    i5 = i24;
                    z = z14;
                }
                i26++;
                f6 = f;
                i24 = i5;
                z12 = z;
                i25 = i6;
            }
            this.f1962f += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i25 = Math.max(i25, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            z5 = z12;
            i4 = i27;
            i11 = i28;
            i3 = i25;
        } else {
            int max3 = Math.max(i12, i13);
            if (z9 && mode != 1073741824) {
                int i33 = 0;
                while (true) {
                    int i34 = i33;
                    if (i34 >= virtualChildCount) {
                        break;
                    }
                    View b4 = mo2793b(i34);
                    if (!(b4 == null || b4.getVisibility() == 8 || ((C0549a) b4.getLayoutParams()).f1972g <= 0.0f)) {
                        b4.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(b4.getMeasuredHeight(), 1073741824));
                    }
                    i33 = i34 + 1;
                }
            }
            i4 = max3;
            i3 = max2;
        }
        if (z5 || mode2 == 1073741824) {
            i4 = i3;
        }
        setMeasuredDimension((-16777216 & i11) | resolveSizeAndState, View.resolveSizeAndState(Math.max(i4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i11 << 16));
        if (z6) {
            m2704d(virtualChildCount, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2795b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a = C0586ba.m2902a(this);
        int paddingTop = getPaddingTop();
        int i9 = i4 - i2;
        int paddingBottom = i9 - getPaddingBottom();
        int paddingBottom2 = (i9 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f1961e & 112;
        boolean z = this.f1957a;
        int[] iArr = this.f1965i;
        int[] iArr2 = this.f1966j;
        switch (C0235d.m1006a(this.f1961e & 8388615, C0249q.m1059b(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f1962f) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f1962f;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (a) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i11 = 0;
        while (i11 < virtualChildCount) {
            int i12 = i6 + (i5 * i11);
            View b = mo2793b(i12);
            if (b == null) {
                paddingLeft += mo2799d(i12);
                i7 = i11;
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C0549a aVar = (C0549a) b.getLayoutParams();
                int baseline = (!z || aVar.height == -1) ? -1 : b.getBaseline();
                int i13 = aVar.f1973h;
                if (i13 < 0) {
                    i13 = i10;
                }
                switch (i13 & 112) {
                    case 16:
                        i8 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + aVar.topMargin) - aVar.bottomMargin;
                        break;
                    case 48:
                        i8 = paddingTop + aVar.topMargin;
                        if (baseline != -1) {
                            i8 += iArr[1] - baseline;
                            break;
                        }
                        break;
                    case 80:
                        i8 = (paddingBottom - measuredHeight) - aVar.bottomMargin;
                        if (baseline != -1) {
                            i8 -= iArr2[2] - (b.getMeasuredHeight() - baseline);
                            break;
                        }
                        break;
                    default:
                        i8 = paddingTop;
                        break;
                }
                int i14 = (mo2798c(i12) ? this.f1968l + paddingLeft : paddingLeft) + aVar.leftMargin;
                m2702a(b, i14 + mo2785a(b), i8, measuredWidth, measuredHeight);
                paddingLeft = i14 + aVar.rightMargin + measuredWidth + mo2792b(b);
                i7 = mo2786a(b, i12) + i11;
            } else {
                i7 = i11;
            }
            i11 = i7 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2796b(Canvas canvas) {
        int left;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0586ba.m2902a(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View b = mo2793b(i);
            if (!(b == null || b.getVisibility() == 8 || !mo2798c(i))) {
                C0549a aVar = (C0549a) b.getLayoutParams();
                mo2797b(canvas, a ? aVar.rightMargin + b.getRight() : (b.getLeft() - aVar.leftMargin) - this.f1968l);
            }
        }
        if (mo2798c(virtualChildCount)) {
            View b2 = mo2793b(virtualChildCount - 1);
            if (b2 == null) {
                left = a ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.f1968l;
            } else {
                C0549a aVar2 = (C0549a) b2.getLayoutParams();
                left = a ? (b2.getLeft() - aVar2.leftMargin) - this.f1968l : aVar2.rightMargin + b2.getRight();
            }
            mo2797b(canvas, left);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2797b(Canvas canvas, int i) {
        this.f1967k.setBounds(i, getPaddingTop() + this.f1971o, this.f1968l + i, (getHeight() - getPaddingBottom()) - this.f1971o);
        this.f1967k.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2798c(int i) {
        if (i == 0) {
            return (this.f1970n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1970n & 4) != 0;
        }
        if ((this.f1970n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0549a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo2799d(int i) {
        return 0;
    }

    public int getBaseline() {
        int i;
        int i2;
        if (this.f1958b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f1958b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f1958b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i3 = this.f1959c;
            if (this.f1960d == 1 && (i2 = this.f1961e & 112) != 48) {
                switch (i2) {
                    case 16:
                        i = i3 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1962f) / 2);
                        break;
                    case 80:
                        i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1962f;
                        break;
                }
            }
            i = i3;
            return ((C0549a) childAt.getLayoutParams()).topMargin + i + baseline;
        } else if (this.f1958b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1958b;
    }

    public Drawable getDividerDrawable() {
        return this.f1967k;
    }

    public int getDividerPadding() {
        return this.f1971o;
    }

    public int getDividerWidth() {
        return this.f1968l;
    }

    public int getGravity() {
        return this.f1961e;
    }

    public int getOrientation() {
        return this.f1960d;
    }

    public int getShowDividers() {
        return this.f1970n;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1963g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0549a generateDefaultLayoutParams() {
        if (this.f1960d == 0) {
            return new C0549a(-2, -2);
        }
        if (this.f1960d == 1) {
            return new C0549a(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f1967k != null) {
            if (this.f1960d == 1) {
                mo2789a(canvas);
            } else {
                mo2796b(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0548ah.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0548ah.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1960d == 1) {
            mo2788a(i, i2, i3, i4);
        } else {
            mo2795b(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1960d == 1) {
            mo2787a(i, i2);
        } else {
            mo2794b(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f1957a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1958b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.f1967k) {
            this.f1967k = drawable;
            if (drawable != null) {
                this.f1968l = drawable.getIntrinsicWidth();
                this.f1969m = drawable.getIntrinsicHeight();
            } else {
                this.f1968l = 0;
                this.f1969m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1971o = i;
    }

    public void setGravity(int i) {
        if (this.f1961e != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1961e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.f1961e & 8388615) != i2) {
            this.f1961e = i2 | (this.f1961e & -8388616);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1964h = z;
    }

    public void setOrientation(int i) {
        if (this.f1960d != i) {
            this.f1960d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1970n) {
            requestLayout();
        }
        this.f1970n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.f1961e & 112) != i2) {
            this.f1961e = i2 | (this.f1961e & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1963g = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
