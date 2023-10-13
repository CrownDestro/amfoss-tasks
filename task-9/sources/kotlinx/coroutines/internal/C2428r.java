package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p041f3.C1920g;

/* renamed from: kotlinx.coroutines.internal.r */
public final class C2428r<E> {

    /* renamed from: e */
    public static final C2429a f8349e = new C2429a((C1920g) null);

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f8350f;

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f8351g;

    /* renamed from: h */
    public static final C2399c0 f8352h = new C2399c0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f8353a;

    /* renamed from: b */
    private final boolean f8354b;

    /* renamed from: c */
    private final int f8355c;

    /* renamed from: d */
    private /* synthetic */ AtomicReferenceArray f8356d;

    /* renamed from: kotlinx.coroutines.internal.r$a */
    public static final class C2429a {
        private C2429a() {
        }

        public /* synthetic */ C2429a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo9014a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo9015b(long j, int i) {
            return mo9017d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo9016c(long j, int i) {
            return mo9017d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo9017d(long j, long j2) {
            return j & (j2 ^ -1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.r$b */
    public static final class C2430b {

        /* renamed from: a */
        public final int f8357a;

        public C2430b(int i) {
            this.f8357a = i;
        }
    }

    static {
        Class<C2428r> cls = C2428r.class;
        f8350f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f8351g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C2428r(int i, boolean z) {
        this.f8353a = i;
        this.f8354b = z;
        int i2 = i - 1;
        this.f8355c = i2;
        this.f8356d = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C2428r<E> m11301b(long j) {
        C2428r<E> rVar = new C2428r<>(this.f8353a * 2, this.f8354b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f8355c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f8356d.get(i3 & i);
                if (obj == null) {
                    obj = new C2430b(i);
                }
                rVar.f8356d.set(rVar.f8355c & i, obj);
                i++;
            } else {
                rVar._state = f8349e.mo9017d(j, 1152921504606846976L);
                return rVar;
            }
        }
    }

    /* renamed from: c */
    private final C2428r<E> m11302c(long j) {
        while (true) {
            C2428r<E> rVar = (C2428r) this._next;
            if (rVar != null) {
                return rVar;
            }
            C2398c.m11194a(f8350f, this, (Object) null, m11301b(j));
        }
    }

    /* renamed from: e */
    private final C2428r<E> m11303e(int i, E e) {
        Object obj = this.f8356d.get(this.f8355c & i);
        if (!(obj instanceof C2430b) || ((C2430b) obj).f8357a != i) {
            return null;
        }
        this.f8356d.set(i & this.f8355c, e);
        return this;
    }

    /* renamed from: h */
    private final long m11304h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f8351g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C2428r<E> m11305k(int i, int i2) {
        long j;
        C2429a aVar;
        int i3;
        do {
            j = this._state;
            aVar = f8349e;
            i3 = (int) ((1073741823 & j) >> 0);
            if ((1152921504606846976L & j) != 0) {
                return mo9012i();
            }
        } while (!f8351g.compareAndSet(this, j, aVar.mo9015b(j, i2)));
        this.f8356d.set(this.f8355c & i3, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069 A[LOOP:1: B:19:0x0069->B:22:0x007a, LOOP_START, PHI: r0 
      PHI: (r0v7 kotlinx.coroutines.internal.r) = (r0v6 kotlinx.coroutines.internal.r), (r0v9 kotlinx.coroutines.internal.r) binds: [B:18:0x0061, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9008a(E r14) {
        /*
            r13 = this;
        L_0x0000:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            kotlinx.coroutines.internal.r$a r14 = f8349e
            int r14 = r14.mo9014a(r2)
            return r14
        L_0x0012:
            kotlinx.coroutines.internal.r$a r0 = f8349e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f8355c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L_0x0030
            return r11
        L_0x0030:
            boolean r4 = r13.f8354b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f8356d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L_0x004f
            int r0 = r13.f8353a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004e:
            return r11
        L_0x004f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f8351g
            long r11 = r0.mo9016c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f8356d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L_0x0069:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x007c
            kotlinx.coroutines.internal.r r0 = r0.mo9012i()
            kotlinx.coroutines.internal.r r0 = r0.m11303e(r9, r14)
            if (r0 != 0) goto L_0x0069
        L_0x007c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2428r.mo9008a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo9009d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f8351g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int mo9010f() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: g */
    public final boolean mo9011g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C2428r<E> mo9012i() {
        return m11302c(m11304h());
    }

    /* renamed from: j */
    public final Object mo9013j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f8352h;
            }
            C2429a aVar = f8349e;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f8355c;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f8356d.get(i3 & i);
            if (obj == null) {
                if (this.f8354b) {
                    return null;
                }
            } else if (obj instanceof C2430b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f8351g.compareAndSet(this, j, aVar.mo9015b(j, i4))) {
                    this.f8356d.set(this.f8355c & i, (Object) null);
                    return obj;
                } else if (this.f8354b) {
                    C2428r rVar = this;
                    do {
                        rVar = rVar.m11305k(i, i4);
                    } while (rVar != null);
                    return obj;
                }
            }
        }
    }
}
