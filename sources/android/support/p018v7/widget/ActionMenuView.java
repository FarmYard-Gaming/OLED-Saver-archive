package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p018v7.view.menu.ActionMenuItemView;
import android.support.p018v7.view.menu.C0465h;
import android.support.p018v7.view.menu.C0469j;
import android.support.p018v7.view.menu.C0481o;
import android.support.p018v7.view.menu.C0483p;
import android.support.p018v7.widget.C0548ah;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends C0548ah implements C0465h.C0467b, C0483p {

    /* renamed from: a */
    C0465h.C0466a f1718a;

    /* renamed from: b */
    C0503e f1719b;

    /* renamed from: c */
    private C0465h f1720c;

    /* renamed from: d */
    private Context f1721d;

    /* renamed from: e */
    private int f1722e;

    /* renamed from: f */
    private boolean f1723f;

    /* renamed from: g */
    private C0588c f1724g;

    /* renamed from: h */
    private C0481o.C0482a f1725h;

    /* renamed from: i */
    private boolean f1726i;

    /* renamed from: j */
    private int f1727j;

    /* renamed from: k */
    private int f1728k;

    /* renamed from: l */
    private int f1729l;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C0499a {
        /* renamed from: c */
        boolean mo1939c();

        /* renamed from: d */
        boolean mo1940d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C0500b implements C0481o.C0482a {
        C0500b() {
        }

        /* renamed from: a */
        public void mo1665a(C0465h hVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo1666a(C0465h hVar) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C0501c extends C0548ah.C0549a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1730a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1731b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1732c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1733d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1734e;

        /* renamed from: f */
        boolean f1735f;

        public C0501c(int i, int i2) {
            super(i, i2);
            this.f1730a = false;
        }

        public C0501c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0501c(C0501c cVar) {
            super(cVar);
            this.f1730a = cVar.f1730a;
        }

        public C0501c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    private class C0502d implements C0465h.C0466a {
        C0502d() {
        }

        /* renamed from: a */
        public void mo1633a(C0465h hVar) {
            if (ActionMenuView.this.f1718a != null) {
                ActionMenuView.this.f1718a.mo1633a(hVar);
            }
        }

        /* renamed from: a */
        public boolean mo1636a(C0465h hVar, MenuItem menuItem) {
            return ActionMenuView.this.f1719b != null && ActionMenuView.this.f1719b.mo2463a(menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface C0503e {
        /* renamed from: a */
        boolean mo2463a(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1728k = (int) (56.0f * f);
        this.f1729l = (int) (f * 4.0f);
        this.f1721d = context;
        this.f1722e = 0;
    }

    /* renamed from: a */
    static int m2437a(View view, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        C0501c cVar = (C0501c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo1938b();
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z2 && i5 < 2) {
                i5 = 2;
            }
        }
        if (!cVar.f1730a && z2) {
            z = true;
        }
        cVar.f1733d = z;
        cVar.f1731b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2438c(int r33, int r34) {
        /*
            r32 = this;
            int r23 = android.view.View.MeasureSpec.getMode(r34)
            int r6 = android.view.View.MeasureSpec.getSize(r33)
            int r20 = android.view.View.MeasureSpec.getSize(r34)
            int r7 = r32.getPaddingLeft()
            int r8 = r32.getPaddingRight()
            int r7 = r7 + r8
            int r8 = r32.getPaddingTop()
            int r9 = r32.getPaddingBottom()
            int r19 = r8 + r9
            r8 = -2
            r0 = r34
            r1 = r19
            int r24 = getChildMeasureSpec(r0, r1, r8)
            int r25 = r6 - r7
            r0 = r32
            int r6 = r0.f1728k
            int r9 = r25 / r6
            r0 = r32
            int r6 = r0.f1728k
            int r6 = r25 % r6
            if (r9 != 0) goto L_0x0041
            r6 = 0
            r0 = r32
            r1 = r25
            r0.setMeasuredDimension(r1, r6)
        L_0x0040:
            return
        L_0x0041:
            r0 = r32
            int r7 = r0.f1728k
            int r6 = r6 / r9
            int r26 = r7 + r6
            r16 = 0
            r15 = 0
            r10 = 0
            r7 = 0
            r11 = 0
            r12 = 0
            int r27 = r32.getChildCount()
            r6 = 0
            r18 = r6
        L_0x0057:
            r0 = r18
            r1 = r27
            if (r0 >= r1) goto L_0x00fc
            r0 = r32
            r1 = r18
            android.view.View r8 = r0.getChildAt(r1)
            int r6 = r8.getVisibility()
            r14 = 8
            if (r6 != r14) goto L_0x007a
            r6 = r11
            r14 = r7
            r17 = r9
        L_0x0071:
            int r8 = r18 + 1
            r18 = r8
            r11 = r6
            r7 = r14
            r9 = r17
            goto L_0x0057
        L_0x007a:
            boolean r0 = r8 instanceof android.support.p018v7.view.menu.ActionMenuItemView
            r17 = r0
            int r14 = r7 + 1
            if (r17 == 0) goto L_0x0096
            r0 = r32
            int r6 = r0.f1729l
            r7 = 0
            r0 = r32
            int r0 = r0.f1729l
            r21 = r0
            r22 = 0
            r0 = r21
            r1 = r22
            r8.setPadding(r6, r7, r0, r1)
        L_0x0096:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p018v7.widget.ActionMenuView.C0501c) r6
            r7 = 0
            r6.f1735f = r7
            r7 = 0
            r6.f1732c = r7
            r7 = 0
            r6.f1731b = r7
            r7 = 0
            r6.f1733d = r7
            r7 = 0
            r6.leftMargin = r7
            r7 = 0
            r6.rightMargin = r7
            if (r17 == 0) goto L_0x00f8
            r7 = r8
            android.support.v7.view.menu.ActionMenuItemView r7 = (android.support.p018v7.view.menu.ActionMenuItemView) r7
            boolean r7 = r7.mo1938b()
            if (r7 == 0) goto L_0x00f8
            r7 = 1
        L_0x00ba:
            r6.f1734e = r7
            boolean r7 = r6.f1730a
            if (r7 == 0) goto L_0x00fa
            r7 = 1
        L_0x00c1:
            r0 = r26
            r1 = r24
            r2 = r19
            int r21 = m2437a(r8, r0, r7, r1, r2)
            r0 = r21
            int r15 = java.lang.Math.max(r15, r0)
            boolean r7 = r6.f1733d
            if (r7 == 0) goto L_0x0305
            int r7 = r10 + 1
        L_0x00d7:
            boolean r6 = r6.f1730a
            if (r6 == 0) goto L_0x0302
            r6 = 1
        L_0x00dc:
            int r17 = r9 - r21
            int r8 = r8.getMeasuredHeight()
            r0 = r16
            int r11 = java.lang.Math.max(r0, r8)
            r8 = 1
            r0 = r21
            if (r0 != r8) goto L_0x02fd
            r8 = 1
            int r8 = r8 << r18
            long r8 = (long) r8
            long r8 = r8 | r12
            r12 = r8
            r10 = r7
            r16 = r11
            goto L_0x0071
        L_0x00f8:
            r7 = 0
            goto L_0x00ba
        L_0x00fa:
            r7 = r9
            goto L_0x00c1
        L_0x00fc:
            if (r11 == 0) goto L_0x0135
            r6 = 2
            if (r7 != r6) goto L_0x0135
            r6 = 1
            r8 = r6
        L_0x0103:
            r17 = 0
            r18 = r12
            r21 = r9
        L_0x0109:
            if (r10 <= 0) goto L_0x02f9
            if (r21 <= 0) goto L_0x02f9
            r14 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
            r9 = 0
            r6 = 0
            r22 = r6
        L_0x0116:
            r0 = r22
            r1 = r27
            if (r0 >= r1) goto L_0x0156
            r0 = r32
            r1 = r22
            android.view.View r6 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p018v7.widget.ActionMenuView.C0501c) r6
            boolean r0 = r6.f1733d
            r28 = r0
            if (r28 != 0) goto L_0x0138
            r6 = r9
        L_0x0131:
            int r22 = r22 + 1
            r9 = r6
            goto L_0x0116
        L_0x0135:
            r6 = 0
            r8 = r6
            goto L_0x0103
        L_0x0138:
            int r0 = r6.f1731b
            r28 = r0
            r0 = r28
            if (r0 >= r14) goto L_0x0149
            int r9 = r6.f1731b
            r12 = 1
            long r12 = r12 << r22
            r6 = 1
            r14 = r9
            goto L_0x0131
        L_0x0149:
            int r6 = r6.f1731b
            if (r6 != r14) goto L_0x02f6
            r28 = 1
            long r28 = r28 << r22
            long r12 = r12 | r28
            int r6 = r9 + 1
            goto L_0x0131
        L_0x0156:
            long r18 = r18 | r12
            r0 = r21
            if (r9 <= r0) goto L_0x01e0
            r12 = r18
        L_0x015e:
            if (r11 != 0) goto L_0x025f
            r6 = 1
            if (r7 != r6) goto L_0x025f
            r6 = 1
        L_0x0164:
            if (r21 <= 0) goto L_0x02ab
            r8 = 0
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x02ab
            int r7 = r7 + -1
            r0 = r21
            if (r0 < r7) goto L_0x0177
            if (r6 != 0) goto L_0x0177
            r7 = 1
            if (r15 <= r7) goto L_0x02ab
        L_0x0177:
            int r7 = java.lang.Long.bitCount(r12)
            float r7 = (float) r7
            if (r6 != 0) goto L_0x02f0
            r8 = 1
            long r8 = r8 & r12
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x019b
            r6 = 0
            r0 = r32
            android.view.View r6 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p018v7.widget.ActionMenuView.C0501c) r6
            boolean r6 = r6.f1734e
            if (r6 != 0) goto L_0x019b
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 - r6
        L_0x019b:
            r6 = 1
            int r8 = r27 + -1
            int r6 = r6 << r8
            long r8 = (long) r6
            long r8 = r8 & r12
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02f0
            int r6 = r27 + -1
            r0 = r32
            android.view.View r6 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p018v7.widget.ActionMenuView.C0501c) r6
            boolean r6 = r6.f1734e
            if (r6 != 0) goto L_0x02f0
            r6 = 1056964608(0x3f000000, float:0.5)
            float r6 = r7 - r6
        L_0x01bd:
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0262
            int r7 = r21 * r26
            float r7 = (float) r7
            float r6 = r7 / r6
            int r6 = (int) r6
            r7 = r6
        L_0x01c9:
            r6 = 0
            r9 = r6
            r8 = r17
        L_0x01cd:
            r0 = r27
            if (r9 >= r0) goto L_0x02ad
            r6 = 1
            int r6 = r6 << r9
            long r10 = (long) r6
            long r10 = r10 & r12
            r14 = 0
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0266
            r6 = r8
        L_0x01dc:
            int r9 = r9 + 1
            r8 = r6
            goto L_0x01cd
        L_0x01e0:
            int r17 = r14 + 1
            r6 = 0
            r14 = r6
            r9 = r21
        L_0x01e6:
            r0 = r27
            if (r14 >= r0) goto L_0x0259
            r0 = r32
            android.view.View r21 = r0.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r6 = r21.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p018v7.widget.ActionMenuView.C0501c) r6
            r22 = 1
            int r22 = r22 << r14
            r0 = r22
            long r0 = (long) r0
            r28 = r0
            long r28 = r28 & r12
            r30 = 0
            int r22 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1))
            if (r22 != 0) goto L_0x0219
            int r6 = r6.f1731b
            r0 = r17
            if (r6 != r0) goto L_0x02f3
            r6 = 1
            int r6 = r6 << r14
            long r0 = (long) r6
            r28 = r0
            long r18 = r18 | r28
            r6 = r9
        L_0x0215:
            int r14 = r14 + 1
            r9 = r6
            goto L_0x01e6
        L_0x0219:
            if (r8 == 0) goto L_0x0246
            boolean r0 = r6.f1734e
            r22 = r0
            if (r22 == 0) goto L_0x0246
            r22 = 1
            r0 = r22
            if (r9 != r0) goto L_0x0246
            r0 = r32
            int r0 = r0.f1729l
            r22 = r0
            int r22 = r22 + r26
            r28 = 0
            r0 = r32
            int r0 = r0.f1729l
            r29 = r0
            r30 = 0
            r0 = r21
            r1 = r22
            r2 = r28
            r3 = r29
            r4 = r30
            r0.setPadding(r1, r2, r3, r4)
        L_0x0246:
            int r0 = r6.f1731b
            r21 = r0
            int r21 = r21 + 1
            r0 = r21
            r6.f1731b = r0
            r21 = 1
            r0 = r21
            r6.f1735f = r0
            int r6 = r9 + -1
            goto L_0x0215
        L_0x0259:
            r17 = 1
            r21 = r9
            goto L_0x0109
        L_0x025f:
            r6 = 0
            goto L_0x0164
        L_0x0262:
            r6 = 0
            r7 = r6
            goto L_0x01c9
        L_0x0266:
            r0 = r32
            android.view.View r10 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r6 = r10.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p018v7.widget.ActionMenuView.C0501c) r6
            boolean r10 = r10 instanceof android.support.p018v7.view.menu.ActionMenuItemView
            if (r10 == 0) goto L_0x0289
            r6.f1732c = r7
            r8 = 1
            r6.f1735f = r8
            if (r9 != 0) goto L_0x0286
            boolean r8 = r6.f1734e
            if (r8 != 0) goto L_0x0286
            int r8 = -r7
            int r8 = r8 / 2
            r6.leftMargin = r8
        L_0x0286:
            r6 = 1
            goto L_0x01dc
        L_0x0289:
            boolean r10 = r6.f1730a
            if (r10 == 0) goto L_0x029a
            r6.f1732c = r7
            r8 = 1
            r6.f1735f = r8
            int r8 = -r7
            int r8 = r8 / 2
            r6.rightMargin = r8
            r6 = 1
            goto L_0x01dc
        L_0x029a:
            if (r9 == 0) goto L_0x02a0
            int r10 = r7 / 2
            r6.leftMargin = r10
        L_0x02a0:
            int r10 = r27 + -1
            if (r9 == r10) goto L_0x02a8
            int r10 = r7 / 2
            r6.rightMargin = r10
        L_0x02a8:
            r6 = r8
            goto L_0x01dc
        L_0x02ab:
            r8 = r17
        L_0x02ad:
            if (r8 == 0) goto L_0x02dc
            r6 = 0
            r7 = r6
        L_0x02b1:
            r0 = r27
            if (r7 >= r0) goto L_0x02dc
            r0 = r32
            android.view.View r8 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p018v7.widget.ActionMenuView.C0501c) r6
            boolean r9 = r6.f1735f
            if (r9 != 0) goto L_0x02c9
        L_0x02c5:
            int r6 = r7 + 1
            r7 = r6
            goto L_0x02b1
        L_0x02c9:
            int r9 = r6.f1731b
            int r9 = r9 * r26
            int r6 = r6.f1732c
            int r6 = r6 + r9
            r9 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r0 = r24
            r8.measure(r6, r0)
            goto L_0x02c5
        L_0x02dc:
            r6 = 1073741824(0x40000000, float:2.0)
            r0 = r23
            if (r0 == r6) goto L_0x02ed
        L_0x02e2:
            r0 = r32
            r1 = r25
            r2 = r16
            r0.setMeasuredDimension(r1, r2)
            goto L_0x0040
        L_0x02ed:
            r16 = r20
            goto L_0x02e2
        L_0x02f0:
            r6 = r7
            goto L_0x01bd
        L_0x02f3:
            r6 = r9
            goto L_0x0215
        L_0x02f6:
            r6 = r9
            goto L_0x0131
        L_0x02f9:
            r12 = r18
            goto L_0x015e
        L_0x02fd:
            r10 = r7
            r16 = r11
            goto L_0x0071
        L_0x0302:
            r6 = r11
            goto L_0x00dc
        L_0x0305:
            r7 = r10
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.widget.ActionMenuView.m2438c(int, int):void");
    }

    /* renamed from: a */
    public C0501c generateLayoutParams(AttributeSet attributeSet) {
        return new C0501c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0501c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo2452j();
        }
        C0501c cVar = layoutParams instanceof C0501c ? new C0501c((C0501c) layoutParams) : new C0501c(layoutParams);
        if (cVar.f1973h > 0) {
            return cVar;
        }
        cVar.f1973h = 16;
        return cVar;
    }

    /* renamed from: a */
    public void mo1958a(C0465h hVar) {
        this.f1720c = hVar;
    }

    /* renamed from: a */
    public void mo2430a(C0481o.C0482a aVar, C0465h.C0466a aVar2) {
        this.f1725h = aVar;
        this.f1718a = aVar2;
    }

    /* renamed from: a */
    public boolean mo2431a() {
        return this.f1723f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2432a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0499a)) {
            z = false | ((C0499a) childAt).mo1940d();
        }
        return (i <= 0 || !(childAt2 instanceof C0499a)) ? z : ((C0499a) childAt2).mo1939c() | z;
    }

    /* renamed from: a */
    public boolean mo1959a(C0469j jVar) {
        return this.f1720c.mo2091a((MenuItem) jVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0501c mo2452j() {
        C0501c cVar = new C0501c(-2, -2);
        cVar.f1973h = 16;
        return cVar;
    }

    /* renamed from: c */
    public C0501c mo2436c() {
        C0501c b = mo2452j();
        b.f1730a = true;
        return b;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0501c);
    }

    /* renamed from: d */
    public C0465h mo2438d() {
        return this.f1720c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean mo2440e() {
        return this.f1724g != null && this.f1724g.mo3007d();
    }

    /* renamed from: f */
    public boolean mo2441f() {
        return this.f1724g != null && this.f1724g.mo3008e();
    }

    /* renamed from: g */
    public boolean mo2442g() {
        return this.f1724g != null && this.f1724g.mo3011h();
    }

    public Menu getMenu() {
        if (this.f1720c == null) {
            Context context = getContext();
            this.f1720c = new C0465h(context);
            this.f1720c.mo2083a((C0465h.C0466a) new C0502d());
            this.f1724g = new C0588c(context);
            this.f1724g.mo3005c(true);
            this.f1724g.mo2018a(this.f1725h != null ? this.f1725h : new C0500b());
            this.f1720c.mo2086a((C0481o) this.f1724g, this.f1721d);
            this.f1724g.mo3003a(this);
        }
        return this.f1720c;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1724g.mo3004c();
    }

    public int getPopupTheme() {
        return this.f1722e;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean mo2450h() {
        return this.f1724g != null && this.f1724g.mo3012i();
    }

    /* renamed from: i */
    public void mo2451i() {
        if (this.f1724g != null) {
            this.f1724g.mo3009f();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1724g != null) {
            this.f1724g.mo2025b(false);
            if (this.f1724g.mo3011h()) {
                this.f1724g.mo3008e();
                this.f1724g.mo3007d();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2451i();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int width;
        int i8;
        if (!this.f1726i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = 0;
        int i11 = 0;
        int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
        boolean z2 = false;
        boolean a = C0586ba.m2902a(this);
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                i7 = paddingRight;
            } else {
                C0501c cVar = (C0501c) childAt.getLayoutParams();
                if (cVar.f1730a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo2432a(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i8 = cVar.leftMargin + getPaddingLeft();
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i13 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i13, width, measuredHeight + i13);
                    i7 = paddingRight - measuredWidth;
                    z2 = true;
                } else {
                    int measuredWidth2 = childAt.getMeasuredWidth() + cVar.leftMargin + cVar.rightMargin;
                    int i14 = i10 + measuredWidth2;
                    i7 = paddingRight - measuredWidth2;
                    if (mo2432a(i12)) {
                        i14 += dividerWidth;
                    }
                    i11++;
                    i10 = i14;
                }
            }
            i12++;
            paddingRight = i7;
        }
        if (childCount != 1 || z2) {
            int i15 = i11 - (z2 ? 0 : 1);
            int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
            if (a) {
                int width2 = getWidth() - getPaddingRight();
                int i16 = 0;
                while (i16 < childCount) {
                    View childAt2 = getChildAt(i16);
                    C0501c cVar2 = (C0501c) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() == 8) {
                        i6 = width2;
                    } else if (cVar2.f1730a) {
                        i6 = width2;
                    } else {
                        int i17 = width2 - cVar2.rightMargin;
                        int measuredWidth3 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i18 = i9 - (measuredHeight2 / 2);
                        childAt2.layout(i17 - measuredWidth3, i18, i17, measuredHeight2 + i18);
                        i6 = i17 - ((cVar2.leftMargin + measuredWidth3) + max);
                    }
                    i16++;
                    width2 = i6;
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            int i19 = 0;
            while (i19 < childCount) {
                View childAt3 = getChildAt(i19);
                C0501c cVar3 = (C0501c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8) {
                    i5 = paddingLeft;
                } else if (cVar3.f1730a) {
                    i5 = paddingLeft;
                } else {
                    int i20 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth4 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i20, i21, i20 + measuredWidth4, measuredHeight3 + i21);
                    i5 = cVar3.rightMargin + measuredWidth4 + max + i20;
                }
                i19++;
                paddingLeft = i5;
            }
            return;
        }
        View childAt4 = getChildAt(0);
        int measuredWidth5 = childAt4.getMeasuredWidth();
        int measuredHeight4 = childAt4.getMeasuredHeight();
        int i22 = ((i3 - i) / 2) - (measuredWidth5 / 2);
        int i23 = i9 - (measuredHeight4 / 2);
        childAt4.layout(i22, i23, measuredWidth5 + i22, measuredHeight4 + i23);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f1726i;
        this.f1726i = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f1726i) {
            this.f1727j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1726i || this.f1720c == null || size == this.f1727j)) {
            this.f1727j = size;
            this.f1720c.mo2106b(true);
        }
        int childCount = getChildCount();
        if (!this.f1726i || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0501c cVar = (C0501c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m2438c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1724g.mo3006d(z);
    }

    public void setOnMenuItemClickListener(C0503e eVar) {
        this.f1719b = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1724g.mo3002a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1723f = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1722e != i) {
            this.f1722e = i;
            if (i == 0) {
                this.f1721d = getContext();
            } else {
                this.f1721d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0588c cVar) {
        this.f1724g = cVar;
        this.f1724g.mo3003a(this);
    }
}
