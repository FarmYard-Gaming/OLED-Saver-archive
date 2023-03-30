package android.support.p018v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.p018v7.p019a.C0353a;
import android.view.LayoutInflater;

/* renamed from: android.support.v7.view.d */
public class C0440d extends ContextWrapper {

    /* renamed from: a */
    private int f1362a;

    /* renamed from: b */
    private Resources.Theme f1363b;

    /* renamed from: c */
    private LayoutInflater f1364c;

    /* renamed from: d */
    private Configuration f1365d;

    /* renamed from: e */
    private Resources f1366e;

    public C0440d() {
        super((Context) null);
    }

    public C0440d(Context context, int i) {
        super(context);
        this.f1362a = i;
    }

    public C0440d(Context context, Resources.Theme theme) {
        super(context);
        this.f1363b = theme;
    }

    /* renamed from: b */
    private Resources m2069b() {
        if (this.f1366e == null) {
            if (this.f1365d == null) {
                this.f1366e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f1366e = createConfigurationContext(this.f1365d).getResources();
            }
        }
        return this.f1366e;
    }

    /* renamed from: c */
    private void m2070c() {
        boolean z = this.f1363b == null;
        if (z) {
            this.f1363b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1363b.setTo(theme);
            }
        }
        mo1878a(this.f1363b, this.f1362a, z);
    }

    /* renamed from: a */
    public int mo1877a() {
        return this.f1362a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1878a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m2069b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1364c == null) {
            this.f1364c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1364c;
    }

    public Resources.Theme getTheme() {
        if (this.f1363b != null) {
            return this.f1363b;
        }
        if (this.f1362a == 0) {
            this.f1362a = C0353a.C0362i.Theme_AppCompat_Light;
        }
        m2070c();
        return this.f1363b;
    }

    public void setTheme(int i) {
        if (this.f1362a != i) {
            this.f1362a = i;
            m2070c();
        }
    }
}
