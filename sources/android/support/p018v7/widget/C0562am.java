package android.support.p018v7.widget;

/* renamed from: android.support.v7.widget.am */
class C0562am {

    /* renamed from: a */
    private int f2024a = 0;

    /* renamed from: b */
    private int f2025b = 0;

    /* renamed from: c */
    private int f2026c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f2027d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f2028e = 0;

    /* renamed from: f */
    private int f2029f = 0;

    /* renamed from: g */
    private boolean f2030g = false;

    /* renamed from: h */
    private boolean f2031h = false;

    C0562am() {
    }

    /* renamed from: a */
    public int mo2911a() {
        return this.f2024a;
    }

    /* renamed from: a */
    public void mo2912a(int i, int i2) {
        this.f2026c = i;
        this.f2027d = i2;
        this.f2031h = true;
        if (this.f2030g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2024a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2025b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2024a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2025b = i2;
        }
    }

    /* renamed from: a */
    public void mo2913a(boolean z) {
        if (z != this.f2030g) {
            this.f2030g = z;
            if (!this.f2031h) {
                this.f2024a = this.f2028e;
                this.f2025b = this.f2029f;
            } else if (z) {
                this.f2024a = this.f2027d != Integer.MIN_VALUE ? this.f2027d : this.f2028e;
                this.f2025b = this.f2026c != Integer.MIN_VALUE ? this.f2026c : this.f2029f;
            } else {
                this.f2024a = this.f2026c != Integer.MIN_VALUE ? this.f2026c : this.f2028e;
                this.f2025b = this.f2027d != Integer.MIN_VALUE ? this.f2027d : this.f2029f;
            }
        }
    }

    /* renamed from: b */
    public int mo2914b() {
        return this.f2025b;
    }

    /* renamed from: b */
    public void mo2915b(int i, int i2) {
        this.f2031h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2028e = i;
            this.f2024a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2029f = i2;
            this.f2025b = i2;
        }
    }

    /* renamed from: c */
    public int mo2916c() {
        return this.f2030g ? this.f2025b : this.f2024a;
    }

    /* renamed from: d */
    public int mo2917d() {
        return this.f2030g ? this.f2024a : this.f2025b;
    }
}
