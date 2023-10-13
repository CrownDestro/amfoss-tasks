package p036e5;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p062i4.C2100b0;
import p062i4.C2111f;
import p062i4.C2114h;
import p062i4.C2118k;
import p062i4.C2123p;
import p134u3.C3304d0;
import p134u3.C3306e;
import p134u3.C3312f;
import p134u3.C3313f0;
import p134u3.C3320g0;
import p134u3.C3368z;

/* renamed from: e5.n */
final class C1851n<T> implements C1818b<T> {

    /* renamed from: d */
    private final C1881s f6707d;

    /* renamed from: e */
    private final Object[] f6708e;

    /* renamed from: f */
    private final C3306e.C3307a f6709f;

    /* renamed from: g */
    private final C1828f<C3320g0, T> f6710g;

    /* renamed from: h */
    private volatile boolean f6711h;
    @GuardedBy("this")
    @Nullable

    /* renamed from: i */
    private C3306e f6712i;
    @GuardedBy("this")
    @Nullable

    /* renamed from: j */
    private Throwable f6713j;
    @GuardedBy("this")

    /* renamed from: k */
    private boolean f6714k;

    /* renamed from: e5.n$a */
    class C1852a implements C3312f {

        /* renamed from: a */
        final /* synthetic */ C1821d f6715a;

        C1852a(C1821d dVar) {
            this.f6715a = dVar;
        }

        /* renamed from: c */
        private void m8953c(Throwable th) {
            try {
                this.f6715a.mo7520a(C1851n.this, th);
            } catch (Throwable th2) {
                C1890y.m9075s(th2);
                th2.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo7541a(C3306e eVar, IOException iOException) {
            m8953c(iOException);
        }

        /* renamed from: b */
        public void mo7542b(C3306e eVar, C3313f0 f0Var) {
            try {
                try {
                    this.f6715a.mo7521b(C1851n.this, C1851n.this.mo7540g(f0Var));
                } catch (Throwable th) {
                    C1890y.m9075s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C1890y.m9075s(th2);
                m8953c(th2);
            }
        }
    }

    /* renamed from: e5.n$b */
    static final class C1853b extends C3320g0 {

        /* renamed from: e */
        private final C3320g0 f6717e;

        /* renamed from: f */
        private final C2114h f6718f;
        @Nullable

        /* renamed from: g */
        IOException f6719g;

        /* renamed from: e5.n$b$a */
        class C1854a extends C2118k {
            C1854a(C2100b0 b0Var) {
                super(b0Var);
            }

            /* renamed from: M */
            public long mo5087M(C2111f fVar, long j) {
                try {
                    return super.mo5087M(fVar, j);
                } catch (IOException e) {
                    C1853b.this.f6719g = e;
                    throw e;
                }
            }
        }

        C1853b(C3320g0 g0Var) {
            this.f6717e = g0Var;
            this.f6718f = C2123p.m9841d(new C1854a(g0Var.mo86i()));
        }

        /* renamed from: c */
        public long mo84c() {
            return this.f6717e.mo84c();
        }

        public void close() {
            this.f6717e.close();
        }

        /* renamed from: f */
        public C3368z mo85f() {
            return this.f6717e.mo85f();
        }

        /* renamed from: i */
        public C2114h mo86i() {
            return this.f6718f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo7544n() {
            IOException iOException = this.f6719g;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: e5.n$c */
    static final class C1855c extends C3320g0 {
        @Nullable

        /* renamed from: e */
        private final C3368z f6721e;

        /* renamed from: f */
        private final long f6722f;

        C1855c(@Nullable C3368z zVar, long j) {
            this.f6721e = zVar;
            this.f6722f = j;
        }

        /* renamed from: c */
        public long mo84c() {
            return this.f6722f;
        }

        /* renamed from: f */
        public C3368z mo85f() {
            return this.f6721e;
        }

        /* renamed from: i */
        public C2114h mo86i() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C1851n(C1881s sVar, Object[] objArr, C3306e.C3307a aVar, C1828f<C3320g0, T> fVar) {
        this.f6707d = sVar;
        this.f6708e = objArr;
        this.f6709f = aVar;
        this.f6710g = fVar;
    }

    /* renamed from: d */
    private C3306e m8945d() {
        C3306e b = this.f6709f.mo10812b(this.f6707d.mo7577a(this.f6708e));
        Objects.requireNonNull(b, "Call.Factory returned null.");
        return b;
    }

    @GuardedBy("this")
    /* renamed from: e */
    private C3306e m8946e() {
        C3306e eVar = this.f6712i;
        if (eVar != null) {
            return eVar;
        }
        Throwable th = this.f6713j;
        if (th == null) {
            try {
                C3306e d = m8945d();
                this.f6712i = d;
                return d;
            } catch (IOException | Error | RuntimeException e) {
                C1890y.m9075s(e);
                this.f6713j = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    /* renamed from: a */
    public synchronized C3304d0 mo7512a() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m8946e().mo10932a();
    }

    /* renamed from: b */
    public C1851n<T> mo7515h() {
        return new C1851n<>(this.f6707d, this.f6708e, this.f6709f, this.f6710g);
    }

    /* renamed from: c */
    public boolean mo7513c() {
        boolean z = true;
        if (this.f6711h) {
            return true;
        }
        synchronized (this) {
            C3306e eVar = this.f6712i;
            if (eVar == null || !eVar.mo10933c()) {
                z = false;
            }
        }
        return z;
    }

    public void cancel() {
        C3306e eVar;
        this.f6711h = true;
        synchronized (this) {
            eVar = this.f6712i;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1883t<T> mo7540g(C3313f0 f0Var) {
        C3320g0 a = f0Var.mo10953a();
        C3313f0 c = f0Var.mo10947G().mo10964b(new C1855c(a.mo85f(), a.mo84c())).mo10965c();
        int i = c.mo10958i();
        if (i < 200 || i >= 300) {
            try {
                return C1883t.m9032c(C1890y.m9057a(a), c);
            } finally {
                a.close();
            }
        } else if (i == 204 || i == 205) {
            a.close();
            return C1883t.m9033f(null, c);
        } else {
            C1853b bVar = new C1853b(a);
            try {
                return C1883t.m9033f(this.f6710g.mo7505a(bVar), c);
            } catch (RuntimeException e) {
                bVar.mo7544n();
                throw e;
            }
        }
    }

    /* renamed from: n */
    public void mo7516n(C1821d<T> dVar) {
        C3306e eVar;
        Throwable th;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            if (!this.f6714k) {
                this.f6714k = true;
                eVar = this.f6712i;
                th = this.f6713j;
                if (eVar == null && th == null) {
                    try {
                        C3306e d = m8945d();
                        this.f6712i = d;
                        eVar = d;
                    } catch (Throwable th2) {
                        th = th2;
                        C1890y.m9075s(th);
                        this.f6713j = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.mo7520a(this, th);
            return;
        }
        if (this.f6711h) {
            eVar.cancel();
        }
        eVar.mo10935f(new C1852a(dVar));
    }
}
