package android.support.p006v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() {
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: a */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };

    /* renamed from: a */
    public int f877a;

    /* renamed from: b */
    public int f878b;

    /* renamed from: c */
    public int f879c;

    /* renamed from: d */
    public int f880d;

    /* renamed from: e */
    public int f881e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f877a = parcel.readInt();
        this.f879c = parcel.readInt();
        this.f880d = parcel.readInt();
        this.f881e = parcel.readInt();
        this.f878b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f877a);
        parcel.writeInt(this.f879c);
        parcel.writeInt(this.f880d);
        parcel.writeInt(this.f881e);
        parcel.writeInt(this.f878b);
    }
}
