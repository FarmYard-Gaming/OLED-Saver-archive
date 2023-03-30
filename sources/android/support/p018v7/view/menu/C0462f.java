package android.support.p018v7.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.view.menu.C0483p;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.f */
public class C0462f implements C0481o, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f1537a;

    /* renamed from: b */
    LayoutInflater f1538b;

    /* renamed from: c */
    C0465h f1539c;

    /* renamed from: d */
    ExpandedMenuView f1540d;

    /* renamed from: e */
    int f1541e;

    /* renamed from: f */
    int f1542f;

    /* renamed from: g */
    int f1543g;

    /* renamed from: h */
    C0463a f1544h;

    /* renamed from: i */
    private C0481o.C0482a f1545i;

    /* renamed from: android.support.v7.view.menu.f$a */
    private class C0463a extends BaseAdapter {

        /* renamed from: b */
        private int f1547b = -1;

        public C0463a() {
            mo2059a();
        }

        /* renamed from: a */
        public C0469j getItem(int i) {
            ArrayList<C0469j> m = C0462f.this.f1539c.mo2131m();
            int i2 = C0462f.this.f1541e + i;
            if (this.f1547b >= 0 && i2 >= this.f1547b) {
                i2++;
            }
            return m.get(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2059a() {
            C0469j s = C0462f.this.f1539c.mo2141s();
            if (s != null) {
                ArrayList<C0469j> m = C0462f.this.f1539c.mo2131m();
                int size = m.size();
                for (int i = 0; i < size; i++) {
                    if (m.get(i) == s) {
                        this.f1547b = i;
                        return;
                    }
                }
            }
            this.f1547b = -1;
        }

        public int getCount() {
            int size = C0462f.this.f1539c.mo2131m().size() - C0462f.this.f1541e;
            return this.f1547b < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? C0462f.this.f1538b.inflate(C0462f.this.f1543g, viewGroup, false) : view;
            ((C0483p.C0484a) inflate).mo1936a(getItem(i), 0);
            return inflate;
        }

        public void notifyDataSetChanged() {
            mo2059a();
            super.notifyDataSetChanged();
        }
    }

    public C0462f(int i, int i2) {
        this.f1543g = i;
        this.f1542f = i2;
    }

    public C0462f(Context context, int i) {
        this(i, 0);
        this.f1537a = context;
        this.f1538b = LayoutInflater.from(this.f1537a);
    }

    /* renamed from: a */
    public C0483p mo2055a(ViewGroup viewGroup) {
        if (this.f1540d == null) {
            this.f1540d = (ExpandedMenuView) this.f1538b.inflate(C0353a.C0360g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1544h == null) {
                this.f1544h = new C0463a();
            }
            this.f1540d.setAdapter(this.f1544h);
            this.f1540d.setOnItemClickListener(this);
        }
        return this.f1540d;
    }

    /* renamed from: a */
    public ListAdapter mo2056a() {
        if (this.f1544h == null) {
            this.f1544h = new C0463a();
        }
        return this.f1544h;
    }

    /* renamed from: a */
    public void mo2015a(Context context, C0465h hVar) {
        if (this.f1542f != 0) {
            this.f1537a = new ContextThemeWrapper(context, this.f1542f);
            this.f1538b = LayoutInflater.from(this.f1537a);
        } else if (this.f1537a != null) {
            this.f1537a = context;
            if (this.f1538b == null) {
                this.f1538b = LayoutInflater.from(this.f1537a);
            }
        }
        this.f1539c = hVar;
        if (this.f1544h != null) {
            this.f1544h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo2016a(C0465h hVar, boolean z) {
        if (this.f1545i != null) {
            this.f1545i.mo1665a(hVar, z);
        }
    }

    /* renamed from: a */
    public void mo2018a(C0481o.C0482a aVar) {
        this.f1545i = aVar;
    }

    /* renamed from: a */
    public boolean mo2021a(C0465h hVar, C0469j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo2022a(C0491u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        new C0468i(uVar).mo2149a((IBinder) null);
        if (this.f1545i != null) {
            this.f1545i.mo1666a(uVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo2025b(boolean z) {
        if (this.f1544h != null) {
            this.f1544h.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo2026b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo2027b(C0465h hVar, C0469j jVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1539c.mo2092a((MenuItem) this.f1544h.getItem(i), (C0481o) this, 0);
    }
}
