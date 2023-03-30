package org.p024js.oledsaver.p026b.p027a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Pair;
import java.util.Arrays;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p026b.p027a.C0677c;
import org.p024js.oledsaver.p026b.p027a.p028a.C0674a;
import org.p024js.oledsaver.p031e.C0714c;
import org.p024js.oledsaver.p031e.C0717f;
import org.p024js.oledsaver.p031e.C0721j;
import org.p024js.oledsaver.p031e.C0722k;

/* renamed from: org.js.oledsaver.b.a.d */
public abstract class C0680d {

    /* renamed from: a */
    private static final C0674a f2464a = C0674a.m3302a("BrightnessMappingStrategy");

    /* renamed from: org.js.oledsaver.b.a.d$a */
    static class C0681a extends C0680d {

        /* renamed from: a */
        private C0677c f2465a;

        /* renamed from: b */
        private C0722k f2466b;

        /* renamed from: c */
        private final C0722k f2467c;

        /* renamed from: d */
        private final C0677c f2468d;

        /* renamed from: e */
        private C0722k f2469e;

        /* renamed from: f */
        private float f2470f;

        /* renamed from: g */
        private float f2471g;

        /* renamed from: h */
        private float f2472h;

        /* renamed from: i */
        private float f2473i;

        public C0681a(C0677c cVar, float[] fArr, int[] iArr, float f) {
            boolean z = true;
            C0717f.m3475a((fArr.length == 0 || iArr.length == 0) ? false : true, (Object) "Nits and backlight arrays must not be empty!");
            C0717f.m3475a(fArr.length != iArr.length ? false : z, (Object) "Nits and backlight arrays must be the same length!");
            C0717f.m3473a(cVar);
            C0717f.m3476a(fArr, 0.0f, Float.MAX_VALUE, "nits");
            C0717f.m3477a(iArr, 0, 255, "backlight");
            this.f2470f = f;
            this.f2471g = 0.0f;
            this.f2472h = -1.0f;
            this.f2473i = -1.0f;
            int length = fArr.length;
            float[] fArr2 = new float[length];
            for (int i = 0; i < length; i++) {
                fArr2[i] = C0680d.m3327b(iArr[i]);
            }
            this.f2467c = C0722k.m3496a(fArr, fArr2);
            this.f2469e = C0722k.m3496a(fArr2, fArr);
            this.f2468d = cVar;
            this.f2465a = cVar;
            m3339f();
        }

        /* renamed from: c */
        private float m3338c(float f) {
            Pair<float[], float[]> a = this.f2465a.mo3436a();
            return this.f2467c.mo3532a(C0722k.m3496a((float[]) a.first, (float[]) a.second).mo3532a(f));
        }

        /* renamed from: f */
        private void m3339f() {
            Pair<float[], float[]> a = this.f2465a.mo3436a();
            float[] fArr = (float[]) a.first;
            float[] fArr2 = (float[]) a.second;
            float[] fArr3 = new float[fArr2.length];
            for (int i = 0; i < fArr3.length; i++) {
                fArr3[i] = this.f2467c.mo3532a(fArr2[i]);
            }
            Pair a2 = C0680d.m3328b(fArr, fArr3, this.f2472h, this.f2473i, this.f2471g, this.f2470f);
            float[] fArr4 = (float[]) a2.first;
            float[] fArr5 = (float[]) a2.second;
            float[] fArr6 = new float[fArr5.length];
            for (int i2 = 0; i2 < fArr6.length; i2++) {
                fArr6[i2] = this.f2469e.mo3532a(fArr5[i2]);
            }
            this.f2466b = C0722k.m3496a(fArr4, fArr6);
        }

        /* renamed from: a */
        public float mo3449a() {
            return this.f2471g;
        }

        /* renamed from: a */
        public float mo3450a(float f) {
            return this.f2467c.mo3532a(this.f2466b.mo3532a(f));
        }

