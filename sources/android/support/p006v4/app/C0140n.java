package android.support.p006v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.n */
final class C0140n implements Parcelable {
    public static final Parcelable.Creator<C0140n> CREATOR = new Parcelable.Creator<C0140n>() {
        /* renamed from: a */
        public C0140n createFromParcel(Parcel parcel) {
            return new C0140n(parcel);
        }

        /* renamed from: a */
        public C0140n[] newArray(int i) {
            return new C0140n[i];
        }
    };

    /* renamed from: a */
    C0142o[] f433a;

    /* renamed from: b */
    int[] f434b;

    /* renamed from: c */
    C0102d[] f435c;

    /* renamed from: d */
    int f436d = -1;

    /* renamed from: e */
    int f437e;

    public C0140n() {
    }

    public C0140n(Parcel parcel) {
        this.f433a = (C0142o[]) parcel.createTypedArray(C0142o.CREATOR);
        this.f434b = parcel.createIntArray();
        this.f435c = (C0102d[]) parcel.createTypedArray(C0102d.CREATOR);
        this.f436d = parcel.readInt();
        this.f437e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f433a, i);
        parcel.writeIntArray(this.f434b);
        parcel.writeTypedArray(this.f435c, i);
        parcel.writeInt(this.f436d);
        parcel.writeInt(this.f437e);
    }
}
