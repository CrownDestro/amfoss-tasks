package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.d */
public abstract class C2400d<T> extends C2437x {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f8311a = AtomicReferenceFieldUpdater.newUpdater(C2400d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C2396b.f8306a;

    /* renamed from: a */
    public C2400d<?> mo8950a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo8951c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C2396b.f8306a) {
            obj2 = mo8953e(mo8955g(obj));
        }
        mo8952d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo8952d(T t, Object obj);

    /* renamed from: e */
    public final Object mo8953e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C2396b.f8306a;
        return obj2 != obj3 ? obj2 : C2398c.m11194a(f8311a, this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long mo8954f() {
        return 0;
    }

    /* renamed from: g */
    public abstract Object mo8955g(T t);
}
