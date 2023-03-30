package android.support.p018v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
class C0585b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f2138a;

    public C0585b(ActionBarContainer actionBarContainer) {
        this.f2138a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f2138a.f1667d) {
            if (this.f2138a.f1664a != null) {
                this.f2138a.f1664a.draw(canvas);
            }
            if (this.f2138a.f1665b != null && this.f2138a.f1668e) {
                this.f2138a.f1665b.draw(canvas);
            }
        } else if (this.f2138a.f1666c != null) {
            this.f2138a.f1666c.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        if (this.f2138a.f1667d) {
            if (this.f2138a.f1666c != null) {
                this.f2138a.f1666c.getOutline(outline);
            }
        } else if (this.f2138a.f1664a != null) {
            this.f2138a.f1664a.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
