package android.arch.lifecycle;

import android.arch.lifecycle.C0017a;
import android.arch.lifecycle.C0021c;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f42a;

    /* renamed from: b */
    private final C0017a.C0018a f43b = C0017a.f45a.mo54b(this.f42a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f42a = obj;
    }

    /* renamed from: a */
    public void mo34a(C0025e eVar, C0021c.C0022a aVar) {
        this.f43b.mo55a(eVar, aVar, this.f42a);
    }
}
