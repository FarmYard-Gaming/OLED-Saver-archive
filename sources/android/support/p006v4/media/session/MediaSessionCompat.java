package android.support.p006v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p006v4.media.MediaDescriptionCompat;
import android.support.p006v4.media.session.C0324d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: a */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };

        /* renamed from: a */
        private final MediaDescriptionCompat f870a;

        /* renamed from: b */
        private final long f871b;

        /* renamed from: c */
        private Object f872c;

        QueueItem(Parcel parcel) {
            this.f870a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f871b = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            } else {
                this.f870a = mediaDescriptionCompat;
                this.f871b = j;
                this.f872c = obj;
            }
        }

        /* renamed from: a */
        public static QueueItem m1328a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m1243a(C0324d.C0325a.m1485a(obj)), C0324d.C0325a.m1486b(obj));
        }

        /* renamed from: a */
        public static List<QueueItem> m1329a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m1328a((Object) a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f870a + ", Id=" + this.f871b + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f870a.writeToParcel(parcel, i);
            parcel.writeLong(this.f871b);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: a */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };

        /* renamed from: a */
        ResultReceiver f873a;

        ResultReceiverWrapper(Parcel parcel) {
            this.f873a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f873a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
            }

            /* renamed from: a */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        };

        /* renamed from: a */
        private final Object f874a;

        /* renamed from: b */
        private C0317b f875b;

        /* renamed from: c */
        private Bundle f876c;

        Token(Object obj) {
            this(obj, (C0317b) null, (Bundle) null);
        }

        Token(Object obj, C0317b bVar, Bundle bundle) {
            this.f874a = obj;
            this.f875b = bVar;
            this.f876c = bundle;
        }

        /* renamed from: a */
        public C0317b mo1274a() {
            return this.f875b;
        }

        /* renamed from: a */
        public void mo1275a(Bundle bundle) {
            this.f876c = bundle;
        }

        /* renamed from: a */
        public void mo1276a(C0317b bVar) {
            this.f875b = bVar;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.f874a == null) {
                return token.f874a == null;
            }
            if (token.f874a == null) {
                return false;
            }
            return this.f874a.equals(token.f874a);
        }

        public int hashCode() {
            if (this.f874a == null) {
                return 0;
            }
            return this.f874a.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f874a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f874a);
            }
        }
    }

    /* renamed from: a */
    public static void m1327a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
