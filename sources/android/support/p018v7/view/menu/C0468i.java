package android.support.p018v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.p018v7.app.C0382b;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0481o;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: android.support.v7.view.menu.i */
class C0468i implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, C0481o.C0482a {

    /* renamed from: a */
    C0462f f1581a;

    /* renamed from: b */
    private C0465h f1582b;

    /* renamed from: c */
    private C0382b f1583c;

    /* renamed from: d */
    private C0481o.C0482a f1584d;

    public C0468i(C0465h hVar) {
        this.f1582b = hVar;
    }

    /* renamed from: a */
    public void mo2148a() {
        if (this.f1583c != null) {
            this.f1583c.dismiss();
        }
    }

    /* renamed from: a */
    public void mo2149a(IBinder iBinder) {
        C0465h hVar = this.f1582b;
        C0382b.C0383a aVar = new C0382b.C0383a(hVar.mo2120f());
        this.f1581a = new C0462f(aVar.mo1573a(), C0353a.C0360g.abc_list_menu_item_layout);
        this.f1581a.mo2018a((C0481o.C0482a) this);
        this.f1582b.mo2085a((C0481o) this.f1581a);
        aVar.mo1577a(this.f1581a.mo2056a(), this);
        View p = hVar.mo2134p();
        if (p != null) {
            aVar.mo1576a(p);
        } else {
            aVar.mo1575a(hVar.mo2133o()).mo1578a(hVar.mo2132n());
        }
        aVar.mo1574a((DialogInterface.OnKeyListener) this);
        this.f1583c = aVar.mo1579b();
        this.f1583c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1583c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1583c.show();
    }

    /* renamed from: a */
    public void mo1665a(C0465h hVar, boolean z) {
        if (z || hVar == this.f1582b) {
            mo2148a();
        }
        if (this.f1584d != null) {
            this.f1584d.mo1665a(hVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo1666a(C0465h hVar) {
        if (this.f1584d != null) {
            return this.f1584d.mo1666a(hVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1582b.mo2091a((MenuItem) (C0469j) this.f1581a.mo2056a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1581a.mo2016a(this.f1582b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1583c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1583c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1582b.mo2089a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1582b.performShortcut(i, keyEvent, 0);
    }
}
