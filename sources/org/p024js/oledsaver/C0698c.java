package org.p024js.oledsaver;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import org.p024js.oledsaver.p026b.p027a.C0680d;
import org.p024js.oledsaver.p029c.C0701a;
import org.p024js.oledsaver.p031e.C0712a;
import org.p024js.oledsaver.p031e.C0716e;
import org.p024js.oledsaver.p031e.C0719h;
import org.p024js.oledsaver.p031e.C0722k;
import org.p024js.oledsaver.p031e.C0725l;

/* renamed from: org.js.oledsaver.c */
public class C0698c {

    /* renamed from: d */
    private static C0698c f2570d;

    /* renamed from: a */
    Bitmap f2571a;

    /* renamed from: b */
    C0700a f2572b;

    /* renamed from: c */
    BitmapDrawable f2573c;

    /* renamed from: e */
    private Context f2574e;

    /* renamed from: f */
    private boolean f2575f = false;

    /* renamed from: g */
    private int f2576g = 0;

    /* renamed from: h */
    private int f2577h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public WindowManager f2578i;

    /* renamed from: j */
    private int f2579j;

    /* renamed from: k */
    private int f2580k;

    /* renamed from: l */
    private C0722k f2581l;

    /* renamed from: org.js.oledsaver.c$a */
    public class C0700a extends ImageView {

        /* renamed from: b */
        private int f2585b;

        public C0700a(Context context) {
            super(context);
        }

        public int getBrightness() {
            return this.f2585b;
        }

        public void setBrightness(int i) {
            this.f2585b = i;
            C0698c.this.mo3487a(this.f2585b);
            invalidate();
        }
    }

    private C0698c() {
    }

    /* renamed from: a */
    public static C0698c m3421a(Context context) {
        if (f2570d == null) {
            f2570d = new C0698c();
        }
        return f2570d;
    }

    /* renamed from: d */
    public static int m3422d() {
        int i = Build.VERSION.SDK_INT;
        return 2032;
    }

