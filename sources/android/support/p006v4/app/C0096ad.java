package android.support.p006v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0021c;
import android.arch.lifecycle.C0025e;
import android.arch.lifecycle.C0026f;
import android.arch.lifecycle.C0035m;
import android.os.Bundle;
import android.support.p006v4.p014f.C0216k;
import android.support.p006v4.p015g.C0236e;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v4.app.ad */
public class C0096ad extends Activity implements C0025e, C0236e.C0237a {

    /* renamed from: a */
    private C0216k<Class<? extends Object>, Object> f226a = new C0216k<>();

    /* renamed from: b */
    private C0026f f227b = new C0026f(this);

    /* renamed from: a */
    public C0021c mo64a() {
        return this.f227b;
    }

    /* renamed from: a */
    public boolean mo304a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0236e.m1012a(decorView, keyEvent)) {
            return C0236e.m1011a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0236e.m1012a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0035m.m116a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f227b.mo66a(C0021c.C0023b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
