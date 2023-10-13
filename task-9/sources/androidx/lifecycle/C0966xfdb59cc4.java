package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import p034e3.C1769a;
import p041f3.C1924k;
import p092n3.C2761l;
import p127t2.C3178l;
import p127t2.C3181m;

/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
public final class C0966xfdb59cc4 implements C1002j {

    /* renamed from: d */
    final /* synthetic */ C0988f.C0993b f3391d;

    /* renamed from: e */
    final /* synthetic */ C0988f f3392e;

    /* renamed from: f */
    final /* synthetic */ C2761l<Object> f3393f;

    /* renamed from: g */
    final /* synthetic */ C1769a<Object> f3394g;

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        Object obj;
        C2761l<Object> lVar;
        C0997h th;
        C1924k.m9141g(mVar, "source");
        C1924k.m9141g(aVar, "event");
        if (aVar == C0988f.C0989a.Companion.mo3781c(this.f3391d)) {
            this.f3392e.mo3777d(this);
            lVar = this.f3393f;
            C1769a<Object> aVar2 = this.f3394g;
            try {
                C3178l.C3179a aVar3 = C3178l.f10555d;
                obj = C3178l.m14054a(aVar2.mo3839c());
            } catch (Throwable th2) {
                th = th2;
                C3178l.C3179a aVar4 = C3178l.f10555d;
            }
        } else if (aVar == C0988f.C0989a.ON_DESTROY) {
            this.f3392e.mo3777d(this);
            lVar = this.f3393f;
            C3178l.C3179a aVar5 = C3178l.f10555d;
            th = new C0997h();
            obj = C3178l.m14054a(C3181m.m14058a(th));
        } else {
            return;
        }
        lVar.mo8960j(obj);
    }
}
