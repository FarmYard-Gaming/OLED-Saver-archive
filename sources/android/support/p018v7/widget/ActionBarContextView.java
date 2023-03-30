package android.support.p018v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.p015g.C0256u;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.C0437b;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.view.menu.C0481o;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C0534a {

    /* renamed from: g */
    private CharSequence f1674g;

    /* renamed from: h */
    private CharSequence f1675h;

    /* renamed from: i */
    private View f1676i;

    /* renamed from: j */
    private View f1677j;

    /* renamed from: k */
    private LinearLayout f1678k;

    /* renamed from: l */
    private TextView f1679l;

    /* renamed from: m */
    private TextView f1680m;

    /* renamed from: n */
    private int f1681n;

    /* renamed from: o */
    private int f1682o;

    /* renamed from: p */
    private boolean f1683p;

    /* renamed from: q */
    private int f1684q;

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0575au a = C0575au.m2819a(context, attributeSet, C0353a.C0363j.ActionMode, i, 0);
        C0249q.m1052a((View) this, a.mo2958a(C0353a.C0363j.ActionMode_background));
        this.f1681n = a.mo2971g(C0353a.C0363j.ActionMode_titleTextStyle, 0);
        this.f1682o = a.mo2971g(C0353a.C0363j.ActionMode_subtitleTextStyle, 0);
        this.f1909e = a.mo2969f(C0353a.C0363j.ActionMode_height, 0);
        this.f1684q = a.mo2971g(C0353a.C0363j.ActionMode_closeItemLayout, C0353a.C0360g.abc_action_mode_close_item_material);
        a.mo2959a();
    }

    /* renamed from: e */
    private void m2402e() {
        int i = 8;
        boolean z = true;
        if (this.f1678k == null) {
            LayoutInflater.from(getContext()).inflate(C0353a.C0360g.abc_action_bar_title_item, this);
            this.f1678k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1679l = (TextView) this.f1678k.findViewById(C0353a.C0359f.action_bar_title);
            this.f1680m = (TextView) this.f1678k.findViewById(C0353a.C0359f.action_bar_subtitle);
            if (this.f1681n != 0) {
                this.f1679l.setTextAppearance(getContext(), this.f1681n);
            }
            if (this.f1682o != 0) {
                this.f1680m.setTextAppearance(getContext(), this.f1682o);
            }
        }
        this.f1679l.setText(this.f1674g);
        this.f1680m.setText(this.f1675h);
        boolean z2 = !TextUtils.isEmpty(this.f1674g);
        if (TextUtils.isEmpty(this.f1675h)) {
            z = false;
        }
        this.f1680m.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = this.f1678k;
        if (z2 || z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f1678k.getParent() == null) {
            addView(this.f1678k);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0256u mo2356a(int i, long j) {
        return super.mo2356a(i, j);
    }

    /* renamed from: a */
    public void mo2357a(final C0437b bVar) {
        if (this.f1676i == null) {
            this.f1676i = LayoutInflater.from(getContext()).inflate(this.f1684q, this, false);
            addView(this.f1676i);
        } else if (this.f1676i.getParent() == null) {
            addView(this.f1676i);
        }
        this.f1676i.findViewById(C0353a.C0359f.action_mode_close_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bVar.mo1729c();
            }
        });
        C0465h hVar = (C0465h) bVar.mo1726b();
        if (this.f1908d != null) {
            this.f1908d.mo3009f();
        }
        this.f1908d = new C0588c(getContext());
        this.f1908d.mo3005c(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hVar.mo2086a((C0481o) this.f1908d, this.f1906b);
        this.f1907c = (ActionMenuView) this.f1908d.mo2012a((ViewGroup) this);
        C0249q.m1052a((View) this.f1907c, (Drawable) null);
        addView(this.f1907c, layoutParams);
    }

    /* renamed from: a */
    public boolean mo2358a() {
        if (this.f1908d != null) {
            return this.f1908d.mo3007d();
        }
        return false;
    }

    /* renamed from: b */
    public void mo2359b() {
        if (this.f1676i == null) {
            mo2360c();
        }
    }

    /* renamed from: c */
    public void mo2360c() {
        removeAllViews();
        this.f1677j = null;
        this.f1907c = null;
    }

    /* renamed from: d */
    public boolean mo2361d() {
        return this.f1683p;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1675h;
    }

    public CharSequence getTitle() {
        return this.f1674g;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1908d != null) {
            this.f1908d.mo3008e();
            this.f1908d.mo3010g();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1674g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0586ba.m2902a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f1676i == null || this.f1676i.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1676i.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = m2597a(paddingRight, i6, a);
            i5 = m2597a(mo2716a(this.f1676i, a2, paddingTop, paddingTop2, a) + a2, i7, a);
        }
        if (!(this.f1678k == null || this.f1677j != null || this.f1678k.getVisibility() == 8)) {
            i5 += mo2716a(this.f1678k, i5, paddingTop, paddingTop2, a);
        }
        if (this.f1677j != null) {
            int a3 = mo2716a(this.f1677j, i5, paddingTop, paddingTop2, a) + i5;
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f1907c != null) {
            int a4 = mo2716a(this.f1907c, paddingLeft, paddingTop, paddingTop2, !a) + paddingLeft;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = this.f1909e > 0 ? this.f1909e : View.MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = size2 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            if (this.f1676i != null) {
                int a = mo2715a(this.f1676i, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1676i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.f1907c != null && this.f1907c.getParent() == this) {
                paddingLeft = mo2715a(this.f1907c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f1678k != null && this.f1677j == null) {
                if (this.f1683p) {
                    this.f1678k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1678k.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1678k.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo2715a(this.f1678k, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f1677j != null) {
                ViewGroup.LayoutParams layoutParams = this.f1677j.getLayoutParams();
                int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                this.f1677j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(layoutParams.height >= 0 ? Math.min(layoutParams.height, i4) : i4, i3));
            }
            if (this.f1909e <= 0) {
                int childCount = getChildCount();
                int i6 = 0;
                int i7 = 0;
                while (i6 < childCount) {
                    int measuredHeight = getChildAt(i6).getMeasuredHeight() + paddingTop;
                    if (measuredHeight <= i7) {
                        measuredHeight = i7;
                    }
                    i6++;
                    i7 = measuredHeight;
                }
                setMeasuredDimension(size, i7);
                return;
            }
            setMeasuredDimension(size, size2);
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f1909e = i;
    }

    public void setCustomView(View view) {
        if (this.f1677j != null) {
            removeView(this.f1677j);
        }
        this.f1677j = view;
        if (!(view == null || this.f1678k == null)) {
            removeView(this.f1678k);
            this.f1678k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1675h = charSequence;
        m2402e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1674g = charSequence;
        m2402e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1683p) {
            requestLayout();
        }
        this.f1683p = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
