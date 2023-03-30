package android.support.p006v4.p009b.p010a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.p006v4.p015g.C0232c;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.b.a.b */
public interface C0172b extends MenuItem {
    /* renamed from: a */
    C0172b mo724a(C0232c cVar);

    /* renamed from: a */
    C0172b mo725a(CharSequence charSequence);

    /* renamed from: a */
    C0232c mo726a();

    /* renamed from: b */
    C0172b mo727b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
