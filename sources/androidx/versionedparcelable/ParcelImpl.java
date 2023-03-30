package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() {
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: a */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    };

    /* renamed from: a */
    private final C0639c f2294a;

    protected ParcelImpl(Parcel parcel) {
        this.f2294a = new C0638b(parcel).mo3266h();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0638b(parcel).mo3245a(this.f2294a);
    }
}
