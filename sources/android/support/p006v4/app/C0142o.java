package android.support.p006v4.app;

import android.arch.lifecycle.C0040p;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.app.o */
final class C0142o implements Parcelable {
    public static final Parcelable.Creator<C0142o> CREATOR = new Parcelable.Creator<C0142o>() {
        /* renamed from: a */
        public C0142o createFromParcel(Parcel parcel) {
            return new C0142o(parcel);
        }

        /* renamed from: a */
        public C0142o[] newArray(int i) {
            return new C0142o[i];
        }
    };

    /* renamed from: a */
    final String f438a;

    /* renamed from: b */
    final int f439b;

    /* renamed from: c */
    final boolean f440c;

    /* renamed from: d */
    final int f441d;

    /* renamed from: e */
    final int f442e;

    /* renamed from: f */
    final String f443f;

    /* renamed from: g */
    final boolean f444g;

    /* renamed from: h */
    final boolean f445h;

    /* renamed from: i */
    final Bundle f446i;

    /* renamed from: j */
    final boolean f447j;

    /* renamed from: k */
    Bundle f448k;

    /* renamed from: l */
    C0106f f449l;

    C0142o(Parcel parcel) {
        boolean z = true;
        this.f438a = parcel.readString();
        this.f439b = parcel.readInt();
        this.f440c = parcel.readInt() != 0;
        this.f441d = parcel.readInt();
        this.f442e = parcel.readInt();
        this.f443f = parcel.readString();
        this.f444g = parcel.readInt() != 0;
        this.f445h = parcel.readInt() != 0;
        this.f446i = parcel.readBundle();
        this.f447j = parcel.readInt() == 0 ? false : z;
        this.f448k = parcel.readBundle();
    }

    C0142o(C0106f fVar) {
        this.f438a = fVar.getClass().getName();
        this.f439b = fVar.f300f;
        this.f440c = fVar.f308n;
        this.f441d = fVar.f319y;
        this.f442e = fVar.f320z;
        this.f443f = fVar.f273A;
        this.f444g = fVar.f276D;
        this.f445h = fVar.f275C;
        this.f446i = fVar.f302h;
        this.f447j = fVar.f274B;
    }

    /* renamed from: a */
    public C0106f mo643a(C0119j jVar, C0117h hVar, C0106f fVar, C0139m mVar, C0040p pVar) {
        if (this.f449l == null) {
            Context g = jVar.mo519g();
            if (this.f446i != null) {
                this.f446i.setClassLoader(g.getClassLoader());
            }
            if (hVar != null) {
                this.f449l = hVar.mo446a(g, this.f438a, this.f446i);
            } else {
                this.f449l = C0106f.m354a(g, this.f438a, this.f446i);
            }
            if (this.f448k != null) {
                this.f448k.setClassLoader(g.getClassLoader());
                this.f449l.f297c = this.f448k;
            }
            this.f449l.mo370a(this.f439b, fVar);
            this.f449l.f308n = this.f440c;
            this.f449l.f310p = true;
            this.f449l.f319y = this.f441d;
            this.f449l.f320z = this.f442e;
            this.f449l.f273A = this.f443f;
            this.f449l.f276D = this.f444g;
            this.f449l.f275C = this.f445h;
            this.f449l.f274B = this.f447j;
            this.f449l.f313s = jVar.f360b;
            if (C0123l.f368a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f449l);
            }
        }
        this.f449l.f316v = mVar;
        this.f449l.f317w = pVar;
        return this.f449l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.f438a);
        parcel.writeInt(this.f439b);
        parcel.writeInt(this.f440c ? 1 : 0);
        parcel.writeInt(this.f441d);
        parcel.writeInt(this.f442e);
        parcel.writeString(this.f443f);
        parcel.writeInt(this.f444g ? 1 : 0);
        parcel.writeInt(this.f445h ? 1 : 0);
        parcel.writeBundle(this.f446i);
        if (!this.f447j) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.f448k);
    }
}
