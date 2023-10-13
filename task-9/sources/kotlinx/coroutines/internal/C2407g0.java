package kotlinx.coroutines.internal;

import java.util.Objects;
import p034e3.C1784p;
import p041f3.C1924k;
import p041f3.C1925l;
import p092n3.C2751i2;
import p145w2.C3448g;

/* renamed from: kotlinx.coroutines.internal.g0 */
public final class C2407g0 {

    /* renamed from: a */
    public static final C2399c0 f8320a = new C2399c0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C1784p<Object, C3448g.C3451b, Object> f8321b = C2408a.f8324e;

    /* renamed from: c */
    private static final C1784p<C2751i2<?>, C3448g.C3451b, C2751i2<?>> f8322c = C2409b.f8325e;

    /* renamed from: d */
    private static final C1784p<C2416j0, C3448g.C3451b, C2416j0> f8323d = C2410c.f8326e;

    /* renamed from: kotlinx.coroutines.internal.g0$a */
    static final class C2408a extends C1925l implements C1784p<Object, C3448g.C3451b, Object> {

        /* renamed from: e */
        public static final C2408a f8324e = new C2408a();

        C2408a() {
            super(2);
        }

        /* renamed from: a */
        public final Object mo3735l(Object obj, C3448g.C3451b bVar) {
            if (!(bVar instanceof C2751i2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g0$b */
    static final class C2409b extends C1925l implements C1784p<C2751i2<?>, C3448g.C3451b, C2751i2<?>> {

        /* renamed from: e */
        public static final C2409b f8325e = new C2409b();

        C2409b() {
            super(2);
        }

        /* renamed from: a */
        public final C2751i2<?> mo3735l(C2751i2<?> i2Var, C3448g.C3451b bVar) {
            if (i2Var != null) {
                return i2Var;
            }
            if (bVar instanceof C2751i2) {
                return (C2751i2) bVar;
            }
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g0$c */
    static final class C2410c extends C1925l implements C1784p<C2416j0, C3448g.C3451b, C2416j0> {

        /* renamed from: e */
        public static final C2410c f8326e = new C2410c();

        C2410c() {
            super(2);
        }

        /* renamed from: a */
        public final C2416j0 mo3735l(C2416j0 j0Var, C3448g.C3451b bVar) {
            if (bVar instanceof C2751i2) {
                C2751i2 i2Var = (C2751i2) bVar;
                j0Var.mo8986a(i2Var, i2Var.mo9501T(j0Var.f8332a));
            }
            return j0Var;
        }
    }

    /* renamed from: a */
    public static final void m11230a(C3448g gVar, Object obj) {
        if (obj != f8320a) {
            if (obj instanceof C2416j0) {
                ((C2416j0) obj).mo8987b(gVar);
                return;
            }
            Object n = gVar.mo9537n(null, f8322c);
            Objects.requireNonNull(n, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((C2751i2) n).mo9502k(gVar, obj);
        }
    }

    /* renamed from: b */
    public static final Object m11231b(C3448g gVar) {
        Object n = gVar.mo9537n(0, f8321b);
        C1924k.m9138d(n);
        return n;
    }

    /* renamed from: c */
    public static final Object m11232c(C3448g gVar, Object obj) {
        if (obj == null) {
            obj = m11231b(gVar);
        }
        return obj == 0 ? f8320a : obj instanceof Integer ? gVar.mo9537n(new C2416j0(gVar, ((Number) obj).intValue()), f8323d) : ((C2751i2) obj).mo9501T(gVar);
    }
}
