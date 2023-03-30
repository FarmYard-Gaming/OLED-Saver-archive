package android.support.p018v7.view.menu;

import android.content.Context;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.view.menu.C0483p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C0453b implements C0481o {

    /* renamed from: a */
    protected Context f1486a;

    /* renamed from: b */
    protected Context f1487b;

    /* renamed from: c */
    protected C0465h f1488c;

    /* renamed from: d */
    protected LayoutInflater f1489d;

    /* renamed from: e */
    protected LayoutInflater f1490e;

    /* renamed from: f */
    protected C0483p f1491f;

    /* renamed from: g */
    private C0481o.C0482a f1492g;

    /* renamed from: h */
    private int f1493h;

    /* renamed from: i */
    private int f1494i;

    /* renamed from: j */
    private int f1495j;

    public C0453b(Context context, int i, int i2) {
        this.f1486a = context;
        this.f1489d = LayoutInflater.from(context);
        this.f1493h = i;
        this.f1494i = i2;
    }

    /* renamed from: a */
    public C0481o.C0482a mo2011a() {
        return this.f1492g;
    }

    /* renamed from: a */
    public C0483p mo2012a(ViewGroup viewGroup) {
        if (this.f1491f == null) {
            this.f1491f = (C0483p) this.f1489d.inflate(this.f1493h, viewGroup, false);
            this.f1491f.mo1958a(this.f1488c);
            mo2025b(true);
        }
        return this.f1491f;
    }

    /* renamed from: a */
    public View mo2013a(C0469j jVar, View view, ViewGroup viewGroup) {
        C0483p.C0484a b = view instanceof C0483p.C0484a ? (C0483p.C0484a) view : mo2024b(viewGroup);
        mo2017a(jVar, b);
        return (View) b;
    }

    /* renamed from: a */
    public void mo2014a(int i) {
        this.f1495j = i;
    }

    /* renamed from: a */
    public void mo2015a(Context context, C0465h hVar) {
        this.f1487b = context;
        this.f1490e = LayoutInflater.from(this.f1487b);
        this.f1488c = hVar;
    }

    /* renamed from: a */
    public void mo2016a(C0465h hVar, boolean z) {
        if (this.f1492g != null) {
            this.f1492g.mo1665a(hVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo2017a(C0469j jVar, C0483p.C0484a aVar);

    /* renamed from: a */
    public void mo2018a(C0481o.C0482a aVar) {
        this.f1492g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2019a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1491f).addView(view, i);
    }

    /* renamed from: a */
    public boolean mo2020a(int i, C0469j jVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo2021a(C0465h hVar, C0469j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo2022a(C0491u uVar) {
        if (this.f1492g != null) {
            return this.f1492g.mo1666a(uVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2023a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: b */
    public C0483p.C0484a mo2024b(ViewGroup viewGroup) {
        return (C0483p.C0484a) this.f1489d.inflate(this.f1494i, viewGroup, false);
    }

    /* renamed from: b */
    public void mo2025b(boolean z) {
        int i;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f1491f;
        if (viewGroup != null) {
            if (this.f1488c != null) {
                this.f1488c.mo2129k();
                ArrayList<C0469j> j = this.f1488c.mo2128j();
                int size = j.size();
                int i3 = 0;
                i = 0;
                while (i3 < size) {
                    C0469j jVar = j.get(i3);
                    if (mo2020a(i, jVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        C0469j itemData = childAt instanceof C0483p.C0484a ? ((C0483p.C0484a) childAt).getItemData() : null;
                        View a = mo2013a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo2019a(a, i);
                        }
                        i2 = i + 1;
                    } else {
                        i2 = i;
                    }
                    i3++;
                    i = i2;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo2023a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo2026b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo2027b(C0465h hVar, C0469j jVar) {
        return false;
    }
}
