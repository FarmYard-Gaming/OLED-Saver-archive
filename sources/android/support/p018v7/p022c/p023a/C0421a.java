package android.support.p018v7.p022c.p023a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p004b.p005a.C0048c;
import android.support.p004b.p005a.C0058i;
import android.support.p006v4.p007a.p008a.C0083g;
import android.support.p006v4.p014f.C0206f;
import android.support.p006v4.p014f.C0217l;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.support.p018v7.p022c.p023a.C0429b;
import android.support.p018v7.p022c.p023a.C0434d;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.c.a.a */
public class C0421a extends C0434d {

    /* renamed from: a */
    private static final String f1290a = C0421a.class.getSimpleName();

    /* renamed from: b */
    private C0424b f1291b;

    /* renamed from: c */
    private C0428f f1292c;

    /* renamed from: d */
    private int f1293d;

    /* renamed from: e */
    private int f1294e;

    /* renamed from: f */
    private boolean f1295f;

    /* renamed from: android.support.v7.c.a.a$a */
    private static class C0423a extends C0428f {

        /* renamed from: a */
        private final Animatable f1296a;

        C0423a(Animatable animatable) {
            super();
            this.f1296a = animatable;
        }

        /* renamed from: a */
        public void mo1773a() {
            this.f1296a.start();
        }

        /* renamed from: b */
        public void mo1774b() {
            this.f1296a.stop();
        }
    }

    /* renamed from: android.support.v7.c.a.a$b */
    static class C0424b extends C0434d.C0435a {

        /* renamed from: a */
        C0206f<Long> f1297a;

        /* renamed from: b */
        C0217l<Integer> f1298b;

        C0424b(C0424b bVar, C0421a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.f1297a = bVar.f1297a;
                this.f1298b = bVar.f1298b;
                return;
            }
            this.f1297a = new C0206f<>();
            this.f1298b = new C0217l<>();
        }

