package android.support.p006v4.p007a.p008a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p003a.C0042a;
import android.support.p006v4.p012d.C0181a;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.a.a.c */
public class C0071c {

    /* renamed from: android.support.v4.a.a.c$a */
    public interface C0072a {
    }

    /* renamed from: android.support.v4.a.a.c$b */
    public static final class C0073b implements C0072a {

        /* renamed from: a */
        private final C0074c[] f180a;

        public C0073b(C0074c[] cVarArr) {
            this.f180a = cVarArr;
        }

        /* renamed from: a */
        public C0074c[] mo244a() {
            return this.f180a;
        }
    }

    /* renamed from: android.support.v4.a.a.c$c */
    public static final class C0074c {

        /* renamed from: a */
        private final String f181a;

        /* renamed from: b */
        private int f182b;

        /* renamed from: c */
        private boolean f183c;

        /* renamed from: d */
        private String f184d;

        /* renamed from: e */
        private int f185e;

        /* renamed from: f */
        private int f186f;

        public C0074c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f181a = str;
            this.f182b = i;
            this.f183c = z;
            this.f184d = str2;
            this.f185e = i2;
            this.f186f = i3;
        }

        /* renamed from: a */
        public String mo245a() {
            return this.f181a;
        }

        /* renamed from: b */
        public int mo246b() {
            return this.f182b;
        }

        /* renamed from: c */
        public boolean mo247c() {
            return this.f183c;
        }

        /* renamed from: d */
        public String mo248d() {
            return this.f184d;
        }

        /* renamed from: e */
        public int mo249e() {
            return this.f185e;
        }

        /* renamed from: f */
        public int mo250f() {
            return this.f186f;
        }
    }

    /* renamed from: android.support.v4.a.a.c$d */
    public static final class C0075d implements C0072a {

        /* renamed from: a */
        private final C0181a f187a;

        /* renamed from: b */
        private final int f188b;

        /* renamed from: c */
        private final int f189c;

        public C0075d(C0181a aVar, int i, int i2) {
            this.f187a = aVar;
            this.f189c = i;
            this.f188b = i2;
        }

        /* renamed from: a */
        public C0181a mo251a() {
            return this.f187a;
        }

        /* renamed from: b */
        public int mo252b() {
            return this.f189c;
        }

        /* renamed from: c */
        public int mo253c() {
            return this.f188b;
        }
    }

    /* renamed from: a */
    private static int m228a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p006v4.p007a.p008a.C0071c.C0072a m229a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
            r2 = 2
        L_0x0001:
            int r0 = r3.next()
            if (r0 == r2) goto L_0x000a
            r1 = 1
            if (r0 != r1) goto L_0x0001
        L_0x000a:
            if (r0 == r2) goto L_0x0014
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        L_0x0014:
            android.support.v4.a.a.c$a r0 = m233b(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.p007a.p008a.C0071c.m229a(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):android.support.v4.a.a.c$a");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m230a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m228a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m231a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m231a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m231a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m232a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* renamed from: b */
    private static C0072a m233b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m234c(xmlPullParser, resources);
        }
        m232a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0072a m234c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0042a.C0045c.FontFamily);
        String string = obtainAttributes.getString(C0042a.C0045c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0042a.C0045c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0042a.C0045c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0042a.C0045c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0042a.C0045c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0042a.C0045c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m235d(xmlPullParser, resources));
                    } else {
                        m232a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0073b((C0074c[]) arrayList.toArray(new C0074c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m232a(xmlPullParser);
        }
        return new C0075d(new C0181a(string, string2, string3, m230a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0074c m235d(XmlPullParser xmlPullParser, Resources resources) {
        boolean z = true;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0042a.C0045c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0042a.C0045c.FontFamilyFont_fontWeight) ? C0042a.C0045c.FontFamilyFont_fontWeight : C0042a.C0045c.FontFamilyFont_android_fontWeight, 400);
        if (1 != obtainAttributes.getInt(obtainAttributes.hasValue(C0042a.C0045c.FontFamilyFont_fontStyle) ? C0042a.C0045c.FontFamilyFont_fontStyle : C0042a.C0045c.FontFamilyFont_android_fontStyle, 0)) {
            z = false;
        }
        int i2 = obtainAttributes.hasValue(C0042a.C0045c.FontFamilyFont_ttcIndex) ? C0042a.C0045c.FontFamilyFont_ttcIndex : C0042a.C0045c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0042a.C0045c.FontFamilyFont_fontVariationSettings) ? C0042a.C0045c.FontFamilyFont_fontVariationSettings : C0042a.C0045c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0042a.C0045c.FontFamilyFont_font) ? C0042a.C0045c.FontFamilyFont_font : C0042a.C0045c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m232a(xmlPullParser);
        }
        return new C0074c(string2, i, z, string, i3, resourceId);
    }
}
