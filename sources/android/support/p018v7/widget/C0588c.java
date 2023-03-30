package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.p015g.C0232c;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.C0436a;
import android.support.p018v7.view.menu.ActionMenuItemView;
import android.support.p018v7.view.menu.C0453b;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.view.menu.C0469j;
import android.support.p018v7.view.menu.C0479n;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.view.menu.C0483p;
import android.support.p018v7.view.menu.C0487s;
import android.support.p018v7.view.menu.C0491u;
import android.support.p018v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.c */
class C0588c extends C0453b implements C0232c.C0233a {

    /* renamed from: A */
    private C0590b f2140A;

    /* renamed from: g */
    C0592d f2141g;

    /* renamed from: h */
    C0594e f2142h;

    /* renamed from: i */
    C0589a f2143i;

    /* renamed from: j */
    C0591c f2144j;

    /* renamed from: k */
    final C0595f f2145k = new C0595f();

    /* renamed from: l */
    int f2146l;

    /* renamed from: m */
    private Drawable f2147m;

    /* renamed from: n */
    private boolean f2148n;

    /* renamed from: o */
    private boolean f2149o;

    /* renamed from: p */
    private boolean f2150p;

    /* renamed from: q */
    private int f2151q;

    /* renamed from: r */
    private int f2152r;

    /* renamed from: s */
    private int f2153s;

    /* renamed from: t */
    private boolean f2154t;

    /* renamed from: u */
    private boolean f2155u;

    /* renamed from: v */
    private boolean f2156v;

    /* renamed from: w */
    private boolean f2157w;

    /* renamed from: x */
    private int f2158x;

    /* renamed from: y */
    private final SparseBooleanArray f2159y = new SparseBooleanArray();

    /* renamed from: z */
    private View f2160z;

