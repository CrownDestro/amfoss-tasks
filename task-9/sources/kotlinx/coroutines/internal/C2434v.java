package kotlinx.coroutines.internal;

import p092n3.C2761l;
import p092n3.C2776o0;
import p092n3.C2815z1;
import p127t2.C3170d;
import p127t2.C3187s;
import p145w2.C3448g;

/* renamed from: kotlinx.coroutines.internal.v */
final class C2434v extends C2815z1 implements C2776o0 {

    /* renamed from: f */
    private final Throwable f8362f;

    /* renamed from: g */
    private final String f8363g;

    public C2434v(Throwable th, String str) {
        this.f8362f = th;
        this.f8363g = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m11325g0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f8362f
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f8363g
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f8362f
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            kotlinx.coroutines.internal.C2433u.m11323d()
            t2.d r0 = new t2.d
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2434v.m11325g0():java.lang.Void");
    }

    /* renamed from: b0 */
    public boolean mo9021b0(C3448g gVar) {
        m11325g0();
        throw new C3170d();
    }

    /* renamed from: d0 */
    public C2815z1 mo9022d0() {
        return this;
    }

    /* renamed from: f0 */
    public Void mo8989a0(C3448g gVar, Runnable runnable) {
        m11325g0();
        throw new C3170d();
    }

    /* renamed from: h0 */
    public Void mo8988O(long j, C2761l<? super C3187s> lVar) {
        m11325g0();
        throw new C3170d();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f8362f != null) {
            str = ", cause=" + this.f8362f;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
