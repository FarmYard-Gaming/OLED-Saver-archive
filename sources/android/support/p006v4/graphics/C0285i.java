package android.support.p006v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: android.support.v4.graphics.i */
public class C0285i {
    /* renamed from: a */
    public static File m1222a(Context context) {
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 100) {
                return null;
            }
            File file = new File(context.getCacheDir(), str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i = i2 + 1;
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static ByteBuffer m1223a(Context context, Resources resources, int i) {
        ByteBuffer byteBuffer = null;
        File a = m1222a(context);
        if (a != null) {
            try {
                if (m1227a(a, resources, i)) {
                    byteBuffer = m1225a(a);
                    a.delete();
                }
            } finally {
                a.delete();
            }
        }
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0067, code lost:
        r1 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0070, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0071, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x008c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x008d, code lost:
        r1 = r0;
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0066 A[ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE])] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m1224a(android.content.Context r11, android.os.CancellationSignal r12, android.net.Uri r13) {
        /*
            r6 = 0
            android.content.ContentResolver r0 = r11.getContentResolver()
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r0.openFileDescriptor(r13, r1, r12)     // Catch:{ IOException -> 0x001c }
            r8 = 0
            if (r7 != 0) goto L_0x0023
            if (r7 == 0) goto L_0x0015
            if (r6 == 0) goto L_0x001f
            r7.close()     // Catch:{ Throwable -> 0x0017 }
        L_0x0015:
            r0 = r6
        L_0x0016:
            return r0
        L_0x0017:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch:{ IOException -> 0x001c }
            goto L_0x0015
        L_0x001c:
            r0 = move-exception
            r0 = r6
            goto L_0x0016
        L_0x001f:
            r7.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x0015
        L_0x0023:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0056, all -> 0x0066 }
            java.io.FileDescriptor r0 = r7.getFileDescriptor()     // Catch:{ Throwable -> 0x0056, all -> 0x0066 }
            r9.<init>(r0)     // Catch:{ Throwable -> 0x0056, all -> 0x0066 }
            r10 = 0
            java.nio.channels.FileChannel r0 = r9.getChannel()     // Catch:{ Throwable -> 0x006e, all -> 0x008c }
            long r4 = r0.size()     // Catch:{ Throwable -> 0x006e, all -> 0x008c }
            java.nio.channels.FileChannel$MapMode r1 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x006e, all -> 0x008c }
            r2 = 0
            java.nio.MappedByteBuffer r0 = r0.map(r1, r2, r4)     // Catch:{ Throwable -> 0x006e, all -> 0x008c }
            if (r9 == 0) goto L_0x0044
            if (r6 == 0) goto L_0x0062
            r9.close()     // Catch:{ Throwable -> 0x0051, all -> 0x0066 }
        L_0x0044:
            if (r7 == 0) goto L_0x0016
            if (r6 == 0) goto L_0x006a
            r7.close()     // Catch:{ Throwable -> 0x004c }
            goto L_0x0016
        L_0x004c:
            r1 = move-exception
            r8.addSuppressed(r1)     // Catch:{ IOException -> 0x001c }
            goto L_0x0016
        L_0x0051:
            r1 = move-exception
            r10.addSuppressed(r1)     // Catch:{ Throwable -> 0x0056, all -> 0x0066 }
            goto L_0x0044
        L_0x0056:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            r2 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x0061
            if (r2 == 0) goto L_0x0088
            r7.close()     // Catch:{ Throwable -> 0x0083 }
        L_0x0061:
            throw r1     // Catch:{ IOException -> 0x001c }
        L_0x0062:
            r9.close()     // Catch:{ Throwable -> 0x0056, all -> 0x0066 }
            goto L_0x0044
        L_0x0066:
            r0 = move-exception
            r1 = r0
            r2 = r6
            goto L_0x005a
        L_0x006a:
            r7.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x0016
        L_0x006e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r1 = move-exception
            r2 = r0
        L_0x0072:
            if (r9 == 0) goto L_0x0079
            if (r2 == 0) goto L_0x007f
            r9.close()     // Catch:{ Throwable -> 0x007a, all -> 0x0066 }
        L_0x0079:
            throw r1     // Catch:{ Throwable -> 0x0056, all -> 0x0066 }
        L_0x007a:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ Throwable -> 0x0056, all -> 0x0066 }
            goto L_0x0079
        L_0x007f:
            r9.close()     // Catch:{ Throwable -> 0x0056, all -> 0x0066 }
            goto L_0x0079
        L_0x0083:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IOException -> 0x001c }
            goto L_0x0061
        L_0x0088:
            r7.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x0061
        L_0x008c:
            r0 = move-exception
            r1 = r0
            r2 = r6
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.graphics.C0285i.m1224a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        r1 = r0;
        r2 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.ByteBuffer m1225a(java.io.File r9) {
        /*
            r6 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0024 }
            r7.<init>(r9)     // Catch:{ IOException -> 0x0024 }
            r8 = 0
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ Throwable -> 0x002b, all -> 0x0040 }
            long r4 = r0.size()     // Catch:{ Throwable -> 0x002b, all -> 0x0040 }
            java.nio.channels.FileChannel$MapMode r1 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x002b, all -> 0x0040 }
            r2 = 0
            java.nio.MappedByteBuffer r0 = r0.map(r1, r2, r4)     // Catch:{ Throwable -> 0x002b, all -> 0x0040 }
            if (r7 == 0) goto L_0x001e
            if (r6 == 0) goto L_0x0027
            r7.close()     // Catch:{ Throwable -> 0x001f }
        L_0x001e:
            return r0
        L_0x001f:
            r1 = move-exception
            r8.addSuppressed(r1)     // Catch:{ IOException -> 0x0024 }
            goto L_0x001e
        L_0x0024:
            r0 = move-exception
            r0 = r6
            goto L_0x001e
        L_0x0027:
            r7.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x001e
        L_0x002b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r1 = move-exception
            r2 = r0
        L_0x002f:
            if (r7 == 0) goto L_0x0036
            if (r2 == 0) goto L_0x003c
            r7.close()     // Catch:{ Throwable -> 0x0037 }
        L_0x0036:
            throw r1     // Catch:{ IOException -> 0x0024 }
        L_0x0037:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IOException -> 0x0024 }
            goto L_0x0036
        L_0x003c:
            r7.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x0036
        L_0x0040:
            r0 = move-exception
            r1 = r0
            r2 = r6
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.graphics.C0285i.m1225a(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static void m1226a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1227a(File file, Resources resources, int i) {
        InputStream inputStream = null;
        try {
            inputStream = resources.openRawResource(i);
            return m1228a(file, inputStream);
        } finally {
            m1226a((Closeable) inputStream);
        }
    }

    /* renamed from: a */
    public static boolean m1228a(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        m1226a((Closeable) fileOutputStream);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m1226a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m1226a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m1226a((Closeable) fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            m1226a((Closeable) fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }
}
