package android.support.p018v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: android.support.v7.widget.d */
class C0596d extends DataSetObservable {

    /* renamed from: a */
    static final String f2171a = C0596d.class.getSimpleName();

    /* renamed from: e */
    private static final Object f2172e = new Object();

    /* renamed from: f */
    private static final Map<String, C0596d> f2173f = new HashMap();

    /* renamed from: b */
    final Context f2174b;

    /* renamed from: c */
    final String f2175c;

    /* renamed from: d */
    boolean f2176d;

    /* renamed from: g */
    private final Object f2177g;

    /* renamed from: h */
    private final List<C0597a> f2178h;

    /* renamed from: i */
    private final List<C0599c> f2179i;

    /* renamed from: j */
    private Intent f2180j;

    /* renamed from: k */
    private C0598b f2181k;

    /* renamed from: l */
    private int f2182l;

    /* renamed from: m */
    private boolean f2183m;

    /* renamed from: n */
    private boolean f2184n;

    /* renamed from: o */
    private boolean f2185o;

    /* renamed from: p */
    private C0600d f2186p;

    /* renamed from: android.support.v7.widget.d$a */
    public static final class C0597a implements Comparable<C0597a> {

        /* renamed from: a */
        public final ResolveInfo f2187a;

        /* renamed from: b */
        public float f2188b;

        public C0597a(ResolveInfo resolveInfo) {
            this.f2187a = resolveInfo;
        }

        /* renamed from: a */
        public int compareTo(C0597a aVar) {
            return Float.floatToIntBits(aVar.f2188b) - Float.floatToIntBits(this.f2188b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f2188b) == Float.floatToIntBits(((C0597a) obj).f2188b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f2188b) + 31;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:").append(this.f2187a.toString());
            sb.append("; weight:").append(new BigDecimal((double) this.f2188b));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.d$b */
    public interface C0598b {
        /* renamed from: a */
        void mo3027a(Intent intent, List<C0597a> list, List<C0599c> list2);
    }

    /* renamed from: android.support.v7.widget.d$c */
    public static final class C0599c {

        /* renamed from: a */
        public final ComponentName f2189a;

        /* renamed from: b */
        public final long f2190b;

        /* renamed from: c */
        public final float f2191c;

        public C0599c(ComponentName componentName, long j, float f) {
            this.f2189a = componentName;
            this.f2190b = j;
            this.f2191c = f;
        }

        public C0599c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            C0599c cVar = (C0599c) obj;
            if (this.f2189a == null) {
                if (cVar.f2189a != null) {
                    return false;
                }
            } else if (!this.f2189a.equals(cVar.f2189a)) {
                return false;
            }
            if (this.f2190b != cVar.f2190b) {
                return false;
            }
            return Float.floatToIntBits(this.f2191c) == Float.floatToIntBits(cVar.f2191c);
        }

        public int hashCode() {
            return (((((this.f2189a == null ? 0 : this.f2189a.hashCode()) + 31) * 31) + ((int) (this.f2190b ^ (this.f2190b >>> 32)))) * 31) + Float.floatToIntBits(this.f2191c);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:").append(this.f2189a);
            sb.append("; time:").append(this.f2190b);
            sb.append("; weight:").append(new BigDecimal((double) this.f2191c));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.d$d */
    public interface C0600d {
        /* renamed from: a */
        boolean mo3031a(C0596d dVar, Intent intent);
    }

    /* renamed from: android.support.v7.widget.d$e */
    private final class C0601e extends AsyncTask<Object, Void, Void> {
        C0601e() {
        }

        /* renamed from: a */
        public Void doInBackground(Object... objArr) {
            List list = objArr[0];
            String str = objArr[1];
            try {
                FileOutputStream openFileOutput = C0596d.this.f2174b.openFileOutput(str, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, (String) null);
                    newSerializer.startDocument("UTF-8", true);
                    newSerializer.startTag((String) null, "historical-records");
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C0599c cVar = (C0599c) list.remove(0);
                        newSerializer.startTag((String) null, "historical-record");
                        newSerializer.attribute((String) null, "activity", cVar.f2189a.flattenToString());
                        newSerializer.attribute((String) null, "time", String.valueOf(cVar.f2190b));
                        newSerializer.attribute((String) null, "weight", String.valueOf(cVar.f2191c));
                        newSerializer.endTag((String) null, "historical-record");
                    }
                    newSerializer.endTag((String) null, "historical-records");
                    newSerializer.endDocument();
                    C0596d.this.f2176d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    Log.e(C0596d.f2171a, "Error writing historical record file: " + C0596d.this.f2175c, e2);
                    C0596d.this.f2176d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (IllegalStateException e4) {
                    Log.e(C0596d.f2171a, "Error writing historical record file: " + C0596d.this.f2175c, e4);
                    C0596d.this.f2176d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (IOException e6) {
                    Log.e(C0596d.f2171a, "Error writing historical record file: " + C0596d.this.f2175c, e6);
                    C0596d.this.f2176d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e7) {
                        }
                    }
                } catch (Throwable th) {
                    C0596d.this.f2176d = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e8) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e9) {
                Log.e(C0596d.f2171a, "Error writing historical record file: " + str, e9);
            }
            return null;
        }
    }

