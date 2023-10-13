package androidx.window.layout;

import android.app.Activity;
import p034e3.C1784p;
import p041f3.C1920g;
import p041f3.C1924k;
import p104p3.C2935f;
import p110q3.C3030b;
import p110q3.C3031c;
import p110q3.C3032d;
import p127t2.C3187s;
import p145w2.C3443d;
import p157y2.C3567f;
import p157y2.C3573k;

/* renamed from: androidx.window.layout.s */
public final class C1235s implements C1232q {

    /* renamed from: d */
    public static final C1236a f4264d = new C1236a((C1920g) null);

    /* renamed from: b */
    private final C1242x f4265b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1231p f4266c;

    /* renamed from: androidx.window.layout.s$a */
    public static final class C1236a {
        private C1236a() {
        }

        public /* synthetic */ C1236a(C1920g gVar) {
            this();
        }
    }

    @C3567f(mo11680c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", mo11681f = "WindowInfoTrackerImpl.kt", mo11682l = {54, 55}, mo11683m = "invokeSuspend")
    /* renamed from: androidx.window.layout.s$b */
    static final class C1237b extends C3573k implements C1784p<C3031c<? super C1240v>, C3443d<? super C3187s>, Object> {

        /* renamed from: h */
        Object f4267h;

        /* renamed from: i */
        Object f4268i;

        /* renamed from: j */
        int f4269j;

        /* renamed from: k */
        private /* synthetic */ Object f4270k;

        /* renamed from: l */
        final /* synthetic */ C1235s f4271l;

        /* renamed from: m */
        final /* synthetic */ Activity f4272m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1237b(C1235s sVar, Activity activity, C3443d<? super C1237b> dVar) {
            super(2, dVar);
            this.f4271l = sVar;
            this.f4272m = activity;
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public static final void m6058y(C2935f fVar, C1240v vVar) {
            C1924k.m9140f(vVar, "info");
            fVar.mo10111a(vVar);
        }

        /* renamed from: a */
        public final C3443d<C3187s> mo3734a(Object obj, C3443d<?> dVar) {
            C1237b bVar = new C1237b(this.f4271l, this.f4272m, dVar);
            bVar.f4270k = obj;
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0070 A[Catch:{ all -> 0x009e }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[Catch:{ all -> 0x009e }] */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo3736t(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p151x2.C3530d.m15553c()
                int r1 = r9.f4269j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0039
                if (r1 == r3) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                java.lang.Object r1 = r9.f4268i
                p3.g r1 = (p104p3.C2937g) r1
                java.lang.Object r4 = r9.f4267h
                androidx.core.util.a r4 = (androidx.core.util.C0604a) r4
                java.lang.Object r5 = r9.f4270k
                q3.c r5 = (p110q3.C3031c) r5
                p127t2.C3181m.m14059b(r10)     // Catch:{ all -> 0x00a0 }
                r10 = r5
                goto L_0x0060
            L_0x001f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0027:
                java.lang.Object r1 = r9.f4268i
                p3.g r1 = (p104p3.C2937g) r1
                java.lang.Object r4 = r9.f4267h
                androidx.core.util.a r4 = (androidx.core.util.C0604a) r4
                java.lang.Object r5 = r9.f4270k
                q3.c r5 = (p110q3.C3031c) r5
                p127t2.C3181m.m14059b(r10)     // Catch:{ all -> 0x00a0 }
                r6 = r5
                r5 = r9
                goto L_0x0073
            L_0x0039:
                p127t2.C3181m.m14059b(r10)
                java.lang.Object r10 = r9.f4270k
                q3.c r10 = (p110q3.C3031c) r10
                r1 = 10
                p3.e r4 = p104p3.C2934e.DROP_OLDEST
                r5 = 4
                r6 = 0
                p3.f r1 = p104p3.C2938h.m13289b(r1, r4, r6, r5, r6)
                androidx.window.layout.t r4 = new androidx.window.layout.t
                r4.<init>(r1)
                androidx.window.layout.s r5 = r9.f4271l
                androidx.window.layout.p r5 = r5.f4266c
                android.app.Activity r6 = r9.f4272m
                androidx.window.layout.u r7 = androidx.window.layout.C1239u.f4274d
                r5.mo5006a(r6, r7, r4)
                p3.g r1 = r1.iterator()     // Catch:{ all -> 0x00a0 }
            L_0x0060:
                r5 = r9
            L_0x0061:
                r5.f4270k = r10     // Catch:{ all -> 0x009e }
                r5.f4267h = r4     // Catch:{ all -> 0x009e }
                r5.f4268i = r1     // Catch:{ all -> 0x009e }
                r5.f4269j = r3     // Catch:{ all -> 0x009e }
                java.lang.Object r6 = r1.mo10102a(r5)     // Catch:{ all -> 0x009e }
                if (r6 != r0) goto L_0x0070
                return r0
            L_0x0070:
                r8 = r6
                r6 = r10
                r10 = r8
            L_0x0073:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x009e }
                boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x009e }
                if (r10 == 0) goto L_0x0092
                java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x009e }
                androidx.window.layout.v r10 = (androidx.window.layout.C1240v) r10     // Catch:{ all -> 0x009e }
                r5.f4270k = r6     // Catch:{ all -> 0x009e }
                r5.f4267h = r4     // Catch:{ all -> 0x009e }
                r5.f4268i = r1     // Catch:{ all -> 0x009e }
                r5.f4269j = r2     // Catch:{ all -> 0x009e }
                java.lang.Object r10 = r6.mo10196h(r10, r5)     // Catch:{ all -> 0x009e }
                if (r10 != r0) goto L_0x0090
                return r0
            L_0x0090:
                r10 = r6
                goto L_0x0061
            L_0x0092:
                androidx.window.layout.s r10 = r5.f4271l
                androidx.window.layout.p r10 = r10.f4266c
                r10.mo5007b(r4)
                t2.s r10 = p127t2.C3187s.f10561a
                return r10
            L_0x009e:
                r10 = move-exception
                goto L_0x00a2
            L_0x00a0:
                r10 = move-exception
                r5 = r9
            L_0x00a2:
                androidx.window.layout.s r0 = r5.f4271l
                androidx.window.layout.p r0 = r0.f4266c
                r0.mo5007b(r4)
                goto L_0x00ad
            L_0x00ac:
                throw r10
            L_0x00ad:
                goto L_0x00ac
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.C1235s.C1237b.mo3736t(java.lang.Object):java.lang.Object");
        }

        /* renamed from: x */
        public final Object mo3735l(C3031c<? super C1240v> cVar, C3443d<? super C3187s> dVar) {
            return ((C1237b) mo3734a(cVar, dVar)).mo3736t(C3187s.f10561a);
        }
    }

    public C1235s(C1242x xVar, C1231p pVar) {
        C1924k.m9141g(xVar, "windowMetricsCalculator");
        C1924k.m9141g(pVar, "windowBackend");
        this.f4265b = xVar;
        this.f4266c = pVar;
    }

    /* renamed from: a */
    public C3030b<C1240v> mo5055a(Activity activity) {
        C1924k.m9141g(activity, "activity");
        return C3032d.m13693a(new C1237b(this, activity, (C3443d<? super C1237b>) null));
    }
}
