package org.p024js.oledsaver.p032f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: org.js.oledsaver.f.b */
public class C0733b {

    /* renamed from: a */
    protected Context f2629a;

    /* renamed from: b */
    protected View f2630b;

    /* renamed from: c */
    protected String[] f2631c;

    public C0733b(Context context, int i) {
        this.f2629a = context;
        mo3535a(i);
    }

    /* renamed from: a */
    public View mo3539a() {
        return this.f2630b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3535a(int i) {
        this.f2630b = View.inflate(this.f2629a, i, (ViewGroup) null);
    }

    /* renamed from: b */
    public String mo3536b(int i) {
        if (i >= this.f2631c.length) {
            return null;
        }
        return this.f2631c[i];
    }
}
