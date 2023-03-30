package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.support.p018v7.p019a.C0353a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v7.widget.aa */
class C0536aa {

    /* renamed from: a */
    private static final RectF f1916a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f1917b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private int f1918c = 0;

    /* renamed from: d */
    private boolean f1919d = false;

    /* renamed from: e */
    private float f1920e = -1.0f;

    /* renamed from: f */
    private float f1921f = -1.0f;

    /* renamed from: g */
    private float f1922g = -1.0f;

    /* renamed from: h */
    private int[] f1923h = new int[0];

    /* renamed from: i */
    private boolean f1924i = false;

    /* renamed from: j */
    private TextPaint f1925j;

    /* renamed from: k */
    private final TextView f1926k;

    /* renamed from: l */
    private final Context f1927l;

    C0536aa(TextView textView) {
        this.f1926k = textView;
        this.f1927l = this.f1926k.getContext();
    }

    /* renamed from: a */
    private int m2608a(RectF rectF) {
        int length = this.f1923h.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 0;
        int i2 = length - 1;
        int i3 = 1;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            if (m2616a(this.f1923h[i4], rectF)) {
                i = i3;
                i3 = i4 + 1;
            } else {
                int i5 = i4 - 1;
                i2 = i5;
                i = i5;
            }
        }
        return this.f1923h[i];
    }

    /* renamed from: a */
    private StaticLayout m2609a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (Build.VERSION.SDK_INT >= 16) {
            floatValue = this.f1926k.getLineSpacingMultiplier();
            floatValue2 = this.f1926k.getLineSpacingExtra();
            booleanValue = this.f1926k.getIncludeFontPadding();
        } else {
            floatValue = ((Float) m2611a((Object) this.f1926k, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) m2611a((Object) this.f1926k, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            booleanValue = ((Boolean) m2611a((Object) this.f1926k, "getIncludeFontPadding", true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f1925j, i, alignment, floatValue, floatValue2, booleanValue);
    }

    /* renamed from: a */
    private StaticLayout m2610a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m2611a((Object) this.f1926k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1925j, i).setAlignment(alignment).setLineSpacing(this.f1926k.getLineSpacingExtra(), this.f1926k.getLineSpacingMultiplier()).setIncludePad(this.f1926k.getIncludeFontPadding()).setBreakStrategy(this.f1926k.getBreakStrategy()).setHyphenationFrequency(this.f1926k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private <T> T m2611a(Object obj, String str, T t) {
        try {
            T invoke = m2612a(str).invoke(obj, new Object[0]);
            if (invoke == null) {
            }
            return invoke;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            if (0 != 0) {
                return null;
            }
            return t;
        } catch (Throwable th) {
            if (!(0 == 0 && 1 == 0)) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private Method m2612a(String str) {
        try {
            Method method = f1917b.get(str);
            if (method != null) {
                return method;
            }
            Method declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0]);
            if (declaredMethod == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f1917b.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m2613a(float f) {
        if (f != this.f1926k.getPaint().getTextSize()) {
            this.f1926k.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1926k.isInLayout() : false;
            if (this.f1926k.getLayout() != null) {
                this.f1919d = false;
                try {
                    Method a = m2612a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f1926k, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1926k.requestLayout();
                } else {
                    this.f1926k.forceLayout();
                }
                this.f1926k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m2614a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size " + "text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f1918c = 1;
            this.f1921f = f;
            this.f1922g = f2;
            this.f1920e = f3;
            this.f1924i = false;
        }
    }

    /* renamed from: a */
    private void m2615a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1923h = m2617a(iArr);
            m2618h();
        }
    }

    /* renamed from: a */
    private boolean m2616a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1926k.getText();
        TransformationMethod transformationMethod = this.f1926k.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1926k)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1926k.getMaxLines() : -1;
        if (this.f1925j == null) {
            this.f1925j = new TextPaint();
        } else {
            this.f1925j.reset();
        }
        this.f1925j.set(this.f1926k.getPaint());
        this.f1925j.setTextSize((float) i);
        Layout.Alignment alignment = (Layout.Alignment) m2611a((Object) this.f1926k, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        StaticLayout a = Build.VERSION.SDK_INT >= 23 ? m2610a(text, alignment, Math.round(rectF.right), maxLines) : m2609a(text, alignment, Math.round(rectF.right));
        if (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) {
            return ((float) a.getHeight()) <= rectF.bottom;
        }
        return false;
    }

    /* renamed from: a */
    private int[] m2617a(int[] iArr) {
        if (r2 != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (r2 != arrayList.size()) {
                int size = arrayList.size();
                iArr = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
            }
        }
        return iArr;
    }

    /* renamed from: h */
    private boolean m2618h() {
        int length = this.f1923h.length;
        this.f1924i = length > 0;
        if (this.f1924i) {
            this.f1918c = 1;
            this.f1921f = (float) this.f1923h[0];
            this.f1922g = (float) this.f1923h[length - 1];
            this.f1920e = -1.0f;
        }
        return this.f1924i;
    }

    /* renamed from: i */
    private boolean m2619i() {
        if (!m2621k() || this.f1918c != 1) {
            this.f1919d = false;
        } else {
            if (!this.f1924i || this.f1923h.length == 0) {
                float round = (float) Math.round(this.f1921f);
                int i = 1;
                while (Math.round(this.f1920e + round) <= Math.round(this.f1922g)) {
                    i++;
                    round += this.f1920e;
                }
                int[] iArr = new int[i];
                float f = this.f1921f;
                int i2 = 0;
                while (i2 < i) {
                    iArr[i2] = Math.round(f);
                    i2++;
                    f = this.f1920e + f;
                }
                this.f1923h = m2617a(iArr);
            }
            this.f1919d = true;
        }
        return this.f1919d;
    }

    /* renamed from: j */
    private void m2620j() {
        this.f1918c = 0;
        this.f1921f = -1.0f;
        this.f1922g = -1.0f;
        this.f1920e = -1.0f;
        this.f1923h = new int[0];
        this.f1919d = false;
    }

    /* renamed from: k */
    private boolean m2621k() {
        return !(this.f1926k instanceof C0614l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2719a() {
        return this.f1918c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2720a(int i) {
        if (m2621k()) {
            switch (i) {
                case 0:
                    m2620j();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f1927l.getResources().getDisplayMetrics();
                    m2614a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m2619i()) {
                        mo2729f();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2721a(int i, float f) {
        m2613a(TypedValue.applyDimension(i, f, (this.f1927l == null ? Resources.getSystem() : this.f1927l.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2722a(int i, int i2, int i3, int i4) {
        if (m2621k()) {
            DisplayMetrics displayMetrics = this.f1927l.getResources().getDisplayMetrics();
            m2614a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m2619i()) {
                mo2729f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2723a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1927l.obtainStyledAttributes(attributeSet, C0353a.C0363j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTextView_autoSizeTextType)) {
            this.f1918c = obtainStyledAttributes.getInt(C0353a.C0363j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0353a.C0363j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0353a.C0363j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0353a.C0363j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0353a.C0363j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C0353a.C0363j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m2615a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m2621k()) {
            this.f1918c = 0;
        } else if (this.f1918c == 1) {
            if (!this.f1924i) {
                DisplayMetrics displayMetrics = this.f1927l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m2614a(dimension2, dimension3, dimension);
            }
            m2619i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2724a(int[] iArr, int i) {
        if (m2621k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1927l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1923h = m2617a(iArr2);
                if (!m2618h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1924i = false;
            }
            if (m2619i()) {
                mo2729f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo2725b() {
        return Math.round(this.f1920e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo2726c() {
        return Math.round(this.f1921f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo2727d() {
        return Math.round(this.f1922g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo2728e() {
        return this.f1923h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2729f() {
        if (mo2730g()) {
            if (this.f1919d) {
                if (this.f1926k.getMeasuredHeight() > 0 && this.f1926k.getMeasuredWidth() > 0) {
                    int measuredWidth = ((Boolean) m2611a((Object) this.f1926k, "getHorizontallyScrolling", false)).booleanValue() ? 1048576 : (this.f1926k.getMeasuredWidth() - this.f1926k.getTotalPaddingLeft()) - this.f1926k.getTotalPaddingRight();
                    int height = (this.f1926k.getHeight() - this.f1926k.getCompoundPaddingBottom()) - this.f1926k.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f1916a) {
                            f1916a.setEmpty();
                            f1916a.right = (float) measuredWidth;
                            f1916a.bottom = (float) height;
                            float a = (float) m2608a(f1916a);
                            if (a != this.f1926k.getTextSize()) {
                                mo2721a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1919d = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo2730g() {
        return m2621k() && this.f1918c != 0;
    }
}
