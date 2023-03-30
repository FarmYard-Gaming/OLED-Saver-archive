package android.support.p018v7.view.menu;

import android.content.Context;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.widget.C0575au;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C0465h.C0467b, C0483p, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final int[] f1443a = {16842964, 16843049};

    /* renamed from: b */
    private C0465h f1444b;

    /* renamed from: c */
    private int f1445c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0575au a = C0575au.m2819a(context, attributeSet, f1443a, i, 0);
        if (a.mo2972g(0)) {
            setBackgroundDrawable(a.mo2958a(0));
        }
        if (a.mo2972g(1)) {
            setDivider(a.mo2958a(1));
        }
        a.mo2959a();
    }

    /* renamed from: a */
    public void mo1958a(C0465h hVar) {
        this.f1444b = hVar;
    }

    /* renamed from: a */
    public boolean mo1959a(C0469j jVar) {
        return this.f1444b.mo2091a((MenuItem) jVar, 0);
    }

    public int getWindowAnimations() {
        return this.f1445c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1959a((C0469j) getAdapter().getItem(i));
    }
}
