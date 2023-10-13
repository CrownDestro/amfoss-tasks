package p036e5;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p134u3.C3308e0;
import p134u3.C3320g0;

/* renamed from: e5.f */
public interface C1828f<F, T> {

    /* renamed from: e5.f$a */
    public static abstract class C1829a {
        /* renamed from: a */
        protected static Type m8899a(int i, ParameterizedType parameterizedType) {
            return C1890y.m9063g(i, parameterizedType);
        }

        /* renamed from: b */
        protected static Class<?> m8900b(Type type) {
            return C1890y.m9064h(type);
        }

        @Nullable
        /* renamed from: c */
        public C1828f<?, C3308e0> mo7503c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C1884u uVar) {
            return null;
        }

        @Nullable
        /* renamed from: d */
        public C1828f<C3320g0, ?> mo7504d(Type type, Annotation[] annotationArr, C1884u uVar) {
            return null;
        }

        @Nullable
        /* renamed from: e */
        public C1828f<?, String> mo7525e(Type type, Annotation[] annotationArr, C1884u uVar) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    T mo7505a(F f);
}
