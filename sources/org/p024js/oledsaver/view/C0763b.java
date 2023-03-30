package org.p024js.oledsaver.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import org.p024js.oledsaver.MyApp;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.p031e.C0725l;
import org.p024js.oledsaver.p031e.C0726m;

/* renamed from: org.js.oledsaver.view.b */
public class C0763b extends AlertDialog {

    /* renamed from: a */
    EditText f2746a;

    /* renamed from: b */
    Button f2747b;

    /* renamed from: c */
    Context f2748c;

    public C0763b(Context context) {
        super(context);
        this.f2748c = context;
        View inflate = getLayoutInflater().inflate(R.layout.activity_report, (ViewGroup) null);
        setIcon(R.mipmap.ic_launcher);
        setTitle(R.string.app_name);
        setView(inflate);
        this.f2746a = (EditText) inflate.findViewById(R.id.report_edittext);
        this.f2747b = (Button) inflate.findViewById(R.id.report_button);
        this.f2747b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C0763b.this.m3615a(C0763b.this.f2746a.getText().toString())) {
                    C0725l.m3505a(C0763b.this.f2748c, "success");
                }
                C0763b.this.f2746a.setText("");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m3615a(String str) {
        return ((MyApp) ((Activity) this.f2748c).getApplication()).mo3305a(str);
    }

    public void show() {
        super.show();
        getWindow().setLayout(C0726m.m3510b(getContext()), C0726m.m3509a(getContext()) / 2);
    }
}
