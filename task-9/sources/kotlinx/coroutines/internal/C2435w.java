package kotlinx.coroutines.internal;

import p034e3.C1780l;
import p041f3.C1925l;
import p092n3.C2741g0;
import p127t2.C3187s;
import p145w2.C3448g;

/* renamed from: kotlinx.coroutines.internal.w */
public final class C2435w {

    /* renamed from: kotlinx.coroutines.internal.w$a */
    static final class C2436a extends C1925l implements C1780l<Throwable, C3187s> {

        /* renamed from: e */
        final /* synthetic */ C1780l<E, C3187s> f8364e;

        /* renamed from: f */
        final /* synthetic */ E f8365f;

        /* renamed from: g */
        final /* synthetic */ C3448g f8366g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2436a(C1780l<? super E, C3187s> lVar, E e, C3448g gVar) {
            super(1);
            this.f8364e = lVar;
            this.f8365f = e;
            this.f8366g = gVar;
        }

        /* renamed from: a */
        public final void mo9026a(Throwable th) {
            C2435w.m11333b(this.f8364e, this.f8365f, this.f8366g);
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo3836n(Object obj) {
            mo9026a((Throwable) obj);
            return C3187s.f10561a;
        }
    }

    /* renamed from: a */
    public static final <E> C1780l<Throwable, C3187s> m11332a(C1780l<? super E, C3187s> lVar, E e, C3448g gVar) {
        return new C2436a(lVar, e, gVar);
    }

    /* renamed from: b */
    public static final <E> void m11333b(C1780l<? super E, C3187s> lVar, E e, C3448g gVar) {
        C2418k0 c = m11334c(lVar, e, (C2418k0) null);
        if (c != null) {
            C2741g0.m12357a(gVar, c);
        }
    }

    /* renamed from: c */
    public static final <E> C2418k0 m11334c(C1780l<? super E, C3187s> lVar, E e, C2418k0 k0Var) {
        try {
            lVar.mo3836n(e);
        } catch (Throwable th) {
            if (k0Var == null || k0Var.getCause() == th) {
                return new C2418k0("Exception in undelivered element handler for " + e, th);
            }
            C3168b.m14046a(k0Var, th);
        }
        return k0Var;
    }

    /* renamed from: d */
    public static /* synthetic */ C2418k0 m11335d(C1780l lVar, Object obj, C2418k0 k0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            k0Var = null;
        }
        return m11334c(lVar, obj, k0Var);
    }
}
