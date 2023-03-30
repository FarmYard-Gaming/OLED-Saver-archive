package org.p024js.oledsaver.view;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.p024js.oledsaver.C0702d;

/* renamed from: org.js.oledsaver.view.ExpandIconView */
public class ExpandIconView extends View {

    /* renamed from: a */
    private int f2637a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public float f2638b;

    /* renamed from: c */
    private float f2639c;

    /* renamed from: d */
    private float f2640d;

    /* renamed from: e */
    private float f2641e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f2642f;

    /* renamed from: g */
    private int f2643g;

    /* renamed from: h */
    private final int f2644h;

    /* renamed from: i */
    private final int f2645i;

    /* renamed from: j */
    private final int f2646j;

    /* renamed from: k */
    private final Paint f2647k;

    /* renamed from: l */
    private final Point f2648l;

    /* renamed from: m */
    private final Point f2649m;

    /* renamed from: n */
    private final Point f2650n;

    /* renamed from: o */
    private final Point f2651o;

    /* renamed from: p */
    private final Point f2652p;

    /* renamed from: q */
    private final boolean f2653q;

    /* renamed from: r */
    private int f2654r;

    /* renamed from: s */
    private final Path f2655s;

    /* renamed from: t */
    private ValueAnimator f2656t;

    public ExpandIconView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ExpandIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public ExpandIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2638b = -45.0f;
        this.f2639c = 0.0f;
        this.f2640d = 0.0f;
        this.f2642f = false;
        this.f2643g = -16777216;
        this.f2648l = new Point();
        this.f2649m = new Point();
        this.f2650n = new Point();
        this.f2651o = new Point();
        this.f2652p = new Point();
        this.f2655s = new Path();
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C0702d.C0703a.ExpandIconView, 0, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(6, false);
            this.f2642f = obtainStyledAttributes.getBoolean(7, false);
            this.f2643g = obtainStyledAttributes.getColor(1, -16777216);
            this.f2644h = obtainStyledAttributes.getColor(4, -16777216);
            this.f2645i = obtainStyledAttributes.getColor(3, -16777216);
            this.f2646j = obtainStyledAttributes.getColor(2, -1);
            long integer = (long) obtainStyledAttributes.getInteger(0, 150);
            this.f2654r = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.f2653q = this.f2654r == -1;
            obtainStyledAttributes.recycle();
            this.f2647k = new Paint(1);
            this.f2647k.setColor(this.f2643g);
            this.f2647k.setStyle(Paint.Style.STROKE);
            this.f2647k.setDither(true);
            if (z) {
                this.f2647k.setStrokeJoin(Paint.Join.ROUND);
                this.f2647k.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f2641e = 90.0f / ((float) integer);
            mo3541a(0, false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3533a() {
        this.f2655s.reset();
        if (this.f2648l != null && this.f2649m != null) {
            m3537a(this.f2648l, (double) (-this.f2638b), this.f2651o);
            m3537a(this.f2649m, (double) this.f2638b, this.f2652p);
            this.f2639c = (float) ((this.f2650n.y - this.f2651o.y) / 2);
            this.f2655s.moveTo((float) this.f2651o.x, (float) this.f2651o.y);
            this.f2655s.lineTo((float) this.f2650n.x, (float) this.f2650n.y);
            this.f2655s.lineTo((float) this.f2652p.x, (float) this.f2652p.y);
        }
    }

    /* renamed from: a */
    private void m3534a(float f) {
        m3542b();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f2638b, f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: b */
            private final ArgbEvaluator f2658b = new ArgbEvaluator();

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = ExpandIconView.this.f2638b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ExpandIconView.this.m3533a();
                if (ExpandIconView.this.f2642f) {
                    ExpandIconView.this.m3536a(this.f2658b);
                }
                ExpandIconView.this.m3544c();
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(m3541b(f));
        ofFloat.start();
        this.f2656t = ofFloat;
    }

    /* renamed from: a */
    private void m3535a(int i, int i2) {
        int i3 = i2 >= i ? i : i2;
        if (this.f2653q) {
            this.f2654r = (int) (0.16666667f * ((float) i3));
        }
        int i4 = i3 - (this.f2654r * 2);
        this.f2647k.setStrokeWidth((float) ((int) (((float) i4) * 0.1388889f)));
        this.f2650n.set(i / 2, i2 / 2);
        this.f2648l.set(this.f2650n.x - (i4 / 2), this.f2650n.y);
        this.f2649m.set((i4 / 2) + this.f2650n.x, this.f2650n.y);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3536a(ArgbEvaluator argbEvaluator) {
        int i;
        int i2;
        float f;
        if (this.f2646j != -1) {
            i = this.f2638b <= 0.0f ? this.f2644h : this.f2646j;
            i2 = this.f2638b <= 0.0f ? this.f2646j : this.f2645i;
            f = this.f2638b <= 0.0f ? 1.0f + (this.f2638b / 45.0f) : this.f2638b / 45.0f;
        } else {
            i = this.f2644h;
            i2 = this.f2645i;
            f = (this.f2638b + 45.0f) / 90.0f;
        }
        this.f2643g = ((Integer) argbEvaluator.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
        this.f2647k.setColor(this.f2643g);
    }

    /* renamed from: a */
    private void m3537a(Point point, double d, Point point2) {
        double radians = Math.toRadians(d);
        point2.set((int) ((((double) this.f2650n.x) + (((double) (point.x - this.f2650n.x)) * Math.cos(radians))) - (((double) (point.y - this.f2650n.y)) * Math.sin(radians))), (int) ((Math.cos(radians) * ((double) (point.y - this.f2650n.y))) + ((double) this.f2650n.y) + (((double) (point.x - this.f2650n.x)) * Math.sin(radians))));
    }

    /* renamed from: a */
    private void m3540a(boolean z) {
        float f = -45.0f + (this.f2640d * 90.0f);
        if (z) {
            m3534a(f);
            return;
        }
        m3542b();
        this.f2638b = f;
        if (this.f2642f) {
            m3536a(new ArgbEvaluator());
        }
        m3533a();
        invalidate();
    }

    /* renamed from: b */
    private long m3541b(float f) {
        return (long) (Math.abs(f - this.f2638b) / this.f2641e);
    }

    /* renamed from: b */
    private void m3542b() {
        if (this.f2656t != null && this.f2656t.isRunning()) {
            this.f2656t.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3544c() {
        postInvalidateOnAnimation();
    }

    private int getFinalStateByFraction() {
        return this.f2640d <= 0.5f ? 0 : 1;
    }

    /* renamed from: a */
    public void mo3541a(int i, boolean z) {
        this.f2637a = i;
        if (i == 0) {
            this.f2640d = 0.0f;
        } else if (i == 1) {
            this.f2640d = 1.0f;
        } else {
            throw new IllegalArgumentException("Unknown state, must be one of STATE_MORE = 0,  STATE_LESS = 1");
        }
        m3540a(z);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(0.0f, this.f2639c);
        canvas.drawPath(this.f2655s, this.f2647k);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m3535a(i, i2);
        m3533a();
    }

    public void setAnimationDuration(long j) {
        this.f2641e = 90.0f / ((float) j);
    }
}
