package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.p004b.p005a.C0048c;
import android.support.p004b.p005a.C0058i;
import android.support.p006v4.graphics.C0264a;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.p007a.C0068a;
import android.support.p006v4.p014f.C0199a;
import android.support.p006v4.p014f.C0206f;
import android.support.p006v4.p014f.C0207g;
import android.support.p006v4.p014f.C0217l;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.support.p018v7.p022c.p023a.C0421a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.widget.k */
public final class C0608k {

    /* renamed from: a */
    private static final PorterDuff.Mode f2213a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0608k f2214b;

    /* renamed from: c */
    private static final C0611c f2215c = new C0611c(6);

    /* renamed from: d */
    private static final int[] f2216d = {C0353a.C0358e.abc_textfield_search_default_mtrl_alpha, C0353a.C0358e.abc_textfield_default_mtrl_alpha, C0353a.C0358e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f2217e = {C0353a.C0358e.abc_ic_commit_search_api_mtrl_alpha, C0353a.C0358e.abc_seekbar_tick_mark_material, C0353a.C0358e.abc_ic_menu_share_mtrl_alpha, C0353a.C0358e.abc_ic_menu_copy_mtrl_am_alpha, C0353a.C0358e.abc_ic_menu_cut_mtrl_alpha, C0353a.C0358e.abc_ic_menu_selectall_mtrl_alpha, C0353a.C0358e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f2218f = {C0353a.C0358e.abc_textfield_activated_mtrl_alpha, C0353a.C0358e.abc_textfield_search_activated_mtrl_alpha, C0353a.C0358e.abc_cab_background_top_mtrl_alpha, C0353a.C0358e.abc_text_cursor_material, C0353a.C0358e.abc_text_select_handle_left_mtrl_dark, C0353a.C0358e.abc_text_select_handle_middle_mtrl_dark, C0353a.C0358e.abc_text_select_handle_right_mtrl_dark, C0353a.C0358e.abc_text_select_handle_left_mtrl_light, C0353a.C0358e.abc_text_select_handle_middle_mtrl_light, C0353a.C0358e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f2219g = {C0353a.C0358e.abc_popup_background_mtrl_mult, C0353a.C0358e.abc_cab_background_internal_bg, C0353a.C0358e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f2220h = {C0353a.C0358e.abc_tab_indicator_material, C0353a.C0358e.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f2221i = {C0353a.C0358e.abc_btn_check_material, C0353a.C0358e.abc_btn_radio_material};

    /* renamed from: j */
    private WeakHashMap<Context, C0217l<ColorStateList>> f2222j;

    /* renamed from: k */
    private C0199a<String, C0612d> f2223k;

    /* renamed from: l */
    private C0217l<String> f2224l;

    /* renamed from: m */
    private final WeakHashMap<Context, C0206f<WeakReference<Drawable.ConstantState>>> f2225m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f2226n;

    /* renamed from: o */
    private boolean f2227o;

    /* renamed from: android.support.v7.widget.k$a */
    static class C0609a implements C0612d {
        C0609a() {
        }

        /* renamed from: a */
        public Drawable mo3091a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0421a.m1953a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.k$b */
    private static class C0610b implements C0612d {
        C0610b() {
        }

        /* renamed from: a */
        public Drawable mo3091a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0048c.m132a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.k$c */
    private static class C0611c extends C0207g<Integer, PorterDuffColorFilter> {
        public C0611c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m3014b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo3092a(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo861a(Integer.valueOf(m3014b(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo3093a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo862a(Integer.valueOf(m3014b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.k$d */
    private interface C0612d {
        /* renamed from: a */
        Drawable mo3091a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: android.support.v7.widget.k$e */
    private static class C0613e implements C0612d {
        C0613e() {
        }

        /* renamed from: a */
        public Drawable mo3091a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0058i.m166a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m2982a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    static PorterDuff.Mode m2983a(int i) {
        if (i == C0353a.C0358e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m2984a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0608k.class) {
            a = f2215c.mo3092a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f2215c.mo3093a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m2985a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m2984a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m2986a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo3090b(context, i);
        if (b != null) {
            if (C0539ad.m2675b(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable f = C0270a.m1166f(drawable);
            C0270a.m1156a(f, b);
            PorterDuff.Mode a = m2983a(i);
            if (a == null) {
                return f;
            }
            C0270a.m1159a(f, a);
            return f;
        } else if (i == C0353a.C0358e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m2990a(layerDrawable.findDrawableByLayerId(16908288), C0570ap.m2807a(context, C0353a.C0354a.colorControlNormal), f2213a);
            m2990a(layerDrawable.findDrawableByLayerId(16908303), C0570ap.m2807a(context, C0353a.C0354a.colorControlNormal), f2213a);
            m2990a(layerDrawable.findDrawableByLayerId(16908301), C0570ap.m2807a(context, C0353a.C0354a.colorControlActivated), f2213a);
            return drawable;
        } else if (i == C0353a.C0358e.abc_ratingbar_material || i == C0353a.C0358e.abc_ratingbar_indicator_material || i == C0353a.C0358e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m2990a(layerDrawable2.findDrawableByLayerId(16908288), C0570ap.m2811c(context, C0353a.C0354a.colorControlNormal), f2213a);
            m2990a(layerDrawable2.findDrawableByLayerId(16908303), C0570ap.m2807a(context, C0353a.C0354a.colorControlActivated), f2213a);
            m2990a(layerDrawable2.findDrawableByLayerId(16908301), C0570ap.m2807a(context, C0353a.C0354a.colorControlActivated), f2213a);
            return drawable;
        } else if (m2994a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private synchronized Drawable m2987a(Context context, long j) {
        Drawable drawable;
        C0206f fVar = this.f2225m.get(context);
        if (fVar == null) {
            drawable = null;
        } else {
            WeakReference weakReference = (WeakReference) fVar.mo851a(j);
            if (weakReference != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawable = constantState.newDrawable(context.getResources());
                } else {
                    fVar.mo855b(j);
                }
            }
            drawable = null;
        }
        return drawable;
    }

    /* renamed from: a */
    public static synchronized C0608k m2988a() {
        C0608k kVar;
        synchronized (C0608k.class) {
            if (f2214b == null) {
                f2214b = new C0608k();
                m2992a(f2214b);
            }
            kVar = f2214b;
        }
        return kVar;
    }

    /* renamed from: a */
    private void m2989a(Context context, int i, ColorStateList colorStateList) {
        if (this.f2222j == null) {
            this.f2222j = new WeakHashMap<>();
        }
        C0217l lVar = this.f2222j.get(context);
        if (lVar == null) {
            lVar = new C0217l();
            this.f2222j.put(context, lVar);
        }
        lVar.mo958c(i, colorStateList);
    }

    /* renamed from: a */
    private static void m2990a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0539ad.m2675b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f2213a;
        }
        drawable.setColorFilter(m2984a(i, mode));
    }

    /* renamed from: a */
    static void m2991a(Drawable drawable, C0573as asVar, int[] iArr) {
        if (!C0539ad.m2675b(drawable) || drawable.mutate() == drawable) {
            if (asVar.f2089d || asVar.f2088c) {
                drawable.setColorFilter(m2985a(asVar.f2089d ? asVar.f2086a : null, asVar.f2088c ? asVar.f2087b : f2213a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m2992a(C0608k kVar) {
        if (Build.VERSION.SDK_INT < 24) {
            kVar.m2993a("vector", (C0612d) new C0613e());
            kVar.m2993a("animated-vector", (C0612d) new C0610b());
            kVar.m2993a("animated-selector", (C0612d) new C0609a());
        }
    }

    /* renamed from: a */
    private void m2993a(String str, C0612d dVar) {
        if (this.f2223k == null) {
            this.f2223k = new C0199a<>();
        }
        this.f2223k.put(str, dVar);
    }

    /* renamed from: a */
    static boolean m2994a(Context context, int i, Drawable drawable) {
        int i2;
        boolean z;
        int i3 = 16842801;
        PorterDuff.Mode mode = f2213a;
        if (m2997a(f2216d, i)) {
            i3 = C0353a.C0354a.colorControlNormal;
            i2 = -1;
            z = true;
        } else if (m2997a(f2218f, i)) {
            i3 = C0353a.C0354a.colorControlActivated;
            i2 = -1;
            z = true;
        } else if (m2997a(f2219g, i)) {
            mode = PorterDuff.Mode.MULTIPLY;
            i2 = -1;
            z = true;
        } else if (i == C0353a.C0358e.abc_list_divider_mtrl_alpha) {
            i3 = 16842800;
            i2 = Math.round(40.8f);
            z = true;
        } else if (i == C0353a.C0358e.abc_dialog_material_background) {
            i2 = -1;
            z = true;
        } else {
            i2 = -1;
            i3 = 0;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (C0539ad.m2675b(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(m2984a(C0570ap.m2807a(context, i3), mode));
        if (i2 == -1) {
            return true;
        }
        drawable.setAlpha(i2);
        return true;
    }

    /* renamed from: a */
    private synchronized boolean m2995a(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0206f fVar = this.f2225m.get(context);
            if (fVar == null) {
                fVar = new C0206f();
                this.f2225m.put(context, fVar);
            }
            fVar.mo856b(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m2996a(Drawable drawable) {
        return (drawable instanceof C0058i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    private static boolean m2997a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private ColorStateList m2998b(Context context) {
        return m3005f(context, C0570ap.m2807a(context, C0353a.C0354a.colorButtonNormal));
    }

    /* renamed from: c */
    private ColorStateList m2999c(Context context) {
        return m3005f(context, 0);
    }

    /* renamed from: c */
    private Drawable m3000c(Context context, int i) {
        if (this.f2226n == null) {
            this.f2226n = new TypedValue();
        }
        TypedValue typedValue = this.f2226n;
        context.getResources().getValue(i, typedValue, true);
        long a = m2982a(typedValue);
        Drawable a2 = m2987a(context, a);
        if (a2 == null) {
            if (i == C0353a.C0358e.abc_cab_background_top_material) {
                a2 = new LayerDrawable(new Drawable[]{mo3086a(context, C0353a.C0358e.abc_cab_background_internal_bg), mo3086a(context, C0353a.C0358e.abc_cab_background_top_mtrl_alpha)});
            }
            if (a2 != null) {
                a2.setChangingConfigurations(typedValue.changingConfigurations);
                m2995a(context, a, a2);
            }
        }
        return a2;
    }

    /* renamed from: d */
    private ColorStateList m3001d(Context context) {
        return m3005f(context, C0570ap.m2807a(context, C0353a.C0354a.colorAccent));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m3002d(android.content.Context r10, int r11) {
        /*
            r9 = this;
            r1 = 0
            r8 = 2
            r7 = 1
            android.support.v4.f.a<java.lang.String, android.support.v7.widget.k$d> r0 = r9.f2223k
            if (r0 == 0) goto L_0x00bf
            android.support.v4.f.a<java.lang.String, android.support.v7.widget.k$d> r0 = r9.f2223k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00bf
            android.support.v4.f.l<java.lang.String> r0 = r9.f2224l
            if (r0 == 0) goto L_0x002f
            android.support.v4.f.l<java.lang.String> r0 = r9.f2224l
            java.lang.Object r0 = r0.mo951a(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x002d
            if (r0 == 0) goto L_0x0036
            android.support.v4.f.a<java.lang.String, android.support.v7.widget.k$d> r2 = r9.f2223k
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L_0x0036
        L_0x002d:
            r0 = r1
        L_0x002e:
            return r0
        L_0x002f:
            android.support.v4.f.l r0 = new android.support.v4.f.l
            r0.<init>()
            r9.f2224l = r0
        L_0x0036:
            android.util.TypedValue r0 = r9.f2226n
            if (r0 != 0) goto L_0x0041
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.f2226n = r0
        L_0x0041:
            android.util.TypedValue r2 = r9.f2226n
            android.content.res.Resources r0 = r10.getResources()
            r0.getValue(r11, r2, r7)
            long r4 = m2982a((android.util.TypedValue) r2)
            android.graphics.drawable.Drawable r1 = r9.m2987a((android.content.Context) r10, (long) r4)
            if (r1 == 0) goto L_0x0056
            r0 = r1
            goto L_0x002e
        L_0x0056:
            java.lang.CharSequence r3 = r2.string
            if (r3 == 0) goto L_0x008a
            java.lang.CharSequence r3 = r2.string
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = ".xml"
            boolean r3 = r3.endsWith(r6)
            if (r3 == 0) goto L_0x008a
            android.content.res.XmlResourceParser r3 = r0.getXml(r11)     // Catch:{ Exception -> 0x0082 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r3)     // Catch:{ Exception -> 0x0082 }
        L_0x0070:
            int r0 = r3.next()     // Catch:{ Exception -> 0x0082 }
            if (r0 == r8) goto L_0x0078
            if (r0 != r7) goto L_0x0070
        L_0x0078:
            if (r0 == r8) goto L_0x0095
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0082 }
            java.lang.String r2 = "No start tag found"
            r0.<init>(r2)     // Catch:{ Exception -> 0x0082 }
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            java.lang.String r2 = "AppCompatDrawableManag"
            java.lang.String r3 = "Exception while inflating drawable"
            android.util.Log.e(r2, r3, r0)
        L_0x008a:
            r0 = r1
        L_0x008b:
            if (r0 != 0) goto L_0x002e
            android.support.v4.f.l<java.lang.String> r1 = r9.f2224l
            java.lang.String r2 = "appcompat_skip_skip"
            r1.mo958c(r11, r2)
            goto L_0x002e
        L_0x0095:
            java.lang.String r0 = r3.getName()     // Catch:{ Exception -> 0x0082 }
            android.support.v4.f.l<java.lang.String> r7 = r9.f2224l     // Catch:{ Exception -> 0x0082 }
            r7.mo958c(r11, r0)     // Catch:{ Exception -> 0x0082 }
            android.support.v4.f.a<java.lang.String, android.support.v7.widget.k$d> r7 = r9.f2223k     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x0082 }
            android.support.v7.widget.k$d r0 = (android.support.p018v7.widget.C0608k.C0612d) r0     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x00b0
            android.content.res.Resources$Theme r7 = r10.getTheme()     // Catch:{ Exception -> 0x0082 }
            android.graphics.drawable.Drawable r1 = r0.mo3091a(r10, r3, r6, r7)     // Catch:{ Exception -> 0x0082 }
        L_0x00b0:
            if (r1 == 0) goto L_0x00bd
            int r0 = r2.changingConfigurations     // Catch:{ Exception -> 0x0082 }
            r1.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x0082 }
            boolean r0 = r9.m2995a((android.content.Context) r10, (long) r4, (android.graphics.drawable.Drawable) r1)     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x00bd
        L_0x00bd:
            r0 = r1
            goto L_0x008b
        L_0x00bf:
            r0 = r1
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.widget.C0608k.m3002d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    private ColorStateList m3003e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = C0570ap.m2810b(context, C0353a.C0354a.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = C0570ap.f2072a;
            iArr2[0] = C0570ap.m2811c(context, C0353a.C0354a.colorSwitchThumbNormal);
            iArr[1] = C0570ap.f2076e;
            iArr2[1] = C0570ap.m2807a(context, C0353a.C0354a.colorControlActivated);
            iArr[2] = C0570ap.f2079h;
            iArr2[2] = C0570ap.m2807a(context, C0353a.C0354a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0570ap.f2072a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = C0570ap.f2076e;
            iArr2[1] = C0570ap.m2807a(context, C0353a.C0354a.colorControlActivated);
            iArr[2] = C0570ap.f2079h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: e */
    private ColorStateList m3004e(Context context, int i) {
        if (this.f2222j == null) {
            return null;
        }
        C0217l lVar = this.f2222j.get(context);
        if (lVar != null) {
            return (ColorStateList) lVar.mo951a(i);
        }
        return null;
    }

    /* renamed from: f */
    private ColorStateList m3005f(Context context, int i) {
        int a = C0570ap.m2807a(context, C0353a.C0354a.colorControlHighlight);
        int c = C0570ap.m2811c(context, C0353a.C0354a.colorButtonNormal);
        return new ColorStateList(new int[][]{C0570ap.f2072a, C0570ap.f2075d, C0570ap.f2073b, C0570ap.f2079h}, new int[]{c, C0264a.m1119a(a, i), C0264a.m1119a(a, i), i});
    }

    /* renamed from: f */
    private void m3006f(Context context) {
        if (!this.f2227o) {
            this.f2227o = true;
            Drawable a = mo3086a(context, C0353a.C0358e.abc_vector_test);
            if (a == null || !m2996a(a)) {
                this.f2227o = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo3086a(Context context, int i) {
        return mo3087a(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo3087a(Context context, int i, boolean z) {
        Drawable d;
        m3006f(context);
        d = m3002d(context, i);
        if (d == null) {
            d = m3000c(context, i);
        }
        if (d == null) {
            d = C0068a.m208a(context, i);
        }
        if (d != null) {
            d = m2986a(context, i, z, d);
        }
        if (d != null) {
            C0539ad.m2674a(d);
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo3088a(Context context, C0584az azVar, int i) {
        Drawable d;
        d = m3002d(context, i);
        if (d == null) {
            d = azVar.mo2993a(i);
        }
        return d != null ? m2986a(context, i, false, d) : null;
    }

    /* renamed from: a */
    public synchronized void mo3089a(Context context) {
        C0206f fVar = this.f2225m.get(context);
        if (fVar != null) {
            fVar.mo857c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized ColorStateList mo3090b(Context context, int i) {
        ColorStateList e;
        e = m3004e(context, i);
        if (e == null) {
            if (i == C0353a.C0358e.abc_edit_text_material) {
                e = C0419a.m1946a(context, C0353a.C0356c.abc_tint_edittext);
            } else if (i == C0353a.C0358e.abc_switch_track_mtrl_alpha) {
                e = C0419a.m1946a(context, C0353a.C0356c.abc_tint_switch_track);
            } else if (i == C0353a.C0358e.abc_switch_thumb_material) {
                e = m3003e(context);
            } else if (i == C0353a.C0358e.abc_btn_default_mtrl_shape) {
                e = m2998b(context);
            } else if (i == C0353a.C0358e.abc_btn_borderless_material) {
                e = m2999c(context);
            } else if (i == C0353a.C0358e.abc_btn_colored_material) {
                e = m3001d(context);
            } else if (i == C0353a.C0358e.abc_spinner_mtrl_am_alpha || i == C0353a.C0358e.abc_spinner_textfield_background_material) {
                e = C0419a.m1946a(context, C0353a.C0356c.abc_tint_spinner);
            } else if (m2997a(f2217e, i)) {
                e = C0570ap.m2810b(context, C0353a.C0354a.colorControlNormal);
            } else if (m2997a(f2220h, i)) {
                e = C0419a.m1946a(context, C0353a.C0356c.abc_tint_default);
            } else if (m2997a(f2221i, i)) {
                e = C0419a.m1946a(context, C0353a.C0356c.abc_tint_btn_checkable);
            } else if (i == C0353a.C0358e.abc_seekbar_thumb_material) {
                e = C0419a.m1946a(context, C0353a.C0356c.abc_tint_seek_thumb);
            }
            if (e != null) {
                m2989a(context, i, e);
            }
        }
        return e;
    }
}
