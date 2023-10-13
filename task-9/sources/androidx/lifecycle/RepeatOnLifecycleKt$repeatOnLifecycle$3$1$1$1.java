package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import java.util.concurrent.CancellationException;
import p034e3.C1784p;
import p041f3.C1924k;
import p041f3.C1932s;
import p092n3.C2745h0;
import p092n3.C2749i0;
import p092n3.C2753j0;
import p092n3.C2761l;
import p092n3.C2777o1;
import p127t2.C3178l;
import p127t2.C3181m;
import p127t2.C3187s;
import p128t3.C3188a;
import p145w2.C3443d;
import p145w2.C3448g;
import p157y2.C3567f;
import p157y2.C3573k;

final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements C1002j {

    /* renamed from: d */
    final /* synthetic */ C0988f.C0989a f3371d;

    /* renamed from: e */
    final /* synthetic */ C1932s<C2777o1> f3372e;

    /* renamed from: f */
    final /* synthetic */ C2745h0 f3373f;

    /* renamed from: g */
    final /* synthetic */ C0988f.C0989a f3374g;

    /* renamed from: h */
    final /* synthetic */ C2761l<C3187s> f3375h;

    /* renamed from: i */
    final /* synthetic */ C3188a f3376i;

    /* renamed from: j */
    final /* synthetic */ C1784p<C2745h0, C3443d<? super C3187s>, Object> f3377j;

    @C3567f(mo11680c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", mo11681f = "RepeatOnLifecycle.kt", mo11682l = {171, 110}, mo11683m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a */
    static final class C0964a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        Object f3378h;

        /* renamed from: i */
        Object f3379i;

        /* renamed from: j */
        int f3380j;

        /* renamed from: k */
        final /* synthetic */ C3188a f3381k;

        /* renamed from: l */
        final /* synthetic */ C1784p<C2745h0, C3443d<? super C3187s>, Object> f3382l;

        @C3567f(mo11680c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", mo11681f = "RepeatOnLifecycle.kt", mo11682l = {111}, mo11683m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a */
        static final class C0965a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

            /* renamed from: h */
            int f3383h;

            /* renamed from: i */
            private /* synthetic */ Object f3384i;

            /* renamed from: j */
            final /* synthetic */ C1784p<C2745h0, C3443d<? super C3187s>, Object> f3385j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0965a(C1784p<? super C2745h0, ? super C3443d<? super C3187s>, ? extends Object> pVar, C3443d<? super C0965a> dVar) {
                super(2, dVar);
                this.f3385j = pVar;
            }

            /* renamed from: a */
            public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
                C0965a aVar = new C0965a(this.f3385j, dVar);
                aVar.f3384i = obj;
                return aVar;
            }

            /* renamed from: t */
            public final Object mo3736t(Object obj) {
                Object c = C3530d.m15553c();
                int i = this.f3383h;
                if (i == 0) {
                    C3181m.m14059b(obj);
                    C1784p<C2745h0, C3443d<? super C3187s>, Object> pVar = this.f3385j;
                    this.f3383h = 1;
                    if (pVar.mo3735l((C2745h0) this.f3384i, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C3181m.m14059b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C3187s.f10561a;
            }

            /* renamed from: w */
            public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
                return ((C0965a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0964a(C3188a aVar, C1784p<? super C2745h0, ? super C3443d<? super C3187s>, ? extends Object> pVar, C3443d<? super C0964a> dVar) {
            super(2, dVar);
            this.f3381k = aVar;
            this.f3382l = pVar;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C0964a(this.f3381k, this.f3382l, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Throwable th;
            C3188a aVar;
            C3188a aVar2;
            C1784p<C2745h0, C3443d<? super C3187s>, Object> pVar;
            Object c = C3530d.m15553c();
            int i = this.f3380j;
            if (i == 0) {
                C3181m.m14059b(obj);
                aVar2 = this.f3381k;
                pVar = this.f3382l;
                this.f3378h = aVar2;
                this.f3379i = pVar;
                this.f3380j = 1;
                if (aVar2.mo10553a((Object) null, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                pVar = (C1784p) this.f3379i;
                C3181m.m14059b(obj);
                aVar2 = (C3188a) this.f3378h;
            } else if (i == 2) {
                aVar = (C3188a) this.f3378h;
                try {
                    C3181m.m14059b(obj);
                    C3187s sVar = C3187s.f10561a;
                    aVar.mo10554b((Object) null);
                    return sVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C0965a aVar3 = new C0965a(pVar, (C3443d<? super C0965a>) null);
                this.f3378h = aVar2;
                this.f3379i = null;
                this.f3380j = 2;
                if (C2749i0.m12375b(aVar3, this) == c) {
                    return c;
                }
                aVar = aVar2;
                C3187s sVar2 = C3187s.f10561a;
                aVar.mo10554b((Object) null);
                return sVar2;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                aVar = aVar2;
                th = th4;
                aVar.mo10554b((Object) null);
                throw th;
            }
        }

        /* renamed from: w */
        public final Object mo3735l(C2745h0 h0Var, C3443d<? super C3187s> dVar) {
            return ((C0964a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    /* renamed from: j */
    public final void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        C1924k.m9141g(mVar, "<anonymous parameter 0>");
        C1924k.m9141g(aVar, "event");
        if (aVar == this.f3371d) {
            this.f3372e.f6903d = C2744h.m12366b(this.f3373f, (C3448g) null, (C2753j0) null, new C0964a(this.f3376i, this.f3377j, (C3443d<? super C0964a>) null), 3, (Object) null);
            return;
        }
        if (aVar == this.f3374g) {
            C2777o1 o1Var = (C2777o1) this.f3372e.f6903d;
            if (o1Var != null) {
                C2777o1.C2778a.m12478a(o1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f3372e.f6903d = null;
        }
        if (aVar == C0988f.C0989a.ON_DESTROY) {
            C2761l<C3187s> lVar = this.f3375h;
            C3178l.C3179a aVar2 = C3178l.f10555d;
            lVar.mo8960j(C3178l.m14054a(C3187s.f10561a));
        }
    }
}
