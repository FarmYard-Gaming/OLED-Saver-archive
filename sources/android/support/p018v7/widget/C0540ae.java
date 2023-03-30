package android.support.p018v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.p015g.C0256u;
import android.support.p006v4.widget.C0345h;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p022c.p023a.C0433c;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.ae */
class C0540ae extends ListView {

    /* renamed from: a */
    C0542b f1930a;

    /* renamed from: b */
    private final Rect f1931b = new Rect();

    /* renamed from: c */
    private int f1932c = 0;

    /* renamed from: d */
    private int f1933d = 0;

    /* renamed from: e */
    private int f1934e = 0;

    /* renamed from: f */
    private int f1935f = 0;

    /* renamed from: g */
    private int f1936g;

    /* renamed from: h */
    private Field f1937h;

    /* renamed from: i */
    private C0541a f1938i;

    /* renamed from: j */
    private boolean f1939j;

    /* renamed from: k */
    private boolean f1940k;

    /* renamed from: l */
    private boolean f1941l;

    /* renamed from: m */
    private C0256u f1942m;

    /* renamed from: n */
    private C0345h f1943n;

    /* renamed from: android.support.v7.widget.ae$a */
    private static class C0541a extends C0433c {

        /* renamed from: a */
        private boolean f1944a = true;

        C0541a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2774a(boolean z) {
            this.f1944a = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1944a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1944a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1944a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1944a) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1944a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ae$b */
    private class C0542b implements Runnable {
        C0542b() {
        }

        /* renamed from: a */
        public void mo2775a() {
            C0540ae.this.f1930a = null;
            C0540ae.this.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo2776b() {
            C0540ae.this.post(this);
        }

        public void run() {
            C0540ae.this.f1930a = null;
            C0540ae.this.drawableStateChanged();
        }
    }

    C0540ae(Context context, boolean z) {
        super(context, (AttributeSet) null, C0353a.C0354a.dropDownListViewStyle);
        this.f1940k = z;
        setCacheColorHint(0);
        try {
            this.f1937h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1937h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2677a() {
        Drawable selector = getSelector();
        if (selector != null && m2685c() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    private void m2678a(int i, View view) {
        boolean z = true;
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m2684b(i, view);
        if (z2) {
            Rect rect = this.f1931b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0270a.m1153a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: a */
    private void m2679a(int i, View view, float f, float f2) {
        m2678a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0270a.m1153a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m2680a(Canvas canvas) {
        Drawable selector;
        if (!this.f1931b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1931b);
            selector.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m2681a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m2682a(View view, int i, float f, float f2) {
        View childAt;
        this.f1941l = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (!(this.f1936g == -1 || (childAt = getChildAt(this.f1936g - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1936g = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m2679a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m2683b() {
        this.f1941l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1936g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f1942m != null) {
            this.f1942m.mo1084b();
            this.f1942m = null;
        }
    }

    /* renamed from: b */
    private void m2684b(int i, View view) {
        Rect rect = this.f1931b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1932c;
        rect.top -= this.f1933d;
        rect.right += this.f1934e;
        rect.bottom += this.f1935f;
        try {
            boolean z = this.f1937h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1937h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private boolean m2685c() {
        return this.f1941l;
    }

    private void setSelectorEnabled(boolean z) {
        if (this.f1938i != null) {
            this.f1938i.mo2774a(z);
        }
    }

    /* renamed from: a */
    public int mo2761a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingBottom + listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int i7 = 0;
        View view = null;
        int i8 = 0;
        int count = adapter.getCount();
        int i9 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            int measuredHeight = (i9 > 0 ? i6 + dividerHeight : i6) + view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i9 <= i5 || i7 <= 0 || measuredHeight == i4) ? i4 : i7;
            }
            if (i5 >= 0 && i9 >= i5) {
                i7 = measuredHeight;
            }
            i9++;
            i6 = measuredHeight;
        }
        return i6;
    }

    /* renamed from: a */
    public boolean mo2762a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        switch (actionMasked) {
            case 1:
                z = false;
                break;
            case 2:
                z = true;
                break;
            case 3:
                z2 = false;
                z = false;
                break;
            default:
                z2 = false;
                z = true;
                break;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex < 0) {
            z2 = false;
            z = false;
        } else {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition == -1) {
                z2 = true;
            } else {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                m2682a(childAt, pointToPosition, (float) x, (float) y);
                if (actionMasked == 1) {
                    m2681a(childAt, pointToPosition);
                }
                z2 = false;
                z = true;
            }
        }
        if (!z || z2) {
            m2683b();
        }
        if (z) {
            if (this.f1943n == null) {
                this.f1943n = new C0345h(this);
            }
            this.f1943n.mo1440a(true);
            this.f1943n.onTouch(this, motionEvent);
        } else if (this.f1943n != null) {
            this.f1943n.mo1440a(false);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m2680a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1930a == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m2677a();
        }
    }

    public boolean hasFocus() {
        return this.f1940k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1940k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1940k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1940k && this.f1939j) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1930a = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1930a == null) {
            this.f1930a = new C0542b();
            this.f1930a.mo2776b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition == -1 || pointToPosition == getSelectedItemPosition()) {
                return onHoverEvent;
            }
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            m2677a();
            return onHoverEvent;
        }
        setSelection(-1);
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f1936g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        if (this.f1930a != null) {
            this.f1930a.mo2775a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1939j = z;
    }

    public void setSelector(Drawable drawable) {
        this.f1938i = drawable != null ? new C0541a(drawable) : null;
        super.setSelector(this.f1938i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1932c = rect.left;
        this.f1933d = rect.top;
        this.f1934e = rect.right;
        this.f1935f = rect.bottom;
    }
}
