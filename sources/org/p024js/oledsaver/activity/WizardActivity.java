package org.p024js.oledsaver.activity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p018v7.app.C0384c;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p025a.C0648b;
import org.p024js.oledsaver.p025a.C0651c;
import org.p024js.oledsaver.p030d.C0705b;
import org.p024js.oledsaver.p031e.C0726m;
import org.p024js.oledsaver.p032f.C0728a;
import org.p024js.oledsaver.p032f.C0734c;
import org.p024js.oledsaver.p032f.C0735d;
import org.p024js.oledsaver.p032f.C0737e;
import org.p024js.oledsaver.p032f.C0739f;
import org.p024js.oledsaver.p032f.C0742g;

/* renamed from: org.js.oledsaver.activity.WizardActivity */
public class WizardActivity extends C0384c {

    /* renamed from: j */
    FrameLayout f2374j;

    /* renamed from: k */
    TextView f2375k;

    /* renamed from: l */
    ImageView f2376l;

    /* renamed from: m */
    Button f2377m;

    /* renamed from: n */
    int f2378n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f2379o;

    /* renamed from: p */
    private int f2380p;

    /* renamed from: q */
    private C0735d f2381q;

    /* renamed from: r */
    private C0728a f2382r;

    /* renamed from: s */
    private C0739f f2383s;

    /* renamed from: t */
    private C0737e f2384t;

    /* renamed from: u */
    private C0742g f2385u;

    /* renamed from: v */
    private C0734c f2386v;

