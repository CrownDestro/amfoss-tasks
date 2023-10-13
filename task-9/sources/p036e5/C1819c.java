package p036e5;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: e5.c */
public interface C1819c<R, T> {

    /* renamed from: e5.c$a */
    public static abstract class C1820a {
        /* renamed from: b */
        protected static Type m8882b(int i, ParameterizedType parameterizedType) {
            return C1890y.m9063g(i, parameterizedType);
        }

        /* renamed from: c */
        protected static Class<?> m8883c(Type type) {
            return C1890y.m9064h(type);
        }

        @Nullable
        /* renamed from: a */
        public abstract C1819c<?, ?> mo7519a(Type type, Annotation[] annotationArr, C1884u uVar);
    }

    /* renamed from: a */
    T mo7517a(C1818b<R> bVar);

    /* renamed from: b */
    Type mo7518b();
}
