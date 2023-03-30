package android.support.p018v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.p015g.C0256u;
import android.support.p006v4.p015g.C0260v;
import android.support.p006v4.p015g.C0261w;
import android.support.p006v4.p015g.C0262x;
import android.support.p018v7.app.C0378a;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.C0436a;
import android.support.p018v7.view.C0437b;
import android.support.p018v7.view.C0444g;
import android.support.p018v7.view.C0447h;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.widget.ActionBarContainer;
import android.support.p018v7.widget.ActionBarContextView;
import android.support.p018v7.widget.ActionBarOverlayLayout;
import android.support.p018v7.widget.C0538ac;
import android.support.p018v7.widget.C0563an;
import android.support.p018v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.l */
public class C0414l extends C0378a implements ActionBarOverlayLayout.C0497a {

    /* renamed from: s */
    static final /* synthetic */ boolean f1243s = (!C0414l.class.desiredAssertionStatus());

    /* renamed from: t */
    private static final Interpolator f1244t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f1245u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f1246A;

    /* renamed from: B */
    private boolean f1247B;

    /* renamed from: C */
    private ArrayList<C0378a.C0380b> f1248C = new ArrayList<>();

    /* renamed from: D */
    private boolean f1249D;

    /* renamed from: E */
    private int f1250E = 0;

    /* renamed from: F */
    private boolean f1251F;

    /* renamed from: G */
    private boolean f1252G = true;

    /* renamed from: H */
    private boolean f1253H;

    /* renamed from: a */
    Context f1254a;

    /* renamed from: b */
    ActionBarOverlayLayout f1255b;

    /* renamed from: c */
    ActionBarContainer f1256c;

    /* renamed from: d */
    C0538ac f1257d;

    /* renamed from: e */
    ActionBarContextView f1258e;

    /* renamed from: f */
    View f1259f;

    /* renamed from: g */
    C0563an f1260g;

    /* renamed from: h */
    C0418a f1261h;

    /* renamed from: i */
    C0437b f1262i;

    /* renamed from: j */
    C0437b.C0438a f1263j;

    /* renamed from: k */
    boolean f1264k = true;

    /* renamed from: l */
    boolean f1265l;

    /* renamed from: m */
    boolean f1266m;

    /* renamed from: n */
    C0447h f1267n;

    /* renamed from: o */
    boolean f1268o;

    /* renamed from: p */
    final C0260v f1269p = new C0261w() {
        /* renamed from: b */
        public void mo1091b(View view) {
            if (C0414l.this.f1264k && C0414l.this.f1259f != null) {
                C0414l.this.f1259f.setTranslationY(0.0f);
                C0414l.this.f1256c.setTranslationY(0.0f);
            }
            C0414l.this.f1256c.setVisibility(8);
            C0414l.this.f1256c.setTransitioning(false);
            C0414l.this.f1267n = null;
            C0414l.this.mo1712h();
            if (C0414l.this.f1255b != null) {
                C0249q.m1065g(C0414l.this.f1255b);
            }
        }
    };

    /* renamed from: q */
    final C0260v f1270q = new C0261w() {
        /* renamed from: b */
        public void mo1091b(View view) {
            C0414l.this.f1267n = null;
            C0414l.this.f1256c.requestLayout();
        }
    };

    /* renamed from: r */
    final C0262x f1271r = new C0262x() {
        /* renamed from: a */
        public void mo1093a(View view) {
            ((View) C0414l.this.f1256c.getParent()).invalidate();
        }
    };

    /* renamed from: v */
    private Context f1272v;

    /* renamed from: w */
    private Activity f1273w;

    /* renamed from: x */
    private Dialog f1274x;

    /* renamed from: y */
    private ArrayList<Object> f1275y = new ArrayList<>();

    /* renamed from: z */
    private int f1276z = -1;

    /* renamed from: android.support.v7.app.l$a */
    public class C0418a extends C0437b implements C0465h.C0466a {

        /* renamed from: b */
        private final Context f1281b;

        /* renamed from: c */
        private final C0465h f1282c;

        /* renamed from: d */
        private C0437b.C0438a f1283d;

        /* renamed from: e */
        private WeakReference<View> f1284e;

        public C0418a(Context context, C0437b.C0438a aVar) {
            this.f1281b = context;
            this.f1283d = aVar;
            this.f1282c = new C0465h(context).mo2075a(1);
            this.f1282c.mo2083a((C0465h.C0466a) this);
        }

        /* renamed from: a */
        public MenuInflater mo1721a() {
            return new C0444g(this.f1281b);
        }

