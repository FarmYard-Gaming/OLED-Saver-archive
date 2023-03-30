package android.support.p006v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0040p;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p006v4.app.C0106f;
import android.support.p006v4.app.C0120k;
import android.support.p006v4.p014f.C0201b;
import android.support.p006v4.p014f.C0204d;
import android.support.p006v4.p014f.C0205e;
import android.support.p006v4.p015g.C0249q;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.l */
final class C0123l extends C0120k implements LayoutInflater.Factory2 {

    /* renamed from: F */
    static final Interpolator f364F = new DecelerateInterpolator(2.5f);

    /* renamed from: G */
    static final Interpolator f365G = new DecelerateInterpolator(1.5f);

    /* renamed from: H */
    static final Interpolator f366H = new AccelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f367I = new AccelerateInterpolator(1.5f);

    /* renamed from: a */
    static boolean f368a = false;

    /* renamed from: q */
    static Field f369q = null;

    /* renamed from: A */
    Bundle f370A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f371B = null;

    /* renamed from: C */
    ArrayList<C0138i> f372C;

    /* renamed from: D */
    C0139m f373D;

    /* renamed from: E */
    Runnable f374E = new Runnable() {
        public void run() {
            C0123l.this.mo586f();
        }
    };

    /* renamed from: J */
    private final CopyOnWriteArrayList<C0135f> f375J = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    ArrayList<C0137h> f376b;

    /* renamed from: c */
    boolean f377c;

    /* renamed from: d */
    int f378d = 0;

    /* renamed from: e */
    final ArrayList<C0106f> f379e = new ArrayList<>();

    /* renamed from: f */
    SparseArray<C0106f> f380f;

    /* renamed from: g */
    ArrayList<C0100c> f381g;

    /* renamed from: h */
    ArrayList<C0106f> f382h;

    /* renamed from: i */
    ArrayList<C0100c> f383i;

    /* renamed from: j */
    ArrayList<Integer> f384j;

    /* renamed from: k */
    ArrayList<C0120k.C0122b> f385k;

    /* renamed from: l */
    int f386l = 0;

    /* renamed from: m */
    C0119j f387m;

    /* renamed from: n */
    C0117h f388n;

    /* renamed from: o */
    C0106f f389o;

    /* renamed from: p */
    C0106f f390p;

    /* renamed from: r */
    boolean f391r;

    /* renamed from: s */
    boolean f392s;

    /* renamed from: t */
    boolean f393t;

    /* renamed from: u */
    boolean f394u;

    /* renamed from: v */
    String f395v;

    /* renamed from: w */
    boolean f396w;

    /* renamed from: x */
    ArrayList<C0100c> f397x;

    /* renamed from: y */
    ArrayList<Boolean> f398y;

    /* renamed from: z */
    ArrayList<C0106f> f399z;

    /* renamed from: android.support.v4.app.l$a */
    private static class C0129a extends C0131b {

        /* renamed from: a */
        View f413a;

