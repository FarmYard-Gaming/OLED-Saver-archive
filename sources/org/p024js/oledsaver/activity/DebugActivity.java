package org.p024js.oledsaver.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p031e.C0719h;
import org.p024js.oledsaver.p031e.C0725l;

/* renamed from: org.js.oledsaver.activity.DebugActivity */
public class DebugActivity extends Activity {

    /* renamed from: a */
    Button f2353a;

    /* renamed from: b */
    Button f2354b;

    /* renamed from: c */
    EditText f2355c;

    /* renamed from: d */
    TextView f2356d;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_debug);
        this.f2353a = (Button) findViewById(R.id.set_button);
        this.f2354b = (Button) findViewById(R.id.read_button);
        this.f2355c = (EditText) findViewById(R.id.set_text);
        this.f2356d = (TextView) findViewById(R.id.read_text);
        this.f2353a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int i;
                try {
                    i = Integer.parseInt(DebugActivity.this.f2355c.getText().toString());
                } catch (Exception e) {
                    i = -1;
                }
                if (i < 0 || i > 1024) {
                    C0725l.m3505a(DebugActivity.this, "值为0~1024");
                    return;
                }
                C0719h.m3482a((Context) DebugActivity.this).mo3527a(i);
                C0725l.m3505a(DebugActivity.this, "已设置");
            }
        });
        this.f2354b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                DebugActivity.this.f2356d.setText(C0719h.m3482a((Context) DebugActivity.this).mo3528b() == 1 ? "自动" : "手动模式：亮度值：" + C0719h.m3482a((Context) DebugActivity.this).mo3526a());
            }
        });
    }
}
