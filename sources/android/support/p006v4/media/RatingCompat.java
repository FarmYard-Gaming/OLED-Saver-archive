package android.support.p006v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: a */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };

    /* renamed from: a */
    private final int f845a;

    /* renamed from: b */
    private final float f846b;

    RatingCompat(int i, float f) {
        this.f845a = i;
        this.f846b = f;
    }

    public int describeContents() {
        return this.f845a;
    }

    public String toString() {
        return "Rating:style=" + this.f845a + " rating=" + (this.f846b < 0.0f ? "unrated" : String.valueOf(this.f846b));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f845a);
        parcel.writeFloat(this.f846b);
    }
}
