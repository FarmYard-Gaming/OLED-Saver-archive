package org.p024js.oledsaver.p031e;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import org.p024js.oledsaver.R;

/* renamed from: org.js.oledsaver.e.l */
public class C0725l {
    /* renamed from: a */
    public static void m3504a(Context context) {
    }

    /* renamed from: a */
    public static void m3505a(Context context, String str) {
        m3506a(context, str, 0);
    }

    /* renamed from: a */
    private static void m3506a(Context context, String str, int i) {
        Toast makeText = Toast.makeText(context, str, i);
        View view = makeText.getView();
        view.setBackgroundResource(R.drawable.round_background_accent_color);
        TextView textView = (TextView) view.findViewById(16908299);
        if (textView != null) {
            textView.setTextColor(-1);
        }
        makeText.setView(view);
        makeText.show();
    }

    /* renamed from: b */
    public static void m3507b(Context context, String str) {
        m3506a(context, str, 1);
    }
}
