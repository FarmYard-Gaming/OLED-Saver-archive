package android.support.p018v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p015g.C0235d;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.widget.C0548ah;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.AlertDialogLayout */
public class AlertDialogLayout extends C0548ah {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m2478a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    /* renamed from: c */
    private static int m2479c(View view) {
        int c = C0249q.m1061c(view);
        if (c > 0) {
            return c;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m2479c(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* renamed from: c */
    private boolean m2480c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view = null;
        View view2 = null;
        View view3 = null;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C0353a.C0359f.topPanel) {
                    view = childAt;
                } else if (id == C0353a.C0359f.buttonPanel) {
                    view2 = childAt;
                } else if ((id != C0353a.C0359f.contentPanel && id != C0353a.C0359f.customPanel) || view3 != null) {
                    return false;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int i9 = 0;
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i9 = View.combineMeasuredStates(0, view.getMeasuredState());
        }
        int i10 = 0;
        if (view2 != null) {
            view2.measure(i, 0);
            i10 = m2479c(view2);
            paddingBottom += i10;
            i9 = View.combineMeasuredStates(i9, view2.getMeasuredState());
            i3 = view2.getMeasuredHeight() - i10;
        } else {
            i3 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            int measuredHeight = view3.getMeasuredHeight();
            paddingBottom += measuredHeight;
            i9 = View.combineMeasuredStates(i9, view3.getMeasuredState());
            i4 = measuredHeight;
        } else {
            i4 = 0;
        }
        int i11 = size - paddingBottom;
        if (view2 != null) {
            int i12 = paddingBottom - i10;
            int min = Math.min(i11, i3);
            if (min > 0) {
                i11 -= min;
                i10 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            int measuredHeight2 = i12 + view2.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i9, view2.getMeasuredState());
            i5 = measuredHeight2;
        } else {
            i5 = paddingBottom;
            i6 = i9;
        }
        if (view3 == null || i11 <= 0) {
            i7 = i5;
        } else {
            int i13 = i11 - i11;
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i11 + i4, mode));
            int measuredHeight3 = view3.getMeasuredHeight() + (i5 - i4);
            int combineMeasuredStates = View.combineMeasuredStates(i6, view3.getMeasuredState());
            i7 = measuredHeight3;
            i6 = combineMeasuredStates;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                i14 = Math.max(i14, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14 + getPaddingLeft() + getPaddingRight(), i, i6), View.resolveSizeAndState(i7, i2, 0));
        if (mode2 != 1073741824) {
            m2481d(childCount, i2);
        }
        return true;
    }

    /* renamed from: d */
    private void m2481d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0548ah.C0549a aVar = (C0548ah.C0549a) childAt.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        int paddingRight2 = (i6 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i7 = gravity & 8388615;
        switch (gravity & 112) {
            case 16:
                paddingTop = (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        int i8 = paddingTop;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C0548ah.C0549a aVar = (C0548ah.C0549a) childAt.getLayoutParams();
                int i10 = aVar.f1973h;
                if (i10 < 0) {
                    i10 = i7;
                }
                switch (C0235d.m1006a(i10, C0249q.m1059b(this)) & 7) {
                    case 1:
                        i5 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + aVar.leftMargin) - aVar.rightMargin;
                        break;
                    case 5:
                        i5 = (paddingRight - measuredWidth) - aVar.rightMargin;
                        break;
                    default:
                        i5 = paddingLeft + aVar.leftMargin;
                        break;
                }
                int i11 = aVar.topMargin + (mo2798c(i9) ? i8 + intrinsicHeight : i8);
                m2478a(childAt, i5, i11, measuredWidth, measuredHeight2);
                i8 = i11 + aVar.bottomMargin + measuredHeight2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!m2480c(i, i2)) {
            super.onMeasure(i, i2);
        }
    }
}
