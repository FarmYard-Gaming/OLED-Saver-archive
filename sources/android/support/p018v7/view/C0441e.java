package android.support.p018v7.view;

import android.content.Context;
import android.support.p018v7.view.C0437b;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
public class C0441e extends C0437b implements C0465h.C0466a {

    /* renamed from: a */
    private Context f1367a;

    /* renamed from: b */
    private ActionBarContextView f1368b;

    /* renamed from: c */
    private C0437b.C0438a f1369c;

    /* renamed from: d */
    private WeakReference<View> f1370d;

    /* renamed from: e */
    private boolean f1371e;

    /* renamed from: f */
    private boolean f1372f;

    /* renamed from: g */
    private C0465h f1373g;

    public C0441e(Context context, ActionBarContextView actionBarContextView, C0437b.C0438a aVar, boolean z) {
        this.f1367a = context;
        this.f1368b = actionBarContextView;
        this.f1369c = aVar;
        this.f1373g = new C0465h(actionBarContextView.getContext()).mo2075a(1);
        this.f1373g.mo2083a((C0465h.C0466a) this);
        this.f1372f = z;
    }

    /* renamed from: a */
    public MenuInflater mo1721a() {
        return new C0444g(this.f1368b.getContext());
    }

    /* renamed from: a */
    public void mo1722a(int i) {
        mo1728b((CharSequence) this.f1367a.getString(i));
    }

    /* renamed from: a */
    public void mo1633a(C0465h hVar) {
        mo1730d();
        this.f1368b.mo2358a();
    }

    /* renamed from: a */
    public void mo1723a(View view) {
        this.f1368b.setCustomView(view);
        this.f1370d = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo1724a(CharSequence charSequence) {
        this.f1368b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo1725a(boolean z) {
        super.mo1725a(z);
        this.f1368b.setTitleOptional(z);
    }

    /* renamed from: a */
    public boolean mo1636a(C0465h hVar, MenuItem menuItem) {
        return this.f1369c.mo1669a((C0437b) this, menuItem);
    }

    /* renamed from: b */
    public Menu mo1726b() {
        return this.f1373g;
    }

    /* renamed from: b */
    public void mo1727b(int i) {
        mo1724a((CharSequence) this.f1367a.getString(i));
    }

    /* renamed from: b */
    public void mo1728b(CharSequence charSequence) {
        this.f1368b.setTitle(charSequence);
    }

    /* renamed from: c */
    public void mo1729c() {
        if (!this.f1371e) {
            this.f1371e = true;
            this.f1368b.sendAccessibilityEvent(32);
            this.f1369c.mo1667a(this);
        }
    }

    /* renamed from: d */
    public void mo1730d() {
        this.f1369c.mo1670b(this, this.f1373g);
    }

    /* renamed from: f */
    public CharSequence mo1732f() {
        return this.f1368b.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo1733g() {
        return this.f1368b.getSubtitle();
    }

    /* renamed from: h */
    public boolean mo1734h() {
        return this.f1368b.mo2361d();
    }

    /* renamed from: i */
    public View mo1735i() {
        if (this.f1370d != null) {
            return (View) this.f1370d.get();
        }
        return null;
    }
}
