package p104p3;

import kotlinx.coroutines.internal.C2397b0;
import kotlinx.coroutines.internal.C2399c0;
import kotlinx.coroutines.internal.C2421n;
import kotlinx.coroutines.internal.C2422o;
import kotlinx.coroutines.internal.C2423p;
import kotlinx.coroutines.internal.C2435w;
import p034e3.C1780l;
import p092n3.C2729e;
import p092n3.C2761l;
import p092n3.C2763l0;
import p092n3.C2766m;
import p092n3.C2770n;
import p092n3.C2775o;
import p127t2.C3178l;
import p127t2.C3181m;
import p127t2.C3187s;
import p145w2.C3443d;
import p157y2.C3563b;
import p157y2.C3569h;

/* renamed from: p3.a */
public abstract class C2924a<E> extends C2930c<E> implements C2935f<E> {

    /* renamed from: p3.a$a */
    private static final class C2925a<E> implements C2937g<E> {

        /* renamed from: a */
        public final C2924a<E> f9670a;

        /* renamed from: b */
        private Object f9671b = C2929b.f9680d;

        public C2925a(C2924a<E> aVar) {
            this.f9670a = aVar;
        }

        /* renamed from: b */
        private final boolean m13248b(Object obj) {
            if (!(obj instanceof C2943j)) {
                return true;
            }
            C2943j jVar = (C2943j) obj;
            if (jVar.f9703g == null) {
                return false;
            }
            throw C2397b0.m11193a(jVar.mo10132I());
        }

        /* renamed from: c */
        private final Object m13249c(C3443d<? super Boolean> dVar) {
            Object obj;
            C2766m b = C2775o.m12471b(C3527c.m15550b(dVar));
            C2926b bVar = new C2926b(this, b);
            while (true) {
                if (this.f9670a.m13239p(bVar)) {
                    this.f9670a.m13240w(b, bVar);
                    break;
                }
                Object v = this.f9670a.mo10101v();
                mo10103d(v);
                if (v instanceof C2943j) {
                    C2943j jVar = (C2943j) v;
                    if (jVar.f9703g == null) {
                        C3178l.C3179a aVar = C3178l.f10555d;
                        obj = C3563b.m15728a(false);
                    } else {
                        C3178l.C3179a aVar2 = C3178l.f10555d;
                        obj = C3181m.m14058a(jVar.mo10132I());
                    }
                    b.mo8960j(C3178l.m14054a(obj));
                } else if (v != C2929b.f9680d) {
                    Boolean a = C3563b.m15728a(true);
                    C1780l<E, C3187s> lVar = this.f9670a.f9684b;
                    b.mo9512p(a, lVar != null ? C2435w.m11332a(lVar, v, b.mo8958b()) : null);
                }
            }
            Object A = b.mo9518A();
            if (A == C3530d.m15553c()) {
                C3569h.m15747c(dVar);
            }
            return A;
        }

        /* renamed from: a */
        public Object mo10102a(C3443d<? super Boolean> dVar) {
            Object obj = this.f9671b;
            C2399c0 c0Var = C2929b.f9680d;
            if (obj == c0Var) {
                obj = this.f9670a.mo10101v();
                this.f9671b = obj;
                if (obj == c0Var) {
                    return m13249c(dVar);
                }
            }
            return C3563b.m15728a(m13248b(obj));
        }

        /* renamed from: d */
        public final void mo10103d(Object obj) {
            this.f9671b = obj;
        }

