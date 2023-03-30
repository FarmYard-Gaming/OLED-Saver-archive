package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.support.p006v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C0637a;

public class IconCompatParcelizer {
    public static IconCompat read(C0637a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f770a = aVar.mo3253b(iconCompat.f770a, 1);
        iconCompat.f772c = aVar.mo3259b(iconCompat.f772c, 2);
        iconCompat.f773d = aVar.mo3254b(iconCompat.f773d, 3);
        iconCompat.f774e = aVar.mo3253b(iconCompat.f774e, 4);
        iconCompat.f775f = aVar.mo3253b(iconCompat.f775f, 5);
        iconCompat.f776g = (ColorStateList) aVar.mo3254b(iconCompat.f776g, 6);
        iconCompat.f778j = aVar.mo3256b(iconCompat.f778j, 7);
        iconCompat.mo1106c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C0637a aVar) {
        aVar.mo3249a(true, true);
        iconCompat.mo1104a(aVar.mo3252a());
        aVar.mo3242a(iconCompat.f770a, 1);
        aVar.mo3251a(iconCompat.f772c, 2);
        aVar.mo3244a(iconCompat.f773d, 3);
        aVar.mo3242a(iconCompat.f774e, 4);
        aVar.mo3242a(iconCompat.f775f, 5);
        aVar.mo3244a((Parcelable) iconCompat.f776g, 6);
        aVar.mo3248a(iconCompat.f778j, 7);
    }
}
