package org.p024js.oledsaver.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import org.p024js.oledsaver.C0646a;
import org.p024js.oledsaver.C0666b;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p031e.C0720i;

/* renamed from: org.js.oledsaver.activity.ModelOffsetActivity */
public class ModelOffsetActivity extends Activity {

    /* renamed from: a */
    Button f2370a;

    /* renamed from: b */
    SeekBar f2371b;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_model_offset);
        this.f2370a = (Button) findViewById(R.id.apply);
        this.f2371b = (SeekBar) findViewById(R.id.seekBar);
        this.f2371b.setMax(40);
        this.f2371b.setProgress(C0646a.f2332c);
        this.f2370a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C0666b.m3223a(ModelOffsetActivity.this.getApplicationContext()).mo3401f();
                C0666b.m3223a(ModelOffsetActivity.this.getApplicationContext()).mo3408m();
                ModelOffsetActivity.this.finish();
            }
        });
        this.f2371b.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (C0720i.m3491b(ModelOffsetActivity.this)) {
                    C0666b a = C0666b.m3223a(ModelOffsetActivity.this.getApplicationContext());
                    C0646a.f2332c = i;
                    a.mo3389b(a.mo3412p());
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}
