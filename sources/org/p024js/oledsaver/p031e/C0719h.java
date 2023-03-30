package org.p024js.oledsaver.p031e;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: org.js.oledsaver.e.h */
public class C0719h {

    /* renamed from: a */
    private static C0719h f2615a;

    /* renamed from: b */
    private Context f2616b;

    /* renamed from: c */
    private int f2617c;

    public C0719h(Context context) {
        this.f2616b = context;
        if (C0718g.m3478a() || C0718g.m3481b()) {
            this.f2617c = mo3531d();
        } else {
            this.f2617c = mo3530c();
        }
    }

    /* renamed from: a */
    public static C0719h m3482a(Context context) {
        if (f2615a == null) {
            f2615a = new C0719h(context);
        }
        return f2615a;
    }

    /* renamed from: a */
    public int mo3526a() {
        try {
            return Settings.System.getInt(this.f2616b.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public void mo3527a(int i) {
        this.f2617c = i;
    }

    /* renamed from: b */
    public int mo3528b() {
        try {
            return Settings.System.getInt(this.f2616b.getContentResolver(), "screen_brightness_mode");
        } catch (Settings.SettingNotFoundException e) {
            return 0;
        }
    }

    /* renamed from: b */
    public void mo3529b(int i) {
        int i2 = (int) ((((float) i) / 255.0f) * ((float) this.f2617c));
        try {
            Settings.System.putInt(this.f2616b.getContentResolver(), "screen_brightness_mode", 0);
            Settings.System.putInt(this.f2616b.getContentResolver(), "screen_brightness", i2);
        } catch (Exception e) {
            Log.e("screen error", "'" + e.getMessage());
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public int mo3530c() {
        Class<?> cls = ((PowerManager) this.f2616b.getSystemService("power")).getClass();
        try {
            return cls.getField("BRIGHTNESS_ON").getInt(cls);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return 255;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return 255;
        }
    }

    /* renamed from: d */
    public int mo3531d() {
        PowerManager powerManager = (PowerManager) this.f2616b.getSystemService("power");
        try {
            Method method = powerManager.getClass().getMethod("getMaximumScreenBrightnessSetting", new Class[0]);
            method.setAccessible(true);
            return ((Integer) method.invoke(powerManager, new Object[0])).intValue();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return 255;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return 255;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return 255;
        }
    }
}
