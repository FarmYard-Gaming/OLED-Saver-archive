package android.support.p018v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.p015g.C0256u;
import android.support.p006v4.p015g.C0260v;
import android.support.p006v4.p015g.C0261w;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.support.p018v7.view.menu.C0452a;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: android.support.v7.widget.av */
public class C0576av implements C0538ac {

    /* renamed from: a */
    Toolbar f2094a;

    /* renamed from: b */
    CharSequence f2095b;

    /* renamed from: c */
    Window.Callback f2096c;

    /* renamed from: d */
    boolean f2097d;

    /* renamed from: e */
    private int f2098e;

    /* renamed from: f */
    private View f2099f;

    /* renamed from: g */
    private View f2100g;

    /* renamed from: h */
    private Drawable f2101h;

    /* renamed from: i */
    private Drawable f2102i;

    /* renamed from: j */
    private Drawable f2103j;

    /* renamed from: k */
    private boolean f2104k;

    /* renamed from: l */
    private CharSequence f2105l;

    /* renamed from: m */
    private CharSequence f2106m;

    /* renamed from: n */
    private C0588c f2107n;

    /* renamed from: o */
    private int f2108o;

    /* renamed from: p */
    private int f2109p;

    /* renamed from: q */
    private Drawable f2110q;

    public C0576av(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0353a.C0361h.abc_action_bar_up_description, C0353a.C0358e.abc_ic_ab_back_material);
    }

    public C0576av(Toolbar toolbar, boolean z, int i, int i2) {
        this.f2108o = 0;
        this.f2109p = 0;
        this.f2094a = toolbar;
        this.f2095b = toolbar.getTitle();
        this.f2105l = toolbar.getSubtitle();
        this.f2104k = this.f2095b != null;
        this.f2103j = toolbar.getNavigationIcon();
        C0575au a = C0575au.m2819a(toolbar.getContext(), (AttributeSet) null, C0353a.C0363j.ActionBar, C0353a.C0354a.actionBarStyle, 0);
        this.f2110q = a.mo2958a(C0353a.C0363j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence c = a.mo2964c(C0353a.C0363j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                mo2975b(c);
            }
            CharSequence c2 = a.mo2964c(C0353a.C0363j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c2)) {
                mo2977c(c2);
            }
            Drawable a2 = a.mo2958a(C0353a.C0363j.ActionBar_logo);
            if (a2 != null) {
                mo2974b(a2);
            }
            Drawable a3 = a.mo2958a(C0353a.C0363j.ActionBar_icon);
            if (a3 != null) {
                mo2734a(a3);
            }
            if (this.f2103j == null && this.f2110q != null) {
                mo2976c(this.f2110q);
            }
            mo2744c(a.mo2956a(C0353a.C0363j.ActionBar_displayOptions, 0));
            int g = a.mo2971g(C0353a.C0363j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo2973a(LayoutInflater.from(this.f2094a.getContext()).inflate(g, this.f2094a, false));
                mo2744c(this.f2098e | 16);
            }
            int f = a.mo2969f(C0353a.C0363j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2094a.getLayoutParams();
                layoutParams.height = f;
                this.f2094a.setLayoutParams(layoutParams);
            }
            int d = a.mo2965d(C0353a.C0363j.ActionBar_contentInsetStart, -1);
            int d2 = a.mo2965d(C0353a.C0363j.ActionBar_contentInsetEnd, -1);
            if (d >= 0 || d2 >= 0) {
                this.f2094a.mo2612a(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo2971g(C0353a.C0363j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                this.f2094a.mo2613a(this.f2094a.getContext(), g2);
            }
            int g3 = a.mo2971g(C0353a.C0363j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                this.f2094a.mo2617b(this.f2094a.getContext(), g3);
            }
            int g4 = a.mo2971g(C0353a.C0363j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f2094a.setPopupTheme(g4);
            }
        } else {
            this.f2098e = m2839r();
        }
        a.mo2959a();
        mo2979e(i);
        this.f2106m = this.f2094a.getNavigationContentDescription();
        this.f2094a.setNavigationOnClickListener(new View.OnClickListener() {

            /* renamed from: a */
            final C0452a f2111a = new C0452a(C0576av.this.f2094a.getContext(), 0, 16908332, 0, 0, C0576av.this.f2095b);

            public void onClick(View view) {
                if (C0576av.this.f2096c != null && C0576av.this.f2097d) {
                    C0576av.this.f2096c.onMenuItemSelected(0, this.f2111a);
                }
            }
        });
    }

    /* renamed from: e */
    private void m2838e(CharSequence charSequence) {
        this.f2095b = charSequence;
        if ((this.f2098e & 8) != 0) {
            this.f2094a.setTitle(charSequence);
        }
    }

    /* renamed from: r */
    private int m2839r() {
        if (this.f2094a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2110q = this.f2094a.getNavigationIcon();
        return 15;
    }

    /* renamed from: s */
    private void m2840s() {
        Drawable drawable = null;
        if ((this.f2098e & 2) != 0) {
            drawable = (this.f2098e & 1) != 0 ? this.f2102i != null ? this.f2102i : this.f2101h : this.f2101h;
        }
        this.f2094a.setLogo(drawable);
    }

    /* renamed from: t */
    private void m2841t() {
        if ((this.f2098e & 4) != 0) {
            this.f2094a.setNavigationIcon(this.f2103j != null ? this.f2103j : this.f2110q);
        } else {
            this.f2094a.setNavigationIcon((Drawable) null);
        }
    }

    /* renamed from: u */
    private void m2842u() {
        if ((this.f2098e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2106m)) {
            this.f2094a.setNavigationContentDescription(this.f2109p);
        } else {
            this.f2094a.setNavigationContentDescription(this.f2106m);
        }
    }

    /* renamed from: a */
    public C0256u mo2731a(final int i, long j) {
        return C0249q.m1062d(this.f2094a).mo1077a(i == 0 ? 1.0f : 0.0f).mo1078a(j).mo1079a((C0260v) new C0261w() {

            /* renamed from: c */
            private boolean f2115c = false;

            /* renamed from: a */
            public void mo1090a(View view) {
                C0576av.this.f2094a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo1091b(View view) {
                if (!this.f2115c) {
                    C0576av.this.f2094a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public void mo1092c(View view) {
                this.f2115c = true;
            }
        });
    }

    /* renamed from: a */
    public ViewGroup mo2732a() {
        return this.f2094a;
    }

    /* renamed from: a */
    public void mo2733a(int i) {
        mo2734a(i != 0 ? C0419a.m1949b(mo2741b(), i) : null);
    }

    /* renamed from: a */
    public void mo2734a(Drawable drawable) {
        this.f2101h = drawable;
        m2840s();
    }

    /* renamed from: a */
    public void mo2735a(C0481o.C0482a aVar, C0465h.C0466a aVar2) {
        this.f2094a.mo2615a(aVar, aVar2);
    }

    /* renamed from: a */
    public void mo2736a(C0563an anVar) {
        if (this.f2099f != null && this.f2099f.getParent() == this.f2094a) {
            this.f2094a.removeView(this.f2099f);
        }
        this.f2099f = anVar;
        if (anVar != null && this.f2108o == 2) {
            this.f2094a.addView(this.f2099f, 0);
            Toolbar.C0529b bVar = (Toolbar.C0529b) this.f2099f.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f1115a = 8388691;
            anVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo2737a(Menu menu, C0481o.C0482a aVar) {
        if (this.f2107n == null) {
            this.f2107n = new C0588c(this.f2094a.getContext());
            this.f2107n.mo2014a(C0353a.C0359f.action_menu_presenter);
        }
        this.f2107n.mo2018a(aVar);
        this.f2094a.mo2614a((C0465h) menu, this.f2107n);
    }

    /* renamed from: a */
    public void mo2973a(View view) {
        if (!(this.f2100g == null || (this.f2098e & 16) == 0)) {
            this.f2094a.removeView(this.f2100g);
        }
        this.f2100g = view;
        if (view != null && (this.f2098e & 16) != 0) {
            this.f2094a.addView(this.f2100g);
        }
    }

    /* renamed from: a */
    public void mo2738a(Window.Callback callback) {
        this.f2096c = callback;
    }

    /* renamed from: a */
    public void mo2739a(CharSequence charSequence) {
        if (!this.f2104k) {
            m2838e(charSequence);
        }
    }

    /* renamed from: a */
    public void mo2740a(boolean z) {
        this.f2094a.setCollapsible(z);
    }

    /* renamed from: b */
    public Context mo2741b() {
        return this.f2094a.getContext();
    }

    /* renamed from: b */
    public void mo2742b(int i) {
        mo2974b(i != 0 ? C0419a.m1949b(mo2741b(), i) : null);
    }

    /* renamed from: b */
    public void mo2974b(Drawable drawable) {
        this.f2102i = drawable;
        m2840s();
    }

    /* renamed from: b */
    public void mo2975b(CharSequence charSequence) {
        this.f2104k = true;
        m2838e(charSequence);
    }

    /* renamed from: b */
    public void mo2743b(boolean z) {
    }

    /* renamed from: c */
    public void mo2744c(int i) {
        int i2 = this.f2098e ^ i;
        this.f2098e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2842u();
                }
                m2841t();
            }
            if ((i2 & 3) != 0) {
                m2840s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2094a.setTitle(this.f2095b);
                    this.f2094a.setSubtitle(this.f2105l);
                } else {
                    this.f2094a.setTitle((CharSequence) null);
                    this.f2094a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && this.f2100g != null) {
                if ((i & 16) != 0) {
                    this.f2094a.addView(this.f2100g);
                } else {
                    this.f2094a.removeView(this.f2100g);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2976c(Drawable drawable) {
        this.f2103j = drawable;
        m2841t();
    }

    /* renamed from: c */
    public void mo2977c(CharSequence charSequence) {
        this.f2105l = charSequence;
        if ((this.f2098e & 8) != 0) {
            this.f2094a.setSubtitle(charSequence);
        }
    }

    /* renamed from: c */
    public boolean mo2745c() {
        return this.f2094a.mo2624g();
    }

    /* renamed from: d */
    public void mo2746d() {
        this.f2094a.mo2654h();
    }

    /* renamed from: d */
    public void mo2747d(int i) {
        this.f2094a.setVisibility(i);
    }

    /* renamed from: d */
    public void mo2978d(CharSequence charSequence) {
        this.f2106m = charSequence;
        m2842u();
    }

    /* renamed from: e */
    public CharSequence mo2748e() {
        return this.f2094a.getTitle();
    }

    /* renamed from: e */
    public void mo2979e(int i) {
        if (i != this.f2109p) {
            this.f2109p = i;
            if (TextUtils.isEmpty(this.f2094a.getNavigationContentDescription())) {
                mo2980f(this.f2109p);
            }
        }
    }

    /* renamed from: f */
    public void mo2749f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: f */
    public void mo2980f(int i) {
        mo2978d((CharSequence) i == 0 ? null : mo2741b().getString(i));
    }

    /* renamed from: g */
    public void mo2750g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: h */
    public boolean mo2751h() {
        return this.f2094a.mo2616a();
    }

    /* renamed from: i */
    public boolean mo2752i() {
        return this.f2094a.mo2618b();
    }

    /* renamed from: j */
    public boolean mo2753j() {
        return this.f2094a.mo2619c();
    }

    /* renamed from: k */
    public boolean mo2754k() {
        return this.f2094a.mo2621d();
    }

    /* renamed from: l */
    public boolean mo2755l() {
        return this.f2094a.mo2622e();
    }

    /* renamed from: m */
    public void mo2756m() {
        this.f2097d = true;
    }

    /* renamed from: n */
    public void mo2757n() {
        this.f2094a.mo2623f();
    }

    /* renamed from: o */
    public int mo2758o() {
        return this.f2098e;
    }

    /* renamed from: p */
    public int mo2759p() {
        return this.f2108o;
    }

    /* renamed from: q */
    public Menu mo2760q() {
        return this.f2094a.getMenu();
    }
}
