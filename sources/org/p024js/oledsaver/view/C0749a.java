package org.p024js.oledsaver.view;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import org.p024js.oledsaver.MainService;
import org.p024js.oledsaver.R;

/* renamed from: org.js.oledsaver.view.a */
public class C0749a {

    /* renamed from: a */
    public static final int[] f2688a = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10, R.id.button11, R.id.button12, R.id.button13, R.id.button14, R.id.button15, R.id.button16, R.id.button17, R.id.button18, R.id.button19, R.id.button20, R.id.button21, R.id.button22, R.id.button23, R.id.button24, R.id.button25, R.id.button26, R.id.button27, R.id.button28, R.id.button29, R.id.button30, R.id.button31, R.id.button32, R.id.button33, R.id.button34, R.id.button35, R.id.button36, R.id.button37, R.id.button38, R.id.button39, R.id.button40};

    /* renamed from: a */
    public static RemoteViews m3561a(Context context) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.test_layout);
        for (int i = 0; i < f2688a.length; i++) {
            Intent action = new Intent(context, MainService.class).setAction("notificationSeekBarLevel" + i);
            action.putExtra("notificationSeekBarLevel", i);
            remoteViews.setOnClickPendingIntent(f2688a[i], PendingIntent.getService(context, 0, action, 134217728));
        }
        return remoteViews;
    }
}
