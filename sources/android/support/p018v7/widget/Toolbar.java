package android.support.p018v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p006v4.p015g.C0218a;
import android.support.p006v4.p015g.C0235d;
import android.support.p006v4.p015g.C0239g;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.app.C0378a;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.support.p018v7.view.C0439c;
import android.support.p018v7.view.C0444g;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.view.menu.C0469j;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.view.menu.C0491u;
import android.support.p018v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1850A;

    /* renamed from: B */
    private int f1851B;

    /* renamed from: C */
    private boolean f1852C;

    /* renamed from: D */
    private boolean f1853D;

    /* renamed from: E */
    private final ArrayList<View> f1854E;

    /* renamed from: F */
    private final ArrayList<View> f1855F;

    /* renamed from: G */
    private final int[] f1856G;

    /* renamed from: H */
    private final ActionMenuView.C0503e f1857H;

    /* renamed from: I */
    private C0576av f1858I;

    /* renamed from: J */
    private C0588c f1859J;

    /* renamed from: K */
    private C0528a f1860K;

    /* renamed from: L */
    private C0481o.C0482a f1861L;

    /* renamed from: M */
    private C0465h.C0466a f1862M;

    /* renamed from: N */
    private boolean f1863N;

    /* renamed from: O */
    private final Runnable f1864O;

    /* renamed from: a */
    ImageButton f1865a;

    /* renamed from: b */
    View f1866b;

    /* renamed from: c */
    int f1867c;

    /* renamed from: d */
    C0530c f1868d;

    /* renamed from: e */
    private ActionMenuView f1869e;

    /* renamed from: f */
    private TextView f1870f;

    /* renamed from: g */
    private TextView f1871g;

    /* renamed from: h */
    private ImageButton f1872h;

    /* renamed from: i */
    private ImageView f1873i;

    /* renamed from: j */
    private Drawable f1874j;

    /* renamed from: k */
    private CharSequence f1875k;

    /* renamed from: l */
    private Context f1876l;

    /* renamed from: m */
    private int f1877m;

    /* renamed from: n */
    private int f1878n;

    /* renamed from: o */
    private int f1879o;

    /* renamed from: p */
    private int f1880p;

    /* renamed from: q */
    private int f1881q;

    /* renamed from: r */
    private int f1882r;

    /* renamed from: s */
    private int f1883s;

    /* renamed from: t */
    private int f1884t;

    /* renamed from: u */
    private C0562am f1885u;

    /* renamed from: v */
    private int f1886v;

    /* renamed from: w */
    private int f1887w;

    /* renamed from: x */
    private int f1888x;

    /* renamed from: y */
    private CharSequence f1889y;

    /* renamed from: z */
    private CharSequence f1890z;

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C0528a implements C0481o {

        /* renamed from: a */
        C0465h f1894a;

        /* renamed from: b */
        C0469j f1895b;

        C0528a() {
        }

        /* renamed from: a */
        public void mo2015a(Context context, C0465h hVar) {
            if (!(this.f1894a == null || this.f1895b == null)) {
                this.f1894a.mo2117d(this.f1895b);
            }
            this.f1894a = hVar;
        }

        /* renamed from: a */
        public void mo2016a(C0465h hVar, boolean z) {
        }

        /* renamed from: a */
        public void mo2018a(C0481o.C0482a aVar) {
        }

        /* renamed from: a */
        public boolean mo2021a(C0465h hVar, C0469j jVar) {
            Toolbar.this.mo2655i();
            ViewParent parent = Toolbar.this.f1865a.getParent();
            if (parent != Toolbar.this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(Toolbar.this.f1865a);
                }
                Toolbar.this.addView(Toolbar.this.f1865a);
            }
            Toolbar.this.f1866b = jVar.getActionView();
            this.f1895b = jVar;
            ViewParent parent2 = Toolbar.this.f1866b.getParent();
            if (parent2 != Toolbar.this) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(Toolbar.this.f1866b);
                }
                C0529b j = Toolbar.this.generateDefaultLayoutParams();
                j.f1115a = 8388611 | (Toolbar.this.f1867c & 112);
                j.f1897b = 2;
                Toolbar.this.f1866b.setLayoutParams(j);
                Toolbar.this.addView(Toolbar.this.f1866b);
            }
            Toolbar.this.mo2657k();
            Toolbar.this.requestLayout();
            jVar.mo2167e(true);
            if (Toolbar.this.f1866b instanceof C0439c) {
                ((C0439c) Toolbar.this.f1866b).mo1875a();
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo2022a(C0491u uVar) {
            return false;
        }

        /* renamed from: b */
        public void mo2025b(boolean z) {
            boolean z2 = false;
            if (this.f1895b != null) {
                if (this.f1894a != null) {
                    int size = this.f1894a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1894a.getItem(i) == this.f1895b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo2027b(this.f1894a, this.f1895b);
                }
            }
        }

        /* renamed from: b */
        public boolean mo2026b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo2027b(C0465h hVar, C0469j jVar) {
            if (Toolbar.this.f1866b instanceof C0439c) {
                ((C0439c) Toolbar.this.f1866b).mo1876b();
            }
            Toolbar.this.removeView(Toolbar.this.f1866b);
            Toolbar.this.removeView(Toolbar.this.f1865a);
            Toolbar.this.f1866b = null;
            Toolbar.this.mo2658l();
            this.f1895b = null;
            Toolbar.this.requestLayout();
            jVar.mo2167e(false);
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public static class C0529b extends C0378a.C0379a {

        /* renamed from: b */
        int f1897b = 0;

        public C0529b(int i, int i2) {
            super(i, i2);
            this.f1115a = 8388627;
        }

        public C0529b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0529b(C0378a.C0379a aVar) {
            super(aVar);
        }

        public C0529b(C0529b bVar) {
            super((C0378a.C0379a) bVar);
            this.f1897b = bVar.f1897b;
        }

        public C0529b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0529b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo2694a(marginLayoutParams);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2694a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$c */
    public interface C0530c {
        /* renamed from: a */
        boolean mo2695a(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$d */
    public static class C0531d extends C0218a {
        public static final Parcelable.Creator<C0531d> CREATOR = new Parcelable.ClassLoaderCreator<C0531d>() {
            /* renamed from: a */
            public C0531d createFromParcel(Parcel parcel) {
                return new C0531d(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0531d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0531d(parcel, classLoader);
            }

            /* renamed from: a */
            public C0531d[] newArray(int i) {
                return new C0531d[i];
            }
        };

        /* renamed from: b */
        int f1898b;

        /* renamed from: c */
        boolean f1899c;

        public C0531d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1898b = parcel.readInt();
            this.f1899c = parcel.readInt() != 0;
        }

        public C0531d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1898b);
            parcel.writeInt(this.f1899c ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1888x = 8388627;
        this.f1854E = new ArrayList<>();
        this.f1855F = new ArrayList<>();
        this.f1856G = new int[2];
        this.f1857H = new ActionMenuView.C0503e() {
            /* renamed from: a */
            public boolean mo2463a(MenuItem menuItem) {
                if (Toolbar.this.f1868d != null) {
                    return Toolbar.this.f1868d.mo2695a(menuItem);
                }
                return false;
            }
        };
        this.f1864O = new Runnable() {
            public void run() {
                Toolbar.this.mo2621d();
            }
        };
        C0575au a = C0575au.m2819a(getContext(), attributeSet, C0353a.C0363j.Toolbar, i, 0);
        this.f1878n = a.mo2971g(C0353a.C0363j.Toolbar_titleTextAppearance, 0);
        this.f1879o = a.mo2971g(C0353a.C0363j.Toolbar_subtitleTextAppearance, 0);
        this.f1888x = a.mo2963c(C0353a.C0363j.Toolbar_android_gravity, this.f1888x);
        this.f1867c = a.mo2963c(C0353a.C0363j.Toolbar_buttonGravity, 48);
        int d = a.mo2965d(C0353a.C0363j.Toolbar_titleMargin, 0);
        d = a.mo2972g(C0353a.C0363j.Toolbar_titleMargins) ? a.mo2965d(C0353a.C0363j.Toolbar_titleMargins, d) : d;
        this.f1884t = d;
        this.f1883s = d;
        this.f1882r = d;
        this.f1881q = d;
        int d2 = a.mo2965d(C0353a.C0363j.Toolbar_titleMarginStart, -1);
        if (d2 >= 0) {
            this.f1881q = d2;
        }
        int d3 = a.mo2965d(C0353a.C0363j.Toolbar_titleMarginEnd, -1);
        if (d3 >= 0) {
            this.f1882r = d3;
        }
        int d4 = a.mo2965d(C0353a.C0363j.Toolbar_titleMarginTop, -1);
        if (d4 >= 0) {
            this.f1883s = d4;
        }
        int d5 = a.mo2965d(C0353a.C0363j.Toolbar_titleMarginBottom, -1);
        if (d5 >= 0) {
            this.f1884t = d5;
        }
        this.f1880p = a.mo2967e(C0353a.C0363j.Toolbar_maxButtonHeight, -1);
        int d6 = a.mo2965d(C0353a.C0363j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d7 = a.mo2965d(C0353a.C0363j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.mo2967e(C0353a.C0363j.Toolbar_contentInsetLeft, 0);
        int e2 = a.mo2967e(C0353a.C0363j.Toolbar_contentInsetRight, 0);
        m2561s();
        this.f1885u.mo2915b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f1885u.mo2912a(d6, d7);
        }
        this.f1886v = a.mo2965d(C0353a.C0363j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1887w = a.mo2965d(C0353a.C0363j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1874j = a.mo2958a(C0353a.C0363j.Toolbar_collapseIcon);
        this.f1875k = a.mo2964c(C0353a.C0363j.Toolbar_collapseContentDescription);
        CharSequence c = a.mo2964c(C0353a.C0363j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a.mo2964c(C0353a.C0363j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.f1876l = getContext();
        setPopupTheme(a.mo2971g(C0353a.C0363j.Toolbar_popupTheme, 0));
        Drawable a2 = a.mo2958a(C0353a.C0363j.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence c3 = a.mo2964c(C0353a.C0363j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a3 = a.mo2958a(C0353a.C0363j.Toolbar_logo);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence c4 = a.mo2964c(C0353a.C0363j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a.mo2972g(C0353a.C0363j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo2961b(C0353a.C0363j.Toolbar_titleTextColor, -1));
        }
        if (a.mo2972g(C0353a.C0363j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo2961b(C0353a.C0363j.Toolbar_subtitleTextColor, -1));
        }
        a.mo2959a();
    }

    /* renamed from: a */
    private int m2541a(int i) {
        int i2 = i & 112;
        switch (i2) {
            case 16:
            case 48:
            case 80:
                return i2;
            default:
                return this.f1888x & 112;
        }
    }

    /* renamed from: a */
    private int m2542a(View view, int i) {
        int max;
        C0529b bVar = (C0529b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        switch (m2541a(bVar.f1115a)) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i3 < bVar.topMargin) {
                    max = bVar.topMargin;
                } else {
                    int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    max = i4 < bVar.bottomMargin ? Math.max(0, i3 - (bVar.bottomMargin - i4)) : i3;
                }
                return max + paddingTop;
        }
    }

    /* renamed from: a */
    private int m2543a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m2544a(View view, int i, int[] iArr, int i2) {
        C0529b bVar = (C0529b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int a = m2542a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return bVar.rightMargin + measuredWidth + max;
    }

    /* renamed from: a */
    private int m2545a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (i3 < size) {
            View view = list.get(i3);
            C0529b bVar = (C0529b) view.getLayoutParams();
            int i7 = bVar.leftMargin - i6;
            int i8 = bVar.rightMargin - i5;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            i6 = Math.max(0, -i7);
            i5 = Math.max(0, -i8);
            i3++;
            i4 += view.getMeasuredWidth() + max + max2;
        }
        return i4;
    }

    /* renamed from: a */
    private void m2546a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m2547a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0529b j = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0529b) layoutParams;
        j.f1897b = 1;
        if (!z || this.f1866b == null) {
            addView(view, j);
            return;
        }
        view.setLayoutParams(j);
        this.f1855F.add(view);
    }

    /* renamed from: a */
    private void m2548a(List<View> list, int i) {
        boolean z = true;
        if (C0249q.m1059b(this) != 1) {
            z = false;
        }
        int childCount = getChildCount();
        int a = C0235d.m1006a(i, C0249q.m1059b(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0529b bVar = (C0529b) childAt.getLayoutParams();
                if (bVar.f1897b == 0 && m2549a(childAt) && m2550b(bVar.f1115a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0529b bVar2 = (C0529b) childAt2.getLayoutParams();
            if (bVar2.f1897b == 0 && m2549a(childAt2) && m2550b(bVar2.f1115a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private boolean m2549a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private int m2550b(int i) {
        int b = C0249q.m1059b(this);
        int a = C0235d.m1006a(i, b) & 7;
        switch (a) {
            case 1:
            case 3:
            case 5:
                return a;
            default:
                return b == 1 ? 5 : 3;
        }
    }

    /* renamed from: b */
    private int m2551b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0239g.m1017b(marginLayoutParams) + C0239g.m1016a(marginLayoutParams);
    }

    /* renamed from: b */
    private int m2552b(View view, int i, int[] iArr, int i2) {
        C0529b bVar = (C0529b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m2542a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (bVar.leftMargin + measuredWidth);
    }

    /* renamed from: c */
    private int m2553c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    /* renamed from: d */
    private boolean m2554d(View view) {
        return view.getParent() == this || this.f1855F.contains(view);
    }

    private MenuInflater getMenuInflater() {
        return new C0444g(getContext());
    }

    /* renamed from: m */
    private void m2555m() {
        if (this.f1873i == null) {
            this.f1873i = new C0618p(getContext());
        }
    }

    /* renamed from: n */
    private void m2556n() {
        m2557o();
        if (this.f1869e.mo2438d() == null) {
            C0465h hVar = (C0465h) this.f1869e.getMenu();
            if (this.f1860K == null) {
                this.f1860K = new C0528a();
            }
            this.f1869e.setExpandedActionViewsExclusive(true);
            hVar.mo2086a((C0481o) this.f1860K, this.f1876l);
        }
    }

    /* renamed from: o */
    private void m2557o() {
        if (this.f1869e == null) {
            this.f1869e = new ActionMenuView(getContext());
            this.f1869e.setPopupTheme(this.f1877m);
            this.f1869e.setOnMenuItemClickListener(this.f1857H);
            this.f1869e.mo2430a(this.f1861L, this.f1862M);
            C0529b j = generateDefaultLayoutParams();
            j.f1115a = 8388613 | (this.f1867c & 112);
            this.f1869e.setLayoutParams(j);
            m2547a((View) this.f1869e, false);
        }
    }

    /* renamed from: p */
    private void m2558p() {
        if (this.f1872h == null) {
            this.f1872h = new C0616n(getContext(), (AttributeSet) null, C0353a.C0354a.toolbarNavigationButtonStyle);
            C0529b j = generateDefaultLayoutParams();
            j.f1115a = 8388611 | (this.f1867c & 112);
            this.f1872h.setLayoutParams(j);
        }
    }

    /* renamed from: q */
    private void m2559q() {
        removeCallbacks(this.f1864O);
        post(this.f1864O);
    }

    /* renamed from: r */
    private boolean m2560r() {
        if (!this.f1863N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2549a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m2561s() {
        if (this.f1885u == null) {
            this.f1885u = new C0562am();
        }
    }

    /* renamed from: a */
    public C0529b generateLayoutParams(AttributeSet attributeSet) {
        return new C0529b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0529b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0529b ? new C0529b((C0529b) layoutParams) : layoutParams instanceof C0378a.C0379a ? new C0529b((C0378a.C0379a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0529b((ViewGroup.MarginLayoutParams) layoutParams) : new C0529b(layoutParams);
    }

    /* renamed from: a */
    public void mo2612a(int i, int i2) {
        m2561s();
        this.f1885u.mo2912a(i, i2);
    }

    /* renamed from: a */
    public void mo2613a(Context context, int i) {
        this.f1878n = i;
        if (this.f1870f != null) {
            this.f1870f.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo2614a(C0465h hVar, C0588c cVar) {
        if (hVar != null || this.f1869e != null) {
            m2557o();
            C0465h d = this.f1869e.mo2438d();
            if (d != hVar) {
                if (d != null) {
                    d.mo2105b((C0481o) this.f1859J);
                    d.mo2105b((C0481o) this.f1860K);
                }
                if (this.f1860K == null) {
                    this.f1860K = new C0528a();
                }
                cVar.mo3006d(true);
                if (hVar != null) {
                    hVar.mo2086a((C0481o) cVar, this.f1876l);
                    hVar.mo2086a((C0481o) this.f1860K, this.f1876l);
                } else {
                    cVar.mo2015a(this.f1876l, (C0465h) null);
                    this.f1860K.mo2015a(this.f1876l, (C0465h) null);
                    cVar.mo2025b(true);
                    this.f1860K.mo2025b(true);
                }
                this.f1869e.setPopupTheme(this.f1877m);
                this.f1869e.setPresenter(cVar);
                this.f1859J = cVar;
            }
        }
    }

    /* renamed from: a */
    public void mo2615a(C0481o.C0482a aVar, C0465h.C0466a aVar2) {
        this.f1861L = aVar;
        this.f1862M = aVar2;
        if (this.f1869e != null) {
            this.f1869e.mo2430a(aVar, aVar2);
        }
    }

    /* renamed from: a */
    public boolean mo2616a() {
        return getVisibility() == 0 && this.f1869e != null && this.f1869e.mo2431a();
    }

    /* renamed from: b */
    public void mo2617b(Context context, int i) {
        this.f1879o = i;
        if (this.f1871g != null) {
            this.f1871g.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean mo2618b() {
        return this.f1869e != null && this.f1869e.mo2442g();
    }

    /* renamed from: c */
    public boolean mo2619c() {
        return this.f1869e != null && this.f1869e.mo2450h();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0529b);
    }

    /* renamed from: d */
    public boolean mo2621d() {
        return this.f1869e != null && this.f1869e.mo2440e();
    }

    /* renamed from: e */
    public boolean mo2622e() {
        return this.f1869e != null && this.f1869e.mo2441f();
    }

    /* renamed from: f */
    public void mo2623f() {
        if (this.f1869e != null) {
            this.f1869e.mo2451i();
        }
    }

    /* renamed from: g */
    public boolean mo2624g() {
        return (this.f1860K == null || this.f1860K.f1895b == null) ? false : true;
    }

    public int getContentInsetEnd() {
        if (this.f1885u != null) {
            return this.f1885u.mo2917d();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        return this.f1887w != Integer.MIN_VALUE ? this.f1887w : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        if (this.f1885u != null) {
            return this.f1885u.mo2911a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.f1885u != null) {
            return this.f1885u.mo2914b();
        }
        return 0;
    }

    public int getContentInsetStart() {
        if (this.f1885u != null) {
            return this.f1885u.mo2916c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.f1886v != Integer.MIN_VALUE ? this.f1886v : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        if (this.f1869e != null) {
            C0465h d = this.f1869e.mo2438d();
            z = d != null && d.hasVisibleItems();
        } else {
            z = false;
        }
        return z ? Math.max(getContentInsetEnd(), Math.max(this.f1887w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C0249q.m1059b(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0249q.m1059b(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1886v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        if (this.f1873i != null) {
            return this.f1873i.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        if (this.f1873i != null) {
            return this.f1873i.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m2556n();
        return this.f1869e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        if (this.f1872h != null) {
            return this.f1872h.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        if (this.f1872h != null) {
            return this.f1872h.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0588c getOuterActionMenuPresenter() {
        return this.f1859J;
    }

    public Drawable getOverflowIcon() {
        m2556n();
        return this.f1869e.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1876l;
    }

    public int getPopupTheme() {
        return this.f1877m;
    }

    public CharSequence getSubtitle() {
        return this.f1890z;
    }

    public CharSequence getTitle() {
        return this.f1889y;
    }

    public int getTitleMarginBottom() {
        return this.f1884t;
    }

    public int getTitleMarginEnd() {
        return this.f1882r;
    }

    public int getTitleMarginStart() {
        return this.f1881q;
    }

    public int getTitleMarginTop() {
        return this.f1883s;
    }

    public C0538ac getWrapper() {
        if (this.f1858I == null) {
            this.f1858I = new C0576av(this, true);
        }
        return this.f1858I;
    }

    /* renamed from: h */
    public void mo2654h() {
        C0469j jVar = this.f1860K == null ? null : this.f1860K.f1895b;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2655i() {
        if (this.f1865a == null) {
            this.f1865a = new C0616n(getContext(), (AttributeSet) null, C0353a.C0354a.toolbarNavigationButtonStyle);
            this.f1865a.setImageDrawable(this.f1874j);
            this.f1865a.setContentDescription(this.f1875k);
            C0529b j = generateDefaultLayoutParams();
            j.f1115a = 8388611 | (this.f1867c & 112);
            j.f1897b = 2;
            this.f1865a.setLayoutParams(j);
            this.f1865a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toolbar.this.mo2654h();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0529b generateDefaultLayoutParams() {
        return new C0529b(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2657k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0529b) childAt.getLayoutParams()).f1897b == 2 || childAt == this.f1869e)) {
                removeViewAt(childCount);
                this.f1855F.add(childAt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2658l() {
        for (int size = this.f1855F.size() - 1; size >= 0; size--) {
            addView(this.f1855F.get(size));
        }
        this.f1855F.clear();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1864O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1853D = false;
        }
        if (!this.f1853D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1853D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1853D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int max;
        boolean z2 = C0249q.m1059b(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.f1856G;
        iArr[1] = 0;
        iArr[0] = 0;
        int c = C0249q.m1061c(this);
        int min = c >= 0 ? Math.min(c, i4 - i2) : 0;
        if (!m2549a((View) this.f1872h)) {
            i5 = i15;
            i6 = paddingLeft;
        } else if (z2) {
            i5 = m2552b(this.f1872h, i15, iArr, min);
            i6 = paddingLeft;
        } else {
            i6 = m2544a(this.f1872h, paddingLeft, iArr, min);
            i5 = i15;
        }
        if (m2549a((View) this.f1865a)) {
            if (z2) {
                i5 = m2552b(this.f1865a, i5, iArr, min);
            } else {
                i6 = m2544a(this.f1865a, i6, iArr, min);
            }
        }
        if (m2549a((View) this.f1869e)) {
            if (z2) {
                i6 = m2544a(this.f1869e, i6, iArr, min);
            } else {
                i5 = m2552b(this.f1869e, i5, iArr, min);
            }
        }
        int currentContentInsetLeft = getCurrentContentInsetLeft();
        int currentContentInsetRight = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft - i6);
        iArr[1] = Math.max(0, currentContentInsetRight - ((width - paddingRight) - i5));
        int max2 = Math.max(i6, currentContentInsetLeft);
        int min2 = Math.min(i5, (width - paddingRight) - currentContentInsetRight);
        if (m2549a(this.f1866b)) {
            if (z2) {
                min2 = m2552b(this.f1866b, min2, iArr, min);
            } else {
                max2 = m2544a(this.f1866b, max2, iArr, min);
            }
        }
        if (!m2549a((View) this.f1873i)) {
            i7 = min2;
            i8 = max2;
        } else if (z2) {
            i7 = m2552b(this.f1873i, min2, iArr, min);
            i8 = max2;
        } else {
            i7 = min2;
            i8 = m2544a(this.f1873i, max2, iArr, min);
        }
        boolean a = m2549a((View) this.f1870f);
        boolean a2 = m2549a((View) this.f1871g);
        int i16 = 0;
        if (a) {
            C0529b bVar = (C0529b) this.f1870f.getLayoutParams();
            i16 = 0 + bVar.bottomMargin + bVar.topMargin + this.f1870f.getMeasuredHeight();
        }
        if (a2) {
            C0529b bVar2 = (C0529b) this.f1871g.getLayoutParams();
            i9 = bVar2.bottomMargin + bVar2.topMargin + this.f1871g.getMeasuredHeight() + i16;
        } else {
            i9 = i16;
        }
        if (a || a2) {
            TextView textView = a ? this.f1870f : this.f1871g;
            TextView textView2 = a2 ? this.f1871g : this.f1870f;
            C0529b bVar3 = (C0529b) textView.getLayoutParams();
            C0529b bVar4 = (C0529b) textView2.getLayoutParams();
            boolean z3 = (a && this.f1870f.getMeasuredWidth() > 0) || (a2 && this.f1871g.getMeasuredWidth() > 0);
            switch (this.f1888x & 112) {
                case 48:
                    i10 = bVar3.topMargin + getPaddingTop() + this.f1883s;
                    break;
                case 80:
                    i10 = (((height - paddingBottom) - bVar4.bottomMargin) - this.f1884t) - i9;
                    break;
                default:
                    int i17 = (((height - paddingTop) - paddingBottom) - i9) / 2;
                    if (i17 < bVar3.topMargin + this.f1883s) {
                        max = bVar3.topMargin + this.f1883s;
                    } else {
                        int i18 = (((height - paddingBottom) - i9) - i17) - paddingTop;
                        max = i18 < bVar3.bottomMargin + this.f1884t ? Math.max(0, i17 - ((bVar4.bottomMargin + this.f1884t) - i18)) : i17;
                    }
                    i10 = paddingTop + max;
                    break;
            }
            if (z2) {
                int i19 = (z3 ? this.f1881q : 0) - iArr[1];
                int max3 = i7 - Math.max(0, i19);
                iArr[1] = Math.max(0, -i19);
                if (a) {
                    int measuredWidth = max3 - this.f1870f.getMeasuredWidth();
                    int measuredHeight = this.f1870f.getMeasuredHeight() + i10;
                    this.f1870f.layout(measuredWidth, i10, max3, measuredHeight);
                    int i20 = measuredWidth - this.f1882r;
                    i10 = measuredHeight + ((C0529b) this.f1870f.getLayoutParams()).bottomMargin;
                    i13 = i20;
                } else {
                    i13 = max3;
                }
                if (a2) {
                    C0529b bVar5 = (C0529b) this.f1871g.getLayoutParams();
                    int i21 = bVar5.topMargin + i10;
                    int measuredHeight2 = this.f1871g.getMeasuredHeight() + i21;
                    this.f1871g.layout(max3 - this.f1871g.getMeasuredWidth(), i21, max3, measuredHeight2);
                    int i22 = bVar5.bottomMargin + measuredHeight2;
                    i14 = max3 - this.f1882r;
                } else {
                    i14 = max3;
                }
                i7 = z3 ? Math.min(i13, i14) : max3;
            } else {
                int i23 = (z3 ? this.f1881q : 0) - iArr[0];
                i8 += Math.max(0, i23);
                iArr[0] = Math.max(0, -i23);
                if (a) {
                    int measuredWidth2 = this.f1870f.getMeasuredWidth() + i8;
                    int measuredHeight3 = this.f1870f.getMeasuredHeight() + i10;
                    this.f1870f.layout(i8, i10, measuredWidth2, measuredHeight3);
                    int i24 = ((C0529b) this.f1870f.getLayoutParams()).bottomMargin + measuredHeight3;
                    i11 = measuredWidth2 + this.f1882r;
                    i10 = i24;
                } else {
                    i11 = i8;
                }
                if (a2) {
                    C0529b bVar6 = (C0529b) this.f1871g.getLayoutParams();
                    int i25 = bVar6.topMargin + i10;
                    int measuredWidth3 = this.f1871g.getMeasuredWidth() + i8;
                    int measuredHeight4 = this.f1871g.getMeasuredHeight() + i25;
                    this.f1871g.layout(i8, i25, measuredWidth3, measuredHeight4);
                    int i26 = bVar6.bottomMargin + measuredHeight4;
                    i12 = this.f1882r + measuredWidth3;
                } else {
                    i12 = i8;
                }
                if (z3) {
                    i8 = Math.max(i11, i12);
                }
            }
        }
        m2548a((List<View>) this.f1854E, 3);
        int size = this.f1854E.size();
        int i27 = i8;
        for (int i28 = 0; i28 < size; i28++) {
            i27 = m2544a(this.f1854E.get(i28), i27, iArr, min);
        }
        m2548a((List<View>) this.f1854E, 5);
        int size2 = this.f1854E.size();
        for (int i29 = 0; i29 < size2; i29++) {
            i7 = m2552b(this.f1854E.get(i29), i7, iArr, min);
        }
        m2548a((List<View>) this.f1854E, 1);
        int a3 = m2545a((List<View>) this.f1854E, iArr);
        int i30 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (a3 / 2);
        int i31 = a3 + i30;
        if (i30 < i27) {
            i30 = i27;
        } else if (i31 > i7) {
            i30 -= i31 - i7;
        }
        int size3 = this.f1854E.size();
        int i32 = i30;
        for (int i33 = 0; i33 < size3; i33++) {
            i32 = m2544a(this.f1854E.get(i33), i32, iArr, min);
        }
        this.f1854E.clear();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = this.f1856G;
        if (C0586ba.m2902a(this)) {
            c = 0;
            c2 = 1;
        } else {
            c = 1;
            c2 = 0;
        }
        int i7 = 0;
        if (m2549a((View) this.f1872h)) {
            m2546a((View) this.f1872h, i, 0, i2, 0, this.f1880p);
            i7 = this.f1872h.getMeasuredWidth() + m2551b((View) this.f1872h);
            int max = Math.max(0, this.f1872h.getMeasuredHeight() + m2553c(this.f1872h));
            i6 = View.combineMeasuredStates(0, this.f1872h.getMeasuredState());
            i5 = max;
        }
        if (m2549a((View) this.f1865a)) {
            m2546a((View) this.f1865a, i, 0, i2, 0, this.f1880p);
            i7 = this.f1865a.getMeasuredWidth() + m2551b((View) this.f1865a);
            i5 = Math.max(i5, this.f1865a.getMeasuredHeight() + m2553c(this.f1865a));
            i6 = View.combineMeasuredStates(i6, this.f1865a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max2 = 0 + Math.max(currentContentInsetStart, i7);
        iArr[c2] = Math.max(0, currentContentInsetStart - i7);
        int i8 = 0;
        if (m2549a((View) this.f1869e)) {
            m2546a((View) this.f1869e, i, max2, i2, 0, this.f1880p);
            i8 = this.f1869e.getMeasuredWidth() + m2551b((View) this.f1869e);
            i5 = Math.max(i5, this.f1869e.getMeasuredHeight() + m2553c(this.f1869e));
            i6 = View.combineMeasuredStates(i6, this.f1869e.getMeasuredState());
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max2 + Math.max(currentContentInsetEnd, i8);
        iArr[c] = Math.max(0, currentContentInsetEnd - i8);
        if (m2549a(this.f1866b)) {
            max3 += m2543a(this.f1866b, i, max3, i2, 0, iArr);
            i5 = Math.max(i5, this.f1866b.getMeasuredHeight() + m2553c(this.f1866b));
            i6 = View.combineMeasuredStates(i6, this.f1866b.getMeasuredState());
        }
        if (m2549a((View) this.f1873i)) {
            max3 += m2543a((View) this.f1873i, i, max3, i2, 0, iArr);
            i5 = Math.max(i5, this.f1873i.getMeasuredHeight() + m2553c(this.f1873i));
            i6 = View.combineMeasuredStates(i6, this.f1873i.getMeasuredState());
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = i6;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (((C0529b) childAt.getLayoutParams()).f1897b != 0) {
                i3 = i10;
                i4 = i5;
            } else if (!m2549a(childAt)) {
                i3 = i10;
                i4 = i5;
            } else {
                max3 += m2543a(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i5, childAt.getMeasuredHeight() + m2553c(childAt));
                i3 = View.combineMeasuredStates(i10, childAt.getMeasuredState());
                i4 = max4;
            }
            i9++;
            i10 = i3;
            i5 = i4;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = this.f1883s + this.f1884t;
        int i14 = this.f1881q + this.f1882r;
        if (m2549a((View) this.f1870f)) {
            m2543a((View) this.f1870f, i, max3 + i14, i2, i13, iArr);
            i11 = m2551b((View) this.f1870f) + this.f1870f.getMeasuredWidth();
            i12 = this.f1870f.getMeasuredHeight() + m2553c(this.f1870f);
            i10 = View.combineMeasuredStates(i10, this.f1870f.getMeasuredState());
        }
        if (m2549a((View) this.f1871g)) {
            i11 = Math.max(i11, m2543a((View) this.f1871g, i, max3 + i14, i2, i13 + i12, iArr));
            i12 += this.f1871g.getMeasuredHeight() + m2553c(this.f1871g);
            i10 = View.combineMeasuredStates(i10, this.f1871g.getMeasuredState());
        }
        int max5 = Math.max(i5, i12);
        int paddingLeft = i11 + max3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max5 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i10 << 16);
        if (m2560r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0531d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0531d dVar = (C0531d) parcelable;
        super.onRestoreInstanceState(dVar.mo963a());
        C0465h d = this.f1869e != null ? this.f1869e.mo2438d() : null;
        if (!(dVar.f1898b == 0 || this.f1860K == null || d == null || (findItem = d.findItem(dVar.f1898b)) == null)) {
            findItem.expandActionView();
        }
        if (dVar.f1899c) {
            m2559q();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m2561s();
        C0562am amVar = this.f1885u;
        if (i != 1) {
            z = false;
        }
        amVar.mo2913a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0531d dVar = new C0531d(super.onSaveInstanceState());
        if (!(this.f1860K == null || this.f1860K.f1895b == null)) {
            dVar.f1898b = this.f1860K.f1895b.getItemId();
        }
        dVar.f1899c = mo2618b();
        return dVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1852C = false;
        }
        if (!this.f1852C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1852C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1852C = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f1863N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1887w) {
            this.f1887w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1886v) {
            this.f1886v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0419a.m1949b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m2555m();
            if (!m2554d(this.f1873i)) {
                m2547a((View) this.f1873i, true);
            }
        } else if (this.f1873i != null && m2554d(this.f1873i)) {
            removeView(this.f1873i);
            this.f1855F.remove(this.f1873i);
        }
        if (this.f1873i != null) {
            this.f1873i.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2555m();
        }
        if (this.f1873i != null) {
            this.f1873i.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2558p();
        }
        if (this.f1872h != null) {
            this.f1872h.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0419a.m1949b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m2558p();
            if (!m2554d(this.f1872h)) {
                m2547a((View) this.f1872h, true);
            }
        } else if (this.f1872h != null && m2554d(this.f1872h)) {
            removeView(this.f1872h);
            this.f1855F.remove(this.f1872h);
        }
        if (this.f1872h != null) {
            this.f1872h.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m2558p();
        this.f1872h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0530c cVar) {
        this.f1868d = cVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m2556n();
        this.f1869e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1877m != i) {
            this.f1877m = i;
            if (i == 0) {
                this.f1876l = getContext();
            } else {
                this.f1876l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1871g == null) {
                Context context = getContext();
                this.f1871g = new C0635z(context);
                this.f1871g.setSingleLine();
                this.f1871g.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f1879o != 0) {
                    this.f1871g.setTextAppearance(context, this.f1879o);
                }
                if (this.f1851B != 0) {
                    this.f1871g.setTextColor(this.f1851B);
                }
            }
            if (!m2554d(this.f1871g)) {
                m2547a((View) this.f1871g, true);
            }
        } else if (this.f1871g != null && m2554d(this.f1871g)) {
            removeView(this.f1871g);
            this.f1855F.remove(this.f1871g);
        }
        if (this.f1871g != null) {
            this.f1871g.setText(charSequence);
        }
        this.f1890z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f1851B = i;
        if (this.f1871g != null) {
            this.f1871g.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1870f == null) {
                Context context = getContext();
                this.f1870f = new C0635z(context);
                this.f1870f.setSingleLine();
                this.f1870f.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f1878n != 0) {
                    this.f1870f.setTextAppearance(context, this.f1878n);
                }
                if (this.f1850A != 0) {
                    this.f1870f.setTextColor(this.f1850A);
                }
            }
            if (!m2554d(this.f1870f)) {
                m2547a((View) this.f1870f, true);
            }
        } else if (this.f1870f != null && m2554d(this.f1870f)) {
            removeView(this.f1870f);
            this.f1855F.remove(this.f1870f);
        }
        if (this.f1870f != null) {
            this.f1870f.setText(charSequence);
        }
        this.f1889y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1884t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1882r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1881q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1883s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f1850A = i;
        if (this.f1870f != null) {
            this.f1870f.setTextColor(i);
        }
    }
}
