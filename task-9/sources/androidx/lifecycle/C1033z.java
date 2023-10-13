package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import p034e3.C1769a;
import p041f3.C1924k;
import p041f3.C1925l;
import p065j0.C2312c;
import p127t2.C3172f;

/* renamed from: androidx.lifecycle.z */
public final class C1033z implements C2312c.C2315c {

    /* renamed from: a */
    private final C2312c f3468a;

    /* renamed from: b */
    private boolean f3469b;

    /* renamed from: c */
    private Bundle f3470c;

    /* renamed from: d */
    private final C3172f f3471d;

    /* renamed from: androidx.lifecycle.z$a */
    static final class C1034a extends C1925l implements C1769a<C0970a0> {

        /* renamed from: e */
        final /* synthetic */ C0996g0 f3472e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1034a(C0996g0 g0Var) {
            super(0);
            this.f3472e = g0Var;
        }

        /* renamed from: a */
        public final C0970a0 mo3839c() {
            return C1028y.m4536b(this.f3472e);
        }
    }

    public C1033z(C2312c cVar, C0996g0 g0Var) {
        C1924k.m9141g(cVar, "savedStateRegistry");
        C1924k.m9141g(g0Var, "viewModelStoreOwner");
        this.f3468a = cVar;
        this.f3471d = C3174h.m14049a(new C1034a(g0Var));
    }

    /* renamed from: b */
    private final C0970a0 m4539b() {
        return (C0970a0) this.f3471d.getValue();
    }

    /* renamed from: a */
    public Bundle mo153a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3470c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : m4539b().mo3760e().entrySet()) {
            String str = (String) next.getKey();
            Bundle a = ((C1026x) next.getValue()).mo3832c().mo153a();
            if (!C1924k.m9136b(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f3469b = false;
        return bundle;
    }

    /* renamed from: c */
    public final void mo3837c() {
        if (!this.f3469b) {
            this.f3470c = this.f3468a.mo8626b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f3469b = true;
            m4539b();
        }
    }
}
