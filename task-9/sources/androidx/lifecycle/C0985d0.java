package androidx.lifecycle;

import androidx.lifecycle.C0974c0;
import p038f0.C1899a;
import p041f3.C1924k;

/* renamed from: androidx.lifecycle.d0 */
public final /* synthetic */ class C0985d0 {
    static {
        C0974c0.C0978b.C0979a aVar = C0974c0.C0978b.f3412a;
    }

    /* renamed from: a */
    public static C0972b0 m4447a(C0974c0.C0978b bVar, Class cls) {
        C1924k.m9141g(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* renamed from: b */
    public static C0972b0 m4448b(C0974c0.C0978b bVar, Class cls, C1899a aVar) {
        C1924k.m9141g(cls, "modelClass");
        C1924k.m9141g(aVar, "extras");
        return bVar.mo3728a(cls);
    }
}
