package android.support.p006v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.support.p006v4.app.C0164w;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: android.support.v4.app.y */
class C0169y {

    /* renamed from: a */
    private static final Object f571a = new Object();

    /* renamed from: b */
    private static Field f572b;

    /* renamed from: c */
    private static boolean f573c;

    /* renamed from: d */
    private static final Object f574d = new Object();

    /* renamed from: a */
    public static Bundle m782a(Notification.Builder builder, C0164w.C0165a aVar) {
        builder.addAction(aVar.mo694a(), aVar.mo695b(), aVar.mo696c());
        Bundle bundle = new Bundle(aVar.mo697d());
        if (aVar.mo699f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m787a(aVar.mo699f()));
        }
        if (aVar.mo701h() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m787a(aVar.mo701h()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo698e());
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m783a(Notification notification) {
        synchronized (f571a) {
            if (f573c) {
                return null;
            }
            try {
                if (f572b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f573c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f572b = declaredField;
                }
                Bundle bundle = (Bundle) f572b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f572b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f573c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f573c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Bundle m784a(C0093aa aaVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", aaVar.mo295a());
        bundle.putCharSequence("label", aaVar.mo296b());
        bundle.putCharSequenceArray("choices", aaVar.mo297c());
        bundle.putBoolean("allowFreeFormInput", aaVar.mo299e());
        bundle.putBundle("extras", aaVar.mo300f());
        Set<String> d = aaVar.mo298d();
        if (d != null && !d.isEmpty()) {
            ArrayList arrayList = new ArrayList(d.size());
            for (String add : d) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    static Bundle m785a(C0164w.C0165a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("icon", aVar.mo694a());
        bundle.putCharSequence("title", aVar.mo695b());
        bundle.putParcelable("actionIntent", aVar.mo696c());
        Bundle bundle2 = aVar.mo697d() != null ? new Bundle(aVar.mo697d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.mo698e());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m787a(aVar.mo699f()));
        bundle.putBoolean("showsUserInterface", aVar.mo702i());
        bundle.putInt("semanticAction", aVar.mo700g());
        return bundle;
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m786a(List<Bundle> list) {
        SparseArray<Bundle> sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    private static Bundle[] m787a(C0093aa[] aaVarArr) {
        if (aaVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[aaVarArr.length];
        for (int i = 0; i < aaVarArr.length; i++) {
            bundleArr[i] = m784a(aaVarArr[i]);
        }
        return bundleArr;
    }
}
