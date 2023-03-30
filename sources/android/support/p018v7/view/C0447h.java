package android.support.p018v7.view;

import android.support.p006v4.p015g.C0256u;
import android.support.p006v4.p015g.C0260v;
import android.support.p006v4.p015g.C0261w;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.h */
public class C0447h {

    /* renamed from: a */
    final ArrayList<C0256u> f1421a = new ArrayList<>();

    /* renamed from: b */
    C0260v f1422b;

    /* renamed from: c */
    private long f1423c = -1;

    /* renamed from: d */
    private Interpolator f1424d;

    /* renamed from: e */
    private boolean f1425e;

    /* renamed from: f */
    private final C0261w f1426f = new C0261w() {

        /* renamed from: b */
        private boolean f1428b = false;

        /* renamed from: c */
        private int f1429c = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1920a() {
            this.f1429c = 0;
            this.f1428b = false;
            C0447h.this.mo1918b();
        }

        /* renamed from: a */
        public void mo1090a(View view) {
            if (!this.f1428b) {
                this.f1428b = true;
                if (C0447h.this.f1422b != null) {
                    C0447h.this.f1422b.mo1090a((View) null);
                }
            }
        }

        /* renamed from: b */
        public void mo1091b(View view) {
            int i = this.f1429c + 1;
            this.f1429c = i;
            if (i == C0447h.this.f1421a.size()) {
                if (C0447h.this.f1422b != null) {
                    C0447h.this.f1422b.mo1091b((View) null);
                }
                mo1920a();
            }
        }
    };

    /* renamed from: a */
    public C0447h mo1912a(long j) {
        if (!this.f1425e) {
            this.f1423c = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0447h mo1913a(C0256u uVar) {
        if (!this.f1425e) {
            this.f1421a.add(uVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0447h mo1914a(C0256u uVar, C0256u uVar2) {
        this.f1421a.add(uVar);
        uVar2.mo1083b(uVar.mo1076a());
        this.f1421a.add(uVar2);
        return this;
    }

    /* renamed from: a */
    public C0447h mo1915a(C0260v vVar) {
        if (!this.f1425e) {
            this.f1422b = vVar;
        }
        return this;
    }

    /* renamed from: a */
    public C0447h mo1916a(Interpolator interpolator) {
        if (!this.f1425e) {
            this.f1424d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public void mo1917a() {
        if (!this.f1425e) {
            Iterator<C0256u> it = this.f1421a.iterator();
            while (it.hasNext()) {
                C0256u next = it.next();
                if (this.f1423c >= 0) {
                    next.mo1078a(this.f1423c);
                }
                if (this.f1424d != null) {
                    next.mo1081a(this.f1424d);
                }
                if (this.f1422b != null) {
                    next.mo1079a((C0260v) this.f1426f);
                }
                next.mo1085c();
            }
            this.f1425e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1918b() {
        this.f1425e = false;
    }

    /* renamed from: c */
    public void mo1919c() {
        if (this.f1425e) {
            Iterator<C0256u> it = this.f1421a.iterator();
            while (it.hasNext()) {
                it.next().mo1084b();
            }
            this.f1425e = false;
        }
    }
}
