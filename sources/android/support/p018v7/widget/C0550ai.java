package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.widget.C0347j;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0487s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ai */
public class C0550ai implements C0487s {

    /* renamed from: a */
    private static Method f1974a;

    /* renamed from: b */
    private static Method f1975b;

    /* renamed from: h */
    private static Method f1976h;

    /* renamed from: A */
    private Drawable f1977A;

    /* renamed from: B */
    private AdapterView.OnItemClickListener f1978B;

    /* renamed from: C */
    private AdapterView.OnItemSelectedListener f1979C;

    /* renamed from: D */
    private final C0556d f1980D;

    /* renamed from: E */
    private final C0555c f1981E;

    /* renamed from: F */
    private final C0553a f1982F;

    /* renamed from: G */
    private Runnable f1983G;

    /* renamed from: H */
    private final Rect f1984H;

    /* renamed from: I */
    private Rect f1985I;

    /* renamed from: J */
    private boolean f1986J;

    /* renamed from: c */
    C0540ae f1987c;

    /* renamed from: d */
    int f1988d;

    /* renamed from: e */
    final C0557e f1989e;

    /* renamed from: f */
    final Handler f1990f;

    /* renamed from: g */
    PopupWindow f1991g;

    /* renamed from: i */
    private Context f1992i;

    /* renamed from: j */
    private ListAdapter f1993j;

    /* renamed from: k */
    private int f1994k;

    /* renamed from: l */
    private int f1995l;

    /* renamed from: m */
    private int f1996m;

    /* renamed from: n */
    private int f1997n;

    /* renamed from: o */
    private int f1998o;

    /* renamed from: p */
    private boolean f1999p;

    /* renamed from: q */
    private boolean f2000q;

    /* renamed from: r */
    private boolean f2001r;

    /* renamed from: s */
    private boolean f2002s;

    /* renamed from: t */
    private int f2003t;

    /* renamed from: u */
    private boolean f2004u;

    /* renamed from: v */
    private boolean f2005v;

    /* renamed from: w */
    private View f2006w;

    /* renamed from: x */
    private int f2007x;

    /* renamed from: y */
    private DataSetObserver f2008y;

    /* renamed from: z */
    private View f2009z;

    /* renamed from: android.support.v7.widget.ai$a */
    private class C0553a implements Runnable {
        C0553a() {
        }

        public void run() {
            C0550ai.this.mo2849m();
        }
    }

    /* renamed from: android.support.v7.widget.ai$b */
    private class C0554b extends DataSetObserver {
        C0554b() {
        }

        public void onChanged() {
            if (C0550ai.this.mo2043d()) {
                C0550ai.this.mo2033a();
            }
        }

        public void onInvalidated() {
            C0550ai.this.mo2040c();
        }
    }

    /* renamed from: android.support.v7.widget.ai$c */
    private class C0555c implements AbsListView.OnScrollListener {
        C0555c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0550ai.this.mo2850n() && C0550ai.this.f1991g.getContentView() != null) {
                C0550ai.this.f1990f.removeCallbacks(C0550ai.this.f1989e);
                C0550ai.this.f1989e.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ai$d */
    private class C0556d implements View.OnTouchListener {
        C0556d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && C0550ai.this.f1991g != null && C0550ai.this.f1991g.isShowing() && x >= 0 && x < C0550ai.this.f1991g.getWidth() && y >= 0 && y < C0550ai.this.f1991g.getHeight()) {
                C0550ai.this.f1990f.postDelayed(C0550ai.this.f1989e, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0550ai.this.f1990f.removeCallbacks(C0550ai.this.f1989e);
                return false;
            }
        }
    }

    /* renamed from: android.support.v7.widget.ai$e */
    private class C0557e implements Runnable {
        C0557e() {
        }

