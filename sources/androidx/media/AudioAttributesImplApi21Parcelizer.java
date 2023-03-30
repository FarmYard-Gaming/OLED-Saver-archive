package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.C0637a;

public final class AudioAttributesImplApi21Parcelizer {
    public static C0295b read(C0637a aVar) {
        C0295b bVar = new C0295b();
        bVar.mAudioAttributes = (AudioAttributes) aVar.mo3254b(bVar.mAudioAttributes, 1);
        bVar.mLegacyStreamType = aVar.mo3253b(bVar.mLegacyStreamType, 2);
        return bVar;
    }

    public static void write(C0295b bVar, C0637a aVar) {
        aVar.mo3249a(false, false);
        aVar.mo3244a((Parcelable) bVar.mAudioAttributes, 1);
        aVar.mo3242a(bVar.mLegacyStreamType, 2);
    }
}