        /* renamed from: a */
        public void mo3451a(float f, float f2) {
            if (f >= 0.0f && f2 >= 0.0f) {
                this.f2471g = C0680d.m3326b(this.f2470f, f2, m3338c(f));
                this.f2472h = f;
                this.f2473i = f2;
                m3339f();
            }
        }

        /* renamed from: a */
        public boolean mo3452a(C0677c cVar) {
            if (cVar == null) {
                cVar = this.f2468d;
            }
            if (cVar.equals(this.f2465a)) {
                return false;
            }
            this.f2465a = cVar;
            m3339f();
            return true;
        }

        /* renamed from: b */
        public void mo3453b() {
            if (this.f2472h != -1.0f) {
                this.f2471g = 0.0f;
                this.f2472h = -1.0f;
                this.f2473i = -1.0f;
                m3339f();
            }
        }

        /* renamed from: b */
        public boolean mo3454b(float f) {
            float a = C0714c.m3466a(f, -1.0f, 1.0f);
            if (a == this.f2471g) {
                return false;
            }
            this.f2471g = a;
            m3339f();
            return true;
        }

        /* renamed from: c */
        public boolean mo3455c() {
            return this.f2472h != -1.0f;
        }

        /* renamed from: d */
        public float mo3456d() {
            return this.f2472h;
        }

        /* renamed from: e */
        public float mo3457e() {
            return this.f2473i;
        }
    }

    /* renamed from: org.js.oledsaver.b.a.d$b */
    private static class C0682b extends C0680d {

        /* renamed from: a */
        private final float[] f2474a;

        /* renamed from: b */
        private final float[] f2475b;

        /* renamed from: c */
        private C0722k f2476c;

        /* renamed from: d */
        private float f2477d;

        /* renamed from: e */
        private float f2478e;

        /* renamed from: f */
        private float f2479f;

        /* renamed from: g */
        private float f2480g;

        public C0682b(float[] fArr, int[] iArr, float f) {
            boolean z = true;
            C0717f.m3475a((fArr.length == 0 || iArr.length == 0) ? false : true, (Object) "Lux and brightness arrays must not be empty!");
            C0717f.m3475a(fArr.length != iArr.length ? false : z, (Object) "Lux and brightness arrays must be the same length!");
            C0717f.m3476a(fArr, 0.0f, Float.MAX_VALUE, "lux");
            C0717f.m3477a(iArr, 0, Integer.MAX_VALUE, "brightness");
            int length = iArr.length;
            this.f2474a = new float[length];
            this.f2475b = new float[length];
            for (int i = 0; i < length; i++) {
                this.f2474a[i] = fArr[i];
                this.f2475b[i] = C0680d.m3327b(iArr[i]);
            }
            this.f2477d = f;
            this.f2478e = 0.0f;
            this.f2479f = -1.0f;
            this.f2480g = -1.0f;
            m3350f();
        }

        /* renamed from: c */
        private float m3349c(float f) {
            return C0722k.m3496a(this.f2474a, this.f2475b).mo3532a(f);
        }

        /* renamed from: f */
        private void m3350f() {
            Pair a = C0680d.m3328b(this.f2474a, this.f2475b, this.f2479f, this.f2480g, this.f2478e, this.f2477d);
            this.f2476c = C0722k.m3496a((float[]) a.first, (float[]) a.second);
        }

        /* renamed from: a */
        public float mo3449a() {
            return this.f2478e;
        }

        /* renamed from: a */
        public float mo3450a(float f) {
            return this.f2476c.mo3532a(f);
        }

        /* renamed from: a */
        public void mo3451a(float f, float f2) {
            this.f2478e = C0680d.m3326b(this.f2477d, f2, m3349c(f));
            this.f2479f = f;
            this.f2480g = f2;
            m3350f();
        }

        /* renamed from: a */
        public boolean mo3452a(C0677c cVar) {
            return false;
        }

        /* renamed from: b */
        public void mo3453b() {
            if (this.f2479f != -1.0f) {
                this.f2478e = 0.0f;
                this.f2479f = -1.0f;
                this.f2480g = -1.0f;
                m3350f();
            }
        }

