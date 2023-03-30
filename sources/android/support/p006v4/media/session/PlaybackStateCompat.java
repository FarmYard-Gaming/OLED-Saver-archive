package android.support.p006v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p006v4.media.session.C0326e;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: a */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };

    /* renamed from: a */
    final int f882a;

    /* renamed from: b */
    final long f883b;

    /* renamed from: c */
    final long f884c;

    /* renamed from: d */
    final float f885d;

    /* renamed from: e */
    final long f886e;

    /* renamed from: f */
    final int f887f;

    /* renamed from: g */
    final CharSequence f888g;

    /* renamed from: h */
    final long f889h;

    /* renamed from: i */
    List<CustomAction> f890i;

    /* renamed from: j */
    final long f891j;

    /* renamed from: k */
    final Bundle f892k;

    /* renamed from: l */
    private Object f893l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: a */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* renamed from: a */
        private final String f894a;

        /* renamed from: b */
        private final CharSequence f895b;

        /* renamed from: c */
        private final int f896c;

        /* renamed from: d */
        private final Bundle f897d;

        /* renamed from: e */
        private Object f898e;

        CustomAction(Parcel parcel) {
            this.f894a = parcel.readString();
            this.f895b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f896c = parcel.readInt();
            this.f897d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f894a = str;
            this.f895b = charSequence;
            this.f896c = i;
            this.f897d = bundle;
        }

        /* renamed from: a */
        public static CustomAction m1344a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0326e.C0327a.m1496a(obj), C0326e.C0327a.m1497b(obj), C0326e.C0327a.m1498c(obj), C0326e.C0327a.m1499d(obj));
            customAction.f898e = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f895b + ", mIcon=" + this.f896c + ", mExtras=" + this.f897d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f894a);
            TextUtils.writeToParcel(this.f895b, parcel, i);
            parcel.writeInt(this.f896c);
            parcel.writeBundle(this.f897d);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f882a = i;
        this.f883b = j;
        this.f884c = j2;
        this.f885d = f;
        this.f886e = j3;
        this.f887f = i2;
        this.f888g = charSequence;
        this.f889h = j4;
        this.f890i = new ArrayList(list);
        this.f891j = j5;
        this.f892k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f882a = parcel.readInt();
        this.f883b = parcel.readLong();
        this.f885d = parcel.readFloat();
        this.f889h = parcel.readLong();
        this.f884c = parcel.readLong();
        this.f886e = parcel.readLong();
        this.f888g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f890i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f891j = parcel.readLong();
        this.f892k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f887f = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m1341a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> h = C0326e.m1494h(obj);
        ArrayList arrayList = null;
        if (h != null) {
            arrayList = new ArrayList(h.size());
            for (Object a : h) {
                arrayList.add(CustomAction.m1344a(a));
            }
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0326e.m1487a(obj), C0326e.m1488b(obj), C0326e.m1489c(obj), C0326e.m1490d(obj), C0326e.m1491e(obj), 0, C0326e.m1492f(obj), C0326e.m1493g(obj), arrayList, C0326e.m1495i(obj), Build.VERSION.SDK_INT >= 22 ? C0328f.m1500a(obj) : null);
        playbackStateCompat.f893l = obj;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=").append(this.f882a);
        sb.append(", position=").append(this.f883b);
        sb.append(", buffered position=").append(this.f884c);
        sb.append(", speed=").append(this.f885d);
        sb.append(", updated=").append(this.f889h);
        sb.append(", actions=").append(this.f886e);
        sb.append(", error code=").append(this.f887f);
        sb.append(", error message=").append(this.f888g);
        sb.append(", custom actions=").append(this.f890i);
        sb.append(", active item id=").append(this.f891j);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f882a);
        parcel.writeLong(this.f883b);
        parcel.writeFloat(this.f885d);
        parcel.writeLong(this.f889h);
        parcel.writeLong(this.f884c);
        parcel.writeLong(this.f886e);
        TextUtils.writeToParcel(this.f888g, parcel, i);
        parcel.writeTypedList(this.f890i);
        parcel.writeLong(this.f891j);
        parcel.writeBundle(this.f892k);
        parcel.writeInt(this.f887f);
    }
}
