package android.support.p006v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* renamed from: android.support.v4.graphics.drawable.IconCompat */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h */
    static final PorterDuff.Mode f769h = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f770a;

    /* renamed from: b */
    Object f771b;

    /* renamed from: c */
    public byte[] f772c;

    /* renamed from: d */
    public Parcelable f773d;

    /* renamed from: e */
    public int f774e;

    /* renamed from: f */
    public int f775f;

    /* renamed from: g */
    public ColorStateList f776g = null;

    /* renamed from: i */
    PorterDuff.Mode f777i = f769h;

    /* renamed from: j */
    public String f778j;

    /* renamed from: a */
    private static String m1145a(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    private static String m1146a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: b */
    private static int m1147b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: a */
    public String mo1103a() {
        if (this.f770a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1146a((Icon) this.f771b);
        }
        if (this.f770a == 2) {
            return ((String) this.f771b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: a */
    public void mo1104a(boolean z) {
        this.f778j = this.f777i.name();
        switch (this.f770a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f773d = (Parcelable) this.f771b;
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f771b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f772c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f773d = (Parcelable) this.f771b;
                return;
            case 2:
                this.f772c = ((String) this.f771b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f772c = (byte[]) this.f771b;
                return;
            case 4:
                this.f772c = this.f771b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public int mo1105b() {
        if (this.f770a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1147b((Icon) this.f771b);
        }
        if (this.f770a == 2) {
            return this.f774e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: c */
    public void mo1106c() {
        this.f777i = PorterDuff.Mode.valueOf(this.f778j);
        switch (this.f770a) {
            case -1:
                if (this.f773d != null) {
                    this.f771b = this.f773d;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                if (this.f773d != null) {
                    this.f771b = this.f773d;
                    return;
                }
                this.f771b = this.f772c;
                this.f770a = 3;
                this.f774e = 0;
                this.f775f = this.f772c.length;
                return;
            case 2:
            case 4:
                this.f771b = new String(this.f772c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f771b = this.f772c;
                return;
            default:
                return;
        }
    }

    public String toString() {
        if (this.f770a == -1) {
            return String.valueOf(this.f771b);
        }
        StringBuilder append = new StringBuilder("Icon(typ=").append(m1145a(this.f770a));
        switch (this.f770a) {
            case 1:
            case 5:
                append.append(" size=").append(((Bitmap) this.f771b).getWidth()).append("x").append(((Bitmap) this.f771b).getHeight());
                break;
            case 2:
                append.append(" pkg=").append(mo1103a()).append(" id=").append(String.format("0x%08x", new Object[]{Integer.valueOf(mo1105b())}));
                break;
            case 3:
                append.append(" len=").append(this.f774e);
                if (this.f775f != 0) {
                    append.append(" off=").append(this.f775f);
                    break;
                }
                break;
            case 4:
                append.append(" uri=").append(this.f771b);
                break;
        }
        if (this.f776g != null) {
            append.append(" tint=");
            append.append(this.f776g);
        }
        if (this.f777i != f769h) {
            append.append(" mode=").append(this.f777i);
        }
        append.append(")");
        return append.toString();
    }
}
