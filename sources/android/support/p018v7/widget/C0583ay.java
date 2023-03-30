package android.support.p018v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p018v7.p019a.C0353a;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ay */
class C0583ay {

    /* renamed from: a */
    private final Context f2129a;

    /* renamed from: b */
    private final View f2130b;

    /* renamed from: c */
    private final TextView f2131c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f2132d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f2133e = new Rect();

    /* renamed from: f */
    private final int[] f2134f = new int[2];

    /* renamed from: g */
    private final int[] f2135g = new int[2];

    C0583ay(Context context) {
        this.f2129a = context;
        this.f2130b = LayoutInflater.from(this.f2129a).inflate(C0353a.C0360g.abc_tooltip, (ViewGroup) null);
        this.f2131c = (TextView) this.f2130b.findViewById(C0353a.C0359f.message);
        this.f2132d.setTitle(getClass().getSimpleName());
        this.f2132d.packageName = this.f2129a.getPackageName();
        this.f2132d.type = 1002;
        this.f2132d.width = -2;
        this.f2132d.height = -2;
        this.f2132d.format = -3;
        this.f2132d.windowAnimations = C0353a.C0362i.Animation_AppCompat_Tooltip;
        this.f2132d.flags = 24;
    }

    /* renamed from: a */
    private static View m2893a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    private void m2894a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2129a.getResources().getDimensionPixelOffset(C0353a.C0357d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2129a.getResources().getDimensionPixelOffset(C0353a.C0357d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f2129a.getResources().getDimensionPixelOffset(z ? C0353a.C0357d.tooltip_y_offset_touch : C0353a.C0357d.tooltip_y_offset_non_touch);
        View a = m2893a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f2133e);
        if (this.f2133e.left < 0 && this.f2133e.top < 0) {
            Resources resources = this.f2129a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f2133e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f2135g);
        view.getLocationOnScreen(this.f2134f);
        int[] iArr = this.f2134f;
        iArr[0] = iArr[0] - this.f2135g[0];
        int[] iArr2 = this.f2134f;
        iArr2[1] = iArr2[1] - this.f2135g[1];
        layoutParams.x = (this.f2134f[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2130b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f2130b.getMeasuredHeight();
        int i4 = ((i3 + this.f2134f[1]) - dimensionPixelOffset3) - measuredHeight;
        int i5 = height + this.f2134f[1] + dimensionPixelOffset3;
        if (z) {
            if (i4 >= 0) {
                layoutParams.y = i4;
            } else {
                layoutParams.y = i5;
            }
        } else if (measuredHeight + i5 <= this.f2133e.height()) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2990a() {
        if (mo2992b()) {
            ((WindowManager) this.f2129a.getSystemService("window")).removeView(this.f2130b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2991a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2992b()) {
            mo2990a();
        }
        this.f2131c.setText(charSequence);
        m2894a(view, i, i2, z, this.f2132d);
        ((WindowManager) this.f2129a.getSystemService("window")).addView(this.f2130b, this.f2132d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2992b() {
        return this.f2130b.getParent() != null;
    }
}
