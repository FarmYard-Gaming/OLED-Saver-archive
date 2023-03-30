package android.support.p006v4.graphics;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* renamed from: android.support.v4.graphics.d */
class C0269d extends C0281h {
    C0269d() {
    }

    /* renamed from: a */
    private File m1143a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005b, code lost:
        r2 = r1;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0069, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x009b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x009c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x005a A[ExcHandler: all (r1v4 'th' java.lang.Throwable A[CUSTOM_DECLARE])] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo1102a(android.content.Context r7, android.os.CancellationSignal r8, android.support.p006v4.p012d.C0182b.C0188b[] r9, int r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.length
            r2 = 1
            if (r1 >= r2) goto L_0x0006
        L_0x0005:
            return r0
        L_0x0006:
            android.support.v4.d.b$b r1 = r6.mo1160a((android.support.p006v4.p012d.C0182b.C0188b[]) r9, (int) r10)
            android.content.ContentResolver r2 = r7.getContentResolver()
            android.net.Uri r1 = r1.mo775a()     // Catch:{ IOException -> 0x0054 }
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r4 = r2.openFileDescriptor(r1, r3, r8)     // Catch:{ IOException -> 0x0054 }
            r2 = 0
            java.io.File r1 = r6.m1143a(r4)     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            if (r1 == 0) goto L_0x0025
            boolean r3 = r1.canRead()     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            if (r3 != 0) goto L_0x007b
        L_0x0025:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            java.io.FileDescriptor r1 = r4.getFileDescriptor()     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            r3.<init>(r1)     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            r5 = 0
            android.graphics.Typeface r1 = super.mo1159a((android.content.Context) r7, (java.io.InputStream) r3)     // Catch:{ Throwable -> 0x0067, all -> 0x009b }
            if (r3 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x0056
            r3.close()     // Catch:{ Throwable -> 0x0043, all -> 0x005a }
        L_0x003a:
            if (r4 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0063
            r4.close()     // Catch:{ Throwable -> 0x005e }
        L_0x0041:
            r0 = r1
            goto L_0x0005
        L_0x0043:
            r3 = move-exception
            r5.addSuppressed(r3)     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            goto L_0x003a
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r2 = move-exception
            r3 = r1
        L_0x004c:
            if (r4 == 0) goto L_0x0053
            if (r3 == 0) goto L_0x0097
            r4.close()     // Catch:{ Throwable -> 0x0092 }
        L_0x0053:
            throw r2     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            goto L_0x0005
        L_0x0056:
            r3.close()     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            goto L_0x003a
        L_0x005a:
            r1 = move-exception
            r2 = r1
            r3 = r0
            goto L_0x004c
        L_0x005e:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ IOException -> 0x0054 }
            goto L_0x0041
        L_0x0063:
            r4.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0041
        L_0x0067:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
        L_0x006a:
            if (r3 == 0) goto L_0x0071
            if (r2 == 0) goto L_0x0077
            r3.close()     // Catch:{ Throwable -> 0x0072, all -> 0x005a }
        L_0x0071:
            throw r1     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
        L_0x0072:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            goto L_0x0071
        L_0x0077:
            r3.close()     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            goto L_0x0071
        L_0x007b:
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromFile(r1)     // Catch:{ Throwable -> 0x0048, all -> 0x005a }
            if (r4 == 0) goto L_0x0086
            if (r0 == 0) goto L_0x008e
            r4.close()     // Catch:{ Throwable -> 0x0089 }
        L_0x0086:
            r0 = r1
            goto L_0x0005
        L_0x0089:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ IOException -> 0x0054 }
            goto L_0x0086
        L_0x008e:
            r4.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0086
        L_0x0092:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch:{ IOException -> 0x0054 }
            goto L_0x0053
        L_0x0097:
            r4.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0053
        L_0x009b:
            r1 = move-exception
            r2 = r0
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.graphics.C0269d.mo1102a(android.content.Context, android.os.CancellationSignal, android.support.v4.d.b$b[], int):android.graphics.Typeface");
    }
}
