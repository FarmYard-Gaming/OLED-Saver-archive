package android.arch.p000a.p002b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: android.arch.a.b.b */
public class C0006b<K, V> implements Iterable<Map.Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0010c<K, V> f9a;

    /* renamed from: b */
    private C0010c<K, V> f10b;

    /* renamed from: c */
    private WeakHashMap<C0013f<K, V>, Boolean> f11c = new WeakHashMap<>();

    /* renamed from: d */
    private int f12d = 0;

    /* renamed from: android.arch.a.b.b$a */
    static class C0008a<K, V> extends C0012e<K, V> {
        C0008a(C0010c<K, V> cVar, C0010c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0010c<K, V> mo20a(C0010c<K, V> cVar) {
            return cVar.f15c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0010c<K, V> mo21b(C0010c<K, V> cVar) {
            return cVar.f16d;
        }
    }

    /* renamed from: android.arch.a.b.b$b */
    private static class C0009b<K, V> extends C0012e<K, V> {
        C0009b(C0010c<K, V> cVar, C0010c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0010c<K, V> mo20a(C0010c<K, V> cVar) {
            return cVar.f16d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0010c<K, V> mo21b(C0010c<K, V> cVar) {
            return cVar.f15c;
        }
    }

    /* renamed from: android.arch.a.b.b$c */
    static class C0010c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f13a;

        /* renamed from: b */
        final V f14b;

        /* renamed from: c */
        C0010c<K, V> f15c;

        /* renamed from: d */
        C0010c<K, V> f16d;

        C0010c(K k, V v) {
            this.f13a = k;
            this.f14b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0010c)) {
                return false;
            }
            C0010c cVar = (C0010c) obj;
            return this.f13a.equals(cVar.f13a) && this.f14b.equals(cVar.f14b);
        }

        public K getKey() {
            return this.f13a;
        }

        public V getValue() {
            return this.f14b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f13a + "=" + this.f14b;
        }
    }

    /* renamed from: android.arch.a.b.b$d */
    private class C0011d implements C0013f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        private C0010c<K, V> f18b;

        /* renamed from: c */
        private boolean f19c;

        private C0011d() {
            this.f19c = true;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (this.f19c) {
                this.f19c = false;
                this.f18b = C0006b.this.f9a;
            } else {
                this.f18b = this.f18b != null ? this.f18b.f15c : null;
            }
            return this.f18b;
        }

        /* renamed from: a_ */
        public void mo28a_(C0010c<K, V> cVar) {
            if (cVar == this.f18b) {
                this.f18b = this.f18b.f16d;
                this.f19c = this.f18b == null;
            }
        }

        public boolean hasNext() {
            return this.f19c ? C0006b.this.f9a != null : (this.f18b == null || this.f18b.f15c == null) ? false : true;
        }
    }

    /* renamed from: android.arch.a.b.b$e */
    private static abstract class C0012e<K, V> implements C0013f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        C0010c<K, V> f20a;

        /* renamed from: b */
        C0010c<K, V> f21b;

        C0012e(C0010c<K, V> cVar, C0010c<K, V> cVar2) {
            this.f20a = cVar2;
            this.f21b = cVar;
        }

        /* renamed from: b */
        private C0010c<K, V> m31b() {
            if (this.f21b == this.f20a || this.f20a == null) {
                return null;
            }
            return mo20a(this.f21b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0010c<K, V> mo20a(C0010c<K, V> cVar);

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            C0010c<K, V> cVar = this.f21b;
            this.f21b = m31b();
            return cVar;
        }

        /* renamed from: a_ */
        public void mo28a_(C0010c<K, V> cVar) {
            if (this.f20a == cVar && cVar == this.f21b) {
                this.f21b = null;
                this.f20a = null;
            }
            if (this.f20a == cVar) {
                this.f20a = mo21b(this.f20a);
            }
            if (this.f21b == cVar) {
                this.f21b = m31b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C0010c<K, V> mo21b(C0010c<K, V> cVar);

        public boolean hasNext() {
            return this.f21b != null;
        }
    }

    /* renamed from: android.arch.a.b.b$f */
    interface C0013f<K, V> {
        /* renamed from: a_ */
        void mo28a_(C0010c<K, V> cVar);
    }

    /* renamed from: a */
    public int mo11a() {
        return this.f12d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0010c<K, V> mo6a(K k) {
        C0010c<K, V> cVar = this.f9a;
        while (cVar != null && !cVar.f13a.equals(k)) {
            cVar = cVar.f15c;
        }
        return cVar;
    }

    /* renamed from: a */
    public V mo7a(K k, V v) {
        C0010c a = mo6a(k);
        if (a != null) {
            return a.f14b;
        }
        mo12b(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0010c<K, V> mo12b(K k, V v) {
        C0010c<K, V> cVar = new C0010c<>(k, v);
        this.f12d++;
        if (this.f10b == null) {
            this.f9a = cVar;
            this.f10b = this.f9a;
        } else {
            this.f10b.f15c = cVar;
            cVar.f16d = this.f10b;
            this.f10b = cVar;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo8b(K k) {
        C0010c a = mo6a(k);
        if (a == null) {
            return null;
        }
        this.f12d--;
        if (!this.f11c.isEmpty()) {
            for (C0013f<K, V> a_ : this.f11c.keySet()) {
                a_.mo28a_(a);
            }
        }
        if (a.f16d != null) {
            a.f16d.f15c = a.f15c;
        } else {
            this.f9a = a.f15c;
        }
        if (a.f15c != null) {
            a.f15c.f16d = a.f16d;
        } else {
            this.f10b = a.f16d;
        }
        a.f15c = null;
        a.f16d = null;
        return a.f14b;
    }

    /* renamed from: b */
    public Iterator<Map.Entry<K, V>> mo13b() {
        C0009b bVar = new C0009b(this.f10b, this.f9a);
        this.f11c.put(bVar, false);
        return bVar;
    }

    /* renamed from: c */
    public C0006b<K, V>.d mo14c() {
        C0006b<K, V>.d dVar = new C0011d();
        this.f11c.put(dVar, false);
        return dVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo15d() {
        return this.f9a;
    }

    /* renamed from: e */
    public Map.Entry<K, V> mo16e() {
        return this.f10b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0006b)) {
            return false;
        }
        C0006b bVar = (C0006b) obj;
        if (mo11a() != bVar.mo11a()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if (entry == null && next != null) {
                return false;
            }
            if (entry != null && !entry.equals(next)) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C0008a aVar = new C0008a(this.f9a, this.f10b);
        this.f11c.put(aVar, false);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
