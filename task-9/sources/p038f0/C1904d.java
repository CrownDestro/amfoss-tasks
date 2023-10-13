package p038f0;

import p038f0.C1899a;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: f0.d */
public final class C1904d extends C1899a {
    public C1904d() {
        this((C1899a) null, 1, (C1920g) null);
    }

    public C1904d(C1899a aVar) {
        C1924k.m9141g(aVar, "initialExtras");
        mo7619a().putAll(aVar.mo7619a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1904d(C1899a aVar, int i, C1920g gVar) {
        this((i & 1) != 0 ? C1899a.C1900a.f6872b : aVar);
    }

    /* renamed from: b */
    public final <T> void mo7622b(C1899a.C1901b<T> bVar, T t) {
        C1924k.m9141g(bVar, "key");
        mo7619a().put(bVar, t);
    }
}
