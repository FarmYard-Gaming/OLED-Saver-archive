package android.support.p018v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.e */
public abstract class C0386e {

    /* renamed from: a */
    private static int f1122a = -1;

    C0386e() {
    }

    /* renamed from: a */
    public static C0386e m1728a(Activity activity, C0385d dVar) {
        return new C0387f(activity, activity.getWindow(), dVar);
    }

    /* renamed from: a */
    public static C0386e m1729a(Dialog dialog, C0385d dVar) {
        return new C0387f(dialog.getContext(), dialog.getWindow(), dVar);
    }

    /* renamed from: j */
    public static int m1730j() {
        return f1122a;
    }

    /* renamed from: a */
    public abstract C0378a mo1607a();

    /* renamed from: a */
    public abstract <T extends View> T mo1608a(int i);

    /* renamed from: a */
    public abstract void mo1609a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo1610a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo1611a(View view);

    /* renamed from: a */
    public abstract void mo1612a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo1613a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo1614b();

    /* renamed from: b */
    public abstract void mo1615b(int i);

    /* renamed from: b */
    public abstract void mo1616b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo1617b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo1618c();

    /* renamed from: c */
    public abstract void mo1619c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo1620c(int i);

    /* renamed from: d */
    public abstract void mo1621d();

    /* renamed from: e */
    public abstract void mo1622e();

    /* renamed from: f */
    public abstract void mo1623f();

    /* renamed from: g */
    public abstract void mo1624g();

    /* renamed from: h */
    public abstract void mo1625h();

    /* renamed from: i */
    public abstract boolean mo1626i();
}
