package androidx.media;

import androidx.versionedparcelable.C0637a;

public final class AudioAttributesImplBaseParcelizer {
    public static C0296c read(C0637a aVar) {
        C0296c cVar = new C0296c();
        cVar.mUsage = aVar.mo3253b(cVar.mUsage, 1);
        cVar.mContentType = aVar.mo3253b(cVar.mContentType, 2);
        cVar.mFlags = aVar.mo3253b(cVar.mFlags, 3);
        cVar.mLegacyStream = aVar.mo3253b(cVar.mLegacyStream, 4);
        return cVar;
    }

    public static void write(C0296c cVar, C0637a aVar) {
        aVar.mo3249a(false, false);
        aVar.mo3242a(cVar.mUsage, 1);
        aVar.mo3242a(cVar.mContentType, 2);
        aVar.mo3242a(cVar.mFlags, 3);
        aVar.mo3242a(cVar.mLegacyStream, 4);
    }
}
