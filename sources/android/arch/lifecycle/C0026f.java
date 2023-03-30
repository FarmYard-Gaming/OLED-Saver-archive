package android.arch.lifecycle;

import android.arch.lifecycle.C0021c;
import android.arch.p000a.p002b.C0005a;
import android.arch.p000a.p002b.C0006b;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.arch.lifecycle.f */
public class C0026f extends C0021c {

    /* renamed from: a */
    private C0005a<C0024d, C0028a> f58a = new C0005a<>();

    /* renamed from: b */
    private C0021c.C0023b f59b;

    /* renamed from: c */
    private final WeakReference<C0025e> f60c;

    /* renamed from: d */
    private int f61d = 0;

    /* renamed from: e */
    private boolean f62e = false;

    /* renamed from: f */
    private boolean f63f = false;

    /* renamed from: g */
    private ArrayList<C0021c.C0023b> f64g = new ArrayList<>();

    /* renamed from: android.arch.lifecycle.f$a */
    static class C0028a {

        /* renamed from: a */
        C0021c.C0023b f67a;

        /* renamed from: b */
        GenericLifecycleObserver f68b;

        C0028a(C0024d dVar, C0021c.C0023b bVar) {
            this.f68b = C0030h.m106a((Object) dVar);
            this.f67a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo67a(C0025e eVar, C0021c.C0022a aVar) {
            C0021c.C0023b b = C0026f.m89b(aVar);
            this.f67a = C0026f.m87a(this.f67a, b);
            this.f68b.mo34a(eVar, aVar);
            this.f67a = b;
        }
    }

    public C0026f(C0025e eVar) {
        this.f60c = new WeakReference<>(eVar);
        this.f59b = C0021c.C0023b.INITIALIZED;
    }

    /* renamed from: a */
    static C0021c.C0023b m87a(C0021c.C0023b bVar, C0021c.C0023b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private void m88a(C0025e eVar) {
        C0006b<K, V>.d c = this.f58a.mo14c();
        while (c.hasNext() && !this.f63f) {
            Map.Entry entry = (Map.Entry) c.next();
            C0028a aVar = (C0028a) entry.getValue();
            while (aVar.f67a.compareTo(this.f59b) < 0 && !this.f63f && this.f58a.mo9c(entry.getKey())) {
                m95c(aVar.f67a);
                aVar.mo67a(eVar, m98e(aVar.f67a));
                m94c();
            }
        }
    }

    /* renamed from: b */
    static C0021c.C0023b m89b(C0021c.C0022a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return C0021c.C0023b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0021c.C0023b.STARTED;
            case ON_RESUME:
                return C0021c.C0023b.RESUMED;
            case ON_DESTROY:
                return C0021c.C0023b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: b */
    private void m90b(C0021c.C0023b bVar) {
        if (this.f59b != bVar) {
            this.f59b = bVar;
            if (this.f62e || this.f61d != 0) {
                this.f63f = true;
                return;
            }
            this.f62e = true;
            m97d();
            this.f62e = false;
        }
    }

    /* renamed from: b */
    private void m91b(C0025e eVar) {
        Iterator<Map.Entry<C0024d, C0028a>> b = this.f58a.mo13b();
        while (b.hasNext() && !this.f63f) {
            Map.Entry next = b.next();
            C0028a aVar = (C0028a) next.getValue();
            while (aVar.f67a.compareTo(this.f59b) > 0 && !this.f63f && this.f58a.mo9c(next.getKey())) {
                C0021c.C0022a d = m96d(aVar.f67a);
                m95c(m89b(d));
                aVar.mo67a(eVar, d);
                m94c();
            }
        }
    }

    /* renamed from: b */
    private boolean m92b() {
        if (this.f58a.mo11a() == 0) {
            return true;
        }
        C0021c.C0023b bVar = this.f58a.mo15d().getValue().f67a;
        C0021c.C0023b bVar2 = this.f58a.mo16e().getValue().f67a;
        return bVar == bVar2 && this.f59b == bVar2;
    }

    /* renamed from: c */
    private C0021c.C0023b m93c(C0024d dVar) {
        Map.Entry<C0024d, C0028a> d = this.f58a.mo10d(dVar);
        return m87a(m87a(this.f59b, d != null ? d.getValue().f67a : null), !this.f64g.isEmpty() ? this.f64g.get(this.f64g.size() - 1) : null);
    }

    /* renamed from: c */
    private void m94c() {
        this.f64g.remove(this.f64g.size() - 1);
    }

    /* renamed from: c */
    private void m95c(C0021c.C0023b bVar) {
        this.f64g.add(bVar);
    }

    /* renamed from: d */
    private static C0021c.C0022a m96d(C0021c.C0023b bVar) {
        switch (bVar) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return C0021c.C0022a.ON_DESTROY;
            case STARTED:
                return C0021c.C0022a.ON_STOP;
            case RESUMED:
                return C0021c.C0022a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* renamed from: d */
    private void m97d() {
        C0025e eVar = (C0025e) this.f60c.get();
        if (eVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m92b()) {
            this.f63f = false;
            if (this.f59b.compareTo(this.f58a.mo15d().getValue().f67a) < 0) {
                m91b(eVar);
            }
            Map.Entry<C0024d, C0028a> e = this.f58a.mo16e();
            if (!this.f63f && e != null && this.f59b.compareTo(e.getValue().f67a) > 0) {
                m88a(eVar);
            }
        }
        this.f63f = false;
    }

    /* renamed from: e */
    private static C0021c.C0022a m98e(C0021c.C0023b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return C0021c.C0022a.ON_CREATE;
            case CREATED:
                return C0021c.C0022a.ON_START;
            case STARTED:
                return C0021c.C0022a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* renamed from: a */
    public C0021c.C0023b mo60a() {
        return this.f59b;
    }

    /* renamed from: a */
    public void mo65a(C0021c.C0022a aVar) {
        m90b(m89b(aVar));
    }

    /* renamed from: a */
    public void mo66a(C0021c.C0023b bVar) {
        m90b(bVar);
    }

    /* renamed from: a */
    public void mo61a(C0024d dVar) {
        C0025e eVar;
        C0028a aVar = new C0028a(dVar, this.f59b == C0021c.C0023b.DESTROYED ? C0021c.C0023b.DESTROYED : C0021c.C0023b.INITIALIZED);
        if (this.f58a.mo7a(dVar, aVar) == null && (eVar = (C0025e) this.f60c.get()) != null) {
            boolean z = this.f61d != 0 || this.f62e;
            C0021c.C0023b c = m93c(dVar);
            this.f61d++;
            while (aVar.f67a.compareTo(c) < 0 && this.f58a.mo9c(dVar)) {
                m95c(aVar.f67a);
                aVar.mo67a(eVar, m98e(aVar.f67a));
                m94c();
                c = m93c(dVar);
            }
            if (!z) {
                m97d();
            }
            this.f61d--;
        }
    }

    /* renamed from: b */
    public void mo62b(C0024d dVar) {
        this.f58a.mo8b(dVar);
    }
}
