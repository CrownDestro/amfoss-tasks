package p116r3;

import kotlinx.coroutines.internal.C2395a0;
import p034e3.C1784p;
import p041f3.C1925l;
import p092n3.C2777o1;
import p145w2.C3448g;

/* renamed from: r3.e */
public final class C3088e {

    /* renamed from: r3.e$a */
    static final class C3089a extends C1925l implements C1784p<Integer, C3448g.C3451b, Integer> {

        /* renamed from: e */
        final /* synthetic */ C3084c<?> f10014e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3089a(C3084c<?> cVar) {
            super(2);
            this.f10014e = cVar;
        }

        /* renamed from: a */
        public final Integer mo10413a(int i, C3448g.C3451b bVar) {
            C3448g.C3453c key = bVar.getKey();
            C3448g.C3451b c = this.f10014e.f10007h.mo9484c(key);
            if (key != C2777o1.f9077b) {
                return Integer.valueOf(bVar != c ? Integer.MIN_VALUE : i + 1);
            }
            C2777o1 o1Var = (C2777o1) c;
            C2777o1 b = C3088e.m13838b((C2777o1) bVar, o1Var);
            if (b == o1Var) {
                if (o1Var != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + o1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ Object mo3735l(Object obj, Object obj2) {
            return mo10413a(((Number) obj).intValue(), (C3448g.C3451b) obj2);
        }
    }

    /* renamed from: a */
    public static final void m13837a(C3084c<?> cVar, C3448g gVar) {
        if (((Number) gVar.mo9537n(0, new C3089a(cVar))).intValue() != cVar.f10008i) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f10007h + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    /* renamed from: b */
    public static final C2777o1 m13838b(C2777o1 o1Var, C2777o1 o1Var2) {
        while (o1Var != null) {
            if (o1Var == o1Var2 || !(o1Var instanceof C2395a0)) {
                return o1Var;
            }
            o1Var = ((C2395a0) o1Var).mo8945H0();
        }
        return null;
    }
}
