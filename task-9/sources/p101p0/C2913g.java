package p101p0;

import p034e3.C1780l;
import p041f3.C1924k;
import p101p0.C2910f;

/* renamed from: p0.g */
final class C2913g<T> extends C2910f<T> {

    /* renamed from: b */
    private final T f9650b;

    /* renamed from: c */
    private final String f9651c;

    /* renamed from: d */
    private final C2910f.C2912b f9652d;

    /* renamed from: e */
    private final C2909e f9653e;

    public C2913g(T t, String str, C2910f.C2912b bVar, C2909e eVar) {
        C1924k.m9141g(t, "value");
        C1924k.m9141g(str, "tag");
        C1924k.m9141g(bVar, "verificationMode");
        C1924k.m9141g(eVar, "logger");
        this.f9650b = t;
        this.f9651c = str;
        this.f9652d = bVar;
        this.f9653e = eVar;
    }

    /* renamed from: a */
    public T mo10077a() {
        return this.f9650b;
    }

    /* renamed from: c */
    public C2910f<T> mo10078c(String str, C1780l<? super T, Boolean> lVar) {
        C1924k.m9141g(str, "message");
        C1924k.m9141g(lVar, "condition");
        if (lVar.mo3836n(this.f9650b).booleanValue()) {
            return this;
        }
        return new C2907d(this.f9650b, this.f9651c, str, this.f9653e, this.f9652d);
    }
}
