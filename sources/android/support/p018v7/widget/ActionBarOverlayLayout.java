package android.support.p018v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.p015g.C0244l;
import android.support.p006v4.p015g.C0246n;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0481o;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C0244l, C0537ab {

    /* renamed from: e */
    static final int[] f1687e = {C0353a.C0354a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f1688A;

    /* renamed from: B */
    private final C0246n f1689B;

    /* renamed from: a */
    ActionBarContainer f1690a;

    /* renamed from: b */
    boolean f1691b;

    /* renamed from: c */
    ViewPropertyAnimator f1692c;

    /* renamed from: d */
    final AnimatorListenerAdapter f1693d;

    /* renamed from: f */
    private int f1694f;

    /* renamed from: g */
    private int f1695g;

    /* renamed from: h */
    private ContentFrameLayout f1696h;

    /* renamed from: i */
    private C0538ac f1697i;

    /* renamed from: j */
    private Drawable f1698j;

    /* renamed from: k */
    private boolean f1699k;

    /* renamed from: l */
    private boolean f1700l;

    /* renamed from: m */
    private boolean f1701m;

    /* renamed from: n */
    private boolean f1702n;

    /* renamed from: o */
    private int f1703o;

    /* renamed from: p */
    private int f1704p;

    /* renamed from: q */
    private final Rect f1705q;

    /* renamed from: r */
    private final Rect f1706r;

    /* renamed from: s */
    private final Rect f1707s;

    /* renamed from: t */
    private final Rect f1708t;

    /* renamed from: u */
    private final Rect f1709u;

    /* renamed from: v */
    private final Rect f1710v;

    /* renamed from: w */
    private final Rect f1711w;

    /* renamed from: x */
    private C0497a f1712x;

    /* renamed from: y */
    private OverScroller f1713y;

    /* renamed from: z */
    private final Runnable f1714z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C0497a {
        /* renamed from: a */
        void mo1708a(int i);

        /* renamed from: g */
        void mo1711g(boolean z);

        /* renamed from: j */
        void mo1716j();

        /* renamed from: k */
        void mo1718k();

        /* renamed from: l */
        void mo1719l();

        /* renamed from: m */
        void mo1720m();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public static class C0498b extends ViewGroup.MarginLayoutParams {
        public C0498b(int i, int i2) {
            super(i, i2);
        }

        public C0498b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0498b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1695g = 0;
        this.f1705q = new Rect();
        this.f1706r = new Rect();
        this.f1707s = new Rect();
        this.f1708t = new Rect();
        this.f1709u = new Rect();
        this.f1710v = new Rect();
        this.f1711w = new Rect();
        this.f1693d = new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.f1692c = null;
                ActionBarOverlayLayout.this.f1691b = false;
            }

            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.f1692c = null;
                ActionBarOverlayLayout.this.f1691b = false;
            }
        };
        this.f1714z = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.mo2389d();
                ActionBarOverlayLayout.this.f1692c = ActionBarOverlayLayout.this.f1690a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1693d);
            }
        };
        this.f1688A = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.mo2389d();
                ActionBarOverlayLayout.this.f1692c = ActionBarOverlayLayout.this.f1690a.animate().translationY((float) (-ActionBarOverlayLayout.this.f1690a.getHeight())).setListener(ActionBarOverlayLayout.this.f1693d);
            }
        };
        m2410a(context);
        this.f1689B = new C0246n(this);
    }

    /* renamed from: a */
    private C0538ac m2409a(View view) {
        if (view instanceof C0538ac) {
            return (C0538ac) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private void m2410a(Context context) {
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1687e);
        this.f1694f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1698j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1698j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z = false;
        }
        this.f1699k = z;
        this.f1713y = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m2411a(float f, float f2) {
        this.f1713y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1713y.getFinalY() > this.f1690a.getHeight();
    }

    /* renamed from: a */
    private boolean m2412a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        C0498b bVar = (C0498b) view.getLayoutParams();
        if (z && bVar.leftMargin != rect.left) {
            bVar.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || bVar.bottomMargin == rect.bottom) {
            return z5;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: l */
    private void m2413l() {
        mo2389d();
        postDelayed(this.f1714z, 600);
    }

    /* renamed from: m */
    private void m2414m() {
        mo2389d();
        postDelayed(this.f1688A, 600);
    }

    /* renamed from: n */
    private void m2415n() {
        mo2389d();
        this.f1714z.run();
    }

    /* renamed from: o */
    private void m2416o() {
        mo2389d();
        this.f1688A.run();
    }

    /* renamed from: a */
    public C0498b generateLayoutParams(AttributeSet attributeSet) {
        return new C0498b(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void mo2383a(int i) {
        mo2387c();
        switch (i) {
            case 2:
                this.f1697i.mo2749f();
                return;
            case 5:
                this.f1697i.mo2750g();
                return;
            case 109:
                setOverlayMode(true);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo2384a(Menu menu, C0481o.C0482a aVar) {
        mo2387c();
        this.f1697i.mo2737a(menu, aVar);
    }

    /* renamed from: a */
    public boolean mo2385a() {
        return this.f1700l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0498b generateDefaultLayoutParams() {
        return new C0498b(-1, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2387c() {
        if (this.f1696h == null) {
            this.f1696h = (ContentFrameLayout) findViewById(C0353a.C0359f.action_bar_activity_content);
            this.f1690a = (ActionBarContainer) findViewById(C0353a.C0359f.action_bar_container);
            this.f1697i = m2409a(findViewById(C0353a.C0359f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0498b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2389d() {
        removeCallbacks(this.f1714z);
        removeCallbacks(this.f1688A);
        if (this.f1692c != null) {
            this.f1692c.cancel();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1698j != null && !this.f1699k) {
            int bottom = this.f1690a.getVisibility() == 0 ? (int) (((float) this.f1690a.getBottom()) + this.f1690a.getTranslationY() + 0.5f) : 0;
            this.f1698j.setBounds(0, bottom, getWidth(), this.f1698j.getIntrinsicHeight() + bottom);
            this.f1698j.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo2391e() {
        mo2387c();
        return this.f1697i.mo2751h();
    }

    /* renamed from: f */
    public boolean mo2392f() {
        mo2387c();
        return this.f1697i.mo2752i();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo2387c();
        if ((C0249q.m1064f(this) & 256) != 0) {
        }
        boolean a = m2412a(this.f1690a, rect, true, true, false, true);
        this.f1708t.set(rect);
        C0586ba.m2901a(this, this.f1708t, this.f1705q);
        if (!this.f1709u.equals(this.f1708t)) {
            this.f1709u.set(this.f1708t);
            a = true;
        }
        if (!this.f1706r.equals(this.f1705q)) {
            this.f1706r.set(this.f1705q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo2394g() {
        mo2387c();
        return this.f1697i.mo2753j();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0498b(layoutParams);
    }

    public int getActionBarHideOffset() {
        if (this.f1690a != null) {
            return -((int) this.f1690a.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1689B.mo1063a();
    }

    public CharSequence getTitle() {
        mo2387c();
        return this.f1697i.mo2748e();
    }

    /* renamed from: h */
    public boolean mo2401h() {
        mo2387c();
        return this.f1697i.mo2754k();
    }

    /* renamed from: i */
    public boolean mo2402i() {
        mo2387c();
        return this.f1697i.mo2755l();
    }

    /* renamed from: j */
    public void mo2403j() {
        mo2387c();
        this.f1697i.mo2756m();
    }

    /* renamed from: k */
    public void mo2404k() {
        mo2387c();
        this.f1697i.mo2757n();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2410a(getContext());
        C0249q.m1065g(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2389d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0498b bVar = (C0498b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        mo2387c();
        measureChildWithMargins(this.f1690a, i, 0, i2, 0);
        C0498b bVar = (C0498b) this.f1690a.getLayoutParams();
        int max = Math.max(0, this.f1690a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, bVar.bottomMargin + this.f1690a.getMeasuredHeight() + bVar.topMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1690a.getMeasuredState());
        boolean z = (C0249q.m1064f(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1694f;
            if (this.f1701m && this.f1690a.getTabContainer() != null) {
                measuredHeight += this.f1694f;
            }
        } else {
            measuredHeight = this.f1690a.getVisibility() != 8 ? this.f1690a.getMeasuredHeight() : 0;
        }
        this.f1707s.set(this.f1705q);
        this.f1710v.set(this.f1708t);
        if (this.f1700l || z) {
            Rect rect = this.f1710v;
            rect.top = measuredHeight + rect.top;
            this.f1710v.bottom += 0;
        } else {
            Rect rect2 = this.f1707s;
            rect2.top = measuredHeight + rect2.top;
            this.f1707s.bottom += 0;
        }
        m2412a(this.f1696h, this.f1707s, true, true, true, true);
        if (!this.f1711w.equals(this.f1710v)) {
            this.f1711w.set(this.f1710v);
            this.f1696h.mo2504a(this.f1710v);
        }
        measureChildWithMargins(this.f1696h, i, 0, i2, 0);
        C0498b bVar2 = (C0498b) this.f1696h.getLayoutParams();
        int max3 = Math.max(max, this.f1696h.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, bVar2.bottomMargin + this.f1696h.getMeasuredHeight() + bVar2.topMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1696h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1702n || !z) {
            return false;
        }
        if (m2411a(f, f2)) {
            m2416o();
        } else {
            m2415n();
        }
        this.f1691b = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f1703o += i2;
        setActionBarHideOffset(this.f1703o);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1689B.mo1065a(view, view2, i);
        this.f1703o = getActionBarHideOffset();
        mo2389d();
        if (this.f1712x != null) {
            this.f1712x.mo1719l();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1690a.getVisibility() != 0) {
            return false;
        }
        return this.f1702n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1702n && !this.f1691b) {
            if (this.f1703o <= this.f1690a.getHeight()) {
                m2413l();
            } else {
                m2414m();
            }
        }
        if (this.f1712x != null) {
            this.f1712x.mo1720m();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo2387c();
        int i2 = this.f1704p ^ i;
        this.f1704p = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        if (this.f1712x != null) {
            C0497a aVar = this.f1712x;
            if (z3) {
                z = false;
            }
            aVar.mo1711g(z);
            if (z2 || !z3) {
                this.f1712x.mo1716j();
            } else {
                this.f1712x.mo1718k();
            }
        }
        if ((i2 & 256) != 0 && this.f1712x != null) {
            C0249q.m1065g(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1695g = i;
        if (this.f1712x != null) {
            this.f1712x.mo1708a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo2389d();
        this.f1690a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1690a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0497a aVar) {
        this.f1712x = aVar;
        if (getWindowToken() != null) {
            this.f1712x.mo1708a(this.f1695g);
            if (this.f1704p != 0) {
                onWindowSystemUiVisibilityChanged(this.f1704p);
                C0249q.m1065g(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1701m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1702n) {
            this.f1702n = z;
            if (!z) {
                mo2389d();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo2387c();
        this.f1697i.mo2733a(i);
    }

    public void setIcon(Drawable drawable) {
        mo2387c();
        this.f1697i.mo2734a(drawable);
    }

    public void setLogo(int i) {
        mo2387c();
        this.f1697i.mo2742b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1700l = z;
        this.f1699k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo2387c();
        this.f1697i.mo2738a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo2387c();
        this.f1697i.mo2739a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
