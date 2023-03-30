package org.p024js.oledsaver.p032f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p025a.C0648b;
import org.p024js.oledsaver.p025a.C0651c;
import org.p024js.oledsaver.p031e.C0727n;

/* renamed from: org.js.oledsaver.f.d */
public class C0735d extends C0733b {
    public C0735d(Context context) {
        super(context, R.layout.activity_main);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3535a(int i) {
        super.mo3535a(i);
        ((FrameLayout) this.f2630b.findViewById(R.id.frament_container)).addView(View.inflate(this.f2629a, R.layout.wizard_main, (ViewGroup) null));
        ((TextView) this.f2630b.findViewById(R.id.version_textview)).setText("V." + C0727n.m3512a(this.f2629a));
        this.f2631c = new String[]{this.f2629a.getResources().getString(R.string.wizrad_open_service), this.f2629a.getResources().getString(R.string.wizrad_pixel_filter), this.f2629a.getResources().getString(R.string.wizrad_min_brightness)};
    }

    /* renamed from: b */
    public String mo3536b(int i) {
        switch (i) {
            case 0:
                C0651c.m3186a(this.f2630b.findViewById(R.id.switch2)).mo3329f().mo3315a(2000).mo3317a((C0648b.C0650b) new C0648b.C0650b() {
                    /* renamed from: a */
                    public void mo3333a() {
                        ((Switch) C0735d.this.f2630b.findViewById(R.id.switch2)).setChecked(true);
                    }
                }).mo3321b(500).mo3325c();
                break;
            case 1:
                C0651c.m3186a(this.f2630b.findViewById(R.id.wizard_main_pixel_filter)).mo3329f().mo3315a(2000).mo3321b(500).mo3325c();
                break;
            case 2:
                C0651c.m3186a(this.f2630b.findViewById(R.id.wizard_main_min_brightness)).mo3329f().mo3315a(2000).mo3321b(500).mo3325c();
                break;
        }
        return super.mo3536b(i);
    }
}
