package android.support.p006v4.app;

import android.arch.lifecycle.C0025e;
import android.arch.lifecycle.C0032j;
import android.arch.lifecycle.C0033k;
import android.arch.lifecycle.C0037n;
import android.arch.lifecycle.C0038o;
import android.arch.lifecycle.C0040p;
import android.os.Bundle;
import android.support.p006v4.app.C0160t;
import android.support.p006v4.p007a.C0084b;
import android.support.p006v4.p014f.C0204d;
import android.support.p006v4.p014f.C0217l;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
class LoaderManagerImpl extends C0160t {

    /* renamed from: a */
    static boolean f204a = false;

    /* renamed from: b */
    private final C0025e f205b;

    /* renamed from: c */
    private final LoaderViewModel f206c;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends C0037n {

        /* renamed from: a */
        private static final C0038o.C0039a f207a = new C0038o.C0039a() {
            /* renamed from: a */
            public <T extends C0037n> T mo83a(Class<T> cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: b */
        private C0217l<C0089a> f208b = new C0217l<>();

        /* renamed from: c */
        private boolean f209c = false;

        LoaderViewModel() {
        }

        /* renamed from: a */
        static LoaderViewModel m290a(C0040p pVar) {
            return (LoaderViewModel) new C0038o(pVar, f207a).mo81a(LoaderViewModel.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo80a() {
            super.mo80a();
            int b = this.f208b.mo953b();
            for (int i = 0; i < b; i++) {
                this.f208b.mo961e(i).mo285a(true);
            }
            this.f208b.mo956c();
        }

        /* renamed from: a */
        public void mo283a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f208b.mo953b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < this.f208b.mo953b()) {
                        C0089a e = this.f208b.mo961e(i2);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(this.f208b.mo960d(i2));
                        printWriter.print(": ");
                        printWriter.println(e.toString());
                        e.mo286a(str2, fileDescriptor, printWriter, strArr);
                        i = i2 + 1;
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo284b() {
            int b = this.f208b.mo953b();
            for (int i = 0; i < b; i++) {
                this.f208b.mo961e(i).mo288g();
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C0089a<D> extends C0032j<D> implements C0084b.C0085a<D> {

        /* renamed from: a */
        private final int f210a;

        /* renamed from: b */
        private final Bundle f211b;

        /* renamed from: c */
        private final C0084b<D> f212c;

        /* renamed from: d */
        private C0025e f213d;

        /* renamed from: e */
        private C0090b<D> f214e;

        /* renamed from: f */
        private C0084b<D> f215f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0084b<D> mo285a(boolean z) {
            if (LoaderManagerImpl.f204a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f212c.mo265c();
            this.f212c.mo269g();
            C0090b<D> bVar = this.f214e;
            if (bVar != null) {
                mo43a(bVar);
                if (z) {
                    bVar.mo292b();
                }
            }
            this.f212c.mo262a(this);
            if ((bVar == null || bVar.mo291a()) && !z) {
                return this.f212c;
            }
            this.f212c.mo271i();
            return this.f215f;
        }

        /* renamed from: a */
        public void mo43a(C0033k<? super D> kVar) {
            super.mo43a(kVar);
            this.f213d = null;
            this.f214e = null;
        }

        /* renamed from: a */
        public void mo44a(D d) {
            super.mo44a(d);
            if (this.f215f != null) {
                this.f215f.mo271i();
                this.f215f = null;
            }
        }

        /* renamed from: a */
        public void mo286a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f210a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f211b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f212c);
            this.f212c.mo263a(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f214e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f214e);
                this.f214e.mo290a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo287f().mo260a(mo41a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo47d());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo45b() {
            if (LoaderManagerImpl.f204a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f212c.mo261a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo46c() {
            if (LoaderManagerImpl.f204a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f212c.mo267e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0084b<D> mo287f() {
            return this.f212c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo288g() {
            C0025e eVar = this.f213d;
            C0090b<D> bVar = this.f214e;
            if (eVar != null && bVar != null) {
                super.mo43a(bVar);
                mo42a(eVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f210a);
            sb.append(" : ");
            C0204d.m880a(this.f212c, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C0090b<D> implements C0033k<D> {

        /* renamed from: a */
        private final C0084b<D> f216a;

        /* renamed from: b */
        private final C0160t.C0161a<D> f217b;

        /* renamed from: c */
        private boolean f218c;

        /* renamed from: a */
        public void mo69a(D d) {
            if (LoaderManagerImpl.f204a) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f216a + ": " + this.f216a.mo260a(d));
            }
            this.f217b.mo693a(this.f216a, d);
            this.f218c = true;
        }

        /* renamed from: a */
        public void mo290a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f218c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo291a() {
            return this.f218c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo292b() {
            if (this.f218c) {
                if (LoaderManagerImpl.f204a) {
                    Log.v("LoaderManager", "  Resetting: " + this.f216a);
                }
                this.f217b.mo692a(this.f216a);
            }
        }

        public String toString() {
            return this.f217b.toString();
        }
    }

    LoaderManagerImpl(C0025e eVar, C0040p pVar) {
        this.f205b = eVar;
        this.f206c = LoaderViewModel.m290a(pVar);
    }

    /* renamed from: a */
    public void mo280a() {
        this.f206c.mo284b();
    }

    @Deprecated
    /* renamed from: a */
    public void mo281a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f206c.mo283a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0204d.m880a(this.f205b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
