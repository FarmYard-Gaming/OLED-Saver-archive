package android.support.p018v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.p006v4.p009b.p010a.C0171a;
import android.support.p006v4.p015g.C0232c;
import android.support.p006v4.p015g.C0240h;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0469j;
import android.support.p018v7.view.menu.C0471k;
import android.support.p018v7.widget.C0539ad;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.view.g */
public class C0444g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f1380a = {Context.class};

    /* renamed from: b */
    static final Class<?>[] f1381b = f1380a;

    /* renamed from: c */
    final Object[] f1382c;

    /* renamed from: d */
    final Object[] f1383d = this.f1382c;

    /* renamed from: e */
    Context f1384e;

    /* renamed from: f */
    private Object f1385f;

    /* renamed from: android.support.v7.view.g$a */
    private static class C0445a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f1386a = {MenuItem.class};

        /* renamed from: b */
        private Object f1387b;

        /* renamed from: c */
        private Method f1388c;

        public C0445a(Object obj, String str) {
            this.f1387b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1388c = cls.getMethod(str, f1386a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1388c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1388c.invoke(this.f1387b, new Object[]{menuItem})).booleanValue();
                }
                this.f1388c.invoke(this.f1387b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: android.support.v7.view.g$b */
    private class C0446b {

        /* renamed from: A */
        private String f1389A;

        /* renamed from: B */
        private String f1390B;

        /* renamed from: C */
        private CharSequence f1391C;

        /* renamed from: D */
        private CharSequence f1392D;

        /* renamed from: E */
        private ColorStateList f1393E = null;

        /* renamed from: F */
        private PorterDuff.Mode f1394F = null;

        /* renamed from: a */
        C0232c f1395a;

        /* renamed from: c */
        private Menu f1397c;

        /* renamed from: d */
        private int f1398d;

        /* renamed from: e */
        private int f1399e;

        /* renamed from: f */
        private int f1400f;

        /* renamed from: g */
        private int f1401g;

        /* renamed from: h */
        private boolean f1402h;

        /* renamed from: i */
        private boolean f1403i;

        /* renamed from: j */
        private boolean f1404j;

        /* renamed from: k */
        private int f1405k;

        /* renamed from: l */
        private int f1406l;

        /* renamed from: m */
        private CharSequence f1407m;

        /* renamed from: n */
        private CharSequence f1408n;

        /* renamed from: o */
        private int f1409o;

        /* renamed from: p */
        private char f1410p;

        /* renamed from: q */
        private int f1411q;

        /* renamed from: r */
        private char f1412r;

        /* renamed from: s */
        private int f1413s;

        /* renamed from: t */
        private int f1414t;

        /* renamed from: u */
        private boolean f1415u;

        /* renamed from: v */
        private boolean f1416v;

        /* renamed from: w */
        private boolean f1417w;

        /* renamed from: x */
        private int f1418x;

        /* renamed from: y */
        private int f1419y;

        /* renamed from: z */
        private String f1420z;

        public C0446b(Menu menu) {
            this.f1397c = menu;
            mo1906a();
        }

        /* renamed from: a */
        private char m2098a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m2099a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0444g.this.f1384e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: a */
        private void m2100a(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.f1415u).setVisible(this.f1416v).setEnabled(this.f1417w).setCheckable(this.f1414t >= 1).setTitleCondensed(this.f1408n).setIcon(this.f1409o);
            if (this.f1418x >= 0) {
                menuItem.setShowAsAction(this.f1418x);
            }
            if (this.f1390B != null) {
                if (C0444g.this.f1384e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new C0445a(C0444g.this.mo1903a(), this.f1390B));
            }
            if (menuItem instanceof C0469j) {
                C0469j jVar = (C0469j) menuItem;
            }
            if (this.f1414t >= 2) {
                if (menuItem instanceof C0469j) {
                    ((C0469j) menuItem).mo2158a(true);
                } else if (menuItem instanceof C0471k) {
                    ((C0471k) menuItem).mo2214a(true);
                }
            }
            if (this.f1420z != null) {
                menuItem.setActionView((View) m2099a(this.f1420z, C0444g.f1380a, C0444g.this.f1382c));
            } else {
                z = false;
            }
            if (this.f1419y > 0) {
                if (!z) {
                    menuItem.setActionView(this.f1419y);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f1395a != null) {
                C0240h.m1018a(menuItem, this.f1395a);
            }
            C0240h.m1022a(menuItem, this.f1391C);
            C0240h.m1024b(menuItem, this.f1392D);
            C0240h.m1023b(menuItem, this.f1410p, this.f1411q);
            C0240h.m1019a(menuItem, this.f1412r, this.f1413s);
            if (this.f1394F != null) {
                C0240h.m1021a(menuItem, this.f1394F);
            }
            if (this.f1393E != null) {
                C0240h.m1020a(menuItem, this.f1393E);
            }
        }

        /* renamed from: a */
        public void mo1906a() {
            this.f1398d = 0;
            this.f1399e = 0;
            this.f1400f = 0;
            this.f1401g = 0;
            this.f1402h = true;
            this.f1403i = true;
        }

        /* renamed from: a */
        public void mo1907a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0444g.this.f1384e.obtainStyledAttributes(attributeSet, C0353a.C0363j.MenuGroup);
            this.f1398d = obtainStyledAttributes.getResourceId(C0353a.C0363j.MenuGroup_android_id, 0);
            this.f1399e = obtainStyledAttributes.getInt(C0353a.C0363j.MenuGroup_android_menuCategory, 0);
            this.f1400f = obtainStyledAttributes.getInt(C0353a.C0363j.MenuGroup_android_orderInCategory, 0);
            this.f1401g = obtainStyledAttributes.getInt(C0353a.C0363j.MenuGroup_android_checkableBehavior, 0);
            this.f1402h = obtainStyledAttributes.getBoolean(C0353a.C0363j.MenuGroup_android_visible, true);
            this.f1403i = obtainStyledAttributes.getBoolean(C0353a.C0363j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo1908b() {
            this.f1404j = true;
            m2100a(this.f1397c.add(this.f1398d, this.f1405k, this.f1406l, this.f1407m));
        }

        /* renamed from: b */
        public void mo1909b(AttributeSet attributeSet) {
            boolean z = true;
            TypedArray obtainStyledAttributes = C0444g.this.f1384e.obtainStyledAttributes(attributeSet, C0353a.C0363j.MenuItem);
            this.f1405k = obtainStyledAttributes.getResourceId(C0353a.C0363j.MenuItem_android_id, 0);
            this.f1406l = (obtainStyledAttributes.getInt(C0353a.C0363j.MenuItem_android_menuCategory, this.f1399e) & -65536) | (obtainStyledAttributes.getInt(C0353a.C0363j.MenuItem_android_orderInCategory, this.f1400f) & 65535);
            this.f1407m = obtainStyledAttributes.getText(C0353a.C0363j.MenuItem_android_title);
            this.f1408n = obtainStyledAttributes.getText(C0353a.C0363j.MenuItem_android_titleCondensed);
            this.f1409o = obtainStyledAttributes.getResourceId(C0353a.C0363j.MenuItem_android_icon, 0);
            this.f1410p = m2098a(obtainStyledAttributes.getString(C0353a.C0363j.MenuItem_android_alphabeticShortcut));
            this.f1411q = obtainStyledAttributes.getInt(C0353a.C0363j.MenuItem_alphabeticModifiers, 4096);
            this.f1412r = m2098a(obtainStyledAttributes.getString(C0353a.C0363j.MenuItem_android_numericShortcut));
            this.f1413s = obtainStyledAttributes.getInt(C0353a.C0363j.MenuItem_numericModifiers, 4096);
            if (obtainStyledAttributes.hasValue(C0353a.C0363j.MenuItem_android_checkable)) {
                this.f1414t = obtainStyledAttributes.getBoolean(C0353a.C0363j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f1414t = this.f1401g;
            }
            this.f1415u = obtainStyledAttributes.getBoolean(C0353a.C0363j.MenuItem_android_checked, false);
            this.f1416v = obtainStyledAttributes.getBoolean(C0353a.C0363j.MenuItem_android_visible, this.f1402h);
            this.f1417w = obtainStyledAttributes.getBoolean(C0353a.C0363j.MenuItem_android_enabled, this.f1403i);
            this.f1418x = obtainStyledAttributes.getInt(C0353a.C0363j.MenuItem_showAsAction, -1);
            this.f1390B = obtainStyledAttributes.getString(C0353a.C0363j.MenuItem_android_onClick);
            this.f1419y = obtainStyledAttributes.getResourceId(C0353a.C0363j.MenuItem_actionLayout, 0);
            this.f1420z = obtainStyledAttributes.getString(C0353a.C0363j.MenuItem_actionViewClass);
            this.f1389A = obtainStyledAttributes.getString(C0353a.C0363j.MenuItem_actionProviderClass);
            if (this.f1389A == null) {
                z = false;
            }
            if (z && this.f1419y == 0 && this.f1420z == null) {
                this.f1395a = (C0232c) m2099a(this.f1389A, C0444g.f1381b, C0444g.this.f1383d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1395a = null;
            }
            this.f1391C = obtainStyledAttributes.getText(C0353a.C0363j.MenuItem_contentDescription);
            this.f1392D = obtainStyledAttributes.getText(C0353a.C0363j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0353a.C0363j.MenuItem_iconTintMode)) {
                this.f1394F = C0539ad.m2673a(obtainStyledAttributes.getInt(C0353a.C0363j.MenuItem_iconTintMode, -1), this.f1394F);
            } else {
                this.f1394F = null;
            }
            if (obtainStyledAttributes.hasValue(C0353a.C0363j.MenuItem_iconTint)) {
                this.f1393E = obtainStyledAttributes.getColorStateList(C0353a.C0363j.MenuItem_iconTint);
            } else {
                this.f1393E = null;
            }
            obtainStyledAttributes.recycle();
            this.f1404j = false;
        }

        /* renamed from: c */
        public SubMenu mo1910c() {
            this.f1404j = true;
            SubMenu addSubMenu = this.f1397c.addSubMenu(this.f1398d, this.f1405k, this.f1406l, this.f1407m);
            m2100a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo1911d() {
            return this.f1404j;
        }
    }

    public C0444g(Context context) {
        super(context);
        this.f1384e = context;
        this.f1382c = new Object[]{context};
    }

    /* renamed from: a */
    private Object m2095a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2095a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2096a(org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.view.Menu r12) {
        /*
            r9 = this;
            r5 = 0
            r2 = 1
            r7 = 0
            android.support.v7.view.g$b r8 = new android.support.v7.view.g$b
            r8.<init>(r12)
            int r0 = r10.getEventType()
        L_0x000c:
            r1 = 2
            if (r0 != r1) goto L_0x0048
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = "menu"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x002f
            int r0 = r10.next()
        L_0x001f:
            r1 = r7
            r3 = r5
            r6 = r7
            r4 = r0
        L_0x0023:
            if (r1 != 0) goto L_0x00dc
            switch(r4) {
                case 1: goto L_0x00d4;
                case 2: goto L_0x004f;
                case 3: goto L_0x0086;
                default: goto L_0x0028;
            }
        L_0x0028:
            r0 = r1
        L_0x0029:
            int r4 = r10.next()
            r1 = r0
            goto L_0x0023
        L_0x002f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expecting menu, got "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0048:
            int r0 = r10.next()
            if (r0 != r2) goto L_0x000c
            goto L_0x001f
        L_0x004f:
            if (r6 == 0) goto L_0x0053
            r0 = r1
            goto L_0x0029
        L_0x0053:
            java.lang.String r4 = r10.getName()
            java.lang.String r0 = "group"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0064
            r8.mo1907a((android.util.AttributeSet) r11)
            r0 = r1
            goto L_0x0029
        L_0x0064:
            java.lang.String r0 = "item"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0071
            r8.mo1909b(r11)
            r0 = r1
            goto L_0x0029
        L_0x0071:
            java.lang.String r0 = "menu"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0082
            android.view.SubMenu r0 = r8.mo1910c()
            r9.m2096a(r10, r11, r0)
            r0 = r1
            goto L_0x0029
        L_0x0082:
            r0 = r1
            r3 = r4
            r6 = r2
            goto L_0x0029
        L_0x0086:
            java.lang.String r0 = r10.getName()
            if (r6 == 0) goto L_0x0096
            boolean r4 = r0.equals(r3)
            if (r4 == 0) goto L_0x0096
            r0 = r1
            r3 = r5
            r6 = r7
            goto L_0x0029
        L_0x0096:
            java.lang.String r4 = "group"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00a3
            r8.mo1906a()
            r0 = r1
            goto L_0x0029
        L_0x00a3:
            java.lang.String r4 = "item"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00c9
            boolean r0 = r8.mo1911d()
            if (r0 != 0) goto L_0x0028
            android.support.v4.g.c r0 = r8.f1395a
            if (r0 == 0) goto L_0x00c3
            android.support.v4.g.c r0 = r8.f1395a
            boolean r0 = r0.mo1037e()
            if (r0 == 0) goto L_0x00c3
            r8.mo1910c()
            r0 = r1
            goto L_0x0029
        L_0x00c3:
            r8.mo1908b()
            r0 = r1
            goto L_0x0029
        L_0x00c9:
            java.lang.String r4 = "menu"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0028
            r0 = r2
            goto L_0x0029
        L_0x00d4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected end of document"
            r0.<init>(r1)
            throw r0
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.view.C0444g.m2096a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo1903a() {
        if (this.f1385f == null) {
            this.f1385f = m2095a(this.f1384e);
        }
        return this.f1385f;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C0171a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f1384e.getResources().getLayout(i);
            m2096a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
