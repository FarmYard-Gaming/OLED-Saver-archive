package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p018v7.app.C0378a;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.C0436a;
import android.support.p018v7.widget.C0548ah;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.an */
public class C0563an extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: j */
    private static final Interpolator f2032j = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f2033a;

    /* renamed from: b */
    C0548ah f2034b;

    /* renamed from: c */
    int f2035c;

    /* renamed from: d */
    int f2036d;

    /* renamed from: e */
    private C0566b f2037e;

    /* renamed from: f */
    private Spinner f2038f;

    /* renamed from: g */
    private boolean f2039g;

    /* renamed from: h */
    private int f2040h;

    /* renamed from: i */
    private int f2041i;

    /* renamed from: android.support.v7.widget.an$a */
    private class C0565a extends BaseAdapter {
        C0565a() {
        }

        public int getCount() {
            return C0563an.this.f2034b.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0567c) C0563an.this.f2034b.getChildAt(i)).mo2937b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0563an.this.mo2918a((C0378a.C0381c) getItem(i), true);
            }
            ((C0567c) view).mo2936a((C0378a.C0381c) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.an$b */
    private class C0566b implements View.OnClickListener {
        C0566b() {
        }

        public void onClick(View view) {
            ((C0567c) view).mo2937b().mo1567d();
            int childCount = C0563an.this.f2034b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0563an.this.f2034b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.an$c */
    private class C0567c extends LinearLayout {

        /* renamed from: b */
        private final int[] f2047b = {16842964};

        /* renamed from: c */
        private C0378a.C0381c f2048c;

        /* renamed from: d */
        private TextView f2049d;

        /* renamed from: e */
        private ImageView f2050e;

        /* renamed from: f */
        private View f2051f;

        public C0567c(Context context, C0378a.C0381c cVar, boolean z) {
            super(context, (AttributeSet) null, C0353a.C0354a.actionBarTabStyle);
            this.f2048c = cVar;
            C0575au a = C0575au.m2819a(context, (AttributeSet) null, this.f2047b, C0353a.C0354a.actionBarTabStyle, 0);
            if (a.mo2972g(0)) {
                setBackgroundDrawable(a.mo2958a(0));
            }
            a.mo2959a();
            if (z) {
                setGravity(8388627);
            }
            mo2935a();
        }

        /* renamed from: a */
        public void mo2935a() {
            C0378a.C0381c cVar = this.f2048c;
            View c = cVar.mo1566c();
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f2051f = c;
                if (this.f2049d != null) {
                    this.f2049d.setVisibility(8);
                }
                if (this.f2050e != null) {
                    this.f2050e.setVisibility(8);
                    this.f2050e.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            if (this.f2051f != null) {
                removeView(this.f2051f);
                this.f2051f = null;
            }
            Drawable a = cVar.mo1564a();
            CharSequence b = cVar.mo1565b();
            if (a != null) {
                if (this.f2050e == null) {
                    C0618p pVar = new C0618p(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    pVar.setLayoutParams(layoutParams);
                    addView(pVar, 0);
                    this.f2050e = pVar;
                }
                this.f2050e.setImageDrawable(a);
                this.f2050e.setVisibility(0);
            } else if (this.f2050e != null) {
                this.f2050e.setVisibility(8);
                this.f2050e.setImageDrawable((Drawable) null);
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f2049d == null) {
                    C0635z zVar = new C0635z(getContext(), (AttributeSet) null, C0353a.C0354a.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f2049d = zVar;
                }
                this.f2049d.setText(b);
                this.f2049d.setVisibility(0);
            } else if (this.f2049d != null) {
                this.f2049d.setVisibility(8);
                this.f2049d.setText((CharSequence) null);
            }
            if (this.f2050e != null) {
                this.f2050e.setContentDescription(cVar.mo1568e());
            }
            C0579aw.m2884a(this, z ? null : cVar.mo1568e());
        }

        /* renamed from: a */
        public void mo2936a(C0378a.C0381c cVar) {
            this.f2048c = cVar;
            mo2935a();
        }

        /* renamed from: b */
        public C0378a.C0381c mo2937b() {
            return this.f2048c;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0378a.C0381c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0378a.C0381c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0563an.this.f2035c > 0 && getMeasuredWidth() > C0563an.this.f2035c) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(C0563an.this.f2035c, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    private boolean m2775a() {
        return this.f2038f != null && this.f2038f.getParent() == this;
    }

    /* renamed from: b */
    private void m2776b() {
        if (!m2775a()) {
            if (this.f2038f == null) {
                this.f2038f = m2778d();
            }
            removeView(this.f2034b);
            addView(this.f2038f, new ViewGroup.LayoutParams(-2, -1));
            if (this.f2038f.getAdapter() == null) {
                this.f2038f.setAdapter(new C0565a());
            }
            if (this.f2033a != null) {
                removeCallbacks(this.f2033a);
                this.f2033a = null;
            }
            this.f2038f.setSelection(this.f2041i);
        }
    }

    /* renamed from: c */
    private boolean m2777c() {
        if (m2775a()) {
            removeView(this.f2038f);
            addView(this.f2034b, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f2038f.getSelectedItemPosition());
        }
        return false;
    }

    /* renamed from: d */
    private Spinner m2778d() {
        C0626x xVar = new C0626x(getContext(), (AttributeSet) null, C0353a.C0354a.actionDropDownStyle);
        xVar.setLayoutParams(new C0548ah.C0549a(-2, -1));
        xVar.setOnItemSelectedListener(this);
        return xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0567c mo2918a(C0378a.C0381c cVar, boolean z) {
        C0567c cVar2 = new C0567c(getContext(), cVar, z);
        if (z) {
            cVar2.setBackgroundDrawable((Drawable) null);
            cVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2040h));
        } else {
            cVar2.setFocusable(true);
            if (this.f2037e == null) {
                this.f2037e = new C0566b();
            }
            cVar2.setOnClickListener(this.f2037e);
        }
        return cVar2;
    }

    /* renamed from: a */
    public void mo2919a(int i) {
        final View childAt = this.f2034b.getChildAt(i);
        if (this.f2033a != null) {
            removeCallbacks(this.f2033a);
        }
        this.f2033a = new Runnable() {
            public void run() {
                C0563an.this.smoothScrollTo(childAt.getLeft() - ((C0563an.this.getWidth() - childAt.getWidth()) / 2), 0);
                C0563an.this.f2033a = null;
            }
        };
        post(this.f2033a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2033a != null) {
            post(this.f2033a);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0436a a = C0436a.m2038a(getContext());
        setContentHeight(a.mo1869e());
        this.f2036d = a.mo1871g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2033a != null) {
            removeCallbacks(this.f2033a);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0567c) view).mo2937b().mo1567d();
    }

    public void onMeasure(int i, int i2) {
        boolean z = true;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f2034b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f2035c = -1;
        } else {
            if (childCount > 2) {
                this.f2035c = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f2035c = View.MeasureSpec.getSize(i) / 2;
            }
            this.f2035c = Math.min(this.f2035c, this.f2036d);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2040h, 1073741824);
        if (z2 || !this.f2039g) {
            z = false;
        }
        if (z) {
            this.f2034b.measure(0, makeMeasureSpec);
            if (this.f2034b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m2776b();
            } else {
                m2777c();
            }
        } else {
            m2777c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f2041i);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2039g = z;
    }

    public void setContentHeight(int i) {
        this.f2040h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f2041i = i;
        int childCount = this.f2034b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2034b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2919a(i);
            }
            i2++;
        }
        if (this.f2038f != null && i >= 0) {
            this.f2038f.setSelection(i);
        }
    }
}