    /* renamed from: a */
    private void m3205a(final ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
            C0705b.m3445a().mo3509a(new Runnable() {
                public void run() {
                    imageView.setImageResource(R.drawable.ic_eyes_origin);
                    WizardActivity.this.f2375k.setText(R.string.wizrad_start);
                    C0651c.m3186a(imageView).mo3322b((float) ((-WizardActivity.this.f2379o) / 4)).mo3315a(1000).mo3317a((C0648b.C0650b) new C0648b.C0650b() {
                        /* renamed from: a */
                        public void mo3333a() {
                            WizardActivity.this.findViewById(R.id.activity_wizard_app_name).setVisibility(0);
                        }
                    }).mo3325c();
                }
            }, 4000);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3363k() {
        switch (this.f2378n) {
            case 0:
                mo3364l();
                mo3368p();
                this.f2377m.setVisibility(0);
                this.f2375k.setText(this.f2381q.mo3536b(0));
                return;
            case 1:
                mo3364l();
                mo3372t();
                this.f2375k.setText(this.f2385u.mo3536b(0));
                return;
            case 2:
                mo3364l();
                mo3374v();
                this.f2375k.setText(this.f2382r.mo3536b(0));
                return;
            case 3:
                mo3364l();
                mo3366n();
                this.f2375k.setText(this.f2384t.mo3536b(0));
                return;
            case 4:
                mo3364l();
                mo3370r();
                this.f2375k.setText(this.f2383s.mo3536b(0));
                return;
            case 5:
                mo3364l();
                mo3368p();
                this.f2375k.setText(this.f2381q.mo3536b(1));
                return;
            case 6:
                mo3364l();
                mo3368p();
                this.f2375k.setText(this.f2381q.mo3536b(2));
                return;
            case 7:
                mo3364l();
                mo3376x();
                this.f2375k.setText(this.f2386v.mo3536b(0));
                return;
            case 8:
                finish();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3364l() {
        findViewById(R.id.activity_wizard_app_name).setVisibility(4);
        mo3365m();
        mo3375w();
        mo3369q();
        mo3367o();
        mo3371s();
        mo3373u();
        mo3377y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3365m() {
        this.f2376l.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3366n() {
        if (this.f2383s == null) {
            this.f2384t = new C0737e(this);
        }
        View a = this.f2384t.mo3539a();
        this.f2374j.addView(a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a.getLayoutParams();
        layoutParams.height = (int) C0726m.m3508a(this, 64.0f);
        layoutParams.gravity = 17;
        a.setPadding(0, 30, 0, 30);
        C0651c.m3186a(a).mo3315a(500).mo3330g().mo3325c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3367o() {
        if (this.f2384t != null && this.f2374j.indexOfChild(this.f2384t.mo3539a()) >= 0) {
            this.f2374j.removeView(this.f2384t.mo3539a());
        }
    }

    public void onBackPressed() {
        if (this.f2378n > 0) {
            this.f2378n--;
            mo3363k();
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView((int) R.layout.activity_wizard);
        getWindow().setBackgroundDrawableResource(R.color.colorAccent);
        this.f2374j = (FrameLayout) findViewById(R.id.wizard_container);
        this.f2375k = (TextView) findViewById(R.id.wizard_textview);
        this.f2380p = C0726m.m3510b(this);
        this.f2379o = C0726m.m3509a(this);
        this.f2374j.getLayoutParams().height = this.f2380p;
        this.f2374j.getLayoutParams().width = this.f2380p;
        this.f2374j.setPadding(this.f2380p / 10, 0, this.f2380p / 10, 0);
        this.f2376l = (ImageView) findViewById(R.id.vector_imageview);
        this.f2377m = (Button) findViewById(R.id.activity_wizard_next_button);
        m3205a(this.f2376l);
        this.f2378n = 0;
        this.f2377m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WizardActivity.this.mo3363k();
                WizardActivity.this.f2378n++;
            }
        });
        this.f2375k.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WizardActivity.this.f2377m.performClick();
                WizardActivity.this.f2375k.setOnClickListener((View.OnClickListener) null);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3368p() {
        if (this.f2381q == null) {
            this.f2381q = new C0735d(this);
        }
        View a = this.f2381q.mo3539a();
        this.f2374j.addView(a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        a.setPadding(0, 30, 0, 30);
        C0651c.m3186a(a).mo3315a(500).mo3330g().mo3325c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3369q() {
        if (this.f2381q != null && this.f2374j.indexOfChild(this.f2381q.mo3539a()) >= 0) {
            this.f2374j.removeView(this.f2381q.mo3539a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3370r() {
        if (this.f2383s == null) {
            this.f2383s = new C0739f(this);
        }
        View a = this.f2383s.mo3539a();
        this.f2374j.addView(a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        C0651c.m3186a(a).mo3315a(500).mo3331h().mo3325c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3371s() {
        if (this.f2383s != null && this.f2374j.indexOfChild(this.f2383s.mo3539a()) >= 0) {
            this.f2374j.removeView(this.f2383s.mo3539a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3372t() {
        if (this.f2385u == null) {
            this.f2385u = new C0742g(this);
        }
        View a = this.f2385u.mo3539a();
        this.f2374j.addView(a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        C0651c.m3186a(a).mo3315a(500).mo3330g().mo3325c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3373u() {
        if (this.f2385u != null && this.f2374j.indexOfChild(this.f2385u.mo3539a()) >= 0) {
            this.f2374j.removeView(this.f2385u.mo3539a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3374v() {
        if (this.f2382r == null) {
            this.f2382r = new C0728a(this);
        }
        View a = this.f2382r.mo3539a();
        this.f2374j.addView(a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        C0651c.m3186a(a).mo3315a(500).mo3330g().mo3325c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3375w() {
        if (this.f2382r != null && this.f2374j.indexOfChild(this.f2382r.mo3539a()) >= 0) {
            this.f2374j.removeView(this.f2382r.mo3539a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3376x() {
        if (this.f2386v == null) {
            this.f2386v = new C0734c(this);
        }
        View a = this.f2386v.mo3539a();
        this.f2374j.addView(a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        C0651c.m3186a(a).mo3315a(500).mo3330g().mo3325c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3377y() {
        if (this.f2386v != null && this.f2374j.indexOfChild(this.f2386v.mo3539a()) >= 0) {
            this.f2374j.removeView(this.f2386v.mo3539a());
        }
    }
}
