package android.support.p006v4.p007a.p008a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.p003a.C0042a;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.a.a.a */
public final class C0069a {
    /* renamed from: a */
    private static int m211a(int i, float f) {
        return (Math.round(((float) Color.alpha(i)) * f) << 24) | (16777215 & i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m212a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            r3 = 2
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0005:
            int r1 = r5.next()
            if (r1 == r3) goto L_0x000e
            r2 = 1
            if (r1 != r2) goto L_0x0005
        L_0x000e:
            if (r1 == r3) goto L_0x0018
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        L_0x0018:
            android.content.res.ColorStateList r0 = m213a((android.content.res.Resources) r4, (org.xmlpull.v1.XmlPullParser) r5, (android.util.AttributeSet) r0, (android.content.res.Resources.Theme) r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.p007a.p008a.C0069a.m212a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    public static ColorStateList m213a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m215b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: a */
    private static TypedArray m214a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: b */
    private static ColorStateList m215b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int i;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                int[] iArr3 = new int[i2];
                int[][] iArr4 = new int[i2][];
                System.arraycopy(iArr2, 0, iArr3, 0, i2);
                System.arraycopy(iArr, 0, iArr4, 0, i2);
            } else if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray a = m214a(resources, theme, attributeSet, C0042a.C0045c.ColorStateListItem);
                int color = a.getColor(C0042a.C0045c.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (a.hasValue(C0042a.C0045c.ColorStateListItem_android_alpha)) {
                    f = a.getFloat(C0042a.C0045c.ColorStateListItem_android_alpha, 1.0f);
                } else if (a.hasValue(C0042a.C0045c.ColorStateListItem_alpha)) {
                    f = a.getFloat(C0042a.C0045c.ColorStateListItem_alpha, 1.0f);
                }
                a.recycle();
                int i3 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr5 = new int[attributeCount];
                int i4 = 0;
                while (i4 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C0042a.C0043a.alpha) {
                        i = i3;
                    } else {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr5[i3] = attributeNameResource;
                        i = i5;
                    }
                    i4++;
                    i3 = i;
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr5, i3);
                int a2 = m211a(color, f);
                if (i2 == 0 || trimStateSet.length == 0) {
                }
                iArr2 = C0078e.m251a(iArr2, i2, a2);
                i2++;
                iArr = (int[][]) C0078e.m252a((T[]) iArr, i2, trimStateSet);
            }
        }
        int[] iArr32 = new int[i2];
        int[][] iArr42 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr32, 0, i2);
        System.arraycopy(iArr, 0, iArr42, 0, i2);
        return new ColorStateList(iArr42, iArr32);
    }
}
