package android.support.p006v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
class C0326e {

    /* renamed from: android.support.v4.media.session.e$a */
    static final class C0327a {
        /* renamed from: a */
        public static String m1496a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static CharSequence m1497b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        /* renamed from: c */
        public static int m1498c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static Bundle m1499d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }
    }

    /* renamed from: a */
    public static int m1487a(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* renamed from: b */
    public static long m1488b(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: c */
    public static long m1489c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static float m1490d(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: e */
    public static long m1491e(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: f */
    public static CharSequence m1492f(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: g */
    public static long m1493g(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: h */
    public static List<Object> m1494h(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: i */
    public static long m1495i(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }
}
