package android.support.p006v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p006v4.media.session.MediaSessionCompat;
import android.support.p006v4.p011c.C0177b;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f811a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends C0177b {

        /* renamed from: d */
        private final String f812d;

        /* renamed from: e */
        private final Bundle f813e;

        /* renamed from: f */
        private final C0287a f814f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo751a(int i, Bundle bundle) {
            if (this.f814f != null) {
                MediaSessionCompat.m1327a(bundle);
                switch (i) {
                    case -1:
                        this.f814f.mo1179c(this.f812d, this.f813e, bundle);
                        return;
                    case 0:
                        this.f814f.mo1178b(this.f812d, this.f813e, bundle);
                        return;
                    case 1:
                        this.f814f.mo1177a(this.f812d, this.f813e, bundle);
                        return;
                    default:
                        Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f813e + ", resultData=" + bundle + ")");
                        return;
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends C0177b {

        /* renamed from: d */
        private final String f815d;

        /* renamed from: e */
        private final C0288b f816e;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo751a(int i, Bundle bundle) {
            MediaSessionCompat.m1327a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f816e.mo1181a(this.f815d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f816e.mo1180a((MediaItem) parcelable);
            } else {
                this.f816e.mo1181a(this.f815d);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: a */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };

        /* renamed from: a */
        private final int f817a;

        /* renamed from: b */
        private final MediaDescriptionCompat f818b;

        MediaItem(Parcel parcel) {
            this.f817a = parcel.readInt();
            this.f818b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.f817a);
            sb.append(", mDescription=").append(this.f818b);
            sb.append('}');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f817a);
            this.f818b.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends C0177b {

        /* renamed from: d */
        private final String f819d;

        /* renamed from: e */
        private final Bundle f820e;

        /* renamed from: f */
        private final C0289c f821f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo751a(int i, Bundle bundle) {
            MediaSessionCompat.m1327a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f821f.mo1182a(this.f819d, this.f820e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList2.add((MediaItem) parcelable);
                }
                arrayList = arrayList2;
            }
            this.f821f.mo1183a(this.f819d, this.f820e, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static abstract class C0287a {
        /* renamed from: a */
        public void mo1177a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void mo1178b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void mo1179c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static abstract class C0288b {
        /* renamed from: a */
        public void mo1180a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void mo1181a(String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0289c {
        /* renamed from: a */
        public void mo1182a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1183a(String str, Bundle bundle, List<MediaItem> list) {
        }
    }
}
