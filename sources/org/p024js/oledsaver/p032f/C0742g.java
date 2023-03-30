package org.p024js.oledsaver.p032f;

import android.content.Context;
import android.widget.Switch;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p025a.C0648b;
import org.p024js.oledsaver.p025a.C0651c;

/* renamed from: org.js.oledsaver.f.g */
public class C0742g extends C0733b {
    public C0742g(Context context) {
        super(context, R.layout.wizard_write_setting);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3535a(int i) {
        super.mo3535a(i);
        this.f2631c = new String[]{this.f2629a.getResources().getString(R.string.wizrad_write_settings)};
    }

    /* renamed from: b */
    public String mo3536b(int i) {
        switch (i) {
            case 0:
                C0651c.m3186a(this.f2630b.findViewById(R.id.wizard_settings_switch)).mo3329f().mo3315a(2000).mo3317a((C0648b.C0650b) new C0648b.C0650b() {
                    /* renamed from: a */
                    public void mo3333a() {
                        ((Switch) C0742g.this.f2630b.findViewById(R.id.wizard_settings_switch)).setChecked(true);
                    }
                }).mo3321b(500).mo3325c();
                break;
        }
        return super.mo3536b(i);
    }
}
