package android.support.p006v4.app;

import android.arch.lifecycle.C0021c;
import android.arch.lifecycle.C0040p;
import android.arch.lifecycle.C0041q;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p006v4.app.C0091a;
import android.support.p006v4.p014f.C0217l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.g */
public class C0113g extends C0096ad implements C0041q {

    /* renamed from: a */
    final Handler f343a = new Handler() {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 2:
                    C0113g.this.mo454c();
                    C0113g.this.f344b.mo517m();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    };

    /* renamed from: b */
    final C0118i f344b = C0118i.m488a((C0119j<?>) new C0115a());

    /* renamed from: c */
    boolean f345c;

    /* renamed from: d */
    boolean f346d;

    /* renamed from: e */
    boolean f347e = true;

    /* renamed from: f */
    boolean f348f;

    /* renamed from: g */
    boolean f349g;

    /* renamed from: h */
    int f350h;

    /* renamed from: i */
    C0217l<String> f351i;

    /* renamed from: j */
    private C0040p f352j;

    /* renamed from: android.support.v4.app.g$a */
    class C0115a extends C0119j<C0113g> {
        public C0115a() {
            super(C0113g.this);
        }

        /* renamed from: a */
        public View mo447a(int i) {
            return C0113g.this.findViewById(i);
        }

        /* renamed from: a */
        public void mo486a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0113g.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo448a() {
            Window window = C0113g.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: a */
        public boolean mo487a(C0106f fVar) {
            return !C0113g.this.isFinishing();
        }

        /* renamed from: b */
        public LayoutInflater mo488b() {
            return C0113g.this.getLayoutInflater().cloneInContext(C0113g.this);
        }

        /* renamed from: b */
        public void mo489b(C0106f fVar) {
            C0113g.this.mo452a(fVar);
        }

        /* renamed from: c */
        public void mo490c() {
            C0113g.this.mo457e();
        }

        /* renamed from: d */
        public boolean mo491d() {
            return C0113g.this.getWindow() != null;
        }

        /* renamed from: e */
        public int mo492e() {
            Window window = C0113g.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }
    }

    /* renamed from: android.support.v4.app.g$b */
    static final class C0116b {

        /* renamed from: a */
        Object f355a;

        /* renamed from: b */
        C0040p f356b;

        /* renamed from: c */
        C0139m f357c;

        C0116b() {
        }
    }

