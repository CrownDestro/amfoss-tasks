package p038f0;

import androidx.lifecycle.C0972b0;
import p034e3.C1780l;
import p041f3.C1924k;

/* renamed from: f0.f */
public final class C1906f<T extends C0972b0> {

    /* renamed from: a */
    private final Class<T> f6875a;

    /* renamed from: b */
    private final C1780l<C1899a, T> f6876b;

    public C1906f(Class<T> cls, C1780l<? super C1899a, ? extends T> lVar) {
        C1924k.m9141g(cls, "clazz");
        C1924k.m9141g(lVar, "initializer");
        this.f6875a = cls;
        this.f6876b = lVar;
    }

    /* renamed from: a */
    public final Class<T> mo7623a() {
        return this.f6875a;
    }

    /* renamed from: b */
    public final C1780l<C1899a, T> mo7624b() {
        return this.f6876b;
    }
}
