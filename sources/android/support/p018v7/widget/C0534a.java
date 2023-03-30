package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.p015g.C0256u;
import android.support.p006v4.p015g.C0260v;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.a */
abstract class C0534a extends ViewGroup {

    /* renamed from: a */
    protected final C0535a f1905a;

    /* renamed from: b */
    protected final Context f1906b;

    /* renamed from: c */
    protected ActionMenuView f1907c;

    /* renamed from: d */
    protected C0588c f1908d;

    /* renamed from: e */
    protected int f1909e;

    /* renamed from: f */
    protected C0256u f1910f;

    /* renamed from: g */
    private boolean f1911g;

    /* renamed from: h */
    private boolean f1912h;

    /* renamed from: android.support.v7.widget.a$a */
    protected class C0535a implements C0260v {

        /* renamed from: a */
        int f1913a;

        /* renamed from: c */
        private boolean f1915c = false;

        protected C0535a() {
        }

        /* renamed from: a */
        public C0535a mo2718a(C0256u uVar, int i) {
            C0534a.this.f1910f = uVar;
            this.f1913a = i;
            return this;
        }

        /* renamed from: a */
        public void mo1090a(View view) {
            C0534a.super.setVisibility(0);
            this.f1915c = false;
        }

        /* renamed from: b */
        public void mo1091b(View view) {
            if (!this.f1915c) {
                C0534a.this.f1910f = null;
                C0534a.super.setVisibility(this.f1913a);
            }
        }

        /* renamed from: c */
        public void mo1092c(View view) {
            this.f1915c = true;
        }
    }

    C0534a(Context context) {
        this(context, (AttributeSet) null);
    }

    C0534a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0534a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1905a = new C0535a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0353a.C0354a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1906b = context;
        } else {
            this.f1906b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m2597a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2715a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2716a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0256u mo2356a(int i, long j) {
        if (this.f1910f != null) {
            this.f1910f.mo1084b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0256u a = C0249q.m1062d(this).mo1077a(1.0f);
            a.mo1078a(j);
            a.mo1079a((C0260v) this.f1905a.mo2718a(a, i));
            return a;
        }
        C0256u a2 = C0249q.m1062d(this).mo1077a(0.0f);
        a2.mo1078a(j);
        a2.mo1079a((C0260v) this.f1905a.mo2718a(a2, i));
        return a2;
    }

    /* renamed from: a */
    public boolean mo2358a() {
        if (this.f1908d != null) {
            return this.f1908d.mo3007d();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f1910f != null ? this.f1905a.f1913a : getVisibility();
    }

    public int getContentHeight() {
        return this.f1909e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0353a.C0363j.ActionBar, C0353a.C0354a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0353a.C0363j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f1908d != null) {
            this.f1908d.mo3001a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1912h = false;
        }
        if (!this.f1912h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1912h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1912h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1911g = false;
        }
        if (!this.f1911g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1911g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1911g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1909e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f1910f != null) {
                this.f1910f.mo1084b();
            }
            super.setVisibility(i);
        }
    }
}
