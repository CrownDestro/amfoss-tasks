package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import java.util.concurrent.CancellationException;
import p034e3.C1784p;
import p041f3.C1924k;
import p092n3.C2745h0;
import p092n3.C2753j0;
import p092n3.C2777o1;
import p092n3.C2799v0;
import p127t2.C3181m;
import p127t2.C3187s;
import p145w2.C3443d;
import p145w2.C3448g;
import p157y2.C3567f;
import p157y2.C3573k;

public final class LifecycleCoroutineScopeImpl extends C0995g implements C1002j {

    /* renamed from: d */
    private final C0988f f3345d;

    /* renamed from: e */
    private final C3448g f3346e;

    @C3567f(mo11680c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", mo11681f = "Lifecycle.kt", mo11682l = {}, mo11683m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    static final class C0960a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f3347h;

        /* renamed from: i */
        private /* synthetic */ Object f3348i;

        /* renamed from: j */
        final /* synthetic */ LifecycleCoroutineScopeImpl f3349j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0960a(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, C3443d<? super C0960a> dVar) {
            super(2, dVar);
            this.f3349j = lifecycleCoroutineScopeImpl;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            C0960a aVar = new C0960a(this.f3349j, dVar);
            aVar.f3348i = obj;
            return aVar;
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object unused = C3530d.m15553c();
            if (this.f3347h == 0) {
                C3181m.m14059b(obj);
                C2745h0 h0Var = (C2745h0) this.f3348i;
                if (this.f3349j.mo3731a().mo3775b().compareTo(C0988f.C0993b.INITIALIZED) >= 0) {
                    this.f3349j.mo3731a().mo3774a(this.f3349j);
                } else {
                    C2797u1.m12524d(h0Var.mo3733l(), (CancellationException) null, 1, (Object) null);
                }
                return C3187s.f10561a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C0960a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    public LifecycleCoroutineScopeImpl(C0988f fVar, C3448g gVar) {
        C1924k.m9141g(fVar, "lifecycle");
        C1924k.m9141g(gVar, "coroutineContext");
        this.f3345d = fVar;
        this.f3346e = gVar;
        if (mo3731a().mo3775b() == C0988f.C0993b.DESTROYED) {
            C2797u1.m12524d(mo3733l(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: a */
    public C0988f mo3731a() {
        return this.f3345d;
    }

    /* renamed from: b */
    public final void mo3732b() {
        C2777o1 unused = C2744h.m12366b(this, C2799v0.m12533c().mo9022d0(), (C2753j0) null, new C0960a(this, (C3443d<? super C0960a>) null), 2, (Object) null);
    }

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        C1924k.m9141g(mVar, "source");
        C1924k.m9141g(aVar, "event");
        if (mo3731a().mo3775b().compareTo(C0988f.C0993b.DESTROYED) <= 0) {
            mo3731a().mo3777d(this);
            C2797u1.m12524d(mo3733l(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: l */
    public C3448g mo3733l() {
        return this.f3346e;
    }
}
