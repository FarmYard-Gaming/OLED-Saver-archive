package android.support.p018v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p006v4.p007a.C0086c;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.app.k */
class C0412k {

    /* renamed from: a */
    private static C0412k f1233a;

    /* renamed from: b */
    private final Context f1234b;

    /* renamed from: c */
    private final LocationManager f1235c;

    /* renamed from: d */
    private final C0413a f1236d = new C0413a();

    /* renamed from: android.support.v7.app.k$a */
    private static class C0413a {

        /* renamed from: a */
        boolean f1237a;

        /* renamed from: b */
        long f1238b;

        /* renamed from: c */
        long f1239c;

        /* renamed from: d */
        long f1240d;

        /* renamed from: e */
        long f1241e;

        /* renamed from: f */
        long f1242f;

        C0413a() {
        }
    }

    C0412k(Context context, LocationManager locationManager) {
        this.f1234b = context;
        this.f1235c = locationManager;
    }

    /* renamed from: a */
    private Location m1886a(String str) {
        try {
            if (this.f1235c.isProviderEnabled(str)) {
                return this.f1235c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: a */
    static C0412k m1887a(Context context) {
        if (f1233a == null) {
            Context applicationContext = context.getApplicationContext();
            f1233a = new C0412k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1233a;
    }

    /* renamed from: a */
    private void m1888a(Location location) {
        long j;
        C0413a aVar = this.f1236d;
        long currentTimeMillis = System.currentTimeMillis();
        C0411j a = C0411j.m1884a();
        a.mo1706a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f1230a;
        a.mo1706a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f1232c == 1;
        long j3 = a.f1231b;
        long j4 = a.f1230a;
        a.mo1706a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a.f1231b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f1237a = z;
        aVar.f1238b = j2;
        aVar.f1239c = j3;
        aVar.f1240d = j4;
        aVar.f1241e = j5;
        aVar.f1242f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m1889b() {
        Location location = null;
        Location a = C0086c.m284a(this.f1234b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1886a("network") : null;
        if (C0086c.m284a(this.f1234b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m1886a("gps");
        }
        if (location != null && a != null) {
            return location.getTime() > a.getTime() ? location : a;
        }
        if (location == null) {
            location = a;
        }
        return location;
    }

    /* renamed from: c */
    private boolean m1890c() {
        return this.f1236d.f1242f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1707a() {
        C0413a aVar = this.f1236d;
        if (m1890c()) {
            return aVar.f1237a;
        }
        Location b = m1889b();
        if (b != null) {
            m1888a(b);
            return aVar.f1237a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
