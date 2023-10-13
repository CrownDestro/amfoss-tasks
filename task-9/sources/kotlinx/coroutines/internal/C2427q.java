package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.q */
public class C2427q<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f8348a = AtomicReferenceFieldUpdater.newUpdater(C2427q.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C2427q(boolean z) {
        this._cur = new C2428r(8, z);
    }

    /* renamed from: a */
    public final boolean mo9004a(E e) {
        while (true) {
            C2428r rVar = (C2428r) this._cur;
            int a = rVar.mo9008a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C2398c.m11194a(f8348a, this, rVar, rVar.mo9012i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo9005b() {
        while (true) {
            C2428r rVar = (C2428r) this._cur;
            if (!rVar.mo9009d()) {
                C2398c.m11194a(f8348a, this, rVar, rVar.mo9012i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo9006c() {
        return ((C2428r) this._cur).mo9010f();
    }

    /* renamed from: d */
    public final E mo9007d() {
        while (true) {
            C2428r rVar = (C2428r) this._cur;
            E j = rVar.mo9013j();
            if (j != C2428r.f8352h) {
                return j;
            }
            C2398c.m11194a(f8348a, this, rVar, rVar.mo9012i());
        }
    }
}
