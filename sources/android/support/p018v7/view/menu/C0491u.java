package android.support.p018v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p018v7.view.menu.C0465h;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.u */
public class C0491u extends C0465h implements SubMenu {

    /* renamed from: d */
    private C0465h f1662d;

    /* renamed from: e */
    private C0469j f1663e;

    public C0491u(Context context, C0465h hVar, C0469j jVar) {
        super(context);
        this.f1662d = hVar;
        this.f1663e = jVar;
    }

    /* renamed from: a */
    public String mo2081a() {
        int itemId = this.f1663e != null ? this.f1663e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo2081a() + ":" + itemId;
    }

    /* renamed from: a */
    public void mo2083a(C0465h.C0466a aVar) {
        this.f1662d.mo2083a(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2090a(C0465h hVar, MenuItem menuItem) {
        return super.mo2090a(hVar, menuItem) || this.f1662d.mo2090a(hVar, menuItem);
    }

    /* renamed from: b */
    public boolean mo2107b() {
        return this.f1662d.mo2107b();
    }

    /* renamed from: c */
    public boolean mo2110c() {
        return this.f1662d.mo2110c();
    }

    /* renamed from: c */
    public boolean mo2111c(C0469j jVar) {
        return this.f1662d.mo2111c(jVar);
    }

    /* renamed from: d */
    public boolean mo2116d() {
        return this.f1662d.mo2116d();
    }

    /* renamed from: d */
    public boolean mo2117d(C0469j jVar) {
        return this.f1662d.mo2117d(jVar);
    }

    public MenuItem getItem() {
        return this.f1663e;
    }

    /* renamed from: q */
    public C0465h mo2137q() {
        return this.f1662d.mo2137q();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1662d.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo2119e(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo2076a(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo2115d(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo2078a(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo2077a(view);
    }

    public SubMenu setIcon(int i) {
        this.f1663e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1663e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1662d.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu mo2327t() {
        return this.f1662d;
    }
}
