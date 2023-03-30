package android.arch.lifecycle;

import android.arch.lifecycle.C0021c;
import android.arch.p000a.p001a.C0000a;
import android.arch.p000a.p002b.C0006b;
import java.util.Map;

public abstract class LiveData<T> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Object f25b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f26a = new Object();

    /* renamed from: c */
    private C0006b<C0033k<T>, LiveData<T>.a> f27c = new C0006b<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f28d = 0;

    /* renamed from: e */
    private volatile Object f29e = f25b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile Object f30f = f25b;

    /* renamed from: g */
    private int f31g = -1;

    /* renamed from: h */
    private boolean f32h;

    /* renamed from: i */
    private boolean f33i;

    /* renamed from: j */
    private final Runnable f34j = new Runnable() {
        public void run() {
            Object b;
            synchronized (LiveData.this.f26a) {
                b = LiveData.this.f30f;
                Object unused = LiveData.this.f30f = LiveData.f25b;
            }
            LiveData.this.mo44a(b);
        }
    };

    class LifecycleBoundObserver extends LiveData<T>.a implements GenericLifecycleObserver {

        /* renamed from: a */
        final C0025e f36a;

        LifecycleBoundObserver(C0025e eVar, C0033k<T> kVar) {
            super(kVar);
            this.f36a = eVar;
        }

        /* renamed from: a */
        public void mo34a(C0025e eVar, C0021c.C0022a aVar) {
            if (this.f36a.mo64a().mo60a() == C0021c.C0023b.DESTROYED) {
                LiveData.this.mo43a(this.f38c);
            } else {
                mo52a(mo49a());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo49a() {
            return this.f36a.mo64a().mo60a().mo63a(C0021c.C0023b.STARTED);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo50a(C0025e eVar) {
            return this.f36a == eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo51b() {
            this.f36a.mo64a().mo62b(this);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private abstract class C0016a {

        /* renamed from: c */
        final C0033k<T> f38c;

        /* renamed from: d */
        boolean f39d;

        /* renamed from: e */
        int f40e = -1;

        C0016a(C0033k<T> kVar) {
            this.f38c = kVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52a(boolean z) {
            int i = 1;
            if (z != this.f39d) {
                this.f39d = z;
                boolean z2 = LiveData.this.f28d == 0;
                LiveData liveData = LiveData.this;
                int c = liveData.f28d;
                if (!this.f39d) {
                    i = -1;
                }
                int unused = liveData.f28d = i + c;
                if (z2 && this.f39d) {
                    LiveData.this.mo45b();
                }
                if (LiveData.this.f28d == 0 && !this.f39d) {
                    LiveData.this.mo46c();
                }
                if (this.f39d) {
                    LiveData.this.m53b((LiveData<T>.a) this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo49a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo50a(C0025e eVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo51b() {
        }
    }

    /* renamed from: a */
    private void m49a(LiveData<T>.a aVar) {
        if (aVar.f39d) {
            if (!aVar.mo49a()) {
                aVar.mo52a(false);
            } else if (aVar.f40e < this.f31g) {
                aVar.f40e = this.f31g;
                aVar.f38c.mo69a(this.f29e);
            }
        }
    }

    /* renamed from: a */
    private static void m51a(String str) {
        if (!C0000a.m0a().mo3b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m53b(LiveData<T>.a aVar) {
        if (this.f32h) {
            this.f33i = true;
            return;
        }
        this.f32h = true;
        do {
            this.f33i = false;
            if (aVar == null) {
                C0006b<K, V>.d c = this.f27c.mo14c();
                while (c.hasNext()) {
                    m49a((LiveData<T>.a) (C0016a) ((Map.Entry) c.next()).getValue());
                    if (this.f33i) {
                        break;
                    }
                }
            } else {
                m49a(aVar);
                aVar = null;
            }
        } while (this.f33i);
        this.f32h = false;
    }

    /* renamed from: a */
    public T mo41a() {
        T t = this.f29e;
        if (t != f25b) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public void mo42a(C0025e eVar, C0033k<T> kVar) {
        if (eVar.mo64a().mo60a() != C0021c.C0023b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(eVar, kVar);
            C0016a a = this.f27c.mo7a(kVar, lifecycleBoundObserver);
            if (a != null && !a.mo50a(eVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (a == null) {
                eVar.mo64a().mo61a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo43a(C0033k<T> kVar) {
        m51a("removeObserver");
        C0016a b = this.f27c.mo8b(kVar);
        if (b != null) {
            b.mo51b();
            b.mo52a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44a(T t) {
        m51a("setValue");
        this.f31g++;
        this.f29e = t;
        m53b((LiveData<T>.a) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo45b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo46c() {
    }

    /* renamed from: d */
    public boolean mo47d() {
        return this.f28d > 0;
    }
}
