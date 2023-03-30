package org.p024js.oledsaver.p030d;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: org.js.oledsaver.d.a */
public class C0704a extends HandlerThread {

    /* renamed from: a */
    private static C0704a f2590a;

    /* renamed from: b */
    private static Handler f2591b;

    public C0704a() {
        super("ThreadName", 0);
    }

    /* renamed from: a */
    public static void m3441a() {
        if (f2590a == null) {
            f2590a = new C0704a();
            f2590a.start();
            f2591b = new Handler(f2590a.getLooper());
        }
    }

    /* renamed from: a */
    public static void m3442a(Runnable runnable, long j) {
        f2591b.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public static Handler m3443b() {
        return f2591b;
    }

    /* renamed from: c */
    public static void m3444c() {
        if (f2590a != null) {
            f2590a.quit();
            f2590a = null;
            f2591b = null;
        }
    }
}