        /* renamed from: f */
        private static long m1967f(int i, int i2) {
            return (((long) i) << 32) | ((long) i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1775a(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f1298b.mo952a(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1776a(int i, int i2) {
            return (int) this.f1297a.mo852a(m1967f(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1777a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo1803a(drawable);
            long f = m1967f(i, i2);
            long j = 0;
            if (z) {
                j = 8589934592L;
            }
            this.f1297a.mo858c(f, Long.valueOf(((long) a) | j));
            if (z) {
                this.f1297a.mo858c(m1967f(i2, i), Long.valueOf(j | ((long) a) | 4294967296L));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1778a(int[] iArr) {
            int b = super.mo1864b(iArr);
            return b >= 0 ? b : super.mo1864b(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1779a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo1863a(iArr, drawable);
            this.f1298b.mo955b(a, Integer.valueOf(i));
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1780a() {
            this.f1297a = this.f1297a.clone();
            this.f1298b = this.f1298b.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1781b(int i, int i2) {
            return (this.f1297a.mo852a(m1967f(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo1782c(int i, int i2) {
            return (this.f1297a.mo852a(m1967f(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C0421a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0421a(this, resources);
        }
    }

    /* renamed from: android.support.v7.c.a.a$c */
    private static class C0425c extends C0428f {

        /* renamed from: a */
        private final C0048c f1299a;

        C0425c(C0048c cVar) {
            super();
            this.f1299a = cVar;
        }

        /* renamed from: a */
        public void mo1773a() {
            this.f1299a.start();
        }

        /* renamed from: b */
        public void mo1774b() {
            this.f1299a.stop();
        }
    }

    /* renamed from: android.support.v7.c.a.a$d */
    private static class C0426d extends C0428f {

        /* renamed from: a */
        private final ObjectAnimator f1300a;

        /* renamed from: b */
        private final boolean f1301b;

        C0426d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0427e eVar = new C0427e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.mo1787a());
            ofInt.setInterpolator(eVar);
            this.f1301b = z2;
            this.f1300a = ofInt;
        }

        /* renamed from: a */
        public void mo1773a() {
            this.f1300a.start();
        }

        /* renamed from: b */
        public void mo1774b() {
            this.f1300a.cancel();
        }

        /* renamed from: c */
        public boolean mo1785c() {
            return this.f1301b;
        }

        /* renamed from: d */
        public void mo1786d() {
            this.f1300a.reverse();
        }
    }

    /* renamed from: android.support.v7.c.a.a$e */
    private static class C0427e implements TimeInterpolator {

        /* renamed from: a */
        private int[] f1302a;

        /* renamed from: b */
        private int f1303b;

        /* renamed from: c */
        private int f1304c;

        C0427e(AnimationDrawable animationDrawable, boolean z) {
            mo1788a(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1787a() {
            return this.f1304c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1788a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f1303b = numberOfFrames;
            if (this.f1302a == null || this.f1302a.length < numberOfFrames) {
                this.f1302a = new int[numberOfFrames];
            }
            int[] iArr = this.f1302a;
            int i = 0;
            int i2 = 0;
            while (i < numberOfFrames) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i) - 1 : i);
                iArr[i] = duration;
                i++;
                i2 = duration + i2;
            }
            this.f1304c = i2;
            return i2;
        }

        public float getInterpolation(float f) {
            int i = (int) ((((float) this.f1304c) * f) + 0.5f);
            int i2 = this.f1303b;
            int[] iArr = this.f1302a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 < i2 ? ((float) i) / ((float) this.f1304c) : 0.0f) + (((float) i3) / ((float) i2));
        }
    }

    /* renamed from: android.support.v7.c.a.a$f */
    private static abstract class C0428f {
        private C0428f() {
        }

        /* renamed from: a */
        public abstract void mo1773a();

        /* renamed from: b */
        public abstract void mo1774b();

        /* renamed from: c */
        public boolean mo1785c() {
            return false;
        }

        /* renamed from: d */
        public void mo1786d() {
        }
    }

    public C0421a() {
        this((C0424b) null, (Resources) null);
    }

    C0421a(C0424b bVar, Resources resources) {
        super((C0434d.C0435a) null);
        this.f1293d = -1;
        this.f1294e = -1;
        mo1737a((C0429b.C0432b) new C0424b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    public static C0421a m1953a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        C0421a aVar = new C0421a();
        aVar.mo1740b(context, resources, xmlPullParser, attributeSet, theme);
        return aVar;
    }

    /* renamed from: a */
    private void m1954a(TypedArray typedArray) {
        C0424b bVar = this.f1291b;
        if (Build.VERSION.SDK_INT >= 21) {
            bVar.f1334f |= typedArray.getChangingConfigurations();
        }
        bVar.mo1806a(typedArray.getBoolean(C0353a.C0363j.AnimatedStateListDrawableCompat_android_variablePadding, bVar.f1339k));
        bVar.mo1809b(typedArray.getBoolean(C0353a.C0363j.AnimatedStateListDrawableCompat_android_constantSize, bVar.f1342n));
        bVar.mo1811c(typedArray.getInt(C0353a.C0363j.AnimatedStateListDrawableCompat_android_enterFadeDuration, bVar.f1322C));
        bVar.mo1814d(typedArray.getInt(C0353a.C0363j.AnimatedStateListDrawableCompat_android_exitFadeDuration, bVar.f1323D));
        setDither(typedArray.getBoolean(C0353a.C0363j.AnimatedStateListDrawableCompat_android_dither, bVar.f1354z));
    }

    /* renamed from: b */
    private boolean m1955b(int i) {
        int d;
        C0428f aVar;
        C0428f fVar = this.f1292c;
        if (fVar == null) {
            d = mo1793d();
        } else if (i == this.f1293d) {
            return true;
        } else {
            if (i != this.f1294e || !fVar.mo1785c()) {
                int i2 = this.f1293d;
                fVar.mo1774b();
                d = i2;
            } else {
                fVar.mo1786d();
                this.f1293d = this.f1294e;
                this.f1294e = i;
                return true;
            }
        }
        this.f1292c = null;
        this.f1294e = -1;
        this.f1293d = -1;
        C0424b bVar = this.f1291b;
        int a = bVar.mo1775a(d);
        int a2 = bVar.mo1775a(i);
        if (a2 == 0 || a == 0) {
            return false;
        }
        int a3 = bVar.mo1776a(a, a2);
        if (a3 < 0) {
            return false;
        }
        boolean c = bVar.mo1782c(a, a2);
        mo1792a(a3);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            aVar = new C0426d((AnimationDrawable) current, bVar.mo1781b(a, a2), c);
        } else if (current instanceof C0048c) {
            aVar = new C0425c((C0048c) current);
        } else if (!(current instanceof Animatable)) {
            return false;
        } else {
            aVar = new C0423a((Animatable) current);
        }
        aVar.mo1773a();
        this.f1292c = aVar;
        this.f1294e = d;
        this.f1293d = i;
        return true;
    }

    /* renamed from: c */
    private void m1956c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m1958e(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m1957d(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private int m1957d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0353a.C0363j.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C0353a.C0363j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C0353a.C0363j.AnimatedStateListDrawableTransition_android_toId, -1);
        Drawable drawable = null;
        int resourceId3 = a.getResourceId(C0353a.C0363j.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (resourceId3 > 0) {
            drawable = C0419a.m1949b(context, resourceId3);
        }
        boolean z = a.getBoolean(C0353a.C0363j.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawable = xmlPullParser.getName().equals("animated-vector") ? C0048c.m132a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f1291b.mo1777a(resourceId, resourceId2, drawable, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: e */
    private int m1958e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0353a.C0363j.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C0353a.C0363j.AnimatedStateListDrawableItem_android_id, 0);
        Drawable drawable = null;
        int resourceId2 = a.getResourceId(C0353a.C0363j.AnimatedStateListDrawableItem_android_drawable, -1);
        if (resourceId2 > 0) {
            drawable = C0419a.m1949b(context, resourceId2);
        }
        a.recycle();
        int[] a2 = mo1862a(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawable = xmlPullParser.getName().equals("vector") ? C0058i.m166a(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawable != null) {
            return this.f1291b.mo1779a(a2, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: e */
    private void m1959e() {
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0424b mo1741c() {
        return new C0424b(this.f1291b, this, (Resources) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1737a(C0429b.C0432b bVar) {
        super.mo1737a(bVar);
        if (bVar instanceof C0424b) {
            this.f1291b = (C0424b) bVar;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* renamed from: b */
    public void mo1740b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0353a.C0363j.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C0353a.C0363j.AnimatedStateListDrawableCompat_android_visible, true), true);
        m1954a(a);
        mo1790a(resources);
        a.recycle();
        m1956c(context, resources, xmlPullParser, attributeSet, theme);
        m1959e();
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if (this.f1292c != null) {
            this.f1292c.mo1774b();
            this.f1292c = null;
            mo1792a(this.f1293d);
            this.f1293d = -1;
            this.f1294e = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f1295f && super.mutate() == this) {
            this.f1291b.mo1780a();
            this.f1295f = true;
        }
        return this;
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int a = this.f1291b.mo1778a(iArr);
        boolean z = a != mo1793d() && (m1955b(a) || mo1792a(a));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f1292c != null && (visible || z2)) {
            if (z) {
                this.f1292c.mo1773a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
