package p036e5;

import java.lang.reflect.Method;
import p034e3.C1780l;
import p041f3.C1924k;
import p041f3.C1925l;
import p092n3.C2761l;
import p092n3.C2766m;
import p127t2.C3171e;
import p127t2.C3178l;
import p127t2.C3181m;
import p127t2.C3187s;
import p145w2.C3443d;
import p157y2.C3565d;
import p157y2.C3567f;
import p157y2.C3569h;

/* renamed from: e5.m */
public final class C1842m {

    /* renamed from: e5.m$a */
    static final class C1843a extends C1925l implements C1780l<Throwable, C3187s> {

        /* renamed from: e */
        final /* synthetic */ C1818b f6696e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1843a(C1818b bVar) {
            super(1);
            this.f6696e = bVar;
        }

        /* renamed from: a */
        public final void mo7534a(Throwable th) {
            this.f6696e.cancel();
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo3836n(Object obj) {
            mo7534a((Throwable) obj);
            return C3187s.f10561a;
        }
    }

    /* renamed from: e5.m$b */
    static final class C1844b extends C1925l implements C1780l<Throwable, C3187s> {

        /* renamed from: e */
        final /* synthetic */ C1818b f6697e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1844b(C1818b bVar) {
            super(1);
            this.f6697e = bVar;
        }

        /* renamed from: a */
        public final void mo7535a(Throwable th) {
            this.f6697e.cancel();
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo3836n(Object obj) {
            mo7535a((Throwable) obj);
            return C3187s.f10561a;
        }
    }

    /* renamed from: e5.m$c */
    public static final class C1845c implements C1821d<T> {

        /* renamed from: a */
        final /* synthetic */ C2761l f6698a;

        C1845c(C2761l lVar) {
            this.f6698a = lVar;
        }

        /* renamed from: a */
        public void mo7520a(C1818b<T> bVar, Throwable th) {
            C1924k.m9142h(bVar, "call");
            C1924k.m9142h(th, "t");
            C2761l lVar = this.f6698a;
            C3178l.C3179a aVar = C3178l.f10555d;
            lVar.mo8960j(C3178l.m14054a(C3181m.m14058a(th)));
        }

