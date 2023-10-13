package p043f5;

import p036e5.C1828f;
import p062i4.C2114h;
import p062i4.C2115i;
import p108q1.C2978f;
import p108q1.C2985h;
import p108q1.C2988k;
import p134u3.C3320g0;

/* renamed from: f5.c */
final class C1958c<T> implements C1828f<C3320g0, T> {

    /* renamed from: b */
    private static final C2115i f6939b = C2115i.m9780c("EFBBBF");

    /* renamed from: a */
    private final C2978f<T> f6940a;

    C1958c(C2978f<T> fVar) {
        this.f6940a = fVar;
    }

    /* renamed from: b */
    public T mo7505a(C3320g0 g0Var) {
        C2114h i = g0Var.mo86i();
        try {
            C2115i iVar = f6939b;
            if (i.mo7945o(0, iVar)) {
                i.mo7963v((long) iVar.mo7999u());
            }
            C2988k H = C2988k.m13476H(i);
            T b = this.f6940a.mo10197b(H);
            if (H.mo10229J() == C2988k.C2990b.END_DOCUMENT) {
                return b;
            }
            throw new C2985h("JSON document was not fully consumed.");
        } finally {
            g0Var.close();
        }
    }
}
