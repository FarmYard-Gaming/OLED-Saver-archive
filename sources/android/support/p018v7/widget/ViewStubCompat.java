package android.support.p018v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f1900a;

    /* renamed from: b */
    private int f1901b;

    /* renamed from: c */
    private WeakReference<View> f1902c;

    /* renamed from: d */
    private LayoutInflater f1903d;

    /* renamed from: e */
    private C0533a f1904e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C0533a {
        /* renamed from: a */
        void mo2714a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1900a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0353a.C0363j.ViewStubCompat, i, 0);
        this.f1901b = obtainStyledAttributes.getResourceId(C0353a.C0363j.ViewStubCompat_android_inflatedId, -1);
        this.f1900a = obtainStyledAttributes.getResourceId(C0353a.C0363j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0353a.C0363j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo2702a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1900a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflate = (this.f1903d != null ? this.f1903d : LayoutInflater.from(getContext())).inflate(this.f1900a, viewGroup, false);
            if (this.f1901b != -1) {
                inflate.setId(this.f1901b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1902c = new WeakReference<>(inflate);
            if (this.f1904e != null) {
                this.f1904e.mo2714a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1901b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1903d;
    }

    public int getLayoutResource() {
        return this.f1900a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1901b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1903d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1900a = i;
    }

    public void setOnInflateListener(C0533a aVar) {
        this.f1904e = aVar;
    }

    public void setVisibility(int i) {
        if (this.f1902c != null) {
            View view = (View) this.f1902c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo2702a();
        }
    }
}
