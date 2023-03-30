package android.support.p006v4.app;

import android.support.p006v4.app.C0106f;
import android.support.p006v4.app.C0123l;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.c */
final class C0100c extends C0144p implements C0123l.C0137h {

    /* renamed from: a */
    final C0123l f230a;

    /* renamed from: b */
    ArrayList<C0101a> f231b = new ArrayList<>();

    /* renamed from: c */
    int f232c;

    /* renamed from: d */
    int f233d;

    /* renamed from: e */
    int f234e;

    /* renamed from: f */
    int f235f;

    /* renamed from: g */
    int f236g;

    /* renamed from: h */
    int f237h;

    /* renamed from: i */
    boolean f238i;

    /* renamed from: j */
    boolean f239j = true;

    /* renamed from: k */
    String f240k;

    /* renamed from: l */
    boolean f241l;

    /* renamed from: m */
    int f242m = -1;

    /* renamed from: n */
    int f243n;

    /* renamed from: o */
    CharSequence f244o;

    /* renamed from: p */
    int f245p;

    /* renamed from: q */
    CharSequence f246q;

    /* renamed from: r */
    ArrayList<String> f247r;

    /* renamed from: s */
    ArrayList<String> f248s;

    /* renamed from: t */
    boolean f249t = false;

    /* renamed from: u */
    ArrayList<Runnable> f250u;

    /* renamed from: android.support.v4.app.c$a */
    static final class C0101a {

        /* renamed from: a */
        int f251a;

        /* renamed from: b */
        C0106f f252b;

        /* renamed from: c */
        int f253c;

        /* renamed from: d */
        int f254d;

        /* renamed from: e */
        int f255e;

        /* renamed from: f */
        int f256f;

        C0101a() {
        }

        C0101a(int i, C0106f fVar) {
            this.f251a = i;
            this.f252b = fVar;
        }
    }

    public C0100c(C0123l lVar) {
        this.f230a = lVar;
    }

