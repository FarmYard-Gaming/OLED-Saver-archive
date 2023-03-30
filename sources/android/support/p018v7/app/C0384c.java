package android.support.p018v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p006v4.app.C0091a;
import android.support.p006v4.app.C0097ae;
import android.support.p006v4.app.C0113g;
import android.support.p006v4.app.C0162u;
import android.support.p018v7.view.C0437b;
import android.support.p018v7.widget.C0584az;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.c */
public class C0384c extends C0113g implements C0097ae.C0098a, C0385d {

    /* renamed from: j */
    private C0386e f1119j;

    /* renamed from: k */
    private int f1120k = 0;

    /* renamed from: l */
    private Resources f1121l;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1711a(int r3, android.view.KeyEvent r4) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r4.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r4.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r4.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r4.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r4)
            if (r0 == 0) goto L_0x003e
            r0 = 1
        L_0x003d:
            return r0
        L_0x003e:
            r0 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.app.C0384c.m1711a(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    public C0437b mo1580a(C0437b.C0438a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo1581a(C0097ae aeVar) {
        aeVar.mo309a((Activity) this);
    }

    /* renamed from: a */
    public void mo1582a(C0437b bVar) {
    }

    /* renamed from: a */
    public boolean mo1583a(Intent intent) {
        return C0162u.m747a((Activity) this, intent);
    }

    /* renamed from: a_ */
    public Intent mo315a_() {
        return C0162u.m745a(this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1596j().mo1617b(view, layoutParams);
    }

    /* renamed from: b */
    public void mo1585b(Intent intent) {
        C0162u.m750b((Activity) this, intent);
    }

    /* renamed from: b */
    public void mo1586b(C0097ae aeVar) {
    }

    /* renamed from: b */
    public void mo1587b(C0437b bVar) {
    }

    public void closeOptionsMenu() {
        C0378a g = mo1590g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo1558d()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0378a g = mo1590g();
        if (keyCode != 82 || g == null || !g.mo1552a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: e */
    public void mo457e() {
        mo1596j().mo1623f();
    }

    public <T extends View> T findViewById(int i) {
        return mo1596j().mo1608a(i);
    }

    /* renamed from: g */
    public C0378a mo1590g() {
        return mo1596j().mo1607a();
    }

    public MenuInflater getMenuInflater() {
        return mo1596j().mo1614b();
    }

    public Resources getResources() {
        if (this.f1121l == null && C0584az.m2898a()) {
            this.f1121l = new C0584az(this, super.getResources());
        }
        return this.f1121l == null ? super.getResources() : this.f1121l;
    }

    /* renamed from: h */
    public boolean mo1593h() {
        Intent a_ = mo315a_();
        if (a_ == null) {
            return false;
        }
        if (mo1583a(a_)) {
            C0097ae a = C0097ae.m323a((Context) this);
            mo1581a(a);
            mo1586b(a);
            a.mo312a();
            try {
                C0091a.m308a(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            mo1585b(a_);
        }
        return true;
    }

    @Deprecated
    /* renamed from: i */
    public void mo1594i() {
    }

    public void invalidateOptionsMenu() {
        mo1596j().mo1623f();
    }

    /* renamed from: j */
    public C0386e mo1596j() {
        if (this.f1119j == null) {
            this.f1119j = C0386e.m1728a((Activity) this, (C0385d) this);
        }
        return this.f1119j;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo1596j().mo1609a(configuration);
        if (this.f1121l != null) {
            this.f1121l.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo1594i();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0386e j = mo1596j();
        j.mo1625h();
        j.mo1610a(bundle);
        if (j.mo1626i() && this.f1120k != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1120k, false);
            } else {
                setTheme(this.f1120k);
            }
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo1596j().mo1624g();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m1711a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0378a g = mo1590g();
        if (menuItem.getItemId() != 16908332 || g == null || (g.mo1545a() & 4) == 0) {
            return false;
        }
        return mo1593h();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo1596j().mo1616b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo1596j().mo1622e();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo1596j().mo1619c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo1596j().mo1618c();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo1596j().mo1621d();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo1596j().mo1613a(charSequence);
    }

    public void openOptionsMenu() {
        C0378a g = mo1590g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo1556c()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo1596j().mo1615b(i);
    }

    public void setContentView(View view) {
        mo1596j().mo1611a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1596j().mo1612a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f1120k = i;
    }
}
