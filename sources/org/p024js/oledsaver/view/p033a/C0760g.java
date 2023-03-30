package org.p024js.oledsaver.view.p033a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: org.js.oledsaver.view.a.g */
class C0760g extends ViewGroup {

    /* renamed from: a */
    private final RectF f2721a;

    /* renamed from: b */
    private final RectF f2722b;

    /* renamed from: c */
    private final RectF f2723c;

    /* renamed from: d */
    private final Paint f2724d;

    /* renamed from: e */
    private int f2725e;

    /* renamed from: f */
    private int f2726f;

    /* renamed from: g */
    private int f2727g;

    /* renamed from: h */
    private int f2728h;

    /* renamed from: i */
    private int f2729i;

    /* renamed from: j */
    private boolean f2730j;

    /* renamed from: k */
    private boolean f2731k;

    /* renamed from: l */
    private int f2732l;

    /* renamed from: m */
    private int f2733m;

    /* renamed from: n */
    private Paint f2734n;

    /* renamed from: o */
    private Bitmap f2735o;

    /* renamed from: p */
    private Canvas f2736p;

    /* renamed from: q */
    private Paint f2737q;

    /* renamed from: r */
    private Paint f2738r;

    /* renamed from: org.js.oledsaver.view.a.g$a */
    static class C0761a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f2739a = 4;

        /* renamed from: b */
        public int f2740b = 32;

        /* renamed from: c */
        public int f2741c = 0;

        /* renamed from: d */
        public int f2742d = 0;

