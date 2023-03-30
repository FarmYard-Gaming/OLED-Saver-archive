package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.b */
class C0638b extends C0637a {

    /* renamed from: a */
    private final SparseIntArray f2295a;

    /* renamed from: b */
    private final Parcel f2296b;

    /* renamed from: c */
    private final int f2297c;

    /* renamed from: d */
    private final int f2298d;

    /* renamed from: e */
    private final String f2299e;

    /* renamed from: f */
    private int f2300f;

    /* renamed from: g */
    private int f2301g;

    C0638b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    C0638b(Parcel parcel, int i, int i2, String str) {
        this.f2295a = new SparseIntArray();
        this.f2300f = -1;
        this.f2301g = 0;
        this.f2296b = parcel;
        this.f2297c = i;
        this.f2298d = i2;
        this.f2301g = this.f2297c;
        this.f2299e = str;
    }

    /* renamed from: d */
    private int m3112d(int i) {
        while (this.f2301g < this.f2298d) {
            this.f2296b.setDataPosition(this.f2301g);
            int readInt = this.f2296b.readInt();
            int readInt2 = this.f2296b.readInt();
            this.f2301g = readInt + this.f2301g;
            if (readInt2 == i) {
                return this.f2296b.dataPosition();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo3241a(int i) {
        this.f2296b.writeInt(i);
    }

    /* renamed from: a */
    public void mo3243a(Parcelable parcelable) {
        this.f2296b.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public void mo3247a(String str) {
        this.f2296b.writeString(str);
    }

    /* renamed from: a */
    public void mo3250a(byte[] bArr) {
        if (bArr != null) {
            this.f2296b.writeInt(bArr.length);
            this.f2296b.writeByteArray(bArr);
            return;
        }
        this.f2296b.writeInt(-1);
    }

    /* renamed from: b */
    public void mo3257b() {
        if (this.f2300f >= 0) {
            int i = this.f2295a.get(this.f2300f);
            int dataPosition = this.f2296b.dataPosition();
            this.f2296b.setDataPosition(i);
            this.f2296b.writeInt(dataPosition - i);
            this.f2296b.setDataPosition(dataPosition);
        }
    }

    /* renamed from: b */
    public boolean mo3258b(int i) {
        int d = m3112d(i);
        if (d == -1) {
            return false;
        }
        this.f2296b.setDataPosition(d);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0637a mo3260c() {
        return new C0638b(this.f2296b, this.f2296b.dataPosition(), this.f2301g == this.f2297c ? this.f2298d : this.f2301g, this.f2299e + "  ");
    }

    /* renamed from: c */
    public void mo3261c(int i) {
        mo3257b();
        this.f2300f = i;
        this.f2295a.put(i, this.f2296b.dataPosition());
        mo3241a(0);
        mo3241a(i);
    }

    /* renamed from: d */
    public int mo3262d() {
        return this.f2296b.readInt();
    }

    /* renamed from: e */
    public String mo3263e() {
        return this.f2296b.readString();
    }

    /* renamed from: f */
    public byte[] mo3264f() {
        int readInt = this.f2296b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2296b.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: g */
    public <T extends Parcelable> T mo3265g() {
        return this.f2296b.readParcelable(getClass().getClassLoader());
    }
}
