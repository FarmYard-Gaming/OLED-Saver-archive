package android.support.p006v4.p007a.p008a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.p003a.C0042a;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.a.a.d */
final class C0076d {

    /* renamed from: android.support.v4.a.a.d$a */
    static final class C0077a {

        /* renamed from: a */
        final int[] f190a;

        /* renamed from: b */
        final float[] f191b;

        C0077a(int i, int i2) {
            this.f190a = new int[]{i, i2};
            this.f191b = new float[]{0.0f, 1.0f};
        }

        C0077a(int i, int i2, int i3) {
            this.f190a = new int[]{i, i2, i3};
            this.f191b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C0077a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f190a = new int[size];
            this.f191b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f190a[i] = list.get(i).intValue();
                this.f191b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static Shader.TileMode m246a(int i) {
        switch (i) {
            case 1:
                return Shader.TileMode.REPEAT;
            case 2:
                return Shader.TileMode.MIRROR;
            default:
                return Shader.TileMode.CLAMP;
        }
    }

    /* renamed from: a */
    static Shader m247a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0042a.C0045c.GradientColor);
        float a2 = C0083g.m261a(a, xmlPullParser, "startX", C0042a.C0045c.GradientColor_android_startX, 0.0f);
        float a3 = C0083g.m261a(a, xmlPullParser, "startY", C0042a.C0045c.GradientColor_android_startY, 0.0f);
        float a4 = C0083g.m261a(a, xmlPullParser, "endX", C0042a.C0045c.GradientColor_android_endX, 0.0f);
        float a5 = C0083g.m261a(a, xmlPullParser, "endY", C0042a.C0045c.GradientColor_android_endY, 0.0f);
        float a6 = C0083g.m261a(a, xmlPullParser, "centerX", C0042a.C0045c.GradientColor_android_centerX, 0.0f);
        float a7 = C0083g.m261a(a, xmlPullParser, "centerY", C0042a.C0045c.GradientColor_android_centerY, 0.0f);
        int a8 = C0083g.m262a(a, xmlPullParser, "type", C0042a.C0045c.GradientColor_android_type, 0);
        int b = C0083g.m268b(a, xmlPullParser, "startColor", C0042a.C0045c.GradientColor_android_startColor, 0);
        boolean a9 = C0083g.m267a(xmlPullParser, "centerColor");
        int b2 = C0083g.m268b(a, xmlPullParser, "centerColor", C0042a.C0045c.GradientColor_android_centerColor, 0);
        int b3 = C0083g.m268b(a, xmlPullParser, "endColor", C0042a.C0045c.GradientColor_android_endColor, 0);
        int a10 = C0083g.m262a(a, xmlPullParser, "tileMode", C0042a.C0045c.GradientColor_android_tileMode, 0);
        float a11 = C0083g.m261a(a, xmlPullParser, "gradientRadius", C0042a.C0045c.GradientColor_android_gradientRadius, 0.0f);
        a.recycle();
        C0077a a12 = m248a(m249b(resources, xmlPullParser, attributeSet, theme), b, b3, a9, b2);
        switch (a8) {
            case 1:
                if (a11 > 0.0f) {
                    return new RadialGradient(a6, a7, a11, a12.f190a, a12.f191b, m246a(a10));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            case 2:
                return new SweepGradient(a6, a7, a12.f190a, a12.f191b);
            default:
                return new LinearGradient(a2, a3, a4, a5, a12.f190a, a12.f191b, m246a(a10));
        }
    }

    /* renamed from: a */
    private static C0077a m248a(C0077a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new C0077a(i, i3, i2) : new C0077a(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r8.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' " + "attribute!");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p006v4.p007a.p008a.C0076d.C0077a m249b(android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, android.content.res.Resources.Theme r10) {
        /*
            r3 = 20
            int r0 = r8.getDepth()
            int r0 = r0 + 1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
        L_0x0012:
            int r3 = r8.next()
            r4 = 1
            if (r3 == r4) goto L_0x008c
            int r4 = r8.getDepth()
            if (r4 >= r0) goto L_0x0022
            r5 = 3
            if (r3 == r5) goto L_0x008c
        L_0x0022:
            r5 = 2
            if (r3 != r5) goto L_0x0012
            if (r4 > r0) goto L_0x0012
            java.lang.String r3 = r8.getName()
            java.lang.String r4 = "item"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0012
            int[] r3 = android.support.p003a.C0042a.C0045c.GradientColorItem
            android.content.res.TypedArray r3 = android.support.p006v4.p007a.p008a.C0083g.m263a((android.content.res.Resources) r7, (android.content.res.Resources.Theme) r10, (android.util.AttributeSet) r9, (int[]) r3)
            int r4 = android.support.p003a.C0042a.C0045c.GradientColorItem_android_color
            boolean r4 = r3.hasValue(r4)
            int r5 = android.support.p003a.C0042a.C0045c.GradientColorItem_android_offset
            boolean r5 = r3.hasValue(r5)
            if (r4 == 0) goto L_0x0049
            if (r5 != 0) goto L_0x006c
        L_0x0049:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.getPositionDescription()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "attribute!"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006c:
            int r4 = android.support.p003a.C0042a.C0045c.GradientColorItem_android_color
            r5 = 0
            int r4 = r3.getColor(r4, r5)
            int r5 = android.support.p003a.C0042a.C0045c.GradientColorItem_android_offset
            r6 = 0
            float r5 = r3.getFloat(r5, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r5)
            r1.add(r3)
            goto L_0x0012
        L_0x008c:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0098
            android.support.v4.a.a.d$a r0 = new android.support.v4.a.a.d$a
            r0.<init>((java.util.List<java.lang.Integer>) r2, (java.util.List<java.lang.Float>) r1)
        L_0x0097:
            return r0
        L_0x0098:
            r0 = 0
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.p007a.p008a.C0076d.m249b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.support.v4.a.a.d$a");
    }
}
