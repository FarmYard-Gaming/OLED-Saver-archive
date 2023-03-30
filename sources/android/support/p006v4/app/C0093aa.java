package android.support.p006v4.app;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

/* renamed from: android.support.v4.app.aa */
public final class C0093aa {

    /* renamed from: a */
    private final String f220a;

    /* renamed from: b */
    private final CharSequence f221b;

    /* renamed from: c */
    private final CharSequence[] f222c;

    /* renamed from: d */
    private final boolean f223d;

    /* renamed from: e */
    private final Bundle f224e;

    /* renamed from: f */
    private final Set<String> f225f;

    /* renamed from: a */
    static RemoteInput m310a(C0093aa aaVar) {
        return new RemoteInput.Builder(aaVar.mo295a()).setLabel(aaVar.mo296b()).setChoices(aaVar.mo297c()).setAllowFreeFormInput(aaVar.mo299e()).addExtras(aaVar.mo300f()).build();
    }

    /* renamed from: a */
    static RemoteInput[] m311a(C0093aa[] aaVarArr) {
        if (aaVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[aaVarArr.length];
        for (int i = 0; i < aaVarArr.length; i++) {
            remoteInputArr[i] = m310a(aaVarArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: a */
    public String mo295a() {
        return this.f220a;
    }

    /* renamed from: b */
    public CharSequence mo296b() {
        return this.f221b;
    }

    /* renamed from: c */
    public CharSequence[] mo297c() {
        return this.f222c;
    }

    /* renamed from: d */
    public Set<String> mo298d() {
        return this.f225f;
    }

    /* renamed from: e */
    public boolean mo299e() {
        return this.f223d;
    }

    /* renamed from: f */
    public Bundle mo300f() {
        return this.f224e;
    }
}
