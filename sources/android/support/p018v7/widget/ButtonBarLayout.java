package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1761a;

    /* renamed from: b */
    private int f1762b = -1;

    /* renamed from: c */
    private int f1763c = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0353a.C0363j.ButtonBarLayout);
        this.f1761a = obtainStyledAttributes.getBoolean(C0353a.C0363j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m2482a(int i) {
        int childCount = getChildCount();
        for (int i2 = i; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m2483a() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0353a.C0359f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.f1763c, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        if (this.f1761a) {
            if (size > this.f1762b && m2483a()) {
                setStacked(false);
            }
            this.f1762b = size;
        }
        if (m2483a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1761a && !m2483a()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m2482a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i4 = layoutParams.bottomMargin + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + 0;
            if (m2483a()) {
                int a2 = m2482a(a + 1);
                if (a2 >= 0) {
                    i4 += getChildAt(a2).getPaddingTop() + ((int) (16.0f * getResources().getDisplayMetrics().density));
                }
            } else {
                i4 += getPaddingBottom();
            }
        } else {
            i4 = 0;
        }
        if (C0249q.m1061c(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1761a != z) {
            this.f1761a = z;
            if (!this.f1761a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
