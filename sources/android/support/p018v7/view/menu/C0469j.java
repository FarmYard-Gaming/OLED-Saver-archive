package android.support.p018v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.p009b.p010a.C0172b;
import android.support.p006v4.p015g.C0232c;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.support.p018v7.view.menu.C0483p;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.view.menu.j */
public final class C0469j implements C0172b {

    /* renamed from: A */
    private View f1585A;

    /* renamed from: B */
    private C0232c f1586B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1587C;

    /* renamed from: D */
    private boolean f1588D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1589E;

    /* renamed from: a */
    C0465h f1590a;

    /* renamed from: b */
    private final int f1591b;

    /* renamed from: c */
    private final int f1592c;

    /* renamed from: d */
    private final int f1593d;

    /* renamed from: e */
    private final int f1594e;

    /* renamed from: f */
    private CharSequence f1595f;

    /* renamed from: g */
    private CharSequence f1596g;

    /* renamed from: h */
    private Intent f1597h;

    /* renamed from: i */
    private char f1598i;

    /* renamed from: j */
    private int f1599j = 4096;

    /* renamed from: k */
    private char f1600k;

    /* renamed from: l */
    private int f1601l = 4096;

    /* renamed from: m */
    private Drawable f1602m;

    /* renamed from: n */
    private int f1603n = 0;

    /* renamed from: o */
    private C0491u f1604o;

    /* renamed from: p */
    private Runnable f1605p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1606q;

    /* renamed from: r */
    private CharSequence f1607r;

    /* renamed from: s */
    private CharSequence f1608s;

    /* renamed from: t */
    private ColorStateList f1609t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1610u = null;

    /* renamed from: v */
    private boolean f1611v = false;

    /* renamed from: w */
    private boolean f1612w = false;

    /* renamed from: x */
    private boolean f1613x = false;

    /* renamed from: y */
    private int f1614y = 16;

    /* renamed from: z */
    private int f1615z = 0;

    C0469j(C0465h hVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1590a = hVar;
        this.f1591b = i2;
        this.f1592c = i;
        this.f1593d = i3;
        this.f1594e = i4;
        this.f1595f = charSequence;
        this.f1615z = i5;
    }

