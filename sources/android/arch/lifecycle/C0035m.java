package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0021c;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.m */
public class C0035m extends Fragment {

    /* renamed from: a */
    private C0036a f72a;

    /* renamed from: android.arch.lifecycle.m$a */
    interface C0036a {
        /* renamed from: a */
        void mo77a();

        /* renamed from: b */
        void mo78b();

        /* renamed from: c */
        void mo79c();
    }

    /* renamed from: a */
    public static void m116a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0035m(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m117a(C0021c.C0022a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0029g) {
            ((C0029g) activity).mo68b().mo65a(aVar);
        } else if (activity instanceof C0025e) {
            C0021c a = ((C0025e) activity).mo64a();
            if (a instanceof C0026f) {
                ((C0026f) a).mo65a(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m118a(C0036a aVar) {
        if (aVar != null) {
            aVar.mo77a();
        }
    }

    /* renamed from: b */
    private void m119b(C0036a aVar) {
        if (aVar != null) {
            aVar.mo78b();
        }
    }

    /* renamed from: c */
    private void m120c(C0036a aVar) {
        if (aVar != null) {
            aVar.mo79c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m118a(this.f72a);
        m117a(C0021c.C0022a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m117a(C0021c.C0022a.ON_DESTROY);
        this.f72a = null;
    }

    public void onPause() {
        super.onPause();
        m117a(C0021c.C0022a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m120c(this.f72a);
        m117a(C0021c.C0022a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m119b(this.f72a);
        m117a(C0021c.C0022a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m117a(C0021c.C0022a.ON_STOP);
    }
}
