package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.o */
public class C0038o {

    /* renamed from: a */
    private final C0039a f73a;

    /* renamed from: b */
    private final C0040p f74b;

    /* renamed from: android.arch.lifecycle.o$a */
    public interface C0039a {
        /* renamed from: a */
        <T extends C0037n> T mo83a(Class<T> cls);
    }

    public C0038o(C0040p pVar, C0039a aVar) {
        this.f73a = aVar;
        this.f74b = pVar;
    }

    /* renamed from: a */
    public <T extends C0037n> T mo81a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo82a("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0037n> T mo82a(String str, Class<T> cls) {
        T a = this.f74b.mo84a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        if (a != null) {
        }
        T a2 = this.f73a.mo83a(cls);
        this.f74b.mo86a(str, a2);
        return a2;
    }
}