        /* renamed from: b */
        public boolean mo3454b(float f) {
            float a = C0714c.m3466a(f, -1.0f, 1.0f);
            if (a == this.f2478e) {
                return false;
            }
            this.f2478e = a;
            m3350f();
            return true;
        }

        /* renamed from: c */
        public boolean mo3455c() {
            return this.f2479f != -1.0f;
        }

        /* renamed from: d */
        public float mo3456d() {
            return this.f2479f;
        }

        /* renamed from: e */
        public float mo3457e() {
            return this.f2480g;
        }
    }

    /* renamed from: a */
    private static int m3316a(float[] fArr, float f) {
        for (int i = 0; i < fArr.length; i++) {
            if (f <= fArr[i]) {
                return i;
            }
        }
        return fArr.length;
    }

    /* renamed from: a */
    private static Pair<float[], float[]> m3317a(float[] fArr, float[] fArr2, float f, float f2) {
        float[] copyOf;
        float[] copyOf2;
        int a = m3316a(fArr, f);
        if (a == fArr.length) {
            copyOf = Arrays.copyOf(fArr, fArr.length + 1);
            copyOf2 = Arrays.copyOf(fArr2, fArr2.length + 1);
            copyOf[a] = f;
            copyOf2[a] = f2;
        } else if (fArr[a] == f) {
            copyOf = Arrays.copyOf(fArr, fArr.length);
            copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
            copyOf2[a] = f2;
        } else {
            copyOf = Arrays.copyOf(fArr, fArr.length + 1);
            System.arraycopy(copyOf, a, copyOf, a + 1, fArr.length - a);
            copyOf[a] = f;
            copyOf2 = Arrays.copyOf(fArr2, fArr2.length + 1);
            System.arraycopy(copyOf2, a, copyOf2, a + 1, fArr2.length - a);
            copyOf2[a] = f2;
        }
        m3320a(copyOf, copyOf2, a);
        return Pair.create(copyOf, copyOf2);
    }

