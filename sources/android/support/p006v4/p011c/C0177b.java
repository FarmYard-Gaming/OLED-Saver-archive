package android.support.p006v4.p011c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p006v4.p011c.C0174a;

/* renamed from: android.support.v4.c.b */
public class C0177b implements Parcelable {
    public static final Parcelable.Creator<C0177b> CREATOR = new Parcelable.Creator<C0177b>() {
        /* renamed from: a */
        public C0177b createFromParcel(Parcel parcel) {
            return new C0177b(parcel);
        }

        /* renamed from: a */
        public C0177b[] newArray(int i) {
            return new C0177b[i];
        }
    };

    /* renamed from: a */
    final boolean f579a = false;

    /* renamed from: b */
    final Handler f580b = null;

    /* renamed from: c */
    C0174a f581c;

    /* renamed from: android.support.v4.c.b$a */
    class C0179a extends C0174a.C0175a {
        C0179a() {
        }

        /* renamed from: a */
        public void mo747a(int i, Bundle bundle) {
            if (C0177b.this.f580b != null) {
                C0177b.this.f580b.post(new C0180b(i, bundle));
            } else {
                C0177b.this.mo751a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.c.b$b */
    class C0180b implements Runnable {

        /* renamed from: a */
        final int f583a;

        /* renamed from: b */
        final Bundle f584b;

        C0180b(int i, Bundle bundle) {
            this.f583a = i;
            this.f584b = bundle;
        }

        public void run() {
            C0177b.this.mo751a(this.f583a, this.f584b);
        }
    }

    C0177b(Parcel parcel) {
        this.f581c = C0174a.C0175a.m795a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo751a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f581c == null) {
                this.f581c = new C0179a();
            }
            parcel.writeStrongBinder(this.f581c.asBinder());
        }
    }
}
