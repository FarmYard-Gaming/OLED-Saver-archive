package android.support.p018v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p009b.p010a.C0173c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
class C0492v extends C0486r implements SubMenu {
    C0492v(Context context, C0173c cVar) {
        super(context, cVar);
    }

    /* renamed from: b */
    public C0173c mo2328b() {
        return (C0173c) this.f1499b;
    }

    public void clearHeader() {
        mo2328b().clearHeader();
    }

    public MenuItem getItem() {
        return mo2028a(mo2328b().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        mo2328b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo2328b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo2328b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo2328b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo2328b().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        mo2328b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        mo2328b().setIcon(drawable);
        return this;
    }
}
