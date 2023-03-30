package android.support.p004b.p005a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.p006v4.graphics.C0265b;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.p007a.p008a.C0070b;
import android.support.p006v4.p007a.p008a.C0083g;
import android.support.p006v4.p014f.C0199a;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.b.a.i */
public class C0058i extends C0057h {

    /* renamed from: a */
    static final PorterDuff.Mode f106a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private C0066g f107b;

    /* renamed from: d */
    private PorterDuffColorFilter f108d;

    /* renamed from: e */
    private ColorFilter f109e;

    /* renamed from: f */
    private boolean f110f;

    /* renamed from: g */
    private boolean f111g;

    /* renamed from: h */
    private Drawable.ConstantState f112h;

    /* renamed from: i */
    private final float[] f113i;

    /* renamed from: j */
    private final Matrix f114j;

    /* renamed from: k */
    private final Rect f115k;

    /* renamed from: android.support.b.a.i$a */
    private static class C0060a extends C0064e {
        public C0060a() {
        }

        public C0060a(C0060a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private void m173a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f143n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f142m = C0265b.m1131b(string2);
            }
        }

        /* renamed from: a */
        public void mo170a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0083g.m267a(xmlPullParser, "pathData")) {
                TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f79d);
                m173a(a);
                a.recycle();
            }
        }

        /* renamed from: a */
        public boolean mo171a() {
            return true;
        }
    }

    /* renamed from: android.support.b.a.i$b */
    private static class C0061b extends C0064e {

        /* renamed from: a */
        C0070b f116a;

        /* renamed from: b */
        float f117b = 0.0f;

        /* renamed from: c */
        C0070b f118c;

        /* renamed from: d */
        float f119d = 1.0f;

        /* renamed from: e */
        int f120e = 0;

        /* renamed from: f */
        float f121f = 1.0f;

        /* renamed from: g */
        float f122g = 0.0f;

        /* renamed from: h */
        float f123h = 1.0f;

        /* renamed from: i */
        float f124i = 0.0f;

        /* renamed from: j */
        Paint.Cap f125j = Paint.Cap.BUTT;

        /* renamed from: k */
        Paint.Join f126k = Paint.Join.MITER;

        /* renamed from: l */
        float f127l = 4.0f;

        /* renamed from: p */
        private int[] f128p;

        public C0061b() {
        }

        public C0061b(C0061b bVar) {
            super(bVar);
            this.f128p = bVar.f128p;
            this.f116a = bVar.f116a;
            this.f117b = bVar.f117b;
            this.f119d = bVar.f119d;
            this.f118c = bVar.f118c;
            this.f120e = bVar.f120e;
            this.f121f = bVar.f121f;
            this.f122g = bVar.f122g;
            this.f123h = bVar.f123h;
            this.f124i = bVar.f124i;
            this.f125j = bVar.f125j;
            this.f126k = bVar.f126k;
            this.f127l = bVar.f127l;
        }

        /* renamed from: a */
        private Paint.Cap m176a(int i, Paint.Cap cap) {
            switch (i) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Paint.Join m177a(int i, Paint.Join join) {
            switch (i) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        private void m178a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f128p = null;
            if (C0083g.m267a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f143n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f142m = C0265b.m1131b(string2);
                }
                this.f118c = C0083g.m264a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f121f = C0083g.m261a(typedArray, xmlPullParser, "fillAlpha", 12, this.f121f);
                this.f125j = m176a(C0083g.m262a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f125j);
                this.f126k = m177a(C0083g.m262a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f126k);
                this.f127l = C0083g.m261a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f127l);
                this.f116a = C0083g.m264a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f119d = C0083g.m261a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f119d);
                this.f117b = C0083g.m261a(typedArray, xmlPullParser, "strokeWidth", 4, this.f117b);
                this.f123h = C0083g.m261a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f123h);
                this.f124i = C0083g.m261a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f124i);
                this.f122g = C0083g.m261a(typedArray, xmlPullParser, "trimPathStart", 5, this.f122g);
                this.f120e = C0083g.m262a(typedArray, xmlPullParser, "fillType", 13, this.f120e);
            }
        }

        /* renamed from: a */
        public void mo172a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f78c);
            m178a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        public boolean mo173a(int[] iArr) {
            return this.f118c.mo238a(iArr) | this.f116a.mo238a(iArr);
        }

        /* renamed from: b */
        public boolean mo174b() {
            return this.f118c.mo242d() || this.f116a.mo242d();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f121f;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f118c.mo239b();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f119d;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f116a.mo239b();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f117b;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f123h;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f124i;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f122g;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f121f = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f118c.mo240b(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f119d = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f116a.mo240b(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f117b = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f123h = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f124i = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f122g = f;
        }
    }

    /* renamed from: android.support.b.a.i$c */
    private static class C0062c extends C0063d {

        /* renamed from: a */
        final Matrix f129a = new Matrix();

        /* renamed from: b */
        final ArrayList<C0063d> f130b = new ArrayList<>();

        /* renamed from: c */
        float f131c = 0.0f;

        /* renamed from: d */
        final Matrix f132d = new Matrix();

        /* renamed from: e */
        int f133e;

        /* renamed from: f */
        private float f134f = 0.0f;

        /* renamed from: g */
        private float f135g = 0.0f;

        /* renamed from: h */
        private float f136h = 1.0f;

        /* renamed from: i */
        private float f137i = 1.0f;

        /* renamed from: j */
        private float f138j = 0.0f;

        /* renamed from: k */
        private float f139k = 0.0f;

        /* renamed from: l */
        private int[] f140l;

        /* renamed from: m */
        private String f141m = null;

        public C0062c() {
            super();
        }

        public C0062c(C0062c cVar, C0199a<String, Object> aVar) {
            super();
            C0064e aVar2;
            this.f131c = cVar.f131c;
            this.f134f = cVar.f134f;
            this.f135g = cVar.f135g;
            this.f136h = cVar.f136h;
            this.f137i = cVar.f137i;
            this.f138j = cVar.f138j;
            this.f139k = cVar.f139k;
            this.f140l = cVar.f140l;
            this.f141m = cVar.f141m;
            this.f133e = cVar.f133e;
            if (this.f141m != null) {
                aVar.put(this.f141m, this);
            }
            this.f132d.set(cVar.f132d);
            ArrayList<C0063d> arrayList = cVar.f130b;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    C0063d dVar = arrayList.get(i2);
                    if (dVar instanceof C0062c) {
                        this.f130b.add(new C0062c((C0062c) dVar, aVar));
                    } else {
                        if (dVar instanceof C0061b) {
                            aVar2 = new C0061b((C0061b) dVar);
                        } else if (dVar instanceof C0060a) {
                            aVar2 = new C0060a((C0060a) dVar);
                        } else {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        this.f130b.add(aVar2);
                        if (aVar2.f143n != null) {
                            aVar.put(aVar2.f143n, aVar2);
                        }
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        private void m182a() {
            this.f132d.reset();
            this.f132d.postTranslate(-this.f134f, -this.f135g);
            this.f132d.postScale(this.f136h, this.f137i);
            this.f132d.postRotate(this.f131c, 0.0f, 0.0f);
            this.f132d.postTranslate(this.f138j + this.f134f, this.f139k + this.f135g);
        }

        /* renamed from: a */
        private void m183a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f140l = null;
            this.f131c = C0083g.m261a(typedArray, xmlPullParser, "rotation", 5, this.f131c);
            this.f134f = typedArray.getFloat(1, this.f134f);
            this.f135g = typedArray.getFloat(2, this.f135g);
            this.f136h = C0083g.m261a(typedArray, xmlPullParser, "scaleX", 3, this.f136h);
            this.f137i = C0083g.m261a(typedArray, xmlPullParser, "scaleY", 4, this.f137i);
            this.f138j = C0083g.m261a(typedArray, xmlPullParser, "translateX", 6, this.f138j);
            this.f139k = C0083g.m261a(typedArray, xmlPullParser, "translateY", 7, this.f139k);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f141m = string;
            }
            m182a();
        }

        /* renamed from: a */
        public void mo191a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f77b);
            m183a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        public boolean mo173a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f130b.size(); i++) {
                z |= this.f130b.get(i).mo173a(iArr);
            }
            return z;
        }

        /* renamed from: b */
        public boolean mo174b() {
            for (int i = 0; i < this.f130b.size(); i++) {
                if (this.f130b.get(i).mo174b()) {
                    return true;
                }
            }
            return false;
        }

        public String getGroupName() {
            return this.f141m;
        }

        public Matrix getLocalMatrix() {
            return this.f132d;
        }

        public float getPivotX() {
            return this.f134f;
        }

        public float getPivotY() {
            return this.f135g;
        }

        public float getRotation() {
            return this.f131c;
        }

        public float getScaleX() {
            return this.f136h;
        }

        public float getScaleY() {
            return this.f137i;
        }

        public float getTranslateX() {
            return this.f138j;
        }

        public float getTranslateY() {
            return this.f139k;
        }

        public void setPivotX(float f) {
            if (f != this.f134f) {
                this.f134f = f;
                m182a();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f135g) {
                this.f135g = f;
                m182a();
            }
        }

        public void setRotation(float f) {
            if (f != this.f131c) {
                this.f131c = f;
                m182a();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f136h) {
                this.f136h = f;
                m182a();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f137i) {
                this.f137i = f;
                m182a();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f138j) {
                this.f138j = f;
                m182a();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f139k) {
                this.f139k = f;
                m182a();
            }
        }
    }

    /* renamed from: android.support.b.a.i$d */
    private static abstract class C0063d {
        private C0063d() {
        }

        /* renamed from: a */
        public boolean mo173a(int[] iArr) {
            return false;
        }

        /* renamed from: b */
        public boolean mo174b() {
            return false;
        }
    }

    /* renamed from: android.support.b.a.i$e */
    private static abstract class C0064e extends C0063d {

        /* renamed from: m */
        protected C0265b.C0267b[] f142m = null;

        /* renamed from: n */
        String f143n;

        /* renamed from: o */
        int f144o;

        public C0064e() {
            super();
        }

        public C0064e(C0064e eVar) {
            super();
            this.f143n = eVar.f143n;
            this.f144o = eVar.f144o;
            this.f142m = C0265b.m1129a(eVar.f142m);
        }

        /* renamed from: a */
        public void mo208a(Path path) {
            path.reset();
            if (this.f142m != null) {
                C0265b.C0267b.m1136a(this.f142m, path);
            }
        }

        /* renamed from: a */
        public boolean mo171a() {
            return false;
        }

        public C0265b.C0267b[] getPathData() {
            return this.f142m;
        }

        public String getPathName() {
            return this.f143n;
        }

        public void setPathData(C0265b.C0267b[] bVarArr) {
            if (!C0265b.m1127a(this.f142m, bVarArr)) {
                this.f142m = C0265b.m1129a(bVarArr);
            } else {
                C0265b.m1130b(this.f142m, bVarArr);
            }
        }
    }

    /* renamed from: android.support.b.a.i$f */
    private static class C0065f {

        /* renamed from: n */
        private static final Matrix f145n = new Matrix();

        /* renamed from: a */
        Paint f146a;

        /* renamed from: b */
        Paint f147b;

        /* renamed from: c */
        final C0062c f148c;

        /* renamed from: d */
        float f149d;

        /* renamed from: e */
        float f150e;

        /* renamed from: f */
        float f151f;

        /* renamed from: g */
        float f152g;

        /* renamed from: h */
        int f153h;

        /* renamed from: i */
        String f154i;

        /* renamed from: j */
        Boolean f155j;

        /* renamed from: k */
        final C0199a<String, Object> f156k;

        /* renamed from: l */
        private final Path f157l;

        /* renamed from: m */
        private final Path f158m;

        /* renamed from: o */
        private final Matrix f159o;

        /* renamed from: p */
        private PathMeasure f160p;

        /* renamed from: q */
        private int f161q;

        public C0065f() {
            this.f159o = new Matrix();
            this.f149d = 0.0f;
            this.f150e = 0.0f;
            this.f151f = 0.0f;
            this.f152g = 0.0f;
            this.f153h = 255;
            this.f154i = null;
            this.f155j = null;
            this.f156k = new C0199a<>();
            this.f148c = new C0062c();
            this.f157l = new Path();
            this.f158m = new Path();
        }

        public C0065f(C0065f fVar) {
            this.f159o = new Matrix();
            this.f149d = 0.0f;
            this.f150e = 0.0f;
            this.f151f = 0.0f;
            this.f152g = 0.0f;
            this.f153h = 255;
            this.f154i = null;
            this.f155j = null;
            this.f156k = new C0199a<>();
            this.f148c = new C0062c(fVar.f148c, this.f156k);
            this.f157l = new Path(fVar.f157l);
            this.f158m = new Path(fVar.f158m);
            this.f149d = fVar.f149d;
            this.f150e = fVar.f150e;
            this.f151f = fVar.f151f;
            this.f152g = fVar.f152g;
            this.f161q = fVar.f161q;
            this.f153h = fVar.f153h;
            this.f154i = fVar.f154i;
            if (fVar.f154i != null) {
                this.f156k.put(fVar.f154i, this);
            }
            this.f155j = fVar.f155j;
        }

        /* renamed from: a */
        private static float m191a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m192a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m191a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), hypot);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m193a(C0062c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f129a.set(matrix);
            cVar.f129a.preConcat(cVar.f132d);
            canvas.save();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < cVar.f130b.size()) {
                    C0063d dVar = cVar.f130b.get(i4);
                    if (dVar instanceof C0062c) {
                        m193a((C0062c) dVar, cVar.f129a, canvas, i, i2, colorFilter);
                    } else if (dVar instanceof C0064e) {
                        m194a(cVar, (C0064e) dVar, canvas, i, i2, colorFilter);
                    }
                    i3 = i4 + 1;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        /* renamed from: a */
        private void m194a(C0062c cVar, C0064e eVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f151f;
            float f2 = ((float) i2) / this.f152g;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f129a;
            this.f159o.set(matrix);
            this.f159o.postScale(f, f2);
            float a = m192a(matrix);
            if (a != 0.0f) {
                eVar.mo208a(this.f157l);
                Path path = this.f157l;
                this.f158m.reset();
                if (eVar.mo171a()) {
                    this.f158m.addPath(path, this.f159o);
                    canvas.clipPath(this.f158m);
                    return;
                }
                C0061b bVar = (C0061b) eVar;
                if (!(bVar.f122g == 0.0f && bVar.f123h == 1.0f)) {
                    float f3 = (bVar.f122g + bVar.f124i) % 1.0f;
                    float f4 = (bVar.f123h + bVar.f124i) % 1.0f;
                    if (this.f160p == null) {
                        this.f160p = new PathMeasure();
                    }
                    this.f160p.setPath(this.f157l, false);
                    float length = this.f160p.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.f160p.getSegment(f5, length, path, true);
                        this.f160p.getSegment(0.0f, f6, path, true);
                    } else {
                        this.f160p.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f158m.addPath(path, this.f159o);
                if (bVar.f118c.mo243e()) {
                    C0070b bVar2 = bVar.f118c;
                    if (this.f147b == null) {
                        this.f147b = new Paint(1);
                        this.f147b.setStyle(Paint.Style.FILL);
                    }
                    Paint paint = this.f147b;
                    if (bVar2.mo241c()) {
                        Shader a2 = bVar2.mo237a();
                        a2.setLocalMatrix(this.f159o);
                        paint.setShader(a2);
                        paint.setAlpha(Math.round(bVar.f121f * 255.0f));
                    } else {
                        paint.setColor(C0058i.m163a(bVar2.mo239b(), bVar.f121f));
                    }
                    paint.setColorFilter(colorFilter);
                    this.f158m.setFillType(bVar.f120e == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f158m, paint);
                }
                if (bVar.f116a.mo243e()) {
                    C0070b bVar3 = bVar.f116a;
                    if (this.f146a == null) {
                        this.f146a = new Paint(1);
                        this.f146a.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint2 = this.f146a;
                    if (bVar.f126k != null) {
                        paint2.setStrokeJoin(bVar.f126k);
                    }
                    if (bVar.f125j != null) {
                        paint2.setStrokeCap(bVar.f125j);
                    }
                    paint2.setStrokeMiter(bVar.f127l);
                    if (bVar3.mo241c()) {
                        Shader a3 = bVar3.mo237a();
                        a3.setLocalMatrix(this.f159o);
                        paint2.setShader(a3);
                        paint2.setAlpha(Math.round(bVar.f119d * 255.0f));
                    } else {
                        paint2.setColor(C0058i.m163a(bVar3.mo239b(), bVar.f119d));
                    }
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(min * a * bVar.f117b);
                    canvas.drawPath(this.f158m, paint2);
                }
            }
        }

        /* renamed from: a */
        public void mo212a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m193a(this.f148c, f145n, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        public boolean mo213a() {
            if (this.f155j == null) {
                this.f155j = Boolean.valueOf(this.f148c.mo174b());
            }
            return this.f155j.booleanValue();
        }

        /* renamed from: a */
        public boolean mo214a(int[] iArr) {
            return this.f148c.mo173a(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f153h;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (255.0f * f));
        }

        public void setRootAlpha(int i) {
            this.f153h = i;
        }
    }

    /* renamed from: android.support.b.a.i$g */
    private static class C0066g extends Drawable.ConstantState {

        /* renamed from: a */
        int f162a;

        /* renamed from: b */
        C0065f f163b;

        /* renamed from: c */
        ColorStateList f164c;

        /* renamed from: d */
        PorterDuff.Mode f165d;

        /* renamed from: e */
        boolean f166e;

        /* renamed from: f */
        Bitmap f167f;

        /* renamed from: g */
        ColorStateList f168g;

        /* renamed from: h */
        PorterDuff.Mode f169h;

        /* renamed from: i */
        int f170i;

        /* renamed from: j */
        boolean f171j;

        /* renamed from: k */
        boolean f172k;

        /* renamed from: l */
        Paint f173l;

        public C0066g() {
            this.f164c = null;
            this.f165d = C0058i.f106a;
            this.f163b = new C0065f();
        }

        public C0066g(C0066g gVar) {
            this.f164c = null;
            this.f165d = C0058i.f106a;
            if (gVar != null) {
                this.f162a = gVar.f162a;
                this.f163b = new C0065f(gVar.f163b);
                if (gVar.f163b.f147b != null) {
                    this.f163b.f147b = new Paint(gVar.f163b.f147b);
                }
                if (gVar.f163b.f146a != null) {
                    this.f163b.f146a = new Paint(gVar.f163b.f146a);
                }
                this.f164c = gVar.f164c;
                this.f165d = gVar.f165d;
                this.f166e = gVar.f166e;
            }
        }

        /* renamed from: a */
        public Paint mo219a(ColorFilter colorFilter) {
            if (!mo222a() && colorFilter == null) {
                return null;
            }
            if (this.f173l == null) {
                this.f173l = new Paint();
                this.f173l.setFilterBitmap(true);
            }
            this.f173l.setAlpha(this.f163b.getRootAlpha());
            this.f173l.setColorFilter(colorFilter);
            return this.f173l;
        }

        /* renamed from: a */
        public void mo220a(int i, int i2) {
            this.f167f.eraseColor(0);
            this.f163b.mo212a(new Canvas(this.f167f), i, i2, (ColorFilter) null);
        }

        /* renamed from: a */
        public void mo221a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f167f, (Rect) null, rect, mo219a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo222a() {
            return this.f163b.getRootAlpha() < 255;
        }

        /* renamed from: a */
        public boolean mo223a(int[] iArr) {
            boolean a = this.f163b.mo214a(iArr);
            this.f172k |= a;
            return a;
        }

        /* renamed from: b */
        public void mo224b(int i, int i2) {
            if (this.f167f == null || !mo227c(i, i2)) {
                this.f167f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f172k = true;
            }
        }

        /* renamed from: b */
        public boolean mo225b() {
            return !this.f172k && this.f168g == this.f164c && this.f169h == this.f165d && this.f171j == this.f166e && this.f170i == this.f163b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo226c() {
            this.f168g = this.f164c;
            this.f169h = this.f165d;
            this.f170i = this.f163b.getRootAlpha();
            this.f171j = this.f166e;
            this.f172k = false;
        }

        /* renamed from: c */
        public boolean mo227c(int i, int i2) {
            return i == this.f167f.getWidth() && i2 == this.f167f.getHeight();
        }

        /* renamed from: d */
        public boolean mo228d() {
            return this.f163b.mo213a();
        }

        public int getChangingConfigurations() {
            return this.f162a;
        }

        public Drawable newDrawable() {
            return new C0058i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0058i(this);
        }
    }

    /* renamed from: android.support.b.a.i$h */
    private static class C0067h extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f174a;

        public C0067h(Drawable.ConstantState constantState) {
            this.f174a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f174a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f174a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0058i iVar = new C0058i();
            iVar.f105c = (VectorDrawable) this.f174a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0058i iVar = new C0058i();
            iVar.f105c = (VectorDrawable) this.f174a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0058i iVar = new C0058i();
            iVar.f105c = (VectorDrawable) this.f174a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C0058i() {
        this.f111g = true;
        this.f113i = new float[9];
        this.f114j = new Matrix();
        this.f115k = new Rect();
        this.f107b = new C0066g();
    }

    C0058i(C0066g gVar) {
        this.f111g = true;
        this.f113i = new float[9];
        this.f114j = new Matrix();
        this.f115k = new Rect();
        this.f107b = gVar;
        this.f108d = mo146a(this.f108d, gVar.f164c, gVar.f165d);
    }

    /* renamed from: a */
    static int m163a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m164a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033 A[Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[SYNTHETIC, Splitter:B:15:0x0045] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p004b.p005a.C0058i m165a(android.content.res.Resources r5, int r6, android.content.res.Resources.Theme r7) {
        /*
            r4 = 2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x0020
            android.support.b.a.i r0 = new android.support.b.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r1 = android.support.p006v4.p007a.p008a.C0079f.m256a(r5, r6, r7)
            r0.f105c = r1
            android.support.b.a.i$h r1 = new android.support.b.a.i$h
            android.graphics.drawable.Drawable r2 = r0.f105c
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            r0.f112h = r1
        L_0x001f:
            return r0
        L_0x0020:
            android.content.res.XmlResourceParser r0 = r5.getXml(r6)     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
        L_0x0028:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            if (r2 == r4) goto L_0x0031
            r3 = 1
            if (r2 != r3) goto L_0x0028
        L_0x0031:
            if (r2 == r4) goto L_0x0045
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            throw r0     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
        L_0x003b:
            r0 = move-exception
            java.lang.String r1 = "VectorDrawableCompat"
            java.lang.String r2 = "parser error"
            android.util.Log.e(r1, r2, r0)
        L_0x0043:
            r0 = 0
            goto L_0x001f
        L_0x0045:
            android.support.b.a.i r0 = m166a(r5, r0, r1, r7)     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            goto L_0x001f
        L_0x004a:
            r0 = move-exception
            java.lang.String r1 = "VectorDrawableCompat"
            java.lang.String r2 = "parser error"
            android.util.Log.e(r1, r2, r0)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p004b.p005a.C0058i.m165a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.b.a.i");
    }

    /* renamed from: a */
    public static C0058i m166a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0058i iVar = new C0058i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: a */
    private void m167a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0066g gVar = this.f107b;
        C0065f fVar = gVar.f163b;
        gVar.f165d = m164a(C0083g.m262a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            gVar.f164c = colorStateList;
        }
        gVar.f166e = C0083g.m266a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.f166e);
        fVar.f151f = C0083g.m261a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.f151f);
        fVar.f152g = C0083g.m261a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.f152g);
        if (fVar.f151f <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (fVar.f152g <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            fVar.f149d = typedArray.getDimension(3, fVar.f149d);
            fVar.f150e = typedArray.getDimension(2, fVar.f150e);
            if (fVar.f149d <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (fVar.f150e <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                fVar.setAlpha(C0083g.m261a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    fVar.f154i = string;
                    fVar.f156k.put(string, fVar);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m168a() {
        if (Build.VERSION.SDK_INT >= 17) {
            return isAutoMirrored() && C0270a.m1167g(this) == 1;
        }
        return false;
    }

    /* renamed from: b */
    private void m169b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        boolean z;
        C0066g gVar = this.f107b;
        C0065f fVar = gVar.f163b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f148c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0062c cVar = (C0062c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0061b bVar = new C0061b();
                    bVar.mo172a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f130b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f156k.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    gVar.f162a = bVar.f144o | gVar.f162a;
                } else if ("clip-path".equals(name)) {
                    C0060a aVar = new C0060a();
                    aVar.mo170a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f130b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f156k.put(aVar.getPathName(), aVar);
                    }
                    gVar.f162a |= aVar.f144o;
                    z = z2;
                } else {
                    if ("group".equals(name)) {
                        C0062c cVar2 = new C0062c();
                        cVar2.mo191a(resources, attributeSet, theme, xmlPullParser);
                        cVar.f130b.add(cVar2);
                        arrayDeque.push(cVar2);
                        if (cVar2.getGroupName() != null) {
                            fVar.f156k.put(cVar2.getGroupName(), cVar2);
                        }
                        gVar.f162a |= cVar2.f133e;
                    }
                    z = z2;
                }
                z2 = z;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuffColorFilter mo146a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo147a(String str) {
        return this.f107b.f163b.f156k.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148a(boolean z) {
        this.f111g = z;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        if (this.f105c == null) {
            return false;
        }
        C0270a.m1164d(this.f105c);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.f105c != null) {
            this.f105c.draw(canvas);
            return;
        }
        copyBounds(this.f115k);
        if (this.f115k.width() > 0 && this.f115k.height() > 0) {
            ColorFilter colorFilter = this.f109e == null ? this.f108d : this.f109e;
            canvas.getMatrix(this.f114j);
            this.f114j.getValues(this.f113i);
            float abs = Math.abs(this.f113i[0]);
            float abs2 = Math.abs(this.f113i[4]);
            float abs3 = Math.abs(this.f113i[1]);
            float abs4 = Math.abs(this.f113i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs2 = 1.0f;
                abs = 1.0f;
            }
            int min = Math.min(2048, (int) (abs * ((float) this.f115k.width())));
            int min2 = Math.min(2048, (int) (abs2 * ((float) this.f115k.height())));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f115k.left, (float) this.f115k.top);
                if (m168a()) {
                    canvas.translate((float) this.f115k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f115k.offsetTo(0, 0);
                this.f107b.mo224b(min, min2);
                if (!this.f111g) {
                    this.f107b.mo220a(min, min2);
                } else if (!this.f107b.mo225b()) {
                    this.f107b.mo220a(min, min2);
                    this.f107b.mo226c();
                }
                this.f107b.mo221a(canvas, colorFilter, this.f115k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        return this.f105c != null ? C0270a.m1163c(this.f105c) : this.f107b.f163b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        return this.f105c != null ? this.f105c.getChangingConfigurations() : super.getChangingConfigurations() | this.f107b.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f105c != null && Build.VERSION.SDK_INT >= 24) {
            return new C0067h(this.f105c.getConstantState());
        }
        this.f107b.f162a = getChangingConfigurations();
        return this.f107b;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f105c != null ? this.f105c.getIntrinsicHeight() : (int) this.f107b.f163b.f150e;
    }

    public int getIntrinsicWidth() {
        return this.f105c != null ? this.f105c.getIntrinsicWidth() : (int) this.f107b.f163b.f149d;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        if (this.f105c != null) {
            return this.f105c.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f105c != null) {
            this.f105c.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f105c != null) {
            C0270a.m1158a(this.f105c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0066g gVar = this.f107b;
        gVar.f163b = new C0065f();
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f76a);
        m167a(a, xmlPullParser);
        a.recycle();
        gVar.f162a = getChangingConfigurations();
        gVar.f172k = true;
        m169b(resources, xmlPullParser, attributeSet, theme);
        this.f108d = mo146a(this.f108d, gVar.f164c, gVar.f165d);
    }

    public void invalidateSelf() {
        if (this.f105c != null) {
            this.f105c.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        return this.f105c != null ? C0270a.m1161b(this.f105c) : this.f107b.f166e;
    }

    public boolean isStateful() {
        return this.f105c != null ? this.f105c.isStateful() : super.isStateful() || (this.f107b != null && (this.f107b.mo228d() || (this.f107b.f164c != null && this.f107b.f164c.isStateful())));
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f105c != null) {
            this.f105c.mutate();
        } else if (!this.f110f && super.mutate() == this) {
            this.f107b = new C0066g(this.f107b);
            this.f110f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f105c != null) {
            this.f105c.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f105c != null) {
            return this.f105c.setState(iArr);
        }
        boolean z = false;
        C0066g gVar = this.f107b;
        if (!(gVar.f164c == null || gVar.f165d == null)) {
            this.f108d = mo146a(this.f108d, gVar.f164c, gVar.f165d);
            invalidateSelf();
            z = true;
        }
        if (!gVar.mo228d() || !gVar.mo223a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f105c != null) {
            this.f105c.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f105c != null) {
            this.f105c.setAlpha(i);
        } else if (this.f107b.f163b.getRootAlpha() != i) {
            this.f107b.f163b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f105c != null) {
            C0270a.m1160a(this.f105c, z);
        } else {
            this.f107b.f166e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f105c != null) {
            this.f105c.setColorFilter(colorFilter);
            return;
        }
        this.f109e = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.f105c != null) {
            C0270a.m1154a(this.f105c, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f105c != null) {
            C0270a.m1156a(this.f105c, colorStateList);
            return;
        }
        C0066g gVar = this.f107b;
        if (gVar.f164c != colorStateList) {
            gVar.f164c = colorStateList;
            this.f108d = mo146a(this.f108d, colorStateList, gVar.f165d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f105c != null) {
            C0270a.m1159a(this.f105c, mode);
            return;
        }
        C0066g gVar = this.f107b;
        if (gVar.f165d != mode) {
            gVar.f165d = mode;
            this.f108d = mo146a(this.f108d, gVar.f164c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f105c != null ? this.f105c.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f105c != null) {
            this.f105c.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
