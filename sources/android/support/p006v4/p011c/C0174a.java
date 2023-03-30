package android.support.p006v4.p011c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.c.a */
public interface C0174a extends IInterface {

    /* renamed from: android.support.v4.c.a$a */
    public static abstract class C0175a extends Binder implements C0174a {

        /* renamed from: android.support.v4.c.a$a$a */
        private static class C0176a implements C0174a {

            /* renamed from: a */
            private IBinder f578a;

            C0176a(IBinder iBinder) {
                this.f578a = iBinder;
            }

            /* renamed from: a */
            public void mo747a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f578a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f578a;
            }
        }

        public C0175a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static C0174a m795a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0174a)) ? new C0176a(iBinder) : (C0174a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                    mo747a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("android.support.v4.os.IResultReceiver");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo747a(int i, Bundle bundle);
}