    /* renamed from: a */
    public static C0680d m3319a(Resources resources) {
        float[] a = m3324a(resources.getIntArray(R.array.config_autoBrightnessLevels));
        int[] intArray = resources.getIntArray(R.array.config_autoBrightnessLcdBacklightValues);
        float[] a2 = m3323a(resources.obtainTypedArray(R.array.config_autoBrightnessDisplayValuesNits));
        float fraction = resources.getFraction(R.fraction.config_autoBrightnessAdjustmentMaxGamma, 1, 1);
        float[] a3 = m3323a(resources.obtainTypedArray(R.array.config_screenBrightnessNits));
        int[] intArray2 = resources.getIntArray(R.array.config_screenBrightnessBacklight);
        if (m3322a(a3, intArray2) && m3321a(a, a2)) {
            int integer = resources.getInteger(R.integer.config_screenBrightnessSettingMinimum);
            int integer2 = resources.getInteger(R.integer.config_screenBrightnessSettingMaximum);
            if (intArray2[0] > integer || intArray2[intArray2.length - 1] < integer2) {
                C0721j.m3495d("BrightnessMappingStrategy", "Screen brightness mapping does not cover whole range of available backlight values, autobrightness functionality may be impaired.");
            }
            C0677c.C0679a aVar = new C0677c.C0679a();
            aVar.mo3447a(a, a2);
            return new C0681a(aVar.mo3448a(), a3, intArray2, fraction);
        } else if (m3322a(a, intArray)) {
            return new C0682b(a, intArray, fraction);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private static void m3320a(float[] fArr, float[] fArr2, int i) {
        float f = fArr[i];
        float f2 = fArr2[i];
        int i2 = i + 1;
        while (i2 < fArr.length) {
            float f3 = fArr[i2];
            float f4 = fArr2[i2];
            f2 = C0714c.m3466a(f4, f2, m3325b(f3, f) * f2);
            if (f2 == f4) {
                break;
            }
            fArr2[i2] = f2;
            i2++;
            f = f3;
        }
        float f5 = fArr[i];
        float f6 = fArr2[i];
        int i3 = i - 1;
        while (i3 >= 0) {
            float f7 = fArr[i3];
            float f8 = fArr2[i3];
            f6 = C0714c.m3466a(f8, m3325b(f7, f5) * f6, f6);
            if (f6 != f8) {
                fArr2[i3] = f6;
                i3--;
                f5 = f7;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static boolean m3321a(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null || fArr.length == 0 || fArr2.length == 0 || fArr.length != fArr2.length) {
            return false;
        }
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        if (f < 0.0f || f2 < 0.0f || Float.isNaN(f) || Float.isNaN(f2)) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            if (f >= fArr[i] || f2 > fArr2[i] || Float.isNaN(fArr[i]) || Float.isNaN(fArr2[i])) {
                return false;
            }
            f = fArr[i];
            f2 = fArr2[i];
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m3322a(float[] fArr, int[] iArr) {
        if (fArr == null || iArr == null || fArr.length == 0 || iArr.length == 0 || fArr.length != iArr.length) {
            return false;
        }
        int length = fArr.length;
        float f = fArr[0];
        int i = iArr[0];
        if (f < 0.0f || i < 0 || Float.isNaN(f)) {
            return false;
        }
        for (int i2 = 1; i2 < length; i2++) {
            if (f >= fArr[i2] || i > iArr[i2] || Float.isNaN(fArr[i2])) {
                return false;
            }
            f = fArr[i2];
            i = iArr[i2];
        }
        return true;
    }

    /* renamed from: a */
    public static float[] m3323a(TypedArray typedArray) {
        int length = typedArray.length();
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = typedArray.getFloat(i, -1.0f);
        }
        typedArray.recycle();
        return fArr;
    }

    /* renamed from: a */
    private static float[] m3324a(int[] iArr) {
        float[] fArr = new float[(iArr.length + 1)];
        for (int i = 0; i < iArr.length; i++) {
            fArr[i + 1] = (float) iArr[i];
        }
        return fArr;
    }

    /* renamed from: b */
    private static float m3325b(float f, float f2) {
        return C0714c.m3468b(1.0f * (C0714c.m3464a(f + 0.25f) - C0714c.m3464a(0.25f + f2)));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static float m3326b(float f, float f2, float f3) {
        return C0714c.m3466a((f3 <= 0.1f || f3 >= 0.9f) ? f2 - f3 : f2 == 0.0f ? -1.0f : f2 == 1.0f ? 1.0f : (-C0714c.m3464a(C0714c.m3464a(f2) / C0714c.m3464a(f3))) / C0714c.m3464a(f), -1.0f, 1.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static float m3327b(int i) {
        return ((float) C0714c.m3467a(i, 0, 255)) / 255.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Pair<float[], float[]> m3328b(float[] fArr, float[] fArr2, float f, float f2, float f3, float f4) {
        float[] fArr3;
        float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
        float a = C0714c.m3465a(f4, -C0714c.m3466a(f3, -1.0f, 1.0f));
        if (a != 1.0f) {
            for (int i = 0; i < copyOf.length; i++) {
                copyOf[i] = C0714c.m3465a(copyOf[i], a);
            }
        }
        if (f != -1.0f) {
            Pair<float[], float[]> a2 = m3317a(fArr, copyOf, f, f2);
            fArr3 = (float[]) a2.first;
            copyOf = (float[]) a2.second;
        } else {
            fArr3 = fArr;
        }
        return Pair.create(fArr3, copyOf);
    }

    /* renamed from: a */
    public abstract float mo3449a();

    /* renamed from: a */
    public abstract float mo3450a(float f);

    /* renamed from: a */
    public abstract void mo3451a(float f, float f2);

    /* renamed from: a */
    public abstract boolean mo3452a(C0677c cVar);

    /* renamed from: b */
    public abstract void mo3453b();

    /* renamed from: b */
    public abstract boolean mo3454b(float f);

    /* renamed from: c */
    public abstract boolean mo3455c();

    /* renamed from: d */
    public abstract float mo3456d();

    /* renamed from: e */
    public abstract float mo3457e();
}
