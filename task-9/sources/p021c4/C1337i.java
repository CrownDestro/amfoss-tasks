package p021c4;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import p041f3.C1920g;
import p041f3.C1924k;
import p062i4.C2100b0;
import p062i4.C2102c0;
import p062i4.C2105d;
import p062i4.C2111f;
import p062i4.C2114h;
import p062i4.C2136z;
import p127t2.C3184p;
import p127t2.C3187s;
import p134u3.C3359w;
import p140v3.C3423b;

/* renamed from: c4.i */
public final class C1337i {

    /* renamed from: o */
    public static final C1338a f4829o = new C1338a((C1920g) null);

    /* renamed from: a */
    private long f4830a;

    /* renamed from: b */
    private long f4831b;

    /* renamed from: c */
    private long f4832c;

    /* renamed from: d */
    private long f4833d;

    /* renamed from: e */
    private final ArrayDeque<C3359w> f4834e;

    /* renamed from: f */
    private boolean f4835f;

    /* renamed from: g */
    private final C1340c f4836g;

    /* renamed from: h */
    private final C1339b f4837h;

    /* renamed from: i */
    private final C1341d f4838i = new C1341d();

    /* renamed from: j */
    private final C1341d f4839j = new C1341d();

    /* renamed from: k */
    private C1304b f4840k;

    /* renamed from: l */
    private IOException f4841l;

    /* renamed from: m */
    private final int f4842m;

    /* renamed from: n */
    private final C1312f f4843n;

    /* renamed from: c4.i$a */
    public static final class C1338a {
        private C1338a() {
        }

        public /* synthetic */ C1338a(C1920g gVar) {
            this();
        }
    }

    /* renamed from: c4.i$b */
    public final class C1339b implements C2136z {

        /* renamed from: d */
        private final C2111f f4844d = new C2111f();

        /* renamed from: e */
        private C3359w f4845e;

        /* renamed from: f */
        private boolean f4846f;

        /* renamed from: g */
        private boolean f4847g;