        public E next() {
            E e = this.f9671b;
            if (!(e instanceof C2943j)) {
                E e2 = C2929b.f9680d;
                if (e != e2) {
                    this.f9671b = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw C2397b0.m11193a(((C2943j) e).mo10132I());
        }
    }

    /* renamed from: p3.a$b */
    private static class C2926b<E> extends C2948o<E> {

        /* renamed from: g */
        public final C2925a<E> f9672g;

        /* renamed from: h */
        public final C2761l<Boolean> f9673h;

        public C2926b(C2925a<E> aVar, C2761l<? super Boolean> lVar) {
            this.f9672g = aVar;
            this.f9673h = lVar;
        }

        /* renamed from: D */
        public void mo10105D(C2943j<?> jVar) {
            Object a = jVar.f9703g == null ? C2761l.C2762a.m12398a(this.f9673h, Boolean.FALSE, (Object) null, 2, (Object) null) : this.f9673h.mo9511o(jVar.mo10132I());
            if (a != null) {
                this.f9672g.mo10103d(jVar);
                this.f9673h.mo9513q(a);
            }
        }

        /* renamed from: E */
        public C1780l<Throwable, C3187s> mo10106E(E e) {
            C1780l<E, C3187s> lVar = this.f9672g.f9670a.f9684b;
            if (lVar != null) {
                return C2435w.m11332a(lVar, e, this.f9673h.mo8958b());
            }
            return null;
        }

        /* renamed from: g */
        public C2399c0 mo10107g(E e, C2423p.C2425b bVar) {
            if (this.f9673h.mo9514r(Boolean.TRUE, (Object) null, mo10106E(e)) == null) {
                return null;
            }
            return C2770n.f9071a;
        }

        /* renamed from: i */
        public void mo10108i(E e) {
            this.f9672g.mo10103d(e);
            this.f9673h.mo9513q(C2770n.f9071a);
        }

        public String toString() {
            return "ReceiveHasNext@" + C2763l0.m12400b(this);
        }
    }

    /* renamed from: p3.a$c */
    private final class C2927c extends C2729e {

        /* renamed from: d */
        private final C2948o<?> f9674d;

        public C2927c(C2948o<?> oVar) {
            this.f9674d = oVar;
        }

        /* renamed from: a */
        public void mo9498a(Throwable th) {
            if (this.f9674d.mo9001y()) {
                C2924a.this.mo10099t();
            }
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo3836n(Object obj) {
            mo9498a((Throwable) obj);
            return C3187s.f10561a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f9674d + ']';
        }
    }

    /* renamed from: p3.a$d */
    public static final class C2928d extends C2423p.C2424a {

        /* renamed from: d */
        final /* synthetic */ C2924a f9676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2928d(C2423p pVar, C2924a aVar) {
            super(pVar);
            this.f9676d = aVar;
        }

        /* renamed from: i */
        public Object mo8955g(C2423p pVar) {
            if (this.f9676d.mo10098s()) {
                return null;
            }
            return C2422o.m11277a();
        }
    }

    public C2924a(C1780l<? super E, C3187s> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m13239p(C2948o<? super E> oVar) {
        boolean q = mo10096q(oVar);
        if (q) {
            mo10100u();
        }
        return q;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m13240w(C2761l<?> lVar, C2948o<?> oVar) {
        lVar.mo9510m(new C2927c(oVar));
    }

    public final C2937g<E> iterator() {
        return new C2925a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C2950q<E> mo10095l() {
        C2950q<E> l = super.mo10095l();
        if (l != null && !(l instanceof C2943j)) {
            mo10099t();
        }
        return l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo10096q(C2948o<? super E> oVar) {
        int B;
        C2423p u;
        if (mo10097r()) {
            C2421n e = mo10114e();
            do {
                u = e.mo8998u();
                if (!(!(u instanceof C2952s))) {
                    return false;
                }
            } while (!u.mo8993m(oVar, e));
        } else {
            C2421n e2 = mo10114e();
            C2928d dVar = new C2928d(oVar, this);
            do {
                C2423p u2 = e2.mo8998u();
                if (!(!(u2 instanceof C2952s))) {
                    return false;
                }
                B = u2.mo8992B(oVar, e2, dVar);
                if (B != 1) {
                }
            } while (B != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo10097r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo10098s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo10099t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo10100u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo10101v() {
        while (true) {
            C2952s m = mo10118m();
            if (m == null) {
                return C2929b.f9680d;
            }
            if (m.mo10122E((C2423p.C2425b) null) != null) {
                m.mo10120C();
                return m.mo10121D();
            }
            m.mo10136F();
        }
    }
}