    /* renamed from: a */
    static void m464a(int i) {
        if ((-65536 & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: a */
    private static boolean m465a(C0120k kVar, C0021c.C0023b bVar) {
        boolean z = false;
        for (C0106f next : kVar.mo524b()) {
            if (next != null) {
                if (next.mo64a().mo60a().mo63a(C0021c.C0023b.STARTED)) {
                    next.f292T.mo66a(bVar);
                    z = true;
                }
                C0120k k = next.mo422k();
                z = k != null ? m465a(k, bVar) | z : z;
            }
        }
        return z;
    }

    /* renamed from: g */
    private void mo1590g() {
        do {
        } while (m465a(mo458f(), C0021c.C0023b.CREATED));
    }

    /* renamed from: a */
    public C0021c mo64a() {
        return super.mo64a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo451a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f344b.mo495a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void mo452a(C0106f fVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo453a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: b */
    public C0040p mo87b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f352j == null) {
            C0116b bVar = (C0116b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.f352j = bVar.f356b;
            }
            if (this.f352j == null) {
                this.f352j = new C0040p();
            }
        }
        return this.f352j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo454c() {
        this.f344b.mo512h();
    }

    /* renamed from: d */
    public Object mo455d() {
        return null;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f345c);
        printWriter.print(" mResumed=");
        printWriter.print(this.f346d);
        printWriter.print(" mStopped=");
        printWriter.print(this.f347e);
        if (getApplication() != null) {
            C0160t.m740a(this).mo281a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f344b.mo494a().mo522a(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    /* renamed from: e */
    public void mo457e() {
        invalidateOptionsMenu();
    }

    /* renamed from: f */
    public C0120k mo458f() {
        return this.f344b.mo494a();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f344b.mo503b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a = this.f351i.mo951a(i4);
            this.f351i.mo957c(i4);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0106f a2 = this.f344b.mo493a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
            } else {
                a2.mo369a(65535 & i, i2, intent);
            }
        } else {
            C0091a.C0092a a3 = C0091a.m307a();
            if (a3 == null || !a3.mo294a(this, i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
            }
        }
    }

    public void onBackPressed() {
        C0120k a = this.f344b.mo494a();
        boolean c = a.mo525c();
        if (c && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (c || !a.mo523a()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f344b.mo503b();
        this.f344b.mo496a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f344b.mo498a((C0106f) null);
        super.onCreate(bundle);
        C0116b bVar = (C0116b) getLastNonConfigurationInstance();
        if (!(bVar == null || bVar.f356b == null || this.f352j != null)) {
            this.f352j = bVar.f356b;
        }
        if (bundle != null) {
            this.f344b.mo497a(bundle.getParcelable("android:support:fragments"), bVar != null ? bVar.f357c : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f350h = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f351i = new C0217l<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f351i.mo955b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f351i == null) {
            this.f351i = new C0217l<>();
            this.f350h = 0;
        }
        this.f344b.mo509e();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f344b.mo501a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo451a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo451a((View) null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f352j != null && !isChangingConfigurations()) {
            this.f352j.mo85a();
        }
        this.f344b.mo515k();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f344b.mo516l();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.f344b.mo502a(menuItem);
            case 6:
                return this.f344b.mo506b(menuItem);
            default:
                return false;
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f344b.mo499a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f344b.mo503b();
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.f344b.mo504b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f346d = false;
        if (this.f343a.hasMessages(2)) {
            this.f343a.removeMessages(2);
            mo454c();
        }
        this.f344b.mo513i();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f344b.mo505b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f343a.removeMessages(2);
        mo454c();
        this.f344b.mo517m();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : mo453a(view, menu) | this.f344b.mo500a(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f344b.mo503b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a = this.f351i.mo951a(i3);
            this.f351i.mo957c(i3);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0106f a2 = this.f344b.mo493a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
            } else {
                a2.mo371a(i & 65535, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f343a.sendEmptyMessage(2);
        this.f346d = true;
        this.f344b.mo517m();
    }

    public final Object onRetainNonConfigurationInstance() {
        Object d = mo455d();
        C0139m d2 = this.f344b.mo508d();
        if (d2 == null && this.f352j == null && d == null) {
            return null;
        }
        C0116b bVar = new C0116b();
        bVar.f355a = d;
        bVar.f356b = this.f352j;
        bVar.f357c = d2;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo1590g();
        Parcelable c = this.f344b.mo507c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.f351i.mo953b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f350h);
            int[] iArr = new int[this.f351i.mo953b()];
            String[] strArr = new String[this.f351i.mo953b()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f351i.mo953b()) {
                    iArr[i2] = this.f351i.mo960d(i2);
                    strArr[i2] = this.f351i.mo961e(i2);
                    i = i2 + 1;
                } else {
                    bundle.putIntArray("android:support:request_indicies", iArr);
                    bundle.putStringArray("android:support:request_fragment_who", strArr);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f347e = false;
        if (!this.f345c) {
            this.f345c = true;
            this.f344b.mo510f();
        }
        this.f344b.mo503b();
        this.f344b.mo517m();
        this.f344b.mo511g();
    }

    public void onStateNotSaved() {
        this.f344b.mo503b();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f347e = true;
        mo1590g();
        this.f344b.mo514j();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f349g && i != -1) {
            m464a(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f349g && i != -1) {
            m464a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f348f && i != -1) {
            m464a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f348f && i != -1) {
            m464a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
