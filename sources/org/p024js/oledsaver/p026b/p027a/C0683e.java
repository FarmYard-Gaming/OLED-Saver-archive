package org.p024js.oledsaver.p026b.p027a;

/* renamed from: org.js.oledsaver.b.a.e */
public abstract class C0683e {

    /* renamed from: org.js.oledsaver.b.a.e$a */
    public interface C0684a {
        /* renamed from: a */
        void mo3297a();

        /* renamed from: b */
        void mo3298b();

        /* renamed from: c */
        void mo3299c();

        /* renamed from: d */
        void mo3300d();

        /* renamed from: e */
        void mo3301e();
    }

    /* renamed from: org.js.oledsaver.b.a.e$b */
    public static final class C0685b {

        /* renamed from: a */
        public int f2481a;

        /* renamed from: b */
        public boolean f2482b;

        /* renamed from: c */
        public int f2483c;

        /* renamed from: d */
        public float f2484d;

        /* renamed from: e */
        public boolean f2485e;

        /* renamed from: f */
        public boolean f2486f;

        /* renamed from: g */
        public boolean f2487g;

        /* renamed from: h */
        public float f2488h;

        /* renamed from: i */
        public boolean f2489i;

        /* renamed from: j */
        public boolean f2490j;

        /* renamed from: k */
        public int f2491k;

        /* renamed from: l */
        public int f2492l;

        public C0685b() {
            this.f2481a = 3;
            this.f2482b = false;
            this.f2483c = 255;
            this.f2484d = 0.0f;
            this.f2488h = 0.5f;
            this.f2486f = false;
            this.f2490j = false;
            this.f2491k = -1;
            this.f2492l = 0;
        }

        public C0685b(C0685b bVar) {
            mo3458a(bVar);
        }

        /* renamed from: a */
        public static String m3365a(int i) {
            switch (i) {
                case 0:
                    return "OFF";
                case 1:
                    return "DOZE";
                case 2:
                    return "DIM";
                case 3:
                    return "BRIGHT";
                case 4:
                    return "VR";
                default:
                    return Integer.toString(i);
            }
        }

        /* renamed from: a */
        public void mo3458a(C0685b bVar) {
            this.f2481a = bVar.f2481a;
            this.f2482b = bVar.f2482b;
            this.f2483c = bVar.f2483c;
            this.f2484d = bVar.f2484d;
            this.f2488h = bVar.f2488h;
            this.f2485e = bVar.f2485e;
            this.f2486f = bVar.f2486f;
            this.f2490j = bVar.f2490j;
            this.f2487g = bVar.f2487g;
            this.f2489i = bVar.f2489i;
            this.f2491k = bVar.f2491k;
            this.f2492l = bVar.f2492l;
        }

        /* renamed from: b */
        public boolean mo3459b(C0685b bVar) {
            return bVar != null && this.f2481a == bVar.f2481a && this.f2482b == bVar.f2482b && this.f2483c == bVar.f2483c && this.f2484d == bVar.f2484d && this.f2488h == bVar.f2488h && this.f2485e == bVar.f2485e && this.f2486f == bVar.f2486f && this.f2490j == bVar.f2490j && this.f2487g == bVar.f2487g && this.f2489i == bVar.f2489i && this.f2491k == bVar.f2491k && this.f2492l == bVar.f2492l;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0685b) && mo3459b((C0685b) obj);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "policy=" + m3365a(this.f2481a) + ", useProximitySensor=" + this.f2482b + ", screenBrightness=" + this.f2483c + ", screenAutoBrightnessAdjustment=" + this.f2484d + ", screenLowPowerBrightnessFactor=" + this.f2488h + ", brightnessSetByUser=" + this.f2485e + ", useAutoBrightness=" + this.f2486f + ", blockScreenOn=" + this.f2490j + ", lowPowerMode=" + this.f2487g + ", boostScreenBrightness=" + this.f2489i + ", dozeScreenBrightness=" + this.f2491k;
        }
    }
}
