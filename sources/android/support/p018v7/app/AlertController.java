package android.support.p018v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.p006v4.p015g.C0249q;
import android.support.p006v4.widget.NestedScrollView;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.widget.C0548ah;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.AlertController */
class AlertController {

    /* renamed from: A */
    private int f991A;

    /* renamed from: B */
    private boolean f992B = false;

    /* renamed from: C */
    private CharSequence f993C;

    /* renamed from: D */
    private Drawable f994D;

    /* renamed from: E */
    private CharSequence f995E;

    /* renamed from: F */
    private Drawable f996F;

    /* renamed from: G */
    private CharSequence f997G;

    /* renamed from: H */
    private Drawable f998H;

    /* renamed from: I */
    private int f999I = 0;

    /* renamed from: J */
    private Drawable f1000J;

    /* renamed from: K */
    private ImageView f1001K;

    /* renamed from: L */
    private TextView f1002L;

    /* renamed from: M */
    private TextView f1003M;

    /* renamed from: N */
    private View f1004N;

    /* renamed from: O */
    private int f1005O;

    /* renamed from: P */
    private int f1006P;

    /* renamed from: Q */
    private boolean f1007Q;

    /* renamed from: R */
    private int f1008R = 0;

    /* renamed from: S */
    private final View.OnClickListener f1009S = new View.OnClickListener() {
        public void onClick(View view) {
            Message obtain = (view != AlertController.this.f1012c || AlertController.this.f1013d == null) ? (view != AlertController.this.f1014e || AlertController.this.f1015f == null) ? (view != AlertController.this.f1016g || AlertController.this.f1017h == null) ? null : Message.obtain(AlertController.this.f1017h) : Message.obtain(AlertController.this.f1015f) : Message.obtain(AlertController.this.f1013d);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController.this.f1025p.obtainMessage(1, AlertController.this.f1010a).sendToTarget();
        }
    };

    /* renamed from: a */
    final C0405g f1010a;

    /* renamed from: b */
    ListView f1011b;

    /* renamed from: c */
    Button f1012c;

    /* renamed from: d */
    Message f1013d;

    /* renamed from: e */
    Button f1014e;

    /* renamed from: f */
    Message f1015f;

    /* renamed from: g */
    Button f1016g;

    /* renamed from: h */
    Message f1017h;

    /* renamed from: i */
    NestedScrollView f1018i;

    /* renamed from: j */
    ListAdapter f1019j;

    /* renamed from: k */
    int f1020k = -1;

    /* renamed from: l */
    int f1021l;

    /* renamed from: m */
    int f1022m;

    /* renamed from: n */
    int f1023n;

    /* renamed from: o */
    int f1024o;

    /* renamed from: p */
    Handler f1025p;

    /* renamed from: q */
    private final Context f1026q;

    /* renamed from: r */
    private final Window f1027r;

    /* renamed from: s */
    private final int f1028s;

    /* renamed from: t */
    private CharSequence f1029t;

    /* renamed from: u */
    private CharSequence f1030u;

    /* renamed from: v */
    private View f1031v;

    /* renamed from: w */
    private int f1032w;

    /* renamed from: x */
    private int f1033x;

    /* renamed from: y */
    private int f1034y;

    /* renamed from: z */
    private int f1035z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f1049a;

