package p038f0;

import androidx.lifecycle.C0972b0;
import androidx.lifecycle.C0974c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p027d3.C1737a;
import p034e3.C1780l;
import p041f3.C1924k;
import p074k3.C2385b;

/* renamed from: f0.c */
public final class C1903c {

    /* renamed from: a */
    private final List<C1906f<?>> f6874a = new ArrayList();

    /* renamed from: a */
    public final <T extends C0972b0> void mo7620a(C2385b<T> bVar, C1780l<? super C1899a, ? extends T> lVar) {
        C1924k.m9141g(bVar, "clazz");
        C1924k.m9141g(lVar, "initializer");
        this.f6874a.add(new C1906f(C1737a.m8630a(bVar), lVar));
    }

    /* renamed from: b */
    public final C0974c0.C0978b mo7621b() {
        C1906f[] fVarArr = (C1906f[]) this.f6874a.toArray(new C1906f[0]);
        return new C1902b((C1906f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
