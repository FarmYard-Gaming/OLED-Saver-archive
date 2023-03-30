package android.arch.lifecycle;

import android.arch.lifecycle.C0021c;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0020b[] f22a;

    CompositeGeneratedAdaptersObserver(C0020b[] bVarArr) {
        this.f22a = bVarArr;
    }

    /* renamed from: a */
    public void mo34a(C0025e eVar, C0021c.C0022a aVar) {
        C0031i iVar = new C0031i();
        for (C0020b a : this.f22a) {
            a.mo59a(eVar, aVar, false, iVar);
        }
        for (C0020b a2 : this.f22a) {
            a2.mo59a(eVar, aVar, true, iVar);
        }
    }
}
