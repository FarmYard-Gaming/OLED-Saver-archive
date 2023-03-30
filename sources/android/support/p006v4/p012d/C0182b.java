package android.support.p006v4.p012d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p006v4.graphics.C0268c;
import android.support.p006v4.graphics.C0285i;
import android.support.p006v4.p007a.p008a.C0071c;
import android.support.p006v4.p012d.C0190c;
import android.support.p006v4.p014f.C0207g;
import android.support.p006v4.p014f.C0215j;
import android.support.p006v4.p014f.C0216k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.d.b */
public class C0182b {

    /* renamed from: a */
    static final C0207g<String, Typeface> f592a = new C0207g<>(16);

    /* renamed from: b */
    static final Object f593b = new Object();

    /* renamed from: c */
    static final C0216k<String, ArrayList<C0190c.C0195a<C0189c>>> f594c = new C0216k<>();

    /* renamed from: d */
    private static final C0190c f595d = new C0190c("fonts", 10, 10000);

    /* renamed from: e */
    private static final Comparator<byte[]> f596e = new Comparator<byte[]>() {
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    };

    /* renamed from: android.support.v4.d.b$a */
    public static class C0187a {

        /* renamed from: a */
        private final int f604a;

        /* renamed from: b */
        private final C0188b[] f605b;

        public C0187a(int i, C0188b[] bVarArr) {
            this.f604a = i;
            this.f605b = bVarArr;
        }

        /* renamed from: a */
        public int mo773a() {
            return this.f604a;
        }

        /* renamed from: b */
        public C0188b[] mo774b() {
            return this.f605b;
        }
    }

    /* renamed from: android.support.v4.d.b$b */
    public static class C0188b {

        /* renamed from: a */
        private final Uri f606a;

        /* renamed from: b */
        private final int f607b;

        /* renamed from: c */
        private final int f608c;

        /* renamed from: d */
        private final boolean f609d;

        /* renamed from: e */
        private final int f610e;

        public C0188b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f606a = (Uri) C0215j.m922a(uri);
            this.f607b = i;
            this.f608c = i2;
            this.f609d = z;
            this.f610e = i3;
        }

        /* renamed from: a */
        public Uri mo775a() {
            return this.f606a;
        }

        /* renamed from: b */
        public int mo776b() {
            return this.f607b;
        }

        /* renamed from: c */
        public int mo777c() {
            return this.f608c;
        }

        /* renamed from: d */
        public boolean mo778d() {
            return this.f609d;
        }

