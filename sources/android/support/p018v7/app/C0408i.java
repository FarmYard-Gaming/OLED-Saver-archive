package android.support.p018v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.app.C0378a;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.widget.C0538ac;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.i */
class C0408i extends C0378a {

    /* renamed from: a */
    C0538ac f1220a;

    /* renamed from: b */
    Window.Callback f1221b;

    /* renamed from: c */
    private boolean f1222c;

    /* renamed from: d */
    private boolean f1223d;

    /* renamed from: e */
    private ArrayList<C0378a.C0380b> f1224e;

    /* renamed from: f */
    private final Runnable f1225f;

    /* renamed from: android.support.v7.app.i$a */
    private final class C0409a implements C0481o.C0482a {

        /* renamed from: b */
        private boolean f1227b;

        C0409a() {
        }

        /* renamed from: a */
        public void mo1665a(C0465h hVar, boolean z) {
            if (!this.f1227b) {
                this.f1227b = true;
                C0408i.this.f1220a.mo2757n();
                if (C0408i.this.f1221b != null) {
                    C0408i.this.f1221b.onPanelClosed(108, hVar);
                }
                this.f1227b = false;
            }
        }

        /* renamed from: a */
        public boolean mo1666a(C0465h hVar) {
            if (C0408i.this.f1221b == null) {
                return false;
            }
            C0408i.this.f1221b.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.i$b */
    private final class C0410b implements C0465h.C0466a {
        C0410b() {
        }

        /* renamed from: a */
        public void mo1633a(C0465h hVar) {
            if (C0408i.this.f1221b == null) {
                return;
            }
            if (C0408i.this.f1220a.mo2752i()) {
                C0408i.this.f1221b.onPanelClosed(108, hVar);
            } else if (C0408i.this.f1221b.onPreparePanel(0, (View) null, hVar)) {
                C0408i.this.f1221b.onMenuOpened(108, hVar);
            }
        }

        /* renamed from: a */
        public boolean mo1636a(C0465h hVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: h */
    private Menu m1863h() {
        if (!this.f1222c) {
            this.f1220a.mo2735a((C0481o.C0482a) new C0409a(), (C0465h.C0466a) new C0410b());
            this.f1222c = true;
        }
        return this.f1220a.mo2760q();
    }

    /* renamed from: a */
    public int mo1545a() {
        return this.f1220a.mo2758o();
    }

    /* renamed from: a */
    public void mo1547a(float f) {
        C0249q.m1048a((View) this.f1220a.mo2732a(), f);
    }

    /* renamed from: a */
    public void mo1548a(Configuration configuration) {
        super.mo1548a(configuration);
    }

    /* renamed from: a */
    public void mo1549a(CharSequence charSequence) {
        this.f1220a.mo2739a(charSequence);
    }

    /* renamed from: a */
    public void mo1550a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo1551a(int i, KeyEvent keyEvent) {
        Menu h = m1863h();
        if (h == null) {
            return false;
        }
        h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return h.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public boolean mo1552a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo1556c();
        }
        return true;
    }

    /* renamed from: b */
    public Context mo1553b() {
        return this.f1220a.mo2741b();
    }

    /* renamed from: c */
    public void mo1555c(boolean z) {
    }

    /* renamed from: c */
    public boolean mo1556c() {
        return this.f1220a.mo2754k();
    }

    /* renamed from: d */
    public void mo1557d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo1558d() {
        return this.f1220a.mo2755l();
    }

    /* renamed from: e */
    public void mo1559e(boolean z) {
        if (z != this.f1223d) {
            this.f1223d = z;
            int size = this.f1224e.size();
            for (int i = 0; i < size; i++) {
                this.f1224e.get(i).mo1563a(z);
            }
        }
    }

    /* renamed from: e */
    public boolean mo1560e() {
        this.f1220a.mo2732a().removeCallbacks(this.f1225f);
        C0249q.m1055a((View) this.f1220a.mo2732a(), this.f1225f);
        return true;
    }

    /* renamed from: f */
    public boolean mo1561f() {
        if (!this.f1220a.mo2745c()) {
            return false;
        }
        this.f1220a.mo2746d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1562g() {
        this.f1220a.mo2732a().removeCallbacks(this.f1225f);
    }
}
