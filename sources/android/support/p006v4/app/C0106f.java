package android.support.p006v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0021c;
import android.arch.lifecycle.C0025e;
import android.arch.lifecycle.C0026f;
import android.arch.lifecycle.C0032j;
import android.arch.lifecycle.C0040p;
import android.arch.lifecycle.C0041q;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p006v4.p014f.C0204d;
import android.support.p006v4.p014f.C0216k;
import android.support.p006v4.p015g.C0238f;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.app.f */
public class C0106f implements C0025e, C0041q, ComponentCallbacks, View.OnCreateContextMenuListener {

    /* renamed from: X */
    private static final C0216k<String, Class<?>> f271X = new C0216k<>();

    /* renamed from: a */
    static final Object f272a = new Object();

    /* renamed from: A */
    String f273A;

    /* renamed from: B */
    boolean f274B;

    /* renamed from: C */
    boolean f275C;

    /* renamed from: D */
    boolean f276D;

    /* renamed from: E */
    boolean f277E;

    /* renamed from: F */
    boolean f278F;

    /* renamed from: G */
    boolean f279G = true;

    /* renamed from: H */
    boolean f280H;

    /* renamed from: I */
    ViewGroup f281I;

    /* renamed from: J */
    View f282J;

    /* renamed from: K */
    View f283K;

    /* renamed from: L */
    boolean f284L;

    /* renamed from: M */
    boolean f285M = true;

    /* renamed from: N */
    C0110a f286N;

    /* renamed from: O */
    boolean f287O;

    /* renamed from: P */
    boolean f288P;

    /* renamed from: Q */
    float f289Q;

    /* renamed from: R */
    LayoutInflater f290R;

    /* renamed from: S */
    boolean f291S;

    /* renamed from: T */
    C0026f f292T = new C0026f(this);

    /* renamed from: U */
    C0026f f293U;

    /* renamed from: V */
    C0025e f294V;

    /* renamed from: W */
    C0032j<C0025e> f295W = new C0032j<>();

    /* renamed from: b */
    int f296b = 0;

    /* renamed from: c */
    Bundle f297c;

    /* renamed from: d */
    SparseArray<Parcelable> f298d;

    /* renamed from: e */
    Boolean f299e;

    /* renamed from: f */
    int f300f = -1;

    /* renamed from: g */
    String f301g;

    /* renamed from: h */
    Bundle f302h;

    /* renamed from: i */
    C0106f f303i;

    /* renamed from: j */
    int f304j = -1;

    /* renamed from: k */
    int f305k;

    /* renamed from: l */
    boolean f306l;

    /* renamed from: m */
    boolean f307m;

    /* renamed from: n */
    boolean f308n;

    /* renamed from: o */
    boolean f309o;

    /* renamed from: p */
    boolean f310p;

    /* renamed from: q */
    boolean f311q;

    /* renamed from: r */
    int f312r;

    /* renamed from: s */
    C0123l f313s;

    /* renamed from: t */
    C0119j f314t;

    /* renamed from: u */
    C0123l f315u;

    /* renamed from: v */
    C0139m f316v;

    /* renamed from: w */
    C0040p f317w;

    /* renamed from: x */
    C0106f f318x;

    /* renamed from: y */
    int f319y;

    /* renamed from: z */
    int f320z;

    /* renamed from: android.support.v4.app.f$a */
    static class C0110a {

        /* renamed from: a */
        View f324a;

        /* renamed from: b */
        Animator f325b;

        /* renamed from: c */
        int f326c;

        /* renamed from: d */
        int f327d;

        /* renamed from: e */
        int f328e;

        /* renamed from: f */
        int f329f;

        /* renamed from: g */
        Object f330g = null;

        /* renamed from: h */
        Object f331h = C0106f.f272a;

        /* renamed from: i */
        Object f332i = null;

        /* renamed from: j */
        Object f333j = C0106f.f272a;

        /* renamed from: k */
        Object f334k = null;

        /* renamed from: l */
        Object f335l = C0106f.f272a;

        /* renamed from: m */
        Boolean f336m;

        /* renamed from: n */
        Boolean f337n;

        /* renamed from: o */
        C0094ab f338o = null;

        /* renamed from: p */
        C0094ab f339p = null;

        /* renamed from: q */
        boolean f340q;

        /* renamed from: r */
        C0112c f341r;

        /* renamed from: s */
        boolean f342s;

        C0110a() {
        }
    }

