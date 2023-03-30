package android.support.p006v4.media;

import java.util.Arrays;

/* renamed from: android.support.v4.media.c */
class C0296c implements C0294a {

    /* renamed from: a */
    int f849a = 0;

    /* renamed from: b */
    int f850b = 0;

    /* renamed from: c */
    int f851c = 0;

    /* renamed from: d */
    int f852d = -1;

    C0296c() {
    }

    /* renamed from: a */
    public int mo1217a() {
        return this.f852d != -1 ? this.f852d : AudioAttributesCompat.m1229a(false, this.f851c, this.f849a);
    }

    /* renamed from: b */
    public int mo1218b() {
        return this.f850b;
    }

    /* renamed from: c */
    public int mo1219c() {
        return this.f849a;
    }

    /* renamed from: d */
    public int mo1220d() {
        int i = this.f851c;
        int a = mo1217a();
        if (a == 6) {
            i |= 4;
        } else if (a == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0296c)) {
            return false;
        }
        C0296c cVar = (C0296c) obj;
        return this.f850b == cVar.mo1218b() && this.f851c == cVar.mo1220d() && this.f849a == cVar.mo1219c() && this.f852d == cVar.f852d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f850b), Integer.valueOf(this.f851c), Integer.valueOf(this.f849a), Integer.valueOf(this.f852d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f852d != -1) {
            sb.append(" stream=").append(this.f852d);
            sb.append(" derived");
        }
        sb.append(" usage=").append(AudioAttributesCompat.m1230a(this.f849a)).append(" content=").append(this.f850b).append(" flags=0x").append(Integer.toHexString(this.f851c).toUpperCase());
        return sb.toString();
    }
}
