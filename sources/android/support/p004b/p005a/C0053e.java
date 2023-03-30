package android.support.p004b.p005a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.support.p006v4.graphics.C0265b;
import android.support.p006v4.p007a.p008a.C0083g;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.b.a.e */
public class C0053e {

    /* renamed from: android.support.b.a.e$a */
    private static class C0054a implements TypeEvaluator<C0265b.C0267b[]> {

        /* renamed from: a */
        private C0265b.C0267b[] f101a;

        C0054a() {
        }

        /* renamed from: a */
        public C0265b.C0267b[] evaluate(float f, C0265b.C0267b[] bVarArr, C0265b.C0267b[] bVarArr2) {
            if (!C0265b.m1127a(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (this.f101a == null || !C0265b.m1127a(this.f101a, bVarArr)) {
                this.f101a = C0265b.m1129a(bVarArr);
            }
            for (int i = 0; i < bVarArr.length; i++) {
                this.f101a[i].mo1101a(bVarArr[i], bVarArr2[i], f);
            }
            return this.f101a;
        }
    }

    /* renamed from: a */
    private static int m138a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int i = 0;
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f85j);
        TypedValue b = C0083g.m269b(a, xmlPullParser, "value", 0);
        if ((b != null) && m155a(b.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    private static int m139a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((!z || !m155a(i3)) && (!z2 || !m155a(z2 ? peekValue2.type : 0))) ? 0 : 3;
    }

    /* renamed from: a */
    public static Animator m140a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m141a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    public static Animator m141a(Context context, Resources resources, Resources.Theme theme, int i) {
        return m142a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    public static Animator m142a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator a = m143a(context, resources, theme, (XmlPullParser) xmlResourceParser, f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static Animator m143a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m144a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), (AnimatorSet) null, 0, f);
    }

