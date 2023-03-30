package android.support.p006v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p006v4.p007a.C0068a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.ae */
public final class C0097ae implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f228a = new ArrayList<>();

    /* renamed from: b */
    private final Context f229b;

    /* renamed from: android.support.v4.app.ae$a */
    public interface C0098a {
        /* renamed from: a_ */
        Intent mo315a_();
    }

    private C0097ae(Context context) {
        this.f229b = context;
    }

    /* renamed from: a */
    public static C0097ae m323a(Context context) {
        return new C0097ae(context);
    }

    /* renamed from: a */
    public C0097ae mo309a(Activity activity) {
        Intent intent = null;
        if (activity instanceof C0098a) {
            intent = ((C0098a) activity).mo315a_();
        }
        Intent a = intent == null ? C0162u.m745a(activity) : intent;
        if (a != null) {
            ComponentName component = a.getComponent();
            if (component == null) {
                component = a.resolveActivity(this.f229b.getPackageManager());
            }
            mo310a(component);
            mo311a(a);
        }
        return this;
    }

    /* renamed from: a */
    public C0097ae mo310a(ComponentName componentName) {
        int size = this.f228a.size();
        try {
            Intent a = C0162u.m746a(this.f229b, componentName);
            while (a != null) {
                this.f228a.add(size, a);
                a = C0162u.m746a(this.f229b, a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0097ae mo311a(Intent intent) {
        this.f228a.add(intent);
        return this;
    }

    /* renamed from: a */
    public void mo312a() {
        mo313a((Bundle) null);
    }

    /* renamed from: a */
    public void mo313a(Bundle bundle) {
        if (this.f228a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f228a.toArray(new Intent[this.f228a.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!C0068a.m209a(this.f229b, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f229b.startActivity(intent);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f228a.iterator();
    }
}
