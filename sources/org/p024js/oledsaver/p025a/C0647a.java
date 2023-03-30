package org.p024js.oledsaver.p025a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import org.p024js.oledsaver.p025a.C0648b;

/* renamed from: org.js.oledsaver.a.a */
public class C0647a {

    /* renamed from: a */
    private final C0651c f2333a;

    /* renamed from: b */
    private final View[] f2334b;

    /* renamed from: c */
    private final List<Animator> f2335c = new ArrayList();

    /* renamed from: d */
    private boolean f2336d;

    /* renamed from: e */
    private boolean f2337e = false;

    /* renamed from: f */
    private Interpolator f2338f = null;

    public C0647a(C0651c cVar, View... viewArr) {
        this.f2333a = cVar;
        this.f2334b = viewArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo3313a(float f) {
        return this.f2334b[0].getContext().getResources().getDisplayMetrics().density * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<Animator> mo3314a() {
        return this.f2335c;
    }

    /* renamed from: a */
    public C0647a mo3315a(long j) {
        this.f2333a.mo3335a(j);
        return this;
    }

    /* renamed from: a */
    public C0647a mo3316a(String str, float... fArr) {
        for (View ofFloat : this.f2334b) {
            this.f2335c.add(ObjectAnimator.ofFloat(ofFloat, str, mo3319a(fArr)));
        }
        return this;
    }

    /* renamed from: a */
    public C0647a mo3317a(C0648b.C0650b bVar) {
        this.f2333a.mo3336a(bVar);
        return this;
    }

    /* renamed from: a */
    public C0647a mo3318a(View... viewArr) {
        return this.f2333a.mo3340c(viewArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float[] mo3319a(float... fArr) {
        if (!this.f2337e) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = mo3313a(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: b */
    public Interpolator mo3320b() {
        return this.f2338f;
    }

    /* renamed from: b */
    public C0647a mo3321b(long j) {
        this.f2333a.mo3338b(j);
        return this;
    }

    /* renamed from: b */
    public C0647a mo3322b(float... fArr) {
        return mo3316a("translationY", fArr);
    }

    /* renamed from: b */
    public C0647a mo3323b(View... viewArr) {
        return this.f2333a.mo3337b(viewArr);
    }

    /* renamed from: c */
    public C0647a mo3324c(float... fArr) {
        return mo3316a("translationX", fArr);
    }

    /* renamed from: c */
    public C0651c mo3325c() {
        this.f2333a.mo3339b();
        return this.f2333a;
    }

    /* renamed from: d */
    public View mo3326d() {
        return this.f2334b[0];
    }

    /* renamed from: d */
    public C0647a mo3327d(float... fArr) {
        return mo3316a("alpha", fArr);
    }

    /* renamed from: e */
    public boolean mo3328e() {
        return this.f2336d;
    }

    /* renamed from: f */
    public C0647a mo3329f() {
        return mo3327d(1.0f, 0.0f, 1.0f, 0.0f, 1.0f);
    }

    /* renamed from: g */
    public C0647a mo3330g() {
        mo3324c(-300.0f, 0.0f);
        mo3327d(0.0f, 1.0f);
        return this;
    }

    /* renamed from: h */
    public C0647a mo3331h() {
        mo3322b(-300.0f, 0.0f);
        mo3327d(0.0f, 1.0f);
        return this;
    }
}
