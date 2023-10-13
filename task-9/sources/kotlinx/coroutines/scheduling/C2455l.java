package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C2401d0;

/* renamed from: kotlinx.coroutines.scheduling.l */
public final class C2455l {

    /* renamed from: a */
    public static final long f8408a = C2405f0.m11216e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f8409b = C2405f0.m11215d("kotlinx.coroutines.scheduler.core.pool.size", C2331f.m10816b(C2401d0.m11201a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: c */
    public static final int f8410c = C2405f0.m11215d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f8411d = TimeUnit.SECONDS.toNanos(C2405f0.m11216e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C2450g f8412e = C2448e.f8398a;

    /* renamed from: f */
    public static final C2452i f8413f = new C2453j(0);

    /* renamed from: g */
    public static final C2452i f8414g = new C2453j(1);
}
