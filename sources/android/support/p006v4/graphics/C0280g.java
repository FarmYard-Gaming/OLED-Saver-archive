package android.support.p006v4.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.g */
public class C0280g extends C0279f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1151a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f799a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f805g.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo1158f(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
