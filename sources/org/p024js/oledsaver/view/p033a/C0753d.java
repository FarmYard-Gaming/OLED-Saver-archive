package org.p024js.oledsaver.view.p033a;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: org.js.oledsaver.view.a.d */
class C0753d implements Parcelable {
    public static final Parcelable.Creator<C0753d> CREATOR = new Parcelable.Creator<C0753d>() {
        /* renamed from: a */
        public C0753d createFromParcel(Parcel parcel) {
            boolean z = true;
            C0753d dVar = new C0753d();
            dVar.f2697h = parcel.readInt();
            dVar.f2698i = parcel.readInt();
            dVar.f2699j = parcel.readInt();
            dVar.f2702m = parcel.readInt();
            dVar.f2700k = parcel.readInt();
            dVar.f2691b = parcel.readInt();
            dVar.f2692c = parcel.readInt();
            dVar.f2693d = parcel.readInt();
            dVar.f2694e = parcel.readInt();
            dVar.f2695f = parcel.readInt();
            dVar.f2701l = parcel.readInt();
            dVar.f2703n = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z = false;
            }
            dVar.f2704o = z;
            return dVar;
        }

        /* renamed from: a */
        public C0753d[] newArray(int i) {
            return new C0753d[i];
        }
    };

    /* renamed from: a */
    View f2690a = null;

    /* renamed from: b */
    int f2691b = 0;

    /* renamed from: c */
    int f2692c = 0;

    /* renamed from: d */
    int f2693d = 0;

    /* renamed from: e */
    int f2694e = 0;

    /* renamed from: f */
    int f2695f = 0;

    /* renamed from: g */
    boolean f2696g;

    /* renamed from: h */
    int f2697h = 255;

    /* renamed from: i */
    int f2698i = -1;

    /* renamed from: j */
    int f2699j = -1;

    /* renamed from: k */
    int f2700k = 0;

    /* renamed from: l */
    int f2701l = 0;

    /* renamed from: m */
    int f2702m = 17170444;

    /* renamed from: n */
    boolean f2703n = true;

    /* renamed from: o */
    boolean f2704o = false;

    /* renamed from: p */
    boolean f2705p = false;

    /* renamed from: q */
    int f2706q = -1;

    /* renamed from: r */
    int f2707r = -1;

    C0753d() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeInt(this.f2697h);
        parcel.writeInt(this.f2698i);
        parcel.writeInt(this.f2699j);
        parcel.writeInt(this.f2702m);
        parcel.writeInt(this.f2700k);
        parcel.writeInt(this.f2691b);
        parcel.writeInt(this.f2692c);
        parcel.writeInt(this.f2693d);
        parcel.writeInt(this.f2694e);
        parcel.writeInt(this.f2695f);
        parcel.writeInt(this.f2701l);
        parcel.writeByte((byte) (this.f2703n ? 1 : 0));
        if (!this.f2704o) {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
    }
}
