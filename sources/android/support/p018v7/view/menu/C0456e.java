package android.support.p018v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p006v4.p015g.C0235d;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.widget.C0558aj;
import android.support.p018v7.widget.C0559ak;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
final class C0456e extends C0478m implements C0481o, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: g */
    private static final int f1500g = C0353a.C0360g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f1501A;

    /* renamed from: a */
    final Handler f1502a;

    /* renamed from: b */
    final List<C0461a> f1503b = new ArrayList();

    /* renamed from: c */
    final ViewTreeObserver.OnGlobalLayoutListener f1504c = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0456e.this.mo2043d() && C0456e.this.f1503b.size() > 0 && !C0456e.this.f1503b.get(0).f1534a.mo2841g()) {
                View view = C0456e.this.f1505d;
                if (view == null || !view.isShown()) {
                    C0456e.this.mo2040c();
                    return;
                }
                for (C0461a aVar : C0456e.this.f1503b) {
                    aVar.f1534a.mo2033a();
                }
            }
        }
    };

    /* renamed from: d */
    View f1505d;

    /* renamed from: e */
    ViewTreeObserver f1506e;

    /* renamed from: f */
    boolean f1507f;

    /* renamed from: h */
    private final Context f1508h;

    /* renamed from: i */
    private final int f1509i;

    /* renamed from: j */
    private final int f1510j;

    /* renamed from: k */
    private final int f1511k;

    /* renamed from: l */
    private final boolean f1512l;

    /* renamed from: m */
    private final List<C0465h> f1513m = new ArrayList();

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f1514n = new View.OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0456e.this.f1506e != null) {
                if (!C0456e.this.f1506e.isAlive()) {
                    C0456e.this.f1506e = view.getViewTreeObserver();
                }
                C0456e.this.f1506e.removeGlobalOnLayoutListener(C0456e.this.f1504c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: o */
    private final C0558aj f1515o = new C0558aj() {
        /* renamed from: a */
        public void mo2051a(C0465h hVar, MenuItem menuItem) {
            C0456e.this.f1502a.removeCallbacksAndMessages(hVar);
        }

        /* renamed from: b */
        public void mo2052b(final C0465h hVar, final MenuItem menuItem) {
            int i;
            C0456e.this.f1502a.removeCallbacksAndMessages((Object) null);
            int i2 = 0;
            int size = C0456e.this.f1503b.size();
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                } else if (hVar == C0456e.this.f1503b.get(i2).f1535b) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i != -1) {
                int i3 = i + 1;
                final C0461a aVar = i3 < C0456e.this.f1503b.size() ? C0456e.this.f1503b.get(i3) : null;
                C0456e.this.f1502a.postAtTime(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            C0456e.this.f1507f = true;
                            aVar.f1535b.mo2089a(false);
                            C0456e.this.f1507f = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            hVar.mo2091a(menuItem, 4);
                        }
                    }
                }, hVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: p */
    private int f1516p = 0;

    /* renamed from: q */
    private int f1517q = 0;

    /* renamed from: r */
    private View f1518r;

    /* renamed from: s */
    private int f1519s;

    /* renamed from: t */
    private boolean f1520t;

    /* renamed from: u */
    private boolean f1521u;

    /* renamed from: v */
    private int f1522v;

    /* renamed from: w */
    private int f1523w;

    /* renamed from: x */
    private boolean f1524x;

    /* renamed from: y */
    private boolean f1525y;

    /* renamed from: z */
    private C0481o.C0482a f1526z;

    /* renamed from: android.support.v7.view.menu.e$a */
    private static class C0461a {

        /* renamed from: a */
        public final C0559ak f1534a;

        /* renamed from: b */
        public final C0465h f1535b;

        /* renamed from: c */
        public final int f1536c;

        public C0461a(C0559ak akVar, C0465h hVar, int i) {
            this.f1534a = akVar;
            this.f1535b = hVar;
            this.f1536c = i;
        }

        /* renamed from: a */
        public ListView mo2054a() {
            return this.f1534a.mo2044e();
        }
    }

    public C0456e(Context context, View view, int i, int i2, boolean z) {
        this.f1508h = context;
        this.f1518r = view;
        this.f1510j = i;
        this.f1511k = i2;
        this.f1512l = z;
        this.f1524x = false;
        this.f1519s = m2174i();
        Resources resources = context.getResources();
        this.f1509i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0353a.C0357d.abc_config_prefDialogWidth));
        this.f1502a = new Handler();
    }

    /* renamed from: a */
    private MenuItem m2168a(C0465h hVar, C0465h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m2169a(C0461a aVar, C0465h hVar) {
        C0464g gVar;
        int i;
        int i2;
        int i3 = 0;
        MenuItem a = m2168a(aVar.f1535b, hVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo2054a();
        ListAdapter adapter = a2.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (C0464g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (C0464g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i3 >= count) {
                i2 = -1;
                break;
            } else if (a == gVar.getItem(i3)) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: c */
    private void m2170c(C0465h hVar) {
        View view;
        C0461a aVar;
        int i;
        int i2;
        LayoutInflater from = LayoutInflater.from(this.f1508h);
        C0464g gVar = new C0464g(hVar, from, this.f1512l, f1500g);
        if (!mo2043d() && this.f1524x) {
            gVar.mo2067a(true);
        } else if (mo2043d()) {
            gVar.mo2067a(C0478m.m2322b(hVar));
        }
        int a = m2320a(gVar, (ViewGroup) null, this.f1508h, this.f1509i);
        C0559ak h = m2173h();
        h.mo2830a((ListAdapter) gVar);
        h.mo2840g(a);
        h.mo2838e(this.f1517q);
        if (this.f1503b.size() > 0) {
            C0461a aVar2 = this.f1503b.get(this.f1503b.size() - 1);
            view = m2169a(aVar2, hVar);
            aVar = aVar2;
        } else {
            view = null;
            aVar = null;
        }
        if (view != null) {
            h.mo2864c(false);
            h.mo2862a((Object) null);
            int d = m2171d(a);
            boolean z = d == 1;
            this.f1519s = d;
            if (Build.VERSION.SDK_INT >= 26) {
                h.mo2834b(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1518r.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1517q & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1518r.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            h.mo2836c((this.f1517q & 5) == 5 ? z ? i + a : i - view.getWidth() : z ? view.getWidth() + i : i - a);
            h.mo2835b(true);
            h.mo2837d(i2);
        } else {
            if (this.f1520t) {
                h.mo2836c(this.f1522v);
            }
            if (this.f1521u) {
                h.mo2837d(this.f1523w);
            }
            h.mo2827a(mo2275g());
        }
        this.f1503b.add(new C0461a(h, hVar, this.f1519s));
        h.mo2033a();
        ListView e = h.mo2044e();
        e.setOnKeyListener(this);
        if (aVar == null && this.f1525y && hVar.mo2132n() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0353a.C0360g.abc_popup_menu_header_item_layout, e, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(hVar.mo2132n());
            e.addHeaderView(frameLayout, (Object) null, false);
            h.mo2033a();
        }
    }

    /* renamed from: d */
    private int m2171d(int i) {
        ListView a = this.f1503b.get(this.f1503b.size() - 1).mo2054a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1505d.getWindowVisibleDisplayFrame(rect);
        if (this.f1519s != 1) {
            return iArr[0] - i < 0 ? 1 : 0;
        }
        return (a.getWidth() + iArr[0]) + i > rect.right ? 0 : 1;
    }

    /* renamed from: d */
    private int m2172d(C0465h hVar) {
        int size = this.f1503b.size();
        for (int i = 0; i < size; i++) {
            if (hVar == this.f1503b.get(i).f1535b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    private C0559ak m2173h() {
        C0559ak akVar = new C0559ak(this.f1508h, (AttributeSet) null, this.f1510j, this.f1511k);
        akVar.mo2861a(this.f1515o);
        akVar.mo2829a((AdapterView.OnItemClickListener) this);
        akVar.mo2831a((PopupWindow.OnDismissListener) this);
        akVar.mo2834b(this.f1518r);
        akVar.mo2838e(this.f1517q);
        akVar.mo2832a(true);
        akVar.mo2843h(2);
        return akVar;
    }

    /* renamed from: i */
    private int m2174i() {
        return C0249q.m1059b(this.f1518r) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo2033a() {
        if (!mo2043d()) {
            for (C0465h c : this.f1513m) {
                m2170c(c);
            }
            this.f1513m.clear();
            this.f1505d = this.f1518r;
            if (this.f1505d != null) {
                boolean z = this.f1506e == null;
                this.f1506e = this.f1505d.getViewTreeObserver();
                if (z) {
                    this.f1506e.addOnGlobalLayoutListener(this.f1504c);
                }
                this.f1505d.addOnAttachStateChangeListener(this.f1514n);
            }
        }
    }

    /* renamed from: a */
    public void mo2034a(int i) {
        if (this.f1516p != i) {
            this.f1516p = i;
            this.f1517q = C0235d.m1006a(i, C0249q.m1059b(this.f1518r));
        }
    }

    /* renamed from: a */
    public void mo2035a(C0465h hVar) {
        hVar.mo2086a((C0481o) this, this.f1508h);
        if (mo2043d()) {
            m2170c(hVar);
        } else {
            this.f1513m.add(hVar);
        }
    }

    /* renamed from: a */
    public void mo2016a(C0465h hVar, boolean z) {
        int d = m2172d(hVar);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f1503b.size()) {
                this.f1503b.get(i).f1535b.mo2089a(false);
            }
            C0461a remove = this.f1503b.remove(d);
            remove.f1535b.mo2105b((C0481o) this);
            if (this.f1507f) {
                remove.f1534a.mo2863b((Object) null);
                remove.f1534a.mo2833b(0);
            }
            remove.f1534a.mo2040c();
            int size = this.f1503b.size();
            if (size > 0) {
                this.f1519s = this.f1503b.get(size - 1).f1536c;
            } else {
                this.f1519s = m2174i();
            }
            if (size == 0) {
                mo2040c();
                if (this.f1526z != null) {
                    this.f1526z.mo1665a(hVar, true);
                }
                if (this.f1506e != null) {
                    if (this.f1506e.isAlive()) {
                        this.f1506e.removeGlobalOnLayoutListener(this.f1504c);
                    }
                    this.f1506e = null;
                }
                this.f1505d.removeOnAttachStateChangeListener(this.f1514n);
                this.f1501A.onDismiss();
            } else if (z) {
                this.f1503b.get(0).f1535b.mo2089a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo2018a(C0481o.C0482a aVar) {
        this.f1526z = aVar;
    }

    /* renamed from: a */
    public void mo2036a(View view) {
        if (this.f1518r != view) {
            this.f1518r = view;
            this.f1517q = C0235d.m1006a(this.f1516p, C0249q.m1059b(this.f1518r));
        }
    }

    /* renamed from: a */
    public void mo2037a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1501A = onDismissListener;
    }

    /* renamed from: a */
    public void mo2038a(boolean z) {
        this.f1524x = z;
    }

    /* renamed from: a */
    public boolean mo2022a(C0491u uVar) {
        for (C0461a next : this.f1503b) {
            if (uVar == next.f1535b) {
                next.mo2054a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        mo2035a((C0465h) uVar);
        if (this.f1526z != null) {
            this.f1526z.mo1666a(uVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo2039b(int i) {
        this.f1520t = true;
        this.f1522v = i;
    }

    /* renamed from: b */
    public void mo2025b(boolean z) {
        for (C0461a a : this.f1503b) {
            m2321a(a.mo2054a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo2026b() {
        return false;
    }

    /* renamed from: c */
    public void mo2040c() {
        int size = this.f1503b.size();
        if (size > 0) {
            C0461a[] aVarArr = (C0461a[]) this.f1503b.toArray(new C0461a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0461a aVar = aVarArr[i];
                if (aVar.f1534a.mo2043d()) {
                    aVar.f1534a.mo2040c();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2041c(int i) {
        this.f1521u = true;
        this.f1523w = i;
    }

    /* renamed from: c */
    public void mo2042c(boolean z) {
        this.f1525y = z;
    }

    /* renamed from: d */
    public boolean mo2043d() {
        return this.f1503b.size() > 0 && this.f1503b.get(0).f1534a.mo2043d();
    }

    /* renamed from: e */
    public ListView mo2044e() {
        if (this.f1503b.isEmpty()) {
            return null;
        }
        return this.f1503b.get(this.f1503b.size() - 1).mo2054a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo2045f() {
        return false;
    }

    public void onDismiss() {
        C0461a aVar;
        int size = this.f1503b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f1503b.get(i);
            if (!aVar.f1534a.mo2043d()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f1535b.mo2089a(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo2040c();
        return true;
    }
}
