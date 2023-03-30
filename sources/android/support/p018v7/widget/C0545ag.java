package android.support.p018v7.widget;

import android.os.SystemClock;
import android.support.p018v7.view.menu.C0487s;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.ag */
public abstract class C0545ag implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* renamed from: a */
    private final float f1946a;

    /* renamed from: b */
    private final int f1947b;

    /* renamed from: c */
    final View f1948c;

    /* renamed from: d */
    private final int f1949d;

    /* renamed from: e */
    private Runnable f1950e;

    /* renamed from: f */
    private Runnable f1951f;

    /* renamed from: g */
    private boolean f1952g;

    /* renamed from: h */
    private int f1953h;

    /* renamed from: i */
    private final int[] f1954i = new int[2];

    /* renamed from: android.support.v7.widget.ag$a */
    private class C0546a implements Runnable {
        C0546a() {
        }

        public void run() {
            ViewParent parent = C0545ag.this.f1948c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ag$b */
    private class C0547b implements Runnable {
        C0547b() {
        }

        public void run() {
            C0545ag.this.mo2779d();
        }
    }

    public C0545ag(View view) {
        this.f1948c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1946a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1947b = ViewConfiguration.getTapTimeout();
        this.f1949d = (this.f1947b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m2692a(MotionEvent motionEvent) {
        View view = this.f1948c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1953h = motionEvent.getPointerId(0);
                if (this.f1950e == null) {
                    this.f1950e = new C0546a();
                }
                view.postDelayed(this.f1950e, (long) this.f1947b);
                if (this.f1951f == null) {
                    this.f1951f = new C0547b();
                }
                view.postDelayed(this.f1951f, (long) this.f1949d);
                return false;
            case 1:
            case 3:
                m2697e();
                return false;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f1953h);
                if (findPointerIndex < 0 || m2693a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f1946a)) {
                    return false;
                }
                m2697e();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private static boolean m2693a(View view, float f, float f2, float f3) {
        return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m2694a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1954i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m2695b(MotionEvent motionEvent) {
        C0540ae aeVar;
        View view = this.f1948c;
        C0487s a = mo1955a();
        if (a == null || !a.mo2043d() || (aeVar = (C0540ae) a.mo2044e()) == null || !aeVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m2696b(view, obtainNoHistory);
        m2694a(aeVar, obtainNoHistory);
        boolean a2 = aeVar.mo2762a(obtainNoHistory, this.f1953h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* renamed from: b */
    private boolean m2696b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1954i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: e */
    private void m2697e() {
        if (this.f1951f != null) {
            this.f1948c.removeCallbacks(this.f1951f);
        }
        if (this.f1950e != null) {
            this.f1948c.removeCallbacks(this.f1950e);
        }
    }

    /* renamed from: a */
    public abstract C0487s mo1955a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1956b() {
        C0487s a = mo1955a();
        if (a == null || a.mo2043d()) {
            return true;
        }
        a.mo2033a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2778c() {
        C0487s a = mo1955a();
        if (a == null || !a.mo2043d()) {
            return true;
        }
        a.mo2040c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2779d() {
        m2697e();
        View view = this.f1948c;
        if (view.isEnabled() && !view.isLongClickable() && mo1956b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1952g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1952g;
        if (z2) {
            z = m2695b(motionEvent) || !mo2778c();
        } else {
            boolean z3 = m2692a(motionEvent) && mo1956b();
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1948c.onTouchEvent(obtain);
                obtain.recycle();
            }
            z = z3;
        }
        this.f1952g = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1952g = false;
        this.f1953h = -1;
        if (this.f1950e != null) {
            this.f1948c.removeCallbacks(this.f1950e);
        }
    }
}
