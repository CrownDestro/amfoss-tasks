package kotlinx.coroutines.internal;

import java.util.List;
import p092n3.C2815z1;
import p127t2.C3170d;

/* renamed from: kotlinx.coroutines.internal.u */
public final class C2433u {

    /* renamed from: a */
    private static final boolean f8361a = true;

    /* renamed from: a */
    private static final C2434v m11320a(Throwable th, String str) {
        if (f8361a) {
            return new C2434v(th, str);
        }
        if (th != null) {
            throw th;
        }
        m11323d();
        throw new C3170d();
    }

    /* renamed from: b */
    static /* synthetic */ C2434v m11321b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m11320a(th, str);
    }

    /* renamed from: c */
    public static final boolean m11322c(C2815z1 z1Var) {
        return z1Var.mo9022d0() instanceof C2434v;
    }

    /* renamed from: d */
    public static final Void m11323d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final C2815z1 m11324e(C2431s sVar, List<? extends C2431s> list) {
        try {
            return sVar.mo9020c(list);
        } catch (Throwable th) {
            return m11320a(th, sVar.mo9019b());
        }
    }
}