        /* renamed from: b */
        private final int f1050b;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0353a.C0363j.RecycleListView);
            this.f1050b = obtainStyledAttributes.getDimensionPixelOffset(C0353a.C0363j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1049a = obtainStyledAttributes.getDimensionPixelOffset(C0353a.C0363j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo1518a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1049a, getPaddingRight(), z2 ? getPaddingBottom() : this.f1050b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C0369a {

        /* renamed from: A */
        public int f1051A;

        /* renamed from: B */
        public int f1052B;

        /* renamed from: C */
        public int f1053C;

        /* renamed from: D */
        public int f1054D;

        /* renamed from: E */
        public boolean f1055E = false;

        /* renamed from: F */
        public boolean[] f1056F;

        /* renamed from: G */
        public boolean f1057G;

        /* renamed from: H */
        public boolean f1058H;

        /* renamed from: I */
        public int f1059I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f1060J;

        /* renamed from: K */
        public Cursor f1061K;

        /* renamed from: L */
        public String f1062L;

        /* renamed from: M */
        public String f1063M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f1064N;

        /* renamed from: O */
        public C0374a f1065O;

        /* renamed from: P */
        public boolean f1066P = true;

        /* renamed from: a */
        public final Context f1067a;

        /* renamed from: b */
        public final LayoutInflater f1068b;

        /* renamed from: c */
        public int f1069c = 0;

        /* renamed from: d */
        public Drawable f1070d;

        /* renamed from: e */
        public int f1071e = 0;

        /* renamed from: f */
        public CharSequence f1072f;

        /* renamed from: g */
        public View f1073g;

        /* renamed from: h */
        public CharSequence f1074h;

        /* renamed from: i */
        public CharSequence f1075i;

        /* renamed from: j */
        public Drawable f1076j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1077k;

        /* renamed from: l */
        public CharSequence f1078l;

        /* renamed from: m */
        public Drawable f1079m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1080n;

        /* renamed from: o */
        public CharSequence f1081o;

        /* renamed from: p */
        public Drawable f1082p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1083q;

        /* renamed from: r */
        public boolean f1084r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f1085s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f1086t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f1087u;

        /* renamed from: v */
        public CharSequence[] f1088v;

        /* renamed from: w */
        public ListAdapter f1089w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1090x;

        /* renamed from: y */
        public int f1091y;

        /* renamed from: z */
        public View f1092z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C0374a {
            /* renamed from: a */
            void mo1525a(ListView listView);
        }

        public C0369a(Context context) {
            this.f1067a = context;
            this.f1084r = true;
            this.f1068b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m1655b(final AlertController alertController) {
            ListAdapter simpleCursorAdapter;
            final RecycleListView recycleListView = (RecycleListView) this.f1068b.inflate(alertController.f1021l, (ViewGroup) null);
            if (!this.f1057G) {
                int i = this.f1058H ? alertController.f1023n : alertController.f1024o;
                simpleCursorAdapter = this.f1061K != null ? new SimpleCursorAdapter(this.f1067a, i, this.f1061K, new String[]{this.f1062L}, new int[]{16908308}) : this.f1089w != null ? this.f1089w : new C0376c(this.f1067a, i, 16908308, this.f1088v);
            } else if (this.f1061K == null) {
                simpleCursorAdapter = new ArrayAdapter<CharSequence>(this.f1067a, alertController.f1022m, 16908308, this.f1088v) {
                    public View getView(int i, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i, view, viewGroup);
                        if (C0369a.this.f1056F != null && C0369a.this.f1056F[i]) {
                            recycleListView.setItemChecked(i, true);
                        }
                        return view2;
                    }
                };
            } else {
                final AlertController alertController2 = alertController;
                simpleCursorAdapter = new CursorAdapter(this.f1067a, this.f1061K, false) {

                    /* renamed from: d */
                    private final int f1098d;

                    /* renamed from: e */
                    private final int f1099e;

                    {
                        Cursor cursor = getCursor();
                        this.f1098d = cursor.getColumnIndexOrThrow(C0369a.this.f1062L);
                        this.f1099e = cursor.getColumnIndexOrThrow(C0369a.this.f1063M);
                    }

                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f1098d));
                        recycleListView.setItemChecked(cursor.getPosition(), cursor.getInt(this.f1099e) == 1);
                    }

                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return C0369a.this.f1068b.inflate(alertController2.f1022m, viewGroup, false);
                    }
                };
            }
            if (this.f1065O != null) {
                this.f1065O.mo1525a(recycleListView);
            }
            alertController.f1019j = simpleCursorAdapter;
            alertController.f1020k = this.f1059I;
            if (this.f1090x != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        C0369a.this.f1090x.onClick(alertController.f1010a, i);
                        if (!C0369a.this.f1058H) {
                            alertController.f1010a.dismiss();
                        }
                    }
                });
            } else if (this.f1060J != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        if (C0369a.this.f1056F != null) {
                            C0369a.this.f1056F[i] = recycleListView.isItemChecked(i);
                        }
                        C0369a.this.f1060J.onClick(alertController.f1010a, i, recycleListView.isItemChecked(i));
                    }
                });
            }
            if (this.f1064N != null) {
                recycleListView.setOnItemSelectedListener(this.f1064N);
            }
            if (this.f1058H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f1057G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f1011b = recycleListView;
        }

        /* renamed from: a */
        public void mo1519a(AlertController alertController) {
            if (this.f1073g != null) {
                alertController.mo1508b(this.f1073g);
            } else {
                if (this.f1072f != null) {
                    alertController.mo1505a(this.f1072f);
                }
                if (this.f1070d != null) {
                    alertController.mo1503a(this.f1070d);
                }
                if (this.f1069c != 0) {
                    alertController.mo1507b(this.f1069c);
                }
                if (this.f1071e != 0) {
                    alertController.mo1507b(alertController.mo1511c(this.f1071e));
                }
            }
            if (this.f1074h != null) {
                alertController.mo1509b(this.f1074h);
            }
            if (!(this.f1075i == null && this.f1076j == null)) {
                alertController.mo1502a(-1, this.f1075i, this.f1077k, (Message) null, this.f1076j);
            }
            if (!(this.f1078l == null && this.f1079m == null)) {
                alertController.mo1502a(-2, this.f1078l, this.f1080n, (Message) null, this.f1079m);
            }
            if (!(this.f1081o == null && this.f1082p == null)) {
                alertController.mo1502a(-3, this.f1081o, this.f1083q, (Message) null, this.f1082p);
            }
            if (!(this.f1088v == null && this.f1061K == null && this.f1089w == null)) {
                m1655b(alertController);
            }
            if (this.f1092z != null) {
                if (this.f1055E) {
                    alertController.mo1504a(this.f1092z, this.f1051A, this.f1052B, this.f1053C, this.f1054D);
                    return;
                }
                alertController.mo1512c(this.f1092z);
            } else if (this.f1091y != 0) {
                alertController.mo1501a(this.f1091y);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C0375b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f1105a;

        public C0375b(DialogInterface dialogInterface) {
            this.f1105a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case -3:
                case -2:
                case -1:
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1105a.get(), message.what);
                    return;
                case 1:
                    ((DialogInterface) message.obj).dismiss();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C0376c extends ArrayAdapter<CharSequence> {
        public C0376c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0405g gVar, Window window) {
        this.f1026q = context;
        this.f1010a = gVar;
        this.f1027r = window;
        this.f1025p = new C0375b(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0353a.C0363j.AlertDialog, C0353a.C0354a.alertDialogStyle, 0);
        this.f1005O = obtainStyledAttributes.getResourceId(C0353a.C0363j.AlertDialog_android_layout, 0);
        this.f1006P = obtainStyledAttributes.getResourceId(C0353a.C0363j.AlertDialog_buttonPanelSideLayout, 0);
        this.f1021l = obtainStyledAttributes.getResourceId(C0353a.C0363j.AlertDialog_listLayout, 0);
        this.f1022m = obtainStyledAttributes.getResourceId(C0353a.C0363j.AlertDialog_multiChoiceItemLayout, 0);
        this.f1023n = obtainStyledAttributes.getResourceId(C0353a.C0363j.AlertDialog_singleChoiceItemLayout, 0);
        this.f1024o = obtainStyledAttributes.getResourceId(C0353a.C0363j.AlertDialog_listItemLayout, 0);
        this.f1007Q = obtainStyledAttributes.getBoolean(C0353a.C0363j.AlertDialog_showTitle, true);
        this.f1028s = obtainStyledAttributes.getDimensionPixelSize(C0353a.C0363j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        gVar.mo1695a(1);
    }

    /* renamed from: a */
    private ViewGroup m1628a(View view, View view2) {
        if (view == null) {
            return (ViewGroup) (view2 instanceof ViewStub ? ((ViewStub) view2).inflate() : view2);
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        return (ViewGroup) (view instanceof ViewStub ? ((ViewStub) view).inflate() : view);
    }

    /* renamed from: a */
    static void m1629a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m1630a(ViewGroup viewGroup) {
        boolean z = false;
        View inflate = this.f1031v != null ? this.f1031v : this.f1032w != 0 ? LayoutInflater.from(this.f1026q).inflate(this.f1032w, viewGroup, false) : null;
        if (inflate != null) {
            z = true;
        }
        if (!z || !m1634a(inflate)) {
            this.f1027r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f1027r.findViewById(C0353a.C0359f.custom);
            frameLayout.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.f992B) {
                frameLayout.setPadding(this.f1033x, this.f1034y, this.f1035z, this.f991A);
            }
            if (this.f1011b != null) {
                ((C0548ah.C0549a) viewGroup.getLayoutParams()).f1972g = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private void m1631a(ViewGroup viewGroup, View view, int i, int i2) {
        final View view2 = null;
        final View findViewById = this.f1027r.findViewById(C0353a.C0359f.scrollIndicatorUp);
        View findViewById2 = this.f1027r.findViewById(C0353a.C0359f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0249q.m1049a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f1030u != null) {
                this.f1018i.setOnScrollChangeListener(new NestedScrollView.C0330b() {
                    /* renamed from: a */
                    public void mo1431a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                        AlertController.m1629a(nestedScrollView, findViewById, view2);
                    }
                });
                this.f1018i.post(new Runnable() {
                    public void run() {
                        AlertController.m1629a(AlertController.this.f1018i, findViewById, view2);
                    }
                });
            } else if (this.f1011b != null) {
                this.f1011b.setOnScrollListener(new AbsListView.OnScrollListener() {
                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        AlertController.m1629a(absListView, findViewById, view2);
                    }

                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }
                });
                this.f1011b.post(new Runnable() {
                    public void run() {
                        AlertController.m1629a(AlertController.this.f1011b, findViewById, view2);
                    }
                });
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1632a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m1633a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0353a.C0354a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m1634a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1634a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m1635b() {
        return this.f1006P == 0 ? this.f1005O : this.f1008R == 1 ? this.f1006P : this.f1005O;
    }

    /* renamed from: b */
    private void m1636b(ViewGroup viewGroup) {
        if (this.f1004N != null) {
            viewGroup.addView(this.f1004N, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1027r.findViewById(C0353a.C0359f.title_template).setVisibility(8);
            return;
        }
        this.f1001K = (ImageView) this.f1027r.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f1029t)) || !this.f1007Q) {
            this.f1027r.findViewById(C0353a.C0359f.title_template).setVisibility(8);
            this.f1001K.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f1002L = (TextView) this.f1027r.findViewById(C0353a.C0359f.alertTitle);
        this.f1002L.setText(this.f1029t);
        if (this.f999I != 0) {
            this.f1001K.setImageResource(this.f999I);
        } else if (this.f1000J != null) {
            this.f1001K.setImageDrawable(this.f1000J);
        } else {
            this.f1002L.setPadding(this.f1001K.getPaddingLeft(), this.f1001K.getPaddingTop(), this.f1001K.getPaddingRight(), this.f1001K.getPaddingBottom());
            this.f1001K.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m1637c() {
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f1027r.findViewById(C0353a.C0359f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0353a.C0359f.topPanel);
        View findViewById5 = findViewById3.findViewById(C0353a.C0359f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0353a.C0359f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0353a.C0359f.customPanel);
        m1630a(viewGroup);
        View findViewById7 = viewGroup.findViewById(C0353a.C0359f.topPanel);
        View findViewById8 = viewGroup.findViewById(C0353a.C0359f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C0353a.C0359f.buttonPanel);
        ViewGroup a = m1628a(findViewById7, findViewById4);
        ViewGroup a2 = m1628a(findViewById8, findViewById5);
        ViewGroup a3 = m1628a(findViewById9, findViewById6);
        m1638c(a2);
        m1639d(a3);
        m1636b(a);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(C0353a.C0359f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            if (this.f1018i != null) {
                this.f1018i.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f1030u == null && this.f1011b == null)) {
                view = a.findViewById(C0353a.C0359f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(C0353a.C0359f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        if (this.f1011b instanceof RecycleListView) {
            ((RecycleListView) this.f1011b).mo1518a(z2, z3);
        }
        if (!z) {
            ViewGroup viewGroup2 = this.f1011b != null ? this.f1011b : this.f1018i;
            if (viewGroup2 != null) {
                m1631a(a2, viewGroup2, (z3 ? 2 : 0) | (z2 ? 1 : 0), 3);
            }
        }
        ListView listView = this.f1011b;
        if (listView != null && this.f1019j != null) {
            listView.setAdapter(this.f1019j);
            int i = this.f1020k;
            if (i > -1) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }

    /* renamed from: c */
    private void m1638c(ViewGroup viewGroup) {
        this.f1018i = (NestedScrollView) this.f1027r.findViewById(C0353a.C0359f.scrollView);
        this.f1018i.setFocusable(false);
        this.f1018i.setNestedScrollingEnabled(false);
        this.f1003M = (TextView) viewGroup.findViewById(16908299);
        if (this.f1003M != null) {
            if (this.f1030u != null) {
                this.f1003M.setText(this.f1030u);
                return;
            }
            this.f1003M.setVisibility(8);
            this.f1018i.removeView(this.f1003M);
            if (this.f1011b != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f1018i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f1018i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f1011b, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m1639d(ViewGroup viewGroup) {
        boolean z;
        boolean z2 = true;
        this.f1012c = (Button) viewGroup.findViewById(16908313);
        this.f1012c.setOnClickListener(this.f1009S);
        if (!TextUtils.isEmpty(this.f993C) || this.f994D != null) {
            this.f1012c.setText(this.f993C);
            if (this.f994D != null) {
                this.f994D.setBounds(0, 0, this.f1028s, this.f1028s);
                this.f1012c.setCompoundDrawables(this.f994D, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f1012c.setVisibility(0);
            z = true;
        } else {
            this.f1012c.setVisibility(8);
            z = false;
        }
        this.f1014e = (Button) viewGroup.findViewById(16908314);
        this.f1014e.setOnClickListener(this.f1009S);
        if (!TextUtils.isEmpty(this.f995E) || this.f996F != null) {
            this.f1014e.setText(this.f995E);
            if (this.f996F != null) {
                this.f996F.setBounds(0, 0, this.f1028s, this.f1028s);
                this.f1014e.setCompoundDrawables(this.f996F, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f1014e.setVisibility(0);
            z |= true;
        } else {
            this.f1014e.setVisibility(8);
        }
        this.f1016g = (Button) viewGroup.findViewById(16908315);
        this.f1016g.setOnClickListener(this.f1009S);
        if (!TextUtils.isEmpty(this.f997G) || this.f998H != null) {
            this.f1016g.setText(this.f997G);
            if (this.f994D != null) {
                this.f994D.setBounds(0, 0, this.f1028s, this.f1028s);
                this.f1012c.setCompoundDrawables(this.f994D, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f1016g.setVisibility(0);
            z |= true;
        } else {
            this.f1016g.setVisibility(8);
        }
        if (m1633a(this.f1026q)) {
            if (z) {
                m1632a(this.f1012c);
            } else if (z) {
                m1632a(this.f1014e);
            } else if (z) {
                m1632a(this.f1016g);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo1500a() {
        this.f1010a.setContentView(m1635b());
        m1637c();
    }

    /* renamed from: a */
    public void mo1501a(int i) {
        this.f1031v = null;
        this.f1032w = i;
        this.f992B = false;
    }

    /* renamed from: a */
    public void mo1502a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f1025p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f997G = charSequence;
                this.f1017h = message;
                this.f998H = drawable;
                return;
            case -2:
                this.f995E = charSequence;
                this.f1015f = message;
                this.f996F = drawable;
                return;
            case -1:
                this.f993C = charSequence;
                this.f1013d = message;
                this.f994D = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo1503a(Drawable drawable) {
        this.f1000J = drawable;
        this.f999I = 0;
        if (this.f1001K == null) {
            return;
        }
        if (drawable != null) {
            this.f1001K.setVisibility(0);
            this.f1001K.setImageDrawable(drawable);
            return;
        }
        this.f1001K.setVisibility(8);
    }

    /* renamed from: a */
    public void mo1504a(View view, int i, int i2, int i3, int i4) {
        this.f1031v = view;
        this.f1032w = 0;
        this.f992B = true;
        this.f1033x = i;
        this.f1034y = i2;
        this.f1035z = i3;
        this.f991A = i4;
    }

    /* renamed from: a */
    public void mo1505a(CharSequence charSequence) {
        this.f1029t = charSequence;
        if (this.f1002L != null) {
            this.f1002L.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo1506a(int i, KeyEvent keyEvent) {
        return this.f1018i != null && this.f1018i.mo1374a(keyEvent);
    }

    /* renamed from: b */
    public void mo1507b(int i) {
        this.f1000J = null;
        this.f999I = i;
        if (this.f1001K == null) {
            return;
        }
        if (i != 0) {
            this.f1001K.setVisibility(0);
            this.f1001K.setImageResource(this.f999I);
            return;
        }
        this.f1001K.setVisibility(8);
    }

    /* renamed from: b */
    public void mo1508b(View view) {
        this.f1004N = view;
    }

    /* renamed from: b */
    public void mo1509b(CharSequence charSequence) {
        this.f1030u = charSequence;
        if (this.f1003M != null) {
            this.f1003M.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean mo1510b(int i, KeyEvent keyEvent) {
        return this.f1018i != null && this.f1018i.mo1374a(keyEvent);
    }

    /* renamed from: c */
    public int mo1511c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1026q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: c */
    public void mo1512c(View view) {
        this.f1031v = view;
        this.f1032w = 0;
        this.f992B = false;
    }
}
