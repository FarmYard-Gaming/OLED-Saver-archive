package android.support.p006v4.p007a.p008a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.a.a.g */
public class C0083g {
    /* renamed from: a */
    public static float m261a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m267a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m262a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m267a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static TypedArray m263a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static C0070b m264a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m267a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0070b.m216a(typedValue.data);
            }
            C0070b a = C0070b.m218a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (a != null) {
                return a;
            }
        }
        return C0070b.m216a(i2);
    }

    /* renamed from: a */
    public static String m265a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m267a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static boolean m266a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m267a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m267a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m268b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m267a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m269b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m267a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static int m270c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m267a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
