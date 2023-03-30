package android.arch.p000a.p002b;

import android.arch.p000a.p002b.C0006b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.arch.a.b.a */
public class C0005a<K, V> extends C0006b<K, V> {

    /* renamed from: a */
    private HashMap<K, C0006b.C0010c<K, V>> f8a = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0006b.C0010c<K, V> mo6a(K k) {
        return this.f8a.get(k);
    }

    /* renamed from: a */
    public V mo7a(K k, V v) {
        C0006b.C0010c a = mo6a(k);
        if (a != null) {
            return a.f14b;
        }
        this.f8a.put(k, mo12b(k, v));
        return null;
    }

    /* renamed from: b */
    public V mo8b(K k) {
        V b = super.mo8b(k);
        this.f8a.remove(k);
        return b;
    }

    /* renamed from: c */
    public boolean mo9c(K k) {
        return this.f8a.containsKey(k);
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo10d(K k) {
        if (mo9c(k)) {
            return this.f8a.get(k).f16d;
        }
        return null;
    }
}