        /* renamed from: a */
        public void mo1722a(int i) {
            mo1728b((CharSequence) C0414l.this.f1254a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo1633a(C0465h hVar) {
            if (this.f1283d != null) {
                mo1730d();
                C0414l.this.f1258e.mo2358a();
            }
        }

        /* renamed from: a */
        public void mo1723a(View view) {
            C0414l.this.f1258e.setCustomView(view);
            this.f1284e = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo1724a(CharSequence charSequence) {
            C0414l.this.f1258e.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo1725a(boolean z) {
            super.mo1725a(z);
            C0414l.this.f1258e.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo1636a(C0465h hVar, MenuItem menuItem) {
            if (this.f1283d != null) {
                return this.f1283d.mo1669a((C0437b) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public Menu mo1726b() {
            return this.f1282c;
        }

        /* renamed from: b */
        public void mo1727b(int i) {
            mo1724a((CharSequence) C0414l.this.f1254a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo1728b(CharSequence charSequence) {
            C0414l.this.f1258e.setTitle(charSequence);
        }

        /* renamed from: c */
        public void mo1729c() {
            if (C0414l.this.f1261h == this) {
                if (!C0414l.m1893a(C0414l.this.f1265l, C0414l.this.f1266m, false)) {
                    C0414l.this.f1262i = this;
                    C0414l.this.f1263j = this.f1283d;
                } else {
                    this.f1283d.mo1667a(this);
                }
                this.f1283d = null;
                C0414l.this.mo1717j(false);
                C0414l.this.f1258e.mo2359b();
                C0414l.this.f1257d.mo2732a().sendAccessibilityEvent(32);
                C0414l.this.f1255b.setHideOnContentScrollEnabled(C0414l.this.f1268o);
                C0414l.this.f1261h = null;
            }
        }

        /* renamed from: d */
        public void mo1730d() {
            if (C0414l.this.f1261h == this) {
                this.f1282c.mo2124h();
                try {
                    this.f1283d.mo1670b(this, this.f1282c);
                } finally {
                    this.f1282c.mo2126i();
                }
            }
        }

        /* renamed from: e */
        public boolean mo1731e() {
            this.f1282c.mo2124h();
            try {
                return this.f1283d.mo1668a((C0437b) this, (Menu) this.f1282c);
            } finally {
                this.f1282c.mo2126i();
            }
        }

        /* renamed from: f */
        public CharSequence mo1732f() {
            return C0414l.this.f1258e.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo1733g() {
            return C0414l.this.f1258e.getSubtitle();
        }

        /* renamed from: h */
        public boolean mo1734h() {
            return C0414l.this.f1258e.mo2361d();
        }

        /* renamed from: i */
        public View mo1735i() {
            if (this.f1284e != null) {
                return (View) this.f1284e.get();
            }
            return null;
        }
    }

    public C0414l(Activity activity, boolean z) {
        this.f1273w = activity;
        View decorView = activity.getWindow().getDecorView();
        m1892a(decorView);
        if (!z) {
            this.f1259f = decorView.findViewById(16908290);
        }
    }

    public C0414l(Dialog dialog) {
        this.f1274x = dialog;
        m1892a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m1892a(View view) {
        this.f1255b = (ActionBarOverlayLayout) view.findViewById(C0353a.C0359f.decor_content_parent);
        if (this.f1255b != null) {
            this.f1255b.setActionBarVisibilityCallback(this);
        }
        this.f1257d = m1894b(view.findViewById(C0353a.C0359f.action_bar));
        this.f1258e = (ActionBarContextView) view.findViewById(C0353a.C0359f.action_context_bar);
        this.f1256c = (ActionBarContainer) view.findViewById(C0353a.C0359f.action_bar_container);
        if (this.f1257d == null || this.f1258e == null || this.f1256c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f1254a = this.f1257d.mo2741b();
        boolean z = (this.f1257d.mo2758o() & 4) != 0;
        if (z) {
            this.f1246A = true;
        }
        C0436a a = C0436a.m2038a(this.f1254a);
        mo1550a(a.mo1870f() || z);
        m1895k(a.mo1868d());
        TypedArray obtainStyledAttributes = this.f1254a.obtainStyledAttributes((AttributeSet) null, C0353a.C0363j.ActionBar, C0353a.C0354a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0353a.C0363j.ActionBar_hideOnContentScroll, false)) {
            mo1554b(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0353a.C0363j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo1547a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    static boolean m1893a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private C0538ac m1894b(View view) {
        if (view instanceof C0538ac) {
            return (C0538ac) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + (view != null ? view.getClass().getSimpleName() : "null"));
    }

    /* renamed from: k */
    private void m1895k(boolean z) {
        boolean z2 = true;
        this.f1249D = z;
        if (!this.f1249D) {
            this.f1257d.mo2736a((C0563an) null);
            this.f1256c.setTabContainer(this.f1260g);
        } else {
            this.f1256c.setTabContainer((C0563an) null);
            this.f1257d.mo2736a(this.f1260g);
        }
        boolean z3 = mo1714i() == 2;
        if (this.f1260g != null) {
            if (z3) {
                this.f1260g.setVisibility(0);
                if (this.f1255b != null) {
                    C0249q.m1065g(this.f1255b);
                }
            } else {
                this.f1260g.setVisibility(8);
            }
        }
        this.f1257d.mo2740a(!this.f1249D && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1255b;
        if (this.f1249D || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: l */
    private void m1896l(boolean z) {
        if (m1893a(this.f1265l, this.f1266m, this.f1251F)) {
            if (!this.f1252G) {
                this.f1252G = true;
                mo1713h(z);
            }
        } else if (this.f1252G) {
            this.f1252G = false;
            mo1715i(z);
        }
    }

    /* renamed from: n */
    private void m1897n() {
        if (!this.f1251F) {
            this.f1251F = true;
            if (this.f1255b != null) {
                this.f1255b.setShowingForActionMode(true);
            }
            m1896l(false);
        }
    }

    /* renamed from: o */
    private void m1898o() {
        if (this.f1251F) {
            this.f1251F = false;
            if (this.f1255b != null) {
                this.f1255b.setShowingForActionMode(false);
            }
            m1896l(false);
        }
    }

    /* renamed from: p */
    private boolean m1899p() {
        return C0249q.m1070l(this.f1256c);
    }

    /* renamed from: a */
    public int mo1545a() {
        return this.f1257d.mo2758o();
    }

    /* renamed from: a */
    public C0437b mo1546a(C0437b.C0438a aVar) {
        if (this.f1261h != null) {
            this.f1261h.mo1729c();
        }
        this.f1255b.setHideOnContentScrollEnabled(false);
        this.f1258e.mo2360c();
        C0418a aVar2 = new C0418a(this.f1258e.getContext(), aVar);
        if (!aVar2.mo1731e()) {
            return null;
        }
        this.f1261h = aVar2;
        aVar2.mo1730d();
        this.f1258e.mo2357a(aVar2);
        mo1717j(true);
        this.f1258e.sendAccessibilityEvent(32);
        return aVar2;
    }

    /* renamed from: a */
    public void mo1547a(float f) {
        C0249q.m1048a((View) this.f1256c, f);
    }

    /* renamed from: a */
    public void mo1708a(int i) {
        this.f1250E = i;
    }

    /* renamed from: a */
    public void mo1709a(int i, int i2) {
        int o = this.f1257d.mo2758o();
        if ((i2 & 4) != 0) {
            this.f1246A = true;
        }
        this.f1257d.mo2744c((o & (i2 ^ -1)) | (i & i2));
    }

    /* renamed from: a */
    public void mo1548a(Configuration configuration) {
        m1895k(C0436a.m2038a(this.f1254a).mo1868d());
    }

    /* renamed from: a */
    public void mo1549a(CharSequence charSequence) {
        this.f1257d.mo2739a(charSequence);
    }

    /* renamed from: a */
    public void mo1550a(boolean z) {
        this.f1257d.mo2743b(z);
    }

    /* renamed from: a */
    public boolean mo1551a(int i, KeyEvent keyEvent) {
        Menu b;
        if (this.f1261h == null || (b = this.f1261h.mo1726b()) == null) {
            return false;
        }
        b.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public Context mo1553b() {
        if (this.f1272v == null) {
            TypedValue typedValue = new TypedValue();
            this.f1254a.getTheme().resolveAttribute(C0353a.C0354a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1272v = new ContextThemeWrapper(this.f1254a, i);
            } else {
                this.f1272v = this.f1254a;
            }
        }
        return this.f1272v;
    }

    /* renamed from: b */
    public void mo1554b(boolean z) {
        if (!z || this.f1255b.mo2385a()) {
            this.f1268o = z;
            this.f1255b.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: c */
    public void mo1555c(boolean z) {
        if (!this.f1246A) {
            mo1710f(z);
        }
    }

    /* renamed from: d */
    public void mo1557d(boolean z) {
        this.f1253H = z;
        if (!z && this.f1267n != null) {
            this.f1267n.mo1919c();
        }
    }

    /* renamed from: e */
    public void mo1559e(boolean z) {
        if (z != this.f1247B) {
            this.f1247B = z;
            int size = this.f1248C.size();
            for (int i = 0; i < size; i++) {
                this.f1248C.get(i).mo1563a(z);
            }
        }
    }

    /* renamed from: f */
    public void mo1710f(boolean z) {
        mo1709a(z ? 4 : 0, 4);
    }

    /* renamed from: f */
    public boolean mo1561f() {
        if (this.f1257d == null || !this.f1257d.mo2745c()) {
            return false;
        }
        this.f1257d.mo2746d();
        return true;
    }

    /* renamed from: g */
    public void mo1711g(boolean z) {
        this.f1264k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1712h() {
        if (this.f1263j != null) {
            this.f1263j.mo1667a(this.f1262i);
            this.f1262i = null;
            this.f1263j = null;
        }
    }

    /* renamed from: h */
    public void mo1713h(boolean z) {
        if (this.f1267n != null) {
            this.f1267n.mo1919c();
        }
        this.f1256c.setVisibility(0);
        if (this.f1250E != 0 || (!this.f1253H && !z)) {
            this.f1256c.setAlpha(1.0f);
            this.f1256c.setTranslationY(0.0f);
            if (this.f1264k && this.f1259f != null) {
                this.f1259f.setTranslationY(0.0f);
            }
            this.f1270q.mo1091b((View) null);
        } else {
            this.f1256c.setTranslationY(0.0f);
            float f = (float) (-this.f1256c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f1256c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f1256c.setTranslationY(f);
            C0447h hVar = new C0447h();
            C0256u b = C0249q.m1062d(this.f1256c).mo1082b(0.0f);
            b.mo1080a(this.f1271r);
            hVar.mo1913a(b);
            if (this.f1264k && this.f1259f != null) {
                this.f1259f.setTranslationY(f);
                hVar.mo1913a(C0249q.m1062d(this.f1259f).mo1082b(0.0f));
            }
            hVar.mo1916a(f1245u);
            hVar.mo1912a(250);
            hVar.mo1915a(this.f1270q);
            this.f1267n = hVar;
            hVar.mo1917a();
        }
        if (this.f1255b != null) {
            C0249q.m1065g(this.f1255b);
        }
    }

    /* renamed from: i */
    public int mo1714i() {
        return this.f1257d.mo2759p();
    }

    /* renamed from: i */
    public void mo1715i(boolean z) {
        if (this.f1267n != null) {
            this.f1267n.mo1919c();
        }
        if (this.f1250E != 0 || (!this.f1253H && !z)) {
            this.f1269p.mo1091b((View) null);
            return;
        }
        this.f1256c.setAlpha(1.0f);
        this.f1256c.setTransitioning(true);
        C0447h hVar = new C0447h();
        float f = (float) (-this.f1256c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f1256c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0256u b = C0249q.m1062d(this.f1256c).mo1082b(f);
        b.mo1080a(this.f1271r);
        hVar.mo1913a(b);
        if (this.f1264k && this.f1259f != null) {
            hVar.mo1913a(C0249q.m1062d(this.f1259f).mo1082b(f));
        }
        hVar.mo1916a(f1244t);
        hVar.mo1912a(250);
        hVar.mo1915a(this.f1269p);
        this.f1267n = hVar;
        hVar.mo1917a();
    }

    /* renamed from: j */
    public void mo1716j() {
        if (this.f1266m) {
            this.f1266m = false;
            m1896l(true);
        }
    }

    /* renamed from: j */
    public void mo1717j(boolean z) {
        C0256u a;
        C0256u a2;
        if (z) {
            m1897n();
        } else {
            m1898o();
        }
        if (m1899p()) {
            if (z) {
                a2 = this.f1257d.mo2731a(4, 100);
                a = this.f1258e.mo2356a(0, 200);
            } else {
                a = this.f1257d.mo2731a(0, 200);
                a2 = this.f1258e.mo2356a(8, 100);
            }
            C0447h hVar = new C0447h();
            hVar.mo1914a(a2, a);
            hVar.mo1917a();
        } else if (z) {
            this.f1257d.mo2747d(4);
            this.f1258e.setVisibility(0);
        } else {
            this.f1257d.mo2747d(0);
            this.f1258e.setVisibility(8);
        }
    }

    /* renamed from: k */
    public void mo1718k() {
        if (!this.f1266m) {
            this.f1266m = true;
            m1896l(true);
        }
    }

    /* renamed from: l */
    public void mo1719l() {
        if (this.f1267n != null) {
            this.f1267n.mo1919c();
            this.f1267n = null;
        }
    }

    /* renamed from: m */
    public void mo1720m() {
    }
}
