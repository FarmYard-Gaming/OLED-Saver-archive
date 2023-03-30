package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.c */
public abstract class C0021c {

    /* renamed from: android.arch.lifecycle.c$a */
    public enum C0022a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: android.arch.lifecycle.c$b */
    public enum C0023b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo63a(C0023b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract C0023b mo60a();

    /* renamed from: a */
    public abstract void mo61a(C0024d dVar);

    /* renamed from: b */
    public abstract void mo62b(C0024d dVar);
}
