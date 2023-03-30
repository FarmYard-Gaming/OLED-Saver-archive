package org.p024js.oledsaver.p026b.p027a;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p026b.p027a.C0669a;
import org.p024js.oledsaver.p026b.p027a.C0683e;
import org.p024js.oledsaver.p031e.C0714c;
import org.p024js.oledsaver.p031e.C0721j;

/* renamed from: org.js.oledsaver.b.a.f */
public final class C0686f implements C0669a.C0673c {

    /* renamed from: a */
    static final /* synthetic */ boolean f2493a = (!C0686f.class.desiredAssertionStatus());

    /* renamed from: A */
    private C0683e.C0685b f2494A;

    /* renamed from: B */
    private boolean f2495B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public float f2496C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f2497D;

    /* renamed from: E */
    private int f2498E = -1;

    /* renamed from: F */
    private int f2499F = -1;

    /* renamed from: G */
    private long f2500G = -1;

    /* renamed from: H */
    private boolean f2501H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C0695c f2502I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C0694b f2503J;

    /* renamed from: K */
    private long f2504K;

    /* renamed from: L */
    private long f2505L;

    /* renamed from: M */
    private boolean f2506M;

    /* renamed from: N */
    private boolean f2507N;

    /* renamed from: O */
    private boolean f2508O;

    /* renamed from: P */
    private boolean f2509P;

    /* renamed from: Q */
    private boolean f2510Q;

    /* renamed from: R */
    private boolean f2511R;

    /* renamed from: S */
    private final int f2512S;

    /* renamed from: T */
    private final int f2513T;

    /* renamed from: U */
    private final boolean f2514U;

    /* renamed from: V */
    private int f2515V = 0;

    /* renamed from: W */
    private C0669a f2516W;

    /* renamed from: X */
    private C0680d f2517X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public C0677c f2518Y;

    /* renamed from: Z */
    private int f2519Z;

    /* renamed from: aa */
    private int f2520aa;

    /* renamed from: ab */
    private int f2521ab;
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public int f2522ac;

    /* renamed from: ad */
    private int f2523ad;

    /* renamed from: ae */
    private float f2524ae;

    /* renamed from: af */
    private float f2525af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public float f2526ag;

    /* renamed from: ah */
    private final Animator.AnimatorListener f2527ah = new Animator.AnimatorListener() {
        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C0686f.this.m3389g();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    };

    /* renamed from: ai */
    private final Runnable f2528ai = new Runnable() {
        public void run() {
            C0686f.this.m3389g();
        }
    };

    /* renamed from: aj */
    private final Runnable f2529aj = new Runnable() {
        public void run() {
            C0686f.this.f2537e.mo3297a();
            C0686f.this.f2537e.mo3301e();
        }
    };

    /* renamed from: ak */
    private final Runnable f2530ak = new Runnable() {
        public void run() {
            C0686f.this.f2537e.mo3298b();
            C0686f.this.f2537e.mo3301e();
        }
    };

    /* renamed from: al */
    private final Runnable f2531al = new Runnable() {
        public void run() {
            C0686f.this.f2537e.mo3299c();
            C0686f.this.f2537e.mo3301e();
        }
    };

