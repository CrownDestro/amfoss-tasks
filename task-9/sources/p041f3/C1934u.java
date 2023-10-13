package p041f3;

import p074k3.C2385b;
import p074k3.C2386c;
import p074k3.C2387d;
import p074k3.C2388e;

/* renamed from: f3.u */
public class C1934u {
    /* renamed from: a */
    public C2387d mo7675a(C1922i iVar) {
        return iVar;
    }

    /* renamed from: b */
    public C2385b mo7676b(Class cls) {
        return new C1917e(cls);
    }

    /* renamed from: c */
    public C2386c mo7677c(Class cls, String str) {
        return new C1926m(cls, str);
    }

    /* renamed from: d */
    public C2388e mo7678d(C1927n nVar) {
        return nVar;
    }

    /* renamed from: e */
    public String mo7679e(C1921h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: f */
    public String mo7680f(C1925l lVar) {
        return mo7679e(lVar);
    }
}
