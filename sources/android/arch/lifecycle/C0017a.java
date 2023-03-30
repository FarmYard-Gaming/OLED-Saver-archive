package android.arch.lifecycle;

import android.arch.lifecycle.C0021c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.a */
class C0017a {

    /* renamed from: a */
    static C0017a f45a = new C0017a();

    /* renamed from: b */
    private final Map<Class, C0018a> f46b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f47c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    static class C0018a {

        /* renamed from: a */
        final Map<C0021c.C0022a, List<C0019b>> f48a = new HashMap();

        /* renamed from: b */
        final Map<C0019b, C0021c.C0022a> f49b;

        C0018a(Map<C0019b, C0021c.C0022a> map) {
            this.f49b = map;
            for (Map.Entry next : map.entrySet()) {
                C0021c.C0022a aVar = (C0021c.C0022a) next.getValue();
                List list = this.f48a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f48a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* renamed from: a */
        private static void m78a(List<C0019b> list, C0025e eVar, C0021c.C0022a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo56a(eVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo55a(C0025e eVar, C0021c.C0022a aVar, Object obj) {
            m78a(this.f48a.get(aVar), eVar, aVar, obj);
            m78a(this.f48a.get(C0021c.C0022a.ON_ANY), eVar, aVar, obj);
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    static class C0019b {

        /* renamed from: a */
        final int f50a;

        /* renamed from: b */
        final Method f51b;

        C0019b(int i, Method method) {
            this.f50a = i;
            this.f51b = method;
            this.f51b.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo56a(C0025e eVar, C0021c.C0022a aVar, Object obj) {
            try {
                switch (this.f50a) {
                    case 0:
                        this.f51b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f51b.invoke(obj, new Object[]{eVar});
                        return;
                    case 2:
                        this.f51b.invoke(obj, new Object[]{eVar, aVar});
                        return;
                    default:
                        return;
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0019b bVar = (C0019b) obj;
            return this.f50a == bVar.f50a && this.f51b.getName().equals(bVar.f51b.getName());
        }

        public int hashCode() {
            return (this.f50a * 31) + this.f51b.getName().hashCode();
        }
    }

    C0017a() {
    }

    /* renamed from: a */
    private C0018a m73a(Class cls, Method[] methodArr) {
        int i;
        boolean z;
        C0018a b;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b = mo54b(superclass)) == null)) {
            hashMap.putAll(b.f49b);
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Map.Entry next : mo54b(b2).f49b.entrySet()) {
                m74a(hashMap, (C0019b) next.getKey(), (C0021c.C0022a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m75c(cls);
        }
        int length = methodArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            Method method = methodArr[i2];
            C0034l lVar = (C0034l) method.getAnnotation(C0034l.class);
            if (lVar == null) {
                z = z2;
            } else {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(C0025e.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                C0021c.C0022a a = lVar.mo70a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0021c.C0022a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a != C0021c.C0022a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    } else {
                        i = 2;
                    }
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m74a(hashMap, new C0019b(i, method), a, cls);
                z = true;
            }
            i2++;
            z2 = z;
        }
        C0018a aVar = new C0018a(hashMap);
        this.f46b.put(cls, aVar);
        this.f47c.put(cls, Boolean.valueOf(z2));
        return aVar;
    }

    /* renamed from: a */
    private void m74a(Map<C0019b, C0021c.C0022a> map, C0019b bVar, C0021c.C0022a aVar, Class cls) {
        C0021c.C0022a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            throw new IllegalArgumentException("Method " + bVar.f51b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: c */
    private Method[] m75c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo53a(Class cls) {
        if (this.f47c.containsKey(cls)) {
            return this.f47c.get(cls).booleanValue();
        }
        Method[] c = m75c(cls);
        for (Method annotation : c) {
            if (((C0034l) annotation.getAnnotation(C0034l.class)) != null) {
                m73a(cls, c);
                return true;
            }
        }
        this.f47c.put(cls, false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0018a mo54b(Class cls) {
        C0018a aVar = this.f46b.get(cls);
        return aVar != null ? aVar : m73a(cls, (Method[]) null);
    }
}
