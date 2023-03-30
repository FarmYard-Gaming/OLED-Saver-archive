package android.support.p018v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p006v4.p007a.C0068a;
import android.support.p006v4.p009b.p010a.C0171a;
import android.support.p006v4.p015g.C0232c;
import android.support.p006v4.p015g.C0253r;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.h */
public class C0465h implements C0171a {

    /* renamed from: d */
    private static final int[] f1554d = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f1555A;

    /* renamed from: a */
    CharSequence f1556a;

    /* renamed from: b */
    Drawable f1557b;

    /* renamed from: c */
    View f1558c;

    /* renamed from: e */
    private final Context f1559e;

    /* renamed from: f */
    private final Resources f1560f;

    /* renamed from: g */
    private boolean f1561g;

    /* renamed from: h */
    private boolean f1562h;

    /* renamed from: i */
    private C0466a f1563i;

    /* renamed from: j */
    private ArrayList<C0469j> f1564j;

    /* renamed from: k */
    private ArrayList<C0469j> f1565k;

    /* renamed from: l */
    private boolean f1566l;

    /* renamed from: m */
    private ArrayList<C0469j> f1567m;

    /* renamed from: n */
    private ArrayList<C0469j> f1568n;

    /* renamed from: o */
    private boolean f1569o;

    /* renamed from: p */
    private int f1570p = 0;

    /* renamed from: q */
    private ContextMenu.ContextMenuInfo f1571q;

    /* renamed from: r */
    private boolean f1572r = false;

    /* renamed from: s */
    private boolean f1573s = false;

    /* renamed from: t */
    private boolean f1574t = false;

    /* renamed from: u */
    private boolean f1575u = false;

    /* renamed from: v */
    private boolean f1576v = false;

    /* renamed from: w */
    private ArrayList<C0469j> f1577w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0481o>> f1578x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0469j f1579y;

    /* renamed from: z */
    private boolean f1580z = false;

    /* renamed from: android.support.v7.view.menu.h$a */
    public interface C0466a {
        /* renamed from: a */
        void mo1633a(C0465h hVar);

