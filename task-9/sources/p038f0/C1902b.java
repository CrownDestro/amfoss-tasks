package p038f0;

import androidx.lifecycle.C0972b0;
import androidx.lifecycle.C0974c0;
import androidx.lifecycle.C0985d0;
import p041f3.C1924k;

/* renamed from: f0.b */
public final class C1902b implements C0974c0.C0978b {

    /* renamed from: b */
    private final C1906f<?>[] f6873b;

    public C1902b(C1906f<?>... fVarArr) {
        C1924k.m9141g(fVarArr, "initializers");
        this.f6873b = fVarArr;
    }

    /* renamed from: a */
    public /* synthetic */ C0972b0 mo3728a(Class cls) {
        return C0985d0.m4447a(this, cls);
    }

    /* renamed from: b */
    public <T extends C0972b0> T mo3729b(Class<T> cls, C1899a aVar) {
        C1924k.m9141g(cls, "modelClass");
        C1924k.m9141g(aVar, "extras");
        T t = null;
        for (C1906f<?> fVar : this.f6873b) {
            if (C1924k.m9136b(fVar.mo7623a(), cls)) {
                T n = fVar.mo7624b().mo3836n(aVar);
                t = n instanceof C0972b0 ? (C0972b0) n : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
