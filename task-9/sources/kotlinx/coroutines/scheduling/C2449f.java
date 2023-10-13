package kotlinx.coroutines.scheduling;

import p092n3.C2736f1;
import p145w2.C3448g;

/* renamed from: kotlinx.coroutines.scheduling.f */
public class C2449f extends C2736f1 {

    /* renamed from: g */
    private final int f8399g;

    /* renamed from: h */
    private final int f8400h;

    /* renamed from: i */
    private final long f8401i;

    /* renamed from: j */
    private final String f8402j;

    /* renamed from: k */
    private C2440a f8403k = m11386d0();

    public C2449f(int i, int i2, long j, String str) {
        this.f8399g = i;
        this.f8400h = i2;
        this.f8401i = j;
        this.f8402j = str;
    }

    /* renamed from: d0 */
    private final C2440a m11386d0() {
        return new C2440a(this.f8399g, this.f8400h, this.f8401i, this.f8402j);
    }

    /* renamed from: a0 */
    public void mo8989a0(C3448g gVar, Runnable runnable) {
        C2440a.m11352k(this.f8403k, runnable, (C2452i) null, false, 6, (Object) null);
    }

    /* renamed from: e0 */
    public final void mo9056e0(Runnable runnable, C2452i iVar, boolean z) {
        this.f8403k.mo9040i(runnable, iVar, z);
    }
}
