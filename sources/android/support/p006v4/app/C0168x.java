package android.support.p006v4.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p006v4.app.C0164w;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.x */
class C0168x implements C0163v {

    /* renamed from: a */
    private final Notification.Builder f563a;

    /* renamed from: b */
    private final C0164w.C0166b f564b;

    /* renamed from: c */
    private RemoteViews f565c;

    /* renamed from: d */
    private RemoteViews f566d;

    /* renamed from: e */
    private final List<Bundle> f567e = new ArrayList();

    /* renamed from: f */
    private final Bundle f568f = new Bundle();

    /* renamed from: g */
    private int f569g;

    /* renamed from: h */
    private RemoteViews f570h;

    C0168x(C0164w.C0166b bVar) {
        this.f564b = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f563a = new Notification.Builder(bVar.f537a, bVar.f530I);
        } else {
            this.f563a = new Notification.Builder(bVar.f537a);
        }
        Notification notification = bVar.f535N;
        this.f563a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, bVar.f544h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(bVar.f540d).setContentText(bVar.f541e).setContentInfo(bVar.f546j).setContentIntent(bVar.f542f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(bVar.f543g, (notification.flags & 128) != 0).setLargeIcon(bVar.f545i).setNumber(bVar.f547k).setProgress(bVar.f554r, bVar.f555s, bVar.f556t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f563a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f563a.setSubText(bVar.f552p).setUsesChronometer(bVar.f550n).setPriority(bVar.f548l);
            Iterator<C0164w.C0165a> it = bVar.f538b.iterator();
            while (it.hasNext()) {
                m779a(it.next());
            }
            if (bVar.f523B != null) {
                this.f568f.putAll(bVar.f523B);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (bVar.f560x) {
                    this.f568f.putBoolean("android.support.localOnly", true);
                }
                if (bVar.f557u != null) {
                    this.f568f.putString("android.support.groupKey", bVar.f557u);
                    if (bVar.f558v) {
                        this.f568f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f568f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (bVar.f559w != null) {
                    this.f568f.putString("android.support.sortKey", bVar.f559w);
                }
            }
            this.f565c = bVar.f527F;
            this.f566d = bVar.f528G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f563a.setShowWhen(bVar.f549m);
            if (Build.VERSION.SDK_INT < 21 && bVar.f536O != null && !bVar.f536O.isEmpty()) {
                this.f568f.putStringArray("android.people", (String[]) bVar.f536O.toArray(new String[bVar.f536O.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f563a.setLocalOnly(bVar.f560x).setGroup(bVar.f557u).setGroupSummary(bVar.f558v).setSortKey(bVar.f559w);
            this.f569g = bVar.f534M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f563a.setCategory(bVar.f522A).setColor(bVar.f524C).setVisibility(bVar.f525D).setPublicVersion(bVar.f526E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = bVar.f536O.iterator();
            while (it2.hasNext()) {
                this.f563a.addPerson(it2.next());
            }
            this.f570h = bVar.f529H;
            if (bVar.f539c.size() > 0) {
                Bundle bundle = bVar.mo703a().getBundle("android.car.EXTENSIONS");
                Bundle bundle2 = bundle == null ? new Bundle() : bundle;
                Bundle bundle3 = new Bundle();
                for (int i = 0; i < bVar.f539c.size(); i++) {
                    bundle3.putBundle(Integer.toString(i), C0169y.m785a(bVar.f539c.get(i)));
                }
                bundle2.putBundle("invisible_actions", bundle3);
                bVar.mo703a().putBundle("android.car.EXTENSIONS", bundle2);
                this.f568f.putBundle("android.car.EXTENSIONS", bundle2);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f563a.setExtras(bVar.f523B).setRemoteInputHistory(bVar.f553q);
            if (bVar.f527F != null) {
                this.f563a.setCustomContentView(bVar.f527F);
            }
            if (bVar.f528G != null) {
                this.f563a.setCustomBigContentView(bVar.f528G);
            }
            if (bVar.f529H != null) {
                this.f563a.setCustomHeadsUpContentView(bVar.f529H);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f563a.setBadgeIconType(bVar.f531J).setShortcutId(bVar.f532K).setTimeoutAfter(bVar.f533L).setGroupAlertBehavior(bVar.f534M);
            if (bVar.f562z) {
                this.f563a.setColorized(bVar.f561y);
            }
            if (!TextUtils.isEmpty(bVar.f530I)) {
                this.f563a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
    }

    /* renamed from: a */
    private void m778a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* renamed from: a */
    private void m779a(C0164w.C0165a aVar) {
        if (Build.VERSION.SDK_INT >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.mo694a(), aVar.mo695b(), aVar.mo696c());
            if (aVar.mo699f() != null) {
                for (RemoteInput addRemoteInput : C0093aa.m311a(aVar.mo699f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.mo697d() != null ? new Bundle(aVar.mo697d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo698e());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo698e());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo700g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.mo700g());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo702i());
            builder.addExtras(bundle);
            this.f563a.addAction(builder.build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f567e.add(C0169y.m782a(this.f563a, aVar));
        }
    }

    /* renamed from: a */
    public Notification mo718a() {
        Bundle a;
        RemoteViews d;
        RemoteViews c;
        C0164w.C0167c cVar = this.f564b.f551o;
        if (cVar != null) {
            cVar.mo714a((C0163v) this);
        }
        RemoteViews b = cVar != null ? cVar.mo715b(this) : null;
        Notification b2 = mo719b();
        if (b != null) {
            b2.contentView = b;
        } else if (this.f564b.f527F != null) {
            b2.contentView = this.f564b.f527F;
        }
        if (!(Build.VERSION.SDK_INT < 16 || cVar == null || (c = cVar.mo716c(this)) == null)) {
            b2.bigContentView = c;
        }
        if (!(Build.VERSION.SDK_INT < 21 || cVar == null || (d = this.f564b.f551o.mo717d(this)) == null)) {
            b2.headsUpContentView = d;
        }
        if (!(Build.VERSION.SDK_INT < 16 || cVar == null || (a = C0164w.m751a(b2)) == null)) {
            cVar.mo713a(a);
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Notification mo719b() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f563a.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification build = this.f563a.build();
            if (this.f569g == 0) {
                return build;
            }
            if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f569g != 2)) {
                m778a(build);
            }
            if (build.getGroup() == null || (build.flags & 512) != 0 || this.f569g != 1) {
                return build;
            }
            m778a(build);
            return build;
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f563a.setExtras(this.f568f);
            Notification build2 = this.f563a.build();
            if (this.f565c != null) {
                build2.contentView = this.f565c;
            }
            if (this.f566d != null) {
                build2.bigContentView = this.f566d;
            }
            if (this.f570h != null) {
                build2.headsUpContentView = this.f570h;
            }
            if (this.f569g == 0) {
                return build2;
            }
            if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f569g != 2)) {
                m778a(build2);
            }
            if (build2.getGroup() == null || (build2.flags & 512) != 0 || this.f569g != 1) {
                return build2;
            }
            m778a(build2);
            return build2;
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f563a.setExtras(this.f568f);
            Notification build3 = this.f563a.build();
            if (this.f565c != null) {
                build3.contentView = this.f565c;
            }
            if (this.f566d != null) {
                build3.bigContentView = this.f566d;
            }
            if (this.f569g == 0) {
                return build3;
            }
            if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f569g != 2)) {
                m778a(build3);
            }
            if (build3.getGroup() == null || (build3.flags & 512) != 0 || this.f569g != 1) {
                return build3;
            }
            m778a(build3);
            return build3;
        } else if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> a = C0169y.m786a(this.f567e);
            if (a != null) {
                this.f568f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f563a.setExtras(this.f568f);
            Notification build4 = this.f563a.build();
            if (this.f565c != null) {
                build4.contentView = this.f565c;
            }
            if (this.f566d == null) {
                return build4;
            }
            build4.bigContentView = this.f566d;
            return build4;
        } else if (Build.VERSION.SDK_INT < 16) {
            return this.f563a.getNotification();
        } else {
            Notification build5 = this.f563a.build();
            Bundle a2 = C0164w.m751a(build5);
            Bundle bundle = new Bundle(this.f568f);
            for (String str : this.f568f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0169y.m786a(this.f567e);
            if (a3 != null) {
                C0164w.m751a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            if (this.f565c != null) {
                build5.contentView = this.f565c;
            }
            if (this.f566d != null) {
                build5.bigContentView = this.f566d;
            }
            return build5;
        }
    }
}
