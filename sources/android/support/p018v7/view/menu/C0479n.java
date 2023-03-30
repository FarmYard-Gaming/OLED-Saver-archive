package android.support.p018v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.p006v4.p015g.C0235d;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0481o;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.n */
public class C0479n {

    /* renamed from: a */
    private final Context f1626a;

    /* renamed from: b */
    private final C0465h f1627b;

    /* renamed from: c */
    private final boolean f1628c;

    /* renamed from: d */
    private final int f1629d;

    /* renamed from: e */
    private final int f1630e;

    /* renamed from: f */
    private View f1631f;

    /* renamed from: g */
    private int f1632g;

    /* renamed from: h */
    private boolean f1633h;

    /* renamed from: i */
    private C0481o.C0482a f1634i;

    /* renamed from: j */
    private C0478m f1635j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1636k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1637l;

    public C0479n(Context context, C0465h hVar, View view, boolean z, int i) {
        this(context, hVar, view, z, i, 0);
    }

    public C0479n(Context context, C0465h hVar, View view, boolean z, int i, int i2) {
        this.f1632g = 8388611;
        this.f1637l = new PopupWindow.OnDismissListener() {
            public void onDismiss() {
                C0479n.this.mo2287e();
            }
        };
        this.f1626a = context;
        this.f1627b = hVar;
        this.f1631f = view;
        this.f1628c = z;
        this.f1629d = i;
        this.f1630e = i2;
    }

    /* renamed from: a */
    private void m2337a(int i, int i2, boolean z, boolean z2) {
        C0478m b = mo2284b();
        b.mo2042c(z2);
        if (z) {
            if ((C0235d.m1006a(this.f1632g, C0249q.m1059b(this.f1631f)) & 7) == 5) {
                i -= this.f1631f.getWidth();
            }
            b.mo2039b(i);
            b.mo2041c(i2);
            int i3 = (int) ((this.f1626a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo2274a(new Rect(i - i3, i2 - i3, i + i3, i3 + i2));
        }
        b.mo2033a();
    }

    /* renamed from: g */
    private C0478m m2338g() {
        Display defaultDisplay = ((WindowManager) this.f1626a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        C0478m eVar = Math.min(point.x, point.y) >= this.f1626a.getResources().getDimensionPixelSize(C0353a.C0357d.abc_cascading_menus_min_smallest_width) ? new C0456e(this.f1626a, this.f1631f, this.f1629d, this.f1630e, this.f1628c) : new C0488t(this.f1626a, this.f1627b, this.f1631f, this.f1629d, this.f1630e, this.f1628c);
        eVar.mo2035a(this.f1627b);
        eVar.mo2037a(this.f1637l);
        eVar.mo2036a(this.f1631f);
        eVar.mo2018a(this.f1634i);
        eVar.mo2038a(this.f1633h);
        eVar.mo2034a(this.f1632g);
        return eVar;
    }

    /* renamed from: a */
    public void mo2277a() {
        if (!mo2285c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void mo2278a(int i) {
        this.f1632g = i;
    }

    /* renamed from: a */
    public void mo2279a(C0481o.C0482a aVar) {
        this.f1634i = aVar;
        if (this.f1635j != null) {
            this.f1635j.mo2018a(aVar);
        }
    }

    /* renamed from: a */
    public void mo2280a(View view) {
        this.f1631f = view;
    }

    /* renamed from: a */
    public void mo2281a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1636k = onDismissListener;
    }

    /* renamed from: a */
    public void mo2282a(boolean z) {
        this.f1633h = z;
        if (this.f1635j != null) {
            this.f1635j.mo2038a(z);
        }
    }

    /* renamed from: a */
    public boolean mo2283a(int i, int i2) {
        if (mo2288f()) {
            return true;
        }
        if (this.f1631f == null) {
            return false;
        }
        m2337a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public C0478m mo2284b() {
        if (this.f1635j == null) {
            this.f1635j = m2338g();
        }
        return this.f1635j;
    }

    /* renamed from: c */
    public boolean mo2285c() {
        if (mo2288f()) {
            return true;
        }
        if (this.f1631f == null) {
            return false;
        }
        m2337a(0, 0, false, false);
        return true;
    }

    /* renamed from: d */
    public void mo2286d() {
        if (mo2288f()) {
            this.f1635j.mo2040c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo2287e() {
        this.f1635j = null;
        if (this.f1636k != null) {
            this.f1636k.onDismiss();
        }
    }

    /* renamed from: f */
    public boolean mo2288f() {
        return this.f1635j != null && this.f1635j.mo2043d();
    }
}
