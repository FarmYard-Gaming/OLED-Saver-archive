package org.p024js.oledsaver.p026b.p027a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.p024js.oledsaver.p031e.C0714c;
import org.p024js.oledsaver.p031e.C0721j;

/* renamed from: org.js.oledsaver.b.a.a */
class C0669a {

    /* renamed from: A */
    private C0671a f2412A;

    /* renamed from: B */
    private C0672b f2413B;

    /* renamed from: C */
    private int f2414C = -1;

    /* renamed from: D */
    private int f2415D = 0;

    /* renamed from: E */
    private boolean f2416E;

    /* renamed from: F */
    private float f2417F;

    /* renamed from: G */
    private int f2418G;

    /* renamed from: H */
    private boolean f2419H;

    /* renamed from: I */
    private float f2420I;

    /* renamed from: J */
    private float f2421J = 0.6f;

    /* renamed from: K */
    private final SensorEventListener f2422K = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (C0669a.this.f2440r) {
                C0669a.this.m3260a(SystemClock.uptimeMillis(), sensorEvent.values[0]);
            }
        }
    };

    /* renamed from: a */
    private final C0673c f2423a;

    /* renamed from: b */
    private final SensorManager f2424b;

    /* renamed from: c */
    private final Sensor f2425c;

    /* renamed from: d */
    private final C0680d f2426d;

    /* renamed from: e */
    private final int f2427e;

    /* renamed from: f */
    private final int f2428f;

    /* renamed from: g */
    private final float f2429g;

    /* renamed from: h */
    private final int f2430h;

    /* renamed from: i */
    private final int f2431i;

    /* renamed from: j */
    private int f2432j;

    /* renamed from: k */
    private final long f2433k;

    /* renamed from: l */
    private final long f2434l;

    /* renamed from: m */
    private final boolean f2435m;

    /* renamed from: n */
    private final int f2436n;

    /* renamed from: o */
    private final int f2437o;

    /* renamed from: p */
    private final C0697g f2438p;

    /* renamed from: q */
    private int f2439q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f2440r;

    /* renamed from: s */
    private long f2441s;

    /* renamed from: t */
    private float f2442t;

    /* renamed from: u */
    private boolean f2443u;

    /* renamed from: v */
    private float f2444v;

    /* renamed from: w */
    private float f2445w;

    /* renamed from: x */
    private float f2446x;

    /* renamed from: y */
    private long f2447y;

    /* renamed from: z */
    private int f2448z;

    /* renamed from: org.js.oledsaver.b.a.a$a */
    private static final class C0671a {

        /* renamed from: a */
        private float[] f2450a = new float[this.f2452c];

        /* renamed from: b */
        private long[] f2451b = new long[this.f2452c];

        /* renamed from: c */
        private int f2452c;

        /* renamed from: d */
        private int f2453d;

        /* renamed from: e */
        private int f2454e;

        /* renamed from: f */
        private int f2455f;

        public C0671a(long j, int i) {
            this.f2452c = (int) Math.ceil((double) ((((float) i) * 1.5f) / ((float) j)));
        }

        /* renamed from: c */
        private int m3294c(int i) {
            if (i >= this.f2455f || i < 0) {
                throw new ArrayIndexOutOfBoundsException(i);
            }
            int i2 = this.f2453d + i;
            return i2 >= this.f2452c ? i2 - this.f2452c : i2;
        }

        /* renamed from: a */
        public float mo3427a(int i) {
            return this.f2450a[m3294c(i)];
        }

        /* renamed from: a */
        public int mo3428a() {
            return this.f2455f;
        }

        /* renamed from: a */
        public void mo3429a(long j) {
            if (this.f2455f != 0) {
                while (this.f2455f > 1) {
                    int i = this.f2453d + 1;
                    if (i >= this.f2452c) {
                        i -= this.f2452c;
                    }
                    if (this.f2451b[i] > j) {
                        break;
                    }
                    this.f2453d = i;
                    this.f2455f--;
                }
                if (this.f2451b[this.f2453d] < j) {
                    this.f2451b[this.f2453d] = j;
                }
            }
        }

        /* renamed from: a */
        public void mo3430a(long j, float f) {
            int i = this.f2454e;
            if (this.f2455f == this.f2452c) {
                int i2 = this.f2452c * 2;
                float[] fArr = new float[i2];
                long[] jArr = new long[i2];
                int i3 = this.f2452c - this.f2453d;
                System.arraycopy(this.f2450a, this.f2453d, fArr, 0, i3);
                System.arraycopy(this.f2451b, this.f2453d, jArr, 0, i3);
                if (this.f2453d != 0) {
                    System.arraycopy(this.f2450a, 0, fArr, i3, this.f2453d);
                    System.arraycopy(this.f2451b, 0, jArr, i3, this.f2453d);
                }
                this.f2450a = fArr;
                this.f2451b = jArr;
                i = this.f2452c;
                this.f2452c = i2;
                this.f2453d = 0;
            }
            this.f2451b[i] = j;
            this.f2450a[i] = f;
            this.f2454e = i + 1;
            if (this.f2454e == this.f2452c) {
                this.f2454e = 0;
            }
            this.f2455f++;
        }

        /* renamed from: b */
        public long mo3431b(int i) {
            return this.f2451b[m3294c(i)];
        }

        /* renamed from: b */
        public void mo3432b() {
            this.f2453d = 0;
            this.f2454e = 0;
            this.f2455f = 0;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('[');
            for (int i = 0; i < this.f2455f; i++) {
                long b = i + 1 < this.f2455f ? mo3431b(i + 1) : SystemClock.uptimeMillis();
                if (i != 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(mo3427a(i));
                stringBuffer.append(" / ");
                stringBuffer.append(b - mo3431b(i));
                stringBuffer.append("ms");
            }
            stringBuffer.append(']');
            return stringBuffer.toString();
        }
    }

    /* renamed from: org.js.oledsaver.b.a.a$b */
    private final class C0672b extends Handler {
        public C0672b(Looper looper) {
            super(looper, (Handler.Callback) null);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    C0669a.this.m3281j();
                    return;
                case 2:
                    C0669a.this.m3283l();
                    return;
                case 3:
                    C0669a.this.m3280i();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: org.js.oledsaver.b.a.a$c */
    interface C0673c {
        /* renamed from: a */
        void mo3435a();
    }

    public C0669a(C0673c cVar, Looper looper, SensorManager sensorManager, C0680d dVar, int i, int i2, int i3, float f, int i4, int i5, long j, long j2, boolean z, C0697g gVar) {
        this.f2423a = cVar;
        this.f2424b = sensorManager;
        this.f2426d = dVar;
        this.f2427e = i2;
        this.f2428f = i3;
        this.f2439q = i;
        this.f2429g = f;
        this.f2431i = i4;
        this.f2430h = i5;
        this.f2432j = -1;
        this.f2433k = j;
        this.f2434l = j2;
        this.f2435m = z;
        this.f2436n = 10000;
        this.f2437o = 10000;
        this.f2438p = gVar;
        this.f2419H = true;
        this.f2420I = -1.0f;
        this.f2413B = new C0672b(looper);
        this.f2412A = new C0671a((long) this.f2431i, this.f2436n);
        this.f2425c = this.f2424b.getDefaultSensor(5);
    }

    /* renamed from: a */
    private float m3258a(long j) {
        return ((float) j) * ((((float) j) * 0.5f) + ((float) this.f2437o));
    }

    /* renamed from: a */
    private float m3259a(long j, long j2) {
        int i;
        int a = this.f2412A.mo3428a();
        if (a == 0) {
            C0721j.m3494c("AutomaticBrightnessController", "calculateAmbientLux: No ambient light readings available");
            return -1.0f;
        }
        int i2 = 0;
        long j3 = j - j2;
        int i3 = 0;
        while (true) {
            i = i2;
            if (i3 >= a - 1 || this.f2412A.mo3431b(i3 + 1) > j3) {
                long j4 = 100;
                int i4 = a - 1;
                float f = 0.0f;
                float f2 = 0.0f;
            } else {
                i2 = i + 1;
                i3++;
            }
        }
        long j42 = 100;
        int i42 = a - 1;
        float f3 = 0.0f;
        float f22 = 0.0f;
        while (i42 >= i) {
            long b = this.f2412A.mo3431b(i42);
            if (i42 == i && b < j3) {
                b = j3;
            }
            long j5 = b - j;
            float b2 = m3266b(j5, j42);
            f22 += b2 * this.f2412A.mo3427a(i42);
            i42--;
            j42 = j5;
            f3 += b2;
        }
        return f22 / f3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3260a(long j, float f) {
        this.f2413B.removeMessages(1);
        if (this.f2412A.mo3428a() == 0) {
            m3275c(this.f2431i);
        }
        m3268b(j, f);
        m3278d(j);
    }

    /* renamed from: a */
    private boolean m3263a(float f) {
        if (!this.f2443u) {
            return false;
        }
        this.f2426d.mo3451a(this.f2442t, f);
        this.f2419H = true;
        this.f2420I = this.f2442t;
        return true;
    }

    /* renamed from: a */
    private boolean m3264a(int i) {
        if (this.f2415D == i) {
            return false;
        }
        int i2 = this.f2415D;
        this.f2415D = i;
        if (!m3272b(i) && m3272b(i2)) {
            this.f2413B.sendEmptyMessageDelayed(3, 30000);
        } else if (m3272b(i) && !m3272b(i2)) {
            this.f2413B.removeMessages(3);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m3265a(boolean z) {
        if (z) {
            if (!this.f2440r) {
                this.f2440r = true;
                this.f2441s = SystemClock.uptimeMillis();
                this.f2432j = this.f2430h;
                this.f2424b.registerListener(this.f2422K, this.f2425c, this.f2432j * 1000, this.f2413B);
                return true;
            }
        } else if (this.f2440r) {
            this.f2440r = false;
            this.f2443u = !this.f2435m;
            this.f2448z = 0;
            this.f2412A.mo3432b();
            this.f2432j = -1;
            this.f2413B.removeMessages(1);
            this.f2424b.unregisterListener(this.f2422K);
        }
        return false;
    }

    /* renamed from: b */
    private float m3266b(long j, long j2) {
        return m3258a(j2) - m3258a(j);
    }

    /* renamed from: b */
    private long m3267b(long j) {
        int a = this.f2412A.mo3428a() - 1;
        while (a >= 0 && this.f2412A.mo3427a(a) > this.f2444v) {
            j = this.f2412A.mo3431b(a);
            a--;
        }
        return this.f2433k + j;
    }

    /* renamed from: b */
    private void m3268b(long j, float f) {
        this.f2448z++;
        this.f2412A.mo3429a(j - ((long) this.f2436n));
        this.f2412A.mo3430a(j, f);
        this.f2446x = f;
        this.f2447y = j;
    }

    /* renamed from: b */
    private void m3270b(boolean z) {
        int d;
        if (this.f2443u && this.f2414C != (d = m3277d(Math.round(this.f2426d.mo3450a(this.f2442t) * 255.0f)))) {
            this.f2414C = d;
            if (z) {
                this.f2423a.mo3435a();
            }
        }
    }

    /* renamed from: b */
    private boolean m3271b(float f) {
        return this.f2426d.mo3454b(f);
    }

    /* renamed from: b */
    private static boolean m3272b(int i) {
        return i == 3 || i == 2 || i == 4;
    }

    /* renamed from: c */
    private long m3273c(long j) {
        int a = this.f2412A.mo3428a() - 1;
        while (a >= 0 && this.f2412A.mo3427a(a) < this.f2445w) {
            j = this.f2412A.mo3431b(a);
            a--;
        }
        return this.f2434l + j;
    }

    /* renamed from: c */
    private void m3274c(float f) {
        if (f < 0.0f) {
            C0721j.m3495d("AutomaticBrightnessController", "Ambient lux was negative, ignoring and setting to 0");
            f = 0.0f;
        }
        this.f2442t = f;
        this.f2444v = this.f2438p.mo3483a(f);
        this.f2445w = this.f2438p.mo3484b(f);
        if (!this.f2419H && this.f2420I != -1.0f) {
            float f2 = this.f2420I - (this.f2420I * this.f2421J);
            float f3 = this.f2420I + (this.f2420I * this.f2421J);
            if (f2 >= this.f2442t || this.f2442t >= f3) {
                C0721j.m3492a("AutomaticBrightnessController", "ShortTermModel: reset data, ambient lux is " + this.f2442t + "(" + f2 + ", " + f3 + ")");
            } else {
                this.f2419H = true;
            }
        }
    }

    /* renamed from: c */
    private void m3275c(int i) {
        if (i != this.f2432j) {
            this.f2432j = i;
            this.f2424b.unregisterListener(this.f2422K);
            this.f2424b.registerListener(this.f2422K, this.f2425c, i * 1000, this.f2413B);
        }
    }

    /* renamed from: d */
    private int m3277d(int i) {
        return C0714c.m3467a(i, this.f2427e, this.f2428f);
    }

    /* renamed from: d */
    private void m3278d(long j) {
        if (!this.f2443u) {
            long j2 = ((long) this.f2439q) + this.f2441s;
            if (j < j2) {
                this.f2413B.sendEmptyMessageAtTime(1, j2);
                return;
            }
            m3274c(m3259a(j, 2000));
            this.f2443u = true;
            m3270b(true);
        }
        long b = m3267b(j);
        long c = m3273c(j);
        float a = m3259a(j, 10000);
        float a2 = m3259a(j, 2000);
        if ((a >= this.f2444v && a2 >= this.f2444v && b <= j) || (a <= this.f2445w && a2 <= this.f2445w && c <= j)) {
            m3274c(a2);
            m3270b(true);
            b = m3267b(j);
            c = m3273c(j);
        }
        long min = Math.min(c, b);
        if (min <= j) {
            min = ((long) this.f2431i) + j;
        }
        this.f2413B.sendEmptyMessageAtTime(1, min);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m3280i() {
        this.f2419H = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m3281j() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f2412A.mo3429a(uptimeMillis - ((long) this.f2436n));
        m3278d(uptimeMillis);
    }

    /* renamed from: k */
    private void m3282k() {
        if (!this.f2416E) {
            this.f2416E = true;
            this.f2417F = this.f2443u ? this.f2442t : -1.0f;
            this.f2418G = this.f2414C;
        } else {
            this.f2413B.removeMessages(2);
        }
        this.f2413B.sendEmptyMessageDelayed(2, 10000);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m3283l() {
        if (this.f2416E) {
            this.f2416E = false;
            if (!this.f2443u || this.f2414C >= 0) {
            }
        }
    }

    /* renamed from: a */
    public int mo3415a() {
        if (!this.f2443u) {
            return -1;
        }
        return this.f2415D == 1 ? (int) (((float) this.f2414C) * this.f2429g) : this.f2414C;
    }

    /* renamed from: a */
    public void mo3416a(boolean z, C0677c cVar, float f, boolean z2, float f2, boolean z3, int i) {
        boolean z4 = true;
        boolean z5 = i == 1;
        boolean a = mo3417a(cVar) | m3264a(i);
        if (z3) {
            a |= m3271b(f2);
        }
        boolean a2 = (!z2 || !z) ? a : a | m3263a(f);
        if ((z2 || z3) && z && !z5) {
            m3282k();
        }
        if (!z || z5) {
            z4 = false;
        }
        if (m3265a(z4) || a2) {
            m3270b(false);
        }
    }

    /* renamed from: a */
    public boolean mo3417a(C0677c cVar) {
        if (!this.f2426d.mo3452a(cVar)) {
            return false;
        }
        mo3420d();
        return true;
    }

    /* renamed from: b */
    public float mo3418b() {
        return this.f2426d.mo3449a();
    }

    /* renamed from: c */
    public boolean mo3419c() {
        return this.f2426d.mo3455c();
    }

    /* renamed from: d */
    public void mo3420d() {
        this.f2426d.mo3453b();
        this.f2419H = true;
        this.f2420I = -1.0f;
    }

    /* renamed from: e */
    public float mo3421e() {
        return this.f2442t;
    }

    /* renamed from: f */
    public int mo3422f() {
        return this.f2414C;
    }

    /* renamed from: g */
    public float mo3423g() {
        return this.f2426d.mo3456d();
    }

    /* renamed from: h */
    public float mo3424h() {
        return this.f2426d.mo3457e();
    }
}
