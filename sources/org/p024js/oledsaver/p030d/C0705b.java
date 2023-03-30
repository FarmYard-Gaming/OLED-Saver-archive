package org.p024js.oledsaver.p030d;

import android.os.Handler;

/* renamed from: org.js.oledsaver.d.b */
public class C0705b {

    /* renamed from: a */
    public static C0705b f2592a;

    /* renamed from: b */
    private Handler f2593b;

    /* renamed from: a */
    public static C0705b m3445a() {
        if (f2592a == null) {
            f2592a = new C0705b();
        }
        return f2592a;
    }

    /* renamed from: a */
    public void mo3508a(Runnable runnable) {
        if (this.f2593b == null) {
            this.f2593b = new Handler();
        }
        mo3509a(runnable, 0);
    }

    /* renamed from: a */
    public void mo3509a(Runnable runnable, long j) {
        if (this.f2593b == null) {
            this.f2593b = new Handler();
        }
        this.f2593b.postDelayed(runnable, j);
    }
}
