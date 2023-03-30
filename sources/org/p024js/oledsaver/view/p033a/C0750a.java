package org.p024js.oledsaver.view.p033a;

/* renamed from: org.js.oledsaver.view.a.a */
class C0750a extends RuntimeException {

    /* renamed from: a */
    private final String f2689a;

    public C0750a() {
        this.f2689a = "General error.";
    }

    public C0750a(String str) {
        this.f2689a = str;
    }

    public String getMessage() {
        return "Build GuideFragment failed: " + this.f2689a;
    }
}
