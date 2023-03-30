package org.p024js.oledsaver.view.p033a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.p024js.oledsaver.R;

/* renamed from: org.js.oledsaver.view.a.h */
public class C0762h implements C0752c {

    /* renamed from: a */
    private String f2743a;

    /* renamed from: b */
    private int f2744b;

    /* renamed from: c */
    private int f2745c;

    public C0762h(String str, boolean z, int i) {
        this.f2743a = str;
        if (z) {
            this.f2744b = 4;
        } else {
            this.f2744b = 2;
        }
        this.f2745c = i;
    }

    /* renamed from: a */
    public int mo3570a() {
        return this.f2744b;
    }

    /* renamed from: a */
    public View mo3571a(LayoutInflater layoutInflater) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(layoutInflater.getContext());
        textView.setText(this.f2743a);
        textView.setTextColor(layoutInflater.getContext().getResources().getColor(R.color.white));
        textView.setTextSize(16.0f);
        textView.setPadding(20, 0, 20, 0);
        textView.setFocusableInTouchMode(false);
        textView.setClickable(false);
        textView.setFocusable(false);
        linearLayout.removeAllViews();
        linearLayout.addView(textView);
        if (this.f2745c > 0) {
            ImageView imageView = new ImageView(layoutInflater.getContext());
            imageView.setImageResource(this.f2745c);
            imageView.setClickable(false);
            imageView.setFocusable(false);
            linearLayout.addView(imageView);
        }
        return linearLayout;
    }

    /* renamed from: b */
    public int mo3572b() {
        return 32;
    }

    /* renamed from: c */
    public int mo3573c() {
        return 0;
    }

    /* renamed from: d */
    public int mo3574d() {
        return 20;
    }
}
