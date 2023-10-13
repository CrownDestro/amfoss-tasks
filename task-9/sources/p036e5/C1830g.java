package p036e5;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p036e5.C1819c;
import p134u3.C3304d0;

/* renamed from: e5.g */
final class C1830g extends C1819c.C1820a {
    @Nullable

    /* renamed from: a */
    private final Executor f6670a;

    /* renamed from: e5.g$a */
    class C1831a implements C1819c<Object, C1818b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f6671a;

        /* renamed from: b */
        final /* synthetic */ Executor f6672b;

        C1831a(Type type, Executor executor) {
            this.f6671a = type;
            this.f6672b = executor;
        }

        /* renamed from: b */
        public Type mo7518b() {
            return this.f6671a;
        }

        /* renamed from: c */
        public C1818b<Object> mo7517a(C1818b<Object> bVar) {
            Executor executor = this.f6672b;
            return executor == null ? bVar : new C1832b(executor, bVar);
        }
    }

    /* renamed from: e5.g$b */
    static final class C1832b<T> implements C1818b<T> {

        /* renamed from: d */
        final Executor f6674d;

        /* renamed from: e */
        final C1818b<T> f6675e;

        /* renamed from: e5.g$b$a */
        class C1833a implements C1821d<T> {

            /* renamed from: a */
            final /* synthetic */ C1821d f6676a;

            C1833a(C1821d dVar) {
                this.f6676a = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m8914e(C1821d dVar, Throwable th) {
                dVar.mo7520a(C1832b.this, th);
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m8915f(C1821d dVar, C1883t tVar) {
                if (C1832b.this.f6675e.mo7513c()) {
                    dVar.mo7520a(C1832b.this, new IOException("Canceled"));
                } else {
                    dVar.mo7521b(C1832b.this, tVar);
                }
            }

            /* renamed from: a */
            public void mo7520a(C1818b<T> bVar, Throwable th) {
                C1832b.this.f6674d.execute(new C1835i(this, this.f6676a, th));
            }

            /* renamed from: b */
            public void mo7521b(C1818b<T> bVar, C1883t<T> tVar) {
                C1832b.this.f6674d.execute(new C1834h(this, this.f6676a, tVar));
            }
        }

        C1832b(Executor executor, C1818b<T> bVar) {
            this.f6674d = executor;
            this.f6675e = bVar;
        }

        /* renamed from: a */
        public C3304d0 mo7512a() {
            return this.f6675e.mo7512a();
        }

        /* renamed from: c */
        public boolean mo7513c() {
            return this.f6675e.mo7513c();
        }

        public void cancel() {
            this.f6675e.cancel();
        }

        /* renamed from: h */
        public C1818b<T> clone() {
            return new C1832b(this.f6674d, this.f6675e.mo7515h());
        }

        /* renamed from: n */
        public void mo7516n(C1821d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f6675e.mo7516n(new C1833a(dVar));
        }
    }

    C1830g(@Nullable Executor executor) {
        this.f6670a = executor;
    }

    @Nullable
    /* renamed from: a */
    public C1819c<?, ?> mo7519a(Type type, Annotation[] annotationArr, C1884u uVar) {
        Executor executor = null;
        if (C1819c.C1820a.m8883c(type) != C1818b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g = C1890y.m9063g(0, (ParameterizedType) type);
            if (!C1890y.m9068l(annotationArr, C1888w.class)) {
                executor = this.f6670a;
            }
            return new C1831a(g, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
