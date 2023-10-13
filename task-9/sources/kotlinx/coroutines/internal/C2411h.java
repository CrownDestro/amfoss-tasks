package kotlinx.coroutines.internal;

import p034e3.C1780l;
import p145w2.C3443d;

/* renamed from: kotlinx.coroutines.internal.h */
public final class C2411h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C2399c0 f8327a = new C2399c0("UNDEFINED");

    /* renamed from: b */
    public static final C2399c0 f8328b = new C2399c0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.mo9516I0() != false) goto L_0x0091;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m11240b(p145w2.C3443d<? super T> r6, java.lang.Object r7, p034e3.C1780l<? super java.lang.Throwable, p127t2.C3187s> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.C2406g
            if (r0 == 0) goto L_0x00b6
            kotlinx.coroutines.internal.g r6 = (kotlinx.coroutines.internal.C2406g) r6
            java.lang.Object r8 = p092n3.C2706a0.m12282b(r7, r8)
            n3.d0 r0 = r6.f8316g
            w2.g r1 = r6.mo8958b()
            boolean r0 = r0.mo9021b0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f8318i = r8
            r6.f9086f = r1
            n3.d0 r7 = r6.f8316g
            w2.g r8 = r6.mo8958b()
            r7.mo8989a0(r8, r6)
            goto L_0x00b9
        L_0x0026:
            n3.j2 r0 = p092n3.C2756j2.f9055a
            n3.z0 r0 = r0.mo9505a()
            boolean r2 = r0.mo9601j0()
            if (r2 == 0) goto L_0x003b
            r6.f8318i = r8
            r6.f9086f = r1
            r0.mo9599f0(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo9600h0(r1)
            r2 = 0
            w2.g r3 = r6.mo8958b()     // Catch:{ all -> 0x00a9 }
            n3.o1$b r4 = p092n3.C2777o1.f9077b     // Catch:{ all -> 0x00a9 }
            w2.g$b r3 = r3.mo9484c(r4)     // Catch:{ all -> 0x00a9 }
            n3.o1 r3 = (p092n3.C2777o1) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.mo9450a()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.mo9541s()     // Catch:{ all -> 0x00a9 }
            r6.mo8957a(r8, r3)     // Catch:{ all -> 0x00a9 }
            t2.l$a r8 = p127t2.C3178l.f10555d     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p127t2.C3181m.m14058a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p127t2.C3178l.m14054a(r8)     // Catch:{ all -> 0x00a9 }
            r6.mo8960j(r8)     // Catch:{ all -> 0x00a9 }
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            w2.d<T> r8 = r6.f8317h     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f8319j     // Catch:{ all -> 0x00a9 }
            w2.g r4 = r8.mo8958b()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = kotlinx.coroutines.internal.C2407g0.m11232c(r4, r3)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.c0 r5 = kotlinx.coroutines.internal.C2407g0.f8320a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            n3.l2 r8 = p092n3.C2717c0.m12326g(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            w2.d<T> r5 = r6.f8317h     // Catch:{ all -> 0x0095 }
            r5.mo8960j(r7)     // Catch:{ all -> 0x0095 }
            t2.s r7 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo9516I0()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            kotlinx.coroutines.internal.C2407g0.m11230a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo9516I0()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            kotlinx.coroutines.internal.C2407g0.m11230a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo9603l0()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo9553i(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo9598d0(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo9598d0(r1)
            throw r6
        L_0x00b6:
            r6.mo8960j(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2411h.m11240b(w2.d, java.lang.Object, e3.l):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m11241c(C3443d dVar, Object obj, C1780l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m11240b(dVar, obj, lVar);
    }
}
