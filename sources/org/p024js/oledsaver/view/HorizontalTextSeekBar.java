package org.p024js.oledsaver.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.p024js.oledsaver.R;

/* renamed from: org.js.oledsaver.view.HorizontalTextSeekBar */
public class HorizontalTextSeekBar extends FrameLayout {

    /* renamed from: a */
    private View f2659a;

    /* renamed from: b */
    private View f2660b;

    /* renamed from: c */
    private View f2661c;

    /* renamed from: d */
    private FrameLayout f2662d;

    /* renamed from: e */
    private TextView f2663e;

    /* renamed from: f */
    private int f2664f = 0;

    /* renamed from: g */
    private int f2665g = 0;

    /* renamed from: h */
    private int f2666h = 100;

    /* renamed from: i */
    private boolean f2667i = false;

    /* renamed from: j */
    private C0745a f2668j;

    /* renamed from: k */
    private int f2669k = 6;

    /* renamed from: l */
    private int f2670l = 20;

    /* renamed from: m */
    private int f2671m = 120;

    /* renamed from: org.js.oledsaver.view.HorizontalTextSeekBar$a */
    public interface C0745a {
        /* renamed from: a */
        void mo3561a(HorizontalTextSeekBar horizontalTextSeekBar);

        /* renamed from: a */
        void mo3562a(HorizontalTextSeekBar horizontalTextSeekBar, int i, boolean z);

        /* renamed from: b */
        void mo3563b(HorizontalTextSeekBar horizontalTextSeekBar);
    }

    public HorizontalTextSeekBar(Context context) {
        super(context);
        m3549a(context);
    }

    public HorizontalTextSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3549a(context);
    }

    public HorizontalTextSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3549a(context);
    }

    /* renamed from: a */
    private void m3547a() {
        int paddingLeft = getPaddingLeft();
        int width = (getWidth() - paddingLeft) - getPaddingRight();
        if (width > 0 && this.f2666h > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2661c.getLayoutParams();
            layoutParams.width = (width * this.f2665g) / this.f2666h;
            this.f2661c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private void m3548a(int i, boolean z) {
        if (i < 0) {
            i = 0;
        }
        if (i > this.f2666h) {
            i = this.f2666h;
        }
        if (this.f2664f != i) {
            this.f2664f = i;
            m3550a(z);
        }
        this.f2663e.setText(i + "");
    }

    /* renamed from: a */
    private void m3549a(Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f2669k);
        layoutParams.gravity = 16;
        this.f2660b = new View(context);
        addView(this.f2660b, layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-4342339);
        gradientDrawable.setCornerRadius((float) this.f2670l);
        this.f2660b.setBackgroundDrawable(gradientDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, this.f2669k);
        layoutParams2.gravity = 16;
        this.f2661c = new View(context);
        addView(this.f2661c, layoutParams2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-42663);
        gradientDrawable2.setCornerRadius((float) this.f2670l);
        this.f2661c.setBackgroundDrawable(gradientDrawable2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, this.f2669k);
        layoutParams3.gravity = 16;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(getResources().getColor(R.color.colorAccent));
        gradientDrawable3.setCornerRadius((float) this.f2670l);
        this.f2659a = new View(context);
        this.f2659a.setBackgroundDrawable(gradientDrawable3);
        addView(this.f2659a, layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(this.f2671m, this.f2671m);
        layoutParams4.gravity = 16;
        this.f2662d = new FrameLayout(context);
        addView(this.f2662d, layoutParams4);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(-2236963);
        gradientDrawable4.setShape(1);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.f2663e = new TextView(context);
        this.f2663e.setGravity(17);
        this.f2663e.setTextSize(12.0f);
        this.f2663e.setIncludeFontPadding(false);
        this.f2663e.setText("0");
        this.f2663e.setTextColor(-10066330);
        this.f2662d.addView(this.f2663e, layoutParams5);
        this.f2662d.setBackgroundDrawable(gradientDrawable4);
        setClickable(true);
    }

    /* renamed from: a */
    private void m3550a(boolean z) {
        int paddingLeft = getPaddingLeft();
        int width = (getWidth() - paddingLeft) - getPaddingRight();
        if (width > 0 && this.f2666h > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2659a.getLayoutParams();
            layoutParams.width = (this.f2664f * width) / this.f2666h;
            this.f2659a.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f2662d.getLayoutParams();
            layoutParams2.leftMargin = ((width - layoutParams2.width) * this.f2664f) / this.f2666h;
            this.f2662d.setLayoutParams(layoutParams2);
        }
        if (this.f2668j != null) {
            this.f2668j.mo3562a(this, this.f2664f, z);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int paddingLeft = getPaddingLeft();
        int width = (getWidth() - paddingLeft) - getPaddingRight();
        if (x < paddingLeft) {
            x = paddingLeft;
        }
        if (x > width + paddingLeft) {
            x = width + paddingLeft;
        }
        int i = x - paddingLeft;
        if (action == 0) {
            int i2 = (i * this.f2666h) / width;
            if (i2 != this.f2664f) {
                if (!this.f2667i) {
                    this.f2667i = true;
                    if (this.f2668j != null) {
                        this.f2668j.mo3561a(this);
                    }
                }
                m3548a(i2, true);
            }
        } else if (action == 2) {
            int i3 = (i * this.f2666h) / width;
            if (i3 != this.f2664f) {
                if (!this.f2667i) {
                    this.f2667i = true;
                    if (this.f2668j != null) {
                        this.f2668j.mo3561a(this);
                    }
                }
                m3548a(i3, true);
            }
        } else if (action == 1 || action == 3) {
            this.f2667i = false;
            if (this.f2668j != null) {
                this.f2668j.mo3563b(this);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getMax() {
        return this.f2666h;
    }

    public int getProgress() {
        return this.f2664f;
    }

    public String getText() {
        return this.f2663e.getText().toString();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m3550a(false);
    }

    public void setMax(int i) {
        this.f2666h = i;
    }

    public void setOnSeekBarChangeListener(C0745a aVar) {
        this.f2668j = aVar;
    }

    public void setProgress(int i) {
        m3548a(i, false);
    }

    public void setProgressBackground(Drawable drawable) {
        this.f2660b.setBackgroundDrawable(drawable);
    }

    public void setProgressDrawable(Drawable drawable) {
        this.f2659a.setBackgroundDrawable(drawable);
    }

    public void setProgressSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2659a.getLayoutParams();
        layoutParams.height = i;
        this.f2659a.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f2661c.getLayoutParams();
        layoutParams2.height = i;
        this.f2661c.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f2660b.getLayoutParams();
        layoutParams3.height = i;
        this.f2660b.setLayoutParams(layoutParams3);
    }

    public void setSecondaryProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > this.f2666h) {
            i = this.f2666h;
        }
        this.f2665g = i;
        m3547a();
    }

    public void setSecondaryProgressDrawable(Drawable drawable) {
        this.f2661c.setBackgroundDrawable(drawable);
    }

    public void setThumb(Drawable drawable) {
        this.f2662d.setBackgroundDrawable(drawable);
    }

    public void setmText(String str) {
        this.f2663e.setText(str);
    }
}
