package android.support.p018v7.p022c.p023a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.p007a.p008a.C0083g;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.support.p018v7.p022c.p023a.C0429b;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.c.a.d */
class C0434d extends C0429b {

    /* renamed from: a */
    private C0435a f1356a;

    /* renamed from: b */
    private boolean f1357b;

    /* renamed from: android.support.v7.c.a.d$a */
    static class C0435a extends C0429b.C0432b {

        /* renamed from: L */
        int[][] f1358L;

        C0435a(C0435a aVar, C0434d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f1358L = aVar.f1358L;
            } else {
                this.f1358L = new int[mo1810c()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo1863a(int[] iArr, Drawable drawable) {
            int a = mo1803a(drawable);
            this.f1358L[a] = iArr;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1780a() {
            int[][] iArr = new int[this.f1358L.length][];
            for (int length = this.f1358L.length - 1; length >= 0; length--) {
                iArr[length] = this.f1358L[length] != null ? (int[]) this.f1358L[length].clone() : null;
            }
            this.f1358L = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo1864b(int[] iArr) {
            int[][] iArr2 = this.f1358L;
            int d = mo1813d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: e */
        public void mo1817e(int i, int i2) {
            super.mo1817e(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f1358L, 0, iArr, 0, i);
            this.f1358L = iArr;
        }

        public Drawable newDrawable() {
            return new C0434d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0434d(this, resources);
        }
    }

    C0434d() {
        this((C0435a) null, (Resources) null);
    }

    C0434d(C0435a aVar) {
        if (aVar != null) {
            mo1737a((C0429b.C0432b) aVar);
        }
    }

    C0434d(C0435a aVar, Resources resources) {
        mo1737a((C0429b.C0432b) new C0435a(aVar, this, resources));
        onStateChange(getState());
    }

    /* renamed from: a */
    private void m2027a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        C0435a aVar = this.f1356a;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0353a.C0363j.StateListDrawableItem);
                    Drawable drawable = null;
                    int resourceId = a.getResourceId(C0353a.C0363j.StateListDrawableItem_android_drawable, -1);
                    if (resourceId > 0) {
                        drawable = C0419a.m1949b(context, resourceId);
                    }
                    a.recycle();
                    int[] a2 = mo1862a(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or " + "child tag defining a drawable");
                        }
                        drawable = Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                    }
                    aVar.mo1863a(a2, drawable);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m2028a(TypedArray typedArray) {
        C0435a aVar = this.f1356a;
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.f1334f |= typedArray.getChangingConfigurations();
        }
        aVar.f1339k = typedArray.getBoolean(C0353a.C0363j.StateListDrawable_android_variablePadding, aVar.f1339k);
        aVar.f1342n = typedArray.getBoolean(C0353a.C0363j.StateListDrawable_android_constantSize, aVar.f1342n);
        aVar.f1322C = typedArray.getInt(C0353a.C0363j.StateListDrawable_android_enterFadeDuration, aVar.f1322C);
        aVar.f1323D = typedArray.getInt(C0353a.C0363j.StateListDrawable_android_exitFadeDuration, aVar.f1323D);
        aVar.f1354z = typedArray.getBoolean(C0353a.C0363j.StateListDrawable_android_dither, aVar.f1354z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1737a(C0429b.C0432b bVar) {
        super.mo1737a(bVar);
        if (bVar instanceof C0435a) {
            this.f1356a = (C0435a) bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo1862a(AttributeSet attributeSet) {
        int i;
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i2 = 0;
        int i3 = 0;
        while (i2 < attributeCount) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            switch (attributeNameResource) {
                case 0:
                    i = i3;
                    break;
                case 16842960:
                case 16843161:
                    i = i3;
                    break;
                default:
                    int i4 = i3 + 1;
                    if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                        attributeNameResource = -attributeNameResource;
                    }
                    iArr[i3] = attributeNameResource;
                    i = i4;
                    break;
            }
            i2++;
            i3 = i;
        }
        return StateSet.trimStateSet(iArr, i3);
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0435a mo1741c() {
        return new C0435a(this.f1356a, this, (Resources) null);
    }

    /* renamed from: b */
    public void mo1740b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0353a.C0363j.StateListDrawable);
        setVisible(a.getBoolean(C0353a.C0363j.StateListDrawable_android_visible, true), true);
        m2028a(a);
        mo1790a(resources);
        a.recycle();
        m2027a(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f1357b && super.mutate() == this) {
            this.f1356a.mo1780a();
            this.f1357b = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.f1356a.mo1864b(iArr);
        if (b < 0) {
            b = this.f1356a.mo1864b(StateSet.WILD_CARD);
        }
        return mo1792a(b) || onStateChange;
    }
}