    /* renamed from: a */
    private static Animator m144a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        boolean z;
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        valueAnimator = m147a(context, resources, theme, attributeSet, f, xmlPullParser);
                        z = false;
                    } else if (name.equals("animator")) {
                        valueAnimator = m150a(context, resources, theme, attributeSet, (ValueAnimator) null, f, xmlPullParser);
                        z = false;
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f83h);
                        m144a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, C0083g.m262a(a, xmlPullParser, "ordering", 0, 0), f);
                        a.recycle();
                        z = false;
                        valueAnimator = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] a2 = m156a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (!(a2 == null || valueAnimator == null || !(valueAnimator instanceof ValueAnimator))) {
                            valueAnimator.setValues(a2);
                        }
                        z = true;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (animatorSet != null && !z) {
                        ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                        arrayList2.add(valueAnimator);
                        arrayList = arrayList2;
                    }
                }
            }
        }
        if (!(animatorSet == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                animatorArr[i2] = (Animator) it.next();
                i2++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static Keyframe m145a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static Keyframe m146a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f85j);
        Keyframe keyframe = null;
        float a2 = C0083g.m261a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b = C0083g.m269b(a, xmlPullParser, "value", 0);
        boolean z = b != null;
        if (i == 4) {
            i = (!z || !m155a(b.type)) ? 0 : 3;
        }
        if (z) {
            switch (i) {
                case 0:
                    keyframe = Keyframe.ofFloat(a2, C0083g.m261a(a, xmlPullParser, "value", 0, 0.0f));
                    break;
                case 1:
                case 3:
                    keyframe = Keyframe.ofInt(a2, C0083g.m262a(a, xmlPullParser, "value", 0, 0));
                    break;
            }
        } else {
            keyframe = i == 0 ? Keyframe.ofFloat(a2) : Keyframe.ofInt(a2);
        }
        int c = C0083g.m270c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            keyframe.setInterpolator(C0052d.m136a(context, c));
        }
        a.recycle();
        return keyframe;
    }

    /* renamed from: a */
    private static ObjectAnimator m147a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m150a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m148a(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, org.xmlpull.v1.XmlPullParser r11, java.lang.String r12, int r13) {
        /*
            r7 = 0
            r6 = 0
            r4 = r13
        L_0x0003:
            int r0 = r11.next()
            r1 = 3
            if (r0 == r1) goto L_0x0041
            r1 = 1
            if (r0 == r1) goto L_0x0041
            java.lang.String r0 = r11.getName()
            java.lang.String r1 = "keyframe"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            r0 = 4
            if (r4 != r0) goto L_0x0024
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)
            int r4 = m138a((android.content.res.Resources) r9, (android.content.res.Resources.Theme) r10, (android.util.AttributeSet) r0, (org.xmlpull.v1.XmlPullParser) r11)
        L_0x0024:
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r11
            android.animation.Keyframe r1 = m146a((android.content.Context) r0, (android.content.res.Resources) r1, (android.content.res.Resources.Theme) r2, (android.util.AttributeSet) r3, (int) r4, (org.xmlpull.v1.XmlPullParser) r5)
            if (r1 == 0) goto L_0x0104
            if (r6 != 0) goto L_0x0101
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0039:
            r0.add(r1)
        L_0x003c:
            r11.next()
        L_0x003f:
            r6 = r0
            goto L_0x0003
        L_0x0041:
            if (r6 == 0) goto L_0x00ff
            int r2 = r6.size()
            if (r2 <= 0) goto L_0x00ff
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            android.animation.Keyframe r0 = (android.animation.Keyframe) r0
            int r1 = r2 + -1
            java.lang.Object r1 = r6.get(r1)
            android.animation.Keyframe r1 = (android.animation.Keyframe) r1
            float r3 = r1.getFraction()
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x00fc
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x009b
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setFraction(r3)
            r1 = r2
        L_0x006d:
            float r2 = r0.getFraction()
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x007f
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ab
            r2 = 0
            r0.setFraction(r2)
        L_0x007f:
            android.animation.Keyframe[] r7 = new android.animation.Keyframe[r1]
            r6.toArray(r7)
            r5 = 0
        L_0x0085:
            if (r5 >= r1) goto L_0x00ed
            r0 = r7[r5]
            float r2 = r0.getFraction()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0098
            if (r5 != 0) goto L_0x00b7
            r2 = 0
            r0.setFraction(r2)
        L_0x0098:
            int r5 = r5 + 1
            goto L_0x0085
        L_0x009b:
            int r3 = r6.size()
            r5 = 1065353216(0x3f800000, float:1.0)
            android.animation.Keyframe r1 = m145a((android.animation.Keyframe) r1, (float) r5)
            r6.add(r3, r1)
            int r1 = r2 + 1
            goto L_0x006d
        L_0x00ab:
            r2 = 0
            r3 = 0
            android.animation.Keyframe r0 = m145a((android.animation.Keyframe) r0, (float) r3)
            r6.add(r2, r0)
            int r1 = r1 + 1
            goto L_0x007f
        L_0x00b7:
            int r2 = r1 + -1
            if (r5 != r2) goto L_0x00c1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setFraction(r2)
            goto L_0x0098
        L_0x00c1:
            int r0 = r5 + 1
            r3 = r5
        L_0x00c4:
            int r2 = r1 + -1
            if (r0 >= r2) goto L_0x00d3
            r2 = r7[r0]
            float r2 = r2.getFraction()
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x00e8
        L_0x00d3:
            int r0 = r3 + 1
            r0 = r7[r0]
            float r0 = r0.getFraction()
            int r2 = r5 + -1
            r2 = r7[r2]
            float r2 = r2.getFraction()
            float r0 = r0 - r2
            m154a((android.animation.Keyframe[]) r7, (float) r0, (int) r5, (int) r3)
            goto L_0x0098
        L_0x00e8:
            int r2 = r0 + 1
            r3 = r0
            r0 = r2
            goto L_0x00c4
        L_0x00ed:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r12, r7)
            r1 = 3
            if (r4 != r1) goto L_0x00fb
            android.support.b.a.f r1 = android.support.p004b.p005a.C0055f.m158a()
            r0.setEvaluator(r1)
        L_0x00fb:
            return r0
        L_0x00fc:
            r1 = r2
            goto L_0x006d
        L_0x00ff:
            r0 = r7
            goto L_0x00fb
        L_0x0101:
            r0 = r6
            goto L_0x0039
        L_0x0104:
            r0 = r6
            goto L_0x003c
        L_0x0107:
            r0 = r6
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p004b.p005a.C0053e.m148a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m149a(android.content.res.TypedArray r8, int r9, int r10, int r11, java.lang.String r12) {
        /*
            android.util.TypedValue r1 = r8.peekValue(r10)
            if (r1 == 0) goto L_0x007b
            r0 = 1
            r6 = r0
        L_0x0008:
            if (r6 == 0) goto L_0x007e
            int r0 = r1.type
        L_0x000c:
            android.util.TypedValue r2 = r8.peekValue(r11)
            if (r2 == 0) goto L_0x0080
            r1 = 1
            r5 = r1
        L_0x0014:
            if (r5 == 0) goto L_0x0083
            int r1 = r2.type
            r4 = r1
        L_0x0019:
            r1 = 4
            if (r9 != r1) goto L_0x002d
            if (r6 == 0) goto L_0x0024
            boolean r1 = m155a(r0)
            if (r1 != 0) goto L_0x002c
        L_0x0024:
            if (r5 == 0) goto L_0x0086
            boolean r1 = m155a(r4)
            if (r1 == 0) goto L_0x0086
        L_0x002c:
            r9 = 3
        L_0x002d:
            if (r9 != 0) goto L_0x0088
            r1 = 1
            r3 = r1
        L_0x0031:
            r1 = 0
            r2 = 2
            if (r9 != r2) goto L_0x00b6
            java.lang.String r0 = r8.getString(r10)
            java.lang.String r2 = r8.getString(r11)
            android.support.v4.graphics.b$b[] r3 = android.support.p006v4.graphics.C0265b.m1131b(r0)
            android.support.v4.graphics.b$b[] r4 = android.support.p006v4.graphics.C0265b.m1131b(r2)
            if (r3 != 0) goto L_0x0049
            if (r4 == 0) goto L_0x019e
        L_0x0049:
            if (r3 == 0) goto L_0x00a4
            android.support.b.a.e$a r1 = new android.support.b.a.e$a
            r1.<init>()
            if (r4 == 0) goto L_0x0099
            boolean r5 = android.support.p006v4.graphics.C0265b.m1127a((android.support.p006v4.graphics.C0265b.C0267b[]) r3, (android.support.p006v4.graphics.C0265b.C0267b[]) r4)
            if (r5 != 0) goto L_0x008b
            android.view.InflateException r1 = new android.view.InflateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " Can't morph from "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " to "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x007b:
            r0 = 0
            r6 = r0
            goto L_0x0008
        L_0x007e:
            r0 = 0
            goto L_0x000c
        L_0x0080:
            r1 = 0
            r5 = r1
            goto L_0x0014
        L_0x0083:
            r1 = 0
            r4 = r1
            goto L_0x0019
        L_0x0086:
            r9 = 0
            goto L_0x002d
        L_0x0088:
            r1 = 0
            r3 = r1
            goto L_0x0031
        L_0x008b:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r2 = 1
            r0[r2] = r4
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofObject(r12, r1, r0)
        L_0x0098:
            return r0
        L_0x0099:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofObject(r12, r1, r0)
            goto L_0x0098
        L_0x00a4:
            if (r4 == 0) goto L_0x019e
            android.support.b.a.e$a r0 = new android.support.b.a.e$a
            r0.<init>()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofObject(r12, r0, r1)
            goto L_0x0098
        L_0x00b6:
            r2 = 0
            r7 = 3
            if (r9 != r7) goto L_0x00be
            android.support.b.a.f r2 = android.support.p004b.p005a.C0055f.m158a()
        L_0x00be:
            if (r3 == 0) goto L_0x011b
            if (r6 == 0) goto L_0x0102
            r1 = 5
            if (r0 != r1) goto L_0x00ea
            r0 = 0
            float r0 = r8.getDimension(r10, r0)
            r1 = r0
        L_0x00cb:
            if (r5 == 0) goto L_0x00f7
            r0 = 5
            if (r4 != r0) goto L_0x00f1
            r0 = 0
            float r0 = r8.getDimension(r11, r0)
        L_0x00d5:
            r3 = 2
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r0
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r12, r3)
        L_0x00e2:
            if (r0 == 0) goto L_0x0098
            if (r2 == 0) goto L_0x0098
            r0.setEvaluator(r2)
            goto L_0x0098
        L_0x00ea:
            r0 = 0
            float r0 = r8.getFloat(r10, r0)
            r1 = r0
            goto L_0x00cb
        L_0x00f1:
            r0 = 0
            float r0 = r8.getFloat(r11, r0)
            goto L_0x00d5
        L_0x00f7:
            r0 = 1
            float[] r0 = new float[r0]
            r3 = 0
            r0[r3] = r1
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r12, r0)
            goto L_0x00e2
        L_0x0102:
            r0 = 5
            if (r4 != r0) goto L_0x0115
            r0 = 0
            float r0 = r8.getDimension(r11, r0)
        L_0x010a:
            r1 = 1
            float[] r1 = new float[r1]
            r3 = 0
            r1[r3] = r0
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r12, r1)
            goto L_0x00e2
        L_0x0115:
            r0 = 0
            float r0 = r8.getFloat(r11, r0)
            goto L_0x010a
        L_0x011b:
            if (r6 == 0) goto L_0x0172
            r1 = 5
            if (r0 != r1) goto L_0x0140
            r0 = 0
            float r0 = r8.getDimension(r10, r0)
            int r0 = (int) r0
            r1 = r0
        L_0x0127:
            if (r5 == 0) goto L_0x0166
            r0 = 5
            if (r4 != r0) goto L_0x0154
            r0 = 0
            float r0 = r8.getDimension(r11, r0)
            int r0 = (int) r0
        L_0x0132:
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r0
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r12, r3)
            goto L_0x00e2
        L_0x0140:
            boolean r0 = m155a(r0)
            if (r0 == 0) goto L_0x014d
            r0 = 0
            int r0 = r8.getColor(r10, r0)
            r1 = r0
            goto L_0x0127
        L_0x014d:
            r0 = 0
            int r0 = r8.getInt(r10, r0)
            r1 = r0
            goto L_0x0127
        L_0x0154:
            boolean r0 = m155a(r4)
            if (r0 == 0) goto L_0x0160
            r0 = 0
            int r0 = r8.getColor(r11, r0)
            goto L_0x0132
        L_0x0160:
            r0 = 0
            int r0 = r8.getInt(r11, r0)
            goto L_0x0132
        L_0x0166:
            r0 = 1
            int[] r0 = new int[r0]
            r3 = 0
            r0[r3] = r1
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r12, r0)
            goto L_0x00e2
        L_0x0172:
            if (r5 == 0) goto L_0x019b
            r0 = 5
            if (r4 != r0) goto L_0x0189
            r0 = 0
            float r0 = r8.getDimension(r11, r0)
            int r0 = (int) r0
        L_0x017d:
            r1 = 1
            int[] r1 = new int[r1]
            r3 = 0
            r1[r3] = r0
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r12, r1)
            goto L_0x00e2
        L_0x0189:
            boolean r0 = m155a(r4)
            if (r0 == 0) goto L_0x0195
            r0 = 0
            int r0 = r8.getColor(r11, r0)
            goto L_0x017d
        L_0x0195:
            r0 = 0
            int r0 = r8.getInt(r11, r0)
            goto L_0x017d
        L_0x019b:
            r0 = r1
            goto L_0x00e2
        L_0x019e:
            r0 = r1
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p004b.p005a.C0053e.m149a(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static ValueAnimator m150a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f82g);
        TypedArray a2 = C0083g.m263a(resources, theme, attributeSet, C0046a.f86k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m152a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C0083g.m270c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C0052d.m136a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m151a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a = C0083g.m265a(typedArray, xmlPullParser, "pathData", 1);
        if (a != null) {
            String a2 = C0083g.m265a(typedArray, xmlPullParser, "propertyXName", 2);
            String a3 = C0083g.m265a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i == 2 || i == 4) {
            }
            if (a2 == null && a3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m153a(C0265b.m1124a(a), objectAnimator, 0.5f * f, a2, a3);
            return;
        }
        objectAnimator.setPropertyName(C0083g.m265a(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    private static void m152a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long a = (long) C0083g.m262a(typedArray, xmlPullParser, "duration", 1, 300);
        long a2 = (long) C0083g.m262a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a3 = C0083g.m262a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0083g.m267a(xmlPullParser, "valueFrom") && C0083g.m267a(xmlPullParser, "valueTo")) {
            if (a3 == 4) {
                a3 = m139a(typedArray, 5, 6);
            }
            PropertyValuesHolder a4 = m149a(typedArray, a3, 5, 6, "");
            if (a4 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{a4});
            }
        }
        valueAnimator.setDuration(a);
        valueAnimator.setStartDelay(a2);
        valueAnimator.setRepeatCount(C0083g.m262a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0083g.m262a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m151a(valueAnimator, typedArray2, a3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m153a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        int i;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float f2 = 0.0f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        int i2 = 0;
        float f3 = f2 / ((float) (min - 1));
        float f4 = 0.0f;
        int i3 = 0;
        while (i3 < min) {
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, (float[]) null);
            fArr[i3] = fArr3[0];
            fArr2[i3] = fArr3[1];
            f4 += f3;
            if (i2 + 1 >= arrayList.size() || f4 <= ((Float) arrayList.get(i2 + 1)).floatValue()) {
                i = i2;
            } else {
                i = i2 + 1;
                pathMeasure2.nextContour();
            }
            i3++;
            i2 = i;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        PropertyValuesHolder propertyValuesHolder2 = null;
        if (str != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str, fArr);
        }
        if (str2 != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
        } else if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else {
            objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder, propertyValuesHolder2});
        }
    }

    /* renamed from: a */
    private static void m154a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m155a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    private static PropertyValuesHolder[] m156a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType != 3 && eventType != 1) {
                if (eventType != 2) {
                    xmlPullParser.next();
                } else {
                    if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                        TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f84i);
                        String a2 = C0083g.m265a(a, xmlPullParser, "propertyName", 3);
                        int a3 = C0083g.m262a(a, xmlPullParser, "valueType", 2, 4);
                        PropertyValuesHolder a4 = m148a(context, resources, theme, xmlPullParser, a2, a3);
                        PropertyValuesHolder a5 = a4 == null ? m149a(a, a3, 0, 1, a2) : a4;
                        if (a5 != null) {
                            arrayList = arrayList2 == null ? new ArrayList() : arrayList2;
                            arrayList.add(a5);
                        } else {
                            arrayList = arrayList2;
                        }
                        a.recycle();
                    } else {
                        arrayList = arrayList2;
                    }
                    xmlPullParser.next();
                    arrayList2 = arrayList;
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        int size = arrayList2.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (int i = 0; i < size; i++) {
            propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList2.get(i);
        }
        return propertyValuesHolderArr;
    }
}
