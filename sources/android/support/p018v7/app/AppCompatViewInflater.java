package android.support.p018v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p006v4.p014f.C0199a;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.C0440d;
import android.support.p018v7.widget.C0572ar;
import android.support.p018v7.widget.C0602e;
import android.support.p018v7.widget.C0604g;
import android.support.p018v7.widget.C0605h;
import android.support.p018v7.widget.C0606i;
import android.support.p018v7.widget.C0614l;
import android.support.p018v7.widget.C0616n;
import android.support.p018v7.widget.C0618p;
import android.support.p018v7.widget.C0619q;
import android.support.p018v7.widget.C0622t;
import android.support.p018v7.widget.C0623u;
import android.support.p018v7.widget.C0624v;
import android.support.p018v7.widget.C0626x;
import android.support.p018v7.widget.C0635z;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
public class AppCompatViewInflater {

    /* renamed from: a */
    private static final Class<?>[] f1106a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f1107b = {16843375};

    /* renamed from: c */
    private static final String[] f1108c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f1109d = new C0199a();

    /* renamed from: e */
    private final Object[] f1110e = new Object[2];

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    private static class C0377a implements View.OnClickListener {

        /* renamed from: a */
        private final View f1111a;

        /* renamed from: b */
        private final String f1112b;

        /* renamed from: c */
        private Method f1113c;

        /* renamed from: d */
        private Context f1114d;

        public C0377a(View view, String str) {
            this.f1111a = view;
            this.f1112b = str;
        }

        /* renamed from: a */
        private void m1678a(Context context, String str) {
            Method method;
            for (Context context2 = context; context2 != null; context2 = context2 instanceof ContextWrapper ? ((ContextWrapper) context2).getBaseContext() : null) {
                try {
                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.f1112b, new Class[]{View.class})) != null) {
                        this.f1113c = method;
                        this.f1114d = context2;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
            }
            int id = this.f1111a.getId();
            throw new IllegalStateException("Could not find method " + this.f1112b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f1111a.getClass() + (id == -1 ? "" : " with id '" + this.f1111a.getContext().getResources().getResourceEntryName(id) + "'"));
        }

        public void onClick(View view) {
            if (this.f1113c == null) {
                m1678a(this.f1111a.getContext(), this.f1112b);
            }
            try {
                this.f1113c.invoke(this.f1114d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private static Context m1658a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0353a.C0363j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0353a.C0363j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0353a.C0363j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        int i = resourceId;
        obtainStyledAttributes.recycle();
        return i != 0 ? (!(context instanceof C0440d) || ((C0440d) context).mo1877a() != i) ? new C0440d(context, i) : context : context;
    }

    /* renamed from: a */
    private View m1659a(Context context, String str, String str2) {
        Constructor<? extends U> constructor = f1109d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f1106a);
                f1109d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1110e);
    }

    /* renamed from: a */
    private void m1660a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0249q.m1072n(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1107b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0377a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m1661a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private View m1662b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.f1110e[0] = context;
            this.f1110e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f1108c) {
                    View a2 = m1659a(context, str, a);
                    if (a2 != null) {
                        this.f1110e[0] = null;
                        this.f1110e[1] = null;
                        return a2;
                    }
                }
                this.f1110e[0] = null;
                this.f1110e[1] = null;
                return null;
            }
            View a3 = m1659a(context, str, (String) null);
            this.f1110e[0] = null;
            this.f1110e[1] = null;
            return a3;
        } catch (Exception e) {
            this.f1110e[0] = null;
            this.f1110e[1] = null;
            return null;
        } catch (Throwable th) {
            this.f1110e[0] = null;
            this.f1110e[1] = null;
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0635z mo1529a(Context context, AttributeSet attributeSet) {
        return new C0635z(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo1530a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo1531a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View m;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m1658a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0572ar.m2814a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m = mo1529a(context2, attributeSet);
                m1661a(m, str);
                break;
            case 1:
                m = mo1532b(context2, attributeSet);
                m1661a(m, str);
                break;
            case 2:
                m = mo1533c(context2, attributeSet);
                m1661a(m, str);
                break;
            case 3:
                m = mo1534d(context2, attributeSet);
                m1661a(m, str);
                break;
            case 4:
                m = mo1535e(context2, attributeSet);
                m1661a(m, str);
                break;
            case 5:
                m = mo1536f(context2, attributeSet);
                m1661a(m, str);
                break;
            case 6:
                m = mo1537g(context2, attributeSet);
                m1661a(m, str);
                break;
            case 7:
                m = mo1538h(context2, attributeSet);
                m1661a(m, str);
                break;
            case 8:
                m = mo1539i(context2, attributeSet);
                m1661a(m, str);
                break;
            case 9:
                m = mo1540j(context2, attributeSet);
                m1661a(m, str);
                break;
            case 10:
                m = mo1541k(context2, attributeSet);
                m1661a(m, str);
                break;
            case 11:
                m = mo1542l(context2, attributeSet);
                m1661a(m, str);
                break;
            case 12:
                m = mo1543m(context2, attributeSet);
                m1661a(m, str);
                break;
            default:
                m = mo1530a(context2, str, attributeSet);
                break;
        }
        View b = (m != null || context == context2) ? m : m1662b(context2, str, attributeSet);
        if (b != null) {
            m1660a(b, attributeSet);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0618p mo1532b(Context context, AttributeSet attributeSet) {
        return new C0618p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0604g mo1533c(Context context, AttributeSet attributeSet) {
        return new C0604g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0614l mo1534d(Context context, AttributeSet attributeSet) {
        return new C0614l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0626x mo1535e(Context context, AttributeSet attributeSet) {
        return new C0626x(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0616n mo1536f(Context context, AttributeSet attributeSet) {
        return new C0616n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0605h mo1537g(Context context, AttributeSet attributeSet) {
        return new C0605h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0622t mo1538h(Context context, AttributeSet attributeSet) {
        return new C0622t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0606i mo1539i(Context context, AttributeSet attributeSet) {
        return new C0606i(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0602e mo1540j(Context context, AttributeSet attributeSet) {
        return new C0602e(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0619q mo1541k(Context context, AttributeSet attributeSet) {
        return new C0619q(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0623u mo1542l(Context context, AttributeSet attributeSet) {
        return new C0623u(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0624v mo1543m(Context context, AttributeSet attributeSet) {
        return new C0624v(context, attributeSet);
    }
}
