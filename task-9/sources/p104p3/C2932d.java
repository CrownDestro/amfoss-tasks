package p104p3;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.C2399c0;
import kotlinx.coroutines.internal.C2423p;
import p034e3.C1780l;
import p041f3.C1924k;
import p127t2.C3176j;
import p127t2.C3187s;

/* renamed from: p3.d */
public class C2932d<E> extends C2924a<E> {

    /* renamed from: e */
    private final int f9687e;

    /* renamed from: f */
    private final C2934e f9688f;

    /* renamed from: g */
    private final ReentrantLock f9689g;

    /* renamed from: h */
    private Object[] f9690h;

    /* renamed from: i */
    private int f9691i;
    private volatile /* synthetic */ int size;

    /* renamed from: p3.d$a */
    public /* synthetic */ class C2933a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9692a;

        static {
            int[] iArr = new int[C2934e.values().length];
            iArr[C2934e.SUSPEND.ordinal()] = 1;
            iArr[C2934e.DROP_LATEST.ordinal()] = 2;
            iArr[C2934e.DROP_OLDEST.ordinal()] = 3;
            f9692a = iArr;
        }
    }

    public C2932d(int i, C2934e eVar, C1780l<? super E, C3187s> lVar) {
        super(lVar);
        this.f9687e = i;
        this.f9688f = eVar;
        if (i < 1 ? false : true) {
            this.f9689g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C3255g.m14317i(objArr, C2929b.f9677a, 0, 0, 6, (Object) null);
            this.f9690h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: x */
    private final void m13276x(int i, E e) {
        if (i < this.f9687e) {
            m13277y(i);
            Object[] objArr = this.f9690h;
            objArr[(this.f9691i + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.f9690h;
        int i2 = this.f9691i;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f9691i = (i2 + 1) % objArr2.length;
    }

    /* renamed from: y */
    private final void m13277y(int i) {
        Object[] objArr = this.f9690h;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f9687e);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f9690h;
                objArr2[i2] = objArr3[(this.f9691i + i2) % objArr3.length];
            }
            C3255g.m14316h(objArr2, C2929b.f9677a, i, min);
            this.f9690h = objArr2;
            this.f9691i = 0;
        }
    }

    /* renamed from: z */
    private final C2399c0 m13278z(int i) {
        if (i < this.f9687e) {
            this.size = i + 1;
            return null;
        }
        int i2 = C2933a.f9692a[this.f9688f.ordinal()];
        if (i2 == 1) {
            return C2929b.f9679c;
        }
        if (i2 == 2) {
            return C2929b.f9678b;
        }
        if (i2 == 3) {
            return null;
        }
        throw new C3176j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo10112c() {
        return "(buffer:capacity=" + this.f9687e + ",size=" + this.size + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo10115i(E e) {
        C2950q l;
        ReentrantLock reentrantLock = this.f9689g;
        reentrantLock.lock();
        int i = this.size;
        C2943j<?> d = mo10113d();
        if (d != null) {
            reentrantLock.unlock();
            return d;
        }
        C2399c0 z = m13278z(i);
        if (z != null) {
            reentrantLock.unlock();
            return z;
        }
        if (i == 0) {
            do {
                try {
                    l = mo10095l();
                    if (l != null) {
                        if (l instanceof C2943j) {
                            this.size = i;
                            reentrantLock.unlock();
                            return l;
                        }
                        C1924k.m9138d(l);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } while (l.mo10107g(e, (C2423p.C2425b) null) == null);
            this.size = i;
            C3187s sVar = C3187s.f10561a;
            reentrantLock.unlock();
            l.mo10108i(e);
            return l.mo10134d();
        }
        m13276x(i, e);
        C2399c0 c0Var = C2929b.f9678b;
        reentrantLock.unlock();
        return c0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo10096q(C2948o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f9689g;
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
        return this.size == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo10101v() {
        ReentrantLock reentrantLock = this.f9689g;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object d = mo10113d();
                if (d == null) {
                    d = C2929b.f9680d;
                }
                return d;
            }
            Object[] objArr = this.f9690h;
            int i2 = this.f9691i;
            Object obj = objArr[i2];
            C2952s sVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C2929b.f9680d;
            boolean z = false;
            if (i == this.f9687e) {
                C2952s sVar2 = null;
                while (true) {
                    C2952s m = mo10118m();
                    if (m == null) {
                        sVar = sVar2;
                        break;
                    }
                    C1924k.m9138d(m);
                    if (m.mo10122E((C2423p.C2425b) null) != null) {
                        obj2 = m.mo10121D();
                        sVar = m;
                        z = true;
                        break;
                    }
                    m.mo10136F();
                    sVar2 = m;
                }
            }
            if (obj2 != C2929b.f9680d && !(obj2 instanceof C2943j)) {
                this.size = i;
                Object[] objArr2 = this.f9690h;
                objArr2[(this.f9691i + i) % objArr2.length] = obj2;
            }
            this.f9691i = (this.f9691i + 1) % this.f9690h.length;
            C3187s sVar3 = C3187s.f10561a;
            reentrantLock.unlock();
            if (z) {
                C1924k.m9138d(sVar);
                sVar.mo10120C();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
