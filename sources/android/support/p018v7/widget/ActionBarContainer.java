package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f1664a;

    /* renamed from: b */
    Drawable f1665b;

    /* renamed from: c */
    Drawable f1666c;

    /* renamed from: d */
    boolean f1667d;

    /* renamed from: e */
    boolean f1668e;

    /* renamed from: f */
    private boolean f1669f;

    /* renamed from: g */
    private View f1670g;

    /* renamed from: h */
    private View f1671h;

    /* renamed from: i */
    private View f1672i;

    /* renamed from: j */
    private int f1673j;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = true;
        C0249q.m1052a((View) this, (Drawable) new C0585b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0353a.C0363j.ActionBar);
        this.f1664a = obtainStyledAttributes.getDrawable(C0353a.C0363j.ActionBar_background);
        this.f1665b = obtainStyledAttributes.getDrawable(C0353a.C0363j.ActionBar_backgroundStacked);
        this.f1673j = obtainStyledAttributes.getDimensionPixelSize(C0353a.C0363j.ActionBar_height, -1);
        if (getId() == C0353a.C0359f.split_action_bar) {
            this.f1667d = true;
            this.f1666c = obtainStyledAttributes.getDrawable(C0353a.C0363j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (this.f1667d) {
            if (this.f1666c != null) {
                z = false;
            }
        } else if (!(this.f1664a == null && this.f1665b == null)) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private boolean m2400a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private int m2401b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + view.getMeasuredHeight() + layoutParams.topMargin;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1664a != null && this.f1664a.isStateful()) {
            this.f1664a.setState(getDrawableState());
        }
        if (this.f1665b != null && this.f1665b.isStateful()) {
            this.f1665b.setState(getDrawableState());
        }
        if (this.f1666c != null && this.f1666c.isStateful()) {
            this.f1666c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1670g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f1664a != null) {
            this.f1664a.jumpToCurrentState();
        }
        if (this.f1665b != null) {
            this.f1665b.jumpToCurrentState();
        }
        if (this.f1666c != null) {
            this.f1666c.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1671h = findViewById(C0353a.C0359f.action_bar);
        this.f1672i = findViewById(C0353a.C0359f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1669f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3 = true;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1670g;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f1667d) {
            if (this.f1664a != null) {
                if (this.f1671h.getVisibility() == 0) {
                    this.f1664a.setBounds(this.f1671h.getLeft(), this.f1671h.getTop(), this.f1671h.getRight(), this.f1671h.getBottom());
                } else if (this.f1672i == null || this.f1672i.getVisibility() != 0) {
                    this.f1664a.setBounds(0, 0, 0, 0);
                } else {
                    this.f1664a.setBounds(this.f1672i.getLeft(), this.f1672i.getTop(), this.f1672i.getRight(), this.f1672i.getBottom());
                }
                z2 = true;
            } else {
                z2 = false;
            }
            this.f1668e = z4;
            if (!z4 || this.f1665b == null) {
                z3 = z2;
            } else {
                this.f1665b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.f1666c != null) {
            this.f1666c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z3 = false;
        }
        if (z3) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f1671h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f1673j >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.f1673j, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1671h != null) {
            int mode = View.MeasureSpec.getMode(i2);
            if (this.f1670g != null && this.f1670g.getVisibility() != 8 && mode != 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), Math.min((!m2400a(this.f1671h) ? m2401b(this.f1671h) : !m2400a(this.f1672i) ? m2401b(this.f1672i) : 0) + m2401b(this.f1670g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        boolean z = true;
        if (this.f1664a != null) {
            this.f1664a.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1664a);
        }
        this.f1664a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1671h != null) {
                this.f1664a.setBounds(this.f1671h.getLeft(), this.f1671h.getTop(), this.f1671h.getRight(), this.f1671h.getBottom());
            }
        }
        if (this.f1667d) {
            if (this.f1666c != null) {
                z = false;
            }
        } else if (!(this.f1664a == null && this.f1665b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        boolean z = true;
        if (this.f1666c != null) {
            this.f1666c.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1666c);
        }
        this.f1666c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1667d && this.f1666c != null) {
                this.f1666c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.f1667d) {
            if (this.f1666c != null) {
                z = false;
            }
        } else if (!(this.f1664a == null && this.f1665b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z = true;
        if (this.f1665b != null) {
            this.f1665b.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1665b);
        }
        this.f1665b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1668e && this.f1665b != null) {
                this.f1665b.setBounds(this.f1670g.getLeft(), this.f1670g.getTop(), this.f1670g.getRight(), this.f1670g.getBottom());
            }
        }
        if (this.f1667d) {
            if (this.f1666c != null) {
                z = false;
            }
        } else if (!(this.f1664a == null && this.f1665b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0563an anVar) {
        if (this.f1670g != null) {
            removeView(this.f1670g);
        }
        this.f1670g = anVar;
        if (anVar != null) {
            addView(anVar);
            ViewGroup.LayoutParams layoutParams = anVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            anVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1669f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f1664a != null) {
            this.f1664a.setVisible(z, false);
        }
        if (this.f1665b != null) {
            this.f1665b.setVisible(z, false);
        }
        if (this.f1666c != null) {
            this.f1666c.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1664a && !this.f1667d) || (drawable == this.f1665b && this.f1668e) || ((drawable == this.f1666c && this.f1667d) || super.verifyDrawable(drawable));
    }
}
