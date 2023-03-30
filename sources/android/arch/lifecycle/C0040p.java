package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.p */
public class C0040p {

    /* renamed from: a */
    private final HashMap<String, C0037n> f75a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0037n mo84a(String str) {
        return this.f75a.get(str);
    }

    /* renamed from: a */
    public final void mo85a() {
        for (C0037n a : this.f75a.values()) {
            a.mo80a();
        }
        this.f75a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86a(String str, C0037n nVar) {
        C0037n put = this.f75a.put(str, nVar);
        if (put != null) {
            put.mo80a();
        }
    }
}
