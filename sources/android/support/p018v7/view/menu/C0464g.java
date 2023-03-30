package android.support.p018v7.view.menu;

import android.support.p018v7.view.menu.C0483p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g */
public class C0464g extends BaseAdapter {

    /* renamed from: a */
    C0465h f1548a;

    /* renamed from: b */
    private int f1549b = -1;

    /* renamed from: c */
    private boolean f1550c;

    /* renamed from: d */
    private final boolean f1551d;

    /* renamed from: e */
    private final LayoutInflater f1552e;

    /* renamed from: f */
    private final int f1553f;

    public C0464g(C0465h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1551d = z;
        this.f1552e = layoutInflater;
        this.f1548a = hVar;
        this.f1553f = i;
        mo2068b();
    }

    /* renamed from: a */
    public C0465h mo2065a() {
        return this.f1548a;
    }

    /* renamed from: a */
    public C0469j getItem(int i) {
        ArrayList<C0469j> m = this.f1551d ? this.f1548a.mo2131m() : this.f1548a.mo2128j();
        if (this.f1549b >= 0 && i >= this.f1549b) {
            i++;
        }
        return m.get(i);
    }

    /* renamed from: a */
    public void mo2067a(boolean z) {
        this.f1550c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2068b() {
        C0469j s = this.f1548a.mo2141s();
        if (s != null) {
            ArrayList<C0469j> m = this.f1548a.mo2131m();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                if (m.get(i) == s) {
                    this.f1549b = i;
                    return;
                }
            }
        }
        this.f1549b = -1;
    }

    public int getCount() {
        ArrayList<C0469j> m = this.f1551d ? this.f1548a.mo2131m() : this.f1548a.mo2128j();
        return this.f1549b < 0 ? m.size() : m.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = view == null ? this.f1552e.inflate(this.f1553f, viewGroup, false) : view;
        int groupId = getItem(i).getGroupId();
        ((ListMenuItemView) inflate).setGroupDividerEnabled(this.f1548a.mo2107b() && groupId != (i + -1 >= 0 ? getItem(i + -1).getGroupId() : groupId));
        C0483p.C0484a aVar = (C0483p.C0484a) inflate;
        if (this.f1550c) {
            ((ListMenuItemView) inflate).setForceShowIcon(true);
        }
        aVar.mo1936a(getItem(i), 0);
        return inflate;
    }

    public void notifyDataSetChanged() {
        mo2068b();
        super.notifyDataSetChanged();
    }
}
