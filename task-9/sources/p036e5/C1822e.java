package p036e5;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p036e5.C1819c;

@IgnoreJRERequirement
/* renamed from: e5.e */
final class C1822e extends C1819c.C1820a {

    /* renamed from: a */
    static final C1819c.C1820a f6662a = new C1822e();

    @IgnoreJRERequirement
    /* renamed from: e5.e$a */
    private static final class C1823a<R> implements C1819c<R, CompletableFuture<R>> {

        /* renamed from: a */
        private final Type f6663a;

        @IgnoreJRERequirement
        /* renamed from: e5.e$a$a */
        private class C1824a implements C1821d<R> {

            /* renamed from: a */
            private final CompletableFuture<R> f6664a;

            public C1824a(CompletableFuture<R> completableFuture) {
                this.f6664a = completableFuture;
            }

            /* renamed from: a */
            public void mo7520a(C1818b<R> bVar, Throwable th) {
                this.f6664a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo7521b(C1818b<R> bVar, C1883t<R> tVar) {
                if (tVar.mo7581d()) {
                    this.f6664a.complete(tVar.mo7579a());
                } else {
                    this.f6664a.completeExceptionally(new C1836j(tVar));
                }
            }
        }

        C1823a(Type type) {
            this.f6663a = type;
        }

        /* renamed from: b */
        public Type mo7518b() {
            return this.f6663a;
        }

        /* renamed from: c */
        public CompletableFuture<R> mo7517a(C1818b<R> bVar) {
            C1825b bVar2 = new C1825b(bVar);
            bVar.mo7516n(new C1824a(bVar2));
            return bVar2;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: e5.e$b */
    private static final class C1825b<T> extends CompletableFuture<T> {

        /* renamed from: d */
        private final C1818b<?> f6666d;

        C1825b(C1818b<?> bVar) {
            this.f6666d = bVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f6666d.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: e5.e$c */
    private static final class C1826c<R> implements C1819c<R, CompletableFuture<C1883t<R>>> {

        /* renamed from: a */
        private final Type f6667a;

        @IgnoreJRERequirement
        /* renamed from: e5.e$c$a */
        private class C1827a implements C1821d<R> {

            /* renamed from: a */
            private final CompletableFuture<C1883t<R>> f6668a;

            public C1827a(CompletableFuture<C1883t<R>> completableFuture) {
                this.f6668a = completableFuture;
            }

            /* renamed from: a */
            public void mo7520a(C1818b<R> bVar, Throwable th) {
                this.f6668a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo7521b(C1818b<R> bVar, C1883t<R> tVar) {
                this.f6668a.complete(tVar);
            }
        }

        C1826c(Type type) {
            this.f6667a = type;
        }

        /* renamed from: b */
        public Type mo7518b() {
            return this.f6667a;
        }

        /* renamed from: c */
        public CompletableFuture<C1883t<R>> mo7517a(C1818b<R> bVar) {
            C1825b bVar2 = new C1825b(bVar);
            bVar.mo7516n(new C1827a(bVar2));
            return bVar2;
        }
    }

    C1822e() {
    }

    @Nullable
    /* renamed from: a */
    public C1819c<?, ?> mo7519a(Type type, Annotation[] annotationArr, C1884u uVar) {
        if (C1819c.C1820a.m8883c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = C1819c.C1820a.m8882b(0, (ParameterizedType) type);
            if (C1819c.C1820a.m8883c(b) != C1883t.class) {
                return new C1823a(b);
            }
            if (b instanceof ParameterizedType) {
                return new C1826c(C1819c.C1820a.m8882b(0, (ParameterizedType) b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
