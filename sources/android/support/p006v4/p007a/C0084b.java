package android.support.p006v4.p007a;

import android.support.p006v4.p014f.C0204d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.b */
public class C0084b<D> {

    /* renamed from: a */
    int f197a;

    /* renamed from: b */
    C0085a<D> f198b;

    /* renamed from: c */
    boolean f199c;

    /* renamed from: d */
    boolean f200d;

    /* renamed from: e */
    boolean f201e;

    /* renamed from: f */
    boolean f202f;

    /* renamed from: g */
    boolean f203g;

    /* renamed from: android.support.v4.a.b$a */
    public interface C0085a<D> {
    }

    /* renamed from: a */
    public String mo260a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0204d.m880a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo261a() {
        this.f199c = true;
        this.f201e = false;
        this.f200d = false;
        mo264b();
    }

    /* renamed from: a */
    public void mo262a(C0085a<D> aVar) {
        if (this.f198b == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f198b != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f198b = null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo263a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f197a);
        printWriter.print(" mListener=");
        printWriter.println(this.f198b);
        if (this.f199c || this.f202f || this.f203g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f199c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f202f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f203g);
        }
        if (this.f200d || this.f201e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f200d);
            printWriter.print(" mReset=");
            printWriter.println(this.f201e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo264b() {
    }

    /* renamed from: c */
    public boolean mo265c() {
        return mo266d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo266d() {
        return false;
    }

    /* renamed from: e */
    public void mo267e() {
        this.f199c = false;
        mo268f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo268f() {
    }

    /* renamed from: g */
    public void mo269g() {
        this.f200d = true;
        mo270h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo270h() {
    }

    /* renamed from: i */
    public void mo271i() {
        mo272j();
        this.f201e = true;
        this.f199c = false;
        this.f200d = false;
        this.f202f = false;
        this.f203g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo272j() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0204d.m880a(this, sb);
        sb.append(" id=");
        sb.append(this.f197a);
        sb.append("}");
        return sb.toString();
    }
}
