package android.arch.lifecycle;

import android.arch.lifecycle.C0021c;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f23a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f23a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public void mo34a(C0025e eVar, C0021c.C0022a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f23a.mo35a(eVar);
                return;
            case ON_START:
                this.f23a.mo36b(eVar);
                return;
            case ON_RESUME:
                this.f23a.mo37c(eVar);
                return;
            case ON_PAUSE:
                this.f23a.mo38d(eVar);
                return;
            case ON_STOP:
                this.f23a.mo39e(eVar);
                return;
            case ON_DESTROY:
                this.f23a.mo40f(eVar);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
