package android.support.p018v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p006v4.p015g.C0236e;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.C0437b;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.g */
public class C0405g extends Dialog implements C0385d {

    /* renamed from: a */
    private C0386e f1209a;

    /* renamed from: b */
    private final C0236e.C0237a f1210b = new C0236e.C0237a() {
        /* renamed from: a */
        public boolean mo304a(KeyEvent keyEvent) {
            return C0405g.this.mo1696a(keyEvent);
        }
    };

    public C0405g(Context context, int i) {
        super(context, m1850a(context, i));
        mo1694a().mo1610a((Bundle) null);
        mo1694a().mo1626i();
    }

    /* renamed from: a */
    private static int m1850a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0353a.C0354a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0386e mo1694a() {
        if (this.f1209a == null) {
            this.f1209a = C0386e.m1729a((Dialog) this, (C0385d) this);
        }
        return this.f1209a;
    }

    /* renamed from: a */
    public C0437b mo1580a(C0437b.C0438a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo1582a(C0437b bVar) {
    }

    /* renamed from: a */
    public boolean mo1695a(int i) {
        return mo1694a().mo1620c(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1696a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1694a().mo1617b(view, layoutParams);
    }

    /* renamed from: b */
    public void mo1587b(C0437b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0236e.m1011a(this.f1210b, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo1694a().mo1608a(i);
    }

    public void invalidateOptionsMenu() {
        mo1694a().mo1623f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo1694a().mo1625h();
        super.onCreate(bundle);
        mo1694a().mo1610a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo1694a().mo1621d();
    }

    public void setContentView(int i) {
        mo1694a().mo1615b(i);
    }

    public void setContentView(View view) {
        mo1694a().mo1611a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo1694a().mo1612a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo1694a().mo1613a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo1694a().mo1613a(charSequence);
    }
}
