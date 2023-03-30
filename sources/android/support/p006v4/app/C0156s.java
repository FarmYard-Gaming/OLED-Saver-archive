package android.support.p006v4.app;

import android.graphics.Rect;
import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.p015g.C0254s;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.s */
public abstract class C0156s {
    /* renamed from: a */
    static String m713a(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m714a(List<View> list, View view) {
        int size = list.size();
        if (!m716a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m716a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    protected static boolean m715a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m716a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo654a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo682a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0249q.m1063e(view));
            C0249q.m1057a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo683a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo684a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String e = C0249q.m1063e(view2);
            arrayList4.add(e);
            if (e != null) {
                C0249q.m1057a(view2, (String) null);
                String str = map.get(e);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0249q.m1057a(arrayList2.get(i2), e);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C0170z.m788a(view, new Runnable() {
            public void run() {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < size) {
                        C0249q.m1057a((View) arrayList5.get(i2), (String) arrayList6.get(i2));
                        C0249q.m1057a((View) arrayList7.get(i2), (String) arrayList4.get(i2));
                        i = i2 + 1;
                    } else {
                        return;
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo685a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0170z.m788a(view, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String e = C0249q.m1063e(view);
                    if (e != null) {
                        C0249q.m1057a(view, C0156s.m713a((Map<String, String>) map, e));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public abstract void mo655a(ViewGroup viewGroup, Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo686a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0170z.m788a(viewGroup, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    C0249q.m1057a(view, (String) map.get(C0249q.m1063e(view)));
                }
            }
        });
    }

    /* renamed from: a */
    public abstract void mo656a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo657a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo658a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo659a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo660a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo661a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo687a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0254s.m1083a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo687a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo688a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String e = C0249q.m1063e(view);
            if (e != null) {
                map.put(e, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo688a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo662a(Object obj);

    /* renamed from: b */
    public abstract Object mo663b(Object obj);

    /* renamed from: b */
    public abstract Object mo664b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo665b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo666b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo667b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo668c(Object obj);

    /* renamed from: c */
    public abstract void mo669c(Object obj, View view);
}
