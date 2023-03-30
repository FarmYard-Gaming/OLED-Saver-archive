package android.support.p006v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.p006v4.p014f.C0215j;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.j */
public abstract class C0119j<E> extends C0117h {

    /* renamed from: a */
    private final Activity f359a;

    /* renamed from: b */
    final C0123l f360b;

    /* renamed from: c */
    private final Context f361c;

    /* renamed from: d */
    private final Handler f362d;

    /* renamed from: e */
    private final int f363e;

    C0119j(Activity activity, Context context, Handler handler, int i) {
        this.f360b = new C0123l();
        this.f359a = activity;
        this.f361c = (Context) C0215j.m923a(context, "context == null");
        this.f362d = (Handler) C0215j.m923a(handler, "handler == null");
        this.f363e = i;
    }

    C0119j(C0113g gVar) {
        this(gVar, gVar, gVar.f343a, 0);
    }

    /* renamed from: a */
    public View mo447a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo486a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo448a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo487a(C0106f fVar) {
        return true;
    }

    /* renamed from: b */
    public LayoutInflater mo488b() {
        return LayoutInflater.from(this.f361c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo489b(C0106f fVar) {
    }

    /* renamed from: c */
    public void mo490c() {
    }

    /* renamed from: d */
    public boolean mo491d() {
        return true;
    }

    /* renamed from: e */
    public int mo492e() {
        return this.f363e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Activity mo518f() {
        return this.f359a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Context mo519g() {
        return this.f361c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Handler mo520h() {
        return this.f362d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0123l mo521i() {
        return this.f360b;
    }
}
