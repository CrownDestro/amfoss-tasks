package p036e5;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: e5.l */
public final class C1841l {

    /* renamed from: a */
    private final Method f6694a;

    /* renamed from: b */
    private final List<?> f6695b;

    C1841l(Method method, List<?> list) {
        this.f6694a = method;
        this.f6695b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method mo7532a() {
        return this.f6694a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f6694a.getDeclaringClass().getName(), this.f6694a.getName(), this.f6695b});
    }
}
