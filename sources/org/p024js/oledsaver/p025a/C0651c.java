package org.p024js.oledsaver.p025a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.p024js.oledsaver.p025a.C0648b;

/* renamed from: org.js.oledsaver.a.c */
public class C0651c {

    /* renamed from: a */
    private List<C0647a> f2339a = new ArrayList();

    /* renamed from: b */
    private long f2340b = 3000;

    /* renamed from: c */
    private long f2341c = 0;

    /* renamed from: d */
    private Interpolator f2342d = null;

    /* renamed from: e */
    private int f2343e = 0;

    /* renamed from: f */
    private int f2344f = 1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AnimatorSet f2345g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public View f2346h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C0648b.C0649a f2347i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C0648b.C0650b f2348j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C0651c f2349k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C0651c f2350l = null;

    /* renamed from: a */
    public static C0647a m3186a(View... viewArr) {
        return new C0651c().mo3340c(viewArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AnimatorSet mo3334a() {
        ArrayList<Animator> arrayList = new ArrayList<>();
        for (C0647a next : this.f2339a) {
            List<Animator> a = next.mo3314a();
            if (next.mo3320b() != null) {
                for (Animator interpolator : a) {
                    interpolator.setInterpolator(next.mo3320b());
                }
            }
            arrayList.addAll(a);
        }
        Iterator<C0647a> it = this.f2339a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0647a next2 = it.next();
            if (next2.mo3328e()) {
                this.f2346h = next2.mo3326d();
                break;
            }
        }
        for (Animator animator : arrayList) {
            if (animator instanceof ValueAnimator) {
                ValueAnimator valueAnimator = (ValueAnimator) animator;
                valueAnimator.setRepeatCount(this.f2343e);
                valueAnimator.setRepeatMode(this.f2344f);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(this.f2340b);
        animatorSet.setStartDelay(this.f2341c);
        if (this.f2342d != null) {
            animatorSet.setInterpolator(this.f2342d);
        }
        animatorSet.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (C0651c.this.f2348j != null) {
                    C0651c.this.f2348j.mo3333a();
                }
                if (C0651c.this.f2350l != null) {
                    C0651c unused = C0651c.this.f2350l.f2349k = null;
                    C0651c.this.f2350l.mo3339b();
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                if (C0651c.this.f2347i != null) {
                    C0651c.this.f2347i.mo3332a();
                }
            }
        });
        return animatorSet;
    }

    /* renamed from: a */
    public C0651c mo3335a(long j) {
        this.f2340b = j;
        return this;
    }

    /* renamed from: a */
    public C0651c mo3336a(C0648b.C0650b bVar) {
        this.f2348j = bVar;
        return this;
    }

    /* renamed from: b */
    public C0647a mo3337b(View... viewArr) {
        C0651c cVar = new C0651c();
        this.f2350l = cVar;
        cVar.f2349k = this;
        return cVar.mo3340c(viewArr);
    }

    /* renamed from: b */
    public C0651c mo3338b(long j) {
        this.f2341c = j;
        return this;
    }

    /* renamed from: b */
    public void mo3339b() {
        if (this.f2349k != null) {
            this.f2349k.mo3339b();
            return;
        }
        this.f2345g = mo3334a();
        if (this.f2346h != null) {
            this.f2346h.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    C0651c.this.f2345g.start();
                    C0651c.this.f2346h.getViewTreeObserver().removeOnPreDrawListener(this);
                    return false;
                }
            });
        } else {
            this.f2345g.start();
        }
    }

    /* renamed from: c */
    public C0647a mo3340c(View... viewArr) {
        C0647a aVar = new C0647a(this, viewArr);
        this.f2339a.add(aVar);
        return aVar;
    }
}
