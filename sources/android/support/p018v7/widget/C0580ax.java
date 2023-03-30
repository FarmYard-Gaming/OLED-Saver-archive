package android.support.p018v7.widget;

import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.p015g.C0253r;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v7.widget.ax */
class C0580ax implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {

    /* renamed from: j */
    private static C0580ax f2116j;

    /* renamed from: k */
    private static C0580ax f2117k;

    /* renamed from: a */
    private final View f2118a;

    /* renamed from: b */
    private final CharSequence f2119b;

    /* renamed from: c */
    private final int f2120c;

    /* renamed from: d */
    private final Runnable f2121d = new Runnable() {
        public void run() {
            C0580ax.this.mo2983a(false);
        }
    };

    /* renamed from: e */
    private final Runnable f2122e = new Runnable() {
        public void run() {
            C0580ax.this.mo2982a();
        }
    };

    /* renamed from: f */
    private int f2123f;

    /* renamed from: g */
    private int f2124g;

    /* renamed from: h */
    private C0583ay f2125h;

    /* renamed from: i */
    private boolean f2126i;

    private C0580ax(View view, CharSequence charSequence) {
        this.f2118a = view;
        this.f2119b = charSequence;
        this.f2120c = C0253r.m1081a(ViewConfiguration.get(this.f2118a.getContext()));
        m2890d();
        this.f2118a.setOnLongClickListener(this);
        this.f2118a.setOnHoverListener(this);
    }

    /* renamed from: a */
    private static void m2885a(C0580ax axVar) {
        if (f2116j != null) {
            f2116j.m2889c();
        }
        f2116j = axVar;
        if (f2116j != null) {
            f2116j.m2888b();
        }
    }

    /* renamed from: a */
    public static void m2886a(View view, CharSequence charSequence) {
        if (f2116j != null && f2116j.f2118a == view) {
            m2885a((C0580ax) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f2117k != null && f2117k.f2118a == view) {
                f2117k.mo2982a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0580ax(view, charSequence);
    }

    /* renamed from: a */
    private boolean m2887a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f2123f) <= this.f2120c && Math.abs(y - this.f2124g) <= this.f2120c) {
            return false;
        }
        this.f2123f = x;
        this.f2124g = y;
        return true;
    }

    /* renamed from: b */
    private void m2888b() {
        this.f2118a.postDelayed(this.f2121d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: c */
    private void m2889c() {
        this.f2118a.removeCallbacks(this.f2121d);
    }

    /* renamed from: d */
    private void m2890d() {
        this.f2123f = Integer.MAX_VALUE;
        this.f2124g = Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2982a() {
        if (f2117k == this) {
            f2117k = null;
            if (this.f2125h != null) {
                this.f2125h.mo2990a();
                this.f2125h = null;
                m2890d();
                this.f2118a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2116j == this) {
            m2885a((C0580ax) null);
        }
        this.f2118a.removeCallbacks(this.f2122e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2983a(boolean z) {
        if (C0249q.m1071m(this.f2118a)) {
            m2885a((C0580ax) null);
            if (f2117k != null) {
                f2117k.mo2982a();
            }
            f2117k = this;
            this.f2126i = z;
            this.f2125h = new C0583ay(this.f2118a.getContext());
            this.f2125h.mo2991a(this.f2118a, this.f2123f, this.f2124g, this.f2126i, this.f2119b);
            this.f2118a.addOnAttachStateChangeListener(this);
            long longPressTimeout = this.f2126i ? 2500 : (C0249q.m1064f(this.f2118a) & 1) == 1 ? 3000 - ((long) ViewConfiguration.getLongPressTimeout()) : 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            this.f2118a.removeCallbacks(this.f2122e);
            this.f2118a.postDelayed(this.f2122e, longPressTimeout);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2125h == null || !this.f2126i) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2118a.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                switch (motionEvent.getAction()) {
                    case 7:
                        if (this.f2118a.isEnabled() && this.f2125h == null && m2887a(motionEvent)) {
                            m2885a(this);
                            break;
                        }
                    case 10:
                        m2890d();
                        mo2982a();
                        break;
                }
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f2123f = view.getWidth() / 2;
        this.f2124g = view.getHeight() / 2;
        mo2983a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo2982a();
    }
}