    /* renamed from: android.support.v7.widget.c$a */
    private class C0589a extends C0479n {
        public C0589a(Context context, C0491u uVar, View view) {
            super(context, uVar, view, false, C0353a.C0354a.actionOverflowMenuStyle);
            if (!((C0469j) uVar.getItem()).mo2189j()) {
                mo2280a(C0588c.this.f2141g == null ? (View) C0588c.this.f1491f : C0588c.this.f2141g);
            }
            mo2279a((C0481o.C0482a) C0588c.this.f2145k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo2287e() {
            C0588c.this.f2143i = null;
            C0588c.this.f2146l = 0;
            super.mo2287e();
        }
    }

    /* renamed from: android.support.v7.widget.c$b */
    private class C0590b extends ActionMenuItemView.C0451b {
        C0590b() {
        }

        /* renamed from: a */
        public C0487s mo1957a() {
            if (C0588c.this.f2143i != null) {
                return C0588c.this.f2143i.mo2284b();
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.c$c */
    private class C0591c implements Runnable {

        /* renamed from: b */
        private C0594e f2164b;

        public C0591c(C0594e eVar) {
            this.f2164b = eVar;
        }

        public void run() {
            if (C0588c.this.f1488c != null) {
                C0588c.this.f1488c.mo2122g();
            }
            View view = (View) C0588c.this.f1491f;
            if (!(view == null || view.getWindowToken() == null || !this.f2164b.mo2285c())) {
                C0588c.this.f2142h = this.f2164b;
            }
            C0588c.this.f2144j = null;
        }
    }

    /* renamed from: android.support.v7.widget.c$d */
    private class C0592d extends C0618p implements ActionMenuView.C0499a {

        /* renamed from: b */
        private final float[] f2166b = new float[2];

        public C0592d(Context context) {
            super(context, (AttributeSet) null, C0353a.C0354a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0579aw.m2884a(this, getContentDescription());
            setOnTouchListener(new C0545ag(this, C0588c.this) {
                /* renamed from: a */
                public C0487s mo1955a() {
                    if (C0588c.this.f2142h == null) {
                        return null;
                    }
                    return C0588c.this.f2142h.mo2284b();
                }

                /* renamed from: b */
                public boolean mo1956b() {
                    C0588c.this.mo3007d();
                    return true;
                }

                /* renamed from: c */
                public boolean mo2778c() {
                    if (C0588c.this.f2144j != null) {
                        return false;
                    }
                    C0588c.this.mo3008e();
                    return true;
                }
            });
        }

        /* renamed from: c */
        public boolean mo1939c() {
            return false;
        }

        /* renamed from: d */
        public boolean mo1940d() {
            return false;
        }

        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                C0588c.this.mo3007d();
            }
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0270a.m1155a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.c$e */
    private class C0594e extends C0479n {
        public C0594e(Context context, C0465h hVar, View view, boolean z) {
            super(context, hVar, view, z, C0353a.C0354a.actionOverflowMenuStyle);
            mo2278a(8388613);
            mo2279a((C0481o.C0482a) C0588c.this.f2145k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo2287e() {
            if (C0588c.this.f1488c != null) {
                C0588c.this.f1488c.close();
            }
            C0588c.this.f2142h = null;
            super.mo2287e();
        }
    }

    /* renamed from: android.support.v7.widget.c$f */
    private class C0595f implements C0481o.C0482a {
        C0595f() {
        }

        /* renamed from: a */
        public void mo1665a(C0465h hVar, boolean z) {
            if (hVar instanceof C0491u) {
                hVar.mo2137q().mo2089a(false);
            }
            C0481o.C0482a a = C0588c.this.mo2011a();
            if (a != null) {
                a.mo1665a(hVar, z);
            }
        }

        /* renamed from: a */
        public boolean mo1666a(C0465h hVar) {
            if (hVar == null) {
                return false;
            }
            C0588c.this.f2146l = ((C0491u) hVar).getItem().getItemId();
            C0481o.C0482a a = C0588c.this.mo2011a();
            return a != null ? a.mo1666a(hVar) : false;
        }
    }

    public C0588c(Context context) {
        super(context, C0353a.C0360g.abc_action_menu_layout, C0353a.C0360g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m2906a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1491f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0483p.C0484a) && ((C0483p.C0484a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0483p mo2012a(ViewGroup viewGroup) {
        C0483p pVar = this.f1491f;
        C0483p a = super.mo2012a(viewGroup);
        if (pVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public View mo2013a(C0469j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo2193n()) {
            actionView = super.mo2013a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo2015a(Context context, C0465h hVar) {
        super.mo2015a(context, hVar);
        Resources resources = context.getResources();
        C0436a a = C0436a.m2038a(context);
        if (!this.f2150p) {
            this.f2149o = a.mo1866b();
        }
        if (!this.f2156v) {
            this.f2151q = a.mo1867c();
        }
        if (!this.f2154t) {
            this.f2153s = a.mo1865a();
        }
        int i = this.f2151q;
        if (this.f2149o) {
            if (this.f2141g == null) {
                this.f2141g = new C0592d(this.f1486a);
                if (this.f2148n) {
                    this.f2141g.setImageDrawable(this.f2147m);
                    this.f2147m = null;
                    this.f2148n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2141g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f2141g.getMeasuredWidth();
        } else {
            this.f2141g = null;
        }
        this.f2152r = i;
        this.f2158x = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f2160z = null;
    }

    /* renamed from: a */
    public void mo3001a(Configuration configuration) {
        if (!this.f2154t) {
            this.f2153s = C0436a.m2038a(this.f1487b).mo1865a();
        }
        if (this.f1488c != null) {
            this.f1488c.mo2106b(true);
        }
    }

    /* renamed from: a */
    public void mo3002a(Drawable drawable) {
        if (this.f2141g != null) {
            this.f2141g.setImageDrawable(drawable);
            return;
        }
        this.f2148n = true;
        this.f2147m = drawable;
    }

    /* renamed from: a */
    public void mo2016a(C0465h hVar, boolean z) {
        mo3009f();
        super.mo2016a(hVar, z);
    }

    /* renamed from: a */
    public void mo2017a(C0469j jVar, C0483p.C0484a aVar) {
        aVar.mo1936a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1491f);
        if (this.f2140A == null) {
            this.f2140A = new C0590b();
        }
        actionMenuItemView.setPopupCallback(this.f2140A);
    }

    /* renamed from: a */
    public void mo3003a(ActionMenuView actionMenuView) {
        this.f1491f = actionMenuView;
        actionMenuView.mo1958a(this.f1488c);
    }

    /* renamed from: a */
    public void mo1039a(boolean z) {
        if (z) {
            super.mo2022a((C0491u) null);
        } else if (this.f1488c != null) {
            this.f1488c.mo2089a(false);
        }
    }

    /* renamed from: a */
    public boolean mo2020a(int i, C0469j jVar) {
        return jVar.mo2189j();
    }

    /* renamed from: a */
    public boolean mo2022a(C0491u uVar) {
        boolean z;
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        C0491u uVar2 = uVar;
        while (uVar2.mo2327t() != this.f1488c) {
            uVar2 = (C0491u) uVar2.mo2327t();
        }
        View a = m2906a(uVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f2146l = uVar.getItem().getItemId();
        int size = uVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            MenuItem item = uVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f2143i = new C0589a(this.f1487b, uVar, a);
        this.f2143i.mo2282a(z);
        this.f2143i.mo2277a();
        super.mo2022a(uVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo2023a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f2141g) {
            return false;
        }
        return super.mo2023a(viewGroup, i);
    }

    /* renamed from: b */
    public void mo2025b(boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        super.mo2025b(z);
        ((View) this.f1491f).requestLayout();
        if (this.f1488c != null) {
            ArrayList<C0469j> l = this.f1488c.mo2130l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                C0232c a = l.get(i).mo726a();
                if (a != null) {
                    a.mo1030a((C0232c.C0233a) this);
                }
            }
        }
        ArrayList<C0469j> m = this.f1488c != null ? this.f1488c.mo2131m() : null;
        if (this.f2149o && m != null) {
            int size2 = m.size();
            if (size2 == 1) {
                z3 = !m.get(0).isActionViewExpanded();
            } else {
                if (size2 <= 0) {
                    z2 = false;
                }
                z3 = z2;
            }
        }
        if (z3) {
            if (this.f2141g == null) {
                this.f2141g = new C0592d(this.f1486a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2141g.getParent();
            if (viewGroup != this.f1491f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2141g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1491f;
                actionMenuView.addView(this.f2141g, actionMenuView.mo2436c());
            }
        } else if (this.f2141g != null && this.f2141g.getParent() == this.f1491f) {
            ((ViewGroup) this.f1491f).removeView(this.f2141g);
        }
        ((ActionMenuView) this.f1491f).setOverflowReserved(this.f2149o);
    }

    /* renamed from: b */
    public boolean mo2026b() {
        int i;
        ArrayList<C0469j> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        if (this.f1488c != null) {
            ArrayList<C0469j> j = this.f1488c.mo2128j();
            i = j.size();
            arrayList = j;
        } else {
            i = 0;
            arrayList = null;
        }
        int i7 = this.f2153s;
        int i8 = this.f2152r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f1491f;
        int i9 = 0;
        int i10 = 0;
        boolean z2 = false;
        int i11 = 0;
        while (i11 < i) {
            C0469j jVar = arrayList.get(i11);
            if (jVar.mo2191l()) {
                i9++;
            } else if (jVar.mo2190k()) {
                i10++;
            } else {
                z2 = true;
            }
            i11++;
            i7 = (!this.f2157w || !jVar.isActionViewExpanded()) ? i7 : 0;
        }
        if (this.f2149o && (z2 || i9 + i10 > i7)) {
            i7--;
        }
        int i12 = i7 - i9;
        SparseBooleanArray sparseBooleanArray = this.f2159y;
        sparseBooleanArray.clear();
        int i13 = 0;
        if (this.f2155u) {
            i13 = i8 / this.f2158x;
            i2 = ((i8 % this.f2158x) / i13) + this.f2158x;
        } else {
            i2 = 0;
        }
        int i14 = 0;
        int i15 = i13;
        int i16 = 0;
        while (i14 < i) {
            C0469j jVar2 = arrayList.get(i14);
            if (jVar2.mo2191l()) {
                View a = mo2013a(jVar2, this.f2160z, viewGroup);
                if (this.f2160z == null) {
                    this.f2160z = a;
                }
                if (this.f2155u) {
                    i15 -= ActionMenuView.m2437a(a, i2, i15, makeMeasureSpec, 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i4 = a.getMeasuredWidth();
                int i17 = i8 - i4;
                if (i16 != 0) {
                    i4 = i16;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.mo2165d(true);
                i3 = i15;
                i8 = i17;
            } else if (jVar2.mo2190k()) {
                int groupId2 = jVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i8 > 0 && (!this.f2155u || i15 > 0);
                if (z4) {
                    View a2 = mo2013a(jVar2, this.f2160z, viewGroup);
                    if (this.f2160z == null) {
                        this.f2160z = a2;
                    }
                    if (this.f2155u) {
                        int a3 = ActionMenuView.m2437a(a2, i2, i15, makeMeasureSpec, 0);
                        i5 = i15 - a3;
                        z4 = a3 == 0 ? false : z4;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        i5 = i15;
                    }
                    int measuredWidth = a2.getMeasuredWidth();
                    i8 -= measuredWidth;
                    if (i16 == 0) {
                        i16 = measuredWidth;
                    }
                    if (this.f2155u) {
                        z = z4 & (i8 >= 0);
                    } else {
                        z = z4 & (i8 + i16 > 0);
                    }
                } else {
                    z = z4;
                    i5 = i15;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                    i6 = i12;
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i18 = i12;
                    for (int i19 = 0; i19 < i14; i19++) {
                        C0469j jVar3 = arrayList.get(i19);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo2189j()) {
                                i18++;
                            }
                            jVar3.mo2165d(false);
                        }
                    }
                    i6 = i18;
                } else {
                    i6 = i12;
                }
                if (z) {
                    i6--;
                }
                jVar2.mo2165d(z);
                i3 = i5;
                i4 = i16;
                i12 = i6;
            } else {
                jVar2.mo2165d(false);
                i3 = i15;
                i4 = i16;
            }
            i14++;
            i15 = i3;
            i16 = i4;
        }
        return true;
    }

    /* renamed from: c */
    public Drawable mo3004c() {
        if (this.f2141g != null) {
            return this.f2141g.getDrawable();
        }
        if (this.f2148n) {
            return this.f2147m;
        }
        return null;
    }

    /* renamed from: c */
    public void mo3005c(boolean z) {
        this.f2149o = z;
        this.f2150p = true;
    }

    /* renamed from: d */
    public void mo3006d(boolean z) {
        this.f2157w = z;
    }

    /* renamed from: d */
    public boolean mo3007d() {
        if (!this.f2149o || mo3011h() || this.f1488c == null || this.f1491f == null || this.f2144j != null || this.f1488c.mo2131m().isEmpty()) {
            return false;
        }
        this.f2144j = new C0591c(new C0594e(this.f1487b, this.f1488c, this.f2141g, true));
        ((View) this.f1491f).post(this.f2144j);
        super.mo2022a((C0491u) null);
        return true;
    }

    /* renamed from: e */
    public boolean mo3008e() {
        if (this.f2144j == null || this.f1491f == null) {
            C0594e eVar = this.f2142h;
            if (eVar == null) {
                return false;
            }
            eVar.mo2286d();
            return true;
        }
        ((View) this.f1491f).removeCallbacks(this.f2144j);
        this.f2144j = null;
        return true;
    }

    /* renamed from: f */
    public boolean mo3009f() {
        return mo3008e() | mo3010g();
    }

    /* renamed from: g */
    public boolean mo3010g() {
        if (this.f2143i == null) {
            return false;
        }
        this.f2143i.mo2286d();
        return true;
    }

    /* renamed from: h */
    public boolean mo3011h() {
        return this.f2142h != null && this.f2142h.mo2288f();
    }

    /* renamed from: i */
    public boolean mo3012i() {
        return this.f2144j != null || mo3011h();
    }
}
