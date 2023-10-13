package p080l3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p041f3.C1924k;

/* renamed from: l3.a */
public final class C2476a<T> implements C2480d<T> {

    /* renamed from: a */
    private final AtomicReference<C2480d<T>> f8483a;

    public C2476a(C2480d<? extends T> dVar) {
        C1924k.m9141g(dVar, "sequence");
        this.f8483a = new AtomicReference<>(dVar);
    }

    public Iterator<T> iterator() {
        C2480d andSet = this.f8483a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
