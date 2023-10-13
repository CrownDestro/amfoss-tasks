package p110q3;

import p127t2.C3187s;
import p145w2.C3443d;
import p157y2.C3565d;
import p157y2.C3567f;

/* renamed from: q3.a */
public abstract class C3028a<T> implements C3030b<T> {

    @C3567f(mo11680c = "kotlinx.coroutines.flow.AbstractFlow", mo11681f = "Flow.kt", mo11682l = {230}, mo11683m = "collect")
    /* renamed from: q3.a$a */
    static final class C3029a extends C3565d {

        /* renamed from: g */
        Object f9904g;

        /* renamed from: h */
        /* synthetic */ Object f9905h;

        /* renamed from: i */
        final /* synthetic */ C3028a<T> f9906i;

        /* renamed from: j */
        int f9907j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3029a(C3028a<T> aVar, C3443d<? super C3029a> dVar) {
            super(dVar);
            this.f9906i = aVar;
        }

        /* renamed from: t */
        public final Object mo3736t(Object obj) {
            this.f9905h = obj;
            this.f9907j |= Integer.MIN_VALUE;
            return this.f9906i.mo10364a((C3031c) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10364a(p110q3.C3031c<? super T> r6, p145w2.C3443d<? super p127t2.C3187s> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p110q3.C3028a.C3029a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            q3.a$a r0 = (p110q3.C3028a.C3029a) r0
            int r1 = r0.f9907j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9907j = r1
            goto L_0x0018
        L_0x0013:
            q3.a$a r0 = new q3.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f9905h
            java.lang.Object r1 = p151x2.C3530d.m15553c()
            int r2 = r0.f9907j
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f9904g
            r3.c r6 = (p116r3.C3084c) r6
            p127t2.C3181m.m14059b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            p127t2.C3181m.m14059b(r7)
            r3.c r7 = new r3.c
            w2.g r2 = r0.mo8958b()
            r7.<init>(r6, r2)
            r0.f9904g = r7     // Catch:{ all -> 0x0055 }
            r0.f9907j = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.mo10365b(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.mo10410u()
            t2.s r6 = p127t2.C3187s.f10561a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.mo10410u()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p110q3.C3028a.mo10364a(q3.c, w2.d):java.lang.Object");
    }

    /* renamed from: b */
    public abstract Object mo10365b(C3031c<? super T> cVar, C3443d<? super C3187s> dVar);
}