    /* renamed from: am */
    private final SensorEventListener f2532am = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            boolean z = false;
            if (C0686f.this.f2497D) {
                long uptimeMillis = SystemClock.uptimeMillis();
                float f = sensorEvent.values[0];
                if (f >= 0.0f && f < C0686f.this.f2496C) {
                    z = true;
                }
                C0686f.this.m3373a(uptimeMillis, z);
            }
        }
    };

    /* renamed from: an */
    private C0676b f2533an;

    /* renamed from: b */
    private final Object f2534b = new Object();

    /* renamed from: c */
    private final Context f2535c;

    /* renamed from: d */
    private final C0693a f2536d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0683e.C0684a f2537e;

    /* renamed from: f */
    private final SensorManager f2538f;

    /* renamed from: g */
    private final C0696d f2539g;

    /* renamed from: h */
    private Sensor f2540h;

    /* renamed from: i */
    private final int f2541i;

    /* renamed from: j */
    private final int f2542j;

    /* renamed from: k */
    private final int f2543k;

    /* renamed from: l */
    private final int f2544l;

    /* renamed from: m */
    private final int f2545m;

    /* renamed from: n */
    private final int f2546n;

    /* renamed from: o */
    private final int f2547o;

    /* renamed from: p */
    private final int f2548p;

    /* renamed from: q */
    private boolean f2549q;

    /* renamed from: r */
    private final boolean f2550r;

    /* renamed from: s */
    private boolean f2551s;

    /* renamed from: t */
    private boolean f2552t;

    /* renamed from: u */
    private boolean f2553u;

    /* renamed from: v */
    private C0683e.C0685b f2554v;

    /* renamed from: w */
    private boolean f2555w;

    /* renamed from: x */
    private boolean f2556x;

    /* renamed from: y */
    private boolean f2557y;

    /* renamed from: z */
    private boolean f2558z;

    /* renamed from: org.js.oledsaver.b.a.f$a */
    private final class C0693a extends Handler {
        public C0693a(Looper looper) {
            super(looper, (Handler.Callback) null);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    C0686f.this.m3395j();
                    return;
                case 2:
                    C0686f.this.m3398m();
                    return;
                case 3:
                    if (C0686f.this.f2502I == message.obj) {
                        C0686f.this.m3396k();
                        C0686f.this.m3395j();
                        return;
                    }
                    return;
                case 4:
                    if (C0686f.this.f2503J == message.obj) {
                        C0686f.this.m3397l();
                        C0686f.this.m3395j();
                        return;
                    }
                    return;
                case 5:
                    C0677c unused = C0686f.this.f2518Y = (C0677c) message.obj;
                    C0686f.this.m3395j();
                    return;
                case 6:
                    int unused2 = C0686f.this.f2522ac = message.arg1;
                    C0686f.this.m3395j();
                    return;
                case 7:
                    float unused3 = C0686f.this.f2526ag = Float.intBitsToFloat(message.arg1);
                    C0686f.this.m3395j();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: org.js.oledsaver.b.a.f$b */
    private final class C0694b {
    }

    /* renamed from: org.js.oledsaver.b.a.f$c */
    private final class C0695c {
    }

    /* renamed from: org.js.oledsaver.b.a.f$d */
    private final class C0696d extends ContentObserver {
        public C0696d(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z, Uri uri) {
            C0686f.this.m3381b(false);
        }
    }

    public C0686f(Context context, C0683e.C0684a aVar, Handler handler, SensorManager sensorManager, C0676b bVar) {
        this.f2533an = bVar;
        this.f2536d = new C0693a(handler.getLooper());
        this.f2539g = new C0696d(this.f2536d);
        this.f2537e = aVar;
        this.f2538f = sensorManager;
        this.f2535c = context;
        Resources resources = context.getResources();
        int d = m3384d(resources.getInteger(R.integer.config_screenBrightnessSettingMinimum));
        this.f2541i = m3384d(resources.getInteger(R.integer.config_screenBrightnessDoze));
        this.f2542j = m3384d(resources.getInteger(R.integer.config_screenBrightnessDim));
        this.f2543k = Math.min(d, this.f2542j);
        this.f2544l = m3384d(resources.getInteger(R.integer.config_screenBrightnessSettingMaximum));
        this.f2545m = m3384d(resources.getInteger(R.integer.config_screenBrightnessSettingDefault));
        this.f2546n = m3384d(resources.getInteger(R.integer.config_screenBrightnessForVrSettingMinimum));
        this.f2547o = m3384d(resources.getInteger(R.integer.config_screenBrightnessForVrSettingMaximum));
        this.f2548p = m3384d(resources.getInteger(R.integer.config_screenBrightnessForVrSettingDefault));
        this.f2549q = resources.getBoolean(R.bool.config_automatic_brightness_available);
        this.f2550r = resources.getBoolean(R.bool.config_allowAutoBrightnessWhileDozing);
        this.f2512S = resources.getInteger(R.integer.config_brightness_ramp_rate_fast);
        this.f2513T = resources.getInteger(R.integer.config_brightness_ramp_rate_slow);
        this.f2514U = resources.getBoolean(R.bool.config_skipScreenOnBrightnessRamp);
        if (this.f2549q) {
            float fraction = resources.getFraction(R.fraction.config_screenAutoBrightnessDozeScaleFactor, 1, 1);
            C0697g gVar = new C0697g(resources.getIntArray(R.array.config_dynamicHysteresisBrightLevels), resources.getIntArray(R.array.config_dynamicHysteresisDarkLevels), resources.getIntArray(R.array.config_dynamicHysteresisLuxLevels));
            long integer = (long) resources.getInteger(R.integer.config_autoBrightnessBrighteningLightDebounce);
            long integer2 = (long) resources.getInteger(R.integer.config_autoBrightnessDarkeningLightDebounce);
            boolean z = resources.getBoolean(R.bool.config_autoBrightnessResetAmbientLuxAfterWarmUp);
            int integer3 = resources.getInteger(R.integer.config_lightSensorWarmupTime);
            int integer4 = resources.getInteger(R.integer.config_autoBrightnessLightSensorRate);
            int integer5 = resources.getInteger(R.integer.config_autoBrightnessInitialLightSensorRate);
            if (integer5 == -1) {
                integer5 = integer4;
            } else if (integer5 > integer4) {
                C0721j.m3495d("DisplayPowerController", "Expected config_autoBrightnessInitialLightSensorRate (" + integer5 + ") to be less than or equal to config_autoBrightnessLightSensorRate (" + integer4 + ").");
            }
            this.f2517X = C0680d.m3319a(resources);
            if (this.f2517X != null) {
                this.f2516W = new C0669a(this, handler.getLooper(), sensorManager, this.f2517X, integer3, this.f2543k, this.f2544l, fraction, integer4, integer5, integer, integer2, z, gVar);
            } else {
                this.f2549q = false;
            }
        }
        this.f2551s = resources.getBoolean(R.bool.config_animateScreenLights);
        this.f2552t = resources.getBoolean(R.bool.config_displayBlanksAfterDoze);
        this.f2553u = resources.getBoolean(R.bool.config_displayBrightnessBucketsInDoze);
        this.f2540h = this.f2538f.getDefaultSensor(8);
        if (this.f2540h != null) {
            this.f2496C = Math.min(this.f2540h.getMaximumRange(), 5.0f);
        }
        this.f2521ab = m3401p();
        this.f2523ad = m3402q();
        this.f2524ae = m3400o();
        this.f2522ac = -1;
        this.f2520aa = -1;
        this.f2526ag = Float.NaN;
        this.f2525af = Float.NaN;
    }

    /* renamed from: a */
    private void m3371a(float f) {
        this.f2524ae = f;
        this.f2533an.mo3278a(f);
    }

    /* renamed from: a */
    private void m3372a(long j) {
        if (this.f2500G < 0) {
            this.f2537e.mo3300d();
        }
        this.f2500G = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3373a(long j, boolean z) {
        if (!this.f2497D) {
            return;
        }
        if (this.f2499F == 0 && !z) {
            return;
        }
        if (this.f2499F != 1 || !z) {
            this.f2536d.removeMessages(2);
            if (z) {
                this.f2499F = 1;
                m3372a(0 + j);
            } else {
                this.f2499F = 0;
                m3372a(250 + j);
            }
            m3398m();
        }
    }

    /* renamed from: a */
    private void m3377a(boolean z) {
        if (z) {
            if (!this.f2497D) {
                this.f2497D = true;
                this.f2538f.registerListener(this.f2532am, this.f2540h, 3, this.f2536d);
            }
        } else if (this.f2497D) {
            this.f2497D = false;
            this.f2498E = -1;
            this.f2499F = -1;
            this.f2536d.removeMessages(2);
            this.f2538f.unregisterListener(this.f2532am);
            m3399n();
        }
    }

    /* renamed from: b */
    private static float m3378b(float f) {
        return C0714c.m3466a(f, -1.0f, 1.0f);
    }

    /* renamed from: b */
    private int m3379b(int i) {
        return C0714c.m3467a(i, this.f2543k, this.f2544l);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3381b(boolean z) {
        this.f2520aa = m3401p();
        if (z) {
            this.f2521ab = this.f2520aa;
            if (this.f2516W != null) {
                this.f2516W.mo3420d();
            }
        }
        this.f2525af = m3400o();
        this.f2523ad = m3402q();
        m3389g();
    }

    /* renamed from: c */
    private void m3382c(int i) {
        this.f2521ab = i;
        this.f2533an.mo3279a(i);
    }

    /* renamed from: d */
    private static int m3384d(int i) {
        return C0714c.m3467a(i, 0, 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m3389g() {
        synchronized (this.f2534b) {
            m3390h();
        }
    }

    /* renamed from: h */
    private void m3390h() {
        if (!this.f2558z) {
            this.f2558z = true;
            this.f2536d.sendMessage(this.f2536d.obtainMessage(1));
        }
    }

    /* renamed from: i */
    private void m3392i() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0140, code lost:
        if (r5 == r1) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0142, code lost:
        m3371a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0145, code lost:
        if (r0 >= 0) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0147, code lost:
        r0 = m3379b(r12.f2521ab);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0151, code lost:
        if (r12.f2494A.f2481a != 2) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0155, code lost:
        if (r0 <= r12.f2543k) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0157, code lost:
        r0 = java.lang.Math.max(java.lang.Math.min(r0 - 10, r12.f2542j), r12.f2543k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0167, code lost:
        if (r12.f2507N != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0169, code lost:
        r12.f2507N = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x016f, code lost:
        if (r12.f2494A.f2487g == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0173, code lost:
        if (r0 <= r12.f2543k) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0175, code lost:
        java.lang.Math.max((int) (((float) r0) * java.lang.Math.min(r12.f2494A.f2488h, 1.0f)), r12.f2543k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0189, code lost:
        if (r12.f2508O != false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x018b, code lost:
        r12.f2508O = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0191, code lost:
        if (r12.f2495B == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0195, code lost:
        if (r12.f2501H == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0199, code lost:
        if (r12.f2498E != 1) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x019b, code lost:
        if (r0 == 1) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x019d, code lost:
        m3377a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01a2, code lost:
        m3377a(false);
        r12.f2495B = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01a9, code lost:
        r12.f2495B = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ad, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01b0, code lost:
        r12.f2509P = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01b4, code lost:
        r5 = r12.f2524ae;
        r12.f2510Q = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ba, code lost:
        r12.f2511R = false;
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01bf, code lost:
        r12.f2506M = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01c3, code lost:
        r12.f2506M = false;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01ca, code lost:
        if (r12.f2507N == false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01cc, code lost:
        r12.f2507N = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01d1, code lost:
        if (r12.f2508O == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01d3, code lost:
        r12.f2508O = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01d7, code lost:
        r1 = r5;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01db, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01de, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01e1, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        m3392i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        switch(r12.f2494A.f2481a) {
            case 0: goto L_0x0068;
            case 1: goto L_0x006b;
            case 2: goto L_0x003a;
            case 3: goto L_0x003a;
            case 4: goto L_0x0080;
            default: goto L_0x003a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r1 = -1;
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (f2493a != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r0 != 0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        r1 = -1;
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        if (r12.f2494A.f2492l == 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        r0 = r12.f2494A.f2492l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        if (r12.f2550r != false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0079, code lost:
        r1 = r12.f2494A.f2491k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        r1 = -1;
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r12.f2540h == null) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        if (r12.f2494A.f2482b == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008d, code lost:
        if (r0 == 1) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008f, code lost:
        m3377a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0094, code lost:
        if (r12.f2501H != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0098, code lost:
        if (r12.f2498E != 1) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009a, code lost:
        r12.f2501H = true;
        m3405t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a1, code lost:
        if (r12.f2501H == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a5, code lost:
        if (r12.f2498E == 1) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a7, code lost:
        r12.f2501H = false;
        m3406u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ae, code lost:
        if (r12.f2501H == false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b0, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b1, code lost:
        if (r4 != 1) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b3, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b4, code lost:
        if (r4 != 5) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b6, code lost:
        r0 = r12.f2523ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b8, code lost:
        r1 = r12.f2550r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00be, code lost:
        if (r12.f2494A.f2486f == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c0, code lost:
        if (r4 == 2) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c2, code lost:
        if (r1 == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c4, code lost:
        if (r0 >= 0) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c8, code lost:
        if (r12.f2516W == null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ca, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cb, code lost:
        r4 = m3404s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00cf, code lost:
        if (r4 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d1, code lost:
        r12.f2522ac = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d5, code lost:
        if (r12.f2522ac <= 0) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d7, code lost:
        r0 = r12.f2522ac;
        r12.f2509P = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00db, code lost:
        r6 = m3403r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00df, code lost:
        if (r6 == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e1, code lost:
        r12.f2526ag = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00eb, code lost:
        if (java.lang.Float.isNaN(r12.f2526ag) != false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00ed, code lost:
        r5 = r12.f2526ag;
        r12.f2510Q = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00f5, code lost:
        if (r12.f2494A.f2489i == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00f7, code lost:
        if (r0 == 0) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00f9, code lost:
        r11 = 255;
        r12.f2511R = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00fd, code lost:
        if (r11 >= 0) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00ff, code lost:
        if (r6 != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0101, code lost:
        if (r4 == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0105, code lost:
        if (r12.f2516W == null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0107, code lost:
        r12.f2516W.mo3419c();
        r12.f2516W.mo3416a(r1, r12.f2518Y, ((float) r12.f2519Z) / 255.0f, r4, r5, r6, r12.f2494A.f2481a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x011d, code lost:
        if (r11 >= 0) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x011f, code lost:
        if (r1 == false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0121, code lost:
        r0 = r12.f2516W.mo3415a();
        r1 = r12.f2516W.mo3418b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x012d, code lost:
        if (r0 < 0) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x012f, code lost:
        r0 = m3379b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0135, code lost:
        if (r12.f2506M == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0137, code lost:
        if (r6 != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0139, code lost:
        m3382c(r0);
        r12.f2506M = true;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3395j() {
        /*
            r12 = this;
            r3 = 5
            r2 = -1
            r9 = 2
            r8 = 1
            r10 = 0
            java.lang.Object r1 = r12.f2534b
            monitor-enter(r1)
            r0 = 0
            r12.f2558z = r0     // Catch:{ all -> 0x0065 }
            org.js.oledsaver.b.a.e$b r0 = r12.f2554v     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)     // Catch:{ all -> 0x0065 }
        L_0x0010:
            return
        L_0x0011:
            org.js.oledsaver.b.a.e$b r0 = r12.f2494A     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0048
            org.js.oledsaver.b.a.e$b r0 = new org.js.oledsaver.b.a.e$b     // Catch:{ all -> 0x0065 }
            org.js.oledsaver.b.a.e$b r4 = r12.f2554v     // Catch:{ all -> 0x0065 }
            r0.<init>(r4)     // Catch:{ all -> 0x0065 }
            r12.f2494A = r0     // Catch:{ all -> 0x0065 }
            boolean r0 = r12.f2555w     // Catch:{ all -> 0x0065 }
            r12.f2495B = r0     // Catch:{ all -> 0x0065 }
            r0 = 0
            r12.f2555w = r0     // Catch:{ all -> 0x0065 }
            r0 = 0
            r12.f2556x = r0     // Catch:{ all -> 0x0065 }
            r0 = r8
        L_0x0029:
            boolean r4 = r12.f2557y     // Catch:{ all -> 0x0065 }
            if (r4 != 0) goto L_0x002d
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0033
            r12.m3392i()
        L_0x0033:
            org.js.oledsaver.b.a.e$b r0 = r12.f2494A
            int r0 = r0.f2481a
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x006b;
                case 2: goto L_0x003a;
                case 3: goto L_0x003a;
                case 4: goto L_0x0080;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = r2
            r0 = r9
        L_0x003c:
            boolean r4 = f2493a
            if (r4 != 0) goto L_0x0083
            if (r0 != 0) goto L_0x0083
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0048:
            boolean r0 = r12.f2556x     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0063
            org.js.oledsaver.b.a.e$b r0 = r12.f2494A     // Catch:{ all -> 0x0065 }
            org.js.oledsaver.b.a.e$b r4 = r12.f2554v     // Catch:{ all -> 0x0065 }
            r0.mo3458a((org.p024js.oledsaver.p026b.p027a.C0683e.C0685b) r4)     // Catch:{ all -> 0x0065 }
            boolean r0 = r12.f2495B     // Catch:{ all -> 0x0065 }
            boolean r4 = r12.f2555w     // Catch:{ all -> 0x0065 }
            r0 = r0 | r4
            r12.f2495B = r0     // Catch:{ all -> 0x0065 }
            r0 = 0
            r12.f2555w = r0     // Catch:{ all -> 0x0065 }
            r0 = 0
            r12.f2556x = r0     // Catch:{ all -> 0x0065 }
            r0 = 0
            r12.f2557y = r0     // Catch:{ all -> 0x0065 }
        L_0x0063:
            r0 = r10
            goto L_0x0029
        L_0x0065:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0065 }
            throw r0
        L_0x0068:
            r1 = r2
            r0 = r8
            goto L_0x003c
        L_0x006b:
            org.js.oledsaver.b.a.e$b r0 = r12.f2494A
            int r0 = r0.f2492l
            if (r0 == 0) goto L_0x007e
            org.js.oledsaver.b.a.e$b r0 = r12.f2494A
            int r0 = r0.f2492l
        L_0x0075:
            boolean r1 = r12.f2550r
            if (r1 != 0) goto L_0x01e1
            org.js.oledsaver.b.a.e$b r1 = r12.f2494A
            int r1 = r1.f2491k
            goto L_0x003c
        L_0x007e:
            r0 = 3
            goto L_0x0075
        L_0x0080:
            r1 = r2
            r0 = r3
            goto L_0x003c
        L_0x0083:
            android.hardware.Sensor r4 = r12.f2540h
            if (r4 == 0) goto L_0x01a9
            org.js.oledsaver.b.a.e$b r4 = r12.f2494A
            boolean r4 = r4.f2482b
            if (r4 == 0) goto L_0x018f
            if (r0 == r8) goto L_0x018f
            r12.m3377a((boolean) r8)
            boolean r4 = r12.f2501H
            if (r4 != 0) goto L_0x009f
            int r4 = r12.f2498E
            if (r4 != r8) goto L_0x009f
            r12.f2501H = r8
            r12.m3405t()
        L_0x009f:
            boolean r4 = r12.f2501H
            if (r4 == 0) goto L_0x00ac
            int r4 = r12.f2498E
            if (r4 == r8) goto L_0x00ac
            r12.f2501H = r10
            r12.m3406u()
        L_0x00ac:
            boolean r4 = r12.f2501H
            if (r4 == 0) goto L_0x01de
            r4 = r8
        L_0x00b1:
            if (r4 != r8) goto L_0x01db
            r0 = r10
        L_0x00b4:
            if (r4 != r3) goto L_0x00b8
            int r0 = r12.f2523ad
        L_0x00b8:
            boolean r1 = r12.f2550r
            org.js.oledsaver.b.a.e$b r3 = r12.f2494A
            boolean r3 = r3.f2486f
            if (r3 == 0) goto L_0x01ad
            if (r4 == r9) goto L_0x00c4
            if (r1 == 0) goto L_0x01ad
        L_0x00c4:
            if (r0 >= 0) goto L_0x01ad
            org.js.oledsaver.b.a.a r1 = r12.f2516W
            if (r1 == 0) goto L_0x01ad
            r1 = r8
        L_0x00cb:
            boolean r4 = r12.m3404s()
            if (r4 == 0) goto L_0x00d3
            r12.f2522ac = r2
        L_0x00d3:
            int r2 = r12.f2522ac
            if (r2 <= 0) goto L_0x01b0
            int r0 = r12.f2522ac
            r12.f2509P = r8
        L_0x00db:
            boolean r6 = r12.m3403r()
            if (r6 == 0) goto L_0x00e5
            r2 = 2143289344(0x7fc00000, float:NaN)
            r12.f2526ag = r2
        L_0x00e5:
            float r2 = r12.f2526ag
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L_0x01b4
            float r5 = r12.f2526ag
            r12.f2510Q = r8
        L_0x00f1:
            org.js.oledsaver.b.a.e$b r2 = r12.f2494A
            boolean r2 = r2.f2489i
            if (r2 == 0) goto L_0x01ba
            if (r0 == 0) goto L_0x01ba
            r11 = 255(0xff, float:3.57E-43)
            r12.f2511R = r8
        L_0x00fd:
            if (r11 >= 0) goto L_0x0103
            if (r6 != 0) goto L_0x0103
            if (r4 == 0) goto L_0x0103
        L_0x0103:
            org.js.oledsaver.b.a.a r0 = r12.f2516W
            if (r0 == 0) goto L_0x011d
            org.js.oledsaver.b.a.a r0 = r12.f2516W
            r0.mo3419c()
            org.js.oledsaver.b.a.a r0 = r12.f2516W
            org.js.oledsaver.b.a.c r2 = r12.f2518Y
            int r3 = r12.f2519Z
            float r3 = (float) r3
            r7 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r7
            org.js.oledsaver.b.a.e$b r7 = r12.f2494A
            int r7 = r7.f2481a
            r0.mo3416a(r1, r2, r3, r4, r5, r6, r7)
        L_0x011d:
            if (r11 >= 0) goto L_0x01c3
            if (r1 == 0) goto L_0x01d7
            org.js.oledsaver.b.a.a r0 = r12.f2516W
            int r0 = r0.mo3415a()
            org.js.oledsaver.b.a.a r1 = r12.f2516W
            float r1 = r1.mo3418b()
        L_0x012d:
            if (r0 < 0) goto L_0x01bf
            int r0 = r12.m3379b((int) r0)
            boolean r2 = r12.f2506M
            if (r2 == 0) goto L_0x0139
            if (r6 != 0) goto L_0x0139
        L_0x0139:
            r12.m3382c((int) r0)
            r12.f2506M = r8
        L_0x013e:
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0145
            r12.m3371a((float) r1)
        L_0x0145:
            if (r0 >= 0) goto L_0x014d
            int r0 = r12.f2521ab
            int r0 = r12.m3379b((int) r0)
        L_0x014d:
            org.js.oledsaver.b.a.e$b r1 = r12.f2494A
            int r1 = r1.f2481a
            if (r1 != r9) goto L_0x01c8
            int r1 = r12.f2543k
            if (r0 <= r1) goto L_0x0165
            int r0 = r0 + -10
            int r1 = r12.f2542j
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r12.f2543k
            int r0 = java.lang.Math.max(r0, r1)
        L_0x0165:
            boolean r1 = r12.f2507N
            if (r1 != 0) goto L_0x0169
        L_0x0169:
            r12.f2507N = r8
        L_0x016b:
            org.js.oledsaver.b.a.e$b r1 = r12.f2494A
            boolean r1 = r1.f2487g
            if (r1 == 0) goto L_0x01cf
            int r1 = r12.f2543k
            if (r0 <= r1) goto L_0x0187
            org.js.oledsaver.b.a.e$b r1 = r12.f2494A
            float r1 = r1.f2488h
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r1, r2)
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r12.f2543k
            java.lang.Math.max(r0, r1)
        L_0x0187:
            boolean r0 = r12.f2508O
            if (r0 != 0) goto L_0x018b
        L_0x018b:
            r12.f2508O = r8
            goto L_0x0010
        L_0x018f:
            boolean r4 = r12.f2495B
            if (r4 == 0) goto L_0x01a2
            boolean r4 = r12.f2501H
            if (r4 == 0) goto L_0x01a2
            int r4 = r12.f2498E
            if (r4 != r8) goto L_0x01a2
            if (r0 == r8) goto L_0x01a2
            r12.m3377a((boolean) r8)
            goto L_0x009f
        L_0x01a2:
            r12.m3377a((boolean) r10)
            r12.f2495B = r10
            goto L_0x009f
        L_0x01a9:
            r12.f2495B = r10
            goto L_0x00ac
        L_0x01ad:
            r1 = r10
            goto L_0x00cb
        L_0x01b0:
            r12.f2509P = r10
            goto L_0x00db
        L_0x01b4:
            float r5 = r12.f2524ae
            r12.f2510Q = r10
            goto L_0x00f1
        L_0x01ba:
            r12.f2511R = r10
            r11 = r0
            goto L_0x00fd
        L_0x01bf:
            r12.f2506M = r10
            goto L_0x013e
        L_0x01c3:
            r12.f2506M = r10
            r0 = r11
            goto L_0x0145
        L_0x01c8:
            boolean r1 = r12.f2507N
            if (r1 == 0) goto L_0x016b
            r12.f2507N = r10
            goto L_0x016b
        L_0x01cf:
            boolean r0 = r12.f2508O
            if (r0 == 0) goto L_0x0010
            r12.f2508O = r10
            goto L_0x0010
        L_0x01d7:
            r1 = r5
            r0 = r11
            goto L_0x012d
        L_0x01db:
            r0 = r1
            goto L_0x00b4
        L_0x01de:
            r4 = r0
            goto L_0x00b1
        L_0x01e1:
            r1 = r2
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p024js.oledsaver.p026b.p027a.C0686f.m3395j():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m3396k() {
        if (this.f2502I != null) {
            this.f2502I = null;
            C0721j.m3493b("DisplayPowerController", "Unblocked screen on after " + (SystemClock.elapsedRealtime() - this.f2504K) + " ms");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m3397l() {
        if (this.f2503J != null) {
            this.f2503J = null;
            C0721j.m3493b("DisplayPowerController", "Unblocked screen off after " + (SystemClock.elapsedRealtime() - this.f2505L) + " ms");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m3398m() {
        if (this.f2497D && this.f2499F != -1 && this.f2500G >= 0) {
            if (this.f2500G <= SystemClock.uptimeMillis()) {
                this.f2498E = this.f2499F;
                m3395j();
                m3399n();
                return;
            }
            this.f2536d.sendMessageAtTime(this.f2536d.obtainMessage(2), this.f2500G);
        }
    }

    /* renamed from: n */
    private void m3399n() {
        if (this.f2500G >= 0) {
            this.f2500G = -1;
            this.f2537e.mo3301e();
        }
    }

    /* renamed from: o */
    private float m3400o() {
        float h = this.f2533an.mo3287h();
        if (Float.isNaN(h)) {
            return 0.0f;
        }
        return m3378b(h);
    }

    /* renamed from: p */
    private int m3401p() {
        return m3384d(this.f2533an.mo3286g());
    }

    /* renamed from: q */
    private int m3402q() {
        return 127;
    }

    /* renamed from: r */
    private boolean m3403r() {
        if (Float.isNaN(this.f2525af)) {
            return false;
        }
        if (this.f2524ae == this.f2525af) {
            this.f2525af = Float.NaN;
            return false;
        }
        this.f2524ae = this.f2525af;
        this.f2525af = Float.NaN;
        return true;
    }

    /* renamed from: s */
    private boolean m3404s() {
        if (this.f2520aa < 0) {
            return false;
        }
        if (this.f2521ab == this.f2520aa) {
            this.f2520aa = -1;
            return false;
        }
        this.f2521ab = this.f2520aa;
        this.f2519Z = this.f2520aa;
        this.f2520aa = -1;
        return true;
    }

    /* renamed from: t */
    private void m3405t() {
        this.f2537e.mo3300d();
        this.f2536d.post(this.f2530ak);
    }

    /* renamed from: u */
    private void m3406u() {
        this.f2537e.mo3300d();
        this.f2536d.post(this.f2531al);
    }

    /* renamed from: a */
    public void mo3435a() {
        m3389g();
    }

    /* renamed from: a */
    public void mo3463a(float f, float f2) {
        this.f2517X.mo3451a(f, f2);
    }

    /* renamed from: a */
    public void mo3464a(int i) {
        this.f2536d.obtainMessage(6, i, 0).sendToTarget();
    }

    /* renamed from: a */
    public boolean mo3465a(C0683e.C0685b bVar, boolean z) {
        boolean z2;
        boolean z3 = false;
        boolean z4 = true;
        synchronized (this.f2534b) {
            if (z) {
                if (!this.f2555w) {
                    this.f2555w = true;
                    z3 = true;
                }
            }
            if (this.f2554v == null) {
                this.f2554v = new C0683e.C0685b(bVar);
            } else if (!this.f2554v.mo3459b(bVar)) {
                this.f2554v.mo3458a(bVar);
            } else {
                z4 = z3;
            }
            if (z4) {
                this.f2557y = false;
            }
            if (z4 && !this.f2556x) {
                this.f2556x = true;
                m3390h();
            }
            z2 = this.f2557y;
        }
        return z2;
    }

    /* renamed from: b */
    public void mo3466b() {
        m3381b(false);
    }

    /* renamed from: c */
    public float mo3467c() {
        return this.f2516W.mo3421e();
    }

    /* renamed from: d */
    public int mo3468d() {
        return this.f2516W.mo3422f();
    }

    /* renamed from: e */
    public float mo3469e() {
        return this.f2516W.mo3423g();
    }

    /* renamed from: f */
    public float mo3470f() {
        return this.f2516W.mo3424h();
    }
}
