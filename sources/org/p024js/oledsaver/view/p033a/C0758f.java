package org.p024js.oledsaver.view.p033a;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: org.js.oledsaver.view.a.f */
public class C0758f {

    /* renamed from: a */
    private C0753d f2717a = new C0753d();

    /* renamed from: b */
    private boolean f2718b;

    /* renamed from: c */
    private List<C0752c> f2719c = new ArrayList();

    /* renamed from: d */
    private C0759a f2720d;

    /* renamed from: org.js.oledsaver.view.a.f$a */
    public interface C0759a {
        /* renamed from: a */
        void mo3524a();

        /* renamed from: b */
        void mo3525b();
    }

    /* renamed from: a */
    public C0755e mo3595a() {
        C0755e eVar = new C0755e();
        eVar.mo3586a((C0752c[]) this.f2719c.toArray(new C0752c[this.f2719c.size()]));
        eVar.mo3583a(this.f2717a);
        eVar.mo3584a(this.f2720d);
        this.f2719c = null;
        this.f2717a = null;
        this.f2720d = null;
        this.f2718b = true;
        return eVar;
    }

    /* renamed from: a */
    public C0758f mo3596a(int i) {
        if (this.f2718b) {
            throw new C0750a("Already created. rebuild a new one.");
        } else if (i < 0 || i > 255) {
            throw new C0750a("Illegal alpha value, should between [0-255]");
        } else {
            this.f2717a.f2697h = i;
            return this;
        }
    }

    /* renamed from: a */
    public C0758f mo3597a(View view) {
        if (this.f2718b) {
            throw new C0750a("Already created. rebuild a new one.");
        } else if (view == null) {
            throw new C0750a("Illegal view.");
        } else {
            this.f2717a.f2690a = view;
            return this;
        }
    }

    /* renamed from: a */
    public C0758f mo3598a(C0752c cVar) {
        if (this.f2718b) {
            throw new C0750a("Already created, rebuild a new one.");
        }
        this.f2719c.add(cVar);
        return this;
    }

    /* renamed from: a */
    public C0758f mo3599a(C0759a aVar) {
        if (this.f2718b) {
            throw new C0750a("Already created, rebuild a new one.");
        }
        this.f2720d = aVar;
        return this;
    }

    /* renamed from: a */
    public C0758f mo3600a(boolean z) {
        if (this.f2718b) {
            throw new C0750a("Already created, rebuild a new one.");
        }
        this.f2717a.f2704o = z;
        return this;
    }

    /* renamed from: b */
    public C0758f mo3601b(int i) {
        if (this.f2718b) {
            throw new C0750a("Already created. rebuild a new one.");
        }
        if (i < 0) {
            this.f2717a.f2700k = 0;
        }
        this.f2717a.f2700k = i;
        return this;
    }

    /* renamed from: b */
    public C0758f mo3602b(boolean z) {
        this.f2717a.f2696g = z;
        return this;
    }

    /* renamed from: c */
    public C0758f mo3603c(int i) {
        if (this.f2718b) {
            throw new C0750a("Already created. rebuild a new one.");
        }
        if (i < 0) {
            this.f2717a.f2691b = 0;
        }
        this.f2717a.f2691b = i;
        return this;
    }
}
