package org.p024js.oledsaver;

import android.accessibilityservice.AccessibilityService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import org.p024js.oledsaver.p031e.C0720i;

/* renamed from: org.js.oledsaver.GlobalActionBarService */
public class GlobalActionBarService extends AccessibilityService {

    /* renamed from: a */
    boolean f2302a;

    /* renamed from: b */
    int f2303b = -1;

    /* renamed from: c */
    private ServiceConnection f2304c = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: a */
    public void mo3267a() {
        bindService(new Intent(this, MainService.class).setAction("serviceCommandStartU"), this.f2304c, 1);
        this.f2302a = true;
    }

    /* renamed from: b */
    public void mo3268b() {
        if (this.f2302a) {
            unbindService(this.f2304c);
            this.f2302a = false;
        }
    }

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Log.e("accessibilityEvent", accessibilityEvent.toString());
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f2302a) {
            C0698c.m3421a((Context) this).mo3501j();
        }
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        Log.e("global", "destory");
        super.onDestroy();
        C0698c.m3421a((Context) this).mo3486a();
    }

    public void onInterrupt() {
        Log.e("accessibilityEvent", "onInterrupt");
    }

    /* access modifiers changed from: protected */
    public void onServiceConnected() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (defaultSharedPreferences.getBoolean("serviceEnabled", false) && defaultSharedPreferences.getBoolean("enableWhenBootUp", false)) {
            C0720i.m3489a(this, true);
        }
        C0698c.m3421a((Context) this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            if (intent.getAction().equals("serviceCommandStartU")) {
                C0698c.m3421a((Context) this).mo3492b(this);
                mo3267a();
            } else if (intent.getAction().equals("serviceCommandStopU")) {
                mo3268b();
                stopService(new Intent(this, MainService.class));
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