    /* renamed from: k */
    private WindowManager.LayoutParams m3423k() {
        int i;
        int i2;
        Point point = new Point();
        this.f2578i.getDefaultDisplay().getRealSize(point);
        Point point2 = new Point();
        this.f2578i.getDefaultDisplay().getSize(point2);
        point.x += point.x - point2.x;
        point.y = (point.y - point2.y) + point.y;
        if (point.x > point.y) {
            i = 0;
            i2 = 400;
        } else {
            i = 400;
            i2 = 0;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i2 + point.x, i + point.y, 0, 0, m3422d(), 16777216 | (Build.VERSION.SDK_INT >= 18 ? 33554432 : 0) | 524568 | 512, -2);
        layoutParams.buttonBrightness = 0.0f;
        layoutParams.dimAmount = -1.0f;
        layoutParams.systemUiVisibility = 1;
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3485a(float f) {
        int a = (int) this.f2581l.mo3532a(f);
        return Color.rgb(a, 0, a);
    }

    /* renamed from: a */
    public void mo3486a() {
        f2570d = null;
    }

    /* renamed from: a */
    public void mo3487a(int i) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = i + C0646a.f2332c;
        if (i5 >= this.f2579j) {
            i3 = 0;
            i2 = 0;
        } else {
            int i6 = this.f2579j;
            int i7 = this.f2579j - i5;
            int i8 = (int) (((float) (this.f2579j * C0701a.f2586a[C0646a.f2330a])) / 100.0f);
            int i9 = i7 > i8 ? i7 - i8 : 0;
            i2 = i9 > 0 ? (int) ((((float) i9) / ((float) (this.f2579j - i8))) * 255.0f) : 0;
            i3 = (int) ((((float) (this.f2579j - i5)) * 100.0f) / ((float) this.f2579j));
            if (i3 > C0701a.f2586a[C0646a.f2330a]) {
                i3 = C0701a.f2586a[C0646a.f2330a];
            }
        }
        if (i3 > 0) {
            i4 = (int) ((((float) i3) / ((float) C0701a.f2586a[C0646a.f2330a])) * 255.0f);
        }
        mo3488a(i2, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3488a(int i, int i2) {
        int i3 = -16777216;
        int a = C0712a.m3462a(i2, i2 == 255 ? -16777216 : mo3485a((float) i));
        if (i2 != 0) {
            i3 = mo3485a((float) (255 - i));
        }
        mo3489a(C0646a.f2330a, C0712a.m3462a(i, i3), a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3489a(int i, int i2, int i3) {
        int i4 = this.f2580k % 8;
        int i5 = this.f2580k / 8;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 < 64) {
                this.f2571a.setPixel((i7 + i4) % 8, ((i7 / 8) + i5) % 8, C0701a.f2587b[i][i7] == 0 ? i2 : i3);
                i6 = i7 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo3490a(int i, int i2, int i3, boolean z) {
        if (z) {
            C0719h.m3482a(this.f2574e).mo3529b(i2);
            this.f2572b.setBrightness(255);
            return;
        }
        this.f2579j = i3;
        C0719h.m3482a(this.f2574e).mo3529b(i);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f2572b, "brightness", new int[]{this.f2572b.getBrightness(), i2});
        ofInt.setDuration(200);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3491b() {
    }

    /* renamed from: b */
    public void mo3492b(Context context) {
        this.f2574e = context;
        if (this.f2578i == null) {
            this.f2578i = (WindowManager) this.f2574e.getSystemService("window");
        }
        if (this.f2581l == null) {
            this.f2581l = C0722k.m3496a(C0680d.m3323a(this.f2574e.getResources().obtainTypedArray(R.array.config_pixelFilterColorPercent)), C0680d.m3323a(this.f2574e.getResources().obtainTypedArray(R.array.config_pixelFilterColorAdjust)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3493c() {
    }

    /* renamed from: c */
    public void mo3494c(Context context) {
        this.f2575f = true;
        if (this.f2574e == null) {
            mo3492b(context);
        }
        mo3491b();
        mo3497f();
    }

    /* renamed from: d */
    public void mo3495d(Context context) {
        mo3493c();
        mo3500i();
    }

    /* renamed from: e */
    public void mo3496e() {
        mo3488a(0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3497f() {
        if (this.f2572b != null) {
            try {
                this.f2578i.removeView(this.f2572b);
            } catch (Exception e) {
            }
            this.f2572b = null;
        }
        this.f2572b = new C0700a(this.f2574e);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f2578i.getDefaultDisplay().getRealMetrics(displayMetrics);
        this.f2571a = Bitmap.createBitmap(8, 8, Bitmap.Config.ARGB_8888);
        this.f2580k = mo3499h();
        mo3489a(C0646a.f2330a, 0, 0);
        this.f2573c = new BitmapDrawable(this.f2571a);
        this.f2573c.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        this.f2573c.setFilterBitmap(false);
        this.f2573c.setAntiAlias(false);
        this.f2573c.setTargetDensity(displayMetrics.densityDpi);
        this.f2572b.setBackground(this.f2573c);
        try {
            this.f2578i.addView(this.f2572b, m3423k());
        } catch (Exception e2) {
            Exception exc = e2;
            ((MyApp) ((Service) this.f2574e).getApplication()).mo3305a(exc.getMessage());
            C0725l.m3507b(this.f2574e, this.f2574e.getString(R.string.error_msg));
            C0716e.m3472c(this.f2574e);
            exc.printStackTrace();
        }
    }

    /* renamed from: g */
    public void mo3498g() {
        this.f2580k = mo3499h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo3499h() {
        return C0701a.f2588c[(int) ((System.currentTimeMillis() / ((long) C0701a.f2589d[C0646a.f2331b])) % 64)];
    }

    /* renamed from: i */
    public void mo3500i() {
        if (this.f2572b != null) {
            this.f2572b.animate().alpha(0.0f).setDuration(200).setListener(new Animator.AnimatorListener() {

                /* renamed from: b */
                private View f2583b = C0698c.this.f2572b;

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    try {
                        C0698c.this.f2578i.removeView(this.f2583b);
                    } catch (Exception e) {
                    }
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }
            }).start();
            this.f2572b = null;
        }
    }

    /* renamed from: j */
    public void mo3501j() {
        if (this.f2572b != null && this.f2572b.getParent() != null) {
            try {
                this.f2578i.updateViewLayout(this.f2572b, m3423k());
            } catch (Exception e) {
                ((MyApp) ((Activity) this.f2574e).getApplication()).mo3305a(e.getMessage());
            }
        }
    }
}
