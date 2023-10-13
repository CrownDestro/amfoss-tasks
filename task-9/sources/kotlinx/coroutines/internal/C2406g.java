package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p034e3.C1780l;
import p041f3.C1924k;
import p092n3.C2706a0;
import p092n3.C2724d0;
import p092n3.C2756j2;
import p092n3.C2761l;
import p092n3.C2763l0;
import p092n3.C2766m;
import p092n3.C2790s0;
import p092n3.C2807x;
import p092n3.C2814z0;
import p127t2.C3187s;
import p145w2.C3443d;
import p145w2.C3448g;
import p157y2.C3566e;

/* renamed from: kotlinx.coroutines.internal.g */
public final class C2406g<T> extends C2790s0<T> implements C3566e, C3443d<T> {

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f8315k = AtomicReferenceFieldUpdater.newUpdater(C2406g.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: g */
    public final C2724d0 f8316g;

    /* renamed from: h */
    public final C3443d<T> f8317h;

    /* renamed from: i */
    public Object f8318i = C2411h.f8327a;

    /* renamed from: j */
    public final Object f8319j = C2407g0.m11231b(mo8958b());

    public C2406g(C2724d0 d0Var, C3443d<? super T> dVar) {
        super(-1);
        this.f8316g = d0Var;
        this.f8317h = dVar;
    }

    /* renamed from: s */
    private final C2766m<?> m11217s() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C2766m) {
            return (C2766m) obj;
        }
        return null;
    }

    /* renamed from: a */
    public void mo8957a(Object obj, Throwable th) {
        if (obj instanceof C2807x) {
            ((C2807x) obj).f9109b.mo3836n(th);
        }
    }

    /* renamed from: b */
    public C3448g mo8958b() {
        return this.f8317h.mo8958b();
    }

    /* renamed from: c */
    public C3443d<T> mo8959c() {
        return this;
    }

    /* renamed from: e */
    public C3566e mo8946e() {
        C3443d<T> dVar = this.f8317h;
        if (dVar instanceof C3566e) {
            return (C3566e) dVar;
        }
        return null;
    }

    /* renamed from: j */
    public void mo8960j(Object obj) {
        C3448g b;
        Object c;
        C3448g b2 = this.f8317h.mo8958b();
        Object d = C2706a0.m12284d(obj, (C1780l) null, 1, (Object) null);
        if (this.f8316g.mo9021b0(b2)) {
            this.f8318i = d;
            this.f9086f = 0;
            this.f8316g.mo8989a0(b2, this);
            return;
        }
        C2814z0 a = C2756j2.f9055a.mo9505a();
        if (a.mo9601j0()) {
            this.f8318i = d;
            this.f9086f = 0;
            a.mo9599f0(this);
            return;
        }
        a.mo9600h0(true);
        try {
            b = mo8958b();
            c = C2407g0.m11232c(b, this.f8319j);
            this.f8317h.mo8960j(obj);
            C3187s sVar = C3187s.f10561a;
            C2407g0.m11230a(b, c);
            do {
            } while (a.mo9603l0());
        } catch (Throwable th) {
            try {
                mo9553i(th, (Throwable) null);
            } catch (Throwable th2) {
                a.mo9598d0(true);
                throw th2;
            }
        }
        a.mo9598d0(true);
    }

    /* renamed from: k */
    public Object mo8961k() {
        Object obj = this.f8318i;
        this.f8318i = C2411h.f8327a;
        return obj;
    }

    /* renamed from: l */
    public final void mo8962l() {
        do {
        } while (this._reusableCancellableContinuation == C2411h.f8328b);
    }

    /* renamed from: n */
    public final C2766m<T> mo8963n() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C2411h.f8328b;
                return null;
            } else if (obj instanceof C2766m) {
                if (C2398c.m11194a(f8315k, this, obj, C2411h.f8328b)) {
                    return (C2766m) obj;
                }
            } else if (obj != C2411h.f8328b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: t */
    public final boolean mo8964t() {
        return this._reusableCancellableContinuation != null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f8316g + ", " + C2763l0.m12401c(this.f8317h) + ']';
    }

    /* renamed from: u */
    public final boolean mo8966u(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C2399c0 c0Var = C2411h.f8328b;
            if (C1924k.m9136b(obj, c0Var)) {
                if (C2398c.m11194a(f8315k, this, c0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C2398c.m11194a(f8315k, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo8967v() {
        mo8962l();
        C2766m<?> s = m11217s();
        if (s != null) {
            s.mo9531w();
        }
    }

    /* renamed from: w */
    public final Throwable mo8968w(C2761l<?> lVar) {
        C2399c0 c0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            c0Var = C2411h.f8328b;
            if (obj != c0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (C2398c.m11194a(f8315k, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C2398c.m11194a(f8315k, this, c0Var, lVar));
        return null;
    }
}
