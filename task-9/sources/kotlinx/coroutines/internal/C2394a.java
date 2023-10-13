package kotlinx.coroutines.internal;

import java.util.Objects;

/* renamed from: kotlinx.coroutines.internal.a */
public class C2394a<T> {

    /* renamed from: a */
    private Object[] f8302a = new Object[16];

    /* renamed from: b */
    private int f8303b;

    /* renamed from: c */
    private int f8304c;

    /* renamed from: b */
    private final void m11184b() {
        Object[] objArr = this.f8302a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C3255g.m14314f(objArr, objArr3, 0, this.f8303b, 0, 10, (Object) null);
        Object[] objArr4 = this.f8302a;
        int length2 = objArr4.length;
        int i = this.f8303b;
        Object[] unused2 = C3255g.m14314f(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f8302a = objArr3;
        this.f8303b = 0;
        this.f8304c = length;
    }

    /* renamed from: a */
    public final void mo8941a(T t) {
        Object[] objArr = this.f8302a;
        int i = this.f8304c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f8304c = length;
        if (length == this.f8303b) {
            m11184b();
        }
    }

    /* renamed from: c */
    public final boolean mo8942c() {
        return this.f8303b == this.f8304c;
    }

    /* renamed from: d */
    public final T mo8943d() {
        int i = this.f8303b;
        if (i == this.f8304c) {
            return null;
        }
        T[] tArr = this.f8302a;
        T t = tArr[i];
        tArr[i] = null;
        this.f8303b = (i + 1) & (tArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
