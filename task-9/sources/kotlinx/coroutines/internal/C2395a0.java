package kotlinx.coroutines.internal;

import p034e3.C1780l;
import p092n3.C2705a;
import p092n3.C2706a0;
import p092n3.C2777o1;
import p092n3.C2786r;
import p145w2.C3443d;
import p145w2.C3448g;
import p157y2.C3566e;

/* renamed from: kotlinx.coroutines.internal.a0 */
public class C2395a0<T> extends C2705a<T> implements C3566e {

    /* renamed from: f */
    public final C3443d<T> f8305f;

    public C2395a0(C3448g gVar, C3443d<? super T> dVar) {
        super(gVar, true, true);
        this.f8305f = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public void mo8944D0(Object obj) {
        C3443d<T> dVar = this.f8305f;
        dVar.mo8960j(C2706a0.m12281a(obj, dVar));
    }

    /* renamed from: H0 */
    public final C2777o1 mo8945H0() {
        C2786r Y = mo9570Y();
        if (Y != null) {
            return Y.getParent();
        }
        return null;
    }

    /* renamed from: e */
    public final C3566e mo8946e() {
        C3443d<T> dVar = this.f8305f;
        if (dVar instanceof C3566e) {
            return (C3566e) dVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public final boolean mo8947e0() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo8948y(Object obj) {
        C2411h.m11241c(C3527c.m15550b(this.f8305f), C2706a0.m12281a(obj, this.f8305f), (C1780l) null, 2, (Object) null);
    }
}