        public C1339b(boolean z) {
            this.f4847g = z;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private final void m6407a(boolean z) {
            long min;
            boolean z2;
            synchronized (C1337i.this) {
                C1337i.this.mo5248s().mo7885r();
                while (C1337i.this.mo5247r() >= C1337i.this.mo5246q() && !this.f4847g && !this.f4846f && C1337i.this.mo5237h() == null) {
                    try {
                        C1337i.this.mo5229D();
                    } catch (Throwable th) {
                        C1337i.this.mo5248s().mo5265y();
                        throw th;
                    }
                }
                C1337i.this.mo5248s().mo5265y();
                C1337i.this.mo5233c();
                min = Math.min(C1337i.this.mo5246q() - C1337i.this.mo5247r(), this.f4844d.mo7931h0());
                C1337i iVar = C1337i.this;
                iVar.mo5227B(iVar.mo5247r() + min);
                z2 = z && min == this.f4844d.mo7931h0() && C1337i.this.mo5237h() == null;
                C3187s sVar = C3187s.f10561a;
            }
            C1337i.this.mo5248s().mo7885r();
            try {
                C1337i.this.mo5236g().mo5151C0(C1337i.this.mo5239j(), z2, this.f4844d, min);
            } finally {
                C1337i.this.mo5248s().mo5265y();
            }
        }

        /* renamed from: I */
        public void mo5092I(C2111f fVar, long j) {
            C1924k.m9142h(fVar, "source");
            C1337i iVar = C1337i.this;
            if (!C3423b.f11239h || !Thread.holdsLock(iVar)) {
                this.f4844d.mo5092I(fVar, j);
                while (this.f4844d.mo7931h0() >= 16384) {
                    m6407a(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C1924k.m9137c(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: c */
        public final boolean mo5256c() {
            return this.f4846f;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            if (r10.f4848h.mo5244o().f4847g != false) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            if (r10.f4844d.mo7931h0() <= 0) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
            if (r10.f4845e == null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
            if (r4 == false) goto L_0x009d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
            if (r10.f4844d.mo7931h0() <= 0) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            m6407a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
            r0 = r10.f4848h.mo5236g();
            r2 = r10.f4848h.mo5239j();
            r4 = r10.f4845e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
            if (r4 != null) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
            p041f3.C1924k.m9150p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
            r0.mo5152D0(r2, r1, p140v3.C3423b.m15071K(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
            if (r0 == false) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
            if (r10.f4844d.mo7931h0() <= 0) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
            m6407a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
            if (r1 == false) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
            r10.f4848h.mo5236g().mo5151C0(r10.f4848h.mo5239j(), true, (p062i4.C2111f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
            r0 = r10.f4848h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            r10.f4846f = true;
            r1 = p127t2.C3187s.f10561a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c9, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
            r10.f4848h.mo5236g().flush();
            r10.f4848h.mo5232b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                c4.i r0 = p021c4.C1337i.this
                boolean r1 = p140v3.C3423b.f11239h
                if (r1 == 0) goto L_0x0039
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0039
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                p041f3.C1924k.m9137c(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0039:
                c4.i r0 = p021c4.C1337i.this
                monitor-enter(r0)
                boolean r1 = r10.f4846f     // Catch:{ all -> 0x00dc }
                if (r1 == 0) goto L_0x0042
                monitor-exit(r0)
                return
            L_0x0042:
                c4.i r1 = p021c4.C1337i.this     // Catch:{ all -> 0x00dc }
                c4.b r1 = r1.mo5237h()     // Catch:{ all -> 0x00dc }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x004e
                r1 = 1
                goto L_0x004f
            L_0x004e:
                r1 = 0
            L_0x004f:
                t2.s r4 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x00dc }
                monitor-exit(r0)
                c4.i r0 = p021c4.C1337i.this
                c4.i$b r0 = r0.mo5244o()
                boolean r0 = r0.f4847g
                if (r0 != 0) goto L_0x00c2
                i4.f r0 = r10.f4844d
                long r4 = r0.mo7931h0()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x006a
                r0 = 1
                goto L_0x006b
            L_0x006a:
                r0 = 0
            L_0x006b:
                u3.w r4 = r10.f4845e
                if (r4 == 0) goto L_0x0071
                r4 = 1
                goto L_0x0072
            L_0x0071:
                r4 = 0
            L_0x0072:
                if (r4 == 0) goto L_0x009d
            L_0x0074:
                i4.f r0 = r10.f4844d
                long r4 = r0.mo7931h0()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0082
                r10.m6407a(r2)
                goto L_0x0074
            L_0x0082:
                c4.i r0 = p021c4.C1337i.this
                c4.f r0 = r0.mo5236g()
                c4.i r2 = p021c4.C1337i.this
                int r2 = r2.mo5239j()
                u3.w r4 = r10.f4845e
                if (r4 != 0) goto L_0x0095
                p041f3.C1924k.m9150p()
            L_0x0095:
                java.util.List r4 = p140v3.C3423b.m15071K(r4)
                r0.mo5152D0(r2, r1, r4)
                goto L_0x00c2
            L_0x009d:
                if (r0 == 0) goto L_0x00ad
            L_0x009f:
                i4.f r0 = r10.f4844d
                long r0 = r0.mo7931h0()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L_0x00c2
                r10.m6407a(r3)
                goto L_0x009f
            L_0x00ad:
                if (r1 == 0) goto L_0x00c2
                c4.i r0 = p021c4.C1337i.this
                c4.f r4 = r0.mo5236g()
                c4.i r0 = p021c4.C1337i.this
                int r5 = r0.mo5239j()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.mo5151C0(r5, r6, r7, r8)
            L_0x00c2:
                c4.i r0 = p021c4.C1337i.this
                monitor-enter(r0)
                r10.f4846f = r3     // Catch:{ all -> 0x00d9 }
                t2.s r1 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x00d9 }
                monitor-exit(r0)
                c4.i r0 = p021c4.C1337i.this
                c4.f r0 = r0.mo5236g()
                r0.flush()
                c4.i r0 = p021c4.C1337i.this
                r0.mo5232b()
                return
            L_0x00d9:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00dc:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x00e0
            L_0x00df:
                throw r1
            L_0x00e0:
                goto L_0x00df
            */
            throw new UnsupportedOperationException("Method not decompiled: p021c4.C1337i.C1339b.close():void");
        }

        /* renamed from: d */
        public C2102c0 mo5094d() {
            return C1337i.this.mo5248s();
        }

        /* renamed from: f */
        public final boolean mo5257f() {
            return this.f4847g;
        }

        public void flush() {
            C1337i iVar = C1337i.this;
            if (!C3423b.f11239h || !Thread.holdsLock(iVar)) {
                synchronized (C1337i.this) {
                    C1337i.this.mo5233c();
                    C3187s sVar = C3187s.f10561a;
                }
                while (this.f4844d.mo7931h0() > 0) {
                    m6407a(false);
                    C1337i.this.mo5236g().flush();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C1924k.m9137c(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: c4.i$c */
    public final class C1340c implements C2100b0 {

        /* renamed from: d */
        private final C2111f f4849d = new C2111f();

        /* renamed from: e */
        private final C2111f f4850e = new C2111f();

        /* renamed from: f */
        private C3359w f4851f;

        /* renamed from: g */
        private boolean f4852g;

        /* renamed from: h */
        private final long f4853h;

        /* renamed from: i */
        private boolean f4854i;

        public C1340c(long j, boolean z) {
            this.f4853h = j;
            this.f4854i = z;
        }

        /* renamed from: k */
        private final void m6412k(long j) {
            C1337i iVar = C1337i.this;
            if (!C3423b.f11239h || !Thread.holdsLock(iVar)) {
                C1337i.this.mo5236g().mo5150B0(j);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C1924k.m9137c(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: M */
        public long mo5087M(C2111f fVar, long j) {
            Throwable th;
            long j2;
            boolean z;
            C2111f fVar2 = fVar;
            long j3 = j;
            C1924k.m9142h(fVar2, "sink");
            if (j3 >= 0) {
                do {
                    th = null;
                    synchronized (C1337i.this) {
                        C1337i.this.mo5242m().mo7885r();
                        try {
                            if (C1337i.this.mo5237h() != null) {
                                th = C1337i.this.mo5238i();
                                if (th == null) {
                                    C1304b h = C1337i.this.mo5237h();
                                    if (h == null) {
                                        C1924k.m9150p();
                                    }
                                    th = new C1351n(h);
                                }
                            }
                            if (!this.f4852g) {
                                if (this.f4850e.mo7931h0() > 0) {
                                    C2111f fVar3 = this.f4850e;
                                    j2 = fVar3.mo5087M(fVar2, Math.min(j3, fVar3.mo7931h0()));
                                    C1337i iVar = C1337i.this;
                                    iVar.mo5226A(iVar.mo5241l() + j2);
                                    long l = C1337i.this.mo5241l() - C1337i.this.mo5240k();
                                    if (th == null && l >= ((long) (C1337i.this.mo5236g().mo5165g0().mo5293c() / 2))) {
                                        C1337i.this.mo5236g().mo5156H0(C1337i.this.mo5239j(), l);
                                        C1337i iVar2 = C1337i.this;
                                        iVar2.mo5255z(iVar2.mo5241l());
                                    }
                                } else if (this.f4854i || th != null) {
                                    j2 = -1;
                                } else {
                                    C1337i.this.mo5229D();
                                    j2 = -1;
                                    z = true;
                                    C1337i.this.mo5242m().mo5265y();
                                    C3187s sVar = C3187s.f10561a;
                                }
                                z = false;
                                C1337i.this.mo5242m().mo5265y();
                                C3187s sVar2 = C3187s.f10561a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            C1337i.this.mo5242m().mo5265y();
                            throw th2;
                        }
                    }
                } while (z);
                if (j2 != -1) {
                    m6412k(j2);
                    return j2;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
            }
        }

        /* renamed from: a */
        public final boolean mo5258a() {
            return this.f4852g;
        }

        /* renamed from: c */
        public final boolean mo5259c() {
            return this.f4854i;
        }

        public void close() {
            long h0;
            synchronized (C1337i.this) {
                this.f4852g = true;
                h0 = this.f4850e.mo7931h0();
                this.f4850e.mo7933i();
                C1337i iVar = C1337i.this;
                if (iVar != null) {
                    iVar.notifyAll();
                    C3187s sVar = C3187s.f10561a;
                } else {
                    throw new C3184p("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (h0 > 0) {
                m6412k(h0);
            }
            C1337i.this.mo5232b();
        }

        /* renamed from: d */
        public C2102c0 mo5090d() {
            return C1337i.this.mo5242m();
        }

        /* renamed from: f */
        public final void mo5260f(C2114h hVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C1924k.m9142h(hVar, "source");
            C1337i iVar = C1337i.this;
            if (!C3423b.f11239h || !Thread.holdsLock(iVar)) {
                while (j > 0) {
                    synchronized (C1337i.this) {
                        z = this.f4854i;
                        z2 = true;
                        z3 = this.f4850e.mo7931h0() + j > this.f4853h;
                        C3187s sVar = C3187s.f10561a;
                    }
                    if (z3) {
                        hVar.mo7963v(j);
                        C1337i.this.mo5235f(C1304b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        hVar.mo7963v(j);
                        return;
                    } else {
                        long M = hVar.mo5087M(this.f4849d, j);
                        if (M != -1) {
                            j -= M;
                            synchronized (C1337i.this) {
                                if (this.f4852g) {
                                    j2 = this.f4849d.mo7931h0();
                                    this.f4849d.mo7933i();
                                } else {
                                    if (this.f4850e.mo7931h0() != 0) {
                                        z2 = false;
                                    }
                                    this.f4850e.mo7946o0(this.f4849d);
                                    if (z2) {
                                        C1337i iVar2 = C1337i.this;
                                        if (iVar2 != null) {
                                            iVar2.notifyAll();
                                        } else {
                                            throw new C3184p("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                m6412k(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C1924k.m9137c(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: h */
        public final void mo5261h(boolean z) {
            this.f4854i = z;
        }

        /* renamed from: i */
        public final void mo5262i(C3359w wVar) {
            this.f4851f = wVar;
        }
    }

    /* renamed from: c4.i$d */
    public final class C1341d extends C2105d {
        public C1341d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public IOException mo5263t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public void mo5264x() {
            C1337i.this.mo5235f(C1304b.CANCEL);
            C1337i.this.mo5236g().mo5179v0();
        }

        /* renamed from: y */
        public final void mo5265y() {
            if (mo7886s()) {
                throw mo5263t((IOException) null);
            }
        }
    }

    public C1337i(int i, C1312f fVar, boolean z, boolean z2, C3359w wVar) {
        C1924k.m9142h(fVar, "connection");
        this.f4842m = i;
        this.f4843n = fVar;
        this.f4833d = (long) fVar.mo5166h0().mo5293c();
        ArrayDeque<C3359w> arrayDeque = new ArrayDeque<>();
        this.f4834e = arrayDeque;
        this.f4836g = new C1340c((long) fVar.mo5165g0().mo5293c(), z2);
        this.f4837h = new C1339b(z);
        if (wVar != null) {
            if (!mo5249t()) {
                arrayDeque.add(wVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!mo5249t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: e */
    private final boolean m6376e(C1304b bVar, IOException iOException) {
        if (!C3423b.f11239h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f4840k != null) {
                    return false;
                }
                if (this.f4836g.mo5259c() && this.f4837h.mo5257f()) {
                    return false;
                }
                this.f4840k = bVar;
                this.f4841l = iOException;
                notifyAll();
                C3187s sVar = C3187s.f10561a;
                this.f4843n.mo5178u0(this.f4842m);
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C1924k.m9137c(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: A */
    public final void mo5226A(long j) {
        this.f4830a = j;
    }

    /* renamed from: B */
    public final void mo5227B(long j) {
        this.f4832c = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        r2.f4838i.mo5265y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p134u3.C3359w mo5228C() {
        /*
            r2 = this;
            monitor-enter(r2)
            c4.i$d r0 = r2.f4838i     // Catch:{ all -> 0x004c }
            r0.mo7885r()     // Catch:{ all -> 0x004c }
        L_0x0006:
            java.util.ArrayDeque<u3.w> r0 = r2.f4834e     // Catch:{ all -> 0x0045 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0016
            c4.b r0 = r2.f4840k     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0016
            r2.mo5229D()     // Catch:{ all -> 0x0045 }
            goto L_0x0006
        L_0x0016:
            c4.i$d r0 = r2.f4838i     // Catch:{ all -> 0x004c }
            r0.mo5265y()     // Catch:{ all -> 0x004c }
            java.util.ArrayDeque<u3.w> r0 = r2.f4834e     // Catch:{ all -> 0x004c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004c }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque<u3.w> r0 = r2.f4834e     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "headersQueue.removeFirst()"
            p041f3.C1924k.m9137c(r0, r1)     // Catch:{ all -> 0x004c }
            u3.w r0 = (p134u3.C3359w) r0     // Catch:{ all -> 0x004c }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.f4841l     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0044
            c4.n r0 = new c4.n     // Catch:{ all -> 0x004c }
            c4.b r1 = r2.f4840k     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x0041
            p041f3.C1924k.m9150p()     // Catch:{ all -> 0x004c }
        L_0x0041:
            r0.<init>(r1)     // Catch:{ all -> 0x004c }
        L_0x0044:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x0045:
            r0 = move-exception
            c4.i$d r1 = r2.f4838i     // Catch:{ all -> 0x004c }
            r1.mo5265y()     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0050
        L_0x004f:
            throw r0
        L_0x0050:
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c4.C1337i.mo5228C():u3.w");
    }

    /* renamed from: D */
    public final void mo5229D() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: E */
    public final C2102c0 mo5230E() {
        return this.f4839j;
    }

    /* renamed from: a */
    public final void mo5231a(long j) {
        this.f4833d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo5232b() {
        boolean z;
        boolean u;
        if (!C3423b.f11239h || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.f4836g.mo5259c() && this.f4836g.mo5258a() && (this.f4837h.mo5257f() || this.f4837h.mo5256c());
                u = mo5250u();
                C3187s sVar = C3187s.f10561a;
            }
            if (z) {
                mo5234d(C1304b.CANCEL, (IOException) null);
            } else if (!u) {
                this.f4843n.mo5178u0(this.f4842m);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C1924k.m9137c(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo5233c() {
        if (this.f4837h.mo5256c()) {
            throw new IOException("stream closed");
        } else if (this.f4837h.mo5257f()) {
            throw new IOException("stream finished");
        } else if (this.f4840k != null) {
            Throwable th = this.f4841l;
            if (th == null) {
                C1304b bVar = this.f4840k;
                if (bVar == null) {
                    C1924k.m9150p();
                }
                th = new C1351n(bVar);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo5234d(C1304b bVar, IOException iOException) {
        C1924k.m9142h(bVar, "rstStatusCode");
        if (m6376e(bVar, iOException)) {
            this.f4843n.mo5154F0(this.f4842m, bVar);
        }
    }

    /* renamed from: f */
    public final void mo5235f(C1304b bVar) {
        C1924k.m9142h(bVar, "errorCode");
        if (m6376e(bVar, (IOException) null)) {
            this.f4843n.mo5155G0(this.f4842m, bVar);
        }
    }

    /* renamed from: g */
    public final C1312f mo5236g() {
        return this.f4843n;
    }

    /* renamed from: h */
    public final synchronized C1304b mo5237h() {
        return this.f4840k;
    }

    /* renamed from: i */
    public final IOException mo5238i() {
        return this.f4841l;
    }

    /* renamed from: j */
    public final int mo5239j() {
        return this.f4842m;
    }

    /* renamed from: k */
    public final long mo5240k() {
        return this.f4831b;
    }

    /* renamed from: l */
    public final long mo5241l() {
        return this.f4830a;
    }

    /* renamed from: m */
    public final C1341d mo5242m() {
        return this.f4838i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p062i4.C2136z mo5243n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f4835f     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.mo5249t()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            t2.s r0 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            c4.i$b r0 = r2.f4837h
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c4.C1337i.mo5243n():i4.z");
    }

    /* renamed from: o */
    public final C1339b mo5244o() {
        return this.f4837h;
    }

    /* renamed from: p */
    public final C1340c mo5245p() {
        return this.f4836g;
    }

    /* renamed from: q */
    public final long mo5246q() {
        return this.f4833d;
    }

    /* renamed from: r */
    public final long mo5247r() {
        return this.f4832c;
    }

    /* renamed from: s */
    public final C1341d mo5248s() {
        return this.f4839j;
    }

    /* renamed from: t */
    public final boolean mo5249t() {
        return this.f4843n.mo5158b0() == ((this.f4842m & 1) == 1);
    }

    /* renamed from: u */
    public final synchronized boolean mo5250u() {
        if (this.f4840k != null) {
            return false;
        }
        return (!this.f4836g.mo5259c() && !this.f4836g.mo5258a()) || (!this.f4837h.mo5257f() && !this.f4837h.mo5256c()) || !this.f4835f;
    }

    /* renamed from: v */
    public final C2102c0 mo5251v() {
        return this.f4838i;
    }

    /* renamed from: w */
    public final void mo5252w(C2114h hVar, int i) {
        C1924k.m9142h(hVar, "source");
        if (!C3423b.f11239h || !Thread.holdsLock(this)) {
            this.f4836g.mo5260f(hVar, (long) i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C1924k.m9137c(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5253x(p134u3.C3359w r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            p041f3.C1924k.m9142h(r3, r0)
            boolean r0 = p140v3.C3423b.f11239h
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x003c
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            p041f3.C1924k.m9137c(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x003c:
            monitor-enter(r2)
            boolean r0 = r2.f4835f     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r4 != 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            c4.i$c r0 = r2.f4836g     // Catch:{ all -> 0x006d }
            r0.mo5262i(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x004b:
            r2.f4835f = r1     // Catch:{ all -> 0x006d }
            java.util.ArrayDeque<u3.w> r0 = r2.f4834e     // Catch:{ all -> 0x006d }
            r0.add(r3)     // Catch:{ all -> 0x006d }
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            c4.i$c r3 = r2.f4836g     // Catch:{ all -> 0x006d }
            r3.mo5261h(r1)     // Catch:{ all -> 0x006d }
        L_0x0059:
            boolean r3 = r2.mo5250u()     // Catch:{ all -> 0x006d }
            r2.notifyAll()     // Catch:{ all -> 0x006d }
            t2.s r4 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x006d }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006c
            c4.f r3 = r2.f4843n
            int r4 = r2.f4842m
            r3.mo5178u0(r4)
        L_0x006c:
            return
        L_0x006d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c4.C1337i.mo5253x(u3.w, boolean):void");
    }

    /* renamed from: y */
    public final synchronized void mo5254y(C1304b bVar) {
        C1924k.m9142h(bVar, "errorCode");
        if (this.f4840k == null) {
            this.f4840k = bVar;
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void mo5255z(long j) {
        this.f4831b = j;
    }
}
