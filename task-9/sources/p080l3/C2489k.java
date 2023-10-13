package p080l3;

import java.util.Iterator;
import p034e3.C1780l;
import p041f3.C1924k;
import p048g3.C1964a;

/* renamed from: l3.k */
public final class C2489k<T, R> implements C2480d<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2480d<T> f8490a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1780l<T, R> f8491b;

    /* renamed from: l3.k$a */
    public static final class C2490a implements Iterator<R>, C1964a {

        /* renamed from: d */
        private final Iterator<T> f8492d;

        /* renamed from: e */
        final /* synthetic */ C2489k<T, R> f8493e;

        C2490a(C2489k<T, R> kVar) {
            this.f8493e = kVar;
            this.f8492d = kVar.f8490a.iterator();
        }

        public boolean hasNext() {
            return this.f8492d.hasNext();
        }

        public R next() {
            return this.f8493e.f8491b.mo3836n(this.f8492d.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2489k(C2480d<? extends T> dVar, C1780l<? super T, ? extends R> lVar) {
        C1924k.m9141g(dVar, "sequence");
        C1924k.m9141g(lVar, "transformer");
        this.f8490a = dVar;
        this.f8491b = lVar;
    }

    public Iterator<R> iterator() {
        return new C2490a(this);
    }
}
