package android.support.p018v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p006v4.app.C0162u;
import android.support.p006v4.p015g.C0236e;
import android.support.p006v4.p015g.C0238f;
import android.support.p006v4.p015g.C0247o;
import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.p015g.C0256u;
import android.support.p006v4.p015g.C0260v;
import android.support.p006v4.p015g.C0261w;
import android.support.p006v4.p015g.C0263y;
import android.support.p006v4.widget.C0347j;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.support.p018v7.view.C0437b;
import android.support.p018v7.view.C0440d;
import android.support.p018v7.view.C0441e;
import android.support.p018v7.view.C0442f;
import android.support.p018v7.view.C0444g;
import android.support.p018v7.view.C0449i;
import android.support.p018v7.view.menu.C0462f;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.view.menu.C0483p;
import android.support.p018v7.widget.ActionBarContextView;
import android.support.p018v7.widget.C0537ab;
import android.support.p018v7.widget.C0543af;
import android.support.p018v7.widget.C0575au;
import android.support.p018v7.widget.C0584az;
import android.support.p018v7.widget.C0586ba;
import android.support.p018v7.widget.C0608k;
import android.support.p018v7.widget.ContentFrameLayout;
import android.support.p018v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.app.f */
class C0387f extends C0386e implements C0465h.C0466a, LayoutInflater.Factory2 {

    /* renamed from: u */
    private static final boolean f1123u = (Build.VERSION.SDK_INT < 21);

    /* renamed from: v */
    private static final int[] f1124v = {16842836};

    /* renamed from: w */
    private static boolean f1125w = true;

    /* renamed from: A */
    private C0404g f1126A;

    /* renamed from: B */
    private boolean f1127B = true;

    /* renamed from: C */
    private boolean f1128C;

    /* renamed from: D */
    private ViewGroup f1129D;

    /* renamed from: E */
    private TextView f1130E;

    /* renamed from: F */
    private View f1131F;

    /* renamed from: G */
    private boolean f1132G;

    /* renamed from: H */
    private boolean f1133H;

    /* renamed from: I */
    private boolean f1134I;

    /* renamed from: J */
    private C0403f[] f1135J;

    /* renamed from: K */
    private C0403f f1136K;

    /* renamed from: L */
    private boolean f1137L;

    /* renamed from: M */
    private int f1138M = -100;

    /* renamed from: N */
    private boolean f1139N;

    /* renamed from: O */
    private C0400d f1140O;

    /* renamed from: P */
    private final Runnable f1141P = new Runnable() {
        public void run() {
            if ((C0387f.this.f1165t & 1) != 0) {
                C0387f.this.mo1645g(0);
            }
            if ((C0387f.this.f1165t & 4096) != 0) {
                C0387f.this.mo1645g(108);
            }
            C0387f.this.f1164s = false;
            C0387f.this.f1165t = 0;
        }
    };

    /* renamed from: Q */
    private boolean f1142Q;

    /* renamed from: R */
    private Rect f1143R;

    /* renamed from: S */
    private Rect f1144S;

    /* renamed from: T */
    private AppCompatViewInflater f1145T;

    /* renamed from: a */
    final Context f1146a;

    /* renamed from: b */
    final Window f1147b;

    /* renamed from: c */
    final Window.Callback f1148c;

    /* renamed from: d */
    final Window.Callback f1149d;

    /* renamed from: e */
    final C0385d f1150e;

    /* renamed from: f */
    C0378a f1151f;

    /* renamed from: g */
    MenuInflater f1152g;

    /* renamed from: h */
    C0437b f1153h;

    /* renamed from: i */
    ActionBarContextView f1154i;

    /* renamed from: j */
    PopupWindow f1155j;

    /* renamed from: k */
    Runnable f1156k;

    /* renamed from: l */
    C0256u f1157l = null;

    /* renamed from: m */
    boolean f1158m;

    /* renamed from: n */
    boolean f1159n;

    /* renamed from: o */
    boolean f1160o;

    /* renamed from: p */
    boolean f1161p;

    /* renamed from: q */
    boolean f1162q;

    /* renamed from: r */
    boolean f1163r;

    /* renamed from: s */
    boolean f1164s;

    /* renamed from: t */
    int f1165t;

    /* renamed from: x */
    private CharSequence f1166x;

    /* renamed from: y */
    private C0537ab f1167y;

    /* renamed from: z */
    private C0396a f1168z;

    /* renamed from: android.support.v7.app.f$a */
    private final class C0396a implements C0481o.C0482a {
        C0396a() {
        }

        /* renamed from: a */
        public void mo1665a(C0465h hVar, boolean z) {
            C0387f.this.mo1639b(hVar);
        }

