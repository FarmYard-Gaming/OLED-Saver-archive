package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.h */
public class C0030h {

    /* renamed from: a */
    private static Map<Class, Integer> f69a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0020b>>> f70b = new HashMap();

    /* renamed from: a */
    static GenericLifecycleObserver m106a(Object obj) {
        int i = 0;
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class<?> cls = obj.getClass();
        if (m110b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f70b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m107a((Constructor) list.get(0), obj));
        }
        C0020b[] bVarArr = new C0020b[list.size()];
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return new CompositeGeneratedAdaptersObserver(bVarArr);
            }
            bVarArr[i2] = m107a((Constructor) list.get(i2), obj);
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private static C0020b m107a(Constructor<? extends C0020b> constructor, Object obj) {
        try {
            return (C0020b) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    public static String m108a(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: a */
    private static Constructor<? extends C0020b> m109a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m108a(canonicalName);
            if (!name.isEmpty()) {
                a = name + "." + a;
            }
            Constructor<?> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    private static int m110b(Class<?> cls) {
        if (f69a.containsKey(cls)) {
            return f69a.get(cls).intValue();
        }
        int c = m111c(cls);
        f69a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: c */
    private static int m111c(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0020b> a = m109a(cls);
        if (a != null) {
            f70b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0017a.f45a.mo53a(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m112d(superclass)) {
                if (m110b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f70b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m112d(cls2)) {
                    if (m110b(cls2) == 1) {
                        return 1;
                    }
                    ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                    arrayList2.addAll(f70b.get(cls2));
                    arrayList = arrayList2;
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f70b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: d */
    private static boolean m112d(Class<?> cls) {
        return cls != null && C0024d.class.isAssignableFrom(cls);
    }
}
