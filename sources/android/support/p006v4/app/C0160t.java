package android.support.p006v4.app;

import android.arch.lifecycle.C0025e;
import android.arch.lifecycle.C0041q;
import android.support.p006v4.p007a.C0084b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.t */
public abstract class C0160t {

    /* renamed from: android.support.v4.app.t$a */
    public interface C0161a<D> {
        /* renamed from: a */
        void mo692a(C0084b<D> bVar);

        /* renamed from: a */
        void mo693a(C0084b<D> bVar, D d);
    }

    /* renamed from: a */
    public static <T extends C0025e & C0041q> C0160t m740a(T t) {
        return new LoaderManagerImpl(t, ((C0041q) t).mo87b());
    }

    /* renamed from: a */
    public abstract void mo280a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo281a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
