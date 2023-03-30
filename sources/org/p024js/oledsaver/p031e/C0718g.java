package org.p024js.oledsaver.p031e;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: org.js.oledsaver.e.g */
public class C0718g {

    /* renamed from: a */
    private static String f2613a;

    /* renamed from: b */
    private static String f2614b;

    /* renamed from: a */
    public static boolean m3478a() {
        return m3479a("MIUI");
    }

    /* renamed from: a */
    public static boolean m3479a(String str) {
        if (f2613a != null) {
            return f2613a.equals(str);
        }
        String b = m3480b("ro.miui.ui.version.name");
        f2614b = b;
        if (!TextUtils.isEmpty(b)) {
            f2613a = "MIUI";
        } else {
            String b2 = m3480b("ro.build.version.emui");
            f2614b = b2;
            if (!TextUtils.isEmpty(b2)) {
                f2613a = "EMUI";
            } else {
                String b3 = m3480b("ro.build.version.opporom");
                f2614b = b3;
                if (!TextUtils.isEmpty(b3)) {
                    f2613a = "OPPO";
                } else {
                    String b4 = m3480b("ro.vivo.os.version");
                    f2614b = b4;
                    if (!TextUtils.isEmpty(b4)) {
                        f2613a = "VIVO";
                    } else {
                        String b5 = m3480b("ro.smartisan.version");
                        f2614b = b5;
                        if (!TextUtils.isEmpty(b5)) {
                            f2613a = "SMARTISAN";
                        } else {
                            f2614b = Build.DISPLAY;
                            if (f2614b.toUpperCase().contains("FLYME")) {
                                f2613a = "FLYME";
                            } else {
                                f2614b = "unknown";
                                f2613a = Build.MANUFACTURER.toUpperCase();
                            }
                        }
                    }
                }
            }
        }
        return f2613a.equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[SYNTHETIC, Splitter:B:16:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067 A[SYNTHETIC, Splitter:B:23:0x0067] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3480b(java.lang.String r6) {
        /*
            r1 = 0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            r2.<init>()     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            java.lang.String r3 = "getprop "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            java.lang.StringBuilder r2 = r2.append(r6)     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            java.lang.Process r0 = r0.exec(r2)     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x003e, all -> 0x0064 }
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x0073 }
            r2.close()     // Catch:{ IOException -> 0x0073 }
            if (r2 == 0) goto L_0x0038
            r2.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0038:
            return r0
        L_0x0039:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0038
        L_0x003e:
            r0 = move-exception
            r2 = r1
        L_0x0040:
            java.lang.String r3 = "RomUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r4.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "Unable to read prop "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0070 }
            android.util.Log.e(r3, r4, r0)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ IOException -> 0x005f }
        L_0x005d:
            r0 = r1
            goto L_0x0038
        L_0x005f:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x005d
        L_0x0064:
            r0 = move-exception
        L_0x0065:
            if (r1 == 0) goto L_0x006a
            r1.close()     // Catch:{ IOException -> 0x006b }
        L_0x006a:
            throw r0
        L_0x006b:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x006a
        L_0x0070:
            r0 = move-exception
            r1 = r2
            goto L_0x0065
        L_0x0073:
            r0 = move-exception
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p024js.oledsaver.p031e.C0718g.m3480b(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m3481b() {
        return m3479a("FLYME");
    }
}
