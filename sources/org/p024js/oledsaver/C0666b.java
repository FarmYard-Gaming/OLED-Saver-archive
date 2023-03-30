package org.p024js.oledsaver;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Log;
import java.util.Observable;
import java.util.Observer;
import org.p024js.oledsaver.p030d.C0705b;
import org.p024js.oledsaver.p031e.C0715d;
import org.p024js.oledsaver.p031e.C0719h;
import org.p024js.oledsaver.p031e.C0720i;

/* renamed from: org.js.oledsaver.b */
public class C0666b extends Observable implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: b */
    private static C0666b f2392b;

    /* renamed from: a */
    private final String f2393a = getClass().getSimpleName();

    /* renamed from: c */
    private SharedPreferences f2394c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f2395d;

    /* renamed from: e */
    private C0668a f2396e;

    /* renamed from: f */
    private boolean f2397f = false;

    /* renamed from: g */
    private int f2398g;

    /* renamed from: h */
    private boolean f2399h;

    /* renamed from: i */
    private boolean f2400i;

    /* renamed from: j */
    private boolean f2401j;

    /* renamed from: k */
    private float f2402k;

    /* renamed from: l */
    private float f2403l = -1.0f;

    /* renamed from: m */
    private int f2404m;

    /* renamed from: n */
    private int f2405n;

    /* renamed from: o */
    private int f2406o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f2407p;

    /* renamed from: q */
    private float f2408q;

    /* renamed from: r */
    private float f2409r;

    /* renamed from: org.js.oledsaver.b$a */
    private class C0668a extends ContentObserver {
        public C0668a() {
            super(new Handler());
        }

        public void onChange(boolean z, Uri uri) {
            if ("content://settings/system/screen_brightness".equals(uri.toString())) {
                if (Settings.System.getInt(C0666b.this.f2395d.getContentResolver(), "screen_brightness", 0) != C0666b.this.f2407p && !C0666b.this.mo3403h() && C0720i.m3491b(C0666b.this.f2395d)) {
                    C0719h.m3482a(C0666b.this.f2395d).mo3529b(C0666b.this.f2407p);
                }
            } else if ("content://settings/system/screen_brightness_mode".equals(uri.toString()) && Settings.System.getInt(C0666b.this.f2395d.getContentResolver(), "screen_brightness_mode", 0) != 0 && C0720i.m3491b(C0666b.this.f2395d)) {
                C0715d.m3469a(C0666b.this.f2395d);
                C0666b.this.mo3390b(0);
            }
        }
    }

    private C0666b(Context context) {
        this.f2395d = context;
        this.f2394c = PreferenceManager.getDefaultSharedPreferences(context);
        mo3381a();
        this.f2407p = 0;
    }

    /* renamed from: a */
    public static C0666b m3223a(Context context) {
        if (f2392b == null) {
            f2392b = new C0666b(context);
        }
        return f2392b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3224a(String str) {
        setChanged();
        super.notifyObservers(str);
    }

    /* renamed from: c */
    public static int m3227c(float f) {
        return Math.min(255, Math.max(8, (int) f));
    }

    /* renamed from: q */
    private void m3228q() {
        if (!this.f2397f) {
            Log.d(this.f2393a, "setup data listeners");
            this.f2397f = true;
            mo3381a();
            this.f2394c.registerOnSharedPreferenceChangeListener(this);
            this.f2396e = new C0668a();
            this.f2395d.getContentResolver().registerContentObserver(Uri.withAppendedPath(Settings.System.CONTENT_URI, "screen_brightness_mode"), true, this.f2396e);
            this.f2395d.getContentResolver().registerContentObserver(Uri.withAppendedPath(Settings.System.CONTENT_URI, "screen_brightness"), true, this.f2396e);
        }
    }

    /* renamed from: r */
    private void m3229r() {
        if (this.f2397f) {
            Log.d(this.f2393a, "removing data listeners");
            this.f2397f = false;
            this.f2394c.unregisterOnSharedPreferenceChangeListener(this);
            this.f2395d.getContentResolver().unregisterContentObserver(this.f2396e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3381a() {
        this.f2399h = this.f2394c.getBoolean("serviceEnabled", false);
        this.f2402k = this.f2394c.getFloat("userAdjustment", 0.0f);
        this.f2408q = this.f2394c.getFloat("userLux", -1.0f);
        this.f2409r = this.f2394c.getFloat("userBrightness", -1.0f);
        this.f2404m = this.f2394c.getInt("brightness", 127);
        this.f2405n = Settings.System.getInt(this.f2395d.getContentResolver(), "screen_brightness_mode", 0);
        this.f2406o = Integer.parseInt(this.f2394c.getString("senseIntervalMs", "5000"));
        this.f2398g = this.f2394c.getInt("miniumScreenBrightness", 255);
        C0646a.f2330a = Integer.parseInt(this.f2394c.getString("pixelFilterPercent", "0"));
        C0646a.f2332c = this.f2394c.getInt("modelOffsetValue", 20);
        mo3391b(this.f2394c.getBoolean("autoEnabled", true));
        mo3386a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3382a(float f) {
        mo3384a(f, false);
    }

    /* renamed from: a */
    public void mo3383a(float f, float f2, boolean z) {
        this.f2408q = f;
        this.f2409r = f2;
        if (z) {
            this.f2394c.edit().putFloat("userLux", this.f2408q).commit();
            this.f2394c.edit().putFloat("userBrightness", this.f2409r).commit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3384a(float f, boolean z) {
        if (f != this.f2402k) {
            this.f2402k = f;
            if (z) {
                this.f2394c.edit().putFloat("userAdjustment", f).commit();
            }
            m3224a("userAdjustment");
        }
    }

    /* renamed from: a */
    public void mo3385a(int i) {
        this.f2398g = i;
        m3224a("lux");
    }

    /* renamed from: a */
    public void mo3386a(boolean z) {
        this.f2401j = z;
    }

    public void addObserver(Observer observer) {
        Log.d(this.f2393a, "adding observer: #" + countObservers());
        if (!this.f2397f) {
            m3228q();
        }
        super.addObserver(observer);
    }

    /* renamed from: b */
    public void mo3388b() {
        MyApp.m3161a(this.f2395d, this.f2394c.getBoolean("excludeFromRecents", false));
    }

    /* renamed from: b */
    public void mo3389b(float f) {
        this.f2403l = f;
        C0705b.m3445a().mo3508a(new Runnable() {
            public void run() {
                C0666b.this.m3224a("lux");
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3390b(int i) {
        Settings.System.putInt(this.f2395d.getContentResolver(), "screen_brightness_mode", i);
        this.f2405n = i;
    }

    /* renamed from: b */
    public void mo3391b(boolean z) {
        this.f2400i = z;
        this.f2394c.edit().putBoolean("autoEnabled", this.f2400i).commit();
        m3224a("auto");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3392c(int i) {
        int min = Math.min(Math.max(i, 8), 255);
        if (this.f2404m != min) {
            this.f2404m = min;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3393c(boolean z) {
        if (z != this.f2399h) {
            this.f2399h = z;
            m3224a("serviceEnabled");
        }
    }

    /* renamed from: c */
    public boolean mo3394c() {
        return this.f2394c.getBoolean("firstRun", true);
    }

    /* renamed from: d */
    public void mo3395d() {
        this.f2394c.edit().putBoolean("firstRun", false).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3396d(int i) {
        this.f2394c.edit().putInt("brightness", i).commit();
    }

    public synchronized void deleteObserver(Observer observer) {
        super.deleteObserver(observer);
        if (countObservers() == 0) {
            m3229r();
        }
    }

    public synchronized void deleteObservers() {
        super.deleteObservers();
        m3229r();
    }

    /* renamed from: e */
    public void mo3399e(int i) {
        this.f2407p = i;
    }

    /* renamed from: e */
    public boolean mo3400e() {
        return this.f2394c.getBoolean("modelOffset", false);
    }

    /* renamed from: f */
    public void mo3401f() {
        this.f2394c.edit().putBoolean("modelOffset", true).commit();
    }

    /* renamed from: g */
    public int mo3402g() {
        return this.f2398g;
    }

    /* renamed from: h */
    public boolean mo3403h() {
        return this.f2401j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo3404i() {
        return this.f2402k;
    }

    /* renamed from: j */
    public float mo3405j() {
        return this.f2408q;
    }

    /* renamed from: k */
    public float mo3406k() {
        return this.f2409r;
    }

    /* renamed from: l */
    public boolean mo3407l() {
        return this.f2400i;
    }

    /* renamed from: m */
    public void mo3408m() {
        this.f2394c.edit().putInt("modelOffsetValue", C0646a.f2332c).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo3409n() {
        return this.f2405n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo3410o() {
        return this.f2404m;
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Log.d(this.f2393a, "pref changed: " + str);
        if (str.equals("miniumScreenBrightness")) {
            mo3385a(sharedPreferences.getInt(str, 255));
        } else if (str.equals("userAdjustment")) {
            mo3382a(sharedPreferences.getFloat(str, 0.0f));
        } else if (str.equals("pixelFilterPercent")) {
            C0646a.f2330a = Integer.parseInt(sharedPreferences.getString(str, "4"));
            mo3389b(this.f2403l);
        } else if (str.equals("excludeFromRecents")) {
            mo3388b();
        }
    }

    /* renamed from: p */
    public float mo3412p() {
        return this.f2403l;
    }
}
