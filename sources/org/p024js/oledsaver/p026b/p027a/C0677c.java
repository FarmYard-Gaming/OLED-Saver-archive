package org.p024js.oledsaver.p026b.p027a;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.Arrays;
import java.util.Objects;
import org.p024js.oledsaver.p031e.C0717f;

/* renamed from: org.js.oledsaver.b.a.c */
public final class C0677c implements Parcelable {
    public static final Parcelable.Creator<C0677c> CREATOR = new Parcelable.Creator<C0677c>() {
        /* renamed from: a */
        public C0677c createFromParcel(Parcel parcel) {
            C0679a aVar = new C0679a(parcel.createFloatArray(), parcel.createFloatArray());
            aVar.mo3446a(parcel.readString());
            return aVar.mo3448a();
        }

        /* renamed from: a */
        public C0677c[] newArray(int i) {
            return new C0677c[i];
        }
    };

    /* renamed from: a */
    private final float[] f2458a;

    /* renamed from: b */
    private final float[] f2459b;

    /* renamed from: c */
    private final String f2460c;

    /* renamed from: org.js.oledsaver.b.a.c$a */
    public static class C0679a {

        /* renamed from: a */
        private float[] f2461a;

        /* renamed from: b */
        private float[] f2462b;

        /* renamed from: c */
        private String f2463c;

        public C0679a() {
        }

        public C0679a(float[] fArr, float[] fArr2) {
            mo3447a(fArr, fArr2);
        }

        /* renamed from: a */
        private static void m3310a(float[] fArr, boolean z, String str) {
            if (fArr.length > 1) {
                float f = fArr[0];
                for (int i = 1; i < fArr.length; i++) {
                    if (f > fArr[i] || (f == fArr[i] && z)) {
                        throw new IllegalArgumentException(str + " values must be " + (z ? "strictly increasing" : "monotonic"));
                    }
                    f = fArr[i];
                }
            }
        }

        /* renamed from: a */
        public C0679a mo3446a(String str) {
            this.f2463c = str;
            return this;
        }

        /* renamed from: a */
        public C0679a mo3447a(float[] fArr, float[] fArr2) {
            C0717f.m3473a(fArr);
            C0717f.m3473a(fArr2);
            if (fArr.length == 0 || fArr2.length == 0) {
                throw new IllegalArgumentException("Lux and nits arrays must not be empty");
            } else if (fArr.length != fArr2.length) {
                throw new IllegalArgumentException("Lux and nits arrays must be the same length");
            } else if (fArr[0] != 0.0f) {
                throw new IllegalArgumentException("Initial control point must be for 0 lux");
            } else {
                C0717f.m3476a(fArr, 0.0f, Float.MAX_VALUE, "lux");
                C0717f.m3476a(fArr2, 0.0f, Float.MAX_VALUE, "nits");
                m3310a(fArr, true, "lux");
                m3310a(fArr2, false, "nits");
                this.f2461a = fArr;
                this.f2462b = fArr2;
                return this;
            }
        }

        /* renamed from: a */
        public C0677c mo3448a() {
            if (this.f2461a != null && this.f2462b != null) {
                return new C0677c(this.f2461a, this.f2462b, this.f2463c);
            }
            throw new IllegalStateException("A curve must be set!");
        }
    }

    private C0677c(float[] fArr, float[] fArr2, String str) {
        this.f2458a = fArr;
        this.f2459b = fArr2;
        this.f2460c = str;
    }

    /* renamed from: a */
    public Pair<float[], float[]> mo3436a() {
        return Pair.create(Arrays.copyOf(this.f2458a, this.f2458a.length), Arrays.copyOf(this.f2459b, this.f2459b.length));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0677c)) {
            return false;
        }
        C0677c cVar = (C0677c) obj;
        return Arrays.equals(this.f2458a, cVar.f2458a) && Arrays.equals(this.f2459b, cVar.f2459b) && Objects.equals(this.f2460c, cVar.f2460c);
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f2458a) + 31) * 31) + Arrays.hashCode(this.f2459b);
        return this.f2460c != null ? (hashCode * 31) + this.f2460c.hashCode() : hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BrightnessConfiguration{[");
        int length = this.f2458a.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append("(").append(this.f2458a[i]).append(", ").append(this.f2459b[i]).append(")");
        }
        sb.append("], '");
        if (this.f2460c != null) {
            sb.append(this.f2460c);
        }
        sb.append("'}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.f2458a);
        parcel.writeFloatArray(this.f2459b);
        parcel.writeString(this.f2460c);
    }
}
