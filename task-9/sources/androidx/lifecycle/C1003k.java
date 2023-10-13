package androidx.lifecycle;

import p041f3.C1924k;
import p092n3.C2747h2;
import p092n3.C2777o1;
import p092n3.C2799v0;

/* renamed from: androidx.lifecycle.k */
public final class C1003k {
    /* renamed from: a */
    public static final C0995g m4471a(C0988f fVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C1924k.m9141g(fVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) fVar.mo3776c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(fVar, C2747h2.m12371b((C2777o1) null, 1, (Object) null).mo9535B(C2799v0.m12533c().mo9022d0()));
        } while (!fVar.mo3776c().compareAndSet((Object) null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.mo3732b();
        return lifecycleCoroutineScopeImpl;
    }
}
