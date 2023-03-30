package android.support.p006v4.p012d;

import android.support.p006v4.p014f.C0215j;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.d.a */
public final class C0181a {

    /* renamed from: a */
    private final String f586a;

    /* renamed from: b */
    private final String f587b;

    /* renamed from: c */
    private final String f588c;

    /* renamed from: d */
    private final List<List<byte[]>> f589d;

    /* renamed from: e */
    private final int f590e = 0;

    /* renamed from: f */
    private final String f591f = (this.f586a + "-" + this.f587b + "-" + this.f588c);

    public C0181a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f586a = (String) C0215j.m922a(str);
        this.f587b = (String) C0215j.m922a(str2);
        this.f588c = (String) C0215j.m922a(str3);
        this.f589d = (List) C0215j.m922a(list);
    }

    /* renamed from: a */
    public String mo759a() {
        return this.f586a;
    }

    /* renamed from: b */
    public String mo760b() {
        return this.f587b;
    }

    /* renamed from: c */
    public String mo761c() {
        return this.f588c;
    }

    /* renamed from: d */
    public List<List<byte[]>> mo762d() {
        return this.f589d;
    }

    /* renamed from: e */
    public int mo763e() {
        return this.f590e;
    }

    /* renamed from: f */
    public String mo764f() {
        return this.f591f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f586a + ", mProviderPackage: " + this.f587b + ", mQuery: " + this.f588c + ", mCertificates:");
        for (int i = 0; i < this.f589d.size(); i++) {
            sb.append(" [");
            List list = this.f589d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f590e);
        return sb.toString();
    }
}