        public C0761a(int i, int i2) {
            super(i, i2);
        }
    }

    public C0760g(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public C0760g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2721a = new RectF();
        this.f2722b = new RectF();
        this.f2723c = new RectF();
        this.f2724d = new Paint();
        this.f2725e = 0;
        this.f2726f = 0;
        this.f2727g = 0;
        this.f2728h = 0;
        this.f2729i = 0;
        this.f2732l = 0;
        this.f2733m = 0;
        setWillNotDraw(false);
        Point point = new Point();
        point.x = getResources().getDisplayMetrics().widthPixels;
        point.y = getResources().getDisplayMetrics().heightPixels;
        this.f2735o = Bitmap.createBitmap(point.x, point.y, Bitmap.Config.ARGB_8888);
        this.f2736p = new Canvas(this.f2735o);
        this.f2737q = new Paint();
        this.f2737q.setColor(-872415232);
        this.f2738r = new Paint();
        this.f2738r.setColor(getResources().getColor(17170445));
        this.f2738r.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f2734n = new Paint();
        this.f2734n.setColor(-1);
        this.f2734n.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f2734n.setFlags(1);
    }

    /* renamed from: a */
    private void m3593a(View view, RectF rectF, int i) {
        switch (i) {
            case 16:
                rectF.left = this.f2721a.left;
                rectF.right = rectF.left + ((float) view.getMeasuredWidth());
                return;
            case 32:
                rectF.left = (this.f2721a.width() - ((float) view.getMeasuredWidth())) / 2.0f;
                rectF.right = (this.f2721a.width() + ((float) view.getMeasuredWidth())) / 2.0f;
                rectF.offset(this.f2721a.left, 0.0f);
                return;
            case 48:
                rectF.right = this.f2721a.right;
                rectF.left = rectF.right - ((float) view.getMeasuredWidth());
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m3594b() {
        m3596c();
    }

    /* renamed from: b */
    private void m3595b(View view, RectF rectF, int i) {
        switch (i) {
            case 16:
                rectF.top = this.f2721a.top;
                rectF.bottom = rectF.top + ((float) view.getMeasuredHeight());
                return;
            case 32:
                rectF.top = (this.f2721a.width() - ((float) view.getMeasuredHeight())) / 2.0f;
                rectF.bottom = (this.f2721a.width() + ((float) view.getMeasuredHeight())) / 2.0f;
                rectF.offset(0.0f, this.f2721a.top);
                return;
            case 48:
                rectF.bottom = this.f2721a.bottom;
                rectF.top = this.f2721a.bottom - ((float) view.getMeasuredHeight());
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    private void m3596c() {
        if (this.f2725e != 0 && this.f2726f == 0) {
            this.f2721a.left -= (float) this.f2725e;
        }
        if (this.f2725e != 0 && this.f2727g == 0) {
            this.f2721a.top -= (float) this.f2725e;
        }
        if (this.f2725e != 0 && this.f2728h == 0) {
            this.f2721a.right += (float) this.f2725e;
        }
        if (this.f2725e != 0 && this.f2729i == 0) {
            this.f2721a.bottom += (float) this.f2725e;
        }
        if (this.f2726f != 0) {
            this.f2721a.left -= (float) this.f2726f;
        }
        if (this.f2727g != 0) {
            this.f2721a.top -= (float) this.f2727g;
        }
        if (this.f2728h != 0) {
            this.f2721a.right += (float) this.f2728h;
        }
        if (this.f2729i != 0) {
            this.f2721a.bottom += (float) this.f2729i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0761a generateDefaultLayoutParams() {
        return new C0761a(-2, -2);
    }

    /* renamed from: a */
    public void mo3605a(int i) {
        this.f2724d.setAlpha(i);
        invalidate();
    }

    /* renamed from: a */
    public void mo3606a(Rect rect) {
        this.f2721a.set(rect);
        m3594b();
        invalidate();
    }

    /* renamed from: a */
    public void mo3607a(boolean z) {
        this.f2731k = z;
    }

    /* renamed from: b */
    public void mo3608b(int i) {
        this.f2724d.setColor(i);
        invalidate();
    }

    /* renamed from: b */
    public void mo3609b(Rect rect) {
        this.f2722b.set(rect);
        m3594b();
        this.f2730j = true;
        invalidate();
    }

    /* renamed from: c */
    public void mo3610c(int i) {
        this.f2732l = i;
    }

    /* renamed from: d */
    public void mo3611d(int i) {
        this.f2733m = i;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        long drawingTime = getDrawingTime();
        int i = 0;
        while (i < getChildCount()) {
            try {
                drawChild(canvas, getChildAt(i), drawingTime);
                i++;
            } catch (NullPointerException e) {
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo3613e(int i) {
        this.f2725e = i;
    }

    /* renamed from: f */
    public void mo3614f(int i) {
        this.f2726f = i;
    }

    /* renamed from: g */
    public void mo3615g(int i) {
        this.f2727g = i;
    }

    /* renamed from: h */
    public void mo3617h(int i) {
        this.f2728h = i;
    }

    /* renamed from: i */
    public void mo3618i(int i) {
        this.f2729i = i;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            clearFocus();
            this.f2736p.setBitmap((Bitmap) null);
            this.f2735o = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2735o.eraseColor(0);
        this.f2736p.drawColor(this.f2724d.getColor());
        if (!this.f2731k) {
            switch (this.f2733m) {
                case 0:
                    this.f2736p.drawRoundRect(this.f2721a, (float) this.f2732l, (float) this.f2732l, this.f2734n);
                    break;
                case 1:
                    this.f2736p.drawCircle(this.f2721a.centerX(), this.f2721a.centerY(), this.f2721a.width() / 2.0f, this.f2734n);
                    break;
                default:
                    this.f2736p.drawRoundRect(this.f2721a, (float) this.f2732l, (float) this.f2732l, this.f2734n);
                    break;
            }
            canvas.drawBitmap(this.f2735o, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0761a aVar;
        int childCount = getChildCount();
        float f = getResources().getDisplayMetrics().density;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt == null || (aVar = (C0761a) childAt.getLayoutParams()) == null)) {
                switch (aVar.f2739a) {
                    case 1:
                        this.f2723c.right = this.f2721a.left;
                        this.f2723c.left = this.f2723c.right - ((float) childAt.getMeasuredWidth());
                        m3595b(childAt, this.f2723c, aVar.f2740b);
                        break;
                    case 2:
                        this.f2723c.bottom = this.f2721a.top - this.f2721a.height();
                        this.f2723c.top = this.f2723c.bottom - ((float) childAt.getMeasuredHeight());
                        m3593a(childAt, this.f2723c, aVar.f2740b);
                        break;
                    case 3:
                        this.f2723c.left = this.f2721a.right;
                        this.f2723c.right = this.f2723c.left + ((float) childAt.getMeasuredWidth());
                        m3595b(childAt, this.f2723c, aVar.f2740b);
                        break;
                    case 4:
                        this.f2723c.top = this.f2721a.bottom;
                        this.f2723c.bottom = this.f2723c.top + ((float) childAt.getMeasuredHeight());
                        m3593a(childAt, this.f2723c, aVar.f2740b);
                        break;
                    case 5:
                        this.f2723c.left = (float) ((((int) this.f2721a.width()) - childAt.getMeasuredWidth()) >> 1);
                        this.f2723c.top = (float) ((((int) this.f2721a.height()) - childAt.getMeasuredHeight()) >> 1);
                        this.f2723c.right = (float) ((((int) this.f2721a.width()) + childAt.getMeasuredWidth()) >> 1);
                        this.f2723c.bottom = (float) ((((int) this.f2721a.height()) + childAt.getMeasuredHeight()) >> 1);
                        this.f2723c.offset(this.f2721a.left, this.f2721a.top);
                        break;
                }
                this.f2723c.offset((float) ((int) ((((float) aVar.f2741c) * f) + 0.5f)), (float) ((int) ((((float) aVar.f2742d) * f) + 0.5f)));
                childAt.layout((int) this.f2723c.left, (int) this.f2723c.top, (int) this.f2723c.right, (int) this.f2723c.bottom);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (!this.f2730j) {
            this.f2722b.set(0.0f, 0.0f, (float) size, (float) size2);
            m3594b();
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                C0761a aVar = (C0761a) childAt.getLayoutParams();
                if (aVar == null) {
                    childAt.setLayoutParams(aVar);
                }
                measureChild(childAt, size - 2147483648, size2 - 2147483648);
            }
        }
    }
}