    /* renamed from: a */
    private Drawable m2275a(Drawable drawable) {
        if (drawable != null && this.f1613x && (this.f1611v || this.f1612w)) {
            drawable = C0270a.m1166f(drawable).mutate();
            if (this.f1611v) {
                C0270a.m1156a(drawable, this.f1609t);
            }
            if (this.f1612w) {
                C0270a.m1159a(drawable, this.f1610u);
            }
            this.f1613x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    private static void m2276a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public C0172b setActionView(int i) {
        Context f = this.f1590a.mo2120f();
        setActionView(LayoutInflater.from(f).inflate(i, new LinearLayout(f), false));
        return this;
    }

    /* renamed from: a */
    public C0172b mo724a(C0232c cVar) {
        if (this.f1586B != null) {
            this.f1586B.mo1038f();
        }
        this.f1585A = null;
        this.f1586B = cVar;
        this.f1590a.mo2106b(true);
        if (this.f1586B != null) {
            this.f1586B.mo1031a((C0232c.C0234b) new C0232c.C0234b() {
                /* renamed from: a */
                public void mo1040a(boolean z) {
                    C0469j.this.f1590a.mo2084a(C0469j.this);
                }
            });
        }
        return this;
    }

    /* renamed from: a */
    public C0172b setActionView(View view) {
        this.f1585A = view;
        this.f1586B = null;
        if (view != null && view.getId() == -1 && this.f1591b > 0) {
            view.setId(this.f1591b);
        }
        this.f1590a.mo2104b(this);
        return this;
    }

    /* renamed from: a */
    public C0172b setContentDescription(CharSequence charSequence) {
        this.f1607r = charSequence;
        this.f1590a.mo2106b(false);
        return this;
    }

    /* renamed from: a */
    public C0232c mo726a() {
        return this.f1586B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo2155a(C0483p.C0484a aVar) {
        return (aVar == null || !aVar.mo1937a()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: a */
    public void mo2156a(C0491u uVar) {
        this.f1604o = uVar;
        uVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2157a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1589E = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo2158a(boolean z) {
        this.f1614y = (z ? 4 : 0) | (this.f1614y & -5);
    }

    /* renamed from: b */
    public C0172b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: b */
    public C0172b setTooltipText(CharSequence charSequence) {
        this.f1608s = charSequence;
        this.f1590a.mo2106b(false);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2160b(boolean z) {
        int i = this.f1614y;
        this.f1614y = (z ? 2 : 0) | (this.f1614y & -3);
        if (i != this.f1614y) {
            this.f1590a.mo2106b(false);
        }
    }

    /* renamed from: b */
    public boolean mo2161b() {
        if ((this.f1606q != null && this.f1606q.onMenuItemClick(this)) || this.f1590a.mo2090a(this.f1590a, (MenuItem) this)) {
            return true;
        }
        if (this.f1605p != null) {
            this.f1605p.run();
            return true;
        }
        if (this.f1597h != null) {
            try {
                this.f1590a.mo2120f().startActivity(this.f1597h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f1586B != null && this.f1586B.mo1036d();
    }

    /* renamed from: c */
    public int mo2162c() {
        return this.f1594e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2163c(boolean z) {
        int i = this.f1614y;
        this.f1614y = (z ? 0 : 8) | (this.f1614y & -9);
        return i != this.f1614y;
    }

    public boolean collapseActionView() {
        if ((this.f1615z & 8) == 0) {
            return false;
        }
        if (this.f1585A == null) {
            return true;
        }
        if (this.f1587C == null || this.f1587C.onMenuItemActionCollapse(this)) {
            return this.f1590a.mo2117d(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public char mo2164d() {
        return this.f1590a.mo2110c() ? this.f1600k : this.f1598i;
    }

    /* renamed from: d */
    public void mo2165d(boolean z) {
        if (z) {
            this.f1614y |= 32;
        } else {
            this.f1614y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo2166e() {
        char d = mo2164d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f1590a.mo2120f().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1590a.mo2120f()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0353a.C0361h.abc_prepend_shortcut_label));
        }
        int i = this.f1590a.mo2110c() ? this.f1601l : this.f1599j;
        m2276a(sb, i, 65536, resources.getString(C0353a.C0361h.abc_menu_meta_shortcut_label));
        m2276a(sb, i, 4096, resources.getString(C0353a.C0361h.abc_menu_ctrl_shortcut_label));
        m2276a(sb, i, 2, resources.getString(C0353a.C0361h.abc_menu_alt_shortcut_label));
        m2276a(sb, i, 1, resources.getString(C0353a.C0361h.abc_menu_shift_shortcut_label));
        m2276a(sb, i, 4, resources.getString(C0353a.C0361h.abc_menu_sym_shortcut_label));
        m2276a(sb, i, 8, resources.getString(C0353a.C0361h.abc_menu_function_shortcut_label));
        switch (d) {
            case 8:
                sb.append(resources.getString(C0353a.C0361h.abc_menu_delete_shortcut_label));
                break;
            case 10:
                sb.append(resources.getString(C0353a.C0361h.abc_menu_enter_shortcut_label));
                break;
            case ' ':
                sb.append(resources.getString(C0353a.C0361h.abc_menu_space_shortcut_label));
                break;
            default:
                sb.append(d);
                break;
        }
        return sb.toString();
    }

    /* renamed from: e */
    public void mo2167e(boolean z) {
        this.f1588D = z;
        this.f1590a.mo2106b(false);
    }

    public boolean expandActionView() {
        if (!mo2193n()) {
            return false;
        }
        if (this.f1587C == null || this.f1587C.onMenuItemActionExpand(this)) {
            return this.f1590a.mo2111c(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2168f() {
        return this.f1590a.mo2116d() && mo2164d() != 0;
    }

    /* renamed from: g */
    public boolean mo2169g() {
        return (this.f1614y & 4) != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        if (this.f1585A != null) {
            return this.f1585A;
        }
        if (this.f1586B == null) {
            return null;
        }
        this.f1585A = this.f1586B.mo1029a((MenuItem) this);
        return this.f1585A;
    }

    public int getAlphabeticModifiers() {
        return this.f1601l;
    }

    public char getAlphabeticShortcut() {
        return this.f1600k;
    }

    public CharSequence getContentDescription() {
        return this.f1607r;
    }

    public int getGroupId() {
        return this.f1592c;
    }

    public Drawable getIcon() {
        if (this.f1602m != null) {
            return m2275a(this.f1602m);
        }
        if (this.f1603n == 0) {
            return null;
        }
        Drawable b = C0419a.m1949b(this.f1590a.mo2120f(), this.f1603n);
        this.f1603n = 0;
        this.f1602m = b;
        return m2275a(b);
    }

    public ColorStateList getIconTintList() {
        return this.f1609t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1610u;
    }

    public Intent getIntent() {
        return this.f1597h;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1591b;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1589E;
    }

    public int getNumericModifiers() {
        return this.f1599j;
    }

    public char getNumericShortcut() {
        return this.f1598i;
    }

    public int getOrder() {
        return this.f1593d;
    }

    public SubMenu getSubMenu() {
        return this.f1604o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1595f;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1596g != null ? this.f1596g : this.f1595f;
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1608s;
    }

    /* renamed from: h */
    public void mo2182h() {
        this.f1590a.mo2104b(this);
    }

    public boolean hasSubMenu() {
        return this.f1604o != null;
    }

    /* renamed from: i */
    public boolean mo2184i() {
        return this.f1590a.mo2138r();
    }

    public boolean isActionViewExpanded() {
        return this.f1588D;
    }

    public boolean isCheckable() {
        return (this.f1614y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1614y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1614y & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1586B == null || !this.f1586B.mo1034b()) ? (this.f1614y & 8) == 0 : (this.f1614y & 8) == 0 && this.f1586B.mo1035c();
    }

    /* renamed from: j */
    public boolean mo2189j() {
        return (this.f1614y & 32) == 32;
    }

    /* renamed from: k */
    public boolean mo2190k() {
        return (this.f1615z & 1) == 1;
    }

    /* renamed from: l */
    public boolean mo2191l() {
        return (this.f1615z & 2) == 2;
    }

    /* renamed from: m */
    public boolean mo2192m() {
        return (this.f1615z & 4) == 4;
    }

    /* renamed from: n */
    public boolean mo2193n() {
        if ((this.f1615z & 8) == 0) {
            return false;
        }
        if (this.f1585A == null && this.f1586B != null) {
            this.f1585A = this.f1586B.mo1029a((MenuItem) this);
        }
        return this.f1585A != null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1600k != c) {
            this.f1600k = Character.toLowerCase(c);
            this.f1590a.mo2106b(false);
        }
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (!(this.f1600k == c && this.f1601l == i)) {
            this.f1600k = Character.toLowerCase(c);
            this.f1601l = KeyEvent.normalizeMetaState(i);
            this.f1590a.mo2106b(false);
        }
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1614y;
        this.f1614y = (z ? 1 : 0) | (this.f1614y & -2);
        if (i != this.f1614y) {
            this.f1590a.mo2106b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1614y & 4) != 0) {
            this.f1590a.mo2087a((MenuItem) this);
        } else {
            mo2160b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1614y |= 16;
        } else {
            this.f1614y &= -17;
        }
        this.f1590a.mo2106b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1602m = null;
        this.f1603n = i;
        this.f1613x = true;
        this.f1590a.mo2106b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1603n = 0;
        this.f1602m = drawable;
        this.f1613x = true;
        this.f1590a.mo2106b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1609t = colorStateList;
        this.f1611v = true;
        this.f1613x = true;
        this.f1590a.mo2106b(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1610u = mode;
        this.f1612w = true;
        this.f1613x = true;
        this.f1590a.mo2106b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1597h = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1598i != c) {
            this.f1598i = c;
            this.f1590a.mo2106b(false);
        }
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (!(this.f1598i == c && this.f1599j == i)) {
            this.f1598i = c;
            this.f1599j = KeyEvent.normalizeMetaState(i);
            this.f1590a.mo2106b(false);
        }
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1587C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1606q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1598i = c;
        this.f1600k = Character.toLowerCase(c2);
        this.f1590a.mo2106b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1598i = c;
        this.f1599j = KeyEvent.normalizeMetaState(i);
        this.f1600k = Character.toLowerCase(c2);
        this.f1601l = KeyEvent.normalizeMetaState(i2);
        this.f1590a.mo2106b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f1615z = i;
                this.f1590a.mo2104b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f1590a.mo2120f().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1595f = charSequence;
        this.f1590a.mo2106b(false);
        if (this.f1604o != null) {
            this.f1604o.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1596g = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f1595f;
        }
        this.f1590a.mo2106b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo2163c(z)) {
            this.f1590a.mo2084a(this);
        }
        return this;
    }

    public String toString() {
        if (this.f1595f != null) {
            return this.f1595f.toString();
        }
        return null;
    }
}
