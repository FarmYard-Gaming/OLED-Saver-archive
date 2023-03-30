package org.p024js.oledsaver.p031e;

import android.content.Context;
import android.content.Intent;
import org.p024js.oledsaver.C0666b;
import org.p024js.oledsaver.activity.ModelOffsetActivity;

/* renamed from: org.js.oledsaver.e.b */
public class C0713b {
    /* renamed from: a */
    public static boolean m3463a(Context context) {
        if (C0666b.m3223a(context.getApplicationContext()).mo3400e()) {
            return true;
        }
        Intent intent = new Intent(context, ModelOffsetActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
        return false;
    }
}