        /* renamed from: e */
        public int mo779e() {
            return this.f610e;
        }
    }

    /* renamed from: android.support.v4.d.b$c */
    private static final class C0189c {

        /* renamed from: a */
        final Typeface f611a;

        /* renamed from: b */
        final int f612b;

        C0189c(Typeface typeface, int i) {
            this.f611a = typeface;
            this.f612b = i;
        }
    }

    /* renamed from: a */
    public static ProviderInfo m807a(PackageManager packageManager, C0181a aVar, Resources resources) {
        int i = 0;
        String a = aVar.mo759a();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + a);
        } else if (!resolveContentProvider.packageName.equals(aVar.mo760b())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + a + ", but package was not " + aVar.mo760b());
        } else {
            List<byte[]> a2 = m812a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f596e);
            List<List<byte[]>> a3 = m811a(aVar, resources);
            while (true) {
                int i2 = i;
                if (i2 >= a3.size()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(a3.get(i2));
                Collections.sort(arrayList, f596e);
                if (m814a(a2, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
                i = i2 + 1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        f595d.mo783a(r4, new android.support.p006v4.p012d.C0182b.C01853());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m808a(final android.content.Context r6, final android.support.p006v4.p012d.C0181a r7, final android.support.p006v4.p007a.p008a.C0079f.C0080a r8, final android.os.Handler r9, boolean r10, int r11, final int r12) {
        /*
            r2 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.mo764f()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r3 = r0.toString()
            android.support.v4.f.g<java.lang.String, android.graphics.Typeface> r0 = f592a
            java.lang.Object r0 = r0.mo861a(r3)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x002d
            if (r8 == 0) goto L_0x002b
            r8.mo256a((android.graphics.Typeface) r0)
        L_0x002b:
            r2 = r0
        L_0x002c:
            return r2
        L_0x002d:
            if (r10 == 0) goto L_0x004a
            r0 = -1
            if (r11 != r0) goto L_0x004a
            android.support.v4.d.b$c r0 = m810a((android.content.Context) r6, (android.support.p006v4.p012d.C0181a) r7, (int) r12)
            if (r8 == 0) goto L_0x0041
            int r1 = r0.f612b
            if (r1 != 0) goto L_0x0044
            android.graphics.Typeface r1 = r0.f611a
            r8.mo257a((android.graphics.Typeface) r1, (android.os.Handler) r9)
        L_0x0041:
            android.graphics.Typeface r2 = r0.f611a
            goto L_0x002c
        L_0x0044:
            int r1 = r0.f612b
            r8.mo255a((int) r1, (android.os.Handler) r9)
            goto L_0x0041
        L_0x004a:
            android.support.v4.d.b$1 r4 = new android.support.v4.d.b$1
            r4.<init>(r6, r7, r12, r3)
            if (r10 == 0) goto L_0x005c
            android.support.v4.d.c r0 = f595d     // Catch:{ InterruptedException -> 0x009e }
            java.lang.Object r0 = r0.mo780a(r4, (int) r11)     // Catch:{ InterruptedException -> 0x009e }
            android.support.v4.d.b$c r0 = (android.support.p006v4.p012d.C0182b.C0189c) r0     // Catch:{ InterruptedException -> 0x009e }
            android.graphics.Typeface r2 = r0.f611a     // Catch:{ InterruptedException -> 0x009e }
            goto L_0x002c
        L_0x005c:
            if (r8 != 0) goto L_0x007c
            r1 = r2
        L_0x005f:
            java.lang.Object r5 = f593b
            monitor-enter(r5)
            android.support.v4.f.k<java.lang.String, java.util.ArrayList<android.support.v4.d.c$a<android.support.v4.d.b$c>>> r0 = f594c     // Catch:{ all -> 0x0079 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0083
            if (r1 == 0) goto L_0x0077
            android.support.v4.f.k<java.lang.String, java.util.ArrayList<android.support.v4.d.c$a<android.support.v4.d.b$c>>> r0 = f594c     // Catch:{ all -> 0x0079 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0079 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0079 }
            r0.add(r1)     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            goto L_0x002c
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            throw r0
        L_0x007c:
            android.support.v4.d.b$2 r0 = new android.support.v4.d.b$2
            r0.<init>(r8, r9)
            r1 = r0
            goto L_0x005f
        L_0x0083:
            if (r1 == 0) goto L_0x0092
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0079 }
            r0.<init>()     // Catch:{ all -> 0x0079 }
            r0.add(r1)     // Catch:{ all -> 0x0079 }
            android.support.v4.f.k<java.lang.String, java.util.ArrayList<android.support.v4.d.c$a<android.support.v4.d.b$c>>> r1 = f594c     // Catch:{ all -> 0x0079 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0079 }
        L_0x0092:
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            android.support.v4.d.c r0 = f595d
            android.support.v4.d.b$3 r1 = new android.support.v4.d.b$3
            r1.<init>(r3)
            r0.mo783a(r4, r1)
            goto L_0x002c
        L_0x009e:
            r0 = move-exception
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.p012d.C0182b.m808a(android.content.Context, android.support.v4.d.a, android.support.v4.a.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static C0187a m809a(Context context, CancellationSignal cancellationSignal, C0181a aVar) {
        ProviderInfo a = m807a(context.getPackageManager(), aVar, context.getResources());
        return a == null ? new C0187a(1, (C0188b[]) null) : new C0187a(0, m815a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    static C0189c m810a(Context context, C0181a aVar, int i) {
        int i2 = -3;
        try {
            C0187a a = m809a(context, (CancellationSignal) null, aVar);
            if (a.mo773a() == 0) {
                Typeface a2 = C0268c.m1139a(context, (CancellationSignal) null, a.mo774b(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0189c(a2, i2);
            }
            if (a.mo773a() == 1) {
                i2 = -2;
            }
            return new C0189c((Typeface) null, i2);
        } catch (PackageManager.NameNotFoundException e) {
            return new C0189c((Typeface) null, -1);
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m811a(C0181a aVar, Resources resources) {
        return aVar.mo762d() != null ? aVar.mo762d() : C0071c.m230a(resources, aVar.mo763e());
    }

    /* renamed from: a */
    private static List<byte[]> m812a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m813a(Context context, C0188b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0188b bVar : bVarArr) {
            if (bVar.mo779e() == 0) {
                Uri a = bVar.mo775a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, C0285i.m1224a(context, cancellationSignal, a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m814a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0146  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.support.p006v4.p012d.C0182b.C0188b[] m815a(android.content.Context r18, android.support.p006v4.p012d.C0181a r19, java.lang.String r20, android.os.CancellationSignal r21) {
        /*
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            r0 = r20
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r3 = r2.build()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r4 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r4)
            r0 = r20
            android.net.Uri$Builder r2 = r2.authority(r0)
            java.lang.String r4 = "file"
            android.net.Uri$Builder r2 = r2.appendPath(r4)
            android.net.Uri r12 = r2.build()
            r9 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0153 }
            r4 = 16
            if (r2 <= r4) goto L_0x00f4
            android.content.ContentResolver r2 = r18.getContentResolver()     // Catch:{ all -> 0x0153 }
            r4 = 7
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0153 }
            r5 = 0
            java.lang.String r6 = "_id"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 1
            java.lang.String r6 = "file_id"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 2
            java.lang.String r6 = "font_ttc_index"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 3
            java.lang.String r6 = "font_variation_settings"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 4
            java.lang.String r6 = "font_weight"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 5
            java.lang.String r6 = "font_italic"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 6
            java.lang.String r6 = "result_code"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            java.lang.String r5 = "query = ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0153 }
            r7 = 0
            java.lang.String r8 = r19.mo761c()     // Catch:{ all -> 0x0153 }
            r6[r7] = r8     // Catch:{ all -> 0x0153 }
            r7 = 0
            r8 = r21
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0153 }
        L_0x0079:
            if (r10 == 0) goto L_0x0143
            int r2 = r10.getCount()     // Catch:{ all -> 0x00ec }
            if (r2 <= 0) goto L_0x0143
            java.lang.String r2 = "result_code"
            int r11 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x00ec }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00ec }
            r2.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "_id"
            int r13 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "file_id"
            int r14 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "font_ttc_index"
            int r15 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "font_weight"
            int r16 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "font_italic"
            int r17 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00ec }
        L_0x00aa:
            boolean r4 = r10.moveToNext()     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x0144
            r4 = -1
            if (r11 == r4) goto L_0x0131
            int r9 = r10.getInt(r11)     // Catch:{ all -> 0x00ec }
        L_0x00b7:
            r4 = -1
            if (r15 == r4) goto L_0x0133
            int r6 = r10.getInt(r15)     // Catch:{ all -> 0x00ec }
        L_0x00be:
            r4 = -1
            if (r14 != r4) goto L_0x0135
            long r4 = r10.getLong(r13)     // Catch:{ all -> 0x00ec }
            android.net.Uri r5 = android.content.ContentUris.withAppendedId(r3, r4)     // Catch:{ all -> 0x00ec }
        L_0x00c9:
            r4 = -1
            r0 = r16
            if (r0 == r4) goto L_0x013e
            r0 = r16
            int r7 = r10.getInt(r0)     // Catch:{ all -> 0x00ec }
        L_0x00d4:
            r4 = -1
            r0 = r17
            if (r0 == r4) goto L_0x0141
            r0 = r17
            int r4 = r10.getInt(r0)     // Catch:{ all -> 0x00ec }
            r8 = 1
            if (r4 != r8) goto L_0x0141
            r8 = 1
        L_0x00e3:
            android.support.v4.d.b$b r4 = new android.support.v4.d.b$b     // Catch:{ all -> 0x00ec }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ec }
            r2.add(r4)     // Catch:{ all -> 0x00ec }
            goto L_0x00aa
        L_0x00ec:
            r2 = move-exception
            r3 = r10
        L_0x00ee:
            if (r3 == 0) goto L_0x00f3
            r3.close()
        L_0x00f3:
            throw r2
        L_0x00f4:
            android.content.ContentResolver r2 = r18.getContentResolver()     // Catch:{ all -> 0x0153 }
            r4 = 7
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0153 }
            r5 = 0
            java.lang.String r6 = "_id"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 1
            java.lang.String r6 = "file_id"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 2
            java.lang.String r6 = "font_ttc_index"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 3
            java.lang.String r6 = "font_variation_settings"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 4
            java.lang.String r6 = "font_weight"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 5
            java.lang.String r6 = "font_italic"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            r5 = 6
            java.lang.String r6 = "result_code"
            r4[r5] = r6     // Catch:{ all -> 0x0153 }
            java.lang.String r5 = "query = ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0153 }
            r7 = 0
            java.lang.String r8 = r19.mo761c()     // Catch:{ all -> 0x0153 }
            r6[r7] = r8     // Catch:{ all -> 0x0153 }
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0153 }
            goto L_0x0079
        L_0x0131:
            r9 = 0
            goto L_0x00b7
        L_0x0133:
            r6 = 0
            goto L_0x00be
        L_0x0135:
            long r4 = r10.getLong(r14)     // Catch:{ all -> 0x00ec }
            android.net.Uri r5 = android.content.ContentUris.withAppendedId(r12, r4)     // Catch:{ all -> 0x00ec }
            goto L_0x00c9
        L_0x013e:
            r7 = 400(0x190, float:5.6E-43)
            goto L_0x00d4
        L_0x0141:
            r8 = 0
            goto L_0x00e3
        L_0x0143:
            r2 = r11
        L_0x0144:
            if (r10 == 0) goto L_0x0149
            r10.close()
        L_0x0149:
            r3 = 0
            android.support.v4.d.b$b[] r3 = new android.support.p006v4.p012d.C0182b.C0188b[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            android.support.v4.d.b$b[] r2 = (android.support.p006v4.p012d.C0182b.C0188b[]) r2
            return r2
        L_0x0153:
            r2 = move-exception
            r3 = r9
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.p012d.C0182b.m815a(android.content.Context, android.support.v4.d.a, java.lang.String, android.os.CancellationSignal):android.support.v4.d.b$b[]");
    }
}
