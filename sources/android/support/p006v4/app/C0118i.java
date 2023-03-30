package android.support.p006v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.i */
public class C0118i {

    /* renamed from: a */
    private final C0119j<?> f358a;

    private C0118i(C0119j<?> jVar) {
        this.f358a = jVar;
    }

    /* renamed from: a */
    public static C0118i m488a(C0119j<?> jVar) {
        return new C0118i(jVar);
    }

    /* renamed from: a */
    public C0106f mo493a(String str) {
        return this.f358a.f360b.mo565b(str);
    }

    /* renamed from: a */
    public C0120k mo494a() {
        return this.f358a.mo521i();
    }

    /* renamed from: a */
    public View mo495a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f358a.f360b.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void mo496a(Configuration configuration) {
        this.f358a.f360b.mo546a(configuration);
    }

    /* renamed from: a */
    public void mo497a(Parcelable parcelable, C0139m mVar) {
        this.f358a.f360b.mo548a(parcelable, mVar);
    }

    /* renamed from: a */
    public void mo498a(C0106f fVar) {
        this.f358a.f360b.mo557a((C0119j) this.f358a, (C0117h) this.f358a, fVar);
    }

    /* renamed from: a */
    public void mo499a(boolean z) {
        this.f358a.f360b.mo558a(z);
    }

    /* renamed from: a */
    public boolean mo500a(Menu menu) {
        return this.f358a.f360b.mo560a(menu);
    }

    /* renamed from: a */
    public boolean mo501a(Menu menu, MenuInflater menuInflater) {
        return this.f358a.f360b.mo561a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo502a(MenuItem menuItem) {
        return this.f358a.f360b.mo562a(menuItem);
    }

    /* renamed from: b */
    public void mo503b() {
        this.f358a.f360b.mo599l();
    }

    /* renamed from: b */
    public void mo504b(Menu menu) {
        this.f358a.f360b.mo570b(menu);
    }

    /* renamed from: b */
    public void mo505b(boolean z) {
        this.f358a.f360b.mo571b(z);
    }

    /* renamed from: b */
    public boolean mo506b(MenuItem menuItem) {
        return this.f358a.f360b.mo572b(menuItem);
    }

    /* renamed from: c */
    public Parcelable mo507c() {
        return this.f358a.f360b.mo597k();
    }

    /* renamed from: d */
    public C0139m mo508d() {
        return this.f358a.f360b.mo593i();
    }

    /* renamed from: e */
    public void mo509e() {
        this.f358a.f360b.mo601m();
    }

    /* renamed from: f */
    public void mo510f() {
        this.f358a.f360b.mo604n();
    }

    /* renamed from: g */
    public void mo511g() {
        this.f358a.f360b.mo605o();
    }

    /* renamed from: h */
    public void mo512h() {
        this.f358a.f360b.mo609p();
    }

    /* renamed from: i */
    public void mo513i() {
        this.f358a.f360b.mo610q();
    }

    /* renamed from: j */
    public void mo514j() {
        this.f358a.f360b.mo611r();
    }

    /* renamed from: k */
    public void mo515k() {
        this.f358a.f360b.mo613t();
    }

    /* renamed from: l */
    public void mo516l() {
        this.f358a.f360b.mo615u();
    }

    /* renamed from: m */
    public boolean mo517m() {
        return this.f358a.f360b.mo586f();
    }
}