        /* renamed from: a */
        boolean mo1636a(C0465h hVar, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b */
    public interface C0467b {
        /* renamed from: a */
        boolean mo1959a(C0469j jVar);
    }

    public C0465h(Context context) {
        this.f1559e = context;
        this.f1560f = context.getResources();
        this.f1564j = new ArrayList<>();
        this.f1565k = new ArrayList<>();
        this.f1566l = true;
        this.f1567m = new ArrayList<>();
        this.f1568n = new ArrayList<>();
        this.f1569o = true;
        m2218e(true);
    }

    /* renamed from: a */
    private static int m2212a(ArrayList<C0469j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo2162c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0469j m2213a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0469j(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m2214a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources e = mo2118e();
        if (view != null) {
            this.f1558c = view;
            this.f1556a = null;
            this.f1557b = null;
        } else {
            if (i > 0) {
                this.f1556a = e.getText(i);
            } else if (charSequence != null) {
                this.f1556a = charSequence;
            }
            if (i2 > 0) {
                this.f1557b = C0068a.m208a(mo2120f(), i2);
            } else if (drawable != null) {
                this.f1557b = drawable;
            }
            this.f1558c = null;
        }
        mo2106b(false);
    }

    /* renamed from: a */
    private void m2215a(int i, boolean z) {
        if (i >= 0 && i < this.f1564j.size()) {
            this.f1564j.remove(i);
            if (z) {
                mo2106b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m2216a(C0491u uVar, C0481o oVar) {
        boolean z = false;
        if (this.f1578x.isEmpty()) {
            return false;
        }
        if (oVar != null) {
            z = oVar.mo2022a(uVar);
        }
        Iterator<WeakReference<C0481o>> it = this.f1578x.iterator();
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return z2;
            }
            WeakReference next = it.next();
            C0481o oVar2 = (C0481o) next.get();
            if (oVar2 == null) {
                this.f1578x.remove(next);
            } else if (!z2) {
                z2 = oVar2.mo2022a(uVar);
            }
            z = z2;
        }
    }

    /* renamed from: d */
    private void m2217d(boolean z) {
        if (!this.f1578x.isEmpty()) {
            mo2124h();
            Iterator<WeakReference<C0481o>> it = this.f1578x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0481o oVar = (C0481o) next.get();
                if (oVar == null) {
                    this.f1578x.remove(next);
                } else {
                    oVar.mo2025b(z);
                }
            }
            mo2126i();
        }
    }

    /* renamed from: e */
    private void m2218e(boolean z) {
        boolean z2 = true;
        if (!z || this.f1560f.getConfiguration().keyboard == 1 || !C0253r.m1082a(ViewConfiguration.get(this.f1559e), this.f1559e)) {
            z2 = false;
        }
        this.f1562h = z2;
    }

    /* renamed from: f */
    private static int m2219f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0 && i2 < f1554d.length) {
            return (f1554d[i2] << 16) | (65535 & i);
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public int mo2074a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (this.f1564j.get(i3).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C0465h mo2075a(int i) {
        this.f1570p = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0465h mo2076a(Drawable drawable) {
        m2214a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0465h mo2077a(View view) {
        m2214a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0465h mo2078a(CharSequence charSequence) {
        m2214a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0469j mo2079a(int i, KeyEvent keyEvent) {
        ArrayList<C0469j> arrayList = this.f1577w;
        arrayList.clear();
        mo2088a((List<C0469j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean c = mo2110c();
        for (int i2 = 0; i2 < size; i2++) {
            C0469j jVar = arrayList.get(i2);
            char alphabeticShortcut = c ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return jVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return jVar;
            }
            if (c && alphabeticShortcut == 8 && i == 67) {
                return jVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo2080a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m2219f(i3);
        C0469j a = m2213a(i, i2, i3, f, charSequence, this.f1570p);
        if (this.f1571q != null) {
            a.mo2157a(this.f1571q);
        }
        this.f1564j.add(m2212a(this.f1564j, f), a);
        mo2106b(true);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo2081a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: a */
    public void mo2082a(Bundle bundle) {
        SparseArray sparseArray = null;
        int size = size();
        int i = 0;
        while (i < size) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((C0491u) item.getSubMenu()).mo2082a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2081a(), sparseArray);
        }
    }

    /* renamed from: a */
    public void mo2083a(C0466a aVar) {
        this.f1563i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2084a(C0469j jVar) {
        this.f1566l = true;
        mo2106b(true);
    }

    /* renamed from: a */
    public void mo2085a(C0481o oVar) {
        mo2086a(oVar, this.f1559e);
    }

    /* renamed from: a */
    public void mo2086a(C0481o oVar, Context context) {
        this.f1578x.add(new WeakReference(oVar));
        oVar.mo2015a(context, this);
        this.f1569o = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2087a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1564j.size();
        mo2124h();
        for (int i = 0; i < size; i++) {
            C0469j jVar = this.f1564j.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo2169g() && jVar.isCheckable()) {
                jVar.mo2160b(jVar == menuItem);
            }
        }
        mo2126i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2088a(List<C0469j> list, int i, KeyEvent keyEvent) {
        boolean c = mo2110c();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1564j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0469j jVar = this.f1564j.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0465h) jVar.getSubMenu()).mo2088a(list, i, keyEvent);
                }
                char alphabeticShortcut = c ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((c ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (c && alphabeticShortcut == 8 && i == 67)) && jVar.isEnabled())) {
                    list.add(jVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2089a(boolean z) {
        if (!this.f1576v) {
            this.f1576v = true;
            Iterator<WeakReference<C0481o>> it = this.f1578x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0481o oVar = (C0481o) next.get();
                if (oVar == null) {
                    this.f1578x.remove(next);
                } else {
                    oVar.mo2016a(this, z);
                }
            }
            this.f1576v = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2090a(C0465h hVar, MenuItem menuItem) {
        return this.f1563i != null && this.f1563i.mo1636a(hVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo2091a(MenuItem menuItem, int i) {
        return mo2092a(menuItem, (C0481o) null, i);
    }

    /* renamed from: a */
    public boolean mo2092a(MenuItem menuItem, C0481o oVar, int i) {
        C0469j jVar = (C0469j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean b = jVar.mo2161b();
        C0232c a = jVar.mo726a();
        boolean z = a != null && a.mo1037e();
        if (jVar.mo2193n()) {
            boolean expandActionView = jVar.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            mo2089a(true);
            return expandActionView;
        } else if (jVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo2089a(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.mo2156a(new C0491u(mo2120f(), this, jVar));
            }
            C0491u uVar = (C0491u) jVar.getSubMenu();
            if (z) {
                a.mo1032a((SubMenu) uVar);
            }
            boolean a2 = m2216a(uVar, oVar) | b;
            if (a2) {
                return a2;
            }
            mo2089a(true);
            return a2;
        } else {
            if ((i & 1) == 0) {
                mo2089a(true);
            }
            return b;
        }
    }

    public MenuItem add(int i) {
        return mo2080a(0, 0, 0, this.f1560f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2080a(i, i2, i3, this.f1560f.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2080a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2080a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f1559e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1560f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1560f.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0469j jVar = (C0469j) mo2080a(i, i2, i3, charSequence);
        C0491u uVar = new C0491u(this.f1559e, this, jVar);
        jVar.mo2156a(uVar);
        return uVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int mo2102b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1564j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo2103b(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo2081a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0491u) item.getSubMenu()).mo2103b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2104b(C0469j jVar) {
        this.f1569o = true;
        mo2106b(true);
    }

    /* renamed from: b */
    public void mo2105b(C0481o oVar) {
        Iterator<WeakReference<C0481o>> it = this.f1578x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0481o oVar2 = (C0481o) next.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.f1578x.remove(next);
            }
        }
    }

    /* renamed from: b */
    public void mo2106b(boolean z) {
        if (!this.f1572r) {
            if (z) {
                this.f1566l = true;
                this.f1569o = true;
            }
            m2217d(z);
            return;
        }
        this.f1573s = true;
        if (z) {
            this.f1574t = true;
        }
    }

    /* renamed from: b */
    public boolean mo2107b() {
        return this.f1580z;
    }

    /* renamed from: c */
    public int mo2108c(int i) {
        return mo2074a(i, 0);
    }

    /* renamed from: c */
    public void mo2109c(boolean z) {
        this.f1555A = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2110c() {
        return this.f1561g;
    }

    /* renamed from: c */
    public boolean mo2111c(C0469j jVar) {
        boolean z = false;
        if (!this.f1578x.isEmpty()) {
            mo2124h();
            Iterator<WeakReference<C0481o>> it = this.f1578x.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference next = it.next();
                C0481o oVar = (C0481o) next.get();
                if (oVar == null) {
                    this.f1578x.remove(next);
                    z = z2;
                } else {
                    z = oVar.mo2021a(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo2126i();
            if (z) {
                this.f1579y = jVar;
            }
        }
        return z;
    }

    public void clear() {
        if (this.f1579y != null) {
            mo2117d(this.f1579y);
        }
        this.f1564j.clear();
        mo2106b(true);
    }

    public void clearHeader() {
        this.f1557b = null;
        this.f1556a = null;
        this.f1558c = null;
        mo2106b(false);
    }

    public void close() {
        mo2089a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0465h mo2115d(int i) {
        m2214a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: d */
    public boolean mo2116d() {
        return this.f1562h;
    }

    /* renamed from: d */
    public boolean mo2117d(C0469j jVar) {
        boolean z = false;
        if (!this.f1578x.isEmpty() && this.f1579y == jVar) {
            mo2124h();
            Iterator<WeakReference<C0481o>> it = this.f1578x.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference next = it.next();
                C0481o oVar = (C0481o) next.get();
                if (oVar == null) {
                    this.f1578x.remove(next);
                    z = z2;
                } else {
                    z = oVar.mo2027b(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo2126i();
            if (z) {
                this.f1579y = null;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Resources mo2118e() {
        return this.f1560f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0465h mo2119e(int i) {
        m2214a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: f */
    public Context mo2120f() {
        return this.f1559e;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0469j jVar = this.f1564j.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo2122g() {
        if (this.f1563i != null) {
            this.f1563i.mo1633a(this);
        }
    }

    public MenuItem getItem(int i) {
        return this.f1564j.get(i);
    }

    /* renamed from: h */
    public void mo2124h() {
        if (!this.f1572r) {
            this.f1572r = true;
            this.f1573s = false;
            this.f1574t = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f1555A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1564j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo2126i() {
        this.f1572r = false;
        if (this.f1573s) {
            this.f1573s = false;
            mo2106b(this.f1574t);
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo2079a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0469j> mo2128j() {
        if (!this.f1566l) {
            return this.f1565k;
        }
        this.f1565k.clear();
        int size = this.f1564j.size();
        for (int i = 0; i < size; i++) {
            C0469j jVar = this.f1564j.get(i);
            if (jVar.isVisible()) {
                this.f1565k.add(jVar);
            }
        }
        this.f1566l = false;
        this.f1569o = true;
        return this.f1565k;
    }

    /* renamed from: k */
    public void mo2129k() {
        boolean b;
        ArrayList<C0469j> j = mo2128j();
        if (this.f1569o) {
            Iterator<WeakReference<C0481o>> it = this.f1578x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0481o oVar = (C0481o) next.get();
                if (oVar == null) {
                    this.f1578x.remove(next);
                    b = z;
                } else {
                    b = oVar.mo2026b() | z;
                }
                z = b;
            }
            if (z) {
                this.f1567m.clear();
                this.f1568n.clear();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    C0469j jVar = j.get(i);
                    if (jVar.mo2189j()) {
                        this.f1567m.add(jVar);
                    } else {
                        this.f1568n.add(jVar);
                    }
                }
            } else {
                this.f1567m.clear();
                this.f1568n.clear();
                this.f1568n.addAll(mo2128j());
            }
            this.f1569o = false;
        }
    }

    /* renamed from: l */
    public ArrayList<C0469j> mo2130l() {
        mo2129k();
        return this.f1567m;
    }

    /* renamed from: m */
    public ArrayList<C0469j> mo2131m() {
        mo2129k();
        return this.f1568n;
    }

    /* renamed from: n */
    public CharSequence mo2132n() {
        return this.f1556a;
    }

    /* renamed from: o */
    public Drawable mo2133o() {
        return this.f1557b;
    }

    /* renamed from: p */
    public View mo2134p() {
        return this.f1558c;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo2091a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0469j a = mo2079a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = mo2091a((MenuItem) a, i2);
        }
        if ((i2 & 2) != 0) {
            mo2089a(true);
        }
        return z;
    }

    /* renamed from: q */
    public C0465h mo2137q() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo2138r() {
        return this.f1575u;
    }

    public void removeGroup(int i) {
        int c = mo2108c(i);
        if (c >= 0) {
            int size = this.f1564j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1564j.get(c).getGroupId() != i) {
                    mo2106b(true);
                } else {
                    m2215a(c, false);
                    i2 = i3;
                }
            }
            mo2106b(true);
        }
    }

    public void removeItem(int i) {
        m2215a(mo2102b(i), true);
    }

    /* renamed from: s */
    public C0469j mo2141s() {
        return this.f1579y;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1564j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0469j jVar = this.f1564j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo2158a(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1580z = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1564j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0469j jVar = this.f1564j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1564j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            C0469j jVar = this.f1564j.get(i2);
            i2++;
            z2 = (jVar.getGroupId() != i || !jVar.mo2163c(z)) ? z2 : true;
        }
        if (z2) {
            mo2106b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1561g = z;
        mo2106b(false);
    }

    public int size() {
        return this.f1564j.size();
    }
}
