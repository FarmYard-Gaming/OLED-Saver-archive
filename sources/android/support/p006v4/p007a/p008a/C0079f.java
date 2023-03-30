package android.support.p006v4.p007a.p008a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.p006v4.graphics.C0268c;
import android.support.p006v4.p007a.p008a.C0071c;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.a.a.f */
public final class C0079f {

    /* renamed from: android.support.v4.a.a.f$a */
    public static abstract class C0080a {
        /* renamed from: a */
        public abstract void mo254a(int i);

        /* renamed from: a */
        public final void mo255a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    C0080a.this.mo254a(i);
                }
            });
        }

        /* renamed from: a */
        public abstract void mo256a(Typeface typeface);

        /* renamed from: a */
        public final void mo257a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    C0080a.this.mo256a(typeface);
                }
            });
        }
    }

    /* renamed from: a */
    public static Typeface m253a(Context context, int i, TypedValue typedValue, int i2, C0080a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m254a(context, i, typedValue, i2, aVar, (Handler) null, true);
    }

    /* renamed from: a */
    private static Typeface m254a(Context context, int i, TypedValue typedValue, int i2, C0080a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m255a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* renamed from: a */
    private static Typeface m255a(Context context, Resources resources, TypedValue typedValue, int i, int i2, C0080a aVar, Handler handler, boolean z) {
        if (typedValue.string == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence = typedValue.string.toString();
        if (!charSequence.startsWith("res/")) {
            if (aVar != null) {
                aVar.mo255a(-3, handler);
            }
            return null;
        }
        Typeface a = C0268c.m1141a(resources, i, i2);
        if (a == null) {
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    C0071c.C0072a a2 = C0071c.m229a((XmlPullParser) resources.getXml(i), resources);
                    if (a2 != null) {
                        return C0268c.m1140a(context, a2, resources, i, i2, aVar, handler, z);
                    }
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    if (aVar != null) {
                        aVar.mo255a(-3, handler);
                    }
                    return null;
                }
                Typeface a3 = C0268c.m1138a(context, resources, i, charSequence, i2);
                if (aVar == null) {
                    return a3;
                }
                if (a3 != null) {
                    aVar.mo257a(a3, handler);
                    return a3;
                }
                aVar.mo255a(-3, handler);
                return a3;
            } catch (XmlPullParserException e) {
                Log.e("ResourcesCompat", "Failed to parse xml resource " + charSequence, e);
            } catch (IOException e2) {
                Log.e("ResourcesCompat", "Failed to read xml resource " + charSequence, e2);
            }
        } else if (aVar == null) {
            return a;
        } else {
            aVar.mo257a(a, handler);
            return a;
        }
        if (aVar != null) {
            aVar.mo255a(-3, handler);
        }
        return null;
    }

    /* renamed from: a */
    public static Drawable m256a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }
}
