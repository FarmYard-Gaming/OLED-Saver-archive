package android.support.p006v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p006v4.app.C0100c;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.d */
final class C0102d implements Parcelable {
    public static final Parcelable.Creator<C0102d> CREATOR = new Parcelable.Creator<C0102d>() {
        /* renamed from: a */
        public C0102d createFromParcel(Parcel parcel) {
            return new C0102d(parcel);
        }

        /* renamed from: a */
        public C0102d[] newArray(int i) {
            return new C0102d[i];
        }
    };

    /* renamed from: a */
    final int[] f257a;

    /* renamed from: b */
    final int f258b;

    /* renamed from: c */
    final int f259c;

    /* renamed from: d */
    final String f260d;

    /* renamed from: e */
    final int f261e;

    /* renamed from: f */
    final int f262f;

    /* renamed from: g */
    final CharSequence f263g;

    /* renamed from: h */
    final int f264h;

    /* renamed from: i */
    final CharSequence f265i;

    /* renamed from: j */
    final ArrayList<String> f266j;

    /* renamed from: k */
    final ArrayList<String> f267k;

    /* renamed from: l */
    final boolean f268l;

    public C0102d(Parcel parcel) {
        this.f257a = parcel.createIntArray();
        this.f258b = parcel.readInt();
        this.f259c = parcel.readInt();
        this.f260d = parcel.readString();
        this.f261e = parcel.readInt();
        this.f262f = parcel.readInt();
        this.f263g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f264h = parcel.readInt();
        this.f265i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f266j = parcel.createStringArrayList();
        this.f267k = parcel.createStringArrayList();
        this.f268l = parcel.readInt() != 0;
    }

    public C0102d(C0100c cVar) {
        int size = cVar.f231b.size();
        this.f257a = new int[(size * 6)];
        if (!cVar.f238i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0100c.C0101a aVar = cVar.f231b.get(i2);
            int i3 = i + 1;
            this.f257a[i] = aVar.f251a;
            int i4 = i3 + 1;
            this.f257a[i3] = aVar.f252b != null ? aVar.f252b.f300f : -1;
            int i5 = i4 + 1;
            this.f257a[i4] = aVar.f253c;
            int i6 = i5 + 1;
            this.f257a[i5] = aVar.f254d;
            int i7 = i6 + 1;
            this.f257a[i6] = aVar.f255e;
            i = i7 + 1;
            this.f257a[i7] = aVar.f256f;
        }
        this.f258b = cVar.f236g;
        this.f259c = cVar.f237h;
        this.f260d = cVar.f240k;
        this.f261e = cVar.f242m;
        this.f262f = cVar.f243n;
        this.f263g = cVar.f244o;
        this.f264h = cVar.f245p;
        this.f265i = cVar.f246q;
        this.f266j = cVar.f247r;
        this.f267k = cVar.f248s;
        this.f268l = cVar.f249t;
    }

    /* renamed from: a */
    public C0100c mo332a(C0123l lVar) {
        C0100c cVar = new C0100c(lVar);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f257a.length) {
            C0100c.C0101a aVar = new C0100c.C0101a();
            int i3 = i2 + 1;
            aVar.f251a = this.f257a[i2];
            if (C0123l.f368a) {
                Log.v("FragmentManager", "Instantiate " + cVar + " op #" + i + " base fragment #" + this.f257a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f257a[i3];
            if (i5 >= 0) {
                aVar.f252b = lVar.f380f.get(i5);
            } else {
                aVar.f252b = null;
            }
            int i6 = i4 + 1;
            aVar.f253c = this.f257a[i4];
            int i7 = i6 + 1;
            aVar.f254d = this.f257a[i6];
            int i8 = i7 + 1;
            aVar.f255e = this.f257a[i7];
            i2 = i8 + 1;
            aVar.f256f = this.f257a[i8];
            cVar.f232c = aVar.f253c;
            cVar.f233d = aVar.f254d;
            cVar.f234e = aVar.f255e;
            cVar.f235f = aVar.f256f;
            cVar.mo319a(aVar);
            i++;
        }
        cVar.f236g = this.f258b;
        cVar.f237h = this.f259c;
        cVar.f240k = this.f260d;
        cVar.f242m = this.f261e;
        cVar.f238i = true;
        cVar.f243n = this.f262f;
        cVar.f244o = this.f263g;
        cVar.f245p = this.f264h;
        cVar.f246q = this.f265i;
        cVar.f247r = this.f266j;
        cVar.f248s = this.f267k;
        cVar.f249t = this.f268l;
        cVar.mo318a(1);
        return cVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeIntArray(this.f257a);
        parcel.writeInt(this.f258b);
        parcel.writeInt(this.f259c);
        parcel.writeString(this.f260d);
        parcel.writeInt(this.f261e);
        parcel.writeInt(this.f262f);
        TextUtils.writeToParcel(this.f263g, parcel, 0);
        parcel.writeInt(this.f264h);
        TextUtils.writeToParcel(this.f265i, parcel, 0);
        parcel.writeStringList(this.f266j);
        parcel.writeStringList(this.f267k);
        if (this.f268l) {
            i2 = 1;
        }
        parcel.writeInt(i2);
    }
}
