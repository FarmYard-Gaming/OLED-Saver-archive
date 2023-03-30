package android.support.p006v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
class C0320c {

    /* renamed from: android.support.v4.media.session.c$a */
    public interface C0321a {
        /* renamed from: a */
        void mo1246a();

        /* renamed from: a */
        void mo1247a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo1248a(Bundle bundle);

        /* renamed from: a */
        void mo1249a(CharSequence charSequence);

        /* renamed from: a */
        void mo1250a(Object obj);

        /* renamed from: a */
        void mo1251a(String str, Bundle bundle);

        /* renamed from: a */
        void mo1252a(List<?> list);

        /* renamed from: b */
        void mo1253b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.c$b */
    static class C0322b<T extends C0321a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f901a;

        public C0322b(T t) {
            this.f901a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f901a.mo1247a(playbackInfo.getPlaybackType(), C0323c.m1484b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m1327a(bundle);
            this.f901a.mo1248a(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f901a.mo1253b(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f901a.mo1250a((Object) playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f901a.mo1252a((List<?>) list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f901a.mo1249a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f901a.mo1246a();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m1327a(bundle);
            this.f901a.mo1251a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    public static class C0323c {
        /* renamed from: a */
        private static int m1482a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 2:
                    return 0;
                case 3:
                    return 8;
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
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }

        /* renamed from: a */
        public static AudioAttributes m1483a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m1484b(Object obj) {
            return m1482a(m1483a(obj));
        }
    }

    /* renamed from: a */
    public static Object m1473a(C0321a aVar) {
        return new C0322b(aVar);
    }
}
