package android.support.p006v4.p007a.p008a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.a.a.b */
public final class C0070b {

    /* renamed from: a */
    private final Shader f177a;

    /* renamed from: b */
    private final ColorStateList f178b;

    /* renamed from: c */
    private int f179c;

    private C0070b(Shader shader, ColorStateList colorStateList, int i) {
        this.f177a = shader;
        this.f178b = colorStateList;
        this.f179c = i;
    }

    /* renamed from: a */
    static C0070b m216a(int i) {
        return new C0070b((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: a */
    static C0070b m217a(ColorStateList colorStateList) {
        return new C0070b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    public static C0070b m218a(Resources resources, int i, Resources.Theme theme) {
        try {
            return m220b(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a */
    static C0070b m219a(Shader shader) {
        return new C0070b(shader, (ColorStateList) null, 0);
    }

    /* renamed from: b */
    private static C0070b m220b(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        char c = 65535;
        switch (name.hashCode()) {
            case 89650992:
                if (name.equals("gradient")) {
                    c = 1;
                    break;
                }
                break;
            case 1191572447:
                if (name.equals("selector")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return m217a(C0069a.m213a(resources, (XmlPullParser) xml, asAttributeSet, theme));
            case 1:
                return m219a(C0076d.m247a(resources, xml, asAttributeSet, theme));
            default:
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
    }

    /* renamed from: a */
    public Shader mo237a() {
        return this.f177a;
    }

    /* renamed from: a */
    public boolean mo238a(int[] iArr) {
        int colorForState;
        if (!mo242d() || (colorForState = this.f178b.getColorForState(iArr, this.f178b.getDefaultColor())) == this.f179c) {
            return false;
        }
        this.f179c = colorForState;
        return true;
    }

    /* renamed from: b */
    public int mo239b() {
        return this.f179c;
    }

    /* renamed from: b */
    public void mo240b(int i) {
        this.f179c = i;
    }

    /* renamed from: c */
    public boolean mo241c() {
        return this.f177a != null;
    }

    /* renamed from: d */
    public boolean mo242d() {
        return this.f177a == null && this.f178b != null && this.f178b.isStateful();
    }

    /* renamed from: e */
    public boolean mo243e() {
        return mo241c() || this.f179c != 0;
    }
}
