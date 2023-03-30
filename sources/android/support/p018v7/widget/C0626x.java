package android.support.p018v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.p015g.C0248p;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.p020b.p021a.C0419a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.x */
public class C0626x extends Spinner implements C0248p {

    /* renamed from: d */
    private static final int[] f2256d = {16843505};

    /* renamed from: a */
    C0629b f2257a;

    /* renamed from: b */
    int f2258b;

    /* renamed from: c */
    final Rect f2259c;

    /* renamed from: e */
    private final C0603f f2260e;

    /* renamed from: f */
    private final Context f2261f;

    /* renamed from: g */
    private C0545ag f2262g;

    /* renamed from: h */
    private SpinnerAdapter f2263h;

    /* renamed from: i */
    private final boolean f2264i;

    /* renamed from: android.support.v7.widget.x$a */
    private static class C0628a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f2267a;

        /* renamed from: b */
        private ListAdapter f2268b;

        public C0628a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2267a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2268b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0571aq) {
                C0571aq aqVar = (C0571aq) spinnerAdapter;
                if (aqVar.mo2948a() == null) {
                    aqVar.mo2949a(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2268b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            if (this.f2267a == null) {
                return 0;
            }
            return this.f2267a.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f2267a == null) {
                return null;
            }
            return this.f2267a.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            if (this.f2267a == null) {
                return null;
            }
            return this.f2267a.getItem(i);
        }

        public long getItemId(int i) {
            if (this.f2267a == null) {
                return -1;
            }
            return this.f2267a.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            return this.f2267a != null && this.f2267a.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2268b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f2267a != null) {
                this.f2267a.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f2267a != null) {
                this.f2267a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: android.support.v7.widget.x$b */
    private class C0629b extends C0550ai {

        /* renamed from: a */
        ListAdapter f2269a;

        /* renamed from: h */
        private CharSequence f2271h;

        /* renamed from: i */
        private final Rect f2272i = new Rect();

        public C0629b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2834b((View) C0626x.this);
            mo2832a(true);
            mo2826a(0);
            mo2829a((AdapterView.OnItemClickListener) new AdapterView.OnItemClickListener(C0626x.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C0626x.this.setSelection(i);
                    if (C0626x.this.getOnItemClickListener() != null) {
                        C0626x.this.performItemClick(view, i, C0629b.this.f2269a.getItemId(i));
                    }
                    C0629b.this.mo2040c();
                }
            });
        }

        /* renamed from: a */
        public void mo2033a() {
            ViewTreeObserver viewTreeObserver;
            boolean d = mo2043d();
            mo3187f();
            mo2843h(2);
            super.mo2033a();
            mo2044e().setChoiceMode(1);
            mo2845i(C0626x.this.getSelectedItemPosition());
            if (!d && (viewTreeObserver = C0626x.this.getViewTreeObserver()) != null) {
                final C06312 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (!C0629b.this.mo3185a((View) C0626x.this)) {
                            C0629b.this.mo2040c();
                            return;
                        }
                        C0629b.this.mo3187f();
                        C0629b.super.mo2033a();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r1);
                mo2831a((PopupWindow.OnDismissListener) new PopupWindow.OnDismissListener() {
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = C0626x.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r1);
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo2830a(ListAdapter listAdapter) {
            super.mo2830a(listAdapter);
            this.f2269a = listAdapter;
        }

        /* renamed from: a */
        public void mo3184a(CharSequence charSequence) {
            this.f2271h = charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3185a(View view) {
            return C0249q.m1071m(view) && view.getGlobalVisibleRect(this.f2272i);
        }

        /* renamed from: b */
        public CharSequence mo3186b() {
            return this.f2271h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3187f() {
            int i;
            Drawable h = mo2842h();
            if (h != null) {
                h.getPadding(C0626x.this.f2259c);
                i = C0586ba.m2902a(C0626x.this) ? C0626x.this.f2259c.right : -C0626x.this.f2259c.left;
            } else {
                Rect rect = C0626x.this.f2259c;
                C0626x.this.f2259c.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = C0626x.this.getPaddingLeft();
            int paddingRight = C0626x.this.getPaddingRight();
            int width = C0626x.this.getWidth();
            if (C0626x.this.f2258b == -2) {
                int a = C0626x.this.mo3149a((SpinnerAdapter) this.f2269a, mo2842h());
                int i2 = (C0626x.this.getContext().getResources().getDisplayMetrics().widthPixels - C0626x.this.f2259c.left) - C0626x.this.f2259c.right;
                if (a <= i2) {
                    i2 = a;
                }
                mo2840g(Math.max(i2, (width - paddingLeft) - paddingRight));
            } else if (C0626x.this.f2258b == -1) {
                mo2840g((width - paddingLeft) - paddingRight);
            } else {
                mo2840g(C0626x.this.f2258b);
            }
            mo2836c(C0586ba.m2902a(C0626x.this) ? ((width - paddingRight) - mo2848l()) + i : i + paddingLeft);
        }
    }

    public C0626x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.spinnerStyle);
    }

    public C0626x(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0626x(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0626x(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r7 = 1
            r1 = 0
            r6 = 0
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f2259c = r0
            int[] r0 = android.support.p018v7.p019a.C0353a.C0363j.Spinner
            android.support.v7.widget.au r3 = android.support.p018v7.widget.C0575au.m2819a(r9, r10, r0, r11, r6)
            android.support.v7.widget.f r0 = new android.support.v7.widget.f
            r0.<init>(r8)
            r8.f2260e = r0
            if (r13 == 0) goto L_0x00a9
            android.support.v7.view.d r0 = new android.support.v7.view.d
            r0.<init>((android.content.Context) r9, (android.content.res.Resources.Theme) r13)
            r8.f2261f = r0
        L_0x0023:
            android.content.Context r0 = r8.f2261f
            if (r0 == 0) goto L_0x007b
            r0 = -1
            if (r12 != r0) goto L_0x0043
            int[] r0 = f2256d     // Catch:{ Exception -> 0x00c7, all -> 0x00d7 }
            r2 = 0
            android.content.res.TypedArray r2 = r9.obtainStyledAttributes(r10, r0, r11, r2)     // Catch:{ Exception -> 0x00c7, all -> 0x00d7 }
            r0 = 0
            boolean r0 = r2.hasValue(r0)     // Catch:{ Exception -> 0x00e1 }
            if (r0 == 0) goto L_0x003e
            r0 = 0
            r4 = 0
            int r12 = r2.getInt(r0, r4)     // Catch:{ Exception -> 0x00e1 }
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r2.recycle()
        L_0x0043:
            if (r12 != r7) goto L_0x007b
            android.support.v7.widget.x$b r0 = new android.support.v7.widget.x$b
            android.content.Context r2 = r8.f2261f
            r0.<init>(r2, r10, r11)
            android.content.Context r2 = r8.f2261f
            int[] r4 = android.support.p018v7.p019a.C0353a.C0363j.Spinner
            android.support.v7.widget.au r2 = android.support.p018v7.widget.C0575au.m2819a(r2, r10, r4, r11, r6)
            int r4 = android.support.p018v7.p019a.C0353a.C0363j.Spinner_android_dropDownWidth
            r5 = -2
            int r4 = r2.mo2969f(r4, r5)
            r8.f2258b = r4
            int r4 = android.support.p018v7.p019a.C0353a.C0363j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r4 = r2.mo2958a(r4)
            r0.mo2828a((android.graphics.drawable.Drawable) r4)
            int r4 = android.support.p018v7.p019a.C0353a.C0363j.Spinner_android_prompt
            java.lang.String r4 = r3.mo2966d(r4)
            r0.mo3184a((java.lang.CharSequence) r4)
            r2.mo2959a()
            r8.f2257a = r0
            android.support.v7.widget.x$1 r2 = new android.support.v7.widget.x$1
            r2.<init>(r8, r0)
            r8.f2262g = r2
        L_0x007b:
            int r0 = android.support.p018v7.p019a.C0353a.C0363j.Spinner_android_entries
            java.lang.CharSequence[] r0 = r3.mo2970f(r0)
            if (r0 == 0) goto L_0x0093
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r9, r4, r0)
            int r0 = android.support.p018v7.p019a.C0353a.C0360g.support_simple_spinner_dropdown_item
            r2.setDropDownViewResource(r0)
            r8.setAdapter((android.widget.SpinnerAdapter) r2)
        L_0x0093:
            r3.mo2959a()
            r8.f2264i = r7
            android.widget.SpinnerAdapter r0 = r8.f2263h
            if (r0 == 0) goto L_0x00a3
            android.widget.SpinnerAdapter r0 = r8.f2263h
            r8.setAdapter((android.widget.SpinnerAdapter) r0)
            r8.f2263h = r1
        L_0x00a3:
            android.support.v7.widget.f r0 = r8.f2260e
            r0.mo3045a(r10, r11)
            return
        L_0x00a9:
            int r0 = android.support.p018v7.p019a.C0353a.C0363j.Spinner_popupTheme
            int r0 = r3.mo2971g(r0, r6)
            if (r0 == 0) goto L_0x00ba
            android.support.v7.view.d r2 = new android.support.v7.view.d
            r2.<init>((android.content.Context) r9, (int) r0)
            r8.f2261f = r2
            goto L_0x0023
        L_0x00ba:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 >= r2) goto L_0x00c5
            r0 = r9
        L_0x00c1:
            r8.f2261f = r0
            goto L_0x0023
        L_0x00c5:
            r0 = r1
            goto L_0x00c1
        L_0x00c7:
            r0 = move-exception
            r2 = r1
        L_0x00c9:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r0)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x0043
            r2.recycle()
            goto L_0x0043
        L_0x00d7:
            r0 = move-exception
            r2 = r1
        L_0x00d9:
            if (r2 == 0) goto L_0x00de
            r2.recycle()
        L_0x00de:
            throw r0
        L_0x00df:
            r0 = move-exception
            goto L_0x00d9
        L_0x00e1:
            r0 = move-exception
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.widget.C0626x.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3149a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        int i = 0;
        View view = null;
        int i2 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
            } else {
                itemViewType = i;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
            max2++;
            i = itemViewType;
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f2259c);
        return this.f2259c.left + this.f2259c.right + i2;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2260e != null) {
            this.f2260e.mo3048c();
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.f2257a != null) {
            return this.f2257a.mo2846j();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        if (this.f2257a != null) {
            return this.f2257a.mo2847k();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f2257a != null) {
            return this.f2258b;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        if (this.f2257a != null) {
            return this.f2257a.mo2842h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.f2257a != null) {
            return this.f2261f;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        return this.f2257a != null ? this.f2257a.mo3186b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2260e != null) {
            return this.f2260e.mo3040a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f2260e != null) {
            return this.f2260e.mo3046b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2257a != null && this.f2257a.mo2043d()) {
            this.f2257a.mo2040c();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2257a != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo3149a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2262g == null || !this.f2262g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        if (this.f2257a == null) {
            return super.performClick();
        }
        if (!this.f2257a.mo2043d()) {
            this.f2257a.mo2033a();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2264i) {
            this.f2263h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2257a != null) {
            this.f2257a.mo2830a((ListAdapter) new C0628a(spinnerAdapter, (this.f2261f == null ? getContext() : this.f2261f).getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2260e != null) {
            this.f2260e.mo3044a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2260e != null) {
            this.f2260e.mo3041a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f2257a != null) {
            this.f2257a.mo2836c(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f2257a != null) {
            this.f2257a.mo2837d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f2257a != null) {
            this.f2258b = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f2257a != null) {
            this.f2257a.mo2828a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0419a.m1949b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f2257a != null) {
            this.f2257a.mo3184a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2260e != null) {
            this.f2260e.mo3042a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2260e != null) {
            this.f2260e.mo3043a(mode);
        }
    }
}
