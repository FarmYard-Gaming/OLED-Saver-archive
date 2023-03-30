package android.support.p006v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.d */
class C0297d {

    /* renamed from: android.support.v4.media.d$a */
    static class C0298a {
        /* renamed from: a */
        public static Object m1274a() {
            return new MediaDescription.Builder();
        }

        /* renamed from: a */
        public static Object m1275a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* renamed from: a */
        public static void m1276a(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m1277a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m1278a(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static void m1279a(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        /* renamed from: a */
        public static void m1280a(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: b */
        public static void m1281b(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m1282c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }
    }

    /* renamed from: a */
    public static Object m1265a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static String m1266a(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: a */
    public static void m1267a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: b */
    public static CharSequence m1268b(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: c */
    public static CharSequence m1269c(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: d */
    public static CharSequence m1270d(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: e */
    public static Bitmap m1271e(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m1272f(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: g */
    public static Bundle m1273g(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }
}
