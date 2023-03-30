package android.support.p006v4.p013e;

import android.os.Build;
import android.support.p006v4.p014f.C0214i;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.e.a */
public class C0196a implements Spannable {

    /* renamed from: a */
    private static final Object f634a = new Object();

    /* renamed from: b */
    private static Executor f635b = null;

    /* renamed from: c */
    private final Spannable f636c;

    /* renamed from: d */
    private final C0197a f637d;

    /* renamed from: e */
    private final PrecomputedText f638e;

    /* renamed from: android.support.v4.e.a$a */
    public static final class C0197a {

        /* renamed from: a */
        final PrecomputedText.Params f639a;

        /* renamed from: b */
        private final TextPaint f640b;

        /* renamed from: c */
        private final TextDirectionHeuristic f641c;

        /* renamed from: d */
        private final int f642d;

        /* renamed from: e */
        private final int f643e;

        /* renamed from: android.support.v4.e.a$a$a */
        public static class C0198a {

            /* renamed from: a */
            private final TextPaint f644a;

            /* renamed from: b */
            private TextDirectionHeuristic f645b;

            /* renamed from: c */
            private int f646c;

            /* renamed from: d */
            private int f647d;

            public C0198a(TextPaint textPaint) {
                this.f644a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f646c = 1;
                    this.f647d = 1;
                } else {
                    this.f647d = 0;
                    this.f646c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f645b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f645b = null;
                }
            }

            /* renamed from: a */
            public C0198a mo808a(int i) {
                this.f646c = i;
                return this;
            }

            /* renamed from: a */
            public C0198a mo809a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f645b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C0197a mo810a() {
                return new C0197a(this.f644a, this.f645b, this.f646c, this.f647d);
            }

            /* renamed from: b */
            public C0198a mo811b(int i) {
                this.f647d = i;
                return this;
            }
        }

        public C0197a(PrecomputedText.Params params) {
            this.f640b = params.getTextPaint();
            this.f641c = params.getTextDirection();
            this.f642d = params.getBreakStrategy();
            this.f643e = params.getHyphenationFrequency();
            this.f639a = params;
        }

