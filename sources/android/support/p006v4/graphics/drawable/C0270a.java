package android.support.p006v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.graphics.drawable.a */
public final class C0270a {

    /* renamed from: a */
    private static Method f779a;

    /* renamed from: b */
    private static boolean f780b;

    /* renamed from: c */
    private static Method f781c;

    /* renamed from: d */
    private static boolean f782d;

    @Deprecated
    /* renamed from: a */
    public static void m1152a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: a */
    public static void m1153a(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m1154a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C0271b) {
            ((C0271b) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m1155a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m1156a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C0271b) {
            ((C0271b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1157a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m1158a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: a */
    public static void m1159a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C0271b) {
            ((C0271b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m1160a(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: b */
    public static boolean m1161b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m1162b(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!f780b) {
            Class<Drawable> cls = Drawable.class;
            try {
                f779a = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f779a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f780b = true;
        }
        if (f779a != null) {
            try {
                f779a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f779a = null;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static int m1163c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m1164d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: e */
    public static ColorFilter m1165e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: f */
    public static Drawable m1166f(Drawable drawable) {
        return Build.VERSION.SDK_INT >= 23 ? drawable : Build.VERSION.SDK_INT >= 21 ? !(drawable instanceof C0271b) ? new C0276e(drawable) : drawable : !(drawable instanceof C0271b) ? new C0273d(drawable) : drawable;
    }

    /* renamed from: g */
    public static int m1167g(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!f782d) {
            try {
                f781c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f781c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f782d = true;
        }
        if (f781c != null) {
            try {
                return ((Integer) f781c.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f781c = null;
            }
        }
        return 0;
    }
}
