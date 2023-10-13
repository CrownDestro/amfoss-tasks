package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.C2414i0;
import p041f3.C1924k;

/* renamed from: kotlinx.coroutines.internal.h0 */
public class C2412h0<T extends C2414i0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f8329a;

    /* renamed from: f */
    private final T[] m11242f() {
        T[] tArr = this.f8329a;
        if (tArr == null) {
            T[] tArr2 = new C2414i0[4];
            this.f8329a = tArr2;
            return tArr2;
        } else if (mo8974c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo8974c() * 2);
            C1924k.m9140f(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (C2414i0[]) copyOf;
            this.f8329a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m11243j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m11244k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo8974c()) {
                T[] tArr = this.f8329a;
                C1924k.m9138d(tArr);
                int i3 = i2 + 1;
                if (i3 < mo8974c()) {
                    T t = tArr[i3];
                    C1924k.m9138d(t);
                    T t2 = tArr[i2];
                    C1924k.m9138d(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                C1924k.m9138d(t3);
                T t4 = tArr[i2];
                C1924k.m9138d(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m11246m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m11245l(int i) {
        while (i > 0) {
            T[] tArr = this.f8329a;
            C1924k.m9138d(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C1924k.m9138d(t);
            T t2 = tArr[i];
            C1924k.m9138d(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m11246m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m11246m(int i, int i2) {
        T[] tArr = this.f8329a;
        C1924k.m9138d(tArr);
        T t = tArr[i2];
        C1924k.m9138d(t);
        T t2 = tArr[i];
        C1924k.m9138d(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo8982a(i);
        t2.mo8982a(i2);
    }

    /* renamed from: a */
    public final void mo8972a(T t) {
        t.mo8983c(this);
        C2414i0[] f = m11242f();
        int c = mo8974c();
        m11243j(c + 1);
        f[c] = t;
        t.mo8982a(c);
        m11245l(c);
    }

    /* renamed from: b */
    public final T mo8973b() {
        T[] tArr = this.f8329a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int mo8974c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo8975d() {
        return mo8974c() == 0;
    }

    /* renamed from: e */
    public final T mo8976e() {
        T b;
        synchronized (this) {
            b = mo8973b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo8977g(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo8984d() == null) {
                z = false;
            } else {
                mo8978h(t.mo8985f());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo8978h(int i) {
        T[] tArr = this.f8329a;
        C1924k.m9138d(tArr);
        m11243j(mo8974c() - 1);
        if (i < mo8974c()) {
            m11246m(i, mo8974c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C1924k.m9138d(t);
                T t2 = tArr[i2];
                C1924k.m9138d(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m11246m(i, i2);
                    m11245l(i2);
                }
            }
            m11244k(i);
        }
        T t3 = tArr[mo8974c()];
        C1924k.m9138d(t3);
        t3.mo8983c((C2412h0<?>) null);
        t3.mo8982a(-1);
        tArr[mo8974c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T mo8979i() {
        T h;
        synchronized (this) {
            h = mo8974c() > 0 ? mo8978h(0) : null;
        }
        return h;
    }
}
