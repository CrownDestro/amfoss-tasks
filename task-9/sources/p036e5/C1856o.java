package p036e5;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p036e5.C1828f;
import p134u3.C3320g0;

@IgnoreJRERequirement
/* renamed from: e5.o */
final class C1856o extends C1828f.C1829a {

    /* renamed from: a */
    static final C1828f.C1829a f6723a = new C1856o();

    @IgnoreJRERequirement
    /* renamed from: e5.o$a */
    static final class C1857a<T> implements C1828f<C3320g0, Optional<T>> {

        /* renamed from: a */
        final C1828f<C3320g0, T> f6724a;

        C1857a(C1828f<C3320g0, T> fVar) {
            this.f6724a = fVar;
        }

        /* renamed from: b */
        public Optional<T> mo7505a(C3320g0 g0Var) {
            return Optional.ofNullable(this.f6724a.mo7505a(g0Var));
        }
    }

    C1856o() {
    }

    @Nullable
    /* renamed from: d */
    public C1828f<C3320g0, ?> mo7504d(Type type, Annotation[] annotationArr, C1884u uVar) {
        if (C1828f.C1829a.m8900b(type) != Optional.class) {
            return null;
        }
        return new C1857a(uVar.mo7591h(C1828f.C1829a.m8899a(0, (ParameterizedType) type), annotationArr));
    }
}
