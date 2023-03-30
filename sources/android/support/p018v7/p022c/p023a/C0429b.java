package android.support.p018v7.p022c.p023a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.support.p006v4.graphics.drawable.C0270a;
import android.util.SparseArray;

/* renamed from: android.support.v7.c.a.b */
class C0429b extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private C0432b f1305a;

    /* renamed from: b */
    private Rect f1306b;

    /* renamed from: c */
    private Drawable f1307c;

    /* renamed from: d */
    private Drawable f1308d;

    /* renamed from: e */
    private int f1309e = 255;

    /* renamed from: f */
    private boolean f1310f;

    /* renamed from: g */
    private int f1311g = -1;

    /* renamed from: h */
    private int f1312h = -1;

    /* renamed from: i */
    private boolean f1313i;

    /* renamed from: j */
    private Runnable f1314j;

    /* renamed from: k */
    private long f1315k;

    /* renamed from: l */
    private long f1316l;

    /* renamed from: m */
    private C0431a f1317m;

    /* renamed from: android.support.v7.c.a.b$a */
    static class C0431a implements Drawable.Callback {

        /* renamed from: a */
        private Drawable.Callback f1319a;

        C0431a() {
        }

        /* renamed from: a */
        public Drawable.Callback mo1798a() {
            Drawable.Callback callback = this.f1319a;
            this.f1319a = null;
            return callback;
        }

        /* renamed from: a */
        public C0431a mo1799a(Drawable.Callback callback) {
            this.f1319a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            if (this.f1319a != null) {
                this.f1319a.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (this.f1319a != null) {
                this.f1319a.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: android.support.v7.c.a.b$b */
    static abstract class C0432b extends Drawable.ConstantState {

        /* renamed from: A */
        boolean f1320A;

        /* renamed from: B */
        int f1321B;

        /* renamed from: C */
        int f1322C = 0;

        /* renamed from: D */
        int f1323D = 0;

        /* renamed from: E */
        boolean f1324E;

        /* renamed from: F */
        ColorFilter f1325F;

        /* renamed from: G */
        boolean f1326G;

        /* renamed from: H */
        ColorStateList f1327H;

        /* renamed from: I */
        PorterDuff.Mode f1328I;

        /* renamed from: J */
        boolean f1329J;

        /* renamed from: K */
        boolean f1330K;

        /* renamed from: c */
        final C0429b f1331c;

        /* renamed from: d */
        Resources f1332d;

        /* renamed from: e */
        int f1333e = 160;

        /* renamed from: f */
        int f1334f;

        /* renamed from: g */
        int f1335g;

        /* renamed from: h */
        SparseArray<Drawable.ConstantState> f1336h;

        /* renamed from: i */
        Drawable[] f1337i;

        /* renamed from: j */
        int f1338j;

        /* renamed from: k */
        boolean f1339k = false;

        /* renamed from: l */
        boolean f1340l;

        /* renamed from: m */
        Rect f1341m;

        /* renamed from: n */
        boolean f1342n = false;

        /* renamed from: o */
        boolean f1343o;

        /* renamed from: p */
        int f1344p;

        /* renamed from: q */
        int f1345q;

        /* renamed from: r */
        int f1346r;

        /* renamed from: s */
        int f1347s;

        /* renamed from: t */
        boolean f1348t;

        /* renamed from: u */
        int f1349u;

        /* renamed from: v */
        boolean f1350v;

        /* renamed from: w */
        boolean f1351w;

        /* renamed from: x */
        boolean f1352x;

        /* renamed from: y */
        boolean f1353y;

        /* renamed from: z */
        boolean f1354z = true;

        C0432b(C0432b bVar, C0429b bVar2, Resources resources) {
            this.f1331c = bVar2;
            this.f1332d = resources != null ? resources : bVar != null ? bVar.f1332d : null;
            this.f1333e = C0429b.m1988a(resources, bVar != null ? bVar.f1333e : 0);
            if (bVar != null) {
                this.f1334f = bVar.f1334f;
                this.f1335g = bVar.f1335g;
                this.f1352x = true;
                this.f1353y = true;
                this.f1339k = bVar.f1339k;
                this.f1342n = bVar.f1342n;
                this.f1354z = bVar.f1354z;
                this.f1320A = bVar.f1320A;
                this.f1321B = bVar.f1321B;
                this.f1322C = bVar.f1322C;
                this.f1323D = bVar.f1323D;
                this.f1324E = bVar.f1324E;
                this.f1325F = bVar.f1325F;
                this.f1326G = bVar.f1326G;
                this.f1327H = bVar.f1327H;
                this.f1328I = bVar.f1328I;
                this.f1329J = bVar.f1329J;
                this.f1330K = bVar.f1330K;
                if (bVar.f1333e == this.f1333e) {
                    if (bVar.f1340l) {
                        this.f1341m = new Rect(bVar.f1341m);
                        this.f1340l = true;
                    }
                    if (bVar.f1343o) {
                        this.f1344p = bVar.f1344p;
                        this.f1345q = bVar.f1345q;
                        this.f1346r = bVar.f1346r;
                        this.f1347s = bVar.f1347s;
                        this.f1343o = true;
                    }
                }
                if (bVar.f1348t) {
                    this.f1349u = bVar.f1349u;
                    this.f1348t = true;
                }
                if (bVar.f1350v) {
                    this.f1351w = bVar.f1351w;
                    this.f1350v = true;
                }
                Drawable[] drawableArr = bVar.f1337i;
                this.f1337i = new Drawable[drawableArr.length];
                this.f1338j = bVar.f1338j;
                SparseArray<Drawable.ConstantState> sparseArray = bVar.f1336h;
                if (sparseArray != null) {
                    this.f1336h = sparseArray.clone();
                } else {
                    this.f1336h = new SparseArray<>(this.f1338j);
                }
                int i = this.f1338j;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f1336h.put(i2, constantState);
                        } else {
                            this.f1337i[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f1337i = new Drawable[10];
            this.f1338j = 0;
        }

        /* renamed from: b */
        private Drawable m1999b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f1321B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f1331c);
            return mutate;
        }

        /* renamed from: o */
        private void m2000o() {
            if (this.f1336h != null) {
                int size = this.f1336h.size();
                for (int i = 0; i < size; i++) {
                    this.f1337i[this.f1336h.keyAt(i)] = m1999b(this.f1336h.valueAt(i).newDrawable(this.f1332d));
                }
                this.f1336h = null;
            }
        }

        /* renamed from: a */
        public final int mo1803a(Drawable drawable) {
            int i = this.f1338j;
            if (i >= this.f1337i.length) {
                mo1817e(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f1331c);
            this.f1337i[i] = drawable;
            this.f1338j++;
            this.f1335g |= drawable.getChangingConfigurations();
            mo1808b();
            this.f1341m = null;
            this.f1340l = false;
            this.f1343o = false;
            this.f1352x = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1780a() {
            int i = this.f1338j;
            Drawable[] drawableArr = this.f1337i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f1320A = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo1804a(Resources.Theme theme) {
            if (theme != null) {
                m2000o();
                int i = this.f1338j;
                Drawable[] drawableArr = this.f1337i;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f1335g |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo1805a(theme.getResources());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo1805a(Resources resources) {
            if (resources != null) {
                this.f1332d = resources;
                int a = C0429b.m1988a(resources, this.f1333e);
                int i = this.f1333e;
                this.f1333e = a;
                if (i != a) {
                    this.f1343o = false;
                    this.f1340l = false;
                }
            }
        }

        /* renamed from: a */
        public final void mo1806a(boolean z) {
            this.f1339k = z;
        }

        /* renamed from: b */
        public final Drawable mo1807b(int i) {
            int indexOfKey;
            Drawable drawable = this.f1337i[i];
            if (drawable != null) {
                return drawable;
            }
            if (this.f1336h == null || (indexOfKey = this.f1336h.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b = m1999b(this.f1336h.valueAt(indexOfKey).newDrawable(this.f1332d));
            this.f1337i[i] = b;
            this.f1336h.removeAt(indexOfKey);
            if (this.f1336h.size() != 0) {
                return b;
            }
            this.f1336h = null;
            return b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1808b() {
            this.f1348t = false;
            this.f1350v = false;
        }

        /* renamed from: b */
        public final void mo1809b(boolean z) {
            this.f1342n = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final int mo1810c() {
            return this.f1337i.length;
        }

        /* renamed from: c */
        public final void mo1811c(int i) {
            this.f1322C = i;
        }

        public boolean canApplyTheme() {
            int i = this.f1338j;
            Drawable[] drawableArr = this.f1337i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f1336h.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int mo1813d() {
            return this.f1338j;
        }

        /* renamed from: d */
        public final void mo1814d(int i) {
            this.f1323D = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo1815d(int i, int i2) {
            boolean z;
            int i3 = this.f1338j;
            Drawable[] drawableArr = this.f1337i;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < i3) {
                if (drawableArr[i4] != null) {
                    z = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        i4++;
                        z2 = z;
                    }
                }
                z = z2;
                i4++;
                z2 = z;
            }
            this.f1321B = i;
            return z2;
        }

        /* renamed from: e */
        public final Rect mo1816e() {
            Rect rect = null;
            if (this.f1339k) {
                return null;
            }
            if (this.f1341m != null || this.f1340l) {
                return this.f1341m;
            }
            m2000o();
            Rect rect2 = new Rect();
            int i = this.f1338j;
            Drawable[] drawableArr = this.f1337i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    if (rect2.left > rect.left) {
                        rect.left = rect2.left;
                    }
                    if (rect2.top > rect.top) {
                        rect.top = rect2.top;
                    }
                    if (rect2.right > rect.right) {
                        rect.right = rect2.right;
                    }
                    if (rect2.bottom > rect.bottom) {
                        rect.bottom = rect2.bottom;
                    }
                }
            }
            this.f1340l = true;
            this.f1341m = rect;
            return rect;
        }

        /* renamed from: e */
        public void mo1817e(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f1337i, 0, drawableArr, 0, i);
            this.f1337i = drawableArr;
        }

        /* renamed from: f */
        public final boolean mo1818f() {
            return this.f1342n;
        }

        /* renamed from: g */
        public final int mo1819g() {
            if (!this.f1343o) {
                mo1824k();
            }
            return this.f1344p;
        }

        public int getChangingConfigurations() {
            return this.f1334f | this.f1335g;
        }

        /* renamed from: h */
        public final int mo1821h() {
            if (!this.f1343o) {
                mo1824k();
            }
            return this.f1345q;
        }

        /* renamed from: i */
        public final int mo1822i() {
            if (!this.f1343o) {
                mo1824k();
            }
            return this.f1346r;
        }

        /* renamed from: j */
        public final int mo1823j() {
            if (!this.f1343o) {
                mo1824k();
            }
            return this.f1347s;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo1824k() {
            this.f1343o = true;
            m2000o();
            int i = this.f1338j;
            Drawable[] drawableArr = this.f1337i;
            this.f1345q = -1;
            this.f1344p = -1;
            this.f1347s = 0;
            this.f1346r = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f1344p) {
                    this.f1344p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f1345q) {
                    this.f1345q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f1346r) {
                    this.f1346r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f1347s) {
                    this.f1347s = minimumHeight;
                }
            }
        }

        /* renamed from: l */
        public final int mo1825l() {
            if (this.f1348t) {
                return this.f1349u;
            }
            m2000o();
            int i = this.f1338j;
            Drawable[] drawableArr = this.f1337i;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f1349u = opacity;
            this.f1348t = true;
            return opacity;
        }

        /* renamed from: m */
        public final boolean mo1826m() {
            boolean z = false;
            if (this.f1350v) {
                return this.f1351w;
            }
            m2000o();
            int i = this.f1338j;
            Drawable[] drawableArr = this.f1337i;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f1351w = z;
            this.f1350v = true;
            return z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r6.f1353y = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
            r0 = true;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo1827n() {
            /*
                r6 = this;
                r1 = 1
                r0 = 0
                monitor-enter(r6)
                boolean r2 = r6.f1352x     // Catch:{ all -> 0x0024 }
                if (r2 == 0) goto L_0x000b
                boolean r0 = r6.f1353y     // Catch:{ all -> 0x0024 }
            L_0x0009:
                monitor-exit(r6)
                return r0
            L_0x000b:
                r6.m2000o()     // Catch:{ all -> 0x0024 }
                r2 = 1
                r6.f1352x = r2     // Catch:{ all -> 0x0024 }
                int r3 = r6.f1338j     // Catch:{ all -> 0x0024 }
                android.graphics.drawable.Drawable[] r4 = r6.f1337i     // Catch:{ all -> 0x0024 }
                r2 = r0
            L_0x0016:
                if (r2 >= r3) goto L_0x002a
                r5 = r4[r2]     // Catch:{ all -> 0x0024 }
                android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()     // Catch:{ all -> 0x0024 }
                if (r5 != 0) goto L_0x0027
                r1 = 0
                r6.f1353y = r1     // Catch:{ all -> 0x0024 }
                goto L_0x0009
            L_0x0024:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            L_0x0027:
                int r2 = r2 + 1
                goto L_0x0016
            L_0x002a:
                r0 = 1
                r6.f1353y = r0     // Catch:{ all -> 0x0024 }
                r0 = r1
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.p022c.p023a.C0429b.C0432b.mo1827n():boolean");
        }
    }

    C0429b() {
    }

    /* renamed from: a */
    static int m1988a(Resources resources, int i) {
        int i2 = resources == null ? i : resources.getDisplayMetrics().densityDpi;
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    /* renamed from: a */
    private void m1989a(Drawable drawable) {
        if (this.f1317m == null) {
            this.f1317m = new C0431a();
        }
        drawable.setCallback(this.f1317m.mo1799a(drawable.getCallback()));
        try {
            if (this.f1305a.f1322C <= 0 && this.f1310f) {
                drawable.setAlpha(this.f1309e);
            }
            if (this.f1305a.f1326G) {
                drawable.setColorFilter(this.f1305a.f1325F);
            } else {
                if (this.f1305a.f1329J) {
                    C0270a.m1156a(drawable, this.f1305a.f1327H);
                }
                if (this.f1305a.f1330K) {
                    C0270a.m1159a(drawable, this.f1305a.f1328I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1305a.f1354z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f1305a.f1324E);
            }
            Rect rect = this.f1306b;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f1317m.mo1798a());
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: a */
    private boolean mo1736a() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1790a(Resources resources) {
        this.f1305a.mo1805a(resources);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1737a(C0432b bVar) {
        this.f1305a = bVar;
        if (this.f1311g >= 0) {
            this.f1307c = bVar.mo1807b(this.f1311g);
            if (this.f1307c != null) {
                m1989a(this.f1307c);
            }
        }
        this.f1312h = -1;
        this.f1308d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1791a(boolean z) {
        boolean z2;
        this.f1310f = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f1307c != null) {
            if (this.f1315k != 0) {
                if (this.f1315k <= uptimeMillis) {
                    this.f1307c.setAlpha(this.f1309e);
                    this.f1315k = 0;
                    z2 = false;
                } else {
                    this.f1307c.setAlpha(((255 - (((int) ((this.f1315k - uptimeMillis) * 255)) / this.f1305a.f1322C)) * this.f1309e) / 255);
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            this.f1315k = 0;
            z2 = false;
        }
        if (this.f1308d == null) {
            this.f1316l = 0;
        } else if (this.f1316l != 0) {
            if (this.f1316l <= uptimeMillis) {
                this.f1308d.setVisible(false, false);
                this.f1308d = null;
                this.f1312h = -1;
                this.f1316l = 0;
            } else {
                this.f1308d.setAlpha(((((int) ((this.f1316l - uptimeMillis) * 255)) / this.f1305a.f1323D) * this.f1309e) / 255);
                z2 = true;
            }
        }
        if (z && z2) {
            scheduleSelf(this.f1314j, 16 + uptimeMillis);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1792a(int i) {
        if (i == this.f1311g) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f1305a.f1323D > 0) {
            if (this.f1308d != null) {
                this.f1308d.setVisible(false, false);
            }
            if (this.f1307c != null) {
                this.f1308d = this.f1307c;
                this.f1312h = this.f1311g;
                this.f1316l = ((long) this.f1305a.f1323D) + uptimeMillis;
            } else {
                this.f1308d = null;
                this.f1312h = -1;
                this.f1316l = 0;
            }
        } else if (this.f1307c != null) {
            this.f1307c.setVisible(false, false);
        }
        if (i < 0 || i >= this.f1305a.f1338j) {
            this.f1307c = null;
            this.f1311g = -1;
        } else {
            Drawable b = this.f1305a.mo1807b(i);
            this.f1307c = b;
            this.f1311g = i;
            if (b != null) {
                if (this.f1305a.f1322C > 0) {
                    this.f1315k = uptimeMillis + ((long) this.f1305a.f1322C);
                }
                m1989a(b);
            }
        }
        if (!(this.f1315k == 0 && this.f1316l == 0)) {
            if (this.f1314j == null) {
                this.f1314j = new Runnable() {
                    public void run() {
                        C0429b.this.mo1791a(true);
                        C0429b.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(this.f1314j);
            }
            mo1791a(true);
        }
        invalidateSelf();
        return true;
    }

    public void applyTheme(Resources.Theme theme) {
        this.f1305a.mo1804a(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0432b mo1741c() {
        return this.f1305a;
    }

    public boolean canApplyTheme() {
        return this.f1305a.canApplyTheme();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo1793d() {
        return this.f1311g;
    }

    public void draw(Canvas canvas) {
        if (this.f1307c != null) {
            this.f1307c.draw(canvas);
        }
        if (this.f1308d != null) {
            this.f1308d.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f1309e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1305a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f1305a.mo1827n()) {
            return null;
        }
        this.f1305a.f1334f = getChangingConfigurations();
        return this.f1305a;
    }

    public Drawable getCurrent() {
        return this.f1307c;
    }

    public void getHotspotBounds(Rect rect) {
        if (this.f1306b != null) {
            rect.set(this.f1306b);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f1305a.mo1818f()) {
            return this.f1305a.mo1821h();
        }
        if (this.f1307c != null) {
            return this.f1307c.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f1305a.mo1818f()) {
            return this.f1305a.mo1819g();
        }
        if (this.f1307c != null) {
            return this.f1307c.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f1305a.mo1818f()) {
            return this.f1305a.mo1823j();
        }
        if (this.f1307c != null) {
            return this.f1307c.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f1305a.mo1818f()) {
            return this.f1305a.mo1822i();
        }
        if (this.f1307c != null) {
            return this.f1307c.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        if (this.f1307c == null || !this.f1307c.isVisible()) {
            return -2;
        }
        return this.f1305a.mo1825l();
    }

    public void getOutline(Outline outline) {
        if (this.f1307c != null) {
            this.f1307c.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect e = this.f1305a.mo1816e();
        if (e != null) {
            rect.set(e);
            padding = (e.right | ((e.left | e.top) | e.bottom)) != 0;
        } else {
            padding = this.f1307c != null ? this.f1307c.getPadding(rect) : super.getPadding(rect);
        }
        if (mo1736a()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f1305a != null) {
            this.f1305a.mo1808b();
        }
        if (drawable == this.f1307c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f1305a.f1324E;
    }

    public boolean isStateful() {
        return this.f1305a.mo1826m();
    }

    public void jumpToCurrentState() {
        boolean z = true;
        boolean z2 = false;
        if (this.f1308d != null) {
            this.f1308d.jumpToCurrentState();
            this.f1308d = null;
            this.f1312h = -1;
            z2 = true;
        }
        if (this.f1307c != null) {
            this.f1307c.jumpToCurrentState();
            if (this.f1310f) {
                this.f1307c.setAlpha(this.f1309e);
            }
        }
        if (this.f1316l != 0) {
            this.f1316l = 0;
            z2 = true;
        }
        if (this.f1315k != 0) {
            this.f1315k = 0;
        } else {
            z = z2;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f1313i && super.mutate() == this) {
            C0432b c = mo1741c();
            c.mo1780a();
            mo1737a(c);
            this.f1313i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f1308d != null) {
            this.f1308d.setBounds(rect);
        }
        if (this.f1307c != null) {
            this.f1307c.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f1305a.mo1815d(i, mo1793d());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f1308d != null) {
            return this.f1308d.setLevel(i);
        }
        if (this.f1307c != null) {
            return this.f1307c.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f1308d != null) {
            return this.f1308d.setState(iArr);
        }
        if (this.f1307c != null) {
            return this.f1307c.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f1307c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f1310f || this.f1309e != i) {
            this.f1310f = true;
            this.f1309e = i;
            if (this.f1307c == null) {
                return;
            }
            if (this.f1315k == 0) {
                this.f1307c.setAlpha(i);
            } else {
                mo1791a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f1305a.f1324E != z) {
            this.f1305a.f1324E = z;
            if (this.f1307c != null) {
                C0270a.m1160a(this.f1307c, this.f1305a.f1324E);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1305a.f1326G = true;
        if (this.f1305a.f1325F != colorFilter) {
            this.f1305a.f1325F = colorFilter;
            if (this.f1307c != null) {
                this.f1307c.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        if (this.f1305a.f1354z != z) {
            this.f1305a.f1354z = z;
            if (this.f1307c != null) {
                this.f1307c.setDither(this.f1305a.f1354z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f1307c != null) {
            C0270a.m1153a(this.f1307c, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f1306b == null) {
            this.f1306b = new Rect(i, i2, i3, i4);
        } else {
            this.f1306b.set(i, i2, i3, i4);
        }
        if (this.f1307c != null) {
            C0270a.m1155a(this.f1307c, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1305a.f1329J = true;
        if (this.f1305a.f1327H != colorStateList) {
            this.f1305a.f1327H = colorStateList;
            C0270a.m1156a(this.f1307c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1305a.f1330K = true;
        if (this.f1305a.f1328I != mode) {
            this.f1305a.f1328I = mode;
            C0270a.m1159a(this.f1307c, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f1308d != null) {
            this.f1308d.setVisible(z, z2);
        }
        if (this.f1307c != null) {
            this.f1307c.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f1307c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
