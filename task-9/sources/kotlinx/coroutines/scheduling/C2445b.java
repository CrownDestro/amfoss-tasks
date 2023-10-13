package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.C2401d0;
import p092n3.C2724d0;
import p092n3.C2736f1;
import p145w2.C3448g;
import p145w2.C3454h;

/* renamed from: kotlinx.coroutines.scheduling.b */
public final class C2445b extends C2736f1 implements Executor {

    /* renamed from: g */
    public static final C2445b f8395g = new C2445b();

    /* renamed from: h */
    private static final C2724d0 f8396h = C2456m.f8415f.mo9485c0(C2405f0.m11215d("kotlinx.coroutines.io.parallelism", C2331f.m10816b(64, C2401d0.m11201a()), 0, 0, 12, (Object) null));

    private C2445b() {
    }

    /* renamed from: a0 */
    public void mo8989a0(C3448g gVar, Runnable runnable) {
        f8396h.mo8989a0(gVar, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        mo8989a0(C3454h.f11278d, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
