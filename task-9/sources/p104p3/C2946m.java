package p104p3;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.C2399c0;
import kotlinx.coroutines.internal.C2418k0;
import kotlinx.coroutines.internal.C2423p;
import kotlinx.coroutines.internal.C2435w;
import p034e3.C1780l;
import p041f3.C1924k;
import p127t2.C3187s;

/* renamed from: p3.m */
public class C2946m<E> extends C2924a<E> {

    /* renamed from: e */
    private final ReentrantLock f9704e = new ReentrantLock();

    /* renamed from: f */
    private Object f9705f = C2929b.f9677a;

    public C2946m(C1780l<? super E, C3187s> lVar) {
        super(lVar);
    }

    /* renamed from: x */
    private final C2418k0 m13305x(Object obj) {
        C1780l<E, C3187s> lVar;
        Object obj2 = this.f9705f;
        C2418k0 k0Var = null;
        if (!(obj2 == C2929b.f9677a || (lVar = this.f9684b) == null)) {
            k0Var = C2435w.m11335d(lVar, obj2, (C2418k0) null, 2, (Object) null);
        }
        this.f9705f = obj;
        return k0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo10112c() {
        ReentrantLock reentrantLock = this.f9704e;
        reentrantLock.lock();
        try {
            return "(value=" + this.f9705f + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo10115i(E e) {
        C2950q l;
        ReentrantLock reentrantLock = this.f9704e;
        reentrantLock.lock();
        try {
            C2943j<?> d = mo10113d();
            if (d != null) {
                return d;
            }
            if (this.f9705f == C2929b.f9677a) {
                do {
                    l = mo10095l();
                    if (l != null) {
                        if (l instanceof C2943j) {
                            reentrantLock.unlock();
                            return l;
                        }
                        C1924k.m9138d(l);
                    }
                } while (l.mo10107g(e, (C2423p.C2425b) null) == null);
                C3187s sVar = C3187s.f10561a;
                reentrantLock.unlock();
                l.mo10108i(e);
                return l.mo10134d();
            }
            C2418k0 x = m13305x(e);
            if (x == null) {
                C2399c0 c0Var = C2929b.f9678b;
                reentrantLock.unlock();
                return c0Var;
            }
            throw x;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo10096q(C2948o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f9704e;
        reentrantLock.lock();
        try {
            return super.mo10096q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo10097r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo10098s() {
        ReentrantLock reentrantLock = this.f9704e;
        reentrantLock.lock();
        try {
            return this.f9705f == C2929b.f9677a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo10101v() {
        ReentrantLock reentrantLock = this.f9704e;
        reentrantLock.lock();
        try {
            Object obj = this.f9705f;
            C2399c0 c0Var = C2929b.f9677a;
            if (obj == c0Var) {
                Object d = mo10113d();
                if (d == null) {
                    d = C2929b.f9680d;
                }
                return d;
            }
            this.f9705f = c0Var;
            C3187s sVar = C3187s.f10561a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
