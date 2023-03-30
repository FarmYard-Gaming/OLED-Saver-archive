package android.support.p006v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.support.p006v4.app.C0100c;
import android.support.p006v4.p014f.C0199a;
import android.support.p006v4.p015g.C0249q;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.q */
class C0145q {

    /* renamed from: a */
    private static final int[] f450a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final C0156s f451b = (Build.VERSION.SDK_INT >= 21 ? new C0151r() : null);

    /* renamed from: c */
    private static final C0156s f452c = m668a();

    /* renamed from: android.support.v4.app.q$a */
    static class C0150a {

        /* renamed from: a */
        public C0106f f481a;

        /* renamed from: b */
        public boolean f482b;

        /* renamed from: c */
        public C0100c f483c;

        /* renamed from: d */
        public C0106f f484d;

        /* renamed from: e */
        public boolean f485e;

        /* renamed from: f */
        public C0100c f486f;

        C0150a() {
        }
    }

    /* renamed from: a */
    private static C0150a m667a(C0150a aVar, SparseArray<C0150a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0150a aVar2 = new C0150a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private static C0156s m668a() {
        try {
            return (C0156s) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    private static C0156s m669a(C0106f fVar, C0106f fVar2) {
        ArrayList arrayList = new ArrayList();
        if (fVar != null) {
            Object x = fVar.mo442x();
            if (x != null) {
                arrayList.add(x);
            }
            Object w = fVar.mo441w();
            if (w != null) {
                arrayList.add(w);
            }
            Object A = fVar.mo339A();
            if (A != null) {
                arrayList.add(A);
            }
        }
        if (fVar2 != null) {
            Object v = fVar2.mo440v();
            if (v != null) {
                arrayList.add(v);
            }
            Object y = fVar2.mo443y();
            if (y != null) {
                arrayList.add(y);
            }
            Object z = fVar2.mo444z();
            if (z != null) {
                arrayList.add(z);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f451b != null && m690a(f451b, (List<Object>) arrayList)) {
            return f451b;
        }
        if (f452c != null && m690a(f452c, (List<Object>) arrayList)) {
            return f452c;
        }
        if (f451b == null && f452c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0199a<String, String> m670a(int i, ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0199a<String, String> aVar = new C0199a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0100c cVar = arrayList.get(i4);
            if (cVar.mo328b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                if (cVar.f247r != null) {
                    int size = cVar.f247r.size();
                    if (booleanValue) {
                        arrayList3 = cVar.f247r;
                        arrayList4 = cVar.f248s;
                    } else {
                        ArrayList<String> arrayList5 = cVar.f247r;
                        arrayList3 = cVar.f248s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    static C0199a<String, View> m671a(C0156s sVar, C0199a<String, String> aVar, Object obj, C0150a aVar2) {
        C0094ab S;
        ArrayList<String> arrayList;
        String a;
        C0106f fVar = aVar2.f481a;
        View l = fVar.mo424l();
        if (aVar.isEmpty() || obj == null || l == null) {
            aVar.clear();
            return null;
        }
        C0199a<String, View> aVar3 = new C0199a<>();
        sVar.mo688a((Map<String, View>) aVar3, l);
        C0100c cVar = aVar2.f483c;
        if (aVar2.f482b) {
            S = fVar.mo358T();
            arrayList = cVar.f247r;
        } else {
            S = fVar.mo357S();
            arrayList = cVar.f248s;
        }
        if (arrayList != null) {
            aVar3.mo812a(arrayList);
            aVar3.mo812a(aVar.values());
        }
        if (S != null) {
            S.mo302a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    String a2 = m677a(aVar, str);
                    if (a2 != null) {
                        aVar.remove(a2);
                    }
                } else if (!str.equals(C0249q.m1063e(view)) && (a = m677a(aVar, str)) != null) {
                    aVar.put(a, C0249q.m1063e(view));
                }
            }
        } else {
            m687a(aVar, aVar3);
        }
        return aVar3;
    }

    /* renamed from: a */
    static View m672a(C0199a<String, View> aVar, C0150a aVar2, Object obj, boolean z) {
        C0100c cVar = aVar2.f483c;
        if (obj == null || aVar == null || cVar.f247r == null || cVar.f247r.isEmpty()) {
            return null;
        }
        return aVar.get(z ? cVar.f247r.get(0) : cVar.f248s.get(0));
    }

    /* renamed from: a */
    private static Object m673a(C0156s sVar, C0106f fVar, C0106f fVar2, boolean z) {
        if (fVar == null || fVar2 == null) {
            return null;
        }
        return sVar.mo668c(sVar.mo663b(z ? fVar2.mo339A() : fVar.mo444z()));
    }

    /* renamed from: a */
    private static Object m674a(C0156s sVar, C0106f fVar, boolean z) {
        if (fVar == null) {
            return null;
        }
        return sVar.mo663b(z ? fVar.mo443y() : fVar.mo440v());
    }

    /* renamed from: a */
    private static Object m675a(C0156s sVar, ViewGroup viewGroup, View view, C0199a<String, String> aVar, C0150a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        final Rect rect;
        final View view2;
        C0106f fVar = aVar2.f481a;
        C0106f fVar2 = aVar2.f484d;
        if (fVar != null) {
            fVar.mo424l().setVisibility(0);
        }
        if (fVar == null || fVar2 == null) {
            return null;
        }
        boolean z = aVar2.f482b;
        Object a = aVar.isEmpty() ? null : m673a(sVar, fVar, fVar2, z);
        C0199a<String, View> b = m691b(sVar, aVar, a, aVar2);
        final C0199a<String, View> a2 = m671a(sVar, aVar, a, aVar2);
        if (aVar.isEmpty()) {
            obj3 = null;
            if (b != null) {
                b.clear();
            }
            if (a2 != null) {
                a2.clear();
            }
        } else {
            m689a(arrayList, b, (Collection<String>) aVar.keySet());
            m689a(arrayList2, a2, aVar.values());
            obj3 = a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m681a(fVar, fVar2, z, b, true);
        if (obj3 != null) {
            arrayList2.add(view);
            sVar.mo658a(obj3, view, arrayList);
            m686a(sVar, obj3, obj2, b, aVar2.f485e, aVar2.f486f);
            rect = new Rect();
            view2 = m672a(a2, aVar2, obj, z);
            if (view2 != null) {
                sVar.mo656a(obj, rect);
            }
        } else {
            rect = null;
            view2 = null;
        }
        final C0106f fVar3 = fVar;
        final C0106f fVar4 = fVar2;
        final boolean z2 = z;
        final C0156s sVar2 = sVar;
        C0170z.m788a(viewGroup, new Runnable() {
            public void run() {
                C0145q.m681a(fVar3, fVar4, z2, (C0199a<String, View>) a2, false);
                if (view2 != null) {
                    sVar2.mo683a(view2, rect);
                }
            }
        });
        return obj3;
    }

    /* renamed from: a */
    private static Object m676a(C0156s sVar, Object obj, Object obj2, Object obj3, C0106f fVar, boolean z) {
        boolean z2 = true;
        if (!(obj == null || obj2 == null || fVar == null)) {
            z2 = z ? fVar.mo341C() : fVar.mo340B();
        }
        return z2 ? sVar.mo654a(obj2, obj, obj3) : sVar.mo664b(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m677a(C0199a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo937c(i))) {
                return aVar.mo936b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static ArrayList<View> m678a(C0156s sVar, Object obj, C0106f fVar, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList<>();
            View l = fVar.mo424l();
            if (l != null) {
                sVar.mo687a(arrayList2, l);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                sVar.mo660a(obj, arrayList2);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static void m679a(C0100c cVar, C0100c.C0101a aVar, SparseArray<C0150a> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C0150a aVar2;
        C0150a aVar3;
        C0106f fVar = aVar.f252b;
        if (fVar != null && (i = fVar.f320z) != 0) {
            switch (z ? f450a[aVar.f251a] : aVar.f251a) {
                case 1:
                case 7:
                    z3 = true;
                    z4 = false;
                    z5 = false;
                    z6 = z2 ? fVar.f287O : !fVar.f306l && !fVar.f274B;
                    break;
                case 3:
                case 6:
                    z3 = false;
                    z4 = z2 ? !fVar.f306l && fVar.f282J != null && fVar.f282J.getVisibility() == 0 && fVar.f289Q >= 0.0f : fVar.f306l && !fVar.f274B;
                    z5 = true;
                    z6 = false;
                    break;
                case 4:
                    z3 = false;
                    z4 = z2 ? fVar.f288P && fVar.f306l && fVar.f274B : fVar.f306l && !fVar.f274B;
                    z5 = true;
                    z6 = false;
                    break;
                case 5:
                    z3 = true;
                    z4 = false;
                    z5 = false;
                    z6 = z2 ? fVar.f288P && !fVar.f274B && fVar.f306l : fVar.f274B;
                    break;
                default:
                    z3 = false;
                    z4 = false;
                    z5 = false;
                    z6 = false;
                    break;
            }
            C0150a aVar4 = sparseArray.get(i);
            if (z6) {
                aVar2 = m667a(aVar4, sparseArray, i);
                aVar2.f481a = fVar;
                aVar2.f482b = z;
                aVar2.f483c = cVar;
            } else {
                aVar2 = aVar4;
            }
            if (!z2 && z3) {
                if (aVar2 != null && aVar2.f484d == fVar) {
                    aVar2.f484d = null;
                }
                C0123l lVar = cVar.f230a;
                if (fVar.f296b < 1 && lVar.f386l >= 1 && !cVar.f249t) {
                    lVar.mo584f(fVar);
                    lVar.mo552a(fVar, 1, 0, 0, false);
                }
            }
            if (!z4 || !(aVar2 == null || aVar2.f484d == null)) {
                aVar3 = aVar2;
            } else {
                aVar3 = m667a(aVar2, sparseArray, i);
                aVar3.f484d = fVar;
                aVar3.f485e = z;
                aVar3.f486f = cVar;
            }
            if (!z2 && z5 && aVar3 != null && aVar3.f481a == fVar) {
                aVar3.f481a = null;
            }
        }
    }

    /* renamed from: a */
    public static void m680a(C0100c cVar, SparseArray<C0150a> sparseArray, boolean z) {
        int size = cVar.f231b.size();
        for (int i = 0; i < size; i++) {
            m679a(cVar, cVar.f231b.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: a */
    static void m681a(C0106f fVar, C0106f fVar2, boolean z, C0199a<String, View> aVar, boolean z2) {
        C0094ab S = z ? fVar2.mo357S() : fVar.mo357S();
        if (S != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.mo936b(i));
                arrayList.add(aVar.mo937c(i));
            }
            if (z2) {
                S.mo301a(arrayList2, arrayList, (List<View>) null);
            } else {
                S.mo303b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r15 = r25.f481a;
        r17 = r25.f484d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m682a(android.support.p006v4.app.C0123l r23, int r24, android.support.p006v4.app.C0145q.C0150a r25, android.view.View r26, android.support.p006v4.p014f.C0199a<java.lang.String, java.lang.String> r27) {
        /*
            r3 = 0
            r0 = r23
            android.support.v4.app.h r2 = r0.f388n
            boolean r2 = r2.mo448a()
            if (r2 == 0) goto L_0x0018
            r0 = r23
            android.support.v4.app.h r2 = r0.f388n
            r0 = r24
            android.view.View r2 = r2.mo447a(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = r2
        L_0x0018:
            if (r3 != 0) goto L_0x001b
        L_0x001a:
            return
        L_0x001b:
            r0 = r25
            android.support.v4.app.f r15 = r0.f481a
            r0 = r25
            android.support.v4.app.f r0 = r0.f484d
            r17 = r0
            r0 = r17
            android.support.v4.app.s r2 = m669a((android.support.p006v4.app.C0106f) r0, (android.support.p006v4.app.C0106f) r15)
            if (r2 == 0) goto L_0x001a
            r0 = r25
            boolean r0 = r0.f482b
            r16 = r0
            r0 = r25
            boolean r4 = r0.f485e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0 = r16
            java.lang.Object r9 = m674a((android.support.p006v4.app.C0156s) r2, (android.support.p006v4.app.C0106f) r15, (boolean) r0)
            r0 = r17
            java.lang.Object r10 = m692b((android.support.p006v4.app.C0156s) r2, (android.support.p006v4.app.C0106f) r0, (boolean) r4)
            r4 = r26
            r5 = r27
            r6 = r25
            java.lang.Object r14 = m675a((android.support.p006v4.app.C0156s) r2, (android.view.ViewGroup) r3, (android.view.View) r4, (android.support.p006v4.p014f.C0199a<java.lang.String, java.lang.String>) r5, (android.support.p006v4.app.C0145q.C0150a) r6, (java.util.ArrayList<android.view.View>) r7, (java.util.ArrayList<android.view.View>) r8, (java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 != 0) goto L_0x005d
            if (r14 != 0) goto L_0x005d
            if (r10 == 0) goto L_0x001a
        L_0x005d:
            r0 = r17
            r1 = r26
            java.util.ArrayList r20 = m678a((android.support.p006v4.app.C0156s) r2, (java.lang.Object) r10, (android.support.p006v4.app.C0106f) r0, (java.util.ArrayList<android.view.View>) r7, (android.view.View) r1)
            r0 = r26
            java.util.ArrayList r18 = m678a((android.support.p006v4.app.C0156s) r2, (java.lang.Object) r9, (android.support.p006v4.app.C0106f) r15, (java.util.ArrayList<android.view.View>) r8, (android.view.View) r0)
            r4 = 4
            r0 = r18
            m688a((java.util.ArrayList<android.view.View>) r0, (int) r4)
            r11 = r2
            r12 = r9
            r13 = r10
            java.lang.Object r16 = m676a((android.support.p006v4.app.C0156s) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (android.support.p006v4.app.C0106f) r15, (boolean) r16)
            if (r16 == 0) goto L_0x001a
            r0 = r17
            r1 = r20
            m685a((android.support.p006v4.app.C0156s) r2, (java.lang.Object) r10, (android.support.p006v4.app.C0106f) r0, (java.util.ArrayList<android.view.View>) r1)
            java.util.ArrayList r4 = r2.mo682a((java.util.ArrayList<android.view.View>) r8)
            r15 = r2
            r17 = r9
            r19 = r10
            r21 = r14
            r22 = r8
            r15.mo659a(r16, r17, r18, r19, r20, r21, r22)
            r0 = r16
            r2.mo655a((android.view.ViewGroup) r3, (java.lang.Object) r0)
            r5 = r2
            r6 = r3
            r9 = r4
            r10 = r27
            r5.mo684a(r6, r7, r8, r9, r10)
            r3 = 0
            r0 = r18
            m688a((java.util.ArrayList<android.view.View>) r0, (int) r3)
            r2.mo661a((java.lang.Object) r14, (java.util.ArrayList<android.view.View>) r7, (java.util.ArrayList<android.view.View>) r8)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.app.C0145q.m682a(android.support.v4.app.l, int, android.support.v4.app.q$a, android.view.View, android.support.v4.f.a):void");
    }

    /* renamed from: a */
    static void m683a(C0123l lVar, ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (lVar.f386l >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0100c cVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m694b(cVar, (SparseArray<C0150a>) sparseArray, z);
                } else {
                    m680a(cVar, (SparseArray<C0150a>) sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(lVar.f387m.mo519g());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0199a<String, String> a = m670a(keyAt, arrayList, arrayList2, i, i2);
                    C0150a aVar = (C0150a) sparseArray.valueAt(i4);
                    if (z) {
                        m682a(lVar, keyAt, aVar, view, a);
                    } else {
                        m695b(lVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m684a(C0156s sVar, ViewGroup viewGroup, C0106f fVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final C0156s sVar2 = sVar;
        final View view2 = view;
        final C0106f fVar2 = fVar;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        C0170z.m788a(viewGroup, new Runnable() {
            public void run() {
                if (obj3 != null) {
                    sVar2.mo669c(obj3, view2);
                    arrayList5.addAll(C0145q.m678a(sVar2, obj3, fVar2, (ArrayList<View>) arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        sVar2.mo667b(obj4, (ArrayList<View>) arrayList6, (ArrayList<View>) arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        });
    }

    /* renamed from: a */
    private static void m685a(C0156s sVar, Object obj, C0106f fVar, final ArrayList<View> arrayList) {
        if (fVar != null && obj != null && fVar.f306l && fVar.f274B && fVar.f288P) {
            fVar.mo412f(true);
            sVar.mo666b(obj, fVar.mo424l(), arrayList);
            C0170z.m788a(fVar.f281I, new Runnable() {
                public void run() {
                    C0145q.m688a((ArrayList<View>) arrayList, 4);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m686a(C0156s sVar, Object obj, Object obj2, C0199a<String, View> aVar, boolean z, C0100c cVar) {
        if (cVar.f247r != null && !cVar.f247r.isEmpty()) {
            View view = aVar.get(z ? cVar.f248s.get(0) : cVar.f247r.get(0));
            sVar.mo657a(obj, view);
            if (obj2 != null) {
                sVar.mo657a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m687a(C0199a<String, String> aVar, C0199a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo937c(size))) {
                aVar.mo941d(size);
            }
        }
    }

    /* renamed from: a */
    static void m688a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static void m689a(ArrayList<View> arrayList, C0199a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View c = aVar.mo937c(size);
            if (collection.contains(C0249q.m1063e(c))) {
                arrayList.add(c);
            }
        }
    }

    /* renamed from: a */
    private static boolean m690a(C0156s sVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!sVar.mo662a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C0199a<String, View> m691b(C0156s sVar, C0199a<String, String> aVar, Object obj, C0150a aVar2) {
        C0094ab T;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        C0106f fVar = aVar2.f484d;
        C0199a<String, View> aVar3 = new C0199a<>();
        sVar.mo688a((Map<String, View>) aVar3, fVar.mo424l());
        C0100c cVar = aVar2.f486f;
        if (aVar2.f485e) {
            T = fVar.mo357S();
            arrayList = cVar.f248s;
        } else {
            T = fVar.mo358T();
            arrayList = cVar.f247r;
        }
        aVar3.mo812a(arrayList);
        if (T != null) {
            T.mo302a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C0249q.m1063e(view))) {
                    aVar.put(C0249q.m1063e(view), aVar.remove(str));
                }
            }
        } else {
            aVar.mo812a(aVar3.keySet());
        }
        return aVar3;
    }

    /* renamed from: b */
    private static Object m692b(C0156s sVar, C0106f fVar, boolean z) {
        if (fVar == null) {
            return null;
        }
        return sVar.mo663b(z ? fVar.mo441w() : fVar.mo442x());
    }

    /* renamed from: b */
    private static Object m693b(C0156s sVar, ViewGroup viewGroup, View view, C0199a<String, String> aVar, C0150a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        final Rect rect;
        final C0106f fVar = aVar2.f481a;
        final C0106f fVar2 = aVar2.f484d;
        if (fVar == null || fVar2 == null) {
            return null;
        }
        final boolean z = aVar2.f482b;
        Object a = aVar.isEmpty() ? null : m673a(sVar, fVar, fVar2, z);
        C0199a<String, View> b = m691b(sVar, aVar, a, aVar2);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(b.values());
            obj3 = a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m681a(fVar, fVar2, z, b, true);
        if (obj3 != null) {
            rect = new Rect();
            sVar.mo658a(obj3, view, arrayList);
            m686a(sVar, obj3, obj2, b, aVar2.f485e, aVar2.f486f);
            if (obj != null) {
                sVar.mo656a(obj, rect);
            }
        } else {
            rect = null;
        }
        final C0156s sVar2 = sVar;
        final C0199a<String, String> aVar3 = aVar;
        final Object obj4 = obj3;
        final C0150a aVar4 = aVar2;
        final ArrayList<View> arrayList3 = arrayList2;
        final View view2 = view;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj5 = obj;
        C0170z.m788a(viewGroup, new Runnable() {
            public void run() {
                C0199a<String, View> a = C0145q.m671a(sVar2, (C0199a<String, String>) aVar3, obj4, aVar4);
                if (a != null) {
                    arrayList3.addAll(a.values());
                    arrayList3.add(view2);
                }
                C0145q.m681a(fVar, fVar2, z, a, false);
                if (obj4 != null) {
                    sVar2.mo661a(obj4, (ArrayList<View>) arrayList4, (ArrayList<View>) arrayList3);
                    View a2 = C0145q.m672a(a, aVar4, obj5, z);
                    if (a2 != null) {
                        sVar2.mo683a(a2, rect);
                    }
                }
            }
        });
        return obj3;
    }

    /* renamed from: b */
    public static void m694b(C0100c cVar, SparseArray<C0150a> sparseArray, boolean z) {
        if (cVar.f230a.f388n.mo448a()) {
            for (int size = cVar.f231b.size() - 1; size >= 0; size--) {
                m679a(cVar, cVar.f231b.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r13 = r31.f481a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m695b(android.support.p006v4.app.C0123l r29, int r30, android.support.p006v4.app.C0145q.C0150a r31, android.view.View r32, android.support.p006v4.p014f.C0199a<java.lang.String, java.lang.String> r33) {
        /*
            r2 = 0
            r0 = r29
            android.support.v4.app.h r1 = r0.f388n
            boolean r1 = r1.mo448a()
            if (r1 == 0) goto L_0x0018
            r0 = r29
            android.support.v4.app.h r1 = r0.f388n
            r0 = r30
            android.view.View r1 = r1.mo447a(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = r1
        L_0x0018:
            if (r2 != 0) goto L_0x001b
        L_0x001a:
            return
        L_0x001b:
            r0 = r31
            android.support.v4.app.f r13 = r0.f481a
            r0 = r31
            android.support.v4.app.f r10 = r0.f484d
            android.support.v4.app.s r1 = m669a((android.support.p006v4.app.C0106f) r10, (android.support.p006v4.app.C0106f) r13)
            if (r1 == 0) goto L_0x001a
            r0 = r31
            boolean r3 = r0.f482b
            r0 = r31
            boolean r4 = r0.f485e
            java.lang.Object r8 = m674a((android.support.p006v4.app.C0156s) r1, (android.support.p006v4.app.C0106f) r13, (boolean) r3)
            java.lang.Object r9 = m692b((android.support.p006v4.app.C0156s) r1, (android.support.p006v4.app.C0106f) r10, (boolean) r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3 = r32
            r4 = r33
            r5 = r31
            java.lang.Object r12 = m693b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r8 != 0) goto L_0x0053
            if (r12 != 0) goto L_0x0053
            if (r9 == 0) goto L_0x001a
        L_0x0053:
            r0 = r32
            java.util.ArrayList r19 = m678a((android.support.p006v4.app.C0156s) r1, (java.lang.Object) r9, (android.support.p006v4.app.C0106f) r10, (java.util.ArrayList<android.view.View>) r6, (android.view.View) r0)
            if (r19 == 0) goto L_0x0061
            boolean r3 = r19.isEmpty()
            if (r3 == 0) goto L_0x00a8
        L_0x0061:
            r11 = 0
        L_0x0062:
            r0 = r32
            r1.mo665b(r8, r0)
            r0 = r31
            boolean r14 = r0.f482b
            r9 = r1
            r10 = r8
            java.lang.Object r15 = m676a((android.support.p006v4.app.C0156s) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (android.support.p006v4.app.C0106f) r13, (boolean) r14)
            if (r15 == 0) goto L_0x001a
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            r14 = r1
            r16 = r8
            r18 = r11
            r20 = r12
            r21 = r7
            r14.mo659a(r15, r16, r17, r18, r19, r20, r21)
            r20 = r1
            r21 = r2
            r22 = r13
            r23 = r32
            r24 = r7
            r25 = r8
            r26 = r17
            r27 = r11
            r28 = r19
            m684a((android.support.p006v4.app.C0156s) r20, (android.view.ViewGroup) r21, (android.support.p006v4.app.C0106f) r22, (android.view.View) r23, (java.util.ArrayList<android.view.View>) r24, (java.lang.Object) r25, (java.util.ArrayList<android.view.View>) r26, (java.lang.Object) r27, (java.util.ArrayList<android.view.View>) r28)
            r0 = r33
            r1.mo685a((android.view.View) r2, (java.util.ArrayList<android.view.View>) r7, (java.util.Map<java.lang.String, java.lang.String>) r0)
            r1.mo655a((android.view.ViewGroup) r2, (java.lang.Object) r15)
            r0 = r33
            r1.mo686a((android.view.ViewGroup) r2, (java.util.ArrayList<android.view.View>) r7, (java.util.Map<java.lang.String, java.lang.String>) r0)
            goto L_0x001a
        L_0x00a8:
            r11 = r9
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.app.C0145q.m695b(android.support.v4.app.l, int, android.support.v4.app.q$a, android.view.View, android.support.v4.f.a):void");
    }
}
