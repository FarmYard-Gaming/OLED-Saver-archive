package android.support.p018v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.view.menu.C0483p;
import android.support.p018v7.widget.ActionMenuView;
import android.support.p018v7.widget.C0545ag;
import android.support.p018v7.widget.C0579aw;
import android.support.p018v7.widget.C0635z;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends C0635z implements C0483p.C0484a, ActionMenuView.C0499a, View.OnClickListener {

    /* renamed from: b */
    C0469j f1431b;

    /* renamed from: c */
    C0465h.C0467b f1432c;

    /* renamed from: d */
    C0451b f1433d;

    /* renamed from: e */
    private CharSequence f1434e;

    /* renamed from: f */
    private Drawable f1435f;

    /* renamed from: g */
    private C0545ag f1436g;

    /* renamed from: h */
    private boolean f1437h;

    /* renamed from: i */
    private boolean f1438i;

    /* renamed from: j */
    private int f1439j;

    /* renamed from: k */
    private int f1440k;

    /* renamed from: l */
    private int f1441l;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C0450a extends C0545ag {
        public C0450a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0487s mo1955a() {
            if (ActionMenuItemView.this.f1433d != null) {
                return ActionMenuItemView.this.f1433d.mo1957a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            r1 = mo1955a();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1956b() {
            /*
                r3 = this;
                r0 = 0
                android.support.v7.view.menu.ActionMenuItemView r1 = android.support.p018v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.h$b r1 = r1.f1432c
                if (r1 == 0) goto L_0x0022
                android.support.v7.view.menu.ActionMenuItemView r1 = android.support.p018v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.h$b r1 = r1.f1432c
                android.support.v7.view.menu.ActionMenuItemView r2 = android.support.p018v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.j r2 = r2.f1431b
                boolean r1 = r1.mo1959a(r2)
                if (r1 == 0) goto L_0x0022
                android.support.v7.view.menu.s r1 = r3.mo1955a()
                if (r1 == 0) goto L_0x0022
                boolean r1 = r1.mo2043d()
                if (r1 == 0) goto L_0x0022
                r0 = 1
            L_0x0022:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.view.menu.ActionMenuItemView.C0450a.mo1956b():boolean");
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C0451b {
        /* renamed from: a */
        public abstract C0487s mo1957a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1437h = m2118e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0353a.C0363j.ActionMenuItemView, i, 0);
        this.f1439j = obtainStyledAttributes.getDimensionPixelSize(C0353a.C0363j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1441l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1440k = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m2118e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m2119f() {
        boolean z = false;
        CharSequence charSequence = null;
        boolean z2 = !TextUtils.isEmpty(this.f1434e);
        if (this.f1435f == null || (this.f1431b.mo2192m() && (this.f1437h || this.f1438i))) {
            z = true;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f1434e : null);
        CharSequence contentDescription = this.f1431b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f1431b.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1431b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f1431b.getTitle();
            }
            C0579aw.m2884a(this, charSequence);
            return;
        }
        C0579aw.m2884a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo1936a(C0469j jVar, int i) {
        this.f1431b = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo2155a((C0483p.C0484a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1436g == null) {
            this.f1436g = new C0450a();
        }
    }

    /* renamed from: a */
    public boolean mo1937a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo1938b() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: c */
    public boolean mo1939c() {
        return mo1938b() && this.f1431b.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo1940d() {
        return mo1938b();
    }

    public C0469j getItemData() {
        return this.f1431b;
    }

    public void onClick(View view) {
        if (this.f1432c != null) {
            this.f1432c.mo1959a(this.f1431b);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1437h = m2118e();
        m2119f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean b = mo1938b();
        if (b && this.f1440k >= 0) {
            super.setPadding(this.f1440k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1439j) : this.f1439j;
        if (mode != 1073741824 && this.f1439j > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!b && this.f1435f != null) {
            super.setPadding((getMeasuredWidth() - this.f1435f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1431b.hasSubMenu() || this.f1436g == null || !this.f1436g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1438i != z) {
            this.f1438i = z;
            if (this.f1431b != null) {
                this.f1431b.mo2182h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1435f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f1441l) {
                float f = ((float) this.f1441l) / ((float) intrinsicWidth);
                intrinsicWidth = this.f1441l;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f1441l) {
                float f2 = ((float) this.f1441l) / ((float) intrinsicHeight);
                intrinsicHeight = this.f1441l;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m2119f();
    }

    public void setItemInvoker(C0465h.C0467b bVar) {
        this.f1432c = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1440k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0451b bVar) {
        this.f1433d = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1434e = charSequence;
        m2119f();
    }
}
