package kotlinx.coroutines.internal;

import p092n3.C2724d0;
import p092n3.C2761l;
import p092n3.C2771n0;
import p092n3.C2776o0;
import p127t2.C3187s;
import p145w2.C3448g;

/* renamed from: kotlinx.coroutines.internal.l */
public final class C2419l extends C2724d0 implements Runnable, C2776o0 {

    /* renamed from: f */
    private final C2724d0 f8336f;

    /* renamed from: g */
    private final int f8337g;

    /* renamed from: h */
    private final /* synthetic */ C2776o0 f8338h;

    /* renamed from: i */
    private final C2427q<Runnable> f8339i;

    /* renamed from: j */
    private final Object f8340j;
    private volatile int runningWorkers;

    public C2419l(C2724d0 d0Var, int i) {
        this.f8336f = d0Var;
        this.f8337g = i;
        C2776o0 o0Var = d0Var instanceof C2776o0 ? (C2776o0) d0Var : null;
        this.f8338h = o0Var == null ? C2771n0.m12466a() : o0Var;
        this.f8339i = new C2427q<>(false);
        this.f8340j = new Object();
    }

    /* renamed from: d0 */
    private final boolean m11271d0(Runnable runnable) {
        this.f8339i.mo9004a(runnable);
        return this.runningWorkers >= this.f8337g;
    }

    /* renamed from: e0 */
    private final boolean m11272e0() {
        synchronized (this.f8340j) {
            if (this.runningWorkers >= this.f8337g) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* renamed from: O */
    public void mo8988O(long j, C2761l<? super C3187s> lVar) {
        this.f8338h.mo8988O(j, lVar);
    }

    /* renamed from: a0 */
    public void mo8989a0(C3448g gVar, Runnable runnable) {
        if (!m11271d0(runnable) && m11272e0()) {
            this.f8336f.mo8989a0(this, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f8340j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f8339i.mo9006c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = p127t2.C3187s.f10561a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            kotlinx.coroutines.internal.q<java.lang.Runnable> r2 = r4.f8339i
            java.lang.Object r2 = r2.mo9007d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            w2.h r3 = p145w2.C3454h.f11278d
            p092n3.C2741g0.m12357a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            n3.d0 r2 = r4.f8336f
            boolean r2 = r2.mo9021b0(r4)
            if (r2 == 0) goto L_0x0002
            n3.d0 r0 = r4.f8336f
            r0.mo8989a0(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f8340j
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            kotlinx.coroutines.internal.q<java.lang.Runnable> r2 = r4.f8339i     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo9006c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            t2.s r2 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            goto L_0x004b
        L_0x004a:
            throw r0
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2419l.run():void");
    }
}
