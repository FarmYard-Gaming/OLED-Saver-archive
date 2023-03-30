package android.support.p018v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p006v4.p015g.C0218a;
import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.widget.C0338d;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.C0439c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends C0548ah implements C0439c {

    /* renamed from: i */
    static final C0518a f1774i = new C0518a();

    /* renamed from: A */
    private C0520c f1775A;

    /* renamed from: B */
    private C0519b f1776B;

    /* renamed from: C */
    private C0521d f1777C;

    /* renamed from: D */
    private View.OnClickListener f1778D;

    /* renamed from: E */
    private boolean f1779E;

    /* renamed from: F */
    private boolean f1780F;

    /* renamed from: G */
    private boolean f1781G;

    /* renamed from: H */
    private CharSequence f1782H;

    /* renamed from: I */
    private boolean f1783I;

    /* renamed from: J */
    private boolean f1784J;

    /* renamed from: K */
    private int f1785K;

    /* renamed from: L */
    private boolean f1786L;

    /* renamed from: M */
    private CharSequence f1787M;

    /* renamed from: N */
    private CharSequence f1788N;

    /* renamed from: O */
    private boolean f1789O;

    /* renamed from: P */
    private int f1790P;

    /* renamed from: Q */
    private Bundle f1791Q;

    /* renamed from: R */
    private final Runnable f1792R;

    /* renamed from: S */
    private Runnable f1793S;

    /* renamed from: T */
    private final WeakHashMap<String, Drawable.ConstantState> f1794T;

    /* renamed from: U */
    private final View.OnClickListener f1795U;

    /* renamed from: V */
    private final TextView.OnEditorActionListener f1796V;

    /* renamed from: W */
    private final AdapterView.OnItemClickListener f1797W;

    /* renamed from: a */
    final SearchAutoComplete f1798a;

    /* renamed from: aa */
    private final AdapterView.OnItemSelectedListener f1799aa;

    /* renamed from: ab */
    private TextWatcher f1800ab;

    /* renamed from: b */
    final ImageView f1801b;

    /* renamed from: c */
    final ImageView f1802c;

    /* renamed from: d */
    final ImageView f1803d;

    /* renamed from: e */
    final ImageView f1804e;

    /* renamed from: f */
    View.OnFocusChangeListener f1805f;

    /* renamed from: g */
    C0338d f1806g;

    /* renamed from: h */
    SearchableInfo f1807h;

    /* renamed from: j */
    View.OnKeyListener f1808j;

    /* renamed from: k */
    private final View f1809k;

    /* renamed from: l */
    private final View f1810l;

    /* renamed from: m */
    private final View f1811m;

    /* renamed from: n */
    private final View f1812n;

    /* renamed from: o */
    private C0524f f1813o;

    /* renamed from: p */
    private Rect f1814p;

    /* renamed from: q */
    private Rect f1815q;

    /* renamed from: r */
    private int[] f1816r;

    /* renamed from: s */
    private int[] f1817s;

    /* renamed from: t */
    private final ImageView f1818t;

    /* renamed from: u */
    private final Drawable f1819u;

    /* renamed from: v */
    private final int f1820v;

    /* renamed from: w */
    private final int f1821w;

    /* renamed from: x */
    private final Intent f1822x;

    /* renamed from: y */
    private final Intent f1823y;

    /* renamed from: z */
    private final CharSequence f1824z;

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends C0602e {

        /* renamed from: a */
        final Runnable f1835a;

        /* renamed from: b */
        private int f1836b;

        /* renamed from: c */
        private SearchView f1837c;

        /* renamed from: d */
        private boolean f1838d;

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0353a.C0354a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1835a = new Runnable() {
                public void run() {
                    SearchAutoComplete.this.mo2580b();
                }
            };
            this.f1836b = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160;
            }
            return 256;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2579a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2580b() {
            if (this.f1838d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1838d = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1836b <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1838d) {
                removeCallbacks(this.f1835a);
                post(this.f1835a);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1837c.mo2542i();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1837c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1837c.hasFocus() && getVisibility() == 0) {
                this.f1838d = true;
                if (SearchView.m2494a(getContext())) {
                    SearchView.f1774i.mo2594a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1838d = false;
                removeCallbacks(this.f1835a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1838d = false;
                removeCallbacks(this.f1835a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1838d = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1837c = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1836b = i;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C0518a {

        /* renamed from: a */
        private Method f1840a;

        /* renamed from: b */
        private Method f1841b;

        /* renamed from: c */
        private Method f1842c;

        C0518a() {
            try {
                this.f1840a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1840a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.f1841b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1841b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                this.f1842c = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1842c.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2593a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f1840a != null) {
                try {
                    this.f1840a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2594a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f1842c != null) {
                try {
                    this.f1842c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception e) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2595b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f1841b != null) {
                try {
                    this.f1841b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C0519b {
        /* renamed from: a */
        boolean mo2596a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C0520c {
        /* renamed from: a */
        boolean mo2597a(String str);

        /* renamed from: b */
        boolean mo2598b(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C0521d {
        /* renamed from: a */
        boolean mo2599a(int i);

        /* renamed from: b */
        boolean mo2600b(int i);
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    static class C0522e extends C0218a {
        public static final Parcelable.Creator<C0522e> CREATOR = new Parcelable.ClassLoaderCreator<C0522e>() {
            /* renamed from: a */
            public C0522e createFromParcel(Parcel parcel) {
                return new C0522e(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0522e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0522e(parcel, classLoader);
            }

            /* renamed from: a */
            public C0522e[] newArray(int i) {
                return new C0522e[i];
            }
        };

        /* renamed from: b */
        boolean f1843b;

        public C0522e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1843b = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        C0522e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1843b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1843b));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$f */
    private static class C0524f extends TouchDelegate {

        /* renamed from: a */
        private final View f1844a;

        /* renamed from: b */
        private final Rect f1845b = new Rect();

        /* renamed from: c */
        private final Rect f1846c = new Rect();

        /* renamed from: d */
        private final Rect f1847d = new Rect();

        /* renamed from: e */
        private final int f1848e;

        /* renamed from: f */
        private boolean f1849f;

        public C0524f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1848e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo2608a(rect, rect2);
            this.f1844a = view;
        }

        /* renamed from: a */
        public void mo2608a(Rect rect, Rect rect2) {
            this.f1845b.set(rect);
            this.f1847d.set(rect);
            this.f1847d.inset(-this.f1848e, -this.f1848e);
            this.f1846c.set(rect2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                r2 = 1
                r0 = 0
                float r1 = r7.getX()
                int r4 = (int) r1
                float r1 = r7.getY()
                int r5 = (int) r1
                int r1 = r7.getAction()
                switch(r1) {
                    case 0: goto L_0x003d;
                    case 1: goto L_0x004a;
                    case 2: goto L_0x004a;
                    case 3: goto L_0x0058;
                    default: goto L_0x0013;
                }
            L_0x0013:
                r1 = r2
                r3 = r0
            L_0x0015:
                if (r3 == 0) goto L_0x003c
                if (r1 == 0) goto L_0x005e
                android.graphics.Rect r0 = r6.f1846c
                boolean r0 = r0.contains(r4, r5)
                if (r0 != 0) goto L_0x005e
                android.view.View r0 = r6.f1844a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f1844a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
            L_0x0036:
                android.view.View r0 = r6.f1844a
                boolean r0 = r0.dispatchTouchEvent(r7)
            L_0x003c:
                return r0
            L_0x003d:
                android.graphics.Rect r1 = r6.f1845b
                boolean r1 = r1.contains(r4, r5)
                if (r1 == 0) goto L_0x0013
                r6.f1849f = r2
                r1 = r2
                r3 = r2
                goto L_0x0015
            L_0x004a:
                boolean r3 = r6.f1849f
                if (r3 == 0) goto L_0x005c
                android.graphics.Rect r1 = r6.f1847d
                boolean r1 = r1.contains(r4, r5)
                if (r1 != 0) goto L_0x005c
                r1 = r0
                goto L_0x0015
            L_0x0058:
                boolean r3 = r6.f1849f
                r6.f1849f = r0
            L_0x005c:
                r1 = r2
                goto L_0x0015
            L_0x005e:
                android.graphics.Rect r0 = r6.f1846c
                int r0 = r0.left
                int r0 = r4 - r0
                float r0 = (float) r0
                android.graphics.Rect r1 = r6.f1846c
                int r1 = r1.top
                int r1 = r5 - r1
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                goto L_0x0036
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p018v7.widget.SearchView.C0524f.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1814p = new Rect();
        this.f1815q = new Rect();
        this.f1816r = new int[2];
        this.f1817s = new int[2];
        this.f1792R = new Runnable() {
            public void run() {
                SearchView.this.mo2529d();
            }
        };
        this.f1793S = new Runnable() {
            public void run() {
                if (SearchView.this.f1806g != null && (SearchView.this.f1806g instanceof C0568ao)) {
                    SearchView.this.f1806g.mo1470a((Cursor) null);
                }
            }
        };
        this.f1794T = new WeakHashMap<>();
        this.f1795U = new View.OnClickListener() {
            public void onClick(View view) {
                if (view == SearchView.this.f1801b) {
                    SearchView.this.mo2532g();
                } else if (view == SearchView.this.f1803d) {
                    SearchView.this.mo2531f();
                } else if (view == SearchView.this.f1802c) {
                    SearchView.this.mo2530e();
                } else if (view == SearchView.this.f1804e) {
                    SearchView.this.mo2541h();
                } else if (view == SearchView.this.f1798a) {
                    SearchView.this.mo2544l();
                }
            }
        };
        this.f1808j = new View.OnKeyListener() {
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.f1807h == null) {
                    return false;
                }
                if (SearchView.this.f1798a.isPopupShowing() && SearchView.this.f1798a.getListSelection() != -1) {
                    return SearchView.this.mo2525a(view, i, keyEvent);
                }
                if (SearchView.this.f1798a.mo2579a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView.this.mo2520a(0, (String) null, SearchView.this.f1798a.getText().toString());
                return true;
            }
        };
        this.f1796V = new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.mo2530e();
                return true;
            }
        };
        this.f1797W = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo2524a(i, 0, (String) null);
            }
        };
        this.f1799aa = new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo2523a(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        this.f1800ab = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.mo2526b(charSequence);
            }
        };
        C0575au a = C0575au.m2819a(context, attributeSet, C0353a.C0363j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo2971g(C0353a.C0363j.SearchView_layout, C0353a.C0360g.abc_search_view), this, true);
        this.f1798a = (SearchAutoComplete) findViewById(C0353a.C0359f.search_src_text);
        this.f1798a.setSearchView(this);
        this.f1809k = findViewById(C0353a.C0359f.search_edit_frame);
        this.f1810l = findViewById(C0353a.C0359f.search_plate);
        this.f1811m = findViewById(C0353a.C0359f.submit_area);
        this.f1801b = (ImageView) findViewById(C0353a.C0359f.search_button);
        this.f1802c = (ImageView) findViewById(C0353a.C0359f.search_go_btn);
        this.f1803d = (ImageView) findViewById(C0353a.C0359f.search_close_btn);
        this.f1804e = (ImageView) findViewById(C0353a.C0359f.search_voice_btn);
        this.f1818t = (ImageView) findViewById(C0353a.C0359f.search_mag_icon);
        C0249q.m1052a(this.f1810l, a.mo2958a(C0353a.C0363j.SearchView_queryBackground));
        C0249q.m1052a(this.f1811m, a.mo2958a(C0353a.C0363j.SearchView_submitBackground));
        this.f1801b.setImageDrawable(a.mo2958a(C0353a.C0363j.SearchView_searchIcon));
        this.f1802c.setImageDrawable(a.mo2958a(C0353a.C0363j.SearchView_goIcon));
        this.f1803d.setImageDrawable(a.mo2958a(C0353a.C0363j.SearchView_closeIcon));
        this.f1804e.setImageDrawable(a.mo2958a(C0353a.C0363j.SearchView_voiceIcon));
        this.f1818t.setImageDrawable(a.mo2958a(C0353a.C0363j.SearchView_searchIcon));
        this.f1819u = a.mo2958a(C0353a.C0363j.SearchView_searchHintIcon);
        C0579aw.m2884a(this.f1801b, getResources().getString(C0353a.C0361h.abc_searchview_description_search));
        this.f1820v = a.mo2971g(C0353a.C0363j.SearchView_suggestionRowLayout, C0353a.C0360g.abc_search_dropdown_item_icons_2line);
        this.f1821w = a.mo2971g(C0353a.C0363j.SearchView_commitIcon, 0);
        this.f1801b.setOnClickListener(this.f1795U);
        this.f1803d.setOnClickListener(this.f1795U);
        this.f1802c.setOnClickListener(this.f1795U);
        this.f1804e.setOnClickListener(this.f1795U);
        this.f1798a.setOnClickListener(this.f1795U);
        this.f1798a.addTextChangedListener(this.f1800ab);
        this.f1798a.setOnEditorActionListener(this.f1796V);
        this.f1798a.setOnItemClickListener(this.f1797W);
        this.f1798a.setOnItemSelectedListener(this.f1799aa);
        this.f1798a.setOnKeyListener(this.f1808j);
        this.f1798a.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (SearchView.this.f1805f != null) {
                    SearchView.this.f1805f.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo2960a(C0353a.C0363j.SearchView_iconifiedByDefault, true));
        int e = a.mo2967e(C0353a.C0363j.SearchView_android_maxWidth, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f1824z = a.mo2964c(C0353a.C0363j.SearchView_defaultQueryHint);
        this.f1782H = a.mo2964c(C0353a.C0363j.SearchView_queryHint);
        int a2 = a.mo2956a(C0353a.C0363j.SearchView_android_imeOptions, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo2956a(C0353a.C0363j.SearchView_android_inputType, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo2960a(C0353a.C0363j.SearchView_android_focusable, true));
        a.mo2959a();
        this.f1822x = new Intent("android.speech.action.WEB_SEARCH");
        this.f1822x.addFlags(268435456);
        this.f1822x.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f1823y = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1823y.addFlags(268435456);
        this.f1812n = findViewById(this.f1798a.getDropDownAnchor());
        if (this.f1812n != null) {
            this.f1812n.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SearchView.this.mo2543k();
                }
            });
        }
        m2493a(this.f1779E);
        m2506r();
    }

    /* renamed from: a */
    private Intent m2488a(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: a */
    private Intent m2489a(Cursor cursor, int i, String str) {
        int i2;
        String a;
        try {
            String a2 = C0568ao.m2787a(cursor, "suggest_intent_action");
            if (a2 == null) {
                a2 = this.f1807h.getSuggestIntentAction();
            }
            if (a2 == null) {
                a2 = "android.intent.action.SEARCH";
            }
            String a3 = C0568ao.m2787a(cursor, "suggest_intent_data");
            if (a3 == null) {
                a3 = this.f1807h.getSuggestIntentData();
            }
            if (!(a3 == null || (a = C0568ao.m2787a(cursor, "suggest_intent_data_id")) == null)) {
                a3 = a3 + "/" + Uri.encode(a);
            }
            return m2490a(a2, a3 == null ? null : Uri.parse(a3), C0568ao.m2787a(cursor, "suggest_intent_extra_data"), C0568ao.m2787a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException e2) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", runtimeException);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m2490a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1788N);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f1791Q != null) {
            intent.putExtra("app_data", this.f1791Q);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1807h.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m2491a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: a */
    private void m2492a(View view, Rect rect) {
        view.getLocationInWindow(this.f1816r);
        getLocationInWindow(this.f1817s);
        int i = this.f1816r[1] - this.f1817s[1];
        int i2 = this.f1816r[0] - this.f1817s[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    /* renamed from: a */
    private void m2493a(boolean z) {
        boolean z2 = true;
        int i = 8;
        this.f1780F = z;
        int i2 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f1798a.getText());
        this.f1801b.setVisibility(i2);
        m2496b(z3);
        this.f1809k.setVisibility(z ? 8 : 0);
        if (this.f1818t.getDrawable() != null && !this.f1779E) {
            i = 0;
        }
        this.f1818t.setVisibility(i);
        m2504p();
        if (z3) {
            z2 = false;
        }
        m2499c(z2);
        m2503o();
    }

    /* renamed from: a */
    static boolean m2494a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private Intent m2495b(Intent intent, SearchableInfo searchableInfo) {
        String str = null;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        if (this.f1791Q != null) {
            bundle.putParcelable("app_data", this.f1791Q);
        }
        Intent intent3 = new Intent(intent);
        String str2 = "free_form";
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str2 = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str2);
        intent3.putExtra("android.speech.extra.PROMPT", string);
        intent3.putExtra("android.speech.extra.LANGUAGE", string2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: b */
    private void m2496b(boolean z) {
        int i = 8;
        if (this.f1781G && m2502n() && hasFocus() && (z || !this.f1786L)) {
            i = 0;
        }
        this.f1802c.setVisibility(i);
    }

    /* renamed from: b */
    private boolean m2497b(int i, int i2, String str) {
        Cursor a = this.f1806g.mo1466a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m2491a(m2489a(a, i2, str));
        return true;
    }

    /* renamed from: c */
    private CharSequence m2498c(CharSequence charSequence) {
        if (!this.f1779E || this.f1819u == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1798a.getTextSize()) * 1.25d);
        this.f1819u.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1819u), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m2499c(boolean z) {
        int i;
        if (!this.f1786L || mo2527c() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f1802c.setVisibility(8);
        }
        this.f1804e.setVisibility(i);
    }

    /* renamed from: e */
    private void m2500e(int i) {
        Editable text = this.f1798a.getText();
        Cursor a = this.f1806g.mo1466a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence c = this.f1806g.mo1475c(a);
                if (c != null) {
                    setQuery(c);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0353a.C0357d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0353a.C0357d.abc_search_view_preferred_width);
    }

    /* renamed from: m */
    private boolean m2501m() {
        if (this.f1807h == null || !this.f1807h.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1807h.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1822x;
        } else if (this.f1807h.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1823y;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: n */
    private boolean m2502n() {
        return (this.f1781G || this.f1786L) && !mo2527c();
    }

    /* renamed from: o */
    private void m2503o() {
        int i = 8;
        if (m2502n() && (this.f1802c.getVisibility() == 0 || this.f1804e.getVisibility() == 0)) {
            i = 0;
        }
        this.f1811m.setVisibility(i);
    }

    /* renamed from: p */
    private void m2504p() {
        boolean z = true;
        int i = 0;
        boolean z2 = !TextUtils.isEmpty(this.f1798a.getText());
        if (!z2 && (!this.f1779E || this.f1789O)) {
            z = false;
        }
        ImageView imageView = this.f1803d;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1803d.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: q */
    private void m2505q() {
        post(this.f1792R);
    }

    /* renamed from: r */
    private void m2506r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1798a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m2498c(queryHint));
    }

    /* renamed from: s */
    private void m2507s() {
        int i = 1;
        this.f1798a.setThreshold(this.f1807h.getSuggestThreshold());
        this.f1798a.setImeOptions(this.f1807h.getImeOptions());
        int inputType = this.f1807h.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1807h.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1798a.setInputType(inputType);
        if (this.f1806g != null) {
            this.f1806g.mo1470a((Cursor) null);
        }
        if (this.f1807h.getSuggestAuthority() != null) {
            this.f1806g = new C0568ao(getContext(), this, this.f1807h, this.f1794T);
            this.f1798a.setAdapter(this.f1806g);
            C0568ao aoVar = (C0568ao) this.f1806g;
            if (this.f1783I) {
                i = 2;
            }
            aoVar.mo2944a(i);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f1798a.setText(charSequence);
        this.f1798a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private void m2508t() {
        this.f1798a.dismissDropDown();
    }

    /* renamed from: a */
    public void mo1875a() {
        if (!this.f1789O) {
            this.f1789O = true;
            this.f1790P = this.f1798a.getImeOptions();
            this.f1798a.setImeOptions(this.f1790P | 33554432);
            this.f1798a.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2520a(int i, String str, String str2) {
        getContext().startActivity(m2490a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2521a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void mo2522a(CharSequence charSequence, boolean z) {
        this.f1798a.setText(charSequence);
        if (charSequence != null) {
            this.f1798a.setSelection(this.f1798a.length());
            this.f1788N = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo2530e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2523a(int i) {
        if (this.f1777C != null && this.f1777C.mo2599a(i)) {
            return false;
        }
        m2500e(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2524a(int i, int i2, String str) {
        if (this.f1777C != null && this.f1777C.mo2600b(i)) {
            return false;
        }
        m2497b(i, 0, (String) null);
        this.f1798a.setImeVisibility(false);
        m2508t();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2525a(View view, int i, KeyEvent keyEvent) {
        if (this.f1807h == null || this.f1806g == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            return mo2524a(this.f1798a.getListSelection(), 0, (String) null);
        }
        if (i == 21 || i == 22) {
            this.f1798a.setSelection(i == 21 ? 0 : this.f1798a.length());
            this.f1798a.setListSelection(0);
            this.f1798a.clearListSelection();
            f1774i.mo2594a(this.f1798a, true);
            return true;
        }
        if (!(i == 19 && this.f1798a.getListSelection() == 0)) {
        }
        return false;
    }

    /* renamed from: b */
    public void mo1876b() {
        mo2522a((CharSequence) "", false);
        clearFocus();
        m2493a(true);
        this.f1798a.setImeOptions(this.f1790P);
        this.f1789O = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2526b(CharSequence charSequence) {
        boolean z = true;
        Editable text = this.f1798a.getText();
        this.f1788N = text;
        boolean z2 = !TextUtils.isEmpty(text);
        m2496b(z2);
        if (z2) {
            z = false;
        }
        m2499c(z);
        m2504p();
        m2503o();
        if (this.f1775A != null && !TextUtils.equals(charSequence, this.f1787M)) {
            this.f1775A.mo2598b(charSequence.toString());
        }
        this.f1787M = charSequence.toString();
    }

    /* renamed from: c */
    public boolean mo2527c() {
        return this.f1780F;
    }

    public void clearFocus() {
        this.f1784J = true;
        super.clearFocus();
        this.f1798a.clearFocus();
        this.f1798a.setImeVisibility(false);
        this.f1784J = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2529d() {
        int[] iArr = this.f1798a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f1810l.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1811m.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2530e() {
        Editable text = this.f1798a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1775A == null || !this.f1775A.mo2597a(text.toString())) {
                if (this.f1807h != null) {
                    mo2520a(0, (String) null, text.toString());
                }
                this.f1798a.setImeVisibility(false);
                m2508t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2531f() {
        if (!TextUtils.isEmpty(this.f1798a.getText())) {
            this.f1798a.setText("");
            this.f1798a.requestFocus();
            this.f1798a.setImeVisibility(true);
        } else if (!this.f1779E) {
        } else {
            if (this.f1776B == null || !this.f1776B.mo2596a()) {
                clearFocus();
                m2493a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2532g() {
        m2493a(false);
        this.f1798a.requestFocus();
        this.f1798a.setImeVisibility(true);
        if (this.f1778D != null) {
            this.f1778D.onClick(this);
        }
    }

    public int getImeOptions() {
        return this.f1798a.getImeOptions();
    }

    public int getInputType() {
        return this.f1798a.getInputType();
    }

    public int getMaxWidth() {
        return this.f1785K;
    }

    public CharSequence getQuery() {
        return this.f1798a.getText();
    }

    public CharSequence getQueryHint() {
        return this.f1782H != null ? this.f1782H : (this.f1807h == null || this.f1807h.getHintId() == 0) ? this.f1824z : getContext().getText(this.f1807h.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1821w;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1820v;
    }

    public C0338d getSuggestionsAdapter() {
        return this.f1806g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2541h() {
        if (this.f1807h != null) {
            SearchableInfo searchableInfo = this.f1807h;
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m2488a(this.f1822x, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m2495b(this.f1823y, searchableInfo));
                }
            } catch (ActivityNotFoundException e) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2542i() {
        m2493a(mo2527c());
        m2505q();
        if (this.f1798a.hasFocus()) {
            mo2544l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2543k() {
        if (this.f1812n.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1810l.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0586ba.m2902a(this);
            int dimensionPixelSize = this.f1779E ? resources.getDimensionPixelSize(C0353a.C0357d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C0353a.C0357d.abc_dropdownitem_icon_width) : 0;
            this.f1798a.getDropDownBackground().getPadding(rect);
            this.f1798a.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1798a.setDropDownWidth((dimensionPixelSize + ((this.f1812n.getWidth() + rect.left) + rect.right)) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2544l() {
        f1774i.mo2593a(this.f1798a);
        f1774i.mo2595b(this.f1798a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1792R);
        post(this.f1793S);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m2492a((View) this.f1798a, this.f1814p);
            this.f1815q.set(this.f1814p.left, 0, this.f1814p.right, i4 - i2);
            if (this.f1813o == null) {
                this.f1813o = new C0524f(this.f1815q, this.f1814p, this.f1798a);
                setTouchDelegate(this.f1813o);
                return;
            }
            this.f1813o.mo2608a(this.f1815q, this.f1814p);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (mo2527c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (this.f1785K <= 0) {
                    size = Math.min(getPreferredWidth(), size);
                    break;
                } else {
                    size = Math.min(this.f1785K, size);
                    break;
                }
            case 0:
                if (this.f1785K <= 0) {
                    size = getPreferredWidth();
                    break;
                } else {
                    size = this.f1785K;
                    break;
                }
            case 1073741824:
                if (this.f1785K > 0) {
                    size = Math.min(this.f1785K, size);
                    break;
                }
                break;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        switch (mode2) {
            case Integer.MIN_VALUE:
                size2 = Math.min(getPreferredHeight(), size2);
                break;
            case 0:
                size2 = getPreferredHeight();
                break;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0522e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0522e eVar = (C0522e) parcelable;
        super.onRestoreInstanceState(eVar.mo963a());
        m2493a(eVar.f1843b);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0522e eVar = new C0522e(super.onSaveInstanceState());
        eVar.f1843b = mo2527c();
        return eVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m2505q();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1784J || !isFocusable()) {
            return false;
        }
        if (mo2527c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1798a.requestFocus(i, rect);
        if (requestFocus) {
            m2493a(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1791Q = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo2531f();
        } else {
            mo2532g();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1779E != z) {
            this.f1779E = z;
            m2493a(z);
            m2506r();
        }
    }

    public void setImeOptions(int i) {
        this.f1798a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1798a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1785K = i;
        requestLayout();
    }

    public void setOnCloseListener(C0519b bVar) {
        this.f1776B = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1805f = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0520c cVar) {
        this.f1775A = cVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1778D = onClickListener;
    }

    public void setOnSuggestionListener(C0521d dVar) {
        this.f1777C = dVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1782H = charSequence;
        m2506r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1783I = z;
        if (this.f1806g instanceof C0568ao) {
            ((C0568ao) this.f1806g).mo2944a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1807h = searchableInfo;
        if (this.f1807h != null) {
            m2507s();
            m2506r();
        }
        this.f1786L = m2501m();
        if (this.f1786L) {
            this.f1798a.setPrivateImeOptions("nm");
        }
        m2493a(mo2527c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1781G = z;
        m2493a(mo2527c());
    }

    public void setSuggestionsAdapter(C0338d dVar) {
        this.f1806g = dVar;
        this.f1798a.setAdapter(this.f1806g);
    }
}