    /* renamed from: b */
    private static boolean m332b(C0101a aVar) {
        C0106f fVar = aVar.f252b;
        return fVar != null && fVar.f306l && fVar.f282J != null && !fVar.f275C && !fVar.f274B && fVar.mo362X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0106f mo316a(ArrayList<C0106f> arrayList, C0106f fVar) {
        boolean z;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f231b.size()) {
                return fVar;
            }
            C0101a aVar = this.f231b.get(i2);
            switch (aVar.f251a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f252b);
                    break;
                case 2:
                    C0106f fVar2 = aVar.f252b;
                    int i3 = fVar2.f320z;
                    boolean z2 = false;
                    int size = arrayList.size() - 1;
                    int i4 = i2;
                    C0106f fVar3 = fVar;
                    while (size >= 0) {
                        C0106f fVar4 = arrayList.get(size);
                        if (fVar4.f320z != i3) {
                            z = z2;
                        } else if (fVar4 == fVar2) {
                            z = true;
                        } else {
                            if (fVar4 == fVar3) {
                                this.f231b.add(i4, new C0101a(9, fVar4));
                                i4++;
                                fVar3 = null;
                            }
                            C0101a aVar2 = new C0101a(3, fVar4);
                            aVar2.f253c = aVar.f253c;
                            aVar2.f255e = aVar.f255e;
                            aVar2.f254d = aVar.f254d;
                            aVar2.f256f = aVar.f256f;
                            this.f231b.add(i4, aVar2);
                            arrayList.remove(fVar4);
                            i4++;
                            z = z2;
                        }
                        size--;
                        z2 = z;
                    }
                    if (z2) {
                        this.f231b.remove(i4);
                        i4--;
                    } else {
                        aVar.f251a = 1;
                        arrayList.add(fVar2);
                    }
                    i2 = i4;
                    fVar = fVar3;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f252b);
                    if (aVar.f252b != fVar) {
                        break;
                    } else {
                        this.f231b.add(i2, new C0101a(9, aVar.f252b));
                        i2++;
                        fVar = null;
                        break;
                    }
                case 8:
                    this.f231b.add(i2, new C0101a(9, fVar));
                    i2++;
                    fVar = aVar.f252b;
                    break;
            }
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public void mo317a() {
        if (this.f250u != null) {
            int size = this.f250u.size();
            for (int i = 0; i < size; i++) {
                this.f250u.get(i).run();
            }
            this.f250u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo318a(int i) {
        if (this.f238i) {
            if (C0123l.f368a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f231b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0101a aVar = this.f231b.get(i2);
                if (aVar.f252b != null) {
                    aVar.f252b.f312r += i;
                    if (C0123l.f368a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f252b + " to " + aVar.f252b.f312r);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo319a(C0101a aVar) {
        this.f231b.add(aVar);
        aVar.f253c = this.f232c;
        aVar.f254d = this.f233d;
        aVar.f255e = this.f234e;
        aVar.f256f = this.f235f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo320a(C0106f.C0112c cVar) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f231b.size()) {
                C0101a aVar = this.f231b.get(i2);
                if (m332b(aVar)) {
                    aVar.f252b.mo379a(cVar);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo321a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo322a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo322a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f240k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f242m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f241l);
            if (this.f236g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f236g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f237h));
            }
            if (!(this.f232c == 0 && this.f233d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f232c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f233d));
            }
            if (!(this.f234e == 0 && this.f235f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f234e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f235f));
            }
            if (!(this.f243n == 0 && this.f244o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f243n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f244o);
            }
            if (!(this.f245p == 0 && this.f246q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f245p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f246q);
            }
        }
        if (!this.f231b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            str + "    ";
            int size = this.f231b.size();
            for (int i = 0; i < size; i++) {
                C0101a aVar = this.f231b.get(i);
                switch (aVar.f251a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f251a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f252b);
                if (z) {
                    if (!(aVar.f253c == 0 && aVar.f254d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f253c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f254d));
                    }
                    if (aVar.f255e != 0 || aVar.f256f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f255e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f256f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo323a(boolean z) {
        for (int size = this.f231b.size() - 1; size >= 0; size--) {
            C0101a aVar = this.f231b.get(size);
            C0106f fVar = aVar.f252b;
            if (fVar != null) {
                fVar.mo368a(C0123l.m569d(this.f236g), this.f237h);
            }
            switch (aVar.f251a) {
                case 1:
                    fVar.mo367a(aVar.f256f);
                    this.f230a.mo591h(fVar);
                    break;
                case 3:
                    fVar.mo367a(aVar.f255e);
                    this.f230a.mo556a(fVar, false);
                    break;
                case 4:
                    fVar.mo367a(aVar.f255e);
                    this.f230a.mo596j(fVar);
                    break;
                case 5:
                    fVar.mo367a(aVar.f256f);
                    this.f230a.mo594i(fVar);
                    break;
                case 6:
                    fVar.mo367a(aVar.f255e);
                    this.f230a.mo600l(fVar);
                    break;
                case 7:
                    fVar.mo367a(aVar.f256f);
                    this.f230a.mo598k(fVar);
                    break;
                case 8:
                    this.f230a.mo606o((C0106f) null);
                    break;
                case 9:
                    this.f230a.mo606o(fVar);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f251a);
            }
            if (!(this.f249t || aVar.f251a == 3 || fVar == null)) {
                this.f230a.mo582e(fVar);
            }
        }
        if (!this.f249t && z) {
            this.f230a.mo545a(this.f230a.f386l, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo324a(ArrayList<C0100c> arrayList, int i, int i2) {
        int i3;
        if (i2 == i) {
            return false;
        }
        int size = this.f231b.size();
        int i4 = -1;
        int i5 = 0;
        while (i5 < size) {
            C0101a aVar = this.f231b.get(i5);
            int i6 = aVar.f252b != null ? aVar.f252b.f320z : 0;
            if (i6 == 0 || i6 == i4) {
                i3 = i4;
            } else {
                for (int i7 = i; i7 < i2; i7++) {
                    C0100c cVar = arrayList.get(i7);
                    int size2 = cVar.f231b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        C0101a aVar2 = cVar.f231b.get(i8);
                        if ((aVar2.f252b != null ? aVar2.f252b.f320z : 0) == i6) {
                            return true;
                        }
                    }
                }
                i3 = i6;
            }
            i5++;
            i4 = i3;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo325a(ArrayList<C0100c> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0123l.f368a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f238i) {
            return true;
        }
        this.f230a.mo549a(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0106f mo326b(ArrayList<C0106f> arrayList, C0106f fVar) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f231b.size()) {
                return fVar;
            }
            C0101a aVar = this.f231b.get(i2);
            switch (aVar.f251a) {
                case 1:
                case 7:
                    arrayList.remove(aVar.f252b);
                    break;
                case 3:
                case 6:
                    arrayList.add(aVar.f252b);
                    break;
                case 8:
                    fVar = null;
                    break;
                case 9:
                    fVar = aVar.f252b;
                    break;
            }
            i = i2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo327b() {
        int size = this.f231b.size();
        for (int i = 0; i < size; i++) {
            C0101a aVar = this.f231b.get(i);
            C0106f fVar = aVar.f252b;
            if (fVar != null) {
                fVar.mo368a(this.f236g, this.f237h);
            }
            switch (aVar.f251a) {
                case 1:
                    fVar.mo367a(aVar.f253c);
                    this.f230a.mo556a(fVar, false);
                    break;
                case 3:
                    fVar.mo367a(aVar.f254d);
                    this.f230a.mo591h(fVar);
                    break;
                case 4:
                    fVar.mo367a(aVar.f254d);
                    this.f230a.mo594i(fVar);
                    break;
                case 5:
                    fVar.mo367a(aVar.f253c);
                    this.f230a.mo596j(fVar);
                    break;
                case 6:
                    fVar.mo367a(aVar.f254d);
                    this.f230a.mo598k(fVar);
                    break;
                case 7:
                    fVar.mo367a(aVar.f253c);
                    this.f230a.mo600l(fVar);
                    break;
                case 8:
                    this.f230a.mo606o(fVar);
                    break;
                case 9:
                    this.f230a.mo606o((C0106f) null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f251a);
            }
            if (!(this.f249t || aVar.f251a == 1 || fVar == null)) {
                this.f230a.mo582e(fVar);
            }
        }
        if (!this.f249t) {
            this.f230a.mo545a(this.f230a.f386l, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo328b(int i) {
        int size = this.f231b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0101a aVar = this.f231b.get(i2);
            int i3 = aVar.f252b != null ? aVar.f252b.f320z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo329c() {
        for (int i = 0; i < this.f231b.size(); i++) {
            if (m332b(this.f231b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public String mo330d() {
        return this.f240k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f242m >= 0) {
            sb.append(" #");
            sb.append(this.f242m);
        }
        if (this.f240k != null) {
            sb.append(" ");
            sb.append(this.f240k);
        }
        sb.append("}");
        return sb.toString();
    }
}
