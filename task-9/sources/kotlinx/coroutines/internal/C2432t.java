package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p092n3.C2815z1;

/* renamed from: kotlinx.coroutines.internal.t */
public final class C2432t {

    /* renamed from: a */
    public static final C2432t f8358a;

    /* renamed from: b */
    private static final boolean f8359b = C2401d0.m11205e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final C2815z1 f8360c;

    static {
        C2432t tVar = new C2432t();
        f8358a = tVar;
        f8360c = tVar.m11319a();
    }

    private C2432t() {
    }

    /* renamed from: a */
    private final C2815z1 m11319a() {
        T t;
        C2815z1 e;
        Class<C2431s> cls = C2431s.class;
        try {
            List<C2431s> c = f8359b ? C2413i.f8330a.mo8980c() : C2487j.m11480j(C2484h.m11471a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator<T> it = c.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int a = ((C2431s) t).mo9018a();
                    do {
                        T next = it.next();
                        int a2 = ((C2431s) next).mo9018a();
                        if (a < a2) {
                            t = next;
                            a = a2;
                        }
                    } while (it.hasNext());
                }
            }
            C2431s sVar = (C2431s) t;
            return (sVar == null || (e = C2433u.m11324e(sVar, c)) == null) ? C2433u.m11321b((Throwable) null, (String) null, 3, (Object) null) : e;
        } catch (Throwable th) {
            return C2433u.m11321b(th, (String) null, 2, (Object) null);
        }
    }
}
