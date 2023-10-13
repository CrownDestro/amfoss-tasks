package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.C2399c0;
import kotlinx.coroutines.internal.C2439z;
import p041f3.C1920g;
import p041f3.C1924k;
import p055h3.C2020c;
import p092n3.C2716c;
import p092n3.C2763l0;
import p127t2.C3187s;

/* renamed from: kotlinx.coroutines.scheduling.a */
public final class C2440a implements Executor, Closeable {

    /* renamed from: k */
    public static final C2441a f8368k = new C2441a((C1920g) null);

    /* renamed from: l */
    private static final /* synthetic */ AtomicLongFieldUpdater f8369l = AtomicLongFieldUpdater.newUpdater(C2440a.class, "parkedWorkersStack");

    /* renamed from: m */
    static final /* synthetic */ AtomicLongFieldUpdater f8370m = AtomicLongFieldUpdater.newUpdater(C2440a.class, "controlState");

    /* renamed from: n */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f8371n = AtomicIntegerFieldUpdater.newUpdater(C2440a.class, "_isTerminated");

    /* renamed from: o */
    public static final C2399c0 f8372o = new C2399c0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final int f8373d;

    /* renamed from: e */
    public final int f8374e;

    /* renamed from: f */
    public final long f8375f;

    /* renamed from: g */
    public final String f8376g;

    /* renamed from: h */
    public final C2447d f8377h;

    /* renamed from: i */
    public final C2447d f8378i;

