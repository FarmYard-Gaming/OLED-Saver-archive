package org.p024js.oledsaver;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.hardware.SensorManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.support.p006v4.app.C0164w;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import android.widget.RemoteViews;
import java.util.Observable;
import java.util.Observer;
import org.p024js.oledsaver.activity.MainActivity;
import org.p024js.oledsaver.p026b.p027a.C0676b;
import org.p024js.oledsaver.p026b.p027a.C0683e;
import org.p024js.oledsaver.p026b.p027a.C0686f;
import org.p024js.oledsaver.p029c.C0701a;
import org.p024js.oledsaver.p030d.C0704a;
import org.p024js.oledsaver.p030d.C0705b;
import org.p024js.oledsaver.p031e.C0713b;
import org.p024js.oledsaver.p031e.C0719h;
import org.p024js.oledsaver.p031e.C0720i;
import org.p024js.oledsaver.view.C0749a;

/* renamed from: org.js.oledsaver.MainService */
public class MainService extends Service implements Observer, C0676b {

    /* renamed from: a */
    int f2306a;

    /* renamed from: b */
    boolean f2307b;

    /* renamed from: c */
    int f2308c;

    /* renamed from: d */
    Runnable f2309d = new Runnable() {
        public void run() {
            if (!MainService.this.f2307b) {
                C0698c.m3421a((Context) MainService.this).mo3498g();
                C0666b a = MainService.this.m3138n();
                a.mo3389b(a.mo3412p());
                if (!MainService.this.f2307b) {
                    C0704a.m3442a(this, (long) C0701a.f2589d[C0646a.f2331b]);
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f2310e = getClass().getSimpleName();

    /* renamed from: f */
    private C0666b f2311f;

    /* renamed from: g */
    private C0645b f2312g;

    /* renamed from: h */
    private SensorManager f2313h;

    /* renamed from: i */
    private int f2314i;

    /* renamed from: j */
    private AccessibilityManager f2315j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C0686f f2316k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C0683e.C0685b f2317l;

    /* renamed from: m */
    private boolean f2318m;

    /* renamed from: n */
    private final IBinder f2319n = new C0644a();

    /* renamed from: o */
    private RemoteViews f2320o;

    /* renamed from: p */
    private RemoteViews f2321p;

    /* renamed from: q */
    private Notification f2322q;

    /* renamed from: org.js.oledsaver.MainService$a */
    public class C0644a extends Binder {
        public C0644a() {
        }
    }

    /* renamed from: org.js.oledsaver.MainService$b */
    private class C0645b extends BroadcastReceiver {
        private C0645b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                Log.d(MainService.this.f2310e, "screen off");
                MainService.this.f2317l.f2481a = 0;
                MainService.this.f2316k.mo3465a(MainService.this.f2317l, false);
                MainService.this.mo3282c();
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                Log.d(MainService.this.f2310e, "screen on");
                MainService.this.mo3281b();
                MainService.this.mo3288i();
            }
        }
    }

    /* renamed from: a */
    private void m3128a(C0666b bVar) {
        bVar.mo3383a(this.f2316k.mo3469e(), this.f2316k.mo3470f(), true);
        this.f2318m = false;
    }

    /* renamed from: b */
    private void m3130b(int i) {
        if (this.f2317l != null && this.f2316k != null) {
            this.f2317l.f2486f = false;
            this.f2317l.f2483c = i;
            this.f2316k.mo3465a(this.f2317l, false);
        }
    }

    /* renamed from: c */
    private void m3132c(int i) {
        C0666b n = m3138n();
        int c = C0666b.m3227c((float) i);
        if (n.mo3407l()) {
            this.f2318m = true;
            n.mo3392c(c);
            this.f2316k.mo3466b();
            return;
        }
        n.mo3392c(c);
        this.f2316k.mo3464a(c);
        n.mo3389b(-1.0f);
    }

    /* renamed from: j */
    private void m3134j() {
        m3135k();
        this.f2312g = new C0645b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.f2312g, intentFilter);
    }

    /* renamed from: k */
    private void m3135k() {
        try {
            if (this.f2312g != null) {
                unregisterReceiver(this.f2312g);
            }
        } catch (IllegalArgumentException e) {
        }
        this.f2312g = null;
    }

    /* renamed from: l */
    private void m3136l() {
        C0666b n = m3138n();
        this.f2317l.f2486f = true;
        this.f2316k.mo3465a(this.f2317l, false);
        n.mo3392c(this.f2316k.mo3468d());
        n.mo3389b(this.f2316k.mo3467c());
    }

    /* renamed from: m */
    private void m3137m() {
        this.f2316k.mo3435a();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public C0666b m3138n() {
        if (this.f2307b) {
            return null;
        }
        return C0666b.m3223a(getApplicationContext());
    }

    /* renamed from: o */
    private void m3139o() {
        int i = 10;
        if (this.f2308c < 30) {
            i = 5;
        }
        m3132c(i + this.f2308c);
    }

    /* renamed from: p */
    private void m3140p() {
        int i = 10;
        if (this.f2308c < 30) {
            i = 5;
        }
        m3132c(this.f2308c - i);
    }

    /* renamed from: q */
    private void m3141q() {
        this.f2320o = new RemoteViews(getPackageName(), R.layout.notification);
        this.f2320o.removeAllViews(R.id.test_continer);
        this.f2320o.addView(R.id.test_continer, C0749a.m3561a(this));
        this.f2320o.setOnClickPendingIntent(R.id.increaseButton, PendingIntent.getService(this, 0, new Intent(this, MainService.class).setAction("increase"), 0));
        this.f2320o.setOnClickPendingIntent(R.id.decreaseButton, PendingIntent.getService(this, 0, new Intent(this, MainService.class).setAction("decrease"), 0));
        Intent action = new Intent(this, MainService.class).setAction("turnAuto");
        this.f2320o.setOnClickPendingIntent(R.id.notification_turn_button, PendingIntent.getService(this, 0, action, 0));
        if (m3138n().mo3407l()) {
            this.f2320o.setInt(R.id.notification_turn_button, "setBackgroundResource", R.drawable.auto_round_button_drawed);
        } else {
            this.f2320o.setInt(R.id.notification_turn_button, "setBackgroundResource", R.drawable.auto_round_button);
        }
        new Notification.Action(R.drawable.blank, getString(R.string.settings), PendingIntent.getBroadcast(getBaseContext(), 0, action, 0));
        this.f2321p = new RemoteViews(getPackageName(), R.layout.big_notification_container);
        RemoteViews remoteViews = Build.VERSION.SDK_INT >= 28 ? new RemoteViews(this.f2320o) : this.f2320o.clone();
        this.f2321p.removeAllViews(R.id.notification_adjust_bar_container);
        this.f2321p.addView(R.id.notification_adjust_bar_container, remoteViews);
        this.f2321p.setOnClickPendingIntent(R.id.notification_open_main_button, PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 0));
        this.f2321p.setOnClickPendingIntent(R.id.notification_pause_button, PendingIntent.getService(this, 0, new Intent(this, MainService.class).setAction("pause"), 0));
        C0164w.C0166b b = new C0164w.C0166b(this).mo707a((CharSequence) getResources().getString(R.string.app_name)).mo709a(true).mo706a(this.f2320o).mo712b(this.f2321p).mo704a((int) R.drawable.ic_launcher).mo705a(0).mo711b(2);
        if (Build.VERSION.SDK_INT >= 26) {
            mo3285f();
            b.mo708a("running_status");
        }
        this.f2322q = b.mo710b();
        this.f2322q.flags |= 32;
        this.f2322q.flags |= 64;
        startForeground(1024, this.f2322q);
    }

    /* renamed from: r */
    private void m3142r() {
        C0666b n = m3138n();
        if (n.mo3407l()) {
            m3136l();
            this.f2320o.setTextViewText(R.id.notification_turn_button, "A");
            this.f2320o.setInt(R.id.notification_turn_button, "setBackgroundResource", R.drawable.auto_round_button_drawed);
            this.f2321p.setTextViewText(R.id.notification_turn_button, "A");
            this.f2321p.setInt(R.id.notification_turn_button, "setBackgroundResource", R.drawable.auto_round_button_drawed);
        } else {
            m3130b(n.mo3410o());
            this.f2320o.setTextViewText(R.id.notification_turn_button, "M");
            this.f2320o.setInt(R.id.notification_turn_button, "setBackgroundResource", R.drawable.auto_round_button);
            this.f2321p.setTextViewText(R.id.notification_turn_button, "M");
            this.f2321p.setInt(R.id.notification_turn_button, "setBackgroundResource", R.drawable.auto_round_button);
        }
        ((NotificationManager) getSystemService("notification")).notify(1024, this.f2322q);
    }

    /* renamed from: s */
    private void m3143s() {
        C0666b n = m3138n();
        this.f2314i = n.mo3410o();
        this.f2315j.isEnabled();
        int g = n.mo3402g();
        int o = n.mo3410o() >= g ? n.mo3410o() : g;
        n.mo3399e(o);
        C0698c.m3421a((Context) this).mo3490a(o, n.mo3410o(), g, n.mo3403h());
        int o2 = n.mo3410o();
        this.f2308c = o2;
        this.f2320o.setProgressBar(R.id.notification_progressbar, 255, o2, false);
        this.f2321p.setProgressBar(R.id.notification_progressbar, 255, o2, false);
        ((NotificationManager) getSystemService("notification")).notify(1024, this.f2322q);
        if (this.f2318m) {
            m3128a(n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3277a() {
        if (this.f2313h == null) {
            C0704a.m3441a();
            C0705b.m3445a().mo3508a(new Runnable() {
                public void run() {
                }
            });
            C0698c.m3421a((Context) this).mo3494c(this);
            Log.d(this.f2310e, "starting service");
            C0666b a = C0666b.m3223a(getApplicationContext());
            this.f2311f = C0666b.m3223a(getApplicationContext());
            this.f2314i = a.mo3410o();
            a.mo3390b(0);
            a.addObserver(this);
            this.f2313h = (SensorManager) getSystemService("sensor");
            this.f2316k = new C0686f(getApplicationContext(), new C0683e.C0684a() {
                /* renamed from: a */
                public void mo3297a() {
                }

                /* renamed from: b */
                public void mo3298b() {
                }

                /* renamed from: c */
                public void mo3299c() {
                }

                /* renamed from: d */
                public void mo3300d() {
                }

                /* renamed from: e */
                public void mo3301e() {
                }
            }, C0704a.m3443b(), this.f2313h, this);
            this.f2317l = new C0683e.C0685b();
            mo3281b();
            m3141q();
            if (Build.VERSION.SDK_INT >= 24) {
                QuickTileService.requestListeningState(this, new ComponentName(this, QuickTileService.class));
            }
            Log.i("MASK", "Start Mask");
            this.f2307b = false;
            C0704a.m3442a(this.f2309d, (long) C0701a.f2589d[C0646a.f2331b]);
            this.f2316k.mo3463a(a.mo3405j(), a.mo3406k());
            m3134j();
            m3142r();
            a.mo3393c(true);
            a.mo3389b(a.mo3412p());
            C0713b.m3463a(this);
        }
    }

    /* renamed from: a */
    public void mo3278a(float f) {
        m3138n().mo3382a(f);
    }

    /* renamed from: a */
    public void mo3279a(int i) {
        C0666b n = m3138n();
        n.mo3392c(i);
        n.mo3389b(this.f2316k.mo3467c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3280a(boolean z) {
        C0666b n = m3138n();
        if (z) {
            this.f2321p.setTextViewText(R.id.notification_pause_button, getText(R.string.action_resume));
        } else {
            this.f2321p.setTextViewText(R.id.notification_pause_button, getText(R.string.action_pause));
        }
        n.mo3386a(z);
        n.mo3389b(n.mo3412p());
        ((NotificationManager) getSystemService("notification")).notify(1024, this.f2322q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3281b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3282c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3283d() {
        C0720i.m3489a(this, false);
    }

    /* renamed from: e */
    public void mo3284e() {
        if (!this.f2307b) {
            C0666b n = m3138n();
            this.f2307b = true;
            if (C0704a.m3443b() != null) {
                C0704a.m3443b().removeCallbacks(this.f2309d);
            }
            m3135k();
            m3130b(n.mo3410o());
            m3128a(n);
            n.mo3390b(this.f2306a);
            if (this.f2306a == 0) {
                C0719h.m3482a((Context) this).mo3529b(n.mo3410o());
            }
            n.mo3396d(n.mo3410o());
            ((NotificationManager) getSystemService("notification")).cancel(1024);
            mo3282c();
            this.f2316k = null;
            n.deleteObserver(this);
            n.mo3393c(false);
            n.mo3384a(n.mo3404i(), true);
            C0698c.m3421a((Context) this).mo3496e();
            C0698c.m3421a((Context) this).mo3495d(this);
            stopForeground(true);
            if (Build.VERSION.SDK_INT >= 24) {
                QuickTileService.requestListeningState(this, new ComponentName(this, QuickTileService.class));
            }
            C0704a.m3444c();
        }
    }

    @TargetApi(26)
    /* renamed from: f */
    public void mo3285f() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("running_status", getResources().getString(R.string.notification_channel_name), 3);
            notificationChannel.setShowBadge(false);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            notificationChannel.setImportance(3);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: g */
    public int mo3286g() {
        return m3138n().mo3410o();
    }

    /* renamed from: h */
    public float mo3287h() {
        return m3138n().mo3404i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3288i() {
        this.f2317l.f2481a = 3;
        this.f2316k.mo3465a(this.f2317l, false);
        this.f2316k.mo3466b();
    }

    public IBinder onBind(Intent intent) {
        return this.f2319n;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        super.onCreate();
        this.f2315j = (AccessibilityManager) getSystemService("accessibility");
        this.f2306a = C0719h.m3482a((Context) this).mo3528b();
        mo3277a();
    }

    public void onDestroy() {
        Log.e(this.f2310e, "onDestroy");
        mo3284e();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        boolean z = false;
        if (this.f2307b || this.f2316k == null || this.f2312g == null || this.f2313h == null) {
            ((MyApp) getApplication()).mo3305a(this.f2307b ? "destroyed" : new StringBuilder().append(" ,notification ").append(this.f2322q).toString() == null ? "null" : "inited");
            return super.onStartCommand(intent, i, i2);
        } else if (intent == null) {
            return 1;
        } else {
            String action = intent.getAction();
            if ("increase".equals(action)) {
                m3139o();
            } else if ("decrease".equals(action)) {
                m3140p();
            } else if ("stop".equals(action)) {
                mo3283d();
            } else if ("pause".equals(action)) {
                if (!m3138n().mo3403h()) {
                    z = true;
                }
                mo3280a(z);
            } else if ("turnAuto".equals(action)) {
                C0666b n = m3138n();
                if (!n.mo3407l()) {
                    z = true;
                }
                n.mo3391b(z);
            } else if (action.contains("notificationSeekBarLevel")) {
                m3132c((int) (((float) (intent.getIntExtra("notificationSeekBarLevel", 0) + 1)) * (255.0f / ((float) C0749a.f2688a.length))));
            }
            return action == "stop" ? 2 : 1;
        }
    }

    public void onTaskRemoved(Intent intent) {
        Log.e(this.f2310e, "onTaskRemoved");
        mo3284e();
        super.onTaskRemoved(intent);
    }

    public void update(Observable observable, Object obj) {
        if (obj != null) {
            String str = (String) obj;
            if ("userAdjustment".equals(str)) {
                m3137m();
            } else if ("lux".equals(str)) {
                m3143s();
            } else if ("brightnessMode".equals(str)) {
                if (m3138n().mo3409n() != 0) {
                    mo3283d();
                }
            } else if ("brightness".equals(str)) {
                if (this.f2314i != m3138n().mo3410o()) {
                }
            } else if (!"senseIntervalMs".equals(str) && "auto".equals(str)) {
                m3142r();
            }
        }
    }
}
