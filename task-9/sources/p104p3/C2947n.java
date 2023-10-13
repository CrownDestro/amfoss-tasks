package p104p3;

import kotlinx.coroutines.internal.C2399c0;
import p034e3.C1780l;
import p127t2.C3187s;

/* renamed from: p3.n */
public class C2947n<E> extends C2924a<E> {
    public C2947n(C1780l<? super E, C3187s> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo10115i(E e) {
        C2950q<?> k;
        do {
            Object i = super.mo10115i(e);
            C2399c0 c0Var = C2929b.f9678b;
            if (i == c0Var) {
                return c0Var;
            }
            if (i == C2929b.f9679c) {
                k = mo10117k(e);
                if (k == null) {
                    return c0Var;
                }
            } else if (i instanceof C2943j) {
                return i;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + i).toString());
            }
        } while (!(k instanceof C2943j));
        return k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo10097r() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo10098s() {
        return true;
    }
}
