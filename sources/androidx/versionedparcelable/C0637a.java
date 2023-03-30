package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C0637a {
    /* renamed from: a */
    protected static <T extends C0639c> T m3081a(String str, C0637a aVar) {
        try {
            return (C0639c) Class.forName(str, true, C0637a.class.getClassLoader()).getDeclaredMethod("read", new Class[]{C0637a.class}).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    private static Class m3082a(Class<? extends C0639c> cls) {
        return Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }

    /* renamed from: a */
    protected static <T extends C0639c> void m3083a(T t, C0637a aVar) {
        try {
            m3085c(t).getDeclaredMethod("write", new Class[]{t.getClass(), C0637a.class}).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    private void m3084b(C0639c cVar) {
        try {
            mo3247a(m3082a((Class<? extends C0639c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private static <T extends C0639c> Class m3085c(T t) {
        return m3082a((Class<? extends C0639c>) t.getClass());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3241a(int i);

    /* renamed from: a */
    public void mo3242a(int i, int i2) {
        mo3261c(i2);
        mo3241a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3243a(Parcelable parcelable);

    /* renamed from: a */
    public void mo3244a(Parcelable parcelable, int i) {
        mo3261c(i);
        mo3243a(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3245a(C0639c cVar) {
        if (cVar == null) {
            mo3247a((String) null);
            return;
        }
        m3084b(cVar);
        C0637a c = mo3260c();
        m3083a(cVar, c);
        c.mo3257b();
    }

    /* renamed from: a */
    public void mo3246a(C0639c cVar, int i) {
        mo3261c(i);
        mo3245a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3247a(String str);

    /* renamed from: a */
    public void mo3248a(String str, int i) {
        mo3261c(i);
        mo3247a(str);
    }

    /* renamed from: a */
    public void mo3249a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3250a(byte[] bArr);

    /* renamed from: a */
    public void mo3251a(byte[] bArr, int i) {
        mo3261c(i);
        mo3250a(bArr);
    }

    /* renamed from: a */
    public boolean mo3252a() {
        return false;
    }

    /* renamed from: b */
    public int mo3253b(int i, int i2) {
        return !mo3258b(i2) ? i : mo3262d();
    }

    /* renamed from: b */
    public <T extends Parcelable> T mo3254b(T t, int i) {
        return !mo3258b(i) ? t : mo3265g();
    }

    /* renamed from: b */
    public <T extends C0639c> T mo3255b(T t, int i) {
        return !mo3258b(i) ? t : mo3266h();
    }

    /* renamed from: b */
    public String mo3256b(String str, int i) {
        return !mo3258b(i) ? str : mo3263e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3257b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo3258b(int i);

    /* renamed from: b */
    public byte[] mo3259b(byte[] bArr, int i) {
        return !mo3258b(i) ? bArr : mo3264f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C0637a mo3260c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo3261c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo3262d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo3263e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract byte[] mo3264f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract <T extends Parcelable> T mo3265g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends C0639c> T mo3266h() {
        String e = mo3263e();
        if (e == null) {
            return null;
        }
        return m3081a(e, mo3260c());
    }
}
