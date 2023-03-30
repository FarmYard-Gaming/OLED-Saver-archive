package android.support.p018v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.support.p006v4.graphics.drawable.C0272c;
import android.support.p018v7.p022c.p023a.C0433c;

/* renamed from: android.support.v7.widget.ad */
public class C0539ad {

    /* renamed from: a */
    public static final Rect f1928a = new Rect();

    /* renamed from: b */
    private static Class<?> f1929b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1929b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    /* renamed from: a */
    public static PorterDuff.Mode m2673a(int i, PorterDuff.Mode mode) {
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

    /* renamed from: a */
    static void m2674a(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m2676c(drawable);
        }
    }

    /* renamed from: b */
    public static boolean m2675b(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable b : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!m2675b(b)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof C0272c) {
            return m2675b(((C0272c) drawable).mo1108a());
        } else {
            if (drawable instanceof C0433c) {
                return m2675b(((C0433c) drawable).mo1828a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m2675b(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    /* renamed from: c */
    private static void m2676c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C0570ap.f2076e);
        } else {
            drawable.setState(C0570ap.f2079h);
        }
        drawable.setState(state);
    }
}
