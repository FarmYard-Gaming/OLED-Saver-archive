package org.p024js.oledsaver.view.p033a;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import org.p024js.oledsaver.view.p033a.C0758f;

/* renamed from: org.js.oledsaver.view.a.e */
public class C0755e implements View.OnClickListener, View.OnKeyListener {

    /* renamed from: a */
    static final /* synthetic */ boolean f2708a = (!C0755e.class.desiredAssertionStatus());

    /* renamed from: b */
    private C0753d f2709b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0760g f2710c;

    /* renamed from: d */
    private C0752c[] f2711d;

    /* renamed from: e */
    private boolean f2712e = true;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C0758f.C0759a f2713f;

    C0755e() {
    }

    /* renamed from: a */
    private C0760g m3572a(Activity activity) {
        C0760g gVar = new C0760g(activity);
        gVar.mo3608b(activity.getResources().getColor(this.f2709b.f2702m));
        gVar.mo3605a(this.f2709b.f2697h);
        gVar.mo3610c(this.f2709b.f2700k);
        gVar.mo3613e(this.f2709b.f2691b);
        gVar.mo3614f(this.f2709b.f2692c);
        gVar.mo3615g(this.f2709b.f2693d);
        gVar.mo3617h(this.f2709b.f2694e);
        gVar.mo3618i(this.f2709b.f2695f);
        gVar.mo3611d(this.f2709b.f2701l);
        gVar.mo3607a(this.f2709b.f2704o);
        gVar.setOnKeyListener(this);
        int[] iArr = new int[2];
        ((ViewGroup) activity.findViewById(16908290)).getLocationInWindow(iArr);
        int i = iArr[1];
        if (this.f2712e && i == 0) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                i = activity.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InstantiationException e3) {
                e3.printStackTrace();
            } catch (NumberFormatException e4) {
                e4.printStackTrace();
            } catch (IllegalArgumentException e5) {
                e5.printStackTrace();
            } catch (SecurityException e6) {
                e6.printStackTrace();
            } catch (NoSuchFieldException e7) {
                e7.printStackTrace();
            }
        }
        if (this.f2709b.f2690a != null) {
            gVar.mo3606a(C0751b.m3562a(this.f2709b.f2690a, 0, i));
        } else {
            View findViewById = activity.findViewById(this.f2709b.f2699j);
            if (findViewById != null) {
                gVar.mo3606a(C0751b.m3562a(findViewById, 0, i));
            }
        }
        View findViewById2 = activity.findViewById(this.f2709b.f2698i);
        if (findViewById2 != null) {
            gVar.mo3609b(C0751b.m3562a(findViewById2, 0, i));
        }
        if (this.f2709b.f2696g) {
            gVar.setClickable(false);
        } else {
            gVar.setOnClickListener(this);
        }
        for (C0752c a : this.f2711d) {
            gVar.addView(C0751b.m3563a(activity.getLayoutInflater(), a));
        }
        return gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3574b() {
        this.f2709b = null;
        this.f2711d = null;
        this.f2713f = null;
        this.f2710c.removeAllViews();
        this.f2710c = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = (android.view.ViewGroup) r3.f2710c.getParent();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3581a() {
        /*
            r3 = this;
            org.js.oledsaver.view.a.g r0 = r3.f2710c
            if (r0 != 0) goto L_0x0005
        L_0x0004:
            return
        L_0x0005:
            org.js.oledsaver.view.a.g r0 = r3.f2710c
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0004
            org.js.oledsaver.view.a.d r1 = r3.f2709b
            int r1 = r1.f2707r
            r2 = -1
            if (r1 == r2) goto L_0x004a
            org.js.oledsaver.view.a.g r1 = r3.f2710c
            android.content.Context r1 = r1.getContext()
            boolean r2 = f2708a
            if (r2 != 0) goto L_0x0028
            if (r1 != 0) goto L_0x0028
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0028:
            org.js.oledsaver.view.a.d r2 = r3.f2709b
            int r2 = r2.f2707r
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
            boolean r2 = f2708a
            if (r2 != 0) goto L_0x003c
            if (r1 != 0) goto L_0x003c
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x003c:
            org.js.oledsaver.view.a.e$2 r2 = new org.js.oledsaver.view.a.e$2
            r2.<init>(r0)
            r1.setAnimationListener(r2)
            org.js.oledsaver.view.a.g r0 = r3.f2710c
            r0.startAnimation(r1)
            goto L_0x0004
        L_0x004a:
            org.js.oledsaver.view.a.g r1 = r3.f2710c
            r0.removeView(r1)
            org.js.oledsaver.view.a.f$a r0 = r3.f2713f
            if (r0 == 0) goto L_0x0058
            org.js.oledsaver.view.a.f$a r0 = r3.f2713f
            r0.mo3525b()
        L_0x0058:
            r3.m3574b()
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p024js.oledsaver.view.p033a.C0755e.mo3581a():void");
    }

    /* renamed from: a */
    public void mo3582a(Activity activity, View view) {
        if (this.f2710c == null) {
            this.f2710c = m3572a(activity);
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        if (this.f2710c.getParent() == null) {
            viewGroup.addView(this.f2710c);
            ViewGroup.LayoutParams layoutParams = this.f2710c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(200, 200);
            }
            layoutParams.height = view.getHeight();
            layoutParams.width = view.getWidth();
            if (this.f2709b.f2706q != -1) {
                Animation loadAnimation = AnimationUtils.loadAnimation(activity, this.f2709b.f2706q);
                if (f2708a || loadAnimation != null) {
                    loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationEnd(Animation animation) {
                            if (C0755e.this.f2713f != null) {
                                C0755e.this.f2713f.mo3524a();
                            }
                        }

                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    this.f2710c.startAnimation(loadAnimation);
                    return;
                }
                throw new AssertionError();
            } else if (this.f2713f != null) {
                this.f2713f.mo3524a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3583a(C0753d dVar) {
        this.f2709b = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3584a(C0758f.C0759a aVar) {
        this.f2713f = aVar;
    }

    /* renamed from: a */
    public void mo3585a(boolean z) {
        this.f2712e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3586a(C0752c[] cVarArr) {
        this.f2711d = cVarArr;
    }

    public void onClick(View view) {
        if (this.f2709b != null && this.f2709b.f2703n) {
            mo3581a();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        if (this.f2709b == null || !this.f2709b.f2703n) {
            return false;
        }
        mo3581a();
        return true;
    }
}
