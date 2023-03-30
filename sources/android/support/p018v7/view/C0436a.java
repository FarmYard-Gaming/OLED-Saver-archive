package android.support.p018v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.view.a */
public class C0436a {

    /* renamed from: a */
    private Context f1359a;

    private C0436a(Context context) {
        this.f1359a = context;
    }

    /* renamed from: a */
    public static C0436a m2038a(Context context) {
        return new C0436a(context);
    }

    /* renamed from: a */
    public int mo1865a() {
        Configuration configuration = this.f1359a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: b */
    public boolean mo1866b() {
        return Build.VERSION.SDK_INT >= 19 || !ViewConfiguration.get(this.f1359a).hasPermanentMenuKey();
    }

    /* renamed from: c */
    public int mo1867c() {
        return this.f1359a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean mo1868d() {
        return this.f1359a.getResources().getBoolean(C0353a.C0355b.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public int mo1869e() {
        TypedArray obtainStyledAttributes = this.f1359a.obtainStyledAttributes((AttributeSet) null, C0353a.C0363j.ActionBar, C0353a.C0354a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0353a.C0363j.ActionBar_height, 0);
        Resources resources = this.f1359a.getResources();
        if (!mo1868d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0353a.C0357d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo1870f() {
        return this.f1359a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int mo1871g() {
        return this.f1359a.getResources().getDimensionPixelSize(C0353a.C0357d.abc_action_bar_stacked_tab_max_width);
    }
}
