package android.support.p006v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p006v4.media.session.MediaSessionCompat;
import android.support.p006v4.p014f.C0199a;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() {
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: a */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    };

    /* renamed from: a */
    static final C0199a<String, Integer> f839a = new C0199a<>();

    /* renamed from: c */
    private static final String[] f840c = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: d */
    private static final String[] f841d = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: e */
    private static final String[] f842e = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    final Bundle f843b;

    /* renamed from: f */
    private Object f844f;

    static {
        f839a.put("android.media.metadata.TITLE", 1);
        f839a.put("android.media.metadata.ARTIST", 1);
        f839a.put("android.media.metadata.DURATION", 0);
        f839a.put("android.media.metadata.ALBUM", 1);
        f839a.put("android.media.metadata.AUTHOR", 1);
        f839a.put("android.media.metadata.WRITER", 1);
        f839a.put("android.media.metadata.COMPOSER", 1);
        f839a.put("android.media.metadata.COMPILATION", 1);
        f839a.put("android.media.metadata.DATE", 1);
        f839a.put("android.media.metadata.YEAR", 0);
        f839a.put("android.media.metadata.GENRE", 1);
        f839a.put("android.media.metadata.TRACK_NUMBER", 0);
        f839a.put("android.media.metadata.NUM_TRACKS", 0);
        f839a.put("android.media.metadata.DISC_NUMBER", 0);
        f839a.put("android.media.metadata.ALBUM_ARTIST", 1);
        f839a.put("android.media.metadata.ART", 2);
        f839a.put("android.media.metadata.ART_URI", 1);
        f839a.put("android.media.metadata.ALBUM_ART", 2);
        f839a.put("android.media.metadata.ALBUM_ART_URI", 1);
        f839a.put("android.media.metadata.USER_RATING", 3);
        f839a.put("android.media.metadata.RATING", 3);
        f839a.put("android.media.metadata.DISPLAY_TITLE", 1);
        f839a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f839a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f839a.put("android.media.metadata.DISPLAY_ICON", 2);
        f839a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f839a.put("android.media.metadata.MEDIA_ID", 1);
        f839a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        f839a.put("android.media.metadata.MEDIA_URI", 1);
        f839a.put("android.media.metadata.ADVERTISEMENT", 0);
        f839a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f843b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m1256a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0301f.m1285a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f844f = obj;
        return createFromParcel;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f843b);
    }
}
