package p005a4;

import p041f3.C1924k;

/* renamed from: a4.f */
public final class C0031f {

    /* renamed from: a */
    public static final C0031f f120a = new C0031f();

    private C0031f() {
    }

    /* renamed from: b */
    public static final boolean m108b(String str) {
        C1924k.m9142h(str, "method");
        return !C1924k.m9136b(str, "GET") && !C1924k.m9136b(str, "HEAD");
    }

    /* renamed from: e */
    public static final boolean m109e(String str) {
        C1924k.m9142h(str, "method");
        return C1924k.m9136b(str, "POST") || C1924k.m9136b(str, "PUT") || C1924k.m9136b(str, "PATCH") || C1924k.m9136b(str, "PROPPATCH") || C1924k.m9136b(str, "REPORT");
    }

    /* renamed from: a */
    public final boolean mo70a(String str) {
        C1924k.m9142h(str, "method");
        return C1924k.m9136b(str, "POST") || C1924k.m9136b(str, "PATCH") || C1924k.m9136b(str, "PUT") || C1924k.m9136b(str, "DELETE") || C1924k.m9136b(str, "MOVE");
    }

    /* renamed from: c */
    public final boolean mo71c(String str) {
        C1924k.m9142h(str, "method");
        return !C1924k.m9136b(str, "PROPFIND");
    }

    /* renamed from: d */
    public final boolean mo72d(String str) {
        C1924k.m9142h(str, "method");
        return C1924k.m9136b(str, "PROPFIND");
    }
}
