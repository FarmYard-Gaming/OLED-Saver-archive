package android.support.p006v4.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* renamed from: android.support.v4.media.b */
class C0295b implements C0294a {

    /* renamed from: a */
    AudioAttributes f847a;

    /* renamed from: b */
    int f848b = -1;

    C0295b() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0295b)) {
            return false;
        }
        return this.f847a.equals(((C0295b) obj).f847a);
    }

    public int hashCode() {
        return this.f847a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f847a;
    }
}
