package android.support.p006v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.w */
public class C0164w {

    /* renamed from: android.support.v4.app.w$a */
    public static class C0165a {

        /* renamed from: a */
        final Bundle f513a;

        /* renamed from: b */
        boolean f514b;

        /* renamed from: c */
        public int f515c;

        /* renamed from: d */
        public CharSequence f516d;

        /* renamed from: e */
        public PendingIntent f517e;

        /* renamed from: f */
        private final C0093aa[] f518f;

        /* renamed from: g */
        private final C0093aa[] f519g;

        /* renamed from: h */
        private boolean f520h;

        /* renamed from: i */
        private final int f521i;

        /* renamed from: a */
        public int mo694a() {
            return this.f515c;
        }

        /* renamed from: b */
        public CharSequence mo695b() {
            return this.f516d;
        }

        /* renamed from: c */
        public PendingIntent mo696c() {
            return this.f517e;
        }

        /* renamed from: d */
        public Bundle mo697d() {
            return this.f513a;
        }

        /* renamed from: e */
        public boolean mo698e() {
            return this.f520h;
        }

        /* renamed from: f */
        public C0093aa[] mo699f() {
            return this.f518f;
        }

        /* renamed from: g */
        public int mo700g() {
            return this.f521i;
        }

        /* renamed from: h */
        public C0093aa[] mo701h() {
            return this.f519g;
        }

        /* renamed from: i */
        public boolean mo702i() {
            return this.f514b;
        }
    }

    /* renamed from: android.support.v4.app.w$b */
    public static class C0166b {

        /* renamed from: A */
        String f522A;

        /* renamed from: B */
        Bundle f523B;

        /* renamed from: C */
        int f524C;

        /* renamed from: D */
        int f525D;

        /* renamed from: E */
        Notification f526E;

        /* renamed from: F */
        RemoteViews f527F;

        /* renamed from: G */
        RemoteViews f528G;

        /* renamed from: H */
        RemoteViews f529H;

        /* renamed from: I */
        String f530I;

        /* renamed from: J */
        int f531J;

        /* renamed from: K */
        String f532K;

        /* renamed from: L */
        long f533L;

        /* renamed from: M */
        int f534M;

        /* renamed from: N */
        Notification f535N;
        @Deprecated

        /* renamed from: O */
        public ArrayList<String> f536O;

        /* renamed from: a */
        public Context f537a;

        /* renamed from: b */
        public ArrayList<C0165a> f538b;

        /* renamed from: c */
        ArrayList<C0165a> f539c;

        /* renamed from: d */
        CharSequence f540d;

        /* renamed from: e */
        CharSequence f541e;

        /* renamed from: f */
        PendingIntent f542f;

        /* renamed from: g */
        PendingIntent f543g;

        /* renamed from: h */
        RemoteViews f544h;

        /* renamed from: i */
        Bitmap f545i;

        /* renamed from: j */
        CharSequence f546j;

        /* renamed from: k */
        int f547k;

        /* renamed from: l */
        int f548l;

        /* renamed from: m */
        boolean f549m;

        /* renamed from: n */
        boolean f550n;

        /* renamed from: o */
        C0167c f551o;

        /* renamed from: p */
        CharSequence f552p;

        /* renamed from: q */
        CharSequence[] f553q;

        /* renamed from: r */
        int f554r;

        /* renamed from: s */
        int f555s;

        /* renamed from: t */
        boolean f556t;

        /* renamed from: u */
        String f557u;

        /* renamed from: v */
        boolean f558v;

        /* renamed from: w */
        String f559w;

        /* renamed from: x */
        boolean f560x;

        /* renamed from: y */
        boolean f561y;

        /* renamed from: z */
        boolean f562z;

        @Deprecated
        public C0166b(Context context) {
            this(context, (String) null);
        }

        public C0166b(Context context, String str) {
            this.f538b = new ArrayList<>();
            this.f539c = new ArrayList<>();
            this.f549m = true;
            this.f560x = false;
            this.f524C = 0;
            this.f525D = 0;
            this.f531J = 0;
            this.f534M = 0;
            this.f535N = new Notification();
            this.f537a = context;
            this.f530I = str;
            this.f535N.when = System.currentTimeMillis();
            this.f535N.audioStreamType = -1;
            this.f548l = 0;
            this.f536O = new ArrayList<>();
        }

        /* renamed from: a */
        private void m761a(int i, boolean z) {
            if (z) {
                this.f535N.flags |= i;
                return;
            }
            this.f535N.flags &= i ^ -1;
        }

        /* renamed from: b */
        protected static CharSequence m762b(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: a */
        public Bundle mo703a() {
            if (this.f523B == null) {
                this.f523B = new Bundle();
            }
            return this.f523B;
        }

        /* renamed from: a */
        public C0166b mo704a(int i) {
            this.f535N.icon = i;
            return this;
        }

        /* renamed from: a */
        public C0166b mo705a(long j) {
            this.f535N.when = j;
            return this;
        }

        /* renamed from: a */
        public C0166b mo706a(RemoteViews remoteViews) {
            this.f527F = remoteViews;
            return this;
        }

        /* renamed from: a */
        public C0166b mo707a(CharSequence charSequence) {
            this.f535N.tickerText = m762b(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0166b mo708a(String str) {
            this.f530I = str;
            return this;
        }

        /* renamed from: a */
        public C0166b mo709a(boolean z) {
            m761a(2, z);
            return this;
        }

        /* renamed from: b */
        public Notification mo710b() {
            return new C0168x(this).mo718a();
        }

        /* renamed from: b */
        public C0166b mo711b(int i) {
            this.f548l = i;
            return this;
        }

        /* renamed from: b */
        public C0166b mo712b(RemoteViews remoteViews) {
            this.f528G = remoteViews;
            return this;
        }
    }

    /* renamed from: android.support.v4.app.w$c */
    public static abstract class C0167c {
        /* renamed from: a */
        public void mo713a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo714a(C0163v vVar) {
        }

        /* renamed from: b */
        public RemoteViews mo715b(C0163v vVar) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo716c(C0163v vVar) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo717d(C0163v vVar) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bundle m751a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return C0169y.m783a(notification);
        }
        return null;
    }
}
