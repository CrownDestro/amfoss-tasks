package p080l3;

import java.util.Iterator;
import p041f3.C1924k;
import p048g3.C1964a;

/* renamed from: l3.b */
public final class C2477b<T> implements C2480d<T>, C2479c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2480d<T> f8484a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f8485b;

    /* renamed from: l3.b$a */
    public static final class C2478a implements Iterator<T>, C1964a {

        /* renamed from: d */
        private final Iterator<T> f8486d;

        /* renamed from: e */
        private int f8487e;

        C2478a(C2477b<T> bVar) {
            this.f8486d = bVar.f8484a.iterator();
            this.f8487e = bVar.f8485b;
        }

        /* renamed from: a */
        private final void m11463a() {
            while (this.f8487e > 0 && this.f8486d.hasNext()) {
                this.f8486d.next();
                this.f8487e--;
            }
        }

        public boolean hasNext() {
            m11463a();
            return this.f8486d.hasNext();
        }

        public T next() {
            m11463a();
            return this.f8486d.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2477b(C2480d<? extends T> dVar, int i) {
        C1924k.m9141g(dVar, "sequence");
        this.f8484a = dVar;
        this.f8485b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    /* renamed from: a */
    public C2480d<T> mo9091a(int i) {
        int i2 = this.f8485b + i;
        return i2 < 0 ? new C2477b(this, i) : new C2477b(this.f8484a, i2);
    }

    public Iterator<T> iterator() {
        return new C2478a(this);
    }
}
