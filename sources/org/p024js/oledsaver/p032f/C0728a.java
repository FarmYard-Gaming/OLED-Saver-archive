package org.p024js.oledsaver.p032f;

import android.content.Context;
import android.view.View;
import android.widget.Switch;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p025a.C0648b;
import org.p024js.oledsaver.p025a.C0651c;

/* renamed from: org.js.oledsaver.f.a */
public class C0728a extends C0733b {
    public C0728a(Context context) {
        super(context, R.layout.wizard_accessibility);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3535a(int i) {
        super.mo3535a(i);
        this.f2630b.findViewById(R.id.wizard_accessiablity_step1_click).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C0728a.this.f2630b.findViewById(R.id.wizard_accessibllity_step1).setVisibility(8);
                C0728a.this.f2630b.findViewById(R.id.wizard_accessibllity_step2).setVisibility(0);
            }
        });
        this.f2630b.findViewById(R.id.wizard_accessibllity_step2_back).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C0728a.this.f2630b.findViewById(R.id.wizard_accessibllity_step1).setVisibility(0);
                C0728a.this.f2630b.findViewById(R.id.wizard_accessibllity_step2).setVisibility(8);
            }
        });
        this.f2631c = new String[]{this.f2629a.getResources().getString(R.string.wizrad_accessibility_service)};
    }

    /* renamed from: b */
    public String mo3536b(int i) {
        switch (i) {
            case 0:
                this.f2630b.findViewById(R.id.wizard_accessibllity_step1).setVisibility(0);
                this.f2630b.findViewById(R.id.wizard_accessibllity_step2).setVisibility(8);
                C0651c.m3186a(this.f2630b.findViewById(R.id.wizard_accessiablity_step1_click)).mo3329f().mo3315a(2000).mo3317a((C0648b.C0650b) new C0648b.C0650b() {
                    /* renamed from: a */
                    public void mo3333a() {
                        C0728a.this.f2630b.findViewById(R.id.wizard_accessiablity_step1_click).performClick();
                        C0651c.m3186a(C0728a.this.f2630b.findViewById(R.id.switch1)).mo3329f().mo3315a(2000).mo3317a((C0648b.C0650b) new C0648b.C0650b() {
                            /* renamed from: a */
                            public void mo3333a() {
                                ((Switch) C0728a.this.f2630b.findViewById(R.id.switch1)).setChecked(true);
                            }
                        }).mo3321b(500).mo3325c();
                    }
                }).mo3321b(500).mo3325c();
                break;
        }
        return super.mo3536b(i);
    }
}
