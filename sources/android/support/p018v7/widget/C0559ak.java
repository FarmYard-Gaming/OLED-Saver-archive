package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p018v7.view.menu.C0464g;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ak */
public class C0559ak extends C0550ai implements C0558aj {

    /* renamed from: a */
    private static Method f2017a;

    /* renamed from: b */
    private C0558aj f2018b;

    /* renamed from: android.support.v7.widget.ak$a */
    public static class C0560a extends C0540ae {

        /* renamed from: b */
        final int f2019b;

        /* renamed from: c */
        final int f2020c;

        /* renamed from: d */
        private C0558aj f2021d;

        /* renamed from: e */
        private MenuItem f2022e;

        public C0560a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f2019b = 22;
                this.f2020c = 21;
                return;
            }
            this.f2019b = 21;
            this.f2020c = 22;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo2761a(int i, int i2, int i3, int i4, int i5) {
            return super.mo2761a(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo2762a(MotionEvent motionEvent, int i) {
            return super.mo2762a(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
            r1 = (r3 = pointToPosition((int) r6.getX(), (int) r6.getY())) - r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onHoverEvent(android.view.MotionEvent r6) {
            /*
                r5 = this;
                android.support.v7.widget.aj r0 = r5.f2021d
                if (r0 == 0) goto L_0x0058
                android.widget.ListAdapter r0 = r5.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L_0x005d
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                android.support.v7.view.menu.g r0 = (android.support.p018v7.view.menu.C0464g) r0
            L_0x0018:
                r2 = 0
                int r3 = r6.getAction()
                r4 = 10
                if (r3 == r4) goto L_0x0061
                float r3 = r6.getX()
                int r3 = (int) r3
                float r4 = r6.getY()
                int r4 = (int) r4
                int r3 = r5.pointToPosition(r3, r4)
                r4 = -1
                if (r3 == r4) goto L_0x0061
                int r1 = r3 - r1
                if (r1 < 0) goto L_0x0061
                int r3 = r0.getCount()
                if (r1 >= r3) goto L_0x0061
                android.support.v7.view.menu.j r1 = r0.getItem((int) r1)
            L_0x0040:
                android.view.MenuItem r2 = r5.f2022e
                if (r2 == r1) goto L_0x0058
                android.support.v7.view.menu.h r0 = r0.mo2065a()
                if (r2 == 0) goto L_0x004f
                android.support.v7.widget.aj r3 = r5.f2021d
                r3.mo2051a(r0, r2)
            L_0x004f:
                r5.f2022e = r1
                if (r1 == 0) goto L_0x0058
                android.support.v7.widget.aj r2 = r5.f2021d
                r2.mo2052b(r0, r1)
            L_0x0058:
                boolean r0 = super.onHoverEvent(r6)
                return r0
            L_0x005d:
                r1 = 0
                android.support.v7.view.menu.g r0 = (android.support.p018v7.view.menu.C0464g) r0
                goto L_0x0018
            L_0x0061:
                r1 = r2
                goto L_0x0040
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.widget.C0559ak.C0560a.onHoverEvent(android.view.MotionEvent):boolean");
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2019b) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f2020c) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0464g) getAdapter()).mo2065a().mo2089a(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0558aj ajVar) {
            this.f2021d = ajVar;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f2017a = cls.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0559ak(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0540ae mo2825a(Context context, boolean z) {
        C0560a aVar = new C0560a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo2051a(C0465h hVar, MenuItem menuItem) {
        if (this.f2018b != null) {
            this.f2018b.mo2051a(hVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo2861a(C0558aj ajVar) {
        this.f2018b = ajVar;
    }

    /* renamed from: a */
    public void mo2862a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1991g.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo2052b(C0465h hVar, MenuItem menuItem) {
        if (this.f2018b != null) {
            this.f2018b.mo2052b(hVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo2863b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1991g.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo2864c(boolean z) {
        if (f2017a != null) {
            try {
                f2017a.invoke(this.f1991g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
