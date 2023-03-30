package android.support.p006v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.e */
class C0299e {

    /* renamed from: android.support.v4.media.e$a */
    static class C0300a {
        /* renamed from: a */
        public static void m1284a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m1283a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
