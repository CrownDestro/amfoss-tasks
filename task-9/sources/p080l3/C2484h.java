package p080l3;

import java.util.Iterator;
import p041f3.C1924k;

/* renamed from: l3.h */
class C2484h extends C2483g {

    /* renamed from: l3.h$a */
    public static final class C2485a implements C2480d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f8488a;

        public C2485a(Iterator it) {
            this.f8488a = it;
        }

        public Iterator<T> iterator() {
            return this.f8488a;
        }
    }

    /* renamed from: a */
    public static <T> C2480d<T> m11471a(Iterator<? extends T> it) {
        C1924k.m9141g(it, "<this>");
        return m11472b(new C2485a(it));
    }

    /* renamed from: b */
    public static final <T> C2480d<T> m11472b(C2480d<? extends T> dVar) {
        C1924k.m9141g(dVar, "<this>");
        return dVar instanceof C2476a ? dVar : new C2476a(dVar);
    }
}