    /* renamed from: a */
    private boolean m2945a(C0599c cVar) {
        boolean add = this.f2179i.add(cVar);
        if (add) {
            this.f2184n = true;
            m2951h();
            m2946c();
            m2948e();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: c */
    private void m2946c() {
        if (!this.f2183m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f2184n) {
            this.f2184n = false;
            if (!TextUtils.isEmpty(this.f2175c)) {
                new C0601e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f2179i), this.f2175c});
            }
        }
    }

    /* renamed from: d */
    private void m2947d() {
        boolean f = m2949f() | m2950g();
        m2951h();
        if (f) {
            m2948e();
            notifyChanged();
        }
    }

    /* renamed from: e */
    private boolean m2948e() {
        if (this.f2181k == null || this.f2180j == null || this.f2178h.isEmpty() || this.f2179i.isEmpty()) {
            return false;
        }
        this.f2181k.mo3027a(this.f2180j, this.f2178h, Collections.unmodifiableList(this.f2179i));
        return true;
    }

    /* renamed from: f */
    private boolean m2949f() {
        if (!this.f2185o || this.f2180j == null) {
            return false;
        }
        this.f2185o = false;
        this.f2178h.clear();
        List<ResolveInfo> queryIntentActivities = this.f2174b.getPackageManager().queryIntentActivities(this.f2180j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f2178h.add(new C0597a(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: g */
    private boolean m2950g() {
        if (!this.f2176d || !this.f2184n || TextUtils.isEmpty(this.f2175c)) {
            return false;
        }
        this.f2176d = false;
        this.f2183m = true;
        m2952i();
        return true;
    }

    /* renamed from: h */
    private void m2951h() {
        int size = this.f2179i.size() - this.f2182l;
        if (size > 0) {
            this.f2184n = true;
            for (int i = 0; i < size; i++) {
                C0599c remove = this.f2179i.remove(0);
            }
        }
    }

    /* renamed from: i */
    private void m2952i() {
        try {
            FileInputStream openFileInput = this.f2174b.openFileInput(this.f2175c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if (!"historical-records".equals(newPullParser.getName())) {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
                List<C0599c> list = this.f2179i;
                list.clear();
                while (true) {
                    int next = newPullParser.next();
                    if (next == 1) {
                        if (openFileInput != null) {
                            try {
                                openFileInput.close();
                                return;
                            } catch (IOException e) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(next == 3 || next == 4)) {
                        if (!"historical-record".equals(newPullParser.getName())) {
                            throw new XmlPullParserException("Share records file not well-formed.");
                        }
                        list.add(new C0599c(newPullParser.getAttributeValue((String) null, "activity"), Long.parseLong(newPullParser.getAttributeValue((String) null, "time")), Float.parseFloat(newPullParser.getAttributeValue((String) null, "weight"))));
                    }
                }
            } catch (XmlPullParserException e2) {
                Log.e(f2171a, "Error reading historical recrod file: " + this.f2175c, e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (IOException e4) {
                Log.e(f2171a, "Error reading historical recrod file: " + this.f2175c, e4);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e5) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e7) {
        }
    }

    /* renamed from: a */
    public int mo3016a() {
        int size;
        synchronized (this.f2177g) {
            m2947d();
            size = this.f2178h.size();
        }
        return size;
    }

    /* renamed from: a */
    public int mo3017a(ResolveInfo resolveInfo) {
        synchronized (this.f2177g) {
            m2947d();
            List<C0597a> list = this.f2178h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f2187a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public ResolveInfo mo3018a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f2177g) {
            m2947d();
            resolveInfo = this.f2178h.get(i).f2187a;
        }
        return resolveInfo;
    }

    /* renamed from: b */
    public Intent mo3019b(int i) {
        synchronized (this.f2177g) {
            if (this.f2180j == null) {
                return null;
            }
            m2947d();
            C0597a aVar = this.f2178h.get(i);
            ComponentName componentName = new ComponentName(aVar.f2187a.activityInfo.packageName, aVar.f2187a.activityInfo.name);
            Intent intent = new Intent(this.f2180j);
            intent.setComponent(componentName);
            if (this.f2186p != null) {
                if (this.f2186p.mo3031a(this, new Intent(intent))) {
                    return null;
                }
            }
            m2945a(new C0599c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public ResolveInfo mo3020b() {
        synchronized (this.f2177g) {
            m2947d();
            if (this.f2178h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.f2178h.get(0).f2187a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public void mo3021c(int i) {
        synchronized (this.f2177g) {
            m2947d();
            C0597a aVar = this.f2178h.get(i);
            C0597a aVar2 = this.f2178h.get(0);
            m2945a(new C0599c(new ComponentName(aVar.f2187a.activityInfo.packageName, aVar.f2187a.activityInfo.name), System.currentTimeMillis(), aVar2 != null ? (aVar2.f2188b - aVar.f2188b) + 5.0f : 1.0f));
        }
    }
}
