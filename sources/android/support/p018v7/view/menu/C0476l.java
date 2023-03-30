package android.support.p018v7.view.menu;

import android.content.Context;
import android.support.p006v4.p009b.p010a.C0172b;
import android.support.p006v4.p015g.C0232c;
import android.support.p018v7.view.menu.C0471k;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.l */
class C0476l extends C0471k {

    /* renamed from: android.support.v7.view.menu.l$a */
    class C0477a extends C0471k.C0472a implements ActionProvider.VisibilityListener {

        /* renamed from: c */
        C0232c.C0234b f1623c;

        public C0477a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo1029a(MenuItem menuItem) {
            return this.f1618a.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo1031a(C0232c.C0234b bVar) {
            this.f1623c = bVar;
            ActionProvider actionProvider = this.f1618a;
            if (bVar == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        /* renamed from: b */
        public boolean mo1034b() {
            return this.f1618a.overridesItemVisibility();
        }

        /* renamed from: c */
        public boolean mo1035c() {
            return this.f1618a.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f1623c != null) {
                this.f1623c.mo1040a(z);
            }
        }
    }

    C0476l(Context context, C0172b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0471k.C0472a mo2213a(ActionProvider actionProvider) {
        return new C0477a(this.f1496a, actionProvider);
    }
}
