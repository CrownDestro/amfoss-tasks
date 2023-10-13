package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C2398c;

/* renamed from: kotlinx.coroutines.scheduling.n */
public final class C2457n {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f8416b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f8417c;

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f8418d;

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f8419e;

    /* renamed from: a */
    private final AtomicReferenceArray<C2451h> f8420a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C2457n> cls = C2457n.class;
        f8416b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f8417c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f8418d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f8419e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ C2451h m11395b(C2457n nVar, C2451h hVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return nVar.mo9061a(hVar, z);
    }

    /* renamed from: c */
    private final C2451h m11396c(C2451h hVar) {
        boolean z = true;
        if (hVar.f8405e.mo9057a() != 1) {
            z = false;
        }
        if (z) {
            f8419e.incrementAndGet(this);
        }
        if (mo9062e() == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.f8420a.get(i) != null) {
            Thread.yield();
        }
        this.f8420a.lazySet(i, hVar);
        f8417c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m11397d(C2451h hVar) {
        if (hVar != null) {
            boolean z = true;
            if (hVar.f8405e.mo9057a() != 1) {
                z = false;
            }
            if (z) {
                f8419e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: i */
    private final C2451h m11398i() {
        C2451h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f8418d.compareAndSet(this, i, i + 1) && (andSet = this.f8420a.getAndSet(i2, (Object) null)) != null) {
                m11397d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m11399j(C2447d dVar) {
        C2451h i = m11398i();
        if (i == null) {
            return false;
        }
        dVar.mo9004a(i);
        return true;
    }

    /* renamed from: m */
    private final long m11400m(C2457n nVar, boolean z) {
        C2451h hVar;
        do {
            hVar = (C2451h) nVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f8405e.mo9057a() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C2455l.f8412e.mo9055a() - hVar.f8404d;
            long j = C2455l.f8408a;
            if (a < j) {
                return j - a;
            }
        } while (!C2398c.m11194a(f8416b, nVar, hVar, (Object) null));
        m11395b(this, hVar, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: a */
    public final C2451h mo9061a(C2451h hVar, boolean z) {
        if (z) {
            return m11396c(hVar);
        }
        C2451h hVar2 = (C2451h) f8416b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return m11396c(hVar2);
    }

    /* renamed from: e */
    public final int mo9062e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo9063f() {
        return this.lastScheduledTask != null ? mo9062e() + 1 : mo9062e();
    }

    /* renamed from: g */
    public final void mo9064g(C2447d dVar) {
        C2451h hVar = (C2451h) f8416b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.mo9004a(hVar);
        }
        do {
        } while (m11399j(dVar));
    }

    /* renamed from: h */
    public final C2451h mo9065h() {
        C2451h hVar = (C2451h) f8416b.getAndSet(this, (Object) null);
        return hVar == null ? m11398i() : hVar;
    }

    /* renamed from: k */
    public final long mo9066k(C2457n nVar) {
        int i = nVar.consumerIndex;
        int i2 = nVar.producerIndex;
        AtomicReferenceArray<C2451h> atomicReferenceArray = nVar.f8420a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            C2451h hVar = atomicReferenceArray.get(i3);
            if (hVar != null) {
                if (hVar.f8405e.mo9057a() != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i3, hVar, (Object) null)) {
                    f8419e.decrementAndGet(nVar);
                    m11395b(this, hVar, false, 2, (Object) null);
                    return -1;
                }
            }
            i++;
        }
        return m11400m(nVar, true);
    }

    /* renamed from: l */
    public final long mo9067l(C2457n nVar) {
        C2451h i = nVar.m11398i();
        if (i == null) {
            return m11400m(nVar, false);
        }
        m11395b(this, i, false, 2, (Object) null);
        return -1;
    }
}
