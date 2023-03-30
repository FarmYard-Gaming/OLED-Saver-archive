package android.support.p018v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.widget.C0559ak;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.t */
final class C0488t extends C0478m implements C0481o, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: e */
    private static final int f1639e = C0353a.C0360g.abc_popup_menu_item_layout;

    /* renamed from: a */
    final C0559ak f1640a;

    /* renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f1641b = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0488t.this.mo2043d() && !C0488t.this.f1640a.mo2841g()) {
                View view = C0488t.this.f1642c;
                if (view == null || !view.isShown()) {
                    C0488t.this.mo2040c();
                } else {
                    C0488t.this.f1640a.mo2033a();
                }
            }
        }
    };

    /* renamed from: c */
    View f1642c;

    /* renamed from: d */
    ViewTreeObserver f1643d;

    /* renamed from: f */
    private final Context f1644f;

    /* renamed from: g */
    private final C0465h f1645g;

    /* renamed from: h */
    private final C0464g f1646h;

    /* renamed from: i */
    private final boolean f1647i;

    /* renamed from: j */
    private final int f1648j;

    /* renamed from: k */
    private final int f1649k;

    /* renamed from: l */
    private final int f1650l;

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f1651m = new View.OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0488t.this.f1643d != null) {
                if (!C0488t.this.f1643d.isAlive()) {
                    C0488t.this.f1643d = view.getViewTreeObserver();
                }
                C0488t.this.f1643d.removeGlobalOnLayoutListener(C0488t.this.f1641b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: n */
    private PopupWindow.OnDismissListener f1652n;

    /* renamed from: o */
    private View f1653o;

    /* renamed from: p */
    private C0481o.C0482a f1654p;

    /* renamed from: q */
    private boolean f1655q;

    /* renamed from: r */
    private boolean f1656r;

    /* renamed from: s */
    private int f1657s;

    /* renamed from: t */
    private int f1658t = 0;

    /* renamed from: u */
    private boolean f1659u;

    public C0488t(Context context, C0465h hVar, View view, int i, int i2, boolean z) {
        this.f1644f = context;
        this.f1645g = hVar;
        this.f1647i = z;
        this.f1646h = new C0464g(hVar, LayoutInflater.from(context), this.f1647i, f1639e);
        this.f1649k = i;
        this.f1650l = i2;
        Resources resources = context.getResources();
        this.f1648j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0353a.C0357d.abc_config_prefDialogWidth));
        this.f1653o = view;
        this.f1640a = new C0559ak(this.f1644f, (AttributeSet) null, this.f1649k, this.f1650l);
        hVar.mo2086a((C0481o) this, context);
    }

    /* renamed from: h */
    private boolean m2371h() {
        if (mo2043d()) {
            return true;
        }
        if (this.f1655q || this.f1653o == null) {
            return false;
        }
        this.f1642c = this.f1653o;
        this.f1640a.mo2831a((PopupWindow.OnDismissListener) this);
        this.f1640a.mo2829a((AdapterView.OnItemClickListener) this);
        this.f1640a.mo2832a(true);
        View view = this.f1642c;
        boolean z = this.f1643d == null;
        this.f1643d = view.getViewTreeObserver();
        if (z) {
            this.f1643d.addOnGlobalLayoutListener(this.f1641b);
        }
        view.addOnAttachStateChangeListener(this.f1651m);
        this.f1640a.mo2834b(view);
        this.f1640a.mo2838e(this.f1658t);
        if (!this.f1656r) {
            this.f1657s = m2320a(this.f1646h, (ViewGroup) null, this.f1644f, this.f1648j);
            this.f1656r = true;
        }
        this.f1640a.mo2840g(this.f1657s);
        this.f1640a.mo2843h(2);
        this.f1640a.mo2827a(mo2275g());
        this.f1640a.mo2033a();
        ListView e = this.f1640a.mo2044e();
        e.setOnKeyListener(this);
        if (this.f1659u && this.f1645g.mo2132n() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1644f).inflate(C0353a.C0360g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1645g.mo2132n());
            }
            frameLayout.setEnabled(false);
            e.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1640a.mo2830a((ListAdapter) this.f1646h);
        this.f1640a.mo2033a();
        return true;
    }

    /* renamed from: a */
    public void mo2033a() {
        if (!m2371h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void mo2034a(int i) {
        this.f1658t = i;
    }

    /* renamed from: a */
    public void mo2035a(C0465h hVar) {
    }

    /* renamed from: a */
    public void mo2016a(C0465h hVar, boolean z) {
        if (hVar == this.f1645g) {
            mo2040c();
            if (this.f1654p != null) {
                this.f1654p.mo1665a(hVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo2018a(C0481o.C0482a aVar) {
        this.f1654p = aVar;
    }

    /* renamed from: a */
    public void mo2036a(View view) {
        this.f1653o = view;
    }

    /* renamed from: a */
    public void mo2037a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1652n = onDismissListener;
    }

    /* renamed from: a */
    public void mo2038a(boolean z) {
        this.f1646h.mo2067a(z);
    }

    /* renamed from: a */
    public boolean mo2022a(C0491u uVar) {
        if (uVar.hasVisibleItems()) {
            C0479n nVar = new C0479n(this.f1644f, uVar, this.f1642c, this.f1647i, this.f1649k, this.f1650l);
            nVar.mo2279a(this.f1654p);
            nVar.mo2282a(C0478m.m2322b((C0465h) uVar));
            nVar.mo2281a(this.f1652n);
            this.f1652n = null;
            this.f1645g.mo2089a(false);
            int j = this.f1640a.mo2846j();
            int k = this.f1640a.mo2847k();
            if ((Gravity.getAbsoluteGravity(this.f1658t, C0249q.m1059b(this.f1653o)) & 7) == 5) {
                j += this.f1653o.getWidth();
            }
            if (nVar.mo2283a(j, k)) {
                if (this.f1654p != null) {
                    this.f1654p.mo1666a(uVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo2039b(int i) {
        this.f1640a.mo2836c(i);
    }

    /* renamed from: b */
    public void mo2025b(boolean z) {
        this.f1656r = false;
        if (this.f1646h != null) {
            this.f1646h.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo2026b() {
        return false;
    }

    /* renamed from: c */
    public void mo2040c() {
        if (mo2043d()) {
            this.f1640a.mo2040c();
        }
    }

    /* renamed from: c */
    public void mo2041c(int i) {
        this.f1640a.mo2837d(i);
    }

    /* renamed from: c */
    public void mo2042c(boolean z) {
        this.f1659u = z;
    }

    /* renamed from: d */
    public boolean mo2043d() {
        return !this.f1655q && this.f1640a.mo2043d();
    }

    /* renamed from: e */
    public ListView mo2044e() {
        return this.f1640a.mo2044e();
    }

    public void onDismiss() {
        this.f1655q = true;
        this.f1645g.close();
        if (this.f1643d != null) {
            if (!this.f1643d.isAlive()) {
                this.f1643d = this.f1642c.getViewTreeObserver();
            }
            this.f1643d.removeGlobalOnLayoutListener(this.f1641b);
            this.f1643d = null;
        }
        this.f1642c.removeOnAttachStateChangeListener(this.f1651m);
        if (this.f1652n != null) {
            this.f1652n.onDismiss();
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
