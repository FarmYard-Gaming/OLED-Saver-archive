package android.support.p018v7.view;

import android.content.Context;
import android.support.p006v4.p009b.p010a.C0171a;
import android.support.p006v4.p009b.p010a.C0172b;
import android.support.p006v4.p014f.C0216k;
import android.support.p018v7.view.C0437b;
import android.support.p018v7.view.menu.C0485q;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.f */
public class C0442f extends ActionMode {

    /* renamed from: a */
    final Context f1374a;

    /* renamed from: b */
    final C0437b f1375b;

    /* renamed from: android.support.v7.view.f$a */
    public static class C0443a implements C0437b.C0438a {

        /* renamed from: a */
        final ActionMode.Callback f1376a;

        /* renamed from: b */
        final Context f1377b;

        /* renamed from: c */
        final ArrayList<C0442f> f1378c = new ArrayList<>();

        /* renamed from: d */
        final C0216k<Menu, Menu> f1379d = new C0216k<>();

        public C0443a(Context context, ActionMode.Callback callback) {
            this.f1377b = context;
            this.f1376a = callback;
        }

        /* renamed from: a */
        private Menu m2089a(Menu menu) {
            Menu menu2 = this.f1379d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0485q.m2364a(this.f1377b, (C0171a) menu);
            this.f1379d.put(menu, a);
            return a;
        }

        /* renamed from: a */
        public void mo1667a(C0437b bVar) {
            this.f1376a.onDestroyActionMode(mo1902b(bVar));
        }

        /* renamed from: a */
        public boolean mo1668a(C0437b bVar, Menu menu) {
            return this.f1376a.onCreateActionMode(mo1902b(bVar), m2089a(menu));
        }

        /* renamed from: a */
        public boolean mo1669a(C0437b bVar, MenuItem menuItem) {
            return this.f1376a.onActionItemClicked(mo1902b(bVar), C0485q.m2365a(this.f1377b, (C0172b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo1902b(C0437b bVar) {
            int size = this.f1378c.size();
            for (int i = 0; i < size; i++) {
                C0442f fVar = this.f1378c.get(i);
                if (fVar != null && fVar.f1375b == bVar) {
                    return fVar;
                }
            }
            C0442f fVar2 = new C0442f(this.f1377b, bVar);
            this.f1378c.add(fVar2);
            return fVar2;
        }

        /* renamed from: b */
        public boolean mo1670b(C0437b bVar, Menu menu) {
            return this.f1376a.onPrepareActionMode(mo1902b(bVar), m2089a(menu));
        }
    }

    public C0442f(Context context, C0437b bVar) {
        this.f1374a = context;
        this.f1375b = bVar;
    }

    public void finish() {
        this.f1375b.mo1729c();
    }

    public View getCustomView() {
        return this.f1375b.mo1735i();
    }

    public Menu getMenu() {
        return C0485q.m2364a(this.f1374a, (C0171a) this.f1375b.mo1726b());
    }

    public MenuInflater getMenuInflater() {
        return this.f1375b.mo1721a();
    }

    public CharSequence getSubtitle() {
        return this.f1375b.mo1733g();
    }

    public Object getTag() {
        return this.f1375b.mo1873j();
    }

    public CharSequence getTitle() {
        return this.f1375b.mo1732f();
    }

    public boolean getTitleOptionalHint() {
        return this.f1375b.mo1874k();
    }

    public void invalidate() {
        this.f1375b.mo1730d();
    }

    public boolean isTitleOptional() {
        return this.f1375b.mo1734h();
    }

    public void setCustomView(View view) {
        this.f1375b.mo1723a(view);
    }

    public void setSubtitle(int i) {
        this.f1375b.mo1727b(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1375b.mo1724a(charSequence);
    }

    public void setTag(Object obj) {
        this.f1375b.mo1872a(obj);
    }

    public void setTitle(int i) {
        this.f1375b.mo1722a(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1375b.mo1728b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f1375b.mo1725a(z);
    }
}
