package android.support.p018v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.p006v4.p015g.C0249q;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ba */
public class C0586ba {

    /* renamed from: a */
    private static Method f2139a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f2139a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f2139a.isAccessible()) {
                    f2139a.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static void m2901a(View view, Rect rect, Rect rect2) {
        if (f2139a != null) {
            try {
                f2139a.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2902a(View view) {
        return C0249q.m1059b(view) == 1;
    }

    /* renamed from: b */
    public static void m2903b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            } catch (IllegalAccessException e3) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
            }
        }
    }
}
