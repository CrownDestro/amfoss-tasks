package p036e5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p036e5.C1890y;
import p134u3.C3306e;
import p134u3.C3313f0;
import p134u3.C3320g0;
import p145w2.C3443d;

/* renamed from: e5.k */
abstract class C1837k<ResponseT, ReturnT> extends C1887v<ReturnT> {

    /* renamed from: a */
    private final C1881s f6687a;

    /* renamed from: b */
    private final C3306e.C3307a f6688b;

    /* renamed from: c */
    private final C1828f<C3320g0, ResponseT> f6689c;

    /* renamed from: e5.k$a */
    static final class C1838a<ResponseT, ReturnT> extends C1837k<ResponseT, ReturnT> {

        /* renamed from: d */
        private final C1819c<ResponseT, ReturnT> f6690d;

        C1838a(C1881s sVar, C3306e.C3307a aVar, C1828f<C3320g0, ResponseT> fVar, C1819c<ResponseT, ReturnT> cVar) {
            super(sVar, aVar, fVar);
            this.f6690d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [e5.b<ResponseT>, e5.b] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT mo7531c(p036e5.C1818b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                e5.c<ResponseT, ReturnT> r2 = r0.f6690d
                java.lang.Object r1 = r2.mo7517a(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p036e5.C1837k.C1838a.mo7531c(e5.b, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: e5.k$b */
    static final class C1839b<ResponseT> extends C1837k<ResponseT, Object> {

        /* renamed from: d */
        private final C1819c<ResponseT, C1818b<ResponseT>> f6691d;

        /* renamed from: e */
        private final boolean f6692e;

        C1839b(C1881s sVar, C3306e.C3307a aVar, C1828f<C3320g0, ResponseT> fVar, C1819c<ResponseT, C1818b<ResponseT>> cVar, boolean z) {
            super(sVar, aVar, fVar);
            this.f6691d = cVar;
            this.f6692e = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo7531c(C1818b<ResponseT> bVar, Object[] objArr) {
            C1818b bVar2 = (C1818b) this.f6691d.mo7517a(bVar);
            C3443d dVar = objArr[objArr.length - 1];
            try {
                return this.f6692e ? C1842m.m8929b(bVar2, dVar) : C1842m.m8928a(bVar2, dVar);
            } catch (Exception e) {
                return C1842m.m8931d(e, dVar);
            }
        }
    }

    /* renamed from: e5.k$c */
    static final class C1840c<ResponseT> extends C1837k<ResponseT, Object> {

        /* renamed from: d */
        private final C1819c<ResponseT, C1818b<ResponseT>> f6693d;

        C1840c(C1881s sVar, C3306e.C3307a aVar, C1828f<C3320g0, ResponseT> fVar, C1819c<ResponseT, C1818b<ResponseT>> cVar) {
            super(sVar, aVar, fVar);
            this.f6693d = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo7531c(C1818b<ResponseT> bVar, Object[] objArr) {
            C1818b bVar2 = (C1818b) this.f6693d.mo7517a(bVar);
            C3443d dVar = objArr[objArr.length - 1];
            try {
                return C1842m.m8930c(bVar2, dVar);
            } catch (Exception e) {
                return C1842m.m8931d(e, dVar);
            }
        }
    }

    C1837k(C1881s sVar, C3306e.C3307a aVar, C1828f<C3320g0, ResponseT> fVar) {
        this.f6687a = sVar;
        this.f6688b = aVar;
        this.f6689c = fVar;
    }

    /* renamed from: d */
    private static <ResponseT, ReturnT> C1819c<ResponseT, ReturnT> m8919d(C1884u uVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return uVar.mo7584a(type, annotationArr);
        } catch (RuntimeException e) {
            throw C1890y.m9070n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    private static <ResponseT> C1828f<C3320g0, ResponseT> m8920e(C1884u uVar, Method method, Type type) {
        try {
            return uVar.mo7591h(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C1890y.m9070n(method, e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    static <ResponseT, ReturnT> C1837k<ResponseT, ReturnT> m8921f(C1884u uVar, Method method, C1881s sVar) {
        Type type;
        boolean z;
        Class<C1883t> cls = C1883t.class;
        boolean z2 = sVar.f6799k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f = C1890y.m9062f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C1890y.m9064h(f) != cls || !(f instanceof ParameterizedType)) {
                z = false;
            } else {
                f = C1890y.m9063g(0, (ParameterizedType) f);
                z = true;
            }
            type = new C1890y.C1892b((Type) null, C1818b.class, f);
            annotations = C1889x.m9056a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        C1819c d = m8919d(uVar, method, type, annotations);
        Type b = d.mo7518b();
        if (b == C3313f0.class) {
            throw C1890y.m9069m(method, "'" + C1890y.m9064h(b).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (b == cls) {
            throw C1890y.m9069m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!sVar.f6791c.equals("HEAD") || Void.class.equals(b)) {
            C1828f e = m8920e(uVar, method, b);
            C3306e.C3307a aVar = uVar.f6829b;
            return !z2 ? new C1838a(sVar, aVar, e, d) : z ? new C1840c(sVar, aVar, e, d) : new C1839b(sVar, aVar, e, d, false);
        } else {
            throw C1890y.m9069m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public final ReturnT mo7530a(Object[] objArr) {
        return mo7531c(new C1851n(this.f6687a, objArr, this.f6688b, this.f6689c), objArr);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: c */
    public abstract ReturnT mo7531c(C1818b<ResponseT> bVar, Object[] objArr);
}
