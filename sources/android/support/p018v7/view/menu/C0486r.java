package android.support.p018v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p006v4.p009b.p010a.C0171a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.r */
class C0486r extends C0454c<C0171a> implements Menu {
    C0486r(Context context, C0171a aVar) {
        super(context, aVar);
    }

    public MenuItem add(int i) {
        return mo2028a(((C0171a) this.f1499b).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2028a(((C0171a) this.f1499b).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2028a(((C0171a) this.f1499b).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2028a(((C0171a) this.f1499b).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = null;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        }
        int addIntentOptions = ((C0171a) this.f1499b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = mo2028a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo2029a(((C0171a) this.f1499b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo2029a(((C0171a) this.f1499b).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo2029a(((C0171a) this.f1499b).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo2029a(((C0171a) this.f1499b).addSubMenu(charSequence));
    }

    public void clear() {
        mo2030a();
        ((C0171a) this.f1499b).clear();
    }

    public void close() {
        ((C0171a) this.f1499b).close();
    }

    public MenuItem findItem(int i) {
        return mo2028a(((C0171a) this.f1499b).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo2028a(((C0171a) this.f1499b).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C0171a) this.f1499b).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0171a) this.f1499b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0171a) this.f1499b).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0171a) this.f1499b).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo2031a(i);
        ((C0171a) this.f1499b).removeGroup(i);
    }

    public void removeItem(int i) {
        mo2032b(i);
        ((C0171a) this.f1499b).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0171a) this.f1499b).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0171a) this.f1499b).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0171a) this.f1499b).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C0171a) this.f1499b).setQwertyMode(z);
    }

    public int size() {
        return ((C0171a) this.f1499b).size();
    }
}
