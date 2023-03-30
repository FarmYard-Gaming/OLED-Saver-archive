package android.support.p006v4.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.C0639c;

/* renamed from: android.support.v4.media.AudioAttributesCompat */
public class AudioAttributesCompat implements C0639c {

    /* renamed from: b */
    private static final SparseIntArray f808b = new SparseIntArray();

    /* renamed from: c */
    private static final int[] f809c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: a */
    C0294a f810a;

    static {
        f808b.put(5, 1);
        f808b.put(6, 2);
        f808b.put(7, 2);
        f808b.put(8, 1);
        f808b.put(9, 1);
        f808b.put(10, 1);
    }

    AudioAttributesCompat() {
    }

    /* renamed from: a */
    static int m1229a(boolean z, int i, int i2) {
        int i3 = 0;
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
                return z ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                if (!z) {
                    i3 = 8;
                }
                return i3;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
        }
    }

    /* renamed from: a */
    static String m1230a(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage " + i;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        return this.f810a == null ? audioAttributesCompat.f810a == null : this.f810a.equals(audioAttributesCompat.f810a);
    }

    public int hashCode() {
        return this.f810a.hashCode();
    }

    public String toString() {
        return this.f810a.toString();
    }
}
