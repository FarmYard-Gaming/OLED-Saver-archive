package android.support.p004b.p005a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p006v4.graphics.C0265b;
import android.support.p006v4.p007a.p008a.C0083g;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.b.a.g */
public class C0056g implements Interpolator {

    /* renamed from: a */
    private float[] f103a;

    /* renamed from: b */
    private float[] f104b;

    public C0056g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C0056g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f87l);
        m161a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m159a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m162a(path);
    }

    /* renamed from: a */
    private void m160a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m162a(path);
    }

    /* renamed from: a */
    private void m161a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0083g.m267a(xmlPullParser, "pathData")) {
            String a = C0083g.m265a(typedArray, xmlPullParser, "pathData", 4);
            Path a2 = C0265b.m1124a(a);
            if (a2 == null) {
                throw new InflateException("The path is null, which is created from " + a);
            }
            m162a(a2);
        } else if (!C0083g.m267a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (!C0083g.m267a(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            float a3 = C0083g.m261a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = C0083g.m261a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = C0083g.m267a(xmlPullParser, "controlX2");
            if (a5 != C0083g.m267a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a5) {
                m159a(a3, a4);
            } else {
                m160a(a3, a4, C0083g.m261a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0083g.m261a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        }
    }

    /* renamed from: a */
    private void m162a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f103a = new float[min];
        this.f104b = new float[min];
        float[] fArr = new float[2];
        for (int i = 0; i < min; i++) {
            pathMeasure.getPosTan((((float) i) * length) / ((float) (min - 1)), fArr, (float[]) null);
            this.f103a[i] = fArr[0];
            this.f104b[i] = fArr[1];
        }
        if (((double) Math.abs(this.f103a[0])) > 1.0E-5d || ((double) Math.abs(this.f104b[0])) > 1.0E-5d || ((double) Math.abs(this.f103a[min - 1] - 1.0f)) > 1.0E-5d || ((double) Math.abs(this.f104b[min - 1] - 1.0f)) > 1.0E-5d) {
            throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.f103a[0] + "," + this.f104b[0] + " end:" + this.f103a[min - 1] + "," + this.f104b[min - 1]);
        }
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        while (i2 < min) {
            int i4 = i3 + 1;
            float f2 = this.f103a[i3];
            if (f2 < f) {
                throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
            }
            this.f103a[i2] = f2;
            i2++;
            i3 = i4;
            f = f2;
        }
        if (pathMeasure.nextContour()) {
            throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f103a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f103a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f103a[length] - this.f103a[i];
        if (f2 == 0.0f) {
            return this.f104b[i];
        }
        float f3 = (f - this.f103a[i]) / f2;
        float f4 = this.f104b[i];
        return ((this.f104b[length] - f4) * f3) + f4;
    }
}