        public void run() {
            if (C0550ai.this.f1987c != null && C0249q.m1071m(C0550ai.this.f1987c) && C0550ai.this.f1987c.getCount() > C0550ai.this.f1987c.getChildCount() && C0550ai.this.f1987c.getChildCount() <= C0550ai.this.f1988d) {
                C0550ai.this.f1991g.setInputMethodMode(2);
                C0550ai.this.mo2033a();
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f1974a = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        Class<PopupWindow> cls2 = PopupWindow.class;
        try {
            f1975b = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f1976h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0550ai(Context context) {
        this(context, (AttributeSet) null, C0353a.C0354a.listPopupWindowStyle);
    }

    public C0550ai(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0550ai(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1994k = -2;
        this.f1995l = -2;
        this.f1998o = 1002;
        this.f2000q = true;
        this.f2003t = 0;
        this.f2004u = false;
        this.f2005v = false;
        this.f1988d = Integer.MAX_VALUE;
        this.f2007x = 0;
        this.f1989e = new C0557e();
        this.f1980D = new C0556d();
        this.f1981E = new C0555c();
        this.f1982F = new C0553a();
        this.f1984H = new Rect();
        this.f1992i = context;
        this.f1990f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0353a.C0363j.ListPopupWindow, i, i2);
        this.f1996m = obtainStyledAttributes.getDimensionPixelOffset(C0353a.C0363j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1997n = obtainStyledAttributes.getDimensionPixelOffset(C0353a.C0363j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1997n != 0) {
            this.f1999p = true;
        }
        obtainStyledAttributes.recycle();
        this.f1991g = new C0620r(context, attributeSet, i, i2);
        this.f1991g.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m2723a(View view, int i, boolean z) {
        if (f1975b != null) {
            try {
                return ((Integer) f1975b.invoke(this.f1991g, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1991g.getMaxAvailableHeight(view, i);
    }

    /* renamed from: b */
    private void mo3186b() {
        if (this.f2006w != null) {
            ViewParent parent = this.f2006w.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2006w);
            }
        }
    }

    /* renamed from: c */
    private void mo2864c(boolean z) {
        if (f1974a != null) {
            try {
                f1974a.invoke(this.f1991g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: android.support.v7.widget.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: android.support.v7.widget.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: android.support.v7.widget.ae} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo3187f() {
        /*
            r10 = this;
            r9 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -1
            r1 = 1
            r2 = 0
            android.support.v7.widget.ae r0 = r10.f1987c
            if (r0 != 0) goto L_0x010b
            android.content.Context r7 = r10.f1992i
            android.support.v7.widget.ai$1 r0 = new android.support.v7.widget.ai$1
            r0.<init>()
            r10.f1983G = r0
            boolean r0 = r10.f1986J
            if (r0 != 0) goto L_0x00f7
            r0 = r1
        L_0x0019:
            android.support.v7.widget.ae r0 = r10.mo2825a(r7, r0)
            r10.f1987c = r0
            android.graphics.drawable.Drawable r0 = r10.f1977A
            if (r0 == 0) goto L_0x002a
            android.support.v7.widget.ae r0 = r10.f1987c
            android.graphics.drawable.Drawable r5 = r10.f1977A
            r0.setSelector(r5)
        L_0x002a:
            android.support.v7.widget.ae r0 = r10.f1987c
            android.widget.ListAdapter r5 = r10.f1993j
            r0.setAdapter(r5)
            android.support.v7.widget.ae r0 = r10.f1987c
            android.widget.AdapterView$OnItemClickListener r5 = r10.f1978B
            r0.setOnItemClickListener(r5)
            android.support.v7.widget.ae r0 = r10.f1987c
            r0.setFocusable(r1)
            android.support.v7.widget.ae r0 = r10.f1987c
            r0.setFocusableInTouchMode(r1)
            android.support.v7.widget.ae r0 = r10.f1987c
            android.support.v7.widget.ai$2 r5 = new android.support.v7.widget.ai$2
            r5.<init>()
            r0.setOnItemSelectedListener(r5)
            android.support.v7.widget.ae r0 = r10.f1987c
            android.support.v7.widget.ai$c r5 = r10.f1981E
            r0.setOnScrollListener(r5)
            android.widget.AdapterView$OnItemSelectedListener r0 = r10.f1979C
            if (r0 == 0) goto L_0x005e
            android.support.v7.widget.ae r0 = r10.f1987c
            android.widget.AdapterView$OnItemSelectedListener r5 = r10.f1979C
            r0.setOnItemSelectedListener(r5)
        L_0x005e:
            android.support.v7.widget.ae r5 = r10.f1987c
            android.view.View r8 = r10.f2006w
            if (r8 == 0) goto L_0x0195
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r7)
            r6.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r7 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r3, r2, r7)
            int r7 = r10.f2007x
            switch(r7) {
                case 0: goto L_0x0101;
                case 1: goto L_0x00fa;
                default: goto L_0x0078;
            }
        L_0x0078:
            java.lang.String r0 = "ListPopupWindow"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Invalid hint position "
            java.lang.StringBuilder r5 = r5.append(r7)
            int r7 = r10.f2007x
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
        L_0x0092:
            int r0 = r10.f1995l
            if (r0 < 0) goto L_0x0108
            int r5 = r10.f1995l
            r0 = r4
        L_0x0099:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            r8.measure(r0, r2)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r8.getMeasuredHeight()
            int r7 = r0.topMargin
            int r5 = r5 + r7
            int r0 = r0.bottomMargin
            int r0 = r0 + r5
            r5 = r6
        L_0x00b1:
            android.widget.PopupWindow r6 = r10.f1991g
            r6.setContentView(r5)
            r6 = r0
        L_0x00b7:
            android.widget.PopupWindow r0 = r10.f1991g
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x0129
            android.graphics.Rect r5 = r10.f1984H
            r0.getPadding(r5)
            android.graphics.Rect r0 = r10.f1984H
            int r0 = r0.top
            android.graphics.Rect r5 = r10.f1984H
            int r5 = r5.bottom
            int r0 = r0 + r5
            boolean r5 = r10.f1999p
            if (r5 != 0) goto L_0x018f
            android.graphics.Rect r5 = r10.f1984H
            int r5 = r5.top
            int r5 = -r5
            r10.f1997n = r5
            r7 = r0
        L_0x00d9:
            android.widget.PopupWindow r0 = r10.f1991g
            int r0 = r0.getInputMethodMode()
            r5 = 2
            if (r0 != r5) goto L_0x0130
        L_0x00e2:
            android.view.View r0 = r10.mo2844i()
            int r5 = r10.f1997n
            int r5 = r10.m2723a(r0, r5, r1)
            boolean r0 = r10.f2004u
            if (r0 != 0) goto L_0x00f4
            int r0 = r10.f1994k
            if (r0 != r3) goto L_0x0132
        L_0x00f4:
            int r0 = r5 + r7
        L_0x00f6:
            return r0
        L_0x00f7:
            r0 = r2
            goto L_0x0019
        L_0x00fa:
            r6.addView(r5, r0)
            r6.addView(r8)
            goto L_0x0092
        L_0x0101:
            r6.addView(r8)
            r6.addView(r5, r0)
            goto L_0x0092
        L_0x0108:
            r0 = r2
            r5 = r2
            goto L_0x0099
        L_0x010b:
            android.widget.PopupWindow r0 = r10.f1991g
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r5 = r10.f2006w
            if (r5 == 0) goto L_0x0192
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r5.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r0 = r0 + r5
            r6 = r0
            goto L_0x00b7
        L_0x0129:
            android.graphics.Rect r0 = r10.f1984H
            r0.setEmpty()
            r7 = r2
            goto L_0x00d9
        L_0x0130:
            r1 = r2
            goto L_0x00e2
        L_0x0132:
            int r0 = r10.f1995l
            switch(r0) {
                case -2: goto L_0x0159;
                case -1: goto L_0x0174;
                default: goto L_0x0137;
            }
        L_0x0137:
            int r0 = r10.f1995l
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
        L_0x013d:
            android.support.v7.widget.ae r0 = r10.f1987c
            int r4 = r5 - r6
            r5 = r3
            int r0 = r0.mo2761a(r1, r2, r3, r4, r5)
            if (r0 <= 0) goto L_0x0157
            android.support.v7.widget.ae r1 = r10.f1987c
            int r1 = r1.getPaddingTop()
            android.support.v7.widget.ae r2 = r10.f1987c
            int r2 = r2.getPaddingBottom()
            int r1 = r1 + r2
            int r1 = r1 + r7
            int r6 = r6 + r1
        L_0x0157:
            int r0 = r0 + r6
            goto L_0x00f6
        L_0x0159:
            android.content.Context r0 = r10.f1992i
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.graphics.Rect r1 = r10.f1984H
            int r1 = r1.left
            android.graphics.Rect r8 = r10.f1984H
            int r8 = r8.right
            int r1 = r1 + r8
            int r0 = r0 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L_0x013d
        L_0x0174:
            android.content.Context r0 = r10.f1992i
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.graphics.Rect r1 = r10.f1984H
            int r1 = r1.left
            android.graphics.Rect r4 = r10.f1984H
            int r4 = r4.right
            int r1 = r1 + r4
            int r0 = r0 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            goto L_0x013d
        L_0x018f:
            r7 = r0
            goto L_0x00d9
        L_0x0192:
            r6 = r2
            goto L_0x00b7
        L_0x0195:
            r0 = r2
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.widget.C0550ai.mo3187f():int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0540ae mo2825a(Context context, boolean z) {
        return new C0540ae(context, z);
    }

    /* renamed from: a */
    public void mo2033a() {
        int i;
        boolean z = true;
        boolean z2 = false;
        int i2 = -1;
        int f = mo3187f();
        boolean n = mo2850n();
        C0347j.m1606a(this.f1991g, this.f1998o);
        if (!this.f1991g.isShowing()) {
            int width = this.f1995l == -1 ? -1 : this.f1995l == -2 ? mo2844i().getWidth() : this.f1995l;
            if (this.f1994k == -1) {
                f = -1;
            } else if (this.f1994k != -2) {
                f = this.f1994k;
            }
            this.f1991g.setWidth(width);
            this.f1991g.setHeight(f);
            mo2864c(true);
            PopupWindow popupWindow = this.f1991g;
            if (this.f2005v || this.f2004u) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1991g.setTouchInterceptor(this.f1980D);
            if (this.f2002s) {
                C0347j.m1608a(this.f1991g, this.f2001r);
            }
            if (f1976h != null) {
                try {
                    f1976h.invoke(this.f1991g, new Object[]{this.f1985I});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0347j.m1607a(this.f1991g, mo2844i(), this.f1996m, this.f1997n, this.f2003t);
            this.f1987c.setSelection(-1);
            if (!this.f1986J || this.f1987c.isInTouchMode()) {
                mo2849m();
            }
            if (!this.f1986J) {
                this.f1990f.post(this.f1982F);
            }
        } else if (C0249q.m1071m(mo2844i())) {
            int width2 = this.f1995l == -1 ? -1 : this.f1995l == -2 ? mo2844i().getWidth() : this.f1995l;
            if (this.f1994k == -1) {
                if (!n) {
                    f = -1;
                }
                if (n) {
                    this.f1991g.setWidth(this.f1995l == -1 ? -1 : 0);
                    this.f1991g.setHeight(0);
                    i = f;
                } else {
                    this.f1991g.setWidth(this.f1995l == -1 ? -1 : 0);
                    this.f1991g.setHeight(-1);
                    i = f;
                }
            } else {
                i = this.f1994k == -2 ? f : this.f1994k;
            }
            PopupWindow popupWindow2 = this.f1991g;
            if (!this.f2005v && !this.f2004u) {
                z2 = true;
            }
            popupWindow2.setOutsideTouchable(z2);
            PopupWindow popupWindow3 = this.f1991g;
            View i3 = mo2844i();
            int i4 = this.f1996m;
            int i5 = this.f1997n;
            if (width2 < 0) {
                width2 = -1;
            }
            if (i >= 0) {
                i2 = i;
            }
            popupWindow3.update(i3, i4, i5, width2, i2);
        }
    }

    /* renamed from: a */
    public void mo2826a(int i) {
        this.f2007x = i;
    }

    /* renamed from: a */
    public void mo2827a(Rect rect) {
        this.f1985I = rect;
    }

    /* renamed from: a */
    public void mo2828a(Drawable drawable) {
        this.f1991g.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo2829a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1978B = onItemClickListener;
    }

    /* renamed from: a */
    public void mo2830a(ListAdapter listAdapter) {
        if (this.f2008y == null) {
            this.f2008y = new C0554b();
        } else if (this.f1993j != null) {
            this.f1993j.unregisterDataSetObserver(this.f2008y);
        }
        this.f1993j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2008y);
        }
        if (this.f1987c != null) {
            this.f1987c.setAdapter(this.f1993j);
        }
    }

    /* renamed from: a */
    public void mo2831a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1991g.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void mo2832a(boolean z) {
        this.f1986J = z;
        this.f1991g.setFocusable(z);
    }

    /* renamed from: b */
    public void mo2833b(int i) {
        this.f1991g.setAnimationStyle(i);
    }

    /* renamed from: b */
    public void mo2834b(View view) {
        this.f2009z = view;
    }

    /* renamed from: b */
    public void mo2835b(boolean z) {
        this.f2002s = true;
        this.f2001r = z;
    }

    /* renamed from: c */
    public void mo2040c() {
        this.f1991g.dismiss();
        mo3186b();
        this.f1991g.setContentView((View) null);
        this.f1987c = null;
        this.f1990f.removeCallbacks(this.f1989e);
    }

    /* renamed from: c */
    public void mo2836c(int i) {
        this.f1996m = i;
    }

    /* renamed from: d */
    public void mo2837d(int i) {
        this.f1997n = i;
        this.f1999p = true;
    }

    /* renamed from: d */
    public boolean mo2043d() {
        return this.f1991g.isShowing();
    }

    /* renamed from: e */
    public ListView mo2044e() {
        return this.f1987c;
    }

    /* renamed from: e */
    public void mo2838e(int i) {
        this.f2003t = i;
    }

    /* renamed from: f */
    public void mo2839f(int i) {
        this.f1995l = i;
    }

    /* renamed from: g */
    public void mo2840g(int i) {
        Drawable background = this.f1991g.getBackground();
        if (background != null) {
            background.getPadding(this.f1984H);
            this.f1995l = this.f1984H.left + this.f1984H.right + i;
            return;
        }
        mo2839f(i);
    }

    /* renamed from: g */
    public boolean mo2841g() {
        return this.f1986J;
    }

    /* renamed from: h */
    public Drawable mo2842h() {
        return this.f1991g.getBackground();
    }

    /* renamed from: h */
    public void mo2843h(int i) {
        this.f1991g.setInputMethodMode(i);
    }

    /* renamed from: i */
    public View mo2844i() {
        return this.f2009z;
    }

    /* renamed from: i */
    public void mo2845i(int i) {
        C0540ae aeVar = this.f1987c;
        if (mo2043d() && aeVar != null) {
            aeVar.setListSelectionHidden(false);
            aeVar.setSelection(i);
            if (aeVar.getChoiceMode() != 0) {
                aeVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: j */
    public int mo2846j() {
        return this.f1996m;
    }

    /* renamed from: k */
    public int mo2847k() {
        if (!this.f1999p) {
            return 0;
        }
        return this.f1997n;
    }

    /* renamed from: l */
    public int mo2848l() {
        return this.f1995l;
    }

    /* renamed from: m */
    public void mo2849m() {
        C0540ae aeVar = this.f1987c;
        if (aeVar != null) {
            aeVar.setListSelectionHidden(true);
            aeVar.requestLayout();
        }
    }

    /* renamed from: n */
    public boolean mo2850n() {
        return this.f1991g.getInputMethodMode() == 2;
    }
}
