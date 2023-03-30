package org.p024js.oledsaver.view;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.p024js.oledsaver.C0702d;
import org.p024js.oledsaver.R;
import org.p024js.oledsaver.view.HorizontalTextSeekBar;

/* renamed from: org.js.oledsaver.view.MinBrightnessSettingPreference */
public class MinBrightnessSettingPreference extends Preference implements View.OnClickListener {

    /* renamed from: a */
    private TextView f2672a;

    /* renamed from: b */
    private String f2673b;

    /* renamed from: c */
    private int f2674c;

    /* renamed from: d */
    private String f2675d;

    /* renamed from: e */
    private String f2676e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f2677f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Dialog f2678g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public HorizontalTextSeekBar f2679h;

    /* renamed from: i */
    private View f2680i;

    /* renamed from: j */
    private View.OnClickListener f2681j;

    /* renamed from: k */
    private View.OnClickListener f2682k;

    /* renamed from: l */
    private HorizontalTextSeekBar.C0745a f2683l;

    /* renamed from: m */
    private Toast f2684m;

    public MinBrightnessSettingPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public MinBrightnessSettingPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MinBrightnessSettingPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2681j = new View.OnClickListener() {
            public void onClick(View view) {
                MinBrightnessSettingPreference.this.f2678g.dismiss();
            }
        };
        this.f2682k = new View.OnClickListener() {
            public void onClick(View view) {
                boolean unused = MinBrightnessSettingPreference.this.persistInt(MinBrightnessSettingPreference.this.f2679h.getProgress());
                MinBrightnessSettingPreference.this.f2677f.setText("" + MinBrightnessSettingPreference.this.f2679h.getProgress());
                MinBrightnessSettingPreference.this.f2678g.dismiss();
            }
        };
        this.f2683l = new HorizontalTextSeekBar.C0745a() {
            /* renamed from: a */
            public void mo3561a(HorizontalTextSeekBar horizontalTextSeekBar) {
            }

            /* renamed from: a */
            public void mo3562a(HorizontalTextSeekBar horizontalTextSeekBar, int i, boolean z) {
            }

            /* renamed from: b */
            public void mo3563b(HorizontalTextSeekBar horizontalTextSeekBar) {
            }
        };
        this.f2684m = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0702d.C0703a.voice_style);
        this.f2673b = obtainStyledAttributes.getString(3);
        this.f2674c = Integer.parseInt(obtainStyledAttributes.getString(0));
        if (this.f2674c < 0) {
            this.f2674c = 0;
        }
        this.f2675d = obtainStyledAttributes.getString(2);
        this.f2676e = obtainStyledAttributes.getString(1);
        super.setKey(this.f2676e);
        obtainStyledAttributes.recycle();
        this.f2678g = new Dialog(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_min_brightness_set_layout, (ViewGroup) null);
        this.f2678g.setContentView(inflate);
        this.f2678g.setTitle(R.string.minimum_screen_brightness);
        this.f2679h = (HorizontalTextSeekBar) inflate.findViewById(R.id.dialog_volume_value);
        this.f2679h.setMax(255);
        ((Button) inflate.findViewById(R.id.dialog_cancel)).setOnClickListener(this.f2681j);
        ((Button) inflate.findViewById(R.id.dialog_ok)).setOnClickListener(this.f2682k);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        if (this.f2672a == null) {
            int i = getSharedPreferences().getInt(this.f2676e, this.f2674c);
            this.f2672a = (TextView) view.findViewById(R.id.title);
            this.f2677f = (TextView) view.findViewById(R.id.summary);
            this.f2672a.setText(this.f2673b);
            if (i != 0) {
                this.f2677f.setText("" + i);
            } else {
                this.f2677f.setText(this.f2675d);
            }
            view.setOnClickListener(this);
            this.f2679h.setProgress(i);
            super.onBindView(view);
        }
    }

    public void onClick(View view) {
        this.f2679h.setProgress(getSharedPreferences().getInt(this.f2676e, this.f2674c));
        this.f2678g.show();
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup viewGroup) {
        if (this.f2680i == null) {
            this.f2680i = LayoutInflater.from(getContext()).inflate(R.layout.min_brightness_setting_layout, (ViewGroup) null);
        }
        return this.f2680i;
    }
}