    /* renamed from: android.support.v4.app.f$b */
    public static class C0111b extends RuntimeException {
        public C0111b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.app.f$c */
    interface C0112c {
        /* renamed from: a */
        void mo449a();

        /* renamed from: b */
        void mo450b();
    }

    /* renamed from: Z */
    private C0110a m353Z() {
        if (this.f286N == null) {
            this.f286N = new C0110a();
        }
        return this.f286N;
    }

    /* renamed from: a */
    public static C0106f m354a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f271X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f271X.put(str, cls);
            }
            C0106f fVar = (C0106f) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fVar.getClass().getClassLoader());
                fVar.mo390b(bundle);
            }
            return fVar;
        } catch (ClassNotFoundException e) {
            throw new C0111b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0111b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0111b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0111b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0111b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* renamed from: a */
    static boolean m355a(Context context, String str) {
        try {
            Class<?> cls = f271X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f271X.put(str, cls);
            }
            return C0106f.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: A */
    public Object mo339A() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f335l == f272a ? mo444z() : this.f286N.f335l;
    }

    /* renamed from: B */
    public boolean mo340B() {
        if (this.f286N == null || this.f286N.f337n == null) {
            return true;
        }
        return this.f286N.f337n.booleanValue();
    }

    /* renamed from: C */
    public boolean mo341C() {
        if (this.f286N == null || this.f286N.f336m == null) {
            return true;
        }
        return this.f286N.f336m.booleanValue();
    }

    /* renamed from: D */
    public void mo342D() {
        if (this.f313s == null || this.f313s.f387m == null) {
            m353Z().f340q = false;
        } else if (Looper.myLooper() != this.f313s.f387m.mo520h().getLooper()) {
            this.f313s.f387m.mo520h().postAtFrontOfQueue(new Runnable() {
                public void run() {
                    C0106f.this.mo343E();
                }
            });
        } else {
            mo343E();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo343E() {
        C0112c cVar = null;
        if (this.f286N != null) {
            this.f286N.f340q = false;
            C0112c cVar2 = this.f286N.f341r;
            this.f286N.f341r = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.mo449a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo344F() {
        if (this.f314t == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f315u = new C0123l();
        this.f315u.mo557a(this.f314t, (C0117h) new C0117h() {
            /* renamed from: a */
            public C0106f mo446a(Context context, String str, Bundle bundle) {
                return C0106f.this.f314t.mo446a(context, str, bundle);
            }

            /* renamed from: a */
            public View mo447a(int i) {
                if (C0106f.this.f282J != null) {
                    return C0106f.this.f282J.findViewById(i);
                }
                throw new IllegalStateException("Fragment does not have a view");
            }

            /* renamed from: a */
            public boolean mo448a() {
                return C0106f.this.f282J != null;
            }
        }, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo345G() {
        if (this.f315u != null) {
            this.f315u.mo599l();
            this.f315u.mo586f();
        }
        this.f296b = 3;
        this.f280H = false;
        mo426m();
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.f315u != null) {
            this.f315u.mo605o();
        }
        this.f292T.mo65a(C0021c.C0022a.ON_START);
        if (this.f282J != null) {
            this.f293U.mo65a(C0021c.C0022a.ON_START);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo346H() {
        if (this.f315u != null) {
            this.f315u.mo599l();
            this.f315u.mo586f();
        }
        this.f296b = 4;
        this.f280H = false;
        mo428n();
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onResume()");
        }
        if (this.f315u != null) {
            this.f315u.mo609p();
            this.f315u.mo586f();
        }
        this.f292T.mo65a(C0021c.C0022a.ON_RESUME);
        if (this.f282J != null) {
            this.f293U.mo65a(C0021c.C0022a.ON_RESUME);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo347I() {
        if (this.f315u != null) {
            this.f315u.mo599l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo348J() {
        onLowMemory();
        if (this.f315u != null) {
            this.f315u.mo615u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo349K() {
        if (this.f282J != null) {
            this.f293U.mo65a(C0021c.C0022a.ON_PAUSE);
        }
        this.f292T.mo65a(C0021c.C0022a.ON_PAUSE);
        if (this.f315u != null) {
            this.f315u.mo610q();
        }
        this.f296b = 3;
        this.f280H = false;
        mo429o();
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo350L() {
        if (this.f282J != null) {
            this.f293U.mo65a(C0021c.C0022a.ON_STOP);
        }
        this.f292T.mo65a(C0021c.C0022a.ON_STOP);
        if (this.f315u != null) {
            this.f315u.mo611r();
        }
        this.f296b = 2;
        this.f280H = false;
        mo433p();
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo351M() {
        if (this.f282J != null) {
            this.f293U.mo65a(C0021c.C0022a.ON_DESTROY);
        }
        if (this.f315u != null) {
            this.f315u.mo612s();
        }
        this.f296b = 1;
        this.f280H = false;
        mo434q();
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        C0160t.m740a(this).mo280a();
        this.f311q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo352N() {
        this.f292T.mo65a(C0021c.C0022a.ON_DESTROY);
        if (this.f315u != null) {
            this.f315u.mo613t();
        }
        this.f296b = 0;
        this.f280H = false;
        this.f291S = false;
        mo435r();
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onDestroy()");
        }
        this.f315u = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo353O() {
        this.f280H = false;
        mo437t();
        this.f290R = null;
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onDetach()");
        } else if (this.f315u == null) {
        } else {
            if (!this.f277E) {
                throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
            }
            this.f315u.mo613t();
            this.f315u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo354P() {
        if (this.f286N == null) {
            return 0;
        }
        return this.f286N.f327d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public int mo355Q() {
        if (this.f286N == null) {
            return 0;
        }
        return this.f286N.f328e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public int mo356R() {
        if (this.f286N == null) {
            return 0;
        }
        return this.f286N.f329f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public C0094ab mo357S() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f338o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public C0094ab mo358T() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f339p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public View mo359U() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f324a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public Animator mo360V() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f325b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public int mo361W() {
        if (this.f286N == null) {
            return 0;
        }
        return this.f286N.f326c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo362X() {
        if (this.f286N == null) {
            return false;
        }
        return this.f286N.f340q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo363Y() {
        if (this.f286N == null) {
            return false;
        }
        return this.f286N.f342s;
    }

    /* renamed from: a */
    public C0021c mo64a() {
        return this.f292T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0106f mo364a(String str) {
        if (str.equals(this.f301g)) {
            return this;
        }
        if (this.f315u != null) {
            return this.f315u.mo565b(str);
        }
        return null;
    }

    /* renamed from: a */
    public View mo365a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation mo366a(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo367a(int i) {
        if (this.f286N != null || i != 0) {
            m353Z().f327d = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo368a(int i, int i2) {
        if (this.f286N != null || i != 0 || i2 != 0) {
            m353Z();
            this.f286N.f328e = i;
            this.f286N.f329f = i2;
        }
    }

    /* renamed from: a */
    public void mo369a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo370a(int i, C0106f fVar) {
        this.f300f = i;
        if (fVar != null) {
            this.f301g = fVar.f301g + ":" + this.f300f;
        } else {
            this.f301g = "android:fragment:" + this.f300f;
        }
    }

    /* renamed from: a */
    public void mo371a(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo372a(Animator animator) {
        m353Z().f325b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void mo373a(Activity activity) {
        this.f280H = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo374a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f280H = true;
    }

    /* renamed from: a */
    public void mo375a(Context context) {
        this.f280H = true;
        Activity f = this.f314t == null ? null : this.f314t.mo518f();
        if (f != null) {
            this.f280H = false;
            mo373a(f);
        }
    }

    /* renamed from: a */
    public void mo376a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f280H = true;
        Activity f = this.f314t == null ? null : this.f314t.mo518f();
        if (f != null) {
            this.f280H = false;
            mo374a(f, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo377a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f315u != null) {
            this.f315u.mo546a(configuration);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo378a(Bundle bundle) {
        if (this.f298d != null) {
            this.f283K.restoreHierarchyState(this.f298d);
            this.f298d = null;
        }
        this.f280H = false;
        mo419i(bundle);
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f282J != null) {
            this.f293U.mo65a(C0021c.C0022a.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo379a(C0112c cVar) {
        m353Z();
        if (cVar != this.f286N.f341r) {
            if (cVar == null || this.f286N.f341r == null) {
                if (this.f286N.f340q) {
                    this.f286N.f341r = cVar;
                }
                if (cVar != null) {
                    cVar.mo450b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: a */
    public void mo380a(C0106f fVar) {
    }

    /* renamed from: a */
    public void mo381a(Menu menu) {
    }

    /* renamed from: a */
    public void mo382a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo383a(View view) {
        m353Z().f324a = view;
    }

    /* renamed from: a */
    public void mo384a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo385a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f319y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f320z));
        printWriter.print(" mTag=");
        printWriter.println(this.f273A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f296b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f300f);
        printWriter.print(" mWho=");
        printWriter.print(this.f301g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f312r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f306l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f307m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f308n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f309o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f274B);
        printWriter.print(" mDetached=");
        printWriter.print(this.f275C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f279G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f278F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f276D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f277E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f285M);
        if (this.f313s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f313s);
        }
        if (this.f314t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f314t);
        }
        if (this.f318x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f318x);
        }
        if (this.f302h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f302h);
        }
        if (this.f297c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f297c);
        }
        if (this.f298d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f298d);
        }
        if (this.f303i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f303i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f305k);
        }
        if (mo354P() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo354P());
        }
        if (this.f281I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f281I);
        }
        if (this.f282J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f282J);
        }
        if (this.f283K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f282J);
        }
        if (mo359U() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo359U());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo361W());
        }
        if (mo406e() != null) {
            C0160t.m740a(this).mo281a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.f315u != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f315u + ":");
            this.f315u.mo522a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public void mo386a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo387a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public Animator mo388b(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: b */
    public C0040p mo87b() {
        if (mo406e() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f317w == null) {
            this.f317w = new C0040p();
        }
        return this.f317w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo389b(int i) {
        m353Z().f326c = i;
    }

    /* renamed from: b */
    public void mo390b(Bundle bundle) {
        if (this.f300f < 0 || !mo404d()) {
            this.f302h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo391b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f315u != null) {
            this.f315u.mo599l();
        }
        this.f311q = true;
        this.f294V = new C0025e() {
            /* renamed from: a */
            public C0021c mo64a() {
                if (C0106f.this.f293U == null) {
                    C0106f.this.f293U = new C0026f(C0106f.this.f294V);
                }
                return C0106f.this.f293U;
            }
        };
        this.f293U = null;
        this.f282J = mo365a(layoutInflater, viewGroup, bundle);
        if (this.f282J != null) {
            this.f294V.mo64a();
            this.f295W.mo44a(this.f294V);
        } else if (this.f293U != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.f294V = null;
        }
    }

    /* renamed from: b */
    public void mo392b(Menu menu) {
    }

    /* renamed from: b */
    public void mo393b(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo394b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f274B) {
            return false;
        }
        if (this.f278F && this.f279G) {
            z = true;
            mo382a(menu, menuInflater);
        }
        return this.f315u != null ? z | this.f315u.mo561a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean mo395b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: c */
    public LayoutInflater mo396c(Bundle bundle) {
        return mo407e(bundle);
    }

    /* renamed from: c */
    public void mo397c(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo398c() {
        return this.f312r > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo399c(Menu menu) {
        boolean z = false;
        if (this.f274B) {
            return false;
        }
        if (this.f278F && this.f279G) {
            z = true;
            mo381a(menu);
        }
        return this.f315u != null ? z | this.f315u.mo560a(menu) : z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo400c(MenuItem menuItem) {
        if (!this.f274B) {
            if (!this.f278F || !this.f279G || !mo387a(menuItem)) {
                return this.f315u != null && this.f315u.mo562a(menuItem);
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LayoutInflater mo401d(Bundle bundle) {
        this.f290R = mo396c(bundle);
        return this.f290R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo402d(Menu menu) {
        if (!this.f274B) {
            if (this.f278F && this.f279G) {
                mo392b(menu);
            }
            if (this.f315u != null) {
                this.f315u.mo570b(menu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo403d(boolean z) {
        mo393b(z);
        if (this.f315u != null) {
            this.f315u.mo558a(z);
        }
    }

    /* renamed from: d */
    public final boolean mo404d() {
        if (this.f313s == null) {
            return false;
        }
        return this.f313s.mo525c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo405d(MenuItem menuItem) {
        if (!this.f274B) {
            if (mo395b(menuItem)) {
                return true;
            }
            return this.f315u != null && this.f315u.mo572b(menuItem);
        }
    }

    /* renamed from: e */
    public Context mo406e() {
        if (this.f314t == null) {
            return null;
        }
        return this.f314t.mo519g();
    }

    @Deprecated
    /* renamed from: e */
    public LayoutInflater mo407e(Bundle bundle) {
        if (this.f314t == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater b = this.f314t.mo488b();
        mo420j();
        C0238f.m1014a(b, this.f315u.mo617w());
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo408e(boolean z) {
        mo397c(z);
        if (this.f315u != null) {
            this.f315u.mo571b(z);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final Context mo410f() {
        Context e = mo406e();
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: f */
    public void mo411f(Bundle bundle) {
        this.f280H = true;
        mo414g(bundle);
        if (this.f315u != null && !this.f315u.mo559a(1)) {
            this.f315u.mo601m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo412f(boolean z) {
        m353Z().f342s = z;
    }

    /* renamed from: g */
    public final C0113g mo413g() {
        if (this.f314t == null) {
            return null;
        }
        return (C0113g) this.f314t.mo518f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo414g(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.f315u == null) {
                mo344F();
            }
            this.f315u.mo548a(parcelable, this.f316v);
            this.f316v = null;
            this.f315u.mo601m();
        }
    }

    /* renamed from: h */
    public final Resources mo415h() {
        return mo410f().getResources();
    }

    /* renamed from: h */
    public void mo416h(Bundle bundle) {
        this.f280H = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final C0120k mo418i() {
        return this.f313s;
    }

    /* renamed from: i */
    public void mo419i(Bundle bundle) {
        this.f280H = true;
    }

    /* renamed from: j */
    public final C0120k mo420j() {
        if (this.f315u == null) {
            mo344F();
            if (this.f296b >= 4) {
                this.f315u.mo609p();
            } else if (this.f296b >= 3) {
                this.f315u.mo605o();
            } else if (this.f296b >= 2) {
                this.f315u.mo604n();
            } else if (this.f296b >= 1) {
                this.f315u.mo601m();
            }
        }
        return this.f315u;
    }

    /* renamed from: j */
    public void mo421j(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0120k mo422k() {
        return this.f315u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo423k(Bundle bundle) {
        if (this.f315u != null) {
            this.f315u.mo599l();
        }
        this.f296b = 1;
        this.f280H = false;
        mo411f(bundle);
        this.f291S = true;
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onCreate()");
        }
        this.f292T.mo65a(C0021c.C0022a.ON_CREATE);
    }

    /* renamed from: l */
    public View mo424l() {
        return this.f282J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo425l(Bundle bundle) {
        if (this.f315u != null) {
            this.f315u.mo599l();
        }
        this.f296b = 2;
        this.f280H = false;
        mo416h(bundle);
        if (!this.f280H) {
            throw new C0095ac("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.f315u != null) {
            this.f315u.mo604n();
        }
    }

    /* renamed from: m */
    public void mo426m() {
        this.f280H = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo427m(Bundle bundle) {
        Parcelable k;
        mo421j(bundle);
        if (this.f315u != null && (k = this.f315u.mo597k()) != null) {
            bundle.putParcelable("android:support:fragments", k);
        }
    }

    /* renamed from: n */
    public void mo428n() {
        this.f280H = true;
    }

    /* renamed from: o */
    public void mo429o() {
        this.f280H = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f280H = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo413g().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f280H = true;
    }

    /* renamed from: p */
    public void mo433p() {
        this.f280H = true;
    }

    /* renamed from: q */
    public void mo434q() {
        this.f280H = true;
    }

    /* renamed from: r */
    public void mo435r() {
        boolean z = true;
        this.f280H = true;
        C0113g g = mo413g();
        if (g == null || !g.isChangingConfigurations()) {
            z = false;
        }
        if (this.f317w != null && !z) {
            this.f317w.mo85a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo436s() {
        this.f300f = -1;
        this.f301g = null;
        this.f306l = false;
        this.f307m = false;
        this.f308n = false;
        this.f309o = false;
        this.f310p = false;
        this.f312r = 0;
        this.f313s = null;
        this.f315u = null;
        this.f314t = null;
        this.f319y = 0;
        this.f320z = 0;
        this.f273A = null;
        this.f274B = false;
        this.f275C = false;
        this.f277E = false;
    }

    /* renamed from: t */
    public void mo437t() {
        this.f280H = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0204d.m880a(this, sb);
        if (this.f300f >= 0) {
            sb.append(" #");
            sb.append(this.f300f);
        }
        if (this.f319y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f319y));
        }
        if (this.f273A != null) {
            sb.append(" ");
            sb.append(this.f273A);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public void mo439u() {
    }

    /* renamed from: v */
    public Object mo440v() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f330g;
    }

    /* renamed from: w */
    public Object mo441w() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f331h == f272a ? mo440v() : this.f286N.f331h;
    }

    /* renamed from: x */
    public Object mo442x() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f332i;
    }

    /* renamed from: y */
    public Object mo443y() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f333j == f272a ? mo442x() : this.f286N.f333j;
    }

    /* renamed from: z */
    public Object mo444z() {
        if (this.f286N == null) {
            return null;
        }
        return this.f286N.f334k;
    }
}
