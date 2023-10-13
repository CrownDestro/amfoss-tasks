package p107q0;

import android.app.Activity;
import androidx.core.util.C0604a;
import androidx.window.layout.C1232q;
import androidx.window.layout.C1240v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p034e3.C1784p;
import p041f3.C1924k;
import p092n3.C2745h0;
import p092n3.C2746h1;
import p092n3.C2749i0;
import p092n3.C2753j0;
import p092n3.C2777o1;
import p110q3.C3030b;
import p110q3.C3031c;
import p127t2.C3181m;
import p127t2.C3187s;
import p145w2.C3443d;
import p145w2.C3448g;
import p157y2.C3567f;
import p157y2.C3573k;

/* renamed from: q0.a */
public final class C2960a implements C1232q {

    /* renamed from: b */
    private final C1232q f9754b;

    /* renamed from: c */
    private final ReentrantLock f9755c = new ReentrantLock();

    /* renamed from: d */
    private final Map<C0604a<?>, C2777o1> f9756d = new LinkedHashMap();

    @C3567f(mo11680c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", mo11681f = "WindowInfoTrackerCallbackAdapter.kt", mo11682l = {96}, mo11683m = "invokeSuspend")
    /* renamed from: q0.a$a */
    static final class C2961a extends C3573k implements C1784p<C2745h0, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        int f9757h;

        /* renamed from: i */
        final /* synthetic */ C3030b<T> f9758i;

        /* renamed from: j */
        final /* synthetic */ C0604a<T> f9759j;

        /* renamed from: q0.a$a$a */
        public static final class C2962a implements C3031c<T> {

            /* renamed from: d */
            final /* synthetic */ C0604a f9760d;

            public C2962a(C0604a aVar) {
                this.f9760d = aVar;
            }

            /* renamed from: h */
            public Object mo10196h(T t, C3443d<? super C3187s> dVar) {
                this.f9760d.accept(t);
                return C3187s.f10561a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2961a(C3030b<? extends T> bVar, C0604a<T> aVar, C3443d<? super C2961a> dVar) {
            super(2, dVar);
            this.f9758i = bVar;
            this.f9759j = aVar;
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            return new C2961a(this.f9758i, this.f9759j, dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            Object c = C3530d.m15553c();
            int i = this.f9757h;
            if (i == 0) {
                C3181m.m14059b(obj);
                C3030b<T> bVar = this.f9758i;
                C2962a aVar = new C2962a(this.f9759j);
                this.f9757h = 1;
                if (bVar.mo10364a(aVar, this) == c) {
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
            return ((C2961a) mo3734a(h0Var, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    public C2960a(C1232q qVar) {
        C1924k.m9141g(qVar, "tracker");
        this.f9754b = qVar;
    }

    /* renamed from: b */
    private final <T> void m13422b(Executor executor, C0604a<T> aVar, C3030b<? extends T> bVar) {
        ReentrantLock reentrantLock = this.f9755c;
        reentrantLock.lock();
        try {
            if (this.f9756d.get(aVar) == null) {
                this.f9756d.put(aVar, C2744h.m12366b(C2749i0.m12374a(C2746h1.m12369a(executor)), (C3448g) null, (C2753j0) null, new C2961a(bVar, aVar, (C3443d<? super C2961a>) null), 3, (Object) null));
            }
            C3187s sVar = C3187s.f10561a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    private final void m13423d(C0604a<?> aVar) {
        ReentrantLock reentrantLock = this.f9755c;
        reentrantLock.lock();
        try {
            C2777o1 o1Var = this.f9756d.get(aVar);
            if (o1Var != null) {
                C2777o1.C2778a.m12478a(o1Var, (CancellationException) null, 1, (Object) null);
            }
            C2777o1 remove = this.f9756d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public C3030b<C1240v> mo5055a(Activity activity) {
        C1924k.m9141g(activity, "activity");
        return this.f9754b.mo5055a(activity);
    }

    /* renamed from: c */
    public final void mo10193c(Activity activity, Executor executor, C0604a<C1240v> aVar) {
        C1924k.m9141g(activity, "activity");
        C1924k.m9141g(executor, "executor");
        C1924k.m9141g(aVar, "consumer");
        m13422b(executor, aVar, this.f9754b.mo5055a(activity));
    }

    /* renamed from: e */
    public final void mo10194e(C0604a<C1240v> aVar) {
        C1924k.m9141g(aVar, "consumer");
        m13423d(aVar);
    }
}
