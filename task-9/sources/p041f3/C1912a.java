package p041f3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p048g3.C1964a;

/* renamed from: f3.a */
final class C1912a<T> implements Iterator<T>, C1964a {

    /* renamed from: d */
    private final T[] f6877d;

    /* renamed from: e */
    private int f6878e;

    public C1912a(T[] tArr) {
        C1924k.m9141g(tArr, "array");
        this.f6877d = tArr;
    }

    public boolean hasNext() {
        return this.f6878e < this.f6877d.length;
    }

    public T next() {
        try {
            T[] tArr = this.f6877d;
            int i = this.f6878e;
            this.f6878e = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f6878e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
