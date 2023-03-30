package androidx.media;

import android.support.p006v4.media.AudioAttributesCompat;
import androidx.versionedparcelable.C0637a;
import androidx.versionedparcelable.C0639c;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C0637a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.mImpl = (C0294a) aVar.mo3255b(audioAttributesCompat.mImpl, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C0637a aVar) {
        aVar.mo3249a(false, false);
        aVar.mo3246a((C0639c) audioAttributesCompat.mImpl, 1);
    }
}
