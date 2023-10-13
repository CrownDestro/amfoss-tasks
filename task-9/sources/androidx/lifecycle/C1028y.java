package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C0988f;
import p034e3.C1780l;
import p038f0.C1899a;
import p038f0.C1903c;
import p041f3.C1924k;
import p041f3.C1925l;
import p041f3.C1933t;
import p065j0.C2318e;

/* renamed from: androidx.lifecycle.y */
public final class C1028y {

    /* renamed from: a */
    public static final C1899a.C1901b<C2318e> f3464a = new C1030b();

    /* renamed from: b */
    public static final C1899a.C1901b<C0996g0> f3465b = new C1031c();

    /* renamed from: c */
    public static final C1899a.C1901b<Bundle> f3466c = new C1029a();

    /* renamed from: androidx.lifecycle.y$a */
    public static final class C1029a implements C1899a.C1901b<Bundle> {
        C1029a() {
        }
    }

    /* renamed from: androidx.lifecycle.y$b */
    public static final class C1030b implements C1899a.C1901b<C2318e> {
        C1030b() {
        }
    }

    /* renamed from: androidx.lifecycle.y$c */
    public static final class C1031c implements C1899a.C1901b<C0996g0> {
        C1031c() {
        }
    }

    /* renamed from: androidx.lifecycle.y$d */
    static final class C1032d extends C1925l implements C1780l<C1899a, C0970a0> {

        /* renamed from: e */
        public static final C1032d f3467e = new C1032d();

        C1032d() {
            super(1);
        }

        /* renamed from: a */
        public final C0970a0 mo3836n(C1899a aVar) {
            C1924k.m9141g(aVar, "$this$initializer");
            return new C0970a0();
        }
    }

    /* renamed from: a */
    public static final <T extends C2318e & C0996g0> void m4535a(T t) {
        C1924k.m9141g(t, "<this>");
        C0988f.C0993b b = t.mo102a().mo3775b();
        if (!(b == C0988f.C0993b.INITIALIZED || b == C0988f.C0993b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t.mo111l().mo8627c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C1033z zVar = new C1033z(t.mo111l(), (C0996g0) t);
            t.mo111l().mo8631h("androidx.lifecycle.internal.SavedStateHandlesProvider", zVar);
            t.mo102a().mo3774a(new SavedStateHandleAttacher(zVar));
        }
    }

    /* renamed from: b */
    public static final C0970a0 m4536b(C0996g0 g0Var) {
        Class cls = C0970a0.class;
        C1924k.m9141g(g0Var, "<this>");
        C1903c cVar = new C1903c();
        cVar.mo7620a(C1933t.m9161b(cls), C1032d.f3467e);
        return (C0970a0) new C0974c0(g0Var, cVar.mo7621b()).mo3771b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
