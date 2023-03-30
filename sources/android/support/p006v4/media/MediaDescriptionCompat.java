package android.support.p006v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p006v4.media.C0297d;
import android.support.p006v4.media.C0299e;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m1243a(C0297d.m1265a(parcel));
        }

        /* renamed from: a */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    /* renamed from: a */
    private final String f822a;

    /* renamed from: b */
    private final CharSequence f823b;

    /* renamed from: c */
    private final CharSequence f824c;

    /* renamed from: d */
    private final CharSequence f825d;

    /* renamed from: e */
    private final Bitmap f826e;

    /* renamed from: f */
    private final Uri f827f;

    /* renamed from: g */
    private final Bundle f828g;

    /* renamed from: h */
    private final Uri f829h;

    /* renamed from: i */
    private Object f830i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0291a {

        /* renamed from: a */
        private String f831a;

        /* renamed from: b */
        private CharSequence f832b;

        /* renamed from: c */
        private CharSequence f833c;

        /* renamed from: d */
        private CharSequence f834d;

        /* renamed from: e */
        private Bitmap f835e;

        /* renamed from: f */
        private Uri f836f;

        /* renamed from: g */
        private Bundle f837g;

        /* renamed from: h */
        private Uri f838h;

        /* renamed from: a */
        public C0291a mo1192a(Bitmap bitmap) {
            this.f835e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0291a mo1193a(Uri uri) {
            this.f836f = uri;
            return this;
        }

        /* renamed from: a */
        public C0291a mo1194a(Bundle bundle) {
            this.f837g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0291a mo1195a(CharSequence charSequence) {
            this.f832b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0291a mo1196a(String str) {
            this.f831a = str;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo1197a() {
            return new MediaDescriptionCompat(this.f831a, this.f832b, this.f833c, this.f834d, this.f835e, this.f836f, this.f837g, this.f838h);
        }

        /* renamed from: b */
        public C0291a mo1198b(Uri uri) {
            this.f838h = uri;
            return this;
        }

        /* renamed from: b */
        public C0291a mo1199b(CharSequence charSequence) {
            this.f833c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0291a mo1200c(CharSequence charSequence) {
            this.f834d = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f822a = parcel.readString();
        this.f823b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f824c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f825d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f826e = (Bitmap) parcel.readParcelable(classLoader);
        this.f827f = (Uri) parcel.readParcelable(classLoader);
        this.f828g = parcel.readBundle(classLoader);
        this.f829h = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f822a = str;
        this.f823b = charSequence;
        this.f824c = charSequence2;
        this.f825d = charSequence3;
        this.f826e = bitmap;
        this.f827f = uri;
        this.f828g = bundle;
        this.f829h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p006v4.media.MediaDescriptionCompat m1243a(java.lang.Object r6) {
        /*
            r1 = 0
            if (r6 == 0) goto L_0x006a
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x006a
            android.support.v4.media.MediaDescriptionCompat$a r4 = new android.support.v4.media.MediaDescriptionCompat$a
            r4.<init>()
            java.lang.String r0 = android.support.p006v4.media.C0297d.m1266a((java.lang.Object) r6)
            r4.mo1196a((java.lang.String) r0)
            java.lang.CharSequence r0 = android.support.p006v4.media.C0297d.m1268b(r6)
            r4.mo1195a((java.lang.CharSequence) r0)
            java.lang.CharSequence r0 = android.support.p006v4.media.C0297d.m1269c(r6)
            r4.mo1199b((java.lang.CharSequence) r0)
            java.lang.CharSequence r0 = android.support.p006v4.media.C0297d.m1270d(r6)
            r4.mo1200c(r0)
            android.graphics.Bitmap r0 = android.support.p006v4.media.C0297d.m1271e(r6)
            r4.mo1192a((android.graphics.Bitmap) r0)
            android.net.Uri r0 = android.support.p006v4.media.C0297d.m1272f(r6)
            r4.mo1193a((android.net.Uri) r0)
            android.os.Bundle r2 = android.support.p006v4.media.C0297d.m1273g(r6)
            if (r2 == 0) goto L_0x0085
            android.support.p006v4.media.session.MediaSessionCompat.m1327a(r2)
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r3 = r0
        L_0x004a:
            if (r3 == 0) goto L_0x0075
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x006b
            int r0 = r2.size()
            r5 = 2
            if (r0 != r5) goto L_0x006b
            r0 = r1
        L_0x005c:
            r4.mo1194a((android.os.Bundle) r0)
            if (r3 == 0) goto L_0x0077
            r4.mo1198b((android.net.Uri) r3)
        L_0x0064:
            android.support.v4.media.MediaDescriptionCompat r1 = r4.mo1197a()
            r1.f830i = r6
        L_0x006a:
            return r1
        L_0x006b:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L_0x0075:
            r0 = r2
            goto L_0x005c
        L_0x0077:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0064
            android.net.Uri r0 = android.support.p006v4.media.C0299e.m1283a(r6)
            r4.mo1198b((android.net.Uri) r0)
            goto L_0x0064
        L_0x0085:
            r3 = r1
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.media.MediaDescriptionCompat.m1243a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: a */
    public Object mo1184a() {
        if (this.f830i != null || Build.VERSION.SDK_INT < 21) {
            return this.f830i;
        }
        Object a = C0297d.C0298a.m1274a();
        C0297d.C0298a.m1280a(a, this.f822a);
        C0297d.C0298a.m1279a(a, this.f823b);
        C0297d.C0298a.m1281b(a, this.f824c);
        C0297d.C0298a.m1282c(a, this.f825d);
        C0297d.C0298a.m1276a(a, this.f826e);
        C0297d.C0298a.m1277a(a, this.f827f);
        Bundle bundle = this.f828g;
        if (Build.VERSION.SDK_INT < 23 && this.f829h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f829h);
        }
        C0297d.C0298a.m1278a(a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0299e.C0300a.m1284a(a, this.f829h);
        }
        this.f830i = C0297d.C0298a.m1275a(a);
        return this.f830i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f823b + ", " + this.f824c + ", " + this.f825d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f822a);
            TextUtils.writeToParcel(this.f823b, parcel, i);
            TextUtils.writeToParcel(this.f824c, parcel, i);
            TextUtils.writeToParcel(this.f825d, parcel, i);
            parcel.writeParcelable(this.f826e, i);
            parcel.writeParcelable(this.f827f, i);
            parcel.writeBundle(this.f828g);
            parcel.writeParcelable(this.f829h, i);
            return;
        }
        C0297d.m1267a(mo1184a(), parcel, i);
    }
}
