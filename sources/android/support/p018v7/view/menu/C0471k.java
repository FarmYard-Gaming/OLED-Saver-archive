package android.support.p018v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p009b.p010a.C0172b;
import android.support.p006v4.p015g.C0232c;
import android.support.p018v7.view.C0439c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.k */
public class C0471k extends C0454c<C0172b> implements MenuItem {

    /* renamed from: c */
    private Method f1617c;

    /* renamed from: android.support.v7.view.menu.k$a */
    class C0472a extends C0232c {

        /* renamed from: a */
        final ActionProvider f1618a;

        public C0472a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1618a = actionProvider;
        }

        /* renamed from: a */
        public View mo1028a() {
            return this.f1618a.onCreateActionView();
        }

        /* renamed from: a */
        public void mo1032a(SubMenu subMenu) {
            this.f1618a.onPrepareSubMenu(C0471k.this.mo2029a(subMenu));
        }

        /* renamed from: d */
        public boolean mo1036d() {
            return this.f1618a.onPerformDefaultAction();
        }

        /* renamed from: e */
        public boolean mo1037e() {
            return this.f1618a.hasSubMenu();
        }
    }

    /* renamed from: android.support.v7.view.menu.k$b */
    static class C0473b extends FrameLayout implements C0439c {

        /* renamed from: a */
        final CollapsibleActionView f1620a;

        C0473b(View view) {
            super(view.getContext());
            this.f1620a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo1875a() {
            this.f1620a.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo1876b() {
            this.f1620a.onActionViewCollapsed();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public View mo2269c() {
            return (View) this.f1620a;
        }
    }

    /* renamed from: android.support.v7.view.menu.k$c */
    private class C0474c extends C0455d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        C0474c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1499b).onMenuItemActionCollapse(C0471k.this.mo2028a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1499b).onMenuItemActionExpand(C0471k.this.mo2028a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$d */
    private class C0475d extends C0455d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        C0475d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f1499b).onMenuItemClick(C0471k.this.mo2028a(menuItem));
        }
    }

    C0471k(Context context, C0172b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0472a mo2213a(ActionProvider actionProvider) {
        return new C0472a(this.f1496a, actionProvider);
    }

    /* renamed from: a */
    public void mo2214a(boolean z) {
        try {
            if (this.f1617c == null) {
                this.f1617c = ((C0172b) this.f1499b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1617c.invoke(this.f1499b, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((C0172b) this.f1499b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0172b) this.f1499b).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0232c a = ((C0172b) this.f1499b).mo726a();
        if (a instanceof C0472a) {
            return ((C0472a) a).f1618a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C0172b) this.f1499b).getActionView();
        return actionView instanceof C0473b ? ((C0473b) actionView).mo2269c() : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C0172b) this.f1499b).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0172b) this.f1499b).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0172b) this.f1499b).getContentDescription();
    }

    public int getGroupId() {
        return ((C0172b) this.f1499b).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0172b) this.f1499b).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0172b) this.f1499b).getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((C0172b) this.f1499b).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0172b) this.f1499b).getIntent();
    }

    public int getItemId() {
        return ((C0172b) this.f1499b).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((C0172b) this.f1499b).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0172b) this.f1499b).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0172b) this.f1499b).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0172b) this.f1499b).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo2029a(((C0172b) this.f1499b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0172b) this.f1499b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0172b) this.f1499b).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0172b) this.f1499b).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0172b) this.f1499b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0172b) this.f1499b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0172b) this.f1499b).isCheckable();
    }

    public boolean isChecked() {
        return ((C0172b) this.f1499b).isChecked();
    }

    public boolean isEnabled() {
        return ((C0172b) this.f1499b).isEnabled();
    }

    public boolean isVisible() {
        return ((C0172b) this.f1499b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0172b) this.f1499b).mo724a((C0232c) actionProvider != null ? mo2213a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0172b) this.f1499b).setActionView(i);
        View actionView = ((C0172b) this.f1499b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0172b) this.f1499b).setActionView((View) new C0473b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0473b(view);
        }
        ((C0172b) this.f1499b).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0172b) this.f1499b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0172b) this.f1499b).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0172b) this.f1499b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0172b) this.f1499b).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0172b) this.f1499b).mo725a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0172b) this.f1499b).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0172b) this.f1499b).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0172b) this.f1499b).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0172b) this.f1499b).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((C0172b) this.f1499b).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0172b) this.f1499b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0172b) this.f1499b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0172b) this.f1499b).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((C0172b) this.f1499b).setOnActionExpandListener(onActionExpandListener != null ? new C0474c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((C0172b) this.f1499b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0475d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0172b) this.f1499b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0172b) this.f1499b).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0172b) this.f1499b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0172b) this.f1499b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0172b) this.f1499b).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0172b) this.f1499b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0172b) this.f1499b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0172b) this.f1499b).mo727b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0172b) this.f1499b).setVisible(z);
    }
}
