package android.support.p018v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C0437b {

    /* renamed from: a */
    private Object f1360a;

    /* renamed from: b */
    private boolean f1361b;

    /* renamed from: android.support.v7.view.b$a */
    public interface C0438a {
        /* renamed from: a */
        void mo1667a(C0437b bVar);

        /* renamed from: a */
        boolean mo1668a(C0437b bVar, Menu menu);

        /* renamed from: a */
        boolean mo1669a(C0437b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo1670b(C0437b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo1721a();

    /* renamed from: a */
    public abstract void mo1722a(int i);

    /* renamed from: a */
    public abstract void mo1723a(View view);

    /* renamed from: a */
    public abstract void mo1724a(CharSequence charSequence);

    /* renamed from: a */
    public void mo1872a(Object obj) {
        this.f1360a = obj;
    }

    /* renamed from: a */
    public void mo1725a(boolean z) {
        this.f1361b = z;
    }

    /* renamed from: b */
    public abstract Menu mo1726b();

    /* renamed from: b */
    public abstract void mo1727b(int i);

    /* renamed from: b */
    public abstract void mo1728b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo1729c();

    /* renamed from: d */
    public abstract void mo1730d();

    /* renamed from: f */
    public abstract CharSequence mo1732f();

    /* renamed from: g */
    public abstract CharSequence mo1733g();

    /* renamed from: h */
    public boolean mo1734h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo1735i();

    /* renamed from: j */
    public Object mo1873j() {
        return this.f1360a;
    }

    /* renamed from: k */
    public boolean mo1874k() {
        return this.f1361b;
    }
}