        /* renamed from: a */
        public boolean mo1666a(C0465h hVar) {
            Window.Callback l = C0387f.this.mo1649l();
            if (l == null) {
                return true;
            }
            l.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.f$b */
    class C0397b implements C0437b.C0438a {

        /* renamed from: b */
        private C0437b.C0438a f1179b;

        public C0397b(C0437b.C0438a aVar) {
            this.f1179b = aVar;
        }

        /* renamed from: a */
        public void mo1667a(C0437b bVar) {
            this.f1179b.mo1667a(bVar);
            if (C0387f.this.f1155j != null) {
                C0387f.this.f1147b.getDecorView().removeCallbacks(C0387f.this.f1156k);
            }
            if (C0387f.this.f1154i != null) {
                C0387f.this.mo1656q();
                C0387f.this.f1157l = C0249q.m1062d(C0387f.this.f1154i).mo1077a(0.0f);
                C0387f.this.f1157l.mo1079a((C0260v) new C0261w() {
                    /* renamed from: b */
                    public void mo1091b(View view) {
                        C0387f.this.f1154i.setVisibility(8);
                        if (C0387f.this.f1155j != null) {
                            C0387f.this.f1155j.dismiss();
                        } else if (C0387f.this.f1154i.getParent() instanceof View) {
                            C0249q.m1065g((View) C0387f.this.f1154i.getParent());
                        }
                        C0387f.this.f1154i.removeAllViews();
                        C0387f.this.f1157l.mo1079a((C0260v) null);
                        C0387f.this.f1157l = null;
                    }
                });
            }
            if (C0387f.this.f1150e != null) {
                C0387f.this.f1150e.mo1587b(C0387f.this.f1153h);
            }
            C0387f.this.f1153h = null;
        }

        /* renamed from: a */
        public boolean mo1668a(C0437b bVar, Menu menu) {
            return this.f1179b.mo1668a(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo1669a(C0437b bVar, MenuItem menuItem) {
            return this.f1179b.mo1669a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo1670b(C0437b bVar, Menu menu) {
            return this.f1179b.mo1670b(bVar, menu);
        }
    }

    /* renamed from: android.support.v7.app.f$c */
    class C0399c extends C0449i {
        C0399c(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode mo1671a(ActionMode.Callback callback) {
            C0442f.C0443a aVar = new C0442f.C0443a(C0387f.this.f1146a, callback);
            C0437b a = C0387f.this.mo1629a((C0437b.C0438a) aVar);
            if (a != null) {
                return aVar.mo1902b(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0387f.this.mo1637a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0387f.this.mo1635a(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0465h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0387f.this.mo1643e(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0387f.this.mo1642d(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0465h hVar = menu instanceof C0465h ? (C0465h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.mo2109c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar == null) {
                return onPreparePanel;
            }
            hVar.mo2109c(false);
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0403f a = C0387f.this.mo1627a(0, true);
            if (a == null || a.f1198j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f1198j, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0387f.this.mo1655p() ? mo1671a(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (C0387f.this.mo1655p()) {
                switch (i) {
                    case 0:
                        return mo1671a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    /* renamed from: android.support.v7.app.f$d */
    final class C0400d {

        /* renamed from: b */
        private C0412k f1183b;

        /* renamed from: c */
        private boolean f1184c;

        /* renamed from: d */
        private BroadcastReceiver f1185d;

        /* renamed from: e */
        private IntentFilter f1186e;

        C0400d(C0412k kVar) {
            this.f1183b = kVar;
            this.f1184c = kVar.mo1707a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1682a() {
            this.f1184c = this.f1183b.mo1707a();
            return this.f1184c ? 2 : 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1683b() {
            boolean a = this.f1183b.mo1707a();
            if (a != this.f1184c) {
                this.f1184c = a;
                C0387f.this.mo1626i();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1684c() {
            mo1685d();
            if (this.f1185d == null) {
                this.f1185d = new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        C0400d.this.mo1683b();
                    }
                };
            }
            if (this.f1186e == null) {
                this.f1186e = new IntentFilter();
                this.f1186e.addAction("android.intent.action.TIME_SET");
                this.f1186e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f1186e.addAction("android.intent.action.TIME_TICK");
            }
            C0387f.this.f1146a.registerReceiver(this.f1185d, this.f1186e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1685d() {
            if (this.f1185d != null) {
                C0387f.this.f1146a.unregisterReceiver(this.f1185d);
                this.f1185d = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.f$e */
    private class C0402e extends ContentFrameLayout {
        public C0402e(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m1843a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0387f.this.mo1637a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m1843a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0387f.this.mo1644f(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0419a.m1949b(getContext(), i));
        }
    }

    /* renamed from: android.support.v7.app.f$f */
    protected static final class C0403f {

        /* renamed from: a */
        int f1189a;

        /* renamed from: b */
        int f1190b;

        /* renamed from: c */
        int f1191c;

        /* renamed from: d */
        int f1192d;

        /* renamed from: e */
        int f1193e;

        /* renamed from: f */
        int f1194f;

        /* renamed from: g */
        ViewGroup f1195g;

        /* renamed from: h */
        View f1196h;

        /* renamed from: i */
        View f1197i;

        /* renamed from: j */
        C0465h f1198j;

        /* renamed from: k */
        C0462f f1199k;

        /* renamed from: l */
        Context f1200l;

        /* renamed from: m */
        boolean f1201m;

        /* renamed from: n */
        boolean f1202n;

        /* renamed from: o */
        boolean f1203o;

        /* renamed from: p */
        public boolean f1204p;

        /* renamed from: q */
        boolean f1205q = false;

        /* renamed from: r */
        boolean f1206r;

        /* renamed from: s */
        Bundle f1207s;

        C0403f(int i) {
            this.f1189a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0483p mo1690a(C0481o.C0482a aVar) {
            if (this.f1198j == null) {
                return null;
            }
            if (this.f1199k == null) {
                this.f1199k = new C0462f(this.f1200l, C0353a.C0360g.abc_list_menu_item_layout);
                this.f1199k.mo2018a(aVar);
                this.f1198j.mo2085a((C0481o) this.f1199k);
            }
            return this.f1199k.mo2055a(this.f1195g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1691a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0353a.C0354a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0353a.C0354a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C0353a.C0362i.Theme_AppCompat_CompactMenu, true);
            }
            C0440d dVar = new C0440d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1200l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0353a.C0363j.AppCompatTheme);
            this.f1190b = obtainStyledAttributes.getResourceId(C0353a.C0363j.AppCompatTheme_panelBackground, 0);
            this.f1194f = obtainStyledAttributes.getResourceId(C0353a.C0363j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1692a(C0465h hVar) {
            if (hVar != this.f1198j) {
                if (this.f1198j != null) {
                    this.f1198j.mo2105b((C0481o) this.f1199k);
                }
                this.f1198j = hVar;
                if (hVar != null && this.f1199k != null) {
                    hVar.mo2085a((C0481o) this.f1199k);
                }
            }
        }

        /* renamed from: a */
        public boolean mo1693a() {
            if (this.f1196h == null) {
                return false;
            }
            return this.f1197i != null || this.f1199k.mo2056a().getCount() > 0;
        }
    }

    /* renamed from: android.support.v7.app.f$g */
    private final class C0404g implements C0481o.C0482a {
        C0404g() {
        }

        /* renamed from: a */
        public void mo1665a(C0465h hVar, boolean z) {
            C0465h q = hVar.mo2137q();
            boolean z2 = q != hVar;
            C0387f fVar = C0387f.this;
            if (z2) {
                hVar = q;
            }
            C0403f a = fVar.mo1628a((Menu) hVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0387f.this.mo1631a(a.f1189a, a, q);
                C0387f.this.mo1632a(a, true);
                return;
            }
            C0387f.this.mo1632a(a, z);
        }

        /* renamed from: a */
        public boolean mo1666a(C0465h hVar) {
            Window.Callback l;
            if (hVar != null || !C0387f.this.f1158m || (l = C0387f.this.mo1649l()) == null || C0387f.this.f1163r) {
                return true;
            }
            l.onMenuOpened(108, hVar);
            return true;
        }
    }

    static {
        if (f1123u && !f1125w) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                /* renamed from: a */
                private boolean m1822a(Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                        return false;
                    }
                    return message.contains("drawable") || message.contains("Drawable");
                }

                public void uncaughtException(Thread thread, Throwable th) {
                    if (m1822a(th)) {
                        Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    C0387f(Context context, Window window, C0385d dVar) {
        this.f1146a = context;
        this.f1147b = window;
        this.f1150e = dVar;
        this.f1148c = this.f1147b.getCallback();
        if (this.f1148c instanceof C0399c) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f1149d = new C0399c(this.f1148c);
        this.f1147b.setCallback(this.f1149d);
        C0575au a = C0575au.m2818a(context, (AttributeSet) null, f1124v);
        Drawable b = a.mo2962b(0);
        if (b != null) {
            this.f1147b.setBackgroundDrawable(b);
        }
        a.mo2959a();
    }

    /* renamed from: A */
    private boolean m1751A() {
        if (!this.f1139N || !(this.f1146a instanceof Activity)) {
            return false;
        }
        try {
            return (this.f1146a.getPackageManager().getActivityInfo(new ComponentName(this.f1146a, this.f1146a.getClass()), 0).configChanges & 512) == 0;
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    /* renamed from: a */
    private void m1752a(C0403f fVar, KeyEvent keyEvent) {
        ViewGroup.LayoutParams layoutParams;
        int i = -1;
        if (!fVar.f1203o && !this.f1163r) {
            if (fVar.f1189a == 0) {
                if ((this.f1146a.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback l = mo1649l();
            if (l == null || l.onMenuOpened(fVar.f1189a, fVar.f1198j)) {
                WindowManager windowManager = (WindowManager) this.f1146a.getSystemService("window");
                if (windowManager != null && m1758b(fVar, keyEvent)) {
                    if (fVar.f1195g == null || fVar.f1205q) {
                        if (fVar.f1195g == null) {
                            if (!m1754a(fVar) || fVar.f1195g == null) {
                                return;
                            }
                        } else if (fVar.f1205q && fVar.f1195g.getChildCount() > 0) {
                            fVar.f1195g.removeAllViews();
                        }
                        if (m1759c(fVar) && fVar.mo1693a()) {
                            ViewGroup.LayoutParams layoutParams2 = fVar.f1196h.getLayoutParams();
                            ViewGroup.LayoutParams layoutParams3 = layoutParams2 == null ? new ViewGroup.LayoutParams(-2, -2) : layoutParams2;
                            fVar.f1195g.setBackgroundResource(fVar.f1190b);
                            ViewParent parent = fVar.f1196h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(fVar.f1196h);
                            }
                            fVar.f1195g.addView(fVar.f1196h, layoutParams3);
                            if (!fVar.f1196h.hasFocus()) {
                                fVar.f1196h.requestFocus();
                            }
                            i = -2;
                        } else {
                            return;
                        }
                    } else if (fVar.f1197i == null || (layoutParams = fVar.f1197i.getLayoutParams()) == null || layoutParams.width != -1) {
                        i = -2;
                    }
                    fVar.f1202n = false;
                    WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, fVar.f1192d, fVar.f1193e, 1002, 8519680, -3);
                    layoutParams4.gravity = fVar.f1191c;
                    layoutParams4.windowAnimations = fVar.f1194f;
                    windowManager.addView(fVar.f1195g, layoutParams4);
                    fVar.f1203o = true;
                    return;
                }
                return;
            }
            mo1632a(fVar, true);
        }
    }

    /* renamed from: a */
    private void m1753a(C0465h hVar, boolean z) {
        if (this.f1167y == null || !this.f1167y.mo2391e() || (ViewConfiguration.get(this.f1146a).hasPermanentMenuKey() && !this.f1167y.mo2394g())) {
            C0403f a = mo1627a(0, true);
            a.f1205q = true;
            mo1632a(a, false);
            m1752a(a, (KeyEvent) null);
            return;
        }
        Window.Callback l = mo1649l();
        if (this.f1167y.mo2392f() && z) {
            this.f1167y.mo2402i();
            if (!this.f1163r) {
                l.onPanelClosed(108, mo1627a(0, true).f1198j);
            }
        } else if (l != null && !this.f1163r) {
            if (this.f1164s && (this.f1165t & 1) != 0) {
                this.f1147b.getDecorView().removeCallbacks(this.f1141P);
                this.f1141P.run();
            }
            C0403f a2 = mo1627a(0, true);
            if (a2.f1198j != null && !a2.f1206r && l.onPreparePanel(0, a2.f1197i, a2.f1198j)) {
                l.onMenuOpened(108, a2.f1198j);
                this.f1167y.mo2401h();
            }
        }
    }

    /* renamed from: a */
    private boolean m1754a(C0403f fVar) {
        fVar.mo1691a(mo1650m());
        fVar.f1195g = new C0402e(fVar.f1200l);
        fVar.f1191c = 81;
        return true;
    }

    /* renamed from: a */
    private boolean m1755a(C0403f fVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (!keyEvent.isSystem()) {
            if ((fVar.f1201m || m1758b(fVar, keyEvent)) && fVar.f1198j != null) {
                z = fVar.f1198j.performShortcut(i, keyEvent, i2);
            }
            if (z && (i2 & 1) == 0 && this.f1167y == null) {
                mo1632a(fVar, true);
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m1756a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1147b.getDecorView();
        for (ViewParent viewParent2 = viewParent; viewParent2 != null; viewParent2 = viewParent2.getParent()) {
            if (viewParent2 == decorView || !(viewParent2 instanceof View) || C0249q.m1071m((View) viewParent2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private boolean m1757b(C0403f fVar) {
        Context context;
        Context context2 = this.f1146a;
        if ((fVar.f1189a == 0 || fVar.f1189a == 108) && this.f1167y != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context2.getTheme();
            theme.resolveAttribute(C0353a.C0354a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context2.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0353a.C0354a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0353a.C0354a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context2.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            Resources.Theme theme3 = theme2;
            if (theme3 != null) {
                context = new C0440d(context2, 0);
                context.getTheme().setTo(theme3);
                C0465h hVar = new C0465h(context);
                hVar.mo2083a((C0465h.C0466a) this);
                fVar.mo1692a(hVar);
                return true;
            }
        }
        context = context2;
        C0465h hVar2 = new C0465h(context);
        hVar2.mo2083a((C0465h.C0466a) this);
        fVar.mo1692a(hVar2);
        return true;
    }

    /* renamed from: b */
    private boolean m1758b(C0403f fVar, KeyEvent keyEvent) {
        if (this.f1163r) {
            return false;
        }
        if (fVar.f1201m) {
            return true;
        }
        if (!(this.f1136K == null || this.f1136K == fVar)) {
            mo1632a(this.f1136K, false);
        }
        Window.Callback l = mo1649l();
        if (l != null) {
            fVar.f1197i = l.onCreatePanelView(fVar.f1189a);
        }
        boolean z = fVar.f1189a == 0 || fVar.f1189a == 108;
        if (z && this.f1167y != null) {
            this.f1167y.mo2403j();
        }
        if (fVar.f1197i == null && (!z || !(mo1648k() instanceof C0408i))) {
            if (fVar.f1198j == null || fVar.f1206r) {
                if (fVar.f1198j == null && (!m1757b(fVar) || fVar.f1198j == null)) {
                    return false;
                }
                if (z && this.f1167y != null) {
                    if (this.f1168z == null) {
                        this.f1168z = new C0396a();
                    }
                    this.f1167y.mo2384a(fVar.f1198j, this.f1168z);
                }
                fVar.f1198j.mo2124h();
                if (!l.onCreatePanelMenu(fVar.f1189a, fVar.f1198j)) {
                    fVar.mo1692a((C0465h) null);
                    if (!z || this.f1167y == null) {
                        return false;
                    }
                    this.f1167y.mo2384a((Menu) null, this.f1168z);
                    return false;
                }
                fVar.f1206r = false;
            }
            fVar.f1198j.mo2124h();
            if (fVar.f1207s != null) {
                fVar.f1198j.mo2103b(fVar.f1207s);
                fVar.f1207s = null;
            }
            if (!l.onPreparePanel(0, fVar.f1197i, fVar.f1198j)) {
                if (z && this.f1167y != null) {
                    this.f1167y.mo2384a((Menu) null, this.f1168z);
                }
                fVar.f1198j.mo2126i();
                return false;
            }
            fVar.f1204p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            fVar.f1198j.setQwertyMode(fVar.f1204p);
            fVar.f1198j.mo2126i();
        }
        fVar.f1201m = true;
        fVar.f1202n = false;
        this.f1136K = fVar;
        return true;
    }

    /* renamed from: c */
    private boolean m1759c(C0403f fVar) {
        if (fVar.f1197i != null) {
            fVar.f1196h = fVar.f1197i;
            return true;
        } else if (fVar.f1198j == null) {
            return false;
        } else {
            if (this.f1126A == null) {
                this.f1126A = new C0404g();
            }
            fVar.f1196h = (View) fVar.mo1690a((C0481o.C0482a) this.f1126A);
            return fVar.f1196h != null;
        }
    }

    /* renamed from: d */
    private boolean m1760d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0403f a = mo1627a(i, true);
            if (!a.f1203o) {
                return m1758b(a, keyEvent);
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m1761e(int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2 = true;
        if (this.f1153h != null) {
            return false;
        }
        C0403f a = mo1627a(i, true);
        if (i != 0 || this.f1167y == null || !this.f1167y.mo2391e() || ViewConfiguration.get(this.f1146a).hasPermanentMenuKey()) {
            if (a.f1203o || a.f1202n) {
                boolean z3 = a.f1203o;
                mo1632a(a, true);
                z2 = z3;
            } else {
                if (a.f1201m) {
                    if (a.f1206r) {
                        a.f1201m = false;
                        z = m1758b(a, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m1752a(a, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (!this.f1167y.mo2392f()) {
            if (!this.f1163r && m1758b(a, keyEvent)) {
                z2 = this.f1167y.mo2401h();
            }
            z2 = false;
        } else {
            z2 = this.f1167y.mo2402i();
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f1146a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* renamed from: j */
    private void m1762j(int i) {
        this.f1165t |= 1 << i;
        if (!this.f1164s) {
            C0249q.m1055a(this.f1147b.getDecorView(), this.f1141P);
            this.f1164s = true;
        }
    }

    /* renamed from: k */
    private int m1763k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: l */
    private boolean m1764l(int i) {
        Resources resources = this.f1146a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m1751A()) {
            ((Activity) this.f1146a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (Build.VERSION.SDK_INT < 26) {
                C0407h.m1858a(resources);
            }
        }
        return true;
    }

    /* renamed from: t */
    private void m1765t() {
        m1766u();
        if (this.f1158m && this.f1151f == null) {
            if (this.f1148c instanceof Activity) {
                this.f1151f = new C0414l((Activity) this.f1148c, this.f1159n);
            } else if (this.f1148c instanceof Dialog) {
                this.f1151f = new C0414l((Dialog) this.f1148c);
            }
            if (this.f1151f != null) {
                this.f1151f.mo1555c(this.f1142Q);
            }
        }
    }

    /* renamed from: u */
    private void m1766u() {
        if (!this.f1128C) {
            this.f1129D = m1767v();
            CharSequence n = mo1651n();
            if (!TextUtils.isEmpty(n)) {
                if (this.f1167y != null) {
                    this.f1167y.setWindowTitle(n);
                } else if (mo1648k() != null) {
                    mo1648k().mo1549a(n);
                } else if (this.f1130E != null) {
                    this.f1130E.setText(n);
                }
            }
            m1768w();
            mo1634a(this.f1129D);
            this.f1128C = true;
            C0403f a = mo1627a(0, false);
            if (this.f1163r) {
                return;
            }
            if (a == null || a.f1198j == null) {
                m1762j(108);
            }
        }
    }

    /* renamed from: v */
    private ViewGroup m1767v() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f1146a.obtainStyledAttributes(C0353a.C0363j.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C0353a.C0363j.AppCompatTheme_windowNoTitle, false)) {
            mo1620c(1);
        } else if (obtainStyledAttributes.getBoolean(C0353a.C0363j.AppCompatTheme_windowActionBar, false)) {
            mo1620c(108);
        }
        if (obtainStyledAttributes.getBoolean(C0353a.C0363j.AppCompatTheme_windowActionBarOverlay, false)) {
            mo1620c(109);
        }
        if (obtainStyledAttributes.getBoolean(C0353a.C0363j.AppCompatTheme_windowActionModeOverlay, false)) {
            mo1620c(10);
        }
        this.f1161p = obtainStyledAttributes.getBoolean(C0353a.C0363j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.f1147b.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1146a);
        if (this.f1162q) {
            ViewGroup viewGroup2 = this.f1160o ? (ViewGroup) from.inflate(C0353a.C0360g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C0353a.C0360g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                C0249q.m1054a((View) viewGroup2, (C0247o) new C0247o() {
                    /* renamed from: a */
                    public C0263y mo1067a(View view, C0263y yVar) {
                        int b = yVar.mo1096b();
                        int h = C0387f.this.mo1646h(b);
                        if (b != h) {
                            yVar = yVar.mo1095a(yVar.mo1094a(), h, yVar.mo1097c(), yVar.mo1098d());
                        }
                        return C0249q.m1046a(view, yVar);
                    }
                });
                viewGroup = viewGroup2;
            } else {
                ((C0543af) viewGroup2).setOnFitSystemWindowsListener(new C0543af.C0544a() {
                    /* renamed from: a */
                    public void mo1661a(Rect rect) {
                        rect.top = C0387f.this.mo1646h(rect.top);
                    }
                });
                viewGroup = viewGroup2;
            }
        } else if (this.f1161p) {
            this.f1159n = false;
            this.f1158m = false;
            viewGroup = (ViewGroup) from.inflate(C0353a.C0360g.abc_dialog_title_material, (ViewGroup) null);
        } else if (this.f1158m) {
            TypedValue typedValue = new TypedValue();
            this.f1146a.getTheme().resolveAttribute(C0353a.C0354a.actionBarTheme, typedValue, true);
            ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0440d(this.f1146a, typedValue.resourceId) : this.f1146a).inflate(C0353a.C0360g.abc_screen_toolbar, (ViewGroup) null);
            this.f1167y = (C0537ab) viewGroup3.findViewById(C0353a.C0359f.decor_content_parent);
            this.f1167y.setWindowCallback(mo1649l());
            if (this.f1159n) {
                this.f1167y.mo2383a(109);
            }
            if (this.f1132G) {
                this.f1167y.mo2383a(2);
            }
            if (this.f1133H) {
                this.f1167y.mo2383a(5);
            }
            viewGroup = viewGroup3;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1158m + ", windowActionBarOverlay: " + this.f1159n + ", android:windowIsFloating: " + this.f1161p + ", windowActionModeOverlay: " + this.f1160o + ", windowNoTitle: " + this.f1162q + " }");
        }
        if (this.f1167y == null) {
            this.f1130E = (TextView) viewGroup.findViewById(C0353a.C0359f.title);
        }
        C0586ba.m2903b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0353a.C0359f.action_bar_activity_content);
        ViewGroup viewGroup4 = (ViewGroup) this.f1147b.findViewById(16908290);
        if (viewGroup4 != null) {
            while (viewGroup4.getChildCount() > 0) {
                View childAt = viewGroup4.getChildAt(0);
                viewGroup4.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup4.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup4 instanceof FrameLayout) {
                ((FrameLayout) viewGroup4).setForeground((Drawable) null);
            }
        }
        this.f1147b.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.C0506a() {
            /* renamed from: a */
            public void mo1662a() {
            }

            /* renamed from: b */
            public void mo1663b() {
                C0387f.this.mo1658s();
            }
        });
        return viewGroup;
    }

    /* renamed from: w */
    private void m1768w() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1129D.findViewById(16908290);
        View decorView = this.f1147b.getDecorView();
        contentFrameLayout.mo2503a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1146a.obtainStyledAttributes(C0353a.C0363j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0353a.C0363j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0353a.C0363j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0353a.C0363j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0353a.C0363j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0353a.C0363j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0353a.C0363j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: x */
    private void m1769x() {
        if (this.f1128C) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: y */
    private int m1770y() {
        return this.f1138M != -100 ? this.f1138M : m1730j();
    }

    /* renamed from: z */
    private void m1771z() {
        if (this.f1140O == null) {
            this.f1140O = new C0400d(C0412k.m1887a(this.f1146a));
        }
    }

    /* renamed from: a */
    public C0378a mo1607a() {
        m1765t();
        return this.f1151f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0403f mo1627a(int i, boolean z) {
        C0403f[] fVarArr = this.f1135J;
        if (fVarArr == null || fVarArr.length <= i) {
            C0403f[] fVarArr2 = new C0403f[(i + 1)];
            if (fVarArr != null) {
                System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            }
            this.f1135J = fVarArr2;
            fVarArr = fVarArr2;
        }
        C0403f fVar = fVarArr[i];
        if (fVar != null) {
            return fVar;
        }
        C0403f fVar2 = new C0403f(i);
        fVarArr[i] = fVar2;
        return fVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0403f mo1628a(Menu menu) {
        C0403f[] fVarArr = this.f1135J;
        int length = fVarArr != null ? fVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0403f fVar = fVarArr[i];
            if (fVar != null && fVar.f1198j == menu) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0437b mo1629a(C0437b.C0438a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.f1153h != null) {
            this.f1153h.mo1729c();
        }
        C0397b bVar = new C0397b(aVar);
        C0378a a = mo1607a();
        if (a != null) {
            this.f1153h = a.mo1546a((C0437b.C0438a) bVar);
            if (!(this.f1153h == null || this.f1150e == null)) {
                this.f1150e.mo1582a(this.f1153h);
            }
        }
        if (this.f1153h == null) {
            this.f1153h = mo1638b((C0437b.C0438a) bVar);
        }
        return this.f1153h;
    }

    /* renamed from: a */
    public <T extends View> T mo1608a(int i) {
        m1766u();
        return this.f1147b.findViewById(i);
    }

    /* renamed from: a */
    public View mo1630a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.f1145T == null) {
            String string = this.f1146a.obtainStyledAttributes(C0353a.C0363j.AppCompatTheme).getString(C0353a.C0363j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f1145T = new AppCompatViewInflater();
            } else {
                try {
                    this.f1145T = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f1145T = new AppCompatViewInflater();
                }
            }
        }
        if (f1123u) {
            z = attributeSet instanceof XmlPullParser ? ((XmlPullParser) attributeSet).getDepth() > 1 : m1756a((ViewParent) view);
        } else {
            z = false;
        }
        return this.f1145T.mo1531a(view, str, context, attributeSet, z, f1123u, true, C0584az.m2898a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1631a(int i, C0403f fVar, Menu menu) {
        if (menu == null) {
            if (fVar == null && i >= 0 && i < this.f1135J.length) {
                fVar = this.f1135J[i];
            }
            if (fVar != null) {
                menu = fVar.f1198j;
            }
        }
        if ((fVar == null || fVar.f1203o) && !this.f1163r) {
            this.f1148c.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public void mo1609a(Configuration configuration) {
        C0378a a;
        if (this.f1158m && this.f1128C && (a = mo1607a()) != null) {
            a.mo1548a(configuration);
        }
        C0608k.m2988a().mo3089a(this.f1146a);
        mo1626i();
    }

    /* renamed from: a */
    public void mo1610a(Bundle bundle) {
        String str;
        if (this.f1148c instanceof Activity) {
            try {
                str = C0162u.m748b((Activity) this.f1148c);
            } catch (IllegalArgumentException e) {
                str = null;
            }
            if (str != null) {
                C0378a k = mo1648k();
                if (k == null) {
                    this.f1142Q = true;
                } else {
                    k.mo1555c(true);
                }
            }
        }
        if (bundle != null && this.f1138M == -100) {
            this.f1138M = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1632a(C0403f fVar, boolean z) {
        if (!z || fVar.f1189a != 0 || this.f1167y == null || !this.f1167y.mo2392f()) {
            WindowManager windowManager = (WindowManager) this.f1146a.getSystemService("window");
            if (!(windowManager == null || !fVar.f1203o || fVar.f1195g == null)) {
                windowManager.removeView(fVar.f1195g);
                if (z) {
                    mo1631a(fVar.f1189a, fVar, (Menu) null);
                }
            }
            fVar.f1201m = false;
            fVar.f1202n = false;
            fVar.f1203o = false;
            fVar.f1196h = null;
            fVar.f1205q = true;
            if (this.f1136K == fVar) {
                this.f1136K = null;
                return;
            }
            return;
        }
        mo1639b(fVar.f1198j);
    }

    /* renamed from: a */
    public void mo1633a(C0465h hVar) {
        m1753a(hVar, true);
    }

    /* renamed from: a */
    public void mo1611a(View view) {
        m1766u();
        ViewGroup viewGroup = (ViewGroup) this.f1129D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1148c.onContentChanged();
    }

    /* renamed from: a */
    public void mo1612a(View view, ViewGroup.LayoutParams layoutParams) {
        m1766u();
        ViewGroup viewGroup = (ViewGroup) this.f1129D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1148c.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1634a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public final void mo1613a(CharSequence charSequence) {
        this.f1166x = charSequence;
        if (this.f1167y != null) {
            this.f1167y.setWindowTitle(charSequence);
        } else if (mo1648k() != null) {
            mo1648k().mo1549a(charSequence);
        } else if (this.f1130E != null) {
            this.f1130E.setText(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1635a(int i, KeyEvent keyEvent) {
        C0378a a = mo1607a();
        if (a != null && a.mo1551a(i, keyEvent)) {
            return true;
        }
        if (this.f1136K == null || !m1755a(this.f1136K, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f1136K == null) {
                C0403f a2 = mo1627a(0, true);
                m1758b(a2, keyEvent);
                boolean a3 = m1755a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f1201m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        } else if (this.f1136K == null) {
            return true;
        } else {
            this.f1136K.f1202n = true;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo1636a(C0465h hVar, MenuItem menuItem) {
        C0403f a;
        Window.Callback l = mo1649l();
        if (l == null || this.f1163r || (a = mo1628a((Menu) hVar.mo2137q())) == null) {
            return false;
        }
        return l.onMenuItemSelected(a.f1189a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1637a(KeyEvent keyEvent) {
        View decorView;
        boolean z = true;
        if (((this.f1148c instanceof C0236e.C0237a) || (this.f1148c instanceof C0405g)) && (decorView = this.f1147b.getDecorView()) != null && C0236e.m1012a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1148c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo1641c(keyCode, keyEvent) : mo1640b(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0437b mo1638b(C0437b.C0438a aVar) {
        C0437b bVar;
        Context context;
        mo1656q();
        if (this.f1153h != null) {
            this.f1153h.mo1729c();
        }
        if (!(aVar instanceof C0397b)) {
            aVar = new C0397b(aVar);
        }
        if (this.f1150e == null || this.f1163r) {
            bVar = null;
        } else {
            try {
                bVar = this.f1150e.mo1580a(aVar);
            } catch (AbstractMethodError e) {
                bVar = null;
            }
        }
        if (bVar != null) {
            this.f1153h = bVar;
        } else {
            if (this.f1154i == null) {
                if (this.f1161p) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f1146a.getTheme();
                    theme.resolveAttribute(C0353a.C0354a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = this.f1146a.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new C0440d(this.f1146a, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.f1146a;
                    }
                    this.f1154i = new ActionBarContextView(context);
                    this.f1155j = new PopupWindow(context, (AttributeSet) null, C0353a.C0354a.actionModePopupWindowStyle);
                    C0347j.m1606a(this.f1155j, 2);
                    this.f1155j.setContentView(this.f1154i);
                    this.f1155j.setWidth(-1);
                    context.getTheme().resolveAttribute(C0353a.C0354a.actionBarSize, typedValue, true);
                    this.f1154i.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.f1155j.setHeight(-2);
                    this.f1156k = new Runnable() {
                        public void run() {
                            C0387f.this.f1155j.showAtLocation(C0387f.this.f1154i, 55, 0, 0);
                            C0387f.this.mo1656q();
                            if (C0387f.this.mo1652o()) {
                                C0387f.this.f1154i.setAlpha(0.0f);
                                C0387f.this.f1157l = C0249q.m1062d(C0387f.this.f1154i).mo1077a(1.0f);
                                C0387f.this.f1157l.mo1079a((C0260v) new C0261w() {
                                    /* renamed from: a */
                                    public void mo1090a(View view) {
                                        C0387f.this.f1154i.setVisibility(0);
                                    }

                                    /* renamed from: b */
                                    public void mo1091b(View view) {
                                        C0387f.this.f1154i.setAlpha(1.0f);
                                        C0387f.this.f1157l.mo1079a((C0260v) null);
                                        C0387f.this.f1157l = null;
                                    }
                                });
                                return;
                            }
                            C0387f.this.f1154i.setAlpha(1.0f);
                            C0387f.this.f1154i.setVisibility(0);
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f1129D.findViewById(C0353a.C0359f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(mo1650m()));
                        this.f1154i = (ActionBarContextView) viewStubCompat.mo2702a();
                    }
                }
            }
            if (this.f1154i != null) {
                mo1656q();
                this.f1154i.mo2360c();
                C0441e eVar = new C0441e(this.f1154i.getContext(), this.f1154i, aVar, this.f1155j == null);
                if (aVar.mo1668a((C0437b) eVar, eVar.mo1726b())) {
                    eVar.mo1730d();
                    this.f1154i.mo2357a(eVar);
                    this.f1153h = eVar;
                    if (mo1652o()) {
                        this.f1154i.setAlpha(0.0f);
                        this.f1157l = C0249q.m1062d(this.f1154i).mo1077a(1.0f);
                        this.f1157l.mo1079a((C0260v) new C0261w() {
                            /* renamed from: a */
                            public void mo1090a(View view) {
                                C0387f.this.f1154i.setVisibility(0);
                                C0387f.this.f1154i.sendAccessibilityEvent(32);
                                if (C0387f.this.f1154i.getParent() instanceof View) {
                                    C0249q.m1065g((View) C0387f.this.f1154i.getParent());
                                }
                            }

                            /* renamed from: b */
                            public void mo1091b(View view) {
                                C0387f.this.f1154i.setAlpha(1.0f);
                                C0387f.this.f1157l.mo1079a((C0260v) null);
                                C0387f.this.f1157l = null;
                            }
                        });
                    } else {
                        this.f1154i.setAlpha(1.0f);
                        this.f1154i.setVisibility(0);
                        this.f1154i.sendAccessibilityEvent(32);
                        if (this.f1154i.getParent() instanceof View) {
                            C0249q.m1065g((View) this.f1154i.getParent());
                        }
                    }
                    if (this.f1155j != null) {
                        this.f1147b.getDecorView().post(this.f1156k);
                    }
                } else {
                    this.f1153h = null;
                }
            }
        }
        if (!(this.f1153h == null || this.f1150e == null)) {
            this.f1150e.mo1582a(this.f1153h);
        }
        return this.f1153h;
    }

    /* renamed from: b */
    public MenuInflater mo1614b() {
        if (this.f1152g == null) {
            m1765t();
            this.f1152g = new C0444g(this.f1151f != null ? this.f1151f.mo1553b() : this.f1146a);
        }
        return this.f1152g;
    }

    /* renamed from: b */
    public void mo1615b(int i) {
        m1766u();
        ViewGroup viewGroup = (ViewGroup) this.f1129D.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1146a).inflate(i, viewGroup);
        this.f1148c.onContentChanged();
    }

    /* renamed from: b */
    public void mo1616b(Bundle bundle) {
        m1766u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1639b(C0465h hVar) {
        if (!this.f1134I) {
            this.f1134I = true;
            this.f1167y.mo2404k();
            Window.Callback l = mo1649l();
            if (l != null && !this.f1163r) {
                l.onPanelClosed(108, hVar);
            }
            this.f1134I = false;
        }
    }

    /* renamed from: b */
    public void mo1617b(View view, ViewGroup.LayoutParams layoutParams) {
        m1766u();
        ((ViewGroup) this.f1129D.findViewById(16908290)).addView(view, layoutParams);
        this.f1148c.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1640b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                boolean z = this.f1137L;
                this.f1137L = false;
                C0403f a = mo1627a(0, false);
                if (a == null || !a.f1203o) {
                    if (mo1657r()) {
                        return true;
                    }
                } else if (z) {
                    return true;
                } else {
                    mo1632a(a, true);
                    return true;
                }
                break;
            case 82:
                m1761e(0, keyEvent);
                return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo1618c() {
        mo1626i();
    }

    /* renamed from: c */
    public void mo1619c(Bundle bundle) {
        if (this.f1138M != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f1138M);
        }
    }

    /* renamed from: c */
    public boolean mo1620c(int i) {
        int k = m1763k(i);
        if (this.f1162q && k == 108) {
            return false;
        }
        if (this.f1158m && k == 1) {
            this.f1158m = false;
        }
        switch (k) {
            case 1:
                m1769x();
                this.f1162q = true;
                return true;
            case 2:
                m1769x();
                this.f1132G = true;
                return true;
            case 5:
                m1769x();
                this.f1133H = true;
                return true;
            case 10:
                m1769x();
                this.f1160o = true;
                return true;
            case 108:
                m1769x();
                this.f1158m = true;
                return true;
            case 109:
                m1769x();
                this.f1159n = true;
                return true;
            default:
                return this.f1147b.requestFeature(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1641c(int i, KeyEvent keyEvent) {
        boolean z = true;
        switch (i) {
            case 4:
                if ((keyEvent.getFlags() & 128) == 0) {
                    z = false;
                }
                this.f1137L = z;
                break;
            case 82:
                m1760d(0, keyEvent);
                return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo1621d() {
        C0378a a = mo1607a();
        if (a != null) {
            a.mo1557d(false);
        }
        if (this.f1140O != null) {
            this.f1140O.mo1685d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1642d(int i) {
        if (i == 108) {
            C0378a a = mo1607a();
            if (a != null) {
                a.mo1559e(false);
            }
        } else if (i == 0) {
            C0403f a2 = mo1627a(i, true);
            if (a2.f1203o) {
                mo1632a(a2, false);
            }
        }
    }

    /* renamed from: e */
    public void mo1622e() {
        C0378a a = mo1607a();
        if (a != null) {
            a.mo1557d(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1643e(int i) {
        C0378a a;
        if (i == 108 && (a = mo1607a()) != null) {
            a.mo1559e(true);
        }
    }

    /* renamed from: f */
    public void mo1623f() {
        C0378a a = mo1607a();
        if (a == null || !a.mo1560e()) {
            m1762j(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1644f(int i) {
        mo1632a(mo1627a(i, true), true);
    }

    /* renamed from: g */
    public void mo1624g() {
        if (this.f1164s) {
            this.f1147b.getDecorView().removeCallbacks(this.f1141P);
        }
        this.f1163r = true;
        if (this.f1151f != null) {
            this.f1151f.mo1562g();
        }
        if (this.f1140O != null) {
            this.f1140O.mo1685d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1645g(int i) {
        C0403f a;
        C0403f a2 = mo1627a(i, true);
        if (a2.f1198j != null) {
            Bundle bundle = new Bundle();
            a2.f1198j.mo2082a(bundle);
            if (bundle.size() > 0) {
                a2.f1207s = bundle;
            }
            a2.f1198j.mo2124h();
            a2.f1198j.clear();
        }
        a2.f1206r = true;
        a2.f1205q = true;
        if ((i == 108 || i == 0) && this.f1167y != null && (a = mo1627a(0, false)) != null) {
            a.f1201m = false;
            m1758b(a, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo1646h(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        int i2 = 0;
        if (this.f1154i == null || !(this.f1154i.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1154i.getLayoutParams();
            if (this.f1154i.isShown()) {
                if (this.f1143R == null) {
                    this.f1143R = new Rect();
                    this.f1144S = new Rect();
                }
                Rect rect = this.f1143R;
                Rect rect2 = this.f1144S;
                rect.set(0, i, 0, 0);
                C0586ba.m2901a(this.f1129D, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f1131F == null) {
                        this.f1131F = new View(this.f1146a);
                        this.f1131F.setBackgroundColor(this.f1146a.getResources().getColor(C0353a.C0356c.abc_input_method_navigation_guard));
                        this.f1129D.addView(this.f1131F, -1, new ViewGroup.LayoutParams(-1, i));
                        z2 = true;
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.f1131F.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1131F.setLayoutParams(layoutParams);
                        }
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                if (this.f1131F == null) {
                    z4 = false;
                }
                if (!this.f1160o && z4) {
                    i = 0;
                }
                z3 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (z2) {
                this.f1154i.setLayoutParams(marginLayoutParams);
            }
            z = z3;
        }
        if (this.f1131F != null) {
            View view = this.f1131F;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: h */
    public void mo1625h() {
        LayoutInflater from = LayoutInflater.from(this.f1146a);
        if (from.getFactory() == null) {
            C0238f.m1014a(from, this);
        } else if (!(from.getFactory2() instanceof C0387f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo1647i(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f1146a.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                m1771z();
                return this.f1140O.mo1682a();
            default:
                return i;
        }
    }

    /* renamed from: i */
    public boolean mo1626i() {
        boolean z = false;
        int y = m1770y();
        int i = mo1647i(y);
        if (i != -1) {
            z = m1764l(i);
        }
        if (y == 0) {
            m1771z();
            this.f1140O.mo1684c();
        }
        this.f1139N = true;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C0378a mo1648k() {
        return this.f1151f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Window.Callback mo1649l() {
        return this.f1147b.getCallback();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Context mo1650m() {
        Context context = null;
        C0378a a = mo1607a();
        if (a != null) {
            context = a.mo1553b();
        }
        return context == null ? this.f1146a : context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final CharSequence mo1651n() {
        return this.f1148c instanceof Activity ? ((Activity) this.f1148c).getTitle() : this.f1166x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo1652o() {
        return this.f1128C && this.f1129D != null && C0249q.m1070l(this.f1129D);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo1630a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public boolean mo1655p() {
        return this.f1127B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1656q() {
        if (this.f1157l != null) {
            this.f1157l.mo1084b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo1657r() {
        if (this.f1153h != null) {
            this.f1153h.mo1729c();
            return true;
        }
        C0378a a = mo1607a();
        return a != null && a.mo1561f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1658s() {
        if (this.f1167y != null) {
            this.f1167y.mo2404k();
        }
        if (this.f1155j != null) {
            this.f1147b.getDecorView().removeCallbacks(this.f1156k);
            if (this.f1155j.isShowing()) {
                try {
                    this.f1155j.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f1155j = null;
        }
        mo1656q();
        C0403f a = mo1627a(0, false);
        if (a != null && a.f1198j != null) {
            a.f1198j.close();
        }
    }
}