        C0129a(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f413a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (C0249q.m1071m(this.f413a) || Build.VERSION.SDK_INT >= 24) {
                this.f413a.post(new Runnable() {
                    public void run() {
                        C0129a.this.f413a.setLayerType(0, (Paint) null);
                    }
                });
            } else {
                this.f413a.setLayerType(0, (Paint) null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.l$b */
    private static class C0131b implements Animation.AnimationListener {

        /* renamed from: a */
        private final Animation.AnimationListener f415a;

        C0131b(Animation.AnimationListener animationListener) {
            this.f415a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f415a != null) {
                this.f415a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f415a != null) {
                this.f415a.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.f415a != null) {
                this.f415a.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.l$c */
    private static class C0132c {

        /* renamed from: a */
        public final Animation f416a;

        /* renamed from: b */
        public final Animator f417b;

        C0132c(Animator animator) {
            this.f416a = null;
            this.f417b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0132c(Animation animation) {
            this.f416a = animation;
            this.f417b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.l$d */
    private static class C0133d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f418a;

        C0133d(View view) {
            this.f418a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f418a.setLayerType(0, (Paint) null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.f418a.setLayerType(2, (Paint) null);
        }
    }

    /* renamed from: android.support.v4.app.l$e */
    private static class C0134e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f419a;

        /* renamed from: b */
        private final View f420b;

        /* renamed from: c */
        private boolean f421c;

        /* renamed from: d */
        private boolean f422d;

        /* renamed from: e */
        private boolean f423e = true;

        C0134e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f419a = viewGroup;
            this.f420b = view;
            addAnimation(animation);
            this.f419a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f423e = true;
            if (this.f421c) {
                return !this.f422d;
            }
            if (super.getTransformation(j, transformation)) {
                return true;
            }
            this.f421c = true;
            C0170z.m788a(this.f419a, this);
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f423e = true;
            if (this.f421c) {
                return !this.f422d;
            }
            if (super.getTransformation(j, transformation, f)) {
                return true;
            }
            this.f421c = true;
            C0170z.m788a(this.f419a, this);
            return true;
        }

        public void run() {
            if (this.f421c || !this.f423e) {
                this.f419a.endViewTransition(this.f420b);
                this.f422d = true;
                return;
            }
            this.f423e = false;
            this.f419a.post(this);
        }
    }

    /* renamed from: android.support.v4.app.l$f */
    private static final class C0135f {

        /* renamed from: a */
        final C0120k.C0121a f424a;

        /* renamed from: b */
        final boolean f425b;
    }

    /* renamed from: android.support.v4.app.l$g */
    static class C0136g {

        /* renamed from: a */
        public static final int[] f426a = {16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.l$h */
    interface C0137h {
        /* renamed from: a */
        boolean mo325a(ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.l$i */
    static class C0138i implements C0106f.C0112c {

        /* renamed from: a */
        final boolean f427a;

        /* renamed from: b */
        final C0100c f428b;

        /* renamed from: c */
        private int f429c;

        C0138i(C0100c cVar, boolean z) {
            this.f427a = z;
            this.f428b = cVar;
        }

        /* renamed from: a */
        public void mo449a() {
            this.f429c--;
            if (this.f429c == 0) {
                this.f428b.f230a.mo581e();
            }
        }

        /* renamed from: b */
        public void mo450b() {
            this.f429c++;
        }

        /* renamed from: c */
        public boolean mo631c() {
            return this.f429c == 0;
        }

        /* renamed from: d */
        public void mo632d() {
            boolean z = false;
            boolean z2 = this.f429c > 0;
            C0123l lVar = this.f428b.f230a;
            int size = lVar.f379e.size();
            for (int i = 0; i < size; i++) {
                C0106f fVar = lVar.f379e.get(i);
                fVar.mo379a((C0106f.C0112c) null);
                if (z2 && fVar.mo362X()) {
                    fVar.mo342D();
                }
            }
            C0123l lVar2 = this.f428b.f230a;
            C0100c cVar = this.f428b;
            boolean z3 = this.f427a;
            if (!z2) {
                z = true;
            }
            lVar2.mo550a(cVar, z3, z, true);
        }

        /* renamed from: e */
        public void mo633e() {
            this.f428b.f230a.mo550a(this.f428b, this.f427a, false, false);
        }
    }

    C0123l() {
    }

    /* renamed from: A */
    private void m546A() {
        int size = this.f380f == null ? 0 : this.f380f.size();
        for (int i = 0; i < size; i++) {
            C0106f valueAt = this.f380f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.mo359U() != null) {
                    int W = valueAt.mo361W();
                    View U = valueAt.mo359U();
                    Animation animation = U.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        U.clearAnimation();
                    }
                    valueAt.mo383a((View) null);
                    mo552a(valueAt, W, 0, 0, false);
                } else if (valueAt.mo360V() != null) {
                    valueAt.mo360V().end();
                }
            }
        }
    }

    /* renamed from: B */
    private void m547B() {
        if (this.f380f != null) {
            for (int size = this.f380f.size() - 1; size >= 0; size--) {
                if (this.f380f.valueAt(size) == null) {
                    this.f380f.delete(this.f380f.keyAt(size));
                }
            }
        }
    }

    /* renamed from: a */
    private int m548a(ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0201b<C0106f> bVar) {
        int i3;
        int i4 = i2 - 1;
        int i5 = i2;
        while (i4 >= i) {
            C0100c cVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (cVar.mo329c() && !cVar.mo324a(arrayList, i4 + 1, i2)) {
                if (this.f372C == null) {
                    this.f372C = new ArrayList<>();
                }
                C0138i iVar = new C0138i(cVar, booleanValue);
                this.f372C.add(iVar);
                cVar.mo320a((C0106f.C0112c) iVar);
                if (booleanValue) {
                    cVar.mo327b();
                } else {
                    cVar.mo323a(false);
                }
                int i6 = i5 - 1;
                if (i4 != i6) {
                    arrayList.remove(i4);
                    arrayList.add(i6, cVar);
                }
                m563b(bVar);
                i3 = i6;
            } else {
                i3 = i5;
            }
            i4--;
            i5 = i3;
        }
        return i5;
    }

    /* renamed from: a */
    static C0132c m549a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f365G);
        alphaAnimation.setDuration(220);
        return new C0132c((Animation) alphaAnimation);
    }

    /* renamed from: a */
    static C0132c m550a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f364F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f365G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0132c((Animation) animationSet);
    }

    /* renamed from: a */
    private static Animation.AnimationListener m551a(Animation animation) {
        try {
            if (f369q == null) {
                f369q = Animation.class.getDeclaredField("mListener");
                f369q.setAccessible(true);
            }
            return (Animation.AnimationListener) f369q.get(animation);
        } catch (NoSuchFieldException e) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        }
    }

    /* renamed from: a */
    private void m552a(final C0106f fVar, C0132c cVar, int i) {
        final View view = fVar.f282J;
        final ViewGroup viewGroup = fVar.f281I;
        viewGroup.startViewTransition(view);
        fVar.mo389b(i);
        if (cVar.f416a != null) {
            C0134e eVar = new C0134e(cVar.f416a, viewGroup, view);
            fVar.mo383a(fVar.f282J);
            eVar.setAnimationListener(new C0131b(m551a((Animation) eVar)) {
                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new Runnable() {
                        public void run() {
                            if (fVar.mo359U() != null) {
                                fVar.mo383a((View) null);
                                C0123l.this.mo552a(fVar, fVar.mo361W(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            m564b(view, cVar);
            fVar.f282J.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f417b;
        fVar.mo372a(cVar.f417b);
        animator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator V = fVar.mo360V();
                fVar.mo372a((Animator) null);
                if (V != null && viewGroup.indexOfChild(view) < 0) {
                    C0123l.this.mo552a(fVar, fVar.mo361W(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fVar.f282J);
        m564b(fVar.f282J, cVar);
        animator.start();
    }

    /* renamed from: a */
    private static void m553a(C0139m mVar) {
        if (mVar != null) {
            List<C0106f> a = mVar.mo634a();
            if (a != null) {
                for (C0106f fVar : a) {
                    fVar.f277E = true;
                }
            }
            List<C0139m> b = mVar.mo635b();
            if (b != null) {
                for (C0139m a2 : b) {
                    m553a(a2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m554a(C0201b<C0106f> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            C0106f b = bVar.mo830b(i);
            if (!b.f306l) {
                View l = b.mo424l();
                b.f289Q = l.getAlpha();
                l.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m555a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0205e("FragmentManager"));
        if (this.f387m != null) {
            try {
                this.f387m.mo486a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo522a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: a */
    private void m556a(ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        int i = 0;
        int size = this.f372C == null ? 0 : this.f372C.size();
        while (i < size) {
            C0138i iVar = this.f372C.get(i);
            if (arrayList != null && !iVar.f427a && (indexOf2 = arrayList.indexOf(iVar.f428b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                iVar.mo633e();
            } else if (iVar.mo631c() || (arrayList != null && iVar.f428b.mo324a(arrayList, 0, arrayList.size()))) {
                this.f372C.remove(i);
                i--;
                size--;
                if (arrayList == null || iVar.f427a || (indexOf = arrayList.indexOf(iVar.f428b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                    iVar.mo632d();
                } else {
                    iVar.mo633e();
                }
            }
            i++;
            size = size;
        }
    }

    /* renamed from: a */
    private void m557a(ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        boolean z = arrayList.get(i).f249t;
        if (this.f399z == null) {
            this.f399z = new ArrayList<>();
        } else {
            this.f399z.clear();
        }
        this.f399z.addAll(this.f379e);
        int i4 = i;
        C0106f v = mo616v();
        boolean z2 = false;
        while (i4 < i2) {
            C0100c cVar = arrayList.get(i4);
            C0106f a = !arrayList2.get(i4).booleanValue() ? cVar.mo316a(this.f399z, v) : cVar.mo326b(this.f399z, v);
            i4++;
            v = a;
            z2 = z2 || cVar.f238i;
        }
        this.f399z.clear();
        if (!z) {
            C0145q.m683a(this, arrayList, arrayList2, i, i2, false);
        }
        m566b(arrayList, arrayList2, i, i2);
        if (z) {
            C0201b bVar = new C0201b();
            m563b((C0201b<C0106f>) bVar);
            i3 = m548a(arrayList, arrayList2, i, i2, (C0201b<C0106f>) bVar);
            m554a((C0201b<C0106f>) bVar);
        } else {
            i3 = i2;
        }
        if (i3 != i && z) {
            C0145q.m683a(this, arrayList, arrayList2, i, i3, true);
            mo545a(this.f386l, true);
        }
        while (i < i2) {
            C0100c cVar2 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && cVar2.f242m >= 0) {
                mo573c(cVar2.f242m);
                cVar2.f242m = -1;
            }
            cVar2.mo317a();
            i++;
        }
        if (z2) {
            mo590h();
        }
    }

    /* renamed from: a */
    static boolean m558a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
            return false;
        } else if (!(animator instanceof AnimatorSet)) {
            return false;
        } else {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m558a(childAnimations.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    static boolean m559a(C0132c cVar) {
        if (cVar.f416a instanceof AlphaAnimation) {
            return true;
        }
        if (!(cVar.f416a instanceof AnimationSet)) {
            return m558a(cVar.f417b);
        }
        List<Animation> animations = ((AnimationSet) cVar.f416a).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m560a(View view, C0132c cVar) {
        return view != null && cVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0249q.m1066h(view) && m559a(cVar);
    }

    /* renamed from: a */
    private boolean m561a(String str, int i, int i2) {
        C0120k k;
        mo586f();
        m567c(true);
        if (this.f390p != null && i < 0 && str == null && (k = this.f390p.mo422k()) != null && k.mo523a()) {
            return true;
        }
        boolean a = mo563a(this.f397x, this.f398y, str, i, i2);
        if (a) {
            this.f377c = true;
            try {
                m565b(this.f397x, this.f398y);
            } finally {
                m573y();
            }
        }
        mo587g();
        m547B();
        return a;
    }

    /* renamed from: b */
    public static int m562b(int i, boolean z) {
        switch (i) {
            case 4097:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    private void m563b(C0201b<C0106f> bVar) {
        if (this.f386l >= 1) {
            int min = Math.min(this.f386l, 3);
            int size = this.f379e.size();
            for (int i = 0; i < size; i++) {
                C0106f fVar = this.f379e.get(i);
                if (fVar.f296b < min) {
                    mo552a(fVar, min, fVar.mo354P(), fVar.mo355Q(), false);
                    if (fVar.f282J != null && !fVar.f274B && fVar.f287O) {
                        bVar.add(fVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m564b(View view, C0132c cVar) {
        if (view != null && cVar != null && m560a(view, cVar)) {
            if (cVar.f417b != null) {
                cVar.f417b.addListener(new C0133d(view));
                return;
            }
            Animation.AnimationListener a = m551a(cVar.f416a);
            view.setLayerType(2, (Paint) null);
            cVar.f416a.setAnimationListener(new C0129a(view, a));
        }
    }

    /* renamed from: b */
    private void m565b(ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2) {
        int i;
        int i2;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m556a(arrayList, arrayList2);
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i3 < size) {
                if (!arrayList.get(i3).f249t) {
                    if (i4 != i3) {
                        m557a(arrayList, arrayList2, i4, i3);
                    }
                    int i5 = i3 + 1;
                    if (arrayList2.get(i3).booleanValue()) {
                        while (i5 < size && arrayList2.get(i5).booleanValue() && !arrayList.get(i5).f249t) {
                            i5++;
                        }
                    }
                    i2 = i5;
                    m557a(arrayList, arrayList2, i3, i2);
                    i = i2 - 1;
                } else {
                    i = i3;
                    i2 = i4;
                }
                i3 = i + 1;
                i4 = i2;
            }
            if (i4 != size) {
                m557a(arrayList, arrayList2, i4, size);
            }
        }
    }

    /* renamed from: b */
    private static void m566b(ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0100c cVar = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                cVar.mo318a(-1);
                cVar.mo323a(i == i2 + -1);
            } else {
                cVar.mo318a(1);
                cVar.mo327b();
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m567c(boolean z) {
        if (this.f377c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f387m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() != this.f387m.mo520h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                m572x();
            }
            if (this.f397x == null) {
                this.f397x = new ArrayList<>();
                this.f398y = new ArrayList<>();
            }
            this.f377c = true;
            try {
                m556a((ArrayList<C0100c>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f377c = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m568c(java.util.ArrayList<android.support.p006v4.app.C0100c> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            r0 = 0
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.l$h> r1 = r4.f376b     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x000e
            java.util.ArrayList<android.support.v4.app.l$h> r1 = r4.f376b     // Catch:{ all -> 0x003e }
            int r1 = r1.size()     // Catch:{ all -> 0x003e }
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
        L_0x000f:
            return r0
        L_0x0010:
            java.util.ArrayList<android.support.v4.app.l$h> r1 = r4.f376b     // Catch:{ all -> 0x003e }
            int r3 = r1.size()     // Catch:{ all -> 0x003e }
            r2 = r0
            r1 = r0
        L_0x0018:
            if (r2 >= r3) goto L_0x002b
            java.util.ArrayList<android.support.v4.app.l$h> r0 = r4.f376b     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x003e }
            android.support.v4.app.l$h r0 = (android.support.p006v4.app.C0123l.C0137h) r0     // Catch:{ all -> 0x003e }
            boolean r0 = r0.mo325a(r5, r6)     // Catch:{ all -> 0x003e }
            r1 = r1 | r0
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0018
        L_0x002b:
            java.util.ArrayList<android.support.v4.app.l$h> r0 = r4.f376b     // Catch:{ all -> 0x003e }
            r0.clear()     // Catch:{ all -> 0x003e }
            android.support.v4.app.j r0 = r4.f387m     // Catch:{ all -> 0x003e }
            android.os.Handler r0 = r0.mo520h()     // Catch:{ all -> 0x003e }
            java.lang.Runnable r2 = r4.f374E     // Catch:{ all -> 0x003e }
            r0.removeCallbacks(r2)     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r0 = r1
            goto L_0x000f
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.app.C0123l.m568c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: d */
    public static int m569d(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m570e(int i) {
        try {
            this.f377c = true;
            mo545a(i, false);
            this.f377c = false;
            mo586f();
        } catch (Throwable th) {
            this.f377c = false;
            throw th;
        }
    }

    /* renamed from: p */
    private C0106f m571p(C0106f fVar) {
        ViewGroup viewGroup = fVar.f281I;
        View view = fVar.f282J;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.f379e.indexOf(fVar) - 1; indexOf >= 0; indexOf--) {
            C0106f fVar2 = this.f379e.get(indexOf);
            if (fVar2.f281I == viewGroup && fVar2.f282J != null) {
                return fVar2;
            }
        }
        return null;
    }

    /* renamed from: x */
    private void m572x() {
        if (mo525c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f395v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f395v);
        }
    }

    /* renamed from: y */
    private void m573y() {
        this.f377c = false;
        this.f398y.clear();
        this.f397x.clear();
    }

    /* renamed from: z */
    private void m574z() {
        if (this.f372C != null) {
            while (!this.f372C.isEmpty()) {
                this.f372C.remove(0).mo632d();
            }
        }
    }

    /* renamed from: a */
    public C0106f mo541a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        C0106f fVar = this.f380f.get(i);
        if (fVar != null) {
            return fVar;
        }
        m555a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return fVar;
    }

    /* renamed from: a */
    public C0106f mo542a(String str) {
        if (str != null) {
            for (int size = this.f379e.size() - 1; size >= 0; size--) {
                C0106f fVar = this.f379e.get(size);
                if (fVar != null && str.equals(fVar.f273A)) {
                    return fVar;
                }
            }
        }
        if (!(this.f380f == null || str == null)) {
            for (int size2 = this.f380f.size() - 1; size2 >= 0; size2--) {
                C0106f valueAt = this.f380f.valueAt(size2);
                if (valueAt != null && str.equals(valueAt.f273A)) {
                    return valueAt;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0132c mo543a(C0106f fVar, int i, boolean z, int i2) {
        boolean z2;
        int P = fVar.mo354P();
        Animation a = fVar.mo366a(i, z, P);
        if (a != null) {
            return new C0132c(a);
        }
        Animator b = fVar.mo388b(i, z, P);
        if (b != null) {
            return new C0132c(b);
        }
        if (P != 0) {
            boolean equals = "anim".equals(this.f387m.mo519g().getResources().getResourceTypeName(P));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f387m.mo519g(), P);
                    if (loadAnimation != null) {
                        return new C0132c(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f387m.mo519g(), P);
                    if (loadAnimator != null) {
                        return new C0132c(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (equals) {
                        throw e3;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f387m.mo519g(), P);
                    if (loadAnimation2 != null) {
                        return new C0132c(loadAnimation2);
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int b2 = m562b(i, z);
        if (b2 < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return m550a(this.f387m.mo519g(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m550a(this.f387m.mo519g(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m550a(this.f387m.mo519g(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m550a(this.f387m.mo519g(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m549a(this.f387m.mo519g(), 0.0f, 1.0f);
            case 6:
                return m549a(this.f387m.mo519g(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f387m.mo491d()) {
                    i2 = this.f387m.mo492e();
                }
                return i2 == 0 ? null : null;
        }
    }

    /* renamed from: a */
    public void mo544a(int i, C0100c cVar) {
        synchronized (this) {
            if (this.f383i == null) {
                this.f383i = new ArrayList<>();
            }
            int size = this.f383i.size();
            if (i < size) {
                if (f368a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + cVar);
                }
                this.f383i.set(i, cVar);
            } else {
                while (size < i) {
                    this.f383i.add((Object) null);
                    if (this.f384j == null) {
                        this.f384j = new ArrayList<>();
                    }
                    if (f368a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f384j.add(Integer.valueOf(size));
                    size++;
                }
                if (f368a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + cVar);
                }
                this.f383i.add(cVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo545a(int i, boolean z) {
        if (this.f387m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f386l) {
            this.f386l = i;
            if (this.f380f != null) {
                int size = this.f379e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo582e(this.f379e.get(i2));
                }
                int size2 = this.f380f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0106f valueAt = this.f380f.valueAt(i3);
                    if (valueAt != null && ((valueAt.f307m || valueAt.f275C) && !valueAt.f287O)) {
                        mo582e(valueAt);
                    }
                }
                mo577d();
                if (this.f391r && this.f387m != null && this.f386l == 4) {
                    this.f387m.mo490c();
                    this.f391r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo546a(Configuration configuration) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f379e.size()) {
                C0106f fVar = this.f379e.get(i2);
                if (fVar != null) {
                    fVar.mo377a(configuration);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo547a(Bundle bundle, String str, C0106f fVar) {
        if (fVar.f300f < 0) {
            m555a((RuntimeException) new IllegalStateException("Fragment " + fVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fVar.f300f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo548a(Parcelable parcelable, C0139m mVar) {
        List<C0040p> list;
        List<C0139m> list2;
        if (parcelable != null) {
            C0140n nVar = (C0140n) parcelable;
            if (nVar.f433a != null) {
                if (mVar != null) {
                    List<C0106f> a = mVar.mo634a();
                    List<C0139m> b = mVar.mo635b();
                    List<C0040p> c = mVar.mo636c();
                    int size = a != null ? a.size() : 0;
                    for (int i = 0; i < size; i++) {
                        C0106f fVar = a.get(i);
                        if (f368a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fVar);
                        }
                        int i2 = 0;
                        while (i2 < nVar.f433a.length && nVar.f433a[i2].f439b != fVar.f300f) {
                            i2++;
                        }
                        if (i2 == nVar.f433a.length) {
                            m555a((RuntimeException) new IllegalStateException("Could not find active fragment with index " + fVar.f300f));
                        }
                        C0142o oVar = nVar.f433a[i2];
                        oVar.f449l = fVar;
                        fVar.f298d = null;
                        fVar.f312r = 0;
                        fVar.f309o = false;
                        fVar.f306l = false;
                        fVar.f303i = null;
                        if (oVar.f448k != null) {
                            oVar.f448k.setClassLoader(this.f387m.mo519g().getClassLoader());
                            fVar.f298d = oVar.f448k.getSparseParcelableArray("android:view_state");
                            fVar.f297c = oVar.f448k;
                        }
                    }
                    list = c;
                    list2 = b;
                } else {
                    list = null;
                    list2 = null;
                }
                this.f380f = new SparseArray<>(nVar.f433a.length);
                int i3 = 0;
                while (i3 < nVar.f433a.length) {
                    C0142o oVar2 = nVar.f433a[i3];
                    if (oVar2 != null) {
                        C0106f a2 = oVar2.mo643a(this.f387m, this.f388n, this.f389o, (list2 == null || i3 >= list2.size()) ? null : list2.get(i3), (list == null || i3 >= list.size()) ? null : list.get(i3));
                        if (f368a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + a2);
                        }
                        this.f380f.put(a2.f300f, a2);
                        oVar2.f449l = null;
                    }
                    i3++;
                }
                if (mVar != null) {
                    List<C0106f> a3 = mVar.mo634a();
                    int size2 = a3 != null ? a3.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        C0106f fVar2 = a3.get(i4);
                        if (fVar2.f304j >= 0) {
                            fVar2.f303i = this.f380f.get(fVar2.f304j);
                            if (fVar2.f303i == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fVar2 + " target no longer exists: " + fVar2.f304j);
                            }
                        }
                    }
                }
                this.f379e.clear();
                if (nVar.f434b != null) {
                    for (int i5 = 0; i5 < nVar.f434b.length; i5++) {
                        C0106f fVar3 = this.f380f.get(nVar.f434b[i5]);
                        if (fVar3 == null) {
                            m555a((RuntimeException) new IllegalStateException("No instantiated fragment for index #" + nVar.f434b[i5]));
                        }
                        fVar3.f306l = true;
                        if (f368a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i5 + ": " + fVar3);
                        }
                        if (this.f379e.contains(fVar3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.f379e) {
                            this.f379e.add(fVar3);
                        }
                    }
                }
                if (nVar.f435c != null) {
                    this.f381g = new ArrayList<>(nVar.f435c.length);
                    for (int i6 = 0; i6 < nVar.f435c.length; i6++) {
                        C0100c a4 = nVar.f435c[i6].mo332a(this);
                        if (f368a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + a4.f242m + "): " + a4);
                            PrintWriter printWriter = new PrintWriter(new C0205e("FragmentManager"));
                            a4.mo322a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f381g.add(a4);
                        if (a4.f242m >= 0) {
                            mo544a(a4.f242m, a4);
                        }
                    }
                } else {
                    this.f381g = null;
                }
                if (nVar.f436d >= 0) {
                    this.f390p = this.f380f.get(nVar.f436d);
                }
                this.f378d = nVar.f437e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo549a(C0100c cVar) {
        if (this.f381g == null) {
            this.f381g = new ArrayList<>();
        }
        this.f381g.add(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo550a(C0100c cVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            cVar.mo323a(z3);
        } else {
            cVar.mo327b();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0145q.m683a(this, (ArrayList<C0100c>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            mo545a(this.f386l, true);
        }
        if (this.f380f != null) {
            int size = this.f380f.size();
            for (int i = 0; i < size; i++) {
                C0106f valueAt = this.f380f.valueAt(i);
                if (valueAt != null && valueAt.f282J != null && valueAt.f287O && cVar.mo328b(valueAt.f320z)) {
                    if (valueAt.f289Q > 0.0f) {
                        valueAt.f282J.setAlpha(valueAt.f289Q);
                    }
                    if (z3) {
                        valueAt.f289Q = 0.0f;
                    } else {
                        valueAt.f289Q = -1.0f;
                        valueAt.f287O = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo551a(C0106f fVar) {
        if (!fVar.f284L) {
            return;
        }
        if (this.f377c) {
            this.f396w = true;
            return;
        }
        fVar.f284L = false;
        mo552a(fVar, this.f386l, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x032b, code lost:
        r1 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x033f, code lost:
        if (r12 >= 1) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0343, code lost:
        if (r10.f394u == false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0349, code lost:
        if (r11.mo359U() == null) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034b, code lost:
        r0 = r11.mo359U();
        r11.mo383a((android.view.View) null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0359, code lost:
        if (r11.mo359U() != null) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x035f, code lost:
        if (r11.mo360V() == null) goto L_0x0448;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0361, code lost:
        r11.mo389b(r12);
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x038c, code lost:
        if (r12 >= 3) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0390, code lost:
        if (f368a == false) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0392, code lost:
        android.util.Log.v("FragmentManager", "movefrom STARTED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03aa, code lost:
        r11.mo350L();
        mo583e(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b0, code lost:
        if (r12 >= 2) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b4, code lost:
        if (f368a == false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03b6, code lost:
        android.util.Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d0, code lost:
        if (r11.f282J == null) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d8, code lost:
        if (r10.f387m.mo487a(r11) == false) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03dc, code lost:
        if (r11.f298d != null) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03de, code lost:
        mo602m(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03e1, code lost:
        r11.mo351M();
        mo585f(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e9, code lost:
        if (r11.f282J == null) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ed, code lost:
        if (r11.f281I == null) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ef, code lost:
        r11.f281I.endViewTransition(r11.f282J);
        r11.f282J.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03fd, code lost:
        if (r10.f386l <= 0) goto L_0x048a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0401, code lost:
        if (r10.f394u != false) goto L_0x048a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0409, code lost:
        if (r11.f282J.getVisibility() != 0) goto L_0x048a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0410, code lost:
        if (r11.f289Q < 0.0f) goto L_0x048a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0412, code lost:
        r0 = mo543a(r11, r13, false, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0416, code lost:
        r11.f289Q = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0419, code lost:
        if (r0 == null) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x041b, code lost:
        m552a(r11, r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x041e, code lost:
        r11.f281I.removeView(r11.f282J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0425, code lost:
        r11.f281I = null;
        r11.f282J = null;
        r11.f294V = null;
        r11.f295W.mo44a(null);
        r11.f283K = null;
        r11.f309o = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x043a, code lost:
        if (r11.mo360V() == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x043c, code lost:
        r0 = r11.mo360V();
        r11.mo372a((android.animation.Animator) null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x044a, code lost:
        if (f368a == false) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x044c, code lost:
        android.util.Log.v("FragmentManager", "movefrom CREATED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0466, code lost:
        if (r11.f277E != false) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0468, code lost:
        r11.mo352N();
        mo589g(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x046e, code lost:
        r11.mo353O();
        mo592h(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0474, code lost:
        if (r15 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0478, code lost:
        if (r11.f277E != false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x047a, code lost:
        mo588g(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x047f, code lost:
        r11.f296b = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0482, code lost:
        r11.f314t = null;
        r11.f318x = null;
        r11.f313s = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x048a, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x048c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d1, code lost:
        mo574c(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d4, code lost:
        if (r12 <= 1) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d8, code lost:
        if (f368a == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01da, code lost:
        android.util.Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f4, code lost:
        if (r11.f308n != false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f8, code lost:
        if (r11.f320z == 0) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fd, code lost:
        if (r11.f320z != -1) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ff, code lost:
        m555a((java.lang.RuntimeException) new java.lang.IllegalArgumentException("Cannot create fragment " + r11 + " for a container view with no id"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0220, code lost:
        r0 = (android.view.ViewGroup) r10.f388n.mo447a(r11.f320z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022a, code lost:
        if (r0 != null) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022e, code lost:
        if (r11.f310p != false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r1 = r11.mo415h().getResourceName(r11.f320z);
     */
    /* JADX WARNING: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo552a(android.support.p006v4.app.C0106f r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            r9 = 3
            r6 = 2
            r5 = 1
            r7 = 0
            r3 = 0
            boolean r0 = r11.f306l
            if (r0 == 0) goto L_0x000d
            boolean r0 = r11.f275C
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            if (r12 <= r5) goto L_0x0010
            r12 = r5
        L_0x0010:
            boolean r0 = r11.f307m
            if (r0 == 0) goto L_0x0023
            int r0 = r11.f296b
            if (r12 <= r0) goto L_0x0023
            int r0 = r11.f296b
            if (r0 != 0) goto L_0x003b
            boolean r0 = r11.mo398c()
            if (r0 == 0) goto L_0x003b
            r12 = r5
        L_0x0023:
            boolean r0 = r11.f284L
            if (r0 == 0) goto L_0x002e
            int r0 = r11.f296b
            if (r0 >= r9) goto L_0x002e
            if (r12 <= r6) goto L_0x002e
            r12 = r6
        L_0x002e:
            int r0 = r11.f296b
            if (r0 > r12) goto L_0x0334
            boolean r0 = r11.f308n
            if (r0 == 0) goto L_0x003e
            boolean r0 = r11.f309o
            if (r0 != 0) goto L_0x003e
        L_0x003a:
            return
        L_0x003b:
            int r12 = r11.f296b
            goto L_0x0023
        L_0x003e:
            android.view.View r0 = r11.mo359U()
            if (r0 != 0) goto L_0x004a
            android.animation.Animator r0 = r11.mo360V()
            if (r0 == 0) goto L_0x005a
        L_0x004a:
            r11.mo383a((android.view.View) r7)
            r11.mo372a((android.animation.Animator) r7)
            int r2 = r11.mo361W()
            r0 = r10
            r1 = r11
            r4 = r3
            r0.mo552a((android.support.p006v4.app.C0106f) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x005a:
            int r0 = r11.f296b
            switch(r0) {
                case 0: goto L_0x009a;
                case 1: goto L_0x01d1;
                case 2: goto L_0x02cc;
                case 3: goto L_0x02f0;
                default: goto L_0x005f;
            }
        L_0x005f:
            int r0 = r11.f296b
            if (r0 == r12) goto L_0x003a
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " not updated inline; "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "expected state "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = " found "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r11.f296b
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            r11.f296b = r12
            goto L_0x003a
        L_0x009a:
            if (r12 <= 0) goto L_0x01d1
            boolean r0 = f368a
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x00b8:
            android.os.Bundle r0 = r11.f297c
            if (r0 == 0) goto L_0x0104
            android.os.Bundle r0 = r11.f297c
            android.support.v4.app.j r1 = r10.f387m
            android.content.Context r1 = r1.mo519g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r11.f297c
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r11.f298d = r0
            android.os.Bundle r0 = r11.f297c
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.f r0 = r10.mo541a((android.os.Bundle) r0, (java.lang.String) r1)
            r11.f303i = r0
            android.support.v4.app.f r0 = r11.f303i
            if (r0 == 0) goto L_0x00ed
            android.os.Bundle r0 = r11.f297c
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r3)
            r11.f305k = r0
        L_0x00ed:
            java.lang.Boolean r0 = r11.f299e
            if (r0 == 0) goto L_0x0153
            java.lang.Boolean r0 = r11.f299e
            boolean r0 = r0.booleanValue()
            r11.f285M = r0
            r11.f299e = r7
        L_0x00fb:
            boolean r0 = r11.f285M
            if (r0 != 0) goto L_0x0104
            r11.f284L = r5
            if (r12 <= r6) goto L_0x0104
            r12 = r6
        L_0x0104:
            android.support.v4.app.j r0 = r10.f387m
            r11.f314t = r0
            android.support.v4.app.f r0 = r10.f389o
            r11.f318x = r0
            android.support.v4.app.f r0 = r10.f389o
            if (r0 == 0) goto L_0x015e
            android.support.v4.app.f r0 = r10.f389o
            android.support.v4.app.l r0 = r0.f315u
        L_0x0114:
            r11.f313s = r0
            android.support.v4.app.f r0 = r11.f303i
            if (r0 == 0) goto L_0x0173
            android.util.SparseArray<android.support.v4.app.f> r0 = r10.f380f
            android.support.v4.app.f r1 = r11.f303i
            int r1 = r1.f300f
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.app.f r1 = r11.f303i
            if (r0 == r1) goto L_0x0165
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " declared target fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            android.support.v4.app.f r2 = r11.f303i
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0153:
            android.os.Bundle r0 = r11.f297c
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r5)
            r11.f285M = r0
            goto L_0x00fb
        L_0x015e:
            android.support.v4.app.j r0 = r10.f387m
            android.support.v4.app.l r0 = r0.mo521i()
            goto L_0x0114
        L_0x0165:
            android.support.v4.app.f r0 = r11.f303i
            int r0 = r0.f296b
            if (r0 >= r5) goto L_0x0173
            android.support.v4.app.f r1 = r11.f303i
            r0 = r10
            r2 = r5
            r4 = r3
            r0.mo552a((android.support.p006v4.app.C0106f) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x0173:
            android.support.v4.app.j r0 = r10.f387m
            android.content.Context r0 = r0.mo519g()
            r10.mo553a((android.support.p006v4.app.C0106f) r11, (android.content.Context) r0, (boolean) r3)
            r11.f280H = r3
            android.support.v4.app.j r0 = r10.f387m
            android.content.Context r0 = r0.mo519g()
            r11.mo375a((android.content.Context) r0)
            boolean r0 = r11.f280H
            if (r0 != 0) goto L_0x01aa
            android.support.v4.app.ac r0 = new android.support.v4.app.ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01aa:
            android.support.v4.app.f r0 = r11.f318x
            if (r0 != 0) goto L_0x031a
            android.support.v4.app.j r0 = r10.f387m
            r0.mo489b(r11)
        L_0x01b3:
            android.support.v4.app.j r0 = r10.f387m
            android.content.Context r0 = r0.mo519g()
            r10.mo567b((android.support.p006v4.app.C0106f) r11, (android.content.Context) r0, (boolean) r3)
            boolean r0 = r11.f291S
            if (r0 != 0) goto L_0x0321
            android.os.Bundle r0 = r11.f297c
            r10.mo554a((android.support.p006v4.app.C0106f) r11, (android.os.Bundle) r0, (boolean) r3)
            android.os.Bundle r0 = r11.f297c
            r11.mo423k(r0)
            android.os.Bundle r0 = r11.f297c
            r10.mo568b((android.support.p006v4.app.C0106f) r11, (android.os.Bundle) r0, (boolean) r3)
        L_0x01cf:
            r11.f277E = r3
        L_0x01d1:
            r10.mo574c((android.support.p006v4.app.C0106f) r11)
            if (r12 <= r5) goto L_0x02cc
            boolean r0 = f368a
            if (r0 == 0) goto L_0x01f2
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x01f2:
            boolean r0 = r11.f308n
            if (r0 != 0) goto L_0x02b7
            int r0 = r11.f320z
            if (r0 == 0) goto L_0x048c
            int r0 = r11.f320z
            r1 = -1
            if (r0 != r1) goto L_0x0220
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " for a container view with no id"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r10.m555a((java.lang.RuntimeException) r0)
        L_0x0220:
            android.support.v4.app.h r0 = r10.f388n
            int r1 = r11.f320z
            android.view.View r0 = r0.mo447a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x026f
            boolean r1 = r11.f310p
            if (r1 != 0) goto L_0x026f
            android.content.res.Resources r1 = r11.mo415h()     // Catch:{ NotFoundException -> 0x032a }
            int r2 = r11.f320z     // Catch:{ NotFoundException -> 0x032a }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x032a }
        L_0x023a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "No view found for id 0x"
            java.lang.StringBuilder r4 = r4.append(r8)
            int r8 = r11.f320z
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r8 = " ("
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = ") for fragment "
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            r10.m555a((java.lang.RuntimeException) r2)
        L_0x026f:
            r11.f281I = r0
            android.os.Bundle r1 = r11.f297c
            android.view.LayoutInflater r1 = r11.mo401d((android.os.Bundle) r1)
            android.os.Bundle r2 = r11.f297c
            r11.mo391b((android.view.LayoutInflater) r1, (android.view.ViewGroup) r0, (android.os.Bundle) r2)
            android.view.View r1 = r11.f282J
            if (r1 == 0) goto L_0x0331
            android.view.View r1 = r11.f282J
            r11.f283K = r1
            android.view.View r1 = r11.f282J
            r1.setSaveFromParentEnabled(r3)
            if (r0 == 0) goto L_0x0290
            android.view.View r1 = r11.f282J
            r0.addView(r1)
        L_0x0290:
            boolean r0 = r11.f274B
            if (r0 == 0) goto L_0x029b
            android.view.View r0 = r11.f282J
            r1 = 8
            r0.setVisibility(r1)
        L_0x029b:
            android.view.View r0 = r11.f282J
            android.os.Bundle r1 = r11.f297c
            r11.mo384a((android.view.View) r0, (android.os.Bundle) r1)
            android.view.View r0 = r11.f282J
            android.os.Bundle r1 = r11.f297c
            r10.mo555a((android.support.p006v4.app.C0106f) r11, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r3)
            android.view.View r0 = r11.f282J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x032f
            android.view.ViewGroup r0 = r11.f281I
            if (r0 == 0) goto L_0x032f
        L_0x02b5:
            r11.f287O = r5
        L_0x02b7:
            android.os.Bundle r0 = r11.f297c
            r11.mo425l(r0)
            android.os.Bundle r0 = r11.f297c
            r10.mo575c(r11, r0, r3)
            android.view.View r0 = r11.f282J
            if (r0 == 0) goto L_0x02ca
            android.os.Bundle r0 = r11.f297c
            r11.mo378a((android.os.Bundle) r0)
        L_0x02ca:
            r11.f297c = r7
        L_0x02cc:
            if (r12 <= r6) goto L_0x02f0
            boolean r0 = f368a
            if (r0 == 0) goto L_0x02ea
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto STARTED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02ea:
            r11.mo345G()
            r10.mo569b((android.support.p006v4.app.C0106f) r11, (boolean) r3)
        L_0x02f0:
            if (r12 <= r9) goto L_0x005f
            boolean r0 = f368a
            if (r0 == 0) goto L_0x030e
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x030e:
            r11.mo346H()
            r10.mo576c((android.support.p006v4.app.C0106f) r11, (boolean) r3)
            r11.f297c = r7
            r11.f298d = r7
            goto L_0x005f
        L_0x031a:
            android.support.v4.app.f r0 = r11.f318x
            r0.mo380a((android.support.p006v4.app.C0106f) r11)
            goto L_0x01b3
        L_0x0321:
            android.os.Bundle r0 = r11.f297c
            r11.mo414g(r0)
            r11.f296b = r5
            goto L_0x01cf
        L_0x032a:
            r1 = move-exception
            java.lang.String r1 = "unknown"
            goto L_0x023a
        L_0x032f:
            r5 = r3
            goto L_0x02b5
        L_0x0331:
            r11.f283K = r7
            goto L_0x02b7
        L_0x0334:
            int r0 = r11.f296b
            if (r0 <= r12) goto L_0x005f
            int r0 = r11.f296b
            switch(r0) {
                case 1: goto L_0x033f;
                case 2: goto L_0x03b0;
                case 3: goto L_0x038c;
                case 4: goto L_0x0367;
                default: goto L_0x033d;
            }
        L_0x033d:
            goto L_0x005f
        L_0x033f:
            if (r12 >= r5) goto L_0x005f
            boolean r0 = r10.f394u
            if (r0 == 0) goto L_0x0355
            android.view.View r0 = r11.mo359U()
            if (r0 == 0) goto L_0x0436
            android.view.View r0 = r11.mo359U()
            r11.mo383a((android.view.View) r7)
            r0.clearAnimation()
        L_0x0355:
            android.view.View r0 = r11.mo359U()
            if (r0 != 0) goto L_0x0361
            android.animation.Animator r0 = r11.mo360V()
            if (r0 == 0) goto L_0x0448
        L_0x0361:
            r11.mo389b((int) r12)
            r12 = r5
            goto L_0x005f
        L_0x0367:
            r0 = 4
            if (r12 >= r0) goto L_0x038c
            boolean r0 = f368a
            if (r0 == 0) goto L_0x0386
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom RESUMED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0386:
            r11.mo349K()
            r10.mo580d(r11, r3)
        L_0x038c:
            if (r12 >= r9) goto L_0x03b0
            boolean r0 = f368a
            if (r0 == 0) goto L_0x03aa
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STARTED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x03aa:
            r11.mo350L()
            r10.mo583e(r11, r3)
        L_0x03b0:
            if (r12 >= r6) goto L_0x033f
            boolean r0 = f368a
            if (r0 == 0) goto L_0x03ce
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x03ce:
            android.view.View r0 = r11.f282J
            if (r0 == 0) goto L_0x03e1
            android.support.v4.app.j r0 = r10.f387m
            boolean r0 = r0.mo487a((android.support.p006v4.app.C0106f) r11)
            if (r0 == 0) goto L_0x03e1
            android.util.SparseArray<android.os.Parcelable> r0 = r11.f298d
            if (r0 != 0) goto L_0x03e1
            r10.mo602m(r11)
        L_0x03e1:
            r11.mo351M()
            r10.mo585f(r11, r3)
            android.view.View r0 = r11.f282J
            if (r0 == 0) goto L_0x0425
            android.view.ViewGroup r0 = r11.f281I
            if (r0 == 0) goto L_0x0425
            android.view.ViewGroup r0 = r11.f281I
            android.view.View r1 = r11.f282J
            r0.endViewTransition(r1)
            android.view.View r0 = r11.f282J
            r0.clearAnimation()
            int r0 = r10.f386l
            if (r0 <= 0) goto L_0x048a
            boolean r0 = r10.f394u
            if (r0 != 0) goto L_0x048a
            android.view.View r0 = r11.f282J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x048a
            float r0 = r11.f289Q
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x048a
            android.support.v4.app.l$c r0 = r10.mo543a((android.support.p006v4.app.C0106f) r11, (int) r13, (boolean) r3, (int) r14)
        L_0x0416:
            r1 = 0
            r11.f289Q = r1
            if (r0 == 0) goto L_0x041e
            r10.m552a((android.support.p006v4.app.C0106f) r11, (android.support.p006v4.app.C0123l.C0132c) r0, (int) r12)
        L_0x041e:
            android.view.ViewGroup r0 = r11.f281I
            android.view.View r1 = r11.f282J
            r0.removeView(r1)
        L_0x0425:
            r11.f281I = r7
            r11.f282J = r7
            r11.f294V = r7
            android.arch.lifecycle.j<android.arch.lifecycle.e> r0 = r11.f295W
            r0.mo44a(r7)
            r11.f283K = r7
            r11.f309o = r3
            goto L_0x033f
        L_0x0436:
            android.animation.Animator r0 = r11.mo360V()
            if (r0 == 0) goto L_0x0355
            android.animation.Animator r0 = r11.mo360V()
            r11.mo372a((android.animation.Animator) r7)
            r0.cancel()
            goto L_0x0355
        L_0x0448:
            boolean r0 = f368a
            if (r0 == 0) goto L_0x0464
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0464:
            boolean r0 = r11.f277E
            if (r0 != 0) goto L_0x047f
            r11.mo352N()
            r10.mo589g(r11, r3)
        L_0x046e:
            r11.mo353O()
            r10.mo592h(r11, r3)
            if (r15 != 0) goto L_0x005f
            boolean r0 = r11.f277E
            if (r0 != 0) goto L_0x0482
            r10.mo588g(r11)
            goto L_0x005f
        L_0x047f:
            r11.f296b = r3
            goto L_0x046e
        L_0x0482:
            r11.f314t = r7
            r11.f318x = r7
            r11.f313s = r7
            goto L_0x005f
        L_0x048a:
            r0 = r7
            goto L_0x0416
        L_0x048c:
            r0 = r7
            goto L_0x026f
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.app.C0123l.mo552a(android.support.v4.app.f, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo553a(C0106f fVar, Context context, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo553a(fVar, context, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo527a((C0120k) this, fVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo554a(C0106f fVar, Bundle bundle, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo554a(fVar, bundle, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo528a((C0120k) this, fVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo555a(C0106f fVar, View view, Bundle bundle, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo555a(fVar, view, bundle, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo529a(this, fVar, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo556a(C0106f fVar, boolean z) {
        if (f368a) {
            Log.v("FragmentManager", "add: " + fVar);
        }
        mo584f(fVar);
        if (fVar.f275C) {
            return;
        }
        if (this.f379e.contains(fVar)) {
            throw new IllegalStateException("Fragment already added: " + fVar);
        }
        synchronized (this.f379e) {
            this.f379e.add(fVar);
        }
        fVar.f306l = true;
        fVar.f307m = false;
        if (fVar.f282J == null) {
            fVar.f288P = false;
        }
        if (fVar.f278F && fVar.f279G) {
            this.f391r = true;
        }
        if (z) {
            mo566b(fVar);
        }
    }

    /* renamed from: a */
    public void mo557a(C0119j jVar, C0117h hVar, C0106f fVar) {
        if (this.f387m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f387m = jVar;
        this.f388n = hVar;
        this.f389o = fVar;
    }

    /* renamed from: a */
    public void mo522a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        if (this.f380f != null && (size5 = this.f380f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size5; i++) {
                C0106f valueAt = this.f380f.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.mo385a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f379e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f379e.get(i2).toString());
            }
        }
        if (this.f382h != null && (size4 = this.f382h.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f382h.get(i3).toString());
            }
        }
        if (this.f381g != null && (size3 = this.f381g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0100c cVar = this.f381g.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                cVar.mo321a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f383i != null && (size2 = this.f383i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.f383i.get(i5));
                }
            }
            if (this.f384j != null && this.f384j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f384j.toArray()));
            }
        }
        if (this.f376b != null && (size = this.f376b.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(this.f376b.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f387m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f388n);
        if (this.f389o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f389o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f386l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f392s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f393t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f394u);
        if (this.f391r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f391r);
        }
        if (this.f395v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f395v);
        }
    }

    /* renamed from: a */
    public void mo558a(boolean z) {
        for (int size = this.f379e.size() - 1; size >= 0; size--) {
            C0106f fVar = this.f379e.get(size);
            if (fVar != null) {
                fVar.mo403d(z);
            }
        }
    }

    /* renamed from: a */
    public boolean mo523a() {
        m572x();
        return m561a((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo559a(int i) {
        return this.f386l >= i;
    }

    /* renamed from: a */
    public boolean mo560a(Menu menu) {
        if (this.f386l < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f379e.size(); i++) {
            C0106f fVar = this.f379e.get(i);
            if (fVar != null && fVar.mo399c(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo561a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.f386l < 1) {
            return false;
        }
        ArrayList<C0106f> arrayList = null;
        int i = 0;
        boolean z2 = false;
        while (i < this.f379e.size()) {
            C0106f fVar = this.f379e.get(i);
            if (fVar == null || !fVar.mo394b(menu, menuInflater)) {
                z = z2;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fVar);
                z = true;
            }
            i++;
            z2 = z;
        }
        if (this.f382h != null) {
            for (int i2 = 0; i2 < this.f382h.size(); i2++) {
                C0106f fVar2 = this.f382h.get(i2);
                if (arrayList == null || !arrayList.contains(fVar2)) {
                    fVar2.mo439u();
                }
            }
        }
        this.f382h = arrayList;
        return z2;
    }

    /* renamed from: a */
    public boolean mo562a(MenuItem menuItem) {
        if (this.f386l < 1) {
            return false;
        }
        for (int i = 0; i < this.f379e.size(); i++) {
            C0106f fVar = this.f379e.get(i);
            if (fVar != null && fVar.mo400c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo563a(ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        if (this.f381g == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f381g.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f381g.remove(size));
            arrayList2.add(true);
        } else {
            int i4 = -1;
            if (str != null || i >= 0) {
                int size2 = this.f381g.size() - 1;
                while (i3 >= 0) {
                    C0100c cVar = this.f381g.get(i3);
                    if ((str != null && str.equals(cVar.mo330d())) || (i >= 0 && i == cVar.f242m)) {
                        break;
                    }
                    size2 = i3 - 1;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    i3--;
                    while (i3 >= 0) {
                        C0100c cVar2 = this.f381g.get(i3);
                        if ((str == null || !str.equals(cVar2.mo330d())) && (i < 0 || i != cVar2.f242m)) {
                            break;
                        }
                        i3--;
                    }
                }
                i4 = i3;
            }
            if (i4 == this.f381g.size() - 1) {
                return false;
            }
            for (int size3 = this.f381g.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f381g.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* renamed from: b */
    public C0106f mo564b(int i) {
        for (int size = this.f379e.size() - 1; size >= 0; size--) {
            C0106f fVar = this.f379e.get(size);
            if (fVar != null && fVar.f319y == i) {
                return fVar;
            }
        }
        if (this.f380f != null) {
            for (int size2 = this.f380f.size() - 1; size2 >= 0; size2--) {
                C0106f valueAt = this.f380f.valueAt(size2);
                if (valueAt != null && valueAt.f319y == i) {
                    return valueAt;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public C0106f mo565b(String str) {
        C0106f a;
        if (!(this.f380f == null || str == null)) {
            for (int size = this.f380f.size() - 1; size >= 0; size--) {
                C0106f valueAt = this.f380f.valueAt(size);
                if (valueAt != null && (a = valueAt.mo364a(str)) != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public List<C0106f> mo524b() {
        List<C0106f> list;
        if (this.f379e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f379e) {
            list = (List) this.f379e.clone();
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo566b(C0106f fVar) {
        mo552a(fVar, this.f386l, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo567b(C0106f fVar, Context context, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo567b(fVar, context, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo531b((C0120k) this, fVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo568b(C0106f fVar, Bundle bundle, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo568b(fVar, bundle, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo532b((C0120k) this, fVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo569b(C0106f fVar, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo569b(fVar, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo526a(this, fVar);
            }
        }
    }

    /* renamed from: b */
    public void mo570b(Menu menu) {
        if (this.f386l >= 1) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f379e.size()) {
                    C0106f fVar = this.f379e.get(i2);
                    if (fVar != null) {
                        fVar.mo402d(menu);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo571b(boolean z) {
        for (int size = this.f379e.size() - 1; size >= 0; size--) {
            C0106f fVar = this.f379e.get(size);
            if (fVar != null) {
                fVar.mo408e(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo572b(MenuItem menuItem) {
        if (this.f386l < 1) {
            return false;
        }
        for (int i = 0; i < this.f379e.size(); i++) {
            C0106f fVar = this.f379e.get(i);
            if (fVar != null && fVar.mo405d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo573c(int i) {
        synchronized (this) {
            this.f383i.set(i, (Object) null);
            if (this.f384j == null) {
                this.f384j = new ArrayList<>();
            }
            if (f368a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f384j.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo574c(C0106f fVar) {
        if (fVar.f308n && !fVar.f311q) {
            fVar.mo391b(fVar.mo401d(fVar.f297c), (ViewGroup) null, fVar.f297c);
            if (fVar.f282J != null) {
                fVar.f283K = fVar.f282J;
                fVar.f282J.setSaveFromParentEnabled(false);
                if (fVar.f274B) {
                    fVar.f282J.setVisibility(8);
                }
                fVar.mo384a(fVar.f282J, fVar.f297c);
                mo555a(fVar, fVar.f282J, fVar.f297c, false);
                return;
            }
            fVar.f283K = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo575c(C0106f fVar, Bundle bundle, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo575c(fVar, bundle, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo534c(this, fVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo576c(C0106f fVar, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo576c(fVar, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo530b(this, fVar);
            }
        }
    }

    /* renamed from: c */
    public boolean mo525c() {
        return this.f392s || this.f393t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo577d() {
        if (this.f380f != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f380f.size()) {
                    C0106f valueAt = this.f380f.valueAt(i2);
                    if (valueAt != null) {
                        mo551a(valueAt);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo578d(final C0106f fVar) {
        if (fVar.f282J != null) {
            C0132c a = mo543a(fVar, fVar.mo355Q(), !fVar.f274B, fVar.mo356R());
            if (a == null || a.f417b == null) {
                if (a != null) {
                    m564b(fVar.f282J, a);
                    fVar.f282J.startAnimation(a.f416a);
                    a.f416a.start();
                }
                fVar.f282J.setVisibility((!fVar.f274B || fVar.mo363Y()) ? 0 : 8);
                if (fVar.mo363Y()) {
                    fVar.mo412f(false);
                }
            } else {
                a.f417b.setTarget(fVar.f282J);
                if (!fVar.f274B) {
                    fVar.f282J.setVisibility(0);
                } else if (fVar.mo363Y()) {
                    fVar.mo412f(false);
                } else {
                    final ViewGroup viewGroup = fVar.f281I;
                    final View view = fVar.f282J;
                    viewGroup.startViewTransition(view);
                    a.f417b.addListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fVar.f282J != null) {
                                fVar.f282J.setVisibility(8);
                            }
                        }
                    });
                }
                m564b(fVar.f282J, a);
                a.f417b.start();
            }
        }
        if (fVar.f306l && fVar.f278F && fVar.f279G) {
            this.f391r = true;
        }
        fVar.f288P = false;
        fVar.mo386a(fVar.f274B);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo579d(C0106f fVar, Bundle bundle, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo579d(fVar, bundle, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo536d(this, fVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo580d(C0106f fVar, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo580d(fVar, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo533c(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo581e() {
        boolean z = true;
        synchronized (this) {
            boolean z2 = this.f372C != null && !this.f372C.isEmpty();
            if (this.f376b == null || this.f376b.size() != 1) {
                z = false;
            }
            if (z2 || z) {
                this.f387m.mo520h().removeCallbacks(this.f374E);
                this.f387m.mo520h().post(this.f374E);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r0 = r0.f282J;
        r1 = r9.f281I;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo582e(android.support.p006v4.app.C0106f r9) {
        /*
            r8 = this;
            r7 = 1
            r6 = 0
            r5 = 0
            if (r9 != 0) goto L_0x0006
        L_0x0005:
            return
        L_0x0006:
            int r2 = r8.f386l
            boolean r0 = r9.f307m
            if (r0 == 0) goto L_0x0016
            boolean r0 = r9.mo398c()
            if (r0 == 0) goto L_0x0084
            int r2 = java.lang.Math.min(r2, r7)
        L_0x0016:
            int r3 = r9.mo355Q()
            int r4 = r9.mo356R()
            r0 = r8
            r1 = r9
            r0.mo552a((android.support.p006v4.app.C0106f) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            android.view.View r0 = r9.f282J
            if (r0 == 0) goto L_0x007c
            android.support.v4.app.f r0 = r8.m571p(r9)
            if (r0 == 0) goto L_0x0045
            android.view.View r0 = r0.f282J
            android.view.ViewGroup r1 = r9.f281I
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r9.f282J
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x0045
            r1.removeViewAt(r2)
            android.view.View r2 = r9.f282J
            r1.addView(r2, r0)
        L_0x0045:
            boolean r0 = r9.f287O
            if (r0 == 0) goto L_0x007c
            android.view.ViewGroup r0 = r9.f281I
            if (r0 == 0) goto L_0x007c
            float r0 = r9.f289Q
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            android.view.View r0 = r9.f282J
            float r1 = r9.f289Q
            r0.setAlpha(r1)
        L_0x005a:
            r9.f289Q = r6
            r9.f287O = r5
            int r0 = r9.mo355Q()
            int r1 = r9.mo356R()
            android.support.v4.app.l$c r0 = r8.mo543a((android.support.p006v4.app.C0106f) r9, (int) r0, (boolean) r7, (int) r1)
            if (r0 == 0) goto L_0x007c
            android.view.View r1 = r9.f282J
            m564b((android.view.View) r1, (android.support.p006v4.app.C0123l.C0132c) r0)
            android.view.animation.Animation r1 = r0.f416a
            if (r1 == 0) goto L_0x0089
            android.view.View r1 = r9.f282J
            android.view.animation.Animation r0 = r0.f416a
            r1.startAnimation(r0)
        L_0x007c:
            boolean r0 = r9.f288P
            if (r0 == 0) goto L_0x0005
            r8.mo578d((android.support.p006v4.app.C0106f) r9)
            goto L_0x0005
        L_0x0084:
            int r2 = java.lang.Math.min(r2, r5)
            goto L_0x0016
        L_0x0089:
            android.animation.Animator r1 = r0.f417b
            android.view.View r2 = r9.f282J
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f417b
            r0.start()
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.app.C0123l.mo582e(android.support.v4.app.f):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo583e(C0106f fVar, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo583e(fVar, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo535d(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo584f(C0106f fVar) {
        if (fVar.f300f < 0) {
            int i = this.f378d;
            this.f378d = i + 1;
            fVar.mo370a(i, this.f389o);
            if (this.f380f == null) {
                this.f380f = new SparseArray<>();
            }
            this.f380f.put(fVar.f300f, fVar);
            if (f368a) {
                Log.v("FragmentManager", "Allocated fragment index " + fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo585f(C0106f fVar, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo585f(fVar, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo537e(this, fVar);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public boolean mo586f() {
        m567c(true);
        boolean z = false;
        while (m568c(this.f397x, this.f398y)) {
            this.f377c = true;
            try {
                m565b(this.f397x, this.f398y);
                m573y();
                z = true;
            } catch (Throwable th) {
                m573y();
                throw th;
            }
        }
        mo587g();
        m547B();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo587g() {
        if (this.f396w) {
            this.f396w = false;
            mo577d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo588g(C0106f fVar) {
        if (fVar.f300f >= 0) {
            if (f368a) {
                Log.v("FragmentManager", "Freeing fragment index " + fVar);
            }
            this.f380f.put(fVar.f300f, (Object) null);
            fVar.mo436s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo589g(C0106f fVar, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo589g(fVar, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo538f(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo590h() {
        if (this.f385k != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f385k.size()) {
                    this.f385k.get(i2).mo540a();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public void mo591h(C0106f fVar) {
        if (f368a) {
            Log.v("FragmentManager", "remove: " + fVar + " nesting=" + fVar.f312r);
        }
        boolean z = !fVar.mo398c();
        if (!fVar.f275C || z) {
            synchronized (this.f379e) {
                this.f379e.remove(fVar);
            }
            if (fVar.f278F && fVar.f279G) {
                this.f391r = true;
            }
            fVar.f306l = false;
            fVar.f307m = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo592h(C0106f fVar, boolean z) {
        if (this.f389o != null) {
            C0120k i = this.f389o.mo418i();
            if (i instanceof C0123l) {
                ((C0123l) i).mo592h(fVar, true);
            }
        }
        Iterator<C0135f> it = this.f375J.iterator();
        while (it.hasNext()) {
            C0135f next = it.next();
            if (!z || next.f425b) {
                next.f424a.mo539g(this, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0139m mo593i() {
        m553a(this.f373D);
        return this.f373D;
    }

    /* renamed from: i */
    public void mo594i(C0106f fVar) {
        boolean z = true;
        if (f368a) {
            Log.v("FragmentManager", "hide: " + fVar);
        }
        if (!fVar.f274B) {
            fVar.f274B = true;
            if (fVar.f288P) {
                z = false;
            }
            fVar.f288P = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo595j() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0139m mVar;
        if (this.f380f != null) {
            int i = 0;
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            while (i < this.f380f.size()) {
                C0106f valueAt = this.f380f.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.f276D) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAt);
                        valueAt.f304j = valueAt.f303i != null ? valueAt.f303i.f300f : -1;
                        if (f368a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    if (valueAt.f315u != null) {
                        valueAt.f315u.mo595j();
                        mVar = valueAt.f315u.f373D;
                    } else {
                        mVar = valueAt.f316v;
                    }
                    if (arrayList2 == null && mVar != null) {
                        arrayList2 = new ArrayList(this.f380f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add((Object) null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(mVar);
                    }
                    if (arrayList3 == null && valueAt.f317w != null) {
                        arrayList3 = new ArrayList(this.f380f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList3.add((Object) null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(valueAt.f317w);
                    }
                }
                i++;
                arrayList3 = arrayList3;
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.f373D = null;
        } else {
            this.f373D = new C0139m(arrayList, arrayList2, arrayList3);
        }
    }

    /* renamed from: j */
    public void mo596j(C0106f fVar) {
        boolean z = false;
        if (f368a) {
            Log.v("FragmentManager", "show: " + fVar);
        }
        if (fVar.f274B) {
            fVar.f274B = false;
            if (!fVar.f288P) {
                z = true;
            }
            fVar.f288P = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Parcelable mo597k() {
        int[] iArr;
        int size;
        boolean z;
        C0102d[] dVarArr = null;
        m574z();
        m546A();
        mo586f();
        this.f392s = true;
        this.f373D = null;
        if (this.f380f == null || this.f380f.size() <= 0) {
            return null;
        }
        int size2 = this.f380f.size();
        C0142o[] oVarArr = new C0142o[size2];
        int i = 0;
        boolean z2 = false;
        while (i < size2) {
            C0106f valueAt = this.f380f.valueAt(i);
            if (valueAt != null) {
                if (valueAt.f300f < 0) {
                    m555a((RuntimeException) new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f300f));
                }
                C0142o oVar = new C0142o(valueAt);
                oVarArr[i] = oVar;
                if (valueAt.f296b <= 0 || oVar.f448k != null) {
                    oVar.f448k = valueAt.f297c;
                } else {
                    oVar.f448k = mo603n(valueAt);
                    if (valueAt.f303i != null) {
                        if (valueAt.f303i.f300f < 0) {
                            m555a((RuntimeException) new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.f303i));
                        }
                        if (oVar.f448k == null) {
                            oVar.f448k = new Bundle();
                        }
                        mo547a(oVar.f448k, "android:target_state", valueAt.f303i);
                        if (valueAt.f305k != 0) {
                            oVar.f448k.putInt("android:target_req_state", valueAt.f305k);
                        }
                    }
                }
                if (f368a) {
                    Log.v("FragmentManager", "Saved state of " + valueAt + ": " + oVar.f448k);
                }
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (z2) {
            int size3 = this.f379e.size();
            if (size3 > 0) {
                iArr = new int[size3];
                for (int i2 = 0; i2 < size3; i2++) {
                    iArr[i2] = this.f379e.get(i2).f300f;
                    if (iArr[i2] < 0) {
                        m555a((RuntimeException) new IllegalStateException("Failure saving state: active " + this.f379e.get(i2) + " has cleared index: " + iArr[i2]));
                    }
                    if (f368a) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f379e.get(i2));
                    }
                }
            } else {
                iArr = null;
            }
            if (this.f381g != null && (size = this.f381g.size()) > 0) {
                dVarArr = new C0102d[size];
                for (int i3 = 0; i3 < size; i3++) {
                    dVarArr[i3] = new C0102d(this.f381g.get(i3));
                    if (f368a) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f381g.get(i3));
                    }
                }
            }
            C0140n nVar = new C0140n();
            nVar.f433a = oVarArr;
            nVar.f434b = iArr;
            nVar.f435c = dVarArr;
            if (this.f390p != null) {
                nVar.f436d = this.f390p.f300f;
            }
            nVar.f437e = this.f378d;
            mo595j();
            return nVar;
        } else if (!f368a) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    /* renamed from: k */
    public void mo598k(C0106f fVar) {
        if (f368a) {
            Log.v("FragmentManager", "detach: " + fVar);
        }
        if (!fVar.f275C) {
            fVar.f275C = true;
            if (fVar.f306l) {
                if (f368a) {
                    Log.v("FragmentManager", "remove from detach: " + fVar);
                }
                synchronized (this.f379e) {
                    this.f379e.remove(fVar);
                }
                if (fVar.f278F && fVar.f279G) {
                    this.f391r = true;
                }
                fVar.f306l = false;
            }
        }
    }

    /* renamed from: l */
    public void mo599l() {
        this.f373D = null;
        this.f392s = false;
        this.f393t = false;
        int size = this.f379e.size();
        for (int i = 0; i < size; i++) {
            C0106f fVar = this.f379e.get(i);
            if (fVar != null) {
                fVar.mo347I();
            }
        }
    }

    /* renamed from: l */
    public void mo600l(C0106f fVar) {
        if (f368a) {
            Log.v("FragmentManager", "attach: " + fVar);
        }
        if (fVar.f275C) {
            fVar.f275C = false;
            if (fVar.f306l) {
                return;
            }
            if (this.f379e.contains(fVar)) {
                throw new IllegalStateException("Fragment already added: " + fVar);
            }
            if (f368a) {
                Log.v("FragmentManager", "add from attach: " + fVar);
            }
            synchronized (this.f379e) {
                this.f379e.add(fVar);
            }
            fVar.f306l = true;
            if (fVar.f278F && fVar.f279G) {
                this.f391r = true;
            }
        }
    }

    /* renamed from: m */
    public void mo601m() {
        this.f392s = false;
        this.f393t = false;
        m570e(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo602m(C0106f fVar) {
        if (fVar.f283K != null) {
            if (this.f371B == null) {
                this.f371B = new SparseArray<>();
            } else {
                this.f371B.clear();
            }
            fVar.f283K.saveHierarchyState(this.f371B);
            if (this.f371B.size() > 0) {
                fVar.f298d = this.f371B;
                this.f371B = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Bundle mo603n(C0106f fVar) {
        Bundle bundle;
        if (this.f370A == null) {
            this.f370A = new Bundle();
        }
        fVar.mo427m(this.f370A);
        mo579d(fVar, this.f370A, false);
        if (!this.f370A.isEmpty()) {
            bundle = this.f370A;
            this.f370A = null;
        } else {
            bundle = null;
        }
        if (fVar.f282J != null) {
            mo602m(fVar);
        }
        if (fVar.f298d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fVar.f298d);
        }
        if (!fVar.f285M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fVar.f285M);
        }
        return bundle;
    }

    /* renamed from: n */
    public void mo604n() {
        this.f392s = false;
        this.f393t = false;
        m570e(2);
    }

    /* renamed from: o */
    public void mo605o() {
        this.f392s = false;
        this.f393t = false;
        m570e(3);
    }

    /* renamed from: o */
    public void mo606o(C0106f fVar) {
        if (fVar == null || (this.f380f.get(fVar.f300f) == fVar && (fVar.f314t == null || fVar.mo418i() == this))) {
            this.f390p = fVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fVar + " is not an active fragment of FragmentManager " + this);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0106f fVar;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0136g.f426a);
        String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0106f.m355a(this.f387m.mo519g(), string)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        C0106f b = resourceId != -1 ? mo564b(resourceId) : null;
        if (b == null && string2 != null) {
            b = mo542a(string2);
        }
        if (b == null && id != -1) {
            b = mo564b(id);
        }
        if (f368a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + b);
        }
        if (b == null) {
            C0106f a = this.f388n.mo446a(context, string, (Bundle) null);
            a.f308n = true;
            a.f319y = resourceId != 0 ? resourceId : id;
            a.f320z = id;
            a.f273A = string2;
            a.f309o = true;
            a.f313s = this;
            a.f314t = this.f387m;
            a.mo376a(this.f387m.mo519g(), attributeSet, a.f297c);
            mo556a(a, true);
            fVar = a;
        } else if (b.f309o) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            b.f309o = true;
            b.f314t = this.f387m;
            if (!b.f277E) {
                b.mo376a(this.f387m.mo519g(), attributeSet, b.f297c);
            }
            fVar = b;
        }
        if (this.f386l >= 1 || !fVar.f308n) {
            mo566b(fVar);
        } else {
            mo552a(fVar, 1, 0, 0, false);
        }
        if (fVar.f282J == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            fVar.f282J.setId(resourceId);
        }
        if (fVar.f282J.getTag() == null) {
            fVar.f282J.setTag(string2);
        }
        return fVar.f282J;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo609p() {
        this.f392s = false;
        this.f393t = false;
        m570e(4);
    }

    /* renamed from: q */
    public void mo610q() {
        m570e(3);
    }

    /* renamed from: r */
    public void mo611r() {
        this.f393t = true;
        m570e(2);
    }

    /* renamed from: s */
    public void mo612s() {
        m570e(1);
    }

    /* renamed from: t */
    public void mo613t() {
        this.f394u = true;
        mo586f();
        m570e(0);
        this.f387m = null;
        this.f388n = null;
        this.f389o = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f389o != null) {
            C0204d.m880a(this.f389o, sb);
        } else {
            C0204d.m880a(this.f387m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo615u() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f379e.size()) {
                C0106f fVar = this.f379e.get(i2);
                if (fVar != null) {
                    fVar.mo348J();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: v */
    public C0106f mo616v() {
        return this.f390p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public LayoutInflater.Factory2 mo617w() {
        return this;
    }
}
