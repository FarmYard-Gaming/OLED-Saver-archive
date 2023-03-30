package android.support.p018v7.view.menu;

import android.content.Context;
import android.support.p006v4.p009b.p010a.C0172b;
import android.support.p006v4.p009b.p010a.C0173c;
import android.support.p006v4.p014f.C0199a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
abstract class C0454c<T> extends C0455d<T> {

    /* renamed from: a */
    final Context f1496a;

    /* renamed from: c */
    private Map<C0172b, MenuItem> f1497c;

    /* renamed from: d */
    private Map<C0173c, SubMenu> f1498d;

    C0454c(Context context, T t) {
        super(t);
        this.f1496a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo2028a(MenuItem menuItem) {
        if (!(menuItem instanceof C0172b)) {
            return menuItem;
        }
        C0172b bVar = (C0172b) menuItem;
        if (this.f1497c == null) {
            this.f1497c = new C0199a();
        }
        MenuItem menuItem2 = this.f1497c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0485q.m2365a(this.f1496a, bVar);
        this.f1497c.put(bVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo2029a(SubMenu subMenu) {
        if (!(subMenu instanceof C0173c)) {
            return subMenu;
        }
        C0173c cVar = (C0173c) subMenu;
        if (this.f1498d == null) {
            this.f1498d = new C0199a();
        }
        SubMenu subMenu2 = this.f1498d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu a = C0485q.m2366a(this.f1496a, cVar);
        this.f1498d.put(cVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2030a() {
        if (this.f1497c != null) {
            this.f1497c.clear();
        }
        if (this.f1498d != null) {
            this.f1498d.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2031a(int i) {
        if (this.f1497c != null) {
            Iterator<C0172b> it = this.f1497c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2032b(int i) {
        if (this.f1497c != null) {
            Iterator<C0172b> it = this.f1497c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
