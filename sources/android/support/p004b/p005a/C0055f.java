package android.support.p004b.p005a;

import android.animation.TypeEvaluator;

/* renamed from: android.support.b.a.f */
public class C0055f implements TypeEvaluator {

    /* renamed from: a */
    private static final C0055f f102a = new C0055f();

    /* renamed from: a */
    public static C0055f m158a() {
        return f102a;
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float pow5 = (float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d);
        float f3 = f2 + (((((float) ((intValue2 >> 24) & 255)) / 255.0f) - f2) * f);
        float f4 = pow + ((pow4 - pow) * f);
        return Integer.valueOf(Math.round(((float) Math.pow((double) (pow3 + ((((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d)) - pow3) * f)), 0.45454545454545453d)) * 255.0f) | (Math.round(f3 * 255.0f) << 24) | (Math.round(((float) Math.pow((double) f4, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow((double) (pow2 + ((pow5 - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8));
    }
}
