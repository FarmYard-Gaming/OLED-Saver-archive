package android.support.p018v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p018v7.app.AlertController;
import android.support.p018v7.p019a.C0353a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.app.b */
public class C0382b extends C0405g implements DialogInterface {

    /* renamed from: a */
    final AlertController f1116a = new AlertController(getContext(), this, getWindow());

    /* renamed from: android.support.v7.app.b$a */
    public static class C0383a {

        /* renamed from: a */
        private final AlertController.C0369a f1117a;

        /* renamed from: b */
        private final int f1118b;

        public C0383a(Context context) {
            this(context, C0382b.m1703a(context, 0));
        }

        public C0383a(Context context, int i) {
            this.f1117a = new AlertController.C0369a(new ContextThemeWrapper(context, C0382b.m1703a(context, i)));
            this.f1118b = i;
        }

        /* renamed from: a */
        public Context mo1573a() {
            return this.f1117a.f1067a;
        }

        /* renamed from: a */
        public C0383a mo1574a(DialogInterface.OnKeyListener onKeyListener) {
            this.f1117a.f1087u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0383a mo1575a(Drawable drawable) {
            this.f1117a.f1070d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0383a mo1576a(View view) {
            this.f1117a.f1073g = view;
            return this;
        }

        /* renamed from: a */
        public C0383a mo1577a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.f1117a.f1089w = listAdapter;
            this.f1117a.f1090x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0383a mo1578a(CharSequence charSequence) {
            this.f1117a.f1072f = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0382b mo1579b() {
            C0382b bVar = new C0382b(this.f1117a.f1067a, this.f1118b);
            this.f1117a.mo1519a(bVar.f1116a);
            bVar.setCancelable(this.f1117a.f1084r);
            if (this.f1117a.f1084r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f1117a.f1085s);
            bVar.setOnDismissListener(this.f1117a.f1086t);
            if (this.f1117a.f1087u != null) {
                bVar.setOnKeyListener(this.f1117a.f1087u);
            }
            return bVar;
        }
    }

    protected C0382b(Context context, int i) {
        super(context, m1703a(context, i));
    }

    /* renamed from: a */
    static int m1703a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0353a.C0354a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1116a.mo1500a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1116a.mo1506a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1116a.mo1510b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1116a.mo1505a(charSequence);
    }
}