    /* renamed from: j */
    public final C2439z<C2443c> f8379j;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    public static final class C2441a {
        private C2441a() {
        }

        public /* synthetic */ C2441a(C1920g gVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    public /* synthetic */ class C2442b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8380a;

        static {
            int[] iArr = new int[C2444d.values().length];
            iArr[C2444d.PARKING.ordinal()] = 1;
            iArr[C2444d.BLOCKING.ordinal()] = 2;
            iArr[C2444d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[C2444d.DORMANT.ordinal()] = 4;
            iArr[C2444d.TERMINATED.ordinal()] = 5;
            f8380a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    public final class C2443c extends Thread {

        /* renamed from: k */
        static final /* synthetic */ AtomicIntegerFieldUpdater f8381k = AtomicIntegerFieldUpdater.newUpdater(C2443c.class, "workerCtl");

        /* renamed from: d */
        public final C2457n f8382d;

        /* renamed from: e */
        public C2444d f8383e;

        /* renamed from: f */
        private long f8384f;

        /* renamed from: g */
        private long f8385g;

        /* renamed from: h */
        private int f8386h;

        /* renamed from: i */
        public boolean f8387i;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private C2443c() {
            setDaemon(true);
            this.f8382d = new C2457n();
            this.f8383e = C2444d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = C2440a.f8372o;
            this.f8386h = C2020c.f7096d.mo7756b();
        }

        public C2443c(C2440a aVar, int i) {
            this();
            mo9048o(i);
        }

        /* renamed from: b */
        private final void m11363b(int i) {
            if (i != 0) {
                C2440a.f8370m.addAndGet(C2440a.this, -2097152);
                if (this.f8383e != C2444d.TERMINATED) {
                    this.f8383e = C2444d.DORMANT;
                }
            }
        }

        /* renamed from: c */
        private final void m11364c(int i) {
            if (i != 0 && mo9051s(C2444d.BLOCKING)) {
                C2440a.this.mo9036G();
            }
        }

        /* renamed from: d */
        private final void m11365d(C2451h hVar) {
            int a = hVar.f8405e.mo9057a();
            m11367i(a);
            m11364c(a);
            C2440a.this.mo9034C(hVar);
            m11363b(a);
        }

        /* renamed from: e */
        private final C2451h m11366e(boolean z) {
            C2451h m;
            C2451h m2;
            if (z) {
                boolean z2 = mo9047k(C2440a.this.f8373d * 2) == 0;
                if (z2 && (m2 = m11370m()) != null) {
                    return m2;
                }
                C2451h h = this.f8382d.mo9065h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (m = m11370m()) != null) {
                    return m;
                }
            } else {
                C2451h m3 = m11370m();
                if (m3 != null) {
                    return m3;
                }
            }
            return m11374t(false);
        }

        /* renamed from: i */
        private final void m11367i(int i) {
            this.f8384f = 0;
            if (this.f8383e == C2444d.PARKING) {
                this.f8383e = C2444d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m11368j() {
            return this.nextParkedWorker != C2440a.f8372o;
        }

        /* renamed from: l */
        private final void m11369l() {
            if (this.f8384f == 0) {
                this.f8384f = System.nanoTime() + C2440a.this.f8375f;
            }
            LockSupport.parkNanos(C2440a.this.f8375f);
            if (System.nanoTime() - this.f8384f >= 0) {
                this.f8384f = 0;
                m11375u();
            }
        }

        /* renamed from: m */
        private final C2451h m11370m() {
            C2447d dVar;
            if (mo9047k(2) == 0) {
                C2451h hVar = (C2451h) C2440a.this.f8377h.mo9007d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = C2440a.this.f8378i;
            } else {
                C2451h hVar2 = (C2451h) C2440a.this.f8378i.mo9007d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = C2440a.this.f8377h;
            }
            return (C2451h) dVar.mo9007d();
        }

        /* renamed from: n */
        private final void m11371n() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C2440a.this.isTerminated() && this.f8383e != C2444d.TERMINATED) {
                    C2451h f = mo9044f(this.f8387i);
                    if (f != null) {
                        this.f8385g = 0;
                        m11365d(f);
                    } else {
                        this.f8387i = false;
                        if (this.f8385g == 0) {
                            m11373r();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo9051s(C2444d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f8385g);
                            this.f8385g = 0;
                        }
                    }
                }
            }
            mo9051s(C2444d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m11372q() {
            boolean z;
            if (this.f8383e != C2444d.CPU_ACQUIRED) {
                C2440a aVar = C2440a.this;
                while (true) {
                    long j = aVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (C2440a.f8370m.compareAndSet(aVar, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f8383e = C2444d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: r */
        private final void m11373r() {
            if (!m11368j()) {
                C2440a.this.mo9043w(this);
                return;
            }
            this.workerCtl = -1;
            while (m11368j() && this.workerCtl == -1 && !C2440a.this.isTerminated() && this.f8383e != C2444d.TERMINATED) {
                mo9051s(C2444d.PARKING);
                Thread.interrupted();
                m11369l();
            }
        }

        /* renamed from: t */
        private final C2451h m11374t(boolean z) {
            int i = (int) (C2440a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = mo9047k(i);
            C2440a aVar = C2440a.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                k++;
                if (k > i) {
                    k = 1;
                }
                C2443c b = aVar.f8379j.mo9031b(k);
                if (!(b == null || b == this)) {
                    C2457n nVar = this.f8382d;
                    C2457n nVar2 = b.f8382d;
                    long k2 = z ? nVar.mo9066k(nVar2) : nVar.mo9067l(nVar2);
                    if (k2 == -1) {
                        return this.f8382d.mo9065h();
                    }
                    if (k2 > 0) {
                        j = Math.min(j, k2);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f8385g = j;
            return null;
        }

        /* renamed from: u */
        private final void m11375u() {
            C2440a aVar = C2440a.this;
            synchronized (aVar.f8379j) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f8373d) {
                        if (f8381k.compareAndSet(this, -1, 1)) {
                            int i = this.indexInArray;
                            mo9048o(0);
                            aVar.mo9033B(this, i, 0);
                            int andDecrement = (int) (2097151 & C2440a.f8370m.getAndDecrement(aVar));
                            if (andDecrement != i) {
                                C2443c b = aVar.f8379j.mo9031b(andDecrement);
                                C1924k.m9138d(b);
                                C2443c cVar = b;
                                aVar.f8379j.mo9032c(i, cVar);
                                cVar.mo9048o(i);
                                aVar.mo9033B(cVar, andDecrement, i);
                            }
                            aVar.f8379j.mo9032c(andDecrement, null);
                            C3187s sVar = C3187s.f10561a;
                            this.f8383e = C2444d.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public final C2451h mo9044f(boolean z) {
            C2451h hVar;
            if (m11372q()) {
                return m11366e(z);
            }
            if (!z || (hVar = this.f8382d.mo9065h()) == null) {
                hVar = (C2451h) C2440a.this.f8378i.mo9007d();
            }
            return hVar == null ? m11374t(true) : hVar;
        }

        /* renamed from: g */
        public final int mo9045g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object mo9046h() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int mo9047k(int i) {
            int i2 = this.f8386h;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f8386h = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: o */
        public final void mo9048o(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C2440a.this.f8376g);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void mo9049p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            m11371n();
        }

        /* renamed from: s */
        public final boolean mo9051s(C2444d dVar) {
            C2444d dVar2 = this.f8383e;
            boolean z = dVar2 == C2444d.CPU_ACQUIRED;
            if (z) {
                C2440a.f8370m.addAndGet(C2440a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f8383e = dVar;
            }
            return z;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    public enum C2444d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C2440a(int i, int i2, long j, String str) {
        this.f8373d = i;
        this.f8374e = i2;
        this.f8375f = j;
        this.f8376g = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f8377h = new C2447d();
                        this.f8378i = new C2447d();
                        this.parkedWorkersStack = 0;
                        this.f8379j = new C2439z<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: F */
    private final void m11344F(boolean z) {
        long addAndGet = f8370m.addAndGet(this, 2097152);
        if (!z && !m11348Q() && !m11346J(addAndGet)) {
            m11348Q();
        }
    }

    /* renamed from: H */
    private final C2451h m11345H(C2443c cVar, C2451h hVar, boolean z) {
        if (cVar == null || cVar.f8383e == C2444d.TERMINATED) {
            return hVar;
        }
        if (hVar.f8405e.mo9057a() == 0 && cVar.f8383e == C2444d.BLOCKING) {
            return hVar;
        }
        cVar.f8387i = true;
        return cVar.f8382d.mo9061a(hVar, z);
    }

    /* renamed from: J */
    private final boolean m11346J(long j) {
        if (C2331f.m10816b(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f8373d) {
            int c = m11350c();
            if (c == 1 && this.f8373d > 1) {
                m11350c();
            }
            if (c > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    static /* synthetic */ boolean m11347O(C2440a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m11346J(j);
    }

    /* renamed from: Q */
    private final boolean m11348Q() {
        C2443c s;
        do {
            s = m11354s();
            if (s == null) {
                return false;
            }
        } while (!C2443c.f8381k.compareAndSet(s, -1, 0));
        LockSupport.unpark(s);
        return true;
    }

    /* renamed from: a */
    private final boolean m11349a(C2451h hVar) {
        boolean z = true;
        if (hVar.f8405e.mo9057a() != 1) {
            z = false;
        }
        return (z ? this.f8378i : this.f8377h).mo9004a(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m11350c() {
        /*
            r10 = this;
            kotlinx.coroutines.internal.z<kotlinx.coroutines.scheduling.a$c> r0 = r10.f8379j
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007a }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x007a }
            int r1 = r6 - r2
            r2 = 0
            int r1 = p068j3.C2331f.m10816b(r1, r2)     // Catch:{ all -> 0x007a }
            int r5 = r10.f8373d     // Catch:{ all -> 0x007a }
            if (r1 < r5) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            int r5 = r10.f8374e     // Catch:{ all -> 0x007a }
            if (r6 < r5) goto L_0x0031
            monitor-exit(r0)
            return r2
        L_0x0031:
            long r5 = r10.controlState     // Catch:{ all -> 0x007a }
            long r5 = r5 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r5 = 1
            int r6 = r6 + r5
            if (r6 <= 0) goto L_0x0043
            kotlinx.coroutines.internal.z<kotlinx.coroutines.scheduling.a$c> r7 = r10.f8379j     // Catch:{ all -> 0x007a }
            java.lang.Object r7 = r7.mo9031b(r6)     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x006e
            kotlinx.coroutines.scheduling.a$c r7 = new kotlinx.coroutines.scheduling.a$c     // Catch:{ all -> 0x007a }
            r7.<init>(r10, r6)     // Catch:{ all -> 0x007a }
            kotlinx.coroutines.internal.z<kotlinx.coroutines.scheduling.a$c> r8 = r10.f8379j     // Catch:{ all -> 0x007a }
            r8.mo9032c(r6, r7)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f8370m     // Catch:{ all -> 0x007a }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007a }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x007a }
            if (r6 != r4) goto L_0x005b
            r2 = 1
        L_0x005b:
            if (r2 == 0) goto L_0x0062
            r7.start()     // Catch:{ all -> 0x007a }
            int r1 = r1 + r5
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x007e
        L_0x007d:
            throw r1
        L_0x007e:
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.C2440a.m11350c():int");
    }

    /* renamed from: h */
    private final C2443c m11351h() {
        Thread currentThread = Thread.currentThread();
        C2443c cVar = currentThread instanceof C2443c ? (C2443c) currentThread : null;
        if (cVar == null || !C1924k.m9136b(C2440a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: k */
    public static /* synthetic */ void m11352k(C2440a aVar, Runnable runnable, C2452i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = C2455l.f8413f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo9040i(runnable, iVar, z);
    }

    /* renamed from: n */
    private final int m11353n(C2443c cVar) {
        int g;
        do {
            Object h = cVar.mo9046h();
            if (h == f8372o) {
                return -1;
            }
            if (h == null) {
                return 0;
            }
            cVar = (C2443c) h;
            g = cVar.mo9045g();
        } while (g == 0);
        return g;
    }

    /* renamed from: s */
    private final C2443c m11354s() {
        while (true) {
            long j = this.parkedWorkersStack;
            C2443c b = this.f8379j.mo9031b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int n = m11353n(b);
            if (n >= 0) {
                if (f8369l.compareAndSet(this, j, ((long) n) | j2)) {
                    b.mo9049p(f8372o);
                    return b;
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo9033B(C2443c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m11353n(cVar) : i2;
            }
            if (i3 >= 0) {
                if (f8369l.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo9034C(C2451h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            C2716c.m12319a();
            throw th;
        }
        C2716c.m12319a();
    }

    /* renamed from: D */
    public final void mo9035D(long j) {
        int i;
        C2451h hVar;
        if (f8371n.compareAndSet(this, 0, 1)) {
            C2443c h = m11351h();
            synchronized (this.f8379j) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C2443c b = this.f8379j.mo9031b(i2);
                    C1924k.m9138d(b);
                    C2443c cVar = b;
                    if (cVar != h) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.f8382d.mo9064g(this.f8378i);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f8378i.mo9005b();
            this.f8377h.mo9005b();
            while (true) {
                if (h != null) {
                    hVar = h.mo9044f(true);
                    if (hVar != null) {
                        continue;
                        mo9034C(hVar);
                    }
                }
                hVar = (C2451h) this.f8377h.mo9007d();
                if (hVar == null && (hVar = (C2451h) this.f8378i.mo9007d()) == null) {
                    break;
                }
                mo9034C(hVar);
            }
            if (h != null) {
                h.mo9051s(C2444d.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    /* renamed from: G */
    public final void mo9036G() {
        if (!m11348Q() && !m11347O(this, 0, 1, (Object) null)) {
            m11348Q();
        }
    }

    public void close() {
        mo9035D(10000);
    }

    public void execute(Runnable runnable) {
        m11352k(this, runnable, (C2452i) null, false, 6, (Object) null);
    }

    /* renamed from: f */
    public final C2451h mo9039f(Runnable runnable, C2452i iVar) {
        long a = C2455l.f8412e.mo9055a();
        if (!(runnable instanceof C2451h)) {
            return new C2454k(runnable, a, iVar);
        }
        C2451h hVar = (C2451h) runnable;
        hVar.f8404d = a;
        hVar.f8405e = iVar;
        return hVar;
    }

    /* renamed from: i */
    public final void mo9040i(Runnable runnable, C2452i iVar, boolean z) {
        C2716c.m12319a();
        C2451h f = mo9039f(runnable, iVar);
        C2443c h = m11351h();
        C2451h H = m11345H(h, f, z);
        if (H == null || m11349a(H)) {
            boolean z2 = z && h != null;
            if (f.f8405e.mo9057a() != 0) {
                m11344F(z2);
            } else if (!z2) {
                mo9036G();
            }
        } else {
            throw new RejectedExecutionException(this.f8376g + " was terminated");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public String toString() {
        char c;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int a = this.f8379j.mo9030a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            C2443c b = this.f8379j.mo9031b(i6);
            if (b != null) {
                int f = b.f8382d.mo9063f();
                int i7 = C2442b.f8380a[b.f8383e.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c = 'b';
                    } else if (i7 == 3) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c = 'c';
                    } else if (i7 == 4) {
                        i4++;
                        if (f > 0) {
                            sb = new StringBuilder();
                            sb.append(f);
                            c = 'd';
                        }
                    } else if (i7 == 5) {
                        i5++;
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
        }
        long j = this.controlState;
        return this.f8376g + '@' + C2763l0.m12400b(this) + "[Pool Size {core = " + this.f8373d + ", max = " + this.f8374e + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f8377h.mo9006c() + ", global blocking queue size = " + this.f8378i.mo9006c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f8373d - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: w */
    public final boolean mo9043w(C2443c cVar) {
        long j;
        int g;
        if (cVar.mo9046h() != f8372o) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            g = cVar.mo9045g();
            cVar.mo9049p(this.f8379j.mo9031b((int) (2097151 & j)));
        } while (!f8369l.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) g)));
        return true;
    }
}
