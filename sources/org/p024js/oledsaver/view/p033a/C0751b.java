package org.p024js.oledsaver.view.p033a;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import org.p024js.oledsaver.view.p033a.C0760g;

/* renamed from: org.js.oledsaver.view.a.b */
class C0751b {
    /* renamed from: a */
    static Rect m3562a(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        iArr[0] = 0;
        rect.set(iArr[0], iArr[1], iArr[0] + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
        rect.offset(-i, -i2);
        return rect;
    }

    /* renamed from: a */
    static View m3563a(LayoutInflater layoutInflater, C0752c cVar) {
        View a = cVar.mo3571a(layoutInflater);
        C0760g.C0761a aVar = new C0760g.C0761a(-2, -2);
        aVar.f2741c = cVar.mo3573c();
        aVar.f2742d = cVar.mo3574d();
        aVar.f2739a = cVar.mo3570a();
        aVar.f2740b = cVar.mo3572b();
        a.setLayoutParams(aVar);
        return a;
    }
}
