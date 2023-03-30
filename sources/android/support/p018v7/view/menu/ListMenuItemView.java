package android.support.p018v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p006v4.p015g.C0249q;
import android.support.p018v7.p019a.C0353a;
import android.support.p018v7.view.menu.C0483p;
import android.support.p018v7.widget.C0575au;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C0483p.C0484a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    private C0469j f1446a;

    /* renamed from: b */
    private ImageView f1447b;

    /* renamed from: c */
    private RadioButton f1448c;

    /* renamed from: d */
    private TextView f1449d;

    /* renamed from: e */
    private CheckBox f1450e;

    /* renamed from: f */
    private TextView f1451f;

    /* renamed from: g */
    private ImageView f1452g;

    /* renamed from: h */
    private ImageView f1453h;

    /* renamed from: i */
    private LinearLayout f1454i;

    /* renamed from: j */
    private Drawable f1455j;

    /* renamed from: k */
    private int f1456k;

    /* renamed from: l */
    private Context f1457l;

    /* renamed from: m */
    private boolean f1458m;

    /* renamed from: n */
    private Drawable f1459n;

    /* renamed from: o */
    private boolean f1460o;

    /* renamed from: p */
    private int f1461p;

    /* renamed from: q */
    private LayoutInflater f1462q;

    /* renamed from: r */
    private boolean f1463r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0575au a = C0575au.m2819a(getContext(), attributeSet, C0353a.C0363j.MenuView, i, 0);
        this.f1455j = a.mo2958a(C0353a.C0363j.MenuView_android_itemBackground);
        this.f1456k = a.mo2971g(C0353a.C0363j.MenuView_android_itemTextAppearance, -1);
        this.f1458m = a.mo2960a(C0353a.C0363j.MenuView_preserveIconSpacing, false);
        this.f1457l = context;
        this.f1459n = a.mo2958a(C0353a.C0363j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0353a.C0354a.dropDownListViewStyle, 0);
        this.f1460o = obtainStyledAttributes.hasValue(0);
        a.mo2959a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m2130a(View view) {
        m2131a(view, -1);
    }

    /* renamed from: a */
    private void m2131a(View view, int i) {
        if (this.f1454i != null) {
            this.f1454i.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: b */
    private void m2132b() {
        this.f1447b = (ImageView) getInflater().inflate(C0353a.C0360g.abc_list_menu_item_icon, this, false);
        m2131a((View) this.f1447b, 0);
    }

    /* renamed from: c */
    private void m2133c() {
        this.f1448c = (RadioButton) getInflater().inflate(C0353a.C0360g.abc_list_menu_item_radio, this, false);
        m2130a(this.f1448c);
    }

    /* renamed from: d */
    private void m2134d() {
        this.f1450e = (CheckBox) getInflater().inflate(C0353a.C0360g.abc_list_menu_item_checkbox, this, false);
        m2130a(this.f1450e);
    }

    private LayoutInflater getInflater() {
        if (this.f1462q == null) {
            this.f1462q = LayoutInflater.from(getContext());
        }
        return this.f1462q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f1452g != null) {
            this.f1452g.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo1936a(C0469j jVar, int i) {
        this.f1446a = jVar;
        this.f1461p = i;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.mo2155a((C0483p.C0484a) this));
        setCheckable(jVar.isCheckable());
        mo1963a(jVar.mo2168f(), jVar.mo2164d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: a */
    public void mo1963a(boolean z, char c) {
        int i = (!z || !this.f1446a.mo2168f()) ? 8 : 0;
        if (i == 0) {
            this.f1451f.setText(this.f1446a.mo2166e());
        }
        if (this.f1451f.getVisibility() != i) {
            this.f1451f.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo1937a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.f1453h != null && this.f1453h.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1453h.getLayoutParams();
            rect.top = layoutParams.bottomMargin + this.f1453h.getHeight() + layoutParams.topMargin + rect.top;
        }
    }

    public C0469j getItemData() {
        return this.f1446a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0249q.m1052a((View) this, this.f1455j);
        this.f1449d = (TextView) findViewById(C0353a.C0359f.title);
        if (this.f1456k != -1) {
            this.f1449d.setTextAppearance(this.f1457l, this.f1456k);
        }
        this.f1451f = (TextView) findViewById(C0353a.C0359f.shortcut);
        this.f1452g = (ImageView) findViewById(C0353a.C0359f.submenuarrow);
        if (this.f1452g != null) {
            this.f1452g.setImageDrawable(this.f1459n);
        }
        this.f1453h = (ImageView) findViewById(C0353a.C0359f.group_divider);
        this.f1454i = (LinearLayout) findViewById(C0353a.C0359f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1447b != null && this.f1458m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1447b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1448c != null || this.f1450e != null) {
            if (this.f1446a.mo2169g()) {
                if (this.f1448c == null) {
                    m2133c();
                }
                compoundButton = this.f1448c;
                compoundButton2 = this.f1450e;
            } else {
                if (this.f1450e == null) {
                    m2134d();
                }
                compoundButton = this.f1450e;
                compoundButton2 = this.f1448c;
            }
            if (z) {
                compoundButton.setChecked(this.f1446a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f1450e != null) {
                this.f1450e.setVisibility(8);
            }
            if (this.f1448c != null) {
                this.f1448c.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1446a.mo2169g()) {
            if (this.f1448c == null) {
                m2133c();
            }
            compoundButton = this.f1448c;
        } else {
            if (this.f1450e == null) {
                m2134d();
            }
            compoundButton = this.f1450e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1463r = z;
        this.f1458m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        if (this.f1453h != null) {
            this.f1453h.setVisibility((this.f1460o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1446a.mo2184i() || this.f1463r;
        if (!z && !this.f1458m) {
            return;
        }
        if (this.f1447b != null || drawable != null || this.f1458m) {
            if (this.f1447b == null) {
                m2132b();
            }
            if (drawable != null || this.f1458m) {
                ImageView imageView = this.f1447b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f1447b.getVisibility() != 0) {
                    this.f1447b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f1447b.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1449d.setText(charSequence);
            if (this.f1449d.getVisibility() != 0) {
                this.f1449d.setVisibility(0);
            }
        } else if (this.f1449d.getVisibility() != 8) {
            this.f1449d.setVisibility(8);
        }
    }
}
