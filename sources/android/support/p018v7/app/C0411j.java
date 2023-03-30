package android.support.p018v7.app;

/* renamed from: android.support.v7.app.j */
class C0411j {

    /* renamed from: d */
    private static C0411j f1229d;

    /* renamed from: a */
    public long f1230a;

    /* renamed from: b */
    public long f1231b;

    /* renamed from: c */
    public int f1232c;

    C0411j() {
    }

    /* renamed from: a */
    static C0411j m1884a() {
        if (f1229d == null) {
            f1229d = new C0411j();
        }
        return f1229d;
    }

    /* renamed from: a */
    public void mo1706a(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = 6.24006f + (0.01720197f * f);
        double sin = ((double) f2) + (0.03341960161924362d * Math.sin((double) f2)) + (3.4906598739326E-4d * Math.sin((double) (2.0f * f2))) + (5.236000106378924E-6d * Math.sin((double) (3.0f * f2))) + 1.796593063d + 3.141592653589793d;
        double d3 = (-d2) / 360.0d;
        double sin2 = (Math.sin((double) f2) * 0.0053d) + d3 + ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d3)) + 9.0E-4f)) + (-0.0069d * Math.sin(2.0d * sin));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(asin))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.f1232c = 1;
            this.f1230a = -1;
            this.f1231b = -1;
        } else if (sin3 <= -1.0d) {
            this.f1232c = 0;
            this.f1230a = -1;
            this.f1231b = -1;
        } else {
            float acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f1230a = Math.round((((double) acos) + sin2) * 8.64E7d) + 946728000000L;
            this.f1231b = Math.round((sin2 - ((double) acos)) * 8.64E7d) + 946728000000L;
            if (this.f1231b >= j || this.f1230a <= j) {
                this.f1232c = 1;
            } else {
                this.f1232c = 0;
            }
        }
    }
}
