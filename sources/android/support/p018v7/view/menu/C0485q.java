package android.support.p018v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.p006v4.p009b.p010a.C0171a;
import android.support.p006v4.p009b.p010a.C0172b;
import android.support.p006v4.p009b.p010a.C0173c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.q */
public final class C0485q {
    /* renamed from: a */
    public static Menu m2364a(Context context, C0171a aVar) {
        return new C0486r(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m2365a(Context context, C0172b bVar) {
        return Build.VERSION.SDK_INT >= 16 ? new C0476l(context, bVar) : new C0471k(context, bVar);
    }

    /* renamed from: a */
    public static SubMenu m2366a(Context context, C0173c cVar) {
        return new C0492v(context, cVar);
    }
}
