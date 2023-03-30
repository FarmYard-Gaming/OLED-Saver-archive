package org.p024js.oledsaver.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.p024js.oledsaver.C0706e;
import org.p024js.oledsaver.MyApp;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p031e.C0727n;
import org.p024js.oledsaver.view.C0763b;
import org.p024js.oledsaver.view.ExpandIconView;

/* renamed from: org.js.oledsaver.activity.MainActivity */
public class MainActivity extends Activity {

    /* renamed from: a */
    Button f2359a;

    /* renamed from: b */
    private String f2360b = MainActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0706e f2361c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f2362d;

    /* renamed from: e */
    private Button f2363e;

    /* renamed from: f */
    private int f2364f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3350a() {
        this.f2364f++;
        if (this.f2364f >= 5) {
            Intent intent = new Intent();
            intent.setClass(this, DebugActivity.class);
            startActivity(intent);
            this.f2364f = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        this.f2361c = new C0706e();
        getFragmentManager().beginTransaction().replace(R.id.frament_container, this.f2361c).commit();
        this.f2359a = (Button) findViewById(R.id.help_button);
        this.f2359a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.f2361c.mo3513b();
            }
        });
        this.f2363e = (Button) findViewById(R.id.report_button);
        this.f2363e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                new C0763b(MainActivity.this).show();
            }
        });
        if (((MyApp) getApplication()).mo3304a()) {
            this.f2363e.setVisibility(0);
        }
        final ExpandIconView expandIconView = (ExpandIconView) findViewById(R.id.main_expand_icon);
        expandIconView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int i = 0;
                boolean unused = MainActivity.this.f2362d = !MainActivity.this.f2362d;
                expandIconView.mo3541a(MainActivity.this.f2362d ? 1 : 0, true);
                MainActivity.this.f2359a.setVisibility(MainActivity.this.f2362d ? 0 : 8);
                View findViewById = MainActivity.this.findViewById(R.id.frament_container);
                if (!MainActivity.this.f2362d) {
                    i = 8;
                }
                findViewById.setVisibility(i);
            }
        });
        TextView textView = (TextView) findViewById(R.id.version_textview);
        textView.setText("V." + C0727n.m3512a(this));
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.mo3350a();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f2364f = 0;
        super.onResume();
    }
}
