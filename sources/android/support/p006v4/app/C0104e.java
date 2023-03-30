package android.support.p006v4.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.e */
public final class C0104e {

    /* renamed from: android.support.v4.app.e$a */
    static class C0105a {

        /* renamed from: a */
        private static Method f269a;

        /* renamed from: b */
        private static boolean f270b;

        /* renamed from: a */
        public static IBinder m352a(Bundle bundle, String str) {
            if (!f270b) {
                try {
                    f269a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f269a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f270b = true;
            }
            if (f269a != null) {
                try {
                    return (IBinder) f269a.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f269a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static IBinder m351a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C0105a.m352a(bundle, str);
    }
}
