package p104p3;

import kotlinx.coroutines.internal.C2399c0;
import kotlinx.coroutines.internal.C2423p;
import p092n3.C2763l0;
import p092n3.C2770n;

/* renamed from: p3.j */
public final class C2943j<E> extends C2952s implements C2950q<E> {

    /* renamed from: g */
    public final Throwable f9703g;

    /* renamed from: C */
    public void mo10120C() {
    }

    /* renamed from: E */
    public C2399c0 mo10122E(C2423p.C2425b bVar) {
        return C2770n.f9071a;
    }

    /* renamed from: G */
    public C2943j<E> mo10134d() {
        return this;
    }

    /* renamed from: H */
    public C2943j<E> mo10121D() {
        return this;
    }

    /* renamed from: I */
    public final Throwable mo10132I() {
        Throwable th = this.f9703g;
        return th == null ? new C2944k("Channel was closed") : th;
    }

    /* renamed from: J */
    public final Throwable mo10133J() {
        Throwable th = this.f9703g;
        return th == null ? new C2945l("Channel was closed") : th;
    }

    /* renamed from: g */
    public C2399c0 mo10107g(E e, C2423p.C2425b bVar) {
        return C2770n.f9071a;
    }

    /* renamed from: i */
    public void mo10108i(E e) {
    }

    public String toString() {
        return "Closed@" + C2763l0.m12400b(this) + '[' + this.f9703g + ']';
    }
}
