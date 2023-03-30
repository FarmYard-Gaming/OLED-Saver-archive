package android.support.p018v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p018v7.p019a.C0353a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.v */
public class C0624v extends SeekBar {

    /* renamed from: a */
    private final C0625w f2249a;

    public C0624v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0353a.C0354a.seekBarStyle);
    }

    public C0624v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2249a = new C0625w(this);
        this.f2249a.mo3135a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2249a.mo3148c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2249a.mo3147b();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2249a.mo3145a(canvas);
    }
}
