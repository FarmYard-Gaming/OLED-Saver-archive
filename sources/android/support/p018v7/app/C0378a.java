package android.support.p018v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.C0437b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.a */
public abstract class C0378a {

    /* renamed from: android.support.v7.app.a$a */
    public static class C0379a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1115a;

        public C0379a(int i, int i2) {
            super(i, i2);
            this.f1115a = 0;
            this.f1115a = 8388627;
        }

        public C0379a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1115a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0353a.C0363j.ActionBarLayout);
            this.f1115a = obtainStyledAttributes.getInt(C0353a.C0363j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0379a(C0379a aVar) {
            super(aVar);
            this.f1115a = 0;
            this.f1115a = aVar.f1115a;
        }

        public C0379a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1115a = 0;
        }
    }

    /* renamed from: android.support.v7.app.a$b */
    public interface C0380b {
        /* renamed from: a */
        void mo1563a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c */
    public static abstract class C0381c {
        /* renamed from: a */
        public abstract Drawable mo1564a();

        /* renamed from: b */
        public abstract CharSequence mo1565b();

        /* renamed from: c */
        public abstract View mo1566c();

        /* renamed from: d */
        public abstract void mo1567d();

        /* renamed from: e */
        public abstract CharSequence mo1568e();
    }

    /* renamed from: a */
    public abstract int mo1545a();

    /* renamed from: a */
    public C0437b mo1546a(C0437b.C0438a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo1547a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: a */
    public void mo1548a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo1549a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo1550a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo1551a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1552a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo1553b() {
        return null;
    }

    /* renamed from: b */
    public void mo1554b(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* renamed from: c */
    public void mo1555c(boolean z) {
    }

    /* renamed from: c */
    public boolean mo1556c() {
        return false;
    }

    /* renamed from: d */
    public void mo1557d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo1558d() {
        return false;
    }

    /* renamed from: e */
    public void mo1559e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo1560e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo1561f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1562g() {
    }
}
