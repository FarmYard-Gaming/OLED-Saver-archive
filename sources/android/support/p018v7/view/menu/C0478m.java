package android.support.p018v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.m */
abstract class C0478m implements C0481o, C0487s, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f1625a;

    C0478m() {
    }

    /* renamed from: a */
    protected static int m2320a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        FrameLayout frameLayout = viewGroup;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
        }
        return i4;
    }

    /* renamed from: a */
    protected static C0464g m2321a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0464g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0464g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m2322b(C0465h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo2034a(int i);

    /* renamed from: a */
    public void mo2015a(Context context, C0465h hVar) {
    }

    /* renamed from: a */
    public void mo2274a(Rect rect) {
        this.f1625a = rect;
    }

    /* renamed from: a */
    public abstract void mo2035a(C0465h hVar);

    /* renamed from: a */
    public abstract void mo2036a(View view);

    /* renamed from: a */
    public abstract void mo2037a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo2038a(boolean z);

    /* renamed from: a */
    public boolean mo2021a(C0465h hVar, C0469j jVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo2039b(int i);

    /* renamed from: b */
    public boolean mo2027b(C0465h hVar, C0469j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo2041c(int i);

    /* renamed from: c */
    public abstract void mo2042c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo2045f() {
        return true;
    }

    /* renamed from: g */
    public Rect mo2275g() {
        return this.f1625a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m2321a(listAdapter).f1548a.mo2092a((MenuItem) listAdapter.getItem(i), (C0481o) this, mo2045f() ? 0 : 4);
    }
}
