package p043f5;

import p036e5.C1828f;
import p062i4.C2111f;
import p108q1.C2978f;
import p108q1.C2995p;
import p134u3.C3308e0;
import p134u3.C3368z;

/* renamed from: f5.b */
final class C1957b<T> implements C1828f<T, C3308e0> {

    /* renamed from: b */
    private static final C3368z f6937b = C3368z.m14895d("application/json; charset=UTF-8");

    /* renamed from: a */
    private final C2978f<T> f6938a;

    C1957b(C2978f<T> fVar) {
        this.f6938a = fVar;
    }

    /* renamed from: b */
    public C3308e0 mo7505a(T t) {
        C2111f fVar = new C2111f();
        this.f6938a.mo10198f(C2995p.m13566C(fVar), t);
        return C3308e0.m14600c(f6937b, fVar.mo7912T());
    }
}
