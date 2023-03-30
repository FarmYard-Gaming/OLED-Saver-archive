package android.support.p004b.p005a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p006v4.graphics.drawable.C0270a;
import android.support.p006v4.p007a.p008a.C0083g;
import android.support.p006v4.p014f.C0199a;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.b.a.c */
public class C0048c extends C0057h implements C0047b {

    /* renamed from: a */
    ArrayList<Object> f88a;

    /* renamed from: b */
    final Drawable.Callback f89b;

    /* renamed from: d */
    private C0050a f90d;

    /* renamed from: e */
    private Context f91e;

    /* renamed from: f */
    private ArgbEvaluator f92f;

    /* renamed from: g */
    private Animator.AnimatorListener f93g;

    /* renamed from: android.support.b.a.c$a */
    private static class C0050a extends Drawable.ConstantState {

        /* renamed from: a */
        int f95a;

        /* renamed from: b */
        C0058i f96b;

        /* renamed from: c */
        AnimatorSet f97c;

        /* renamed from: d */
        ArrayList<Animator> f98d;

        /* renamed from: e */
        C0199a<Animator, String> f99e;

        public C0050a(Context context, C0050a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f95a = aVar.f95a;
                if (aVar.f96b != null) {
                    Drawable.ConstantState constantState = aVar.f96b.getConstantState();
                    if (resources != null) {
                        this.f96b = (C0058i) constantState.newDrawable(resources);
                    } else {
                        this.f96b = (C0058i) constantState.newDrawable();
                    }
                    this.f96b = (C0058i) this.f96b.mutate();
                    this.f96b.setCallback(callback);
                    this.f96b.setBounds(aVar.f96b.getBounds());
                    this.f96b.mo148a(false);
                }
                if (aVar.f98d != null) {
                    int size = aVar.f98d.size();
                    this.f98d = new ArrayList<>(size);
                    this.f99e = new C0199a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.f98d.get(i);
                        Animator clone = animator.clone();
                        String str = aVar.f99e.get(animator);
                        clone.setTarget(this.f96b.mo147a(str));
                        this.f98d.add(clone);
                        this.f99e.put(clone, str);
                    }
                    mo133a();
                }
            }
        }

        /* renamed from: a */
        public void mo133a() {
            if (this.f97c == null) {
                this.f97c = new AnimatorSet();
            }
            this.f97c.playTogether(this.f98d);
        }

        public int getChangingConfigurations() {
            return this.f95a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: android.support.b.a.c$b */
    private static class C0051b extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f100a;

        public C0051b(Drawable.ConstantState constantState) {
            this.f100a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f100a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f100a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0048c cVar = new C0048c();
            cVar.f105c = this.f100a.newDrawable();
            cVar.f105c.setCallback(cVar.f89b);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0048c cVar = new C0048c();
            cVar.f105c = this.f100a.newDrawable(resources);
            cVar.f105c.setCallback(cVar.f89b);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0048c cVar = new C0048c();
            cVar.f105c = this.f100a.newDrawable(resources, theme);
            cVar.f105c.setCallback(cVar.f89b);
            return cVar;
        }
    }

    C0048c() {
        this((Context) null, (C0050a) null, (Resources) null);
    }

    private C0048c(Context context) {
        this(context, (C0050a) null, (Resources) null);
    }

    private C0048c(Context context, C0050a aVar, Resources resources) {
        this.f92f = null;
        this.f93g = null;
        this.f88a = null;
        this.f89b = new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                C0048c.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0048c.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0048c.this.unscheduleSelf(runnable);
            }
        };
        this.f91e = context;
        if (aVar != null) {
            this.f90d = aVar;
        } else {
            this.f90d = new C0050a(context, aVar, this.f89b, resources);
        }
    }

    /* renamed from: a */
    public static C0048c m132a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0048c cVar = new C0048c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: a */
    private void m133a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childAnimations.size()) {
                    break;
                }
                m133a(childAnimations.get(i2));
                i = i2 + 1;
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f92f == null) {
                    this.f92f = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f92f);
            }
        }
    }

    /* renamed from: a */
    private void m134a(String str, Animator animator) {
        animator.setTarget(this.f90d.f96b.mo147a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m133a(animator);
        }
        if (this.f90d.f98d == null) {
            this.f90d.f98d = new ArrayList<>();
            this.f90d.f99e = new C0199a<>();
        }
        this.f90d.f98d.add(animator);
        this.f90d.f99e.put(animator, str);
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.f105c != null) {
            C0270a.m1157a(this.f105c, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.f105c != null) {
            return C0270a.m1164d(this.f105c);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.f105c != null) {
            this.f105c.draw(canvas);
            return;
        }
        this.f90d.f96b.draw(canvas);
        if (this.f90d.f97c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f105c != null ? C0270a.m1163c(this.f105c) : this.f90d.f96b.getAlpha();
    }

    public int getChangingConfigurations() {
        return this.f105c != null ? this.f105c.getChangingConfigurations() : super.getChangingConfigurations() | this.f90d.f95a;
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f105c == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0051b(this.f105c.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f105c != null ? this.f105c.getIntrinsicHeight() : this.f90d.f96b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f105c != null ? this.f105c.getIntrinsicWidth() : this.f90d.f96b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f105c != null ? this.f105c.getOpacity() : this.f90d.f96b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f105c != null) {
            C0270a.m1158a(this.f105c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0083g.m263a(resources, theme, attributeSet, C0046a.f80e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0058i a2 = C0058i.m165a(resources, resourceId, theme);
                        a2.mo148a(false);
                        a2.setCallback(this.f89b);
                        if (this.f90d.f96b != null) {
                            this.f90d.f96b.setCallback((Drawable.Callback) null);
                        }
                        this.f90d.f96b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0046a.f81f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f91e != null) {
                            m134a(string, C0053e.m140a(this.f91e, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f90d.mo133a();
    }

    public boolean isAutoMirrored() {
        return this.f105c != null ? C0270a.m1161b(this.f105c) : this.f90d.f96b.isAutoMirrored();
    }

    public boolean isRunning() {
        return this.f105c != null ? ((AnimatedVectorDrawable) this.f105c).isRunning() : this.f90d.f97c.isRunning();
    }

    public boolean isStateful() {
        return this.f105c != null ? this.f105c.isStateful() : this.f90d.f96b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f105c != null) {
            this.f105c.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f105c != null) {
            this.f105c.setBounds(rect);
        } else {
            this.f90d.f96b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f105c != null ? this.f105c.setLevel(i) : this.f90d.f96b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f105c != null ? this.f105c.setState(iArr) : this.f90d.f96b.setState(iArr);
    }

    public void setAlpha(int i) {
        if (this.f105c != null) {
            this.f105c.setAlpha(i);
        } else {
            this.f90d.f96b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f105c != null) {
            C0270a.m1160a(this.f105c, z);
        } else {
            this.f90d.f96b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f105c != null) {
            this.f105c.setColorFilter(colorFilter);
        } else {
            this.f90d.f96b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.f105c != null) {
            C0270a.m1154a(this.f105c, i);
        } else {
            this.f90d.f96b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f105c != null) {
            C0270a.m1156a(this.f105c, colorStateList);
        } else {
            this.f90d.f96b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f105c != null) {
            C0270a.m1159a(this.f105c, mode);
        } else {
            this.f90d.f96b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f105c != null) {
            return this.f105c.setVisible(z, z2);
        }
        this.f90d.f96b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        if (this.f105c != null) {
            ((AnimatedVectorDrawable) this.f105c).start();
        } else if (!this.f90d.f97c.isStarted()) {
            this.f90d.f97c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f105c != null) {
            ((AnimatedVectorDrawable) this.f105c).stop();
        } else {
            this.f90d.f97c.end();
        }
    }
}
