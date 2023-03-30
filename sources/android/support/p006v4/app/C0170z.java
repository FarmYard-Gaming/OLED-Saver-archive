package android.support.p006v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v4.app.z */
class C0170z implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final View f575a;

    /* renamed from: b */
    private ViewTreeObserver f576b;

    /* renamed from: c */
    private final Runnable f577c;

    private C0170z(View view, Runnable runnable) {
        this.f575a = view;
        this.f576b = view.getViewTreeObserver();
        this.f577c = runnable;
    }

    /* renamed from: a */
    public static C0170z m788a(View view, Runnable runnable) {
        C0170z zVar = new C0170z(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(zVar);
        view.addOnAttachStateChangeListener(zVar);
        return zVar;
    }

    /* renamed from: a */
    public void mo720a() {
        if (this.f576b.isAlive()) {
            this.f576b.removeOnPreDrawListener(this);
        } else {
            this.f575a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f575a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo720a();
        this.f577c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f576b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo720a();
    }
}
