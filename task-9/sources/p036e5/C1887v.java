package p036e5;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: e5.v */
abstract class C1887v<T> {
    C1887v() {
    }

    /* renamed from: b */
    static <T> C1887v<T> m9054b(C1884u uVar, Method method) {
        C1881s b = C1881s.m9020b(uVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C1890y.m9066j(genericReturnType)) {
            throw C1890y.m9069m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return C1837k.m8921f(uVar, method, b);
        } else {
            throw C1890y.m9069m(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public abstract T mo7530a(Object[] objArr);
}