        /* renamed from: b */
        public void mo7521b(C1818b<T> bVar, C1883t<T> tVar) {
            T t;
            C2761l lVar;
            C1924k.m9142h(bVar, "call");
            C1924k.m9142h(tVar, "response");
            if (tVar.mo7581d()) {
                t = tVar.mo7579a();
                if (t == null) {
                    Object j = bVar.mo7512a().mo10919j(C1841l.class);
                    if (j == null) {
                        C1924k.m9150p();
                    }
                    C1924k.m9137c(j, "call.request().tag(Invocation::class.java)!!");
                    Method a = ((C1841l) j).mo7532a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    C1924k.m9137c(a, "method");
                    Class<?> declaringClass = a.getDeclaringClass();
                    C1924k.m9137c(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(a.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    C3171e eVar = new C3171e(sb.toString());
                    lVar = this.f6698a;
                    C3178l.C3179a aVar = C3178l.f10555d;
                    t = C3181m.m14058a(eVar);
                } else {
                    lVar = this.f6698a;
                    C3178l.C3179a aVar2 = C3178l.f10555d;
                }
            } else {
                lVar = this.f6698a;
                C1836j jVar = new C1836j(tVar);
                C3178l.C3179a aVar3 = C3178l.f10555d;
                t = C3181m.m14058a(jVar);
            }
            lVar.mo8960j(C3178l.m14054a(t));
        }
    }

    /* renamed from: e5.m$d */
    public static final class C1846d implements C1821d<T> {

        /* renamed from: a */
        final /* synthetic */ C2761l f6699a;

        C1846d(C2761l lVar) {
            this.f6699a = lVar;
        }

        /* renamed from: a */
        public void mo7520a(C1818b<T> bVar, Throwable th) {
            C1924k.m9142h(bVar, "call");
            C1924k.m9142h(th, "t");
            C2761l lVar = this.f6699a;
            C3178l.C3179a aVar = C3178l.f10555d;
            lVar.mo8960j(C3178l.m14054a(C3181m.m14058a(th)));
        }

        /* renamed from: b */
        public void mo7521b(C1818b<T> bVar, C1883t<T> tVar) {
            T t;
            C2761l lVar;
            C1924k.m9142h(bVar, "call");
            C1924k.m9142h(tVar, "response");
            if (tVar.mo7581d()) {
                lVar = this.f6699a;
                t = tVar.mo7579a();
                C3178l.C3179a aVar = C3178l.f10555d;
            } else {
                lVar = this.f6699a;
                C1836j jVar = new C1836j(tVar);
                C3178l.C3179a aVar2 = C3178l.f10555d;
                t = C3181m.m14058a(jVar);
            }
            lVar.mo8960j(C3178l.m14054a(t));
        }
    }

    /* renamed from: e5.m$e */
    static final class C1847e extends C1925l implements C1780l<Throwable, C3187s> {

        /* renamed from: e */
        final /* synthetic */ C1818b f6700e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1847e(C1818b bVar) {
            super(1);
            this.f6700e = bVar;
        }

        /* renamed from: a */
        public final void mo7536a(Throwable th) {
            this.f6700e.cancel();
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo3836n(Object obj) {
            mo7536a((Throwable) obj);
            return C3187s.f10561a;
        }
    }

    /* renamed from: e5.m$f */
    public static final class C1848f implements C1821d<T> {

        /* renamed from: a */
        final /* synthetic */ C2761l f6701a;

        C1848f(C2761l lVar) {
            this.f6701a = lVar;
        }

        /* renamed from: a */
        public void mo7520a(C1818b<T> bVar, Throwable th) {
            C1924k.m9142h(bVar, "call");
            C1924k.m9142h(th, "t");
            C2761l lVar = this.f6701a;
            C3178l.C3179a aVar = C3178l.f10555d;
            lVar.mo8960j(C3178l.m14054a(C3181m.m14058a(th)));
        }

        /* renamed from: b */
        public void mo7521b(C1818b<T> bVar, C1883t<T> tVar) {
            C1924k.m9142h(bVar, "call");
            C1924k.m9142h(tVar, "response");
            C2761l lVar = this.f6701a;
            C3178l.C3179a aVar = C3178l.f10555d;
            lVar.mo8960j(C3178l.m14054a(tVar));
        }
    }

    /* renamed from: e5.m$g */
    static final class C1849g implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C3443d f6702d;

        /* renamed from: e */
        final /* synthetic */ Exception f6703e;

        C1849g(C3443d dVar, Exception exc) {
            this.f6702d = dVar;
            this.f6703e = exc;
        }

        public final void run() {
            C3443d b = C3527c.m15550b(this.f6702d);
            Exception exc = this.f6703e;
            C3178l.C3179a aVar = C3178l.f10555d;
            b.mo8960j(C3178l.m14054a(C3181m.m14058a(exc)));
        }
    }

    @C3567f(mo11680c = "retrofit2.KotlinExtensions", mo11681f = "KotlinExtensions.kt", mo11682l = {113}, mo11683m = "suspendAndThrow")
    /* renamed from: e5.m$h */
    static final class C1850h extends C3565d {

        /* renamed from: g */
        /* synthetic */ Object f6704g;

        /* renamed from: h */
        int f6705h;

        /* renamed from: i */
        Object f6706i;

        C1850h(C3443d dVar) {
            super(dVar);
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            this.f6704g = obj;
            this.f6705h |= Integer.MIN_VALUE;
            return C1842m.m8931d((Exception) null, this);
        }
    }

    /* renamed from: a */
    public static final <T> Object m8928a(C1818b<T> bVar, C3443d<? super T> dVar) {
        C2766m mVar = new C2766m(C3527c.m15550b(dVar), 1);
        mVar.mo9510m(new C1843a(bVar));
        bVar.mo7516n(new C1845c(mVar));
        Object A = mVar.mo9518A();
        if (A == C3530d.m15553c()) {
            C3569h.m15747c(dVar);
        }
        return A;
    }

    /* renamed from: b */
    public static final <T> Object m8929b(C1818b<T> bVar, C3443d<? super T> dVar) {
        C2766m mVar = new C2766m(C3527c.m15550b(dVar), 1);
        mVar.mo9510m(new C1844b(bVar));
        bVar.mo7516n(new C1846d(mVar));
        Object A = mVar.mo9518A();
        if (A == C3530d.m15553c()) {
            C3569h.m15747c(dVar);
        }
        return A;
    }

    /* renamed from: c */
    public static final <T> Object m8930c(C1818b<T> bVar, C3443d<? super C1883t<T>> dVar) {
        C2766m mVar = new C2766m(C3527c.m15550b(dVar), 1);
        mVar.mo9510m(new C1847e(bVar));
        bVar.mo7516n(new C1848f(mVar));
        Object A = mVar.mo9518A();
        if (A == C3530d.m15553c()) {
            C3569h.m15747c(dVar);
        }
        return A;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m8931d(java.lang.Exception r4, p145w2.C3443d<?> r5) {
        /*
            boolean r0 = r5 instanceof p036e5.C1842m.C1850h
            if (r0 == 0) goto L_0x0013
            r0 = r5
            e5.m$h r0 = (p036e5.C1842m.C1850h) r0
            int r1 = r0.f6705h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6705h = r1
            goto L_0x0018
        L_0x0013:
            e5.m$h r0 = new e5.m$h
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f6704g
            java.lang.Object r1 = p151x2.C3530d.m15553c()
            int r2 = r0.f6705h
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f6706i
            java.lang.Exception r4 = (java.lang.Exception) r4
            p127t2.C3181m.m14059b(r5)
            goto L_0x005c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p127t2.C3181m.m14059b(r5)
            r0.f6706i = r4
            r0.f6705h = r3
            n3.d0 r5 = p092n3.C2799v0.m12531a()
            w2.g r2 = r0.mo8958b()
            e5.m$g r3 = new e5.m$g
            r3.<init>(r0, r4)
            r5.mo8989a0(r2, r3)
            java.lang.Object r4 = p151x2.C3530d.m15553c()
            java.lang.Object r5 = p151x2.C3530d.m15553c()
            if (r4 != r5) goto L_0x0059
            p157y2.C3569h.m15747c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            t2.s r4 = p127t2.C3187s.f10561a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e5.C1842m.m8931d(java.lang.Exception, w2.d):java.lang.Object");
    }
}