        C0197a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f639a = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f639a = null;
            }
            this.f640b = textPaint;
            this.f641c = textDirectionHeuristic;
            this.f642d = i;
            this.f643e = i2;
        }

        /* renamed from: a */
        public TextPaint mo801a() {
            return this.f640b;
        }

        /* renamed from: b */
        public TextDirectionHeuristic mo802b() {
            return this.f641c;
        }

        /* renamed from: c */
        public int mo803c() {
            return this.f642d;
        }

        /* renamed from: d */
        public int mo804d() {
            return this.f643e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0197a)) {
                return false;
            }
            C0197a aVar = (C0197a) obj;
            if (this.f639a != null) {
                return this.f639a.equals(aVar.f639a);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.f642d != aVar.mo803c()) {
                    return false;
                }
                if (this.f643e != aVar.mo804d()) {
                    return false;
                }
            }
            if (Build.VERSION.SDK_INT >= 18 && this.f641c != aVar.mo802b()) {
                return false;
            }
            if (this.f640b.getTextSize() != aVar.mo801a().getTextSize()) {
                return false;
            }
            if (this.f640b.getTextScaleX() != aVar.mo801a().getTextScaleX()) {
                return false;
            }
            if (this.f640b.getTextSkewX() != aVar.mo801a().getTextSkewX()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f640b.getLetterSpacing() != aVar.mo801a().getLetterSpacing()) {
                    return false;
                }
                if (!TextUtils.equals(this.f640b.getFontFeatureSettings(), aVar.mo801a().getFontFeatureSettings())) {
                    return false;
                }
            }
            if (this.f640b.getFlags() != aVar.mo801a().getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.f640b.getTextLocales().equals(aVar.mo801a().getTextLocales())) {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT >= 17 && !this.f640b.getTextLocale().equals(aVar.mo801a().getTextLocale())) {
                return false;
            }
            return this.f640b.getTypeface() == null ? aVar.mo801a().getTypeface() == null : this.f640b.getTypeface().equals(aVar.mo801a().getTypeface());
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return C0214i.m920a(Float.valueOf(this.f640b.getTextSize()), Float.valueOf(this.f640b.getTextScaleX()), Float.valueOf(this.f640b.getTextSkewX()), Float.valueOf(this.f640b.getLetterSpacing()), Integer.valueOf(this.f640b.getFlags()), this.f640b.getTextLocales(), this.f640b.getTypeface(), Boolean.valueOf(this.f640b.isElegantTextHeight()), this.f641c, Integer.valueOf(this.f642d), Integer.valueOf(this.f643e));
            } else if (Build.VERSION.SDK_INT >= 21) {
                return C0214i.m920a(Float.valueOf(this.f640b.getTextSize()), Float.valueOf(this.f640b.getTextScaleX()), Float.valueOf(this.f640b.getTextSkewX()), Float.valueOf(this.f640b.getLetterSpacing()), Integer.valueOf(this.f640b.getFlags()), this.f640b.getTextLocale(), this.f640b.getTypeface(), Boolean.valueOf(this.f640b.isElegantTextHeight()), this.f641c, Integer.valueOf(this.f642d), Integer.valueOf(this.f643e));
            } else if (Build.VERSION.SDK_INT >= 18) {
                return C0214i.m920a(Float.valueOf(this.f640b.getTextSize()), Float.valueOf(this.f640b.getTextScaleX()), Float.valueOf(this.f640b.getTextSkewX()), Integer.valueOf(this.f640b.getFlags()), this.f640b.getTextLocale(), this.f640b.getTypeface(), this.f641c, Integer.valueOf(this.f642d), Integer.valueOf(this.f643e));
            } else if (Build.VERSION.SDK_INT >= 17) {
                return C0214i.m920a(Float.valueOf(this.f640b.getTextSize()), Float.valueOf(this.f640b.getTextScaleX()), Float.valueOf(this.f640b.getTextSkewX()), Integer.valueOf(this.f640b.getFlags()), this.f640b.getTextLocale(), this.f640b.getTypeface(), this.f641c, Integer.valueOf(this.f642d), Integer.valueOf(this.f643e));
            } else {
                return C0214i.m920a(Float.valueOf(this.f640b.getTextSize()), Float.valueOf(this.f640b.getTextScaleX()), Float.valueOf(this.f640b.getTextSkewX()), Integer.valueOf(this.f640b.getFlags()), this.f640b.getTypeface(), this.f641c, Integer.valueOf(this.f642d), Integer.valueOf(this.f643e));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f640b.getTextSize());
            sb.append(", textScaleX=" + this.f640b.getTextScaleX());
            sb.append(", textSkewX=" + this.f640b.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f640b.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f640b.isElegantTextHeight());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.f640b.getTextLocales());
            } else if (Build.VERSION.SDK_INT >= 17) {
                sb.append(", textLocale=" + this.f640b.getTextLocale());
            }
            sb.append(", typeface=" + this.f640b.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f640b.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f641c);
            sb.append(", breakStrategy=" + this.f642d);
            sb.append(", hyphenationFrequency=" + this.f643e);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public PrecomputedText mo788a() {
        if (this.f636c instanceof PrecomputedText) {
            return (PrecomputedText) this.f636c;
        }
        return null;
    }

    /* renamed from: b */
    public C0197a mo789b() {
        return this.f637d;
    }

    public char charAt(int i) {
        return this.f636c.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f636c.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f636c.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f636c.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 28 ? this.f638e.getSpans(i, i2, cls) : this.f636c.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f636c.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f636c.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f638e.removeSpan(obj);
        } else {
            this.f636c.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f638e.setSpan(obj, i, i2, i3);
        } else {
            this.f636c.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f636c.subSequence(i, i2);
    }

    public String toString() {
        return this.f636c.toString();
    }
}
