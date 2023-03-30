package org.p024js.oledsaver.p032f;

import android.content.Context;
import android.widget.ProgressBar;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p025a.C0648b;
import org.p024js.oledsaver.p025a.C0651c;

/* renamed from: org.js.oledsaver.f.e */
public class C0737e extends C0733b {
    public C0737e(Context context) {
        super(context, R.layout.notification);
        this.f2630b.setBackgroundResource(R.drawable.round_background);
        this.f2631c = new String[]{this.f2629a.getResources().getString(R.string.wizrad_notification_bar)};
    }

    /* renamed from: b */
    public String mo3536b(int i) {
        switch (i) {
            case 0:
                C0651c.m3186a(this.f2630b.findViewById(R.id.notification_progressbar)).mo3329f().mo3315a(2000).mo3317a((C0648b.C0650b) new C0648b.C0650b() {
                    /* renamed from: a */
                    public void mo3333a() {
                        ((ProgressBar) C0737e.this.f2630b.findViewById(R.id.notification_progressbar)).setProgress(10);
                        C0651c.m3186a(C0737e.this.f2630b.findViewById(R.id.decreaseButton)).mo3329f().mo3315a(2000).mo3318a(C0737e.this.f2630b.findViewById(R.id.increaseButton)).mo3329f().mo3315a(2000).mo3323b(C0737e.this.f2630b.findViewById(R.id.notification_turn_button)).mo3329f().mo3315a(2000).mo3321b(500).mo3325c();
                    }
                }).mo3321b(500).mo3325c();
                break;
        }
        return super.mo3536b(i);
    }
}
