package android.support.p018v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.p007a.C0068a;
import android.support.p006v4.p009b.p010a.C0172b;
import android.support.p006v4.p015g.C0232c;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.a */
public class C0452a implements C0172b {

    /* renamed from: a */
    private final int f1464a;

    /* renamed from: b */
    private final int f1465b;

    /* renamed from: c */
    private final int f1466c;

    /* renamed from: d */
    private final int f1467d;

    /* renamed from: e */
    private CharSequence f1468e;

    /* renamed from: f */
    private CharSequence f1469f;

    /* renamed from: g */
    private Intent f1470g;

    /* renamed from: h */
    private char f1471h;

    /* renamed from: i */
    private int f1472i = 4096;

    /* renamed from: j */
    private char f1473j;

    /* renamed from: k */
    private int f1474k = 4096;

    /* renamed from: l */
    private Drawable f1475l;

    /* renamed from: m */
    private int f1476m = 0;

    /* renamed from: n */
    private Context f1477n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f1478o;

    /* renamed from: p */
    private CharSequence f1479p;

    /* renamed from: q */
    private CharSequence f1480q;

    /* renamed from: r */
    private ColorStateList f1481r = null;

    /* renamed from: s */
    private PorterDuff.Mode f1482s = null;

    /* renamed from: t */
    private boolean f1483t = false;

    /* renamed from: u */
    private boolean f1484u = false;

    /* renamed from: v */
    private int f1485v = 16;

    public C0452a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1477n = context;
        this.f1464a = i2;
        this.f1465b = i;
        this.f1466c = i3;
        this.f1467d = i4;
        this.f1468e = charSequence;
    }

    /* renamed from: b */
    private void m2138b() {
        if (this.f1475l == null) {
            return;
        }
        if (this.f1483t || this.f1484u) {
            this.f1475l = C0270a.m1166f(this.f1475l);
            this.f1475l = this.f1475l.mutate();
            if (this.f1483t) {
                C0270a.m1156a(this.f1475l, this.f1481r);
            }
            if (this.f1484u) {
                C0270a.m1159a(this.f1475l, this.f1482s);
            }
        }
    }

    /* renamed from: a */
    public C0172b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0172b mo724a(C0232c cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0172b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0172b setContentDescription(CharSequence charSequence) {
        this.f1479p = charSequence;
        return this;
    }

    /* renamed from: a */
    public C0232c mo726a() {
        return null;
    }

    /* renamed from: b */
    public C0172b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: b */
    public C0172b setTooltipText(CharSequence charSequence) {
        this.f1480q = charSequence;
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1474k;
    }

    public char getAlphabeticShortcut() {
        return this.f1473j;
    }

    public CharSequence getContentDescription() {
        return this.f1479p;
    }

    public int getGroupId() {
        return this.f1465b;
    }

    public Drawable getIcon() {
        return this.f1475l;
    }

    public ColorStateList getIconTintList() {
        return this.f1481r;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1482s;
    }

    public Intent getIntent() {
        return this.f1470g;
    }

    public int getItemId() {
        return this.f1464a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1472i;
    }

    public char getNumericShortcut() {
        return this.f1471h;
    }

    public int getOrder() {
        return this.f1467d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1468e;
    }

    public CharSequence getTitleCondensed() {
        return this.f1469f != null ? this.f1469f : this.f1468e;
    }

    public CharSequence getTooltipText() {
        return this.f1480q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1485v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1485v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1485v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1485v & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1473j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1473j = Character.toLowerCase(c);
        this.f1474k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1485v = (z ? 1 : 0) | (this.f1485v & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1485v = (z ? 2 : 0) | (this.f1485v & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1485v = (z ? 16 : 0) | (this.f1485v & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1476m = i;
        this.f1475l = C0068a.m208a(this.f1477n, i);
        m2138b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1475l = drawable;
        this.f1476m = 0;
        m2138b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1481r = colorStateList;
        this.f1483t = true;
        m2138b();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1482s = mode;
        this.f1484u = true;
        m2138b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1470g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1471h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1471h = c;
        this.f1472i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1478o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1471h = c;
        this.f1473j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1471h = c;
        this.f1472i = KeyEvent.normalizeMetaState(i);
        this.f1473j = Character.toLowerCase(c2);
        this.f1474k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(int i) {
        this.f1468e = this.f1477n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1468e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1469f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        this.f1485v = (z ? 0 : 8) | (this.f1485v & 8);
        return this;
    }
}
