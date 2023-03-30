package android.support.p018v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p015g.C0232c;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActivityChooserView */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0504a f1737a;

    /* renamed from: b */
    final FrameLayout f1738b;

    /* renamed from: c */
    final FrameLayout f1739c;

    /* renamed from: d */
    C0232c f1740d;

    /* renamed from: e */
    final DataSetObserver f1741e;

    /* renamed from: f */
    PopupWindow.OnDismissListener f1742f;

    /* renamed from: g */
    boolean f1743g;

    /* renamed from: h */
    int f1744h;

    /* renamed from: i */
    private final C0505b f1745i;

    /* renamed from: j */
    private final View f1746j;

    /* renamed from: k */
    private final ImageView f1747k;

    /* renamed from: l */
    private final int f1748l;

    /* renamed from: m */
    private final ViewTreeObserver.OnGlobalLayoutListener f1749m;

    /* renamed from: n */
    private C0550ai f1750n;

    /* renamed from: o */
    private boolean f1751o;

    /* renamed from: p */
    private int f1752p;

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f1753a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0575au a = C0575au.m2818a(context, attributeSet, f1753a);
            setBackgroundDrawable(a.mo2958a(0));
            a.mo2959a();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    private class C0504a extends BaseAdapter {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f1754a;

        /* renamed from: b */
        private C0596d f1755b;

        /* renamed from: c */
        private int f1756c;

        /* renamed from: d */
        private boolean f1757d;

        /* renamed from: e */
        private boolean f1758e;

        /* renamed from: f */
        private boolean f1759f;

        /* renamed from: a */
        public int mo2481a() {
            int i = this.f1756c;
            this.f1756c = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i2 = 0;
            View view = null;
            int i3 = 0;
            while (i2 < count) {
                View view2 = getView(i2, view, (ViewGroup) null);
                view2.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(i3, view2.getMeasuredWidth());
                i2++;
                view = view2;
            }
            this.f1756c = i;
            return i3;
        }

        /* renamed from: a */
        public void mo2482a(int i) {
            if (this.f1756c != i) {
                this.f1756c = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo2483a(C0596d dVar) {
            C0596d d = this.f1754a.f1737a.mo2488d();
            if (d != null && this.f1754a.isShown()) {
                d.unregisterObserver(this.f1754a.f1741e);
            }
            this.f1755b = dVar;
            if (dVar != null && this.f1754a.isShown()) {
                dVar.registerObserver(this.f1754a.f1741e);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo2484a(boolean z) {
            if (this.f1759f != z) {
                this.f1759f = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo2485a(boolean z, boolean z2) {
            if (this.f1757d != z || this.f1758e != z2) {
                this.f1757d = z;
                this.f1758e = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public ResolveInfo mo2486b() {
            return this.f1755b.mo3020b();
        }

        /* renamed from: c */
        public int mo2487c() {
            return this.f1755b.mo3016a();
        }

        /* renamed from: d */
        public C0596d mo2488d() {
            return this.f1755b;
        }

        /* renamed from: e */
        public boolean mo2489e() {
            return this.f1757d;
        }

        public int getCount() {
            int a = this.f1755b.mo3016a();
            if (!this.f1757d && this.f1755b.mo3020b() != null) {
                a--;
            }
            int min = Math.min(a, this.f1756c);
            return this.f1759f ? min + 1 : min;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f1757d && this.f1755b.mo3020b() != null) {
                        i++;
                    }
                    return this.f1755b.mo3018a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.f1759f || i != getCount() + -1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0353a.C0359f.list_item) {
                        view = LayoutInflater.from(this.f1754a.getContext()).inflate(C0353a.C0360g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f1754a.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0353a.C0359f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0353a.C0359f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (!this.f1757d || i != 0 || !this.f1758e) {
                        view.setActivated(false);
                        return view;
                    }
                    view.setActivated(true);
                    return view;
                case 1:
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View inflate = LayoutInflater.from(this.f1754a.getContext()).inflate(C0353a.C0360g.abc_activity_chooser_view_list_item, viewGroup, false);
                    inflate.setId(1);
                    ((TextView) inflate.findViewById(C0353a.C0359f.title)).setText(this.f1754a.getContext().getString(C0353a.C0361h.abc_activity_chooser_view_see_all));
                    return inflate;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    private class C0505b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f1760a;

        /* renamed from: a */
        private void m2477a() {
            if (this.f1760a.f1742f != null) {
                this.f1760a.f1742f.onDismiss();
            }
        }

        public void onClick(View view) {
            if (view == this.f1760a.f1739c) {
                this.f1760a.mo2466b();
                Intent b = this.f1760a.f1737a.mo2488d().mo3019b(this.f1760a.f1737a.mo2488d().mo3017a(this.f1760a.f1737a.mo2486b()));
                if (b != null) {
                    b.addFlags(524288);
                    this.f1760a.getContext().startActivity(b);
                }
            } else if (view == this.f1760a.f1738b) {
                this.f1760a.f1743g = false;
                this.f1760a.mo2464a(this.f1760a.f1744h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m2477a();
            if (this.f1760a.f1740d != null) {
                this.f1760a.f1740d.mo1033a(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0504a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f1760a.mo2466b();
                    if (!this.f1760a.f1743g) {
                        if (!this.f1760a.f1737a.mo2489e()) {
                            i++;
                        }
                        Intent b = this.f1760a.f1737a.mo2488d().mo3019b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            this.f1760a.getContext().startActivity(b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        this.f1760a.f1737a.mo2488d().mo3021c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    this.f1760a.mo2464a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == this.f1760a.f1739c) {
                if (this.f1760a.f1737a.getCount() > 0) {
                    this.f1760a.f1743g = true;
                    this.f1760a.mo2464a(this.f1760a.f1744h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2464a(int i) {
        if (this.f1737a.mo2488d() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1749m);
        boolean z = this.f1739c.getVisibility() == 0;
        int c = this.f1737a.mo2487c();
        int i2 = z ? 1 : 0;
        if (i == Integer.MAX_VALUE || c <= i2 + i) {
            this.f1737a.mo2484a(false);
            this.f1737a.mo2482a(i);
        } else {
            this.f1737a.mo2484a(true);
            this.f1737a.mo2482a(i - 1);
        }
        C0550ai listPopupWindow = getListPopupWindow();
        if (!listPopupWindow.mo2043d()) {
            if (this.f1743g || !z) {
                this.f1737a.mo2485a(true, z);
            } else {
                this.f1737a.mo2485a(false, false);
            }
            listPopupWindow.mo2840g(Math.min(this.f1737a.mo2481a(), this.f1748l));
            listPopupWindow.mo2033a();
            if (this.f1740d != null) {
                this.f1740d.mo1033a(true);
            }
            listPopupWindow.mo2044e().setContentDescription(getContext().getString(C0353a.C0361h.abc_activitychooserview_choose_application));
            listPopupWindow.mo2044e().setSelector(new ColorDrawable(0));
        }
    }

    /* renamed from: a */
    public boolean mo2465a() {
        if (mo2467c() || !this.f1751o) {
            return false;
        }
        this.f1743g = false;
        mo2464a(this.f1744h);
        return true;
    }

    /* renamed from: b */
    public boolean mo2466b() {
        if (!mo2467c()) {
            return true;
        }
        getListPopupWindow().mo2040c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1749m);
        return true;
    }

    /* renamed from: c */
    public boolean mo2467c() {
        return getListPopupWindow().mo2043d();
    }

    public C0596d getDataModel() {
        return this.f1737a.mo2488d();
    }

    /* access modifiers changed from: package-private */
    public C0550ai getListPopupWindow() {
        if (this.f1750n == null) {
            this.f1750n = new C0550ai(getContext());
            this.f1750n.mo2830a((ListAdapter) this.f1737a);
            this.f1750n.mo2834b((View) this);
            this.f1750n.mo2832a(true);
            this.f1750n.mo2829a((AdapterView.OnItemClickListener) this.f1745i);
            this.f1750n.mo2831a((PopupWindow.OnDismissListener) this.f1745i);
        }
        return this.f1750n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0596d d = this.f1737a.mo2488d();
        if (d != null) {
            d.registerObserver(this.f1741e);
        }
        this.f1751o = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0596d d = this.f1737a.mo2488d();
        if (d != null) {
            d.unregisterObserver(this.f1741e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1749m);
        }
        if (mo2467c()) {
            mo2466b();
        }
        this.f1751o = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1746j.layout(0, 0, i3 - i, i4 - i2);
        if (!mo2467c()) {
            mo2466b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f1746j;
        if (this.f1739c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0596d dVar) {
        this.f1737a.mo2483a(dVar);
        if (mo2467c()) {
            mo2466b();
            mo2465a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1752p = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1747k.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1747k.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f1744h = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1742f = onDismissListener;
    }

    public void setProvider(C0232c cVar) {
        this.f1740d = cVar;
    }
}
