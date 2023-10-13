package androidx.lifecycle;

import android.app.Application;
import p038f0.C1899a;
import p038f0.C1904d;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: androidx.lifecycle.c0 */
public class C0974c0 {

    /* renamed from: a */
    private final C0994f0 f3406a;

    /* renamed from: b */
    private final C0978b f3407b;

    /* renamed from: c */
    private final C1899a f3408c;

    /* renamed from: androidx.lifecycle.c0$a */
    public static class C0975a extends C0980c {

        /* renamed from: d */
        public static final C0976a f3409d = new C0976a((C1920g) null);

        /* renamed from: e */
        public static final C1899a.C1901b<Application> f3410e = C0976a.C0977a.f3411a;

        /* renamed from: androidx.lifecycle.c0$a$a */
        public static final class C0976a {

            /* renamed from: androidx.lifecycle.c0$a$a$a */
            private static final class C0977a implements C1899a.C1901b<Application> {

                /* renamed from: a */
                public static final C0977a f3411a = new C0977a();

                private C0977a() {
                }
            }

            private C0976a() {
            }

            public /* synthetic */ C0976a(C1920g gVar) {
                this();
            }
        }
    }

    /* renamed from: androidx.lifecycle.c0$b */
    public interface C0978b {

        /* renamed from: a */
        public static final C0979a f3412a = C0979a.f3413a;

        /* renamed from: androidx.lifecycle.c0$b$a */
        public static final class C0979a {

            /* renamed from: a */
            static final /* synthetic */ C0979a f3413a = new C0979a();

            private C0979a() {
            }
        }

        /* renamed from: a */
        <T extends C0972b0> T mo3728a(Class<T> cls);

        /* renamed from: b */
        <T extends C0972b0> T mo3729b(Class<T> cls, C1899a aVar);
    }

    /* renamed from: androidx.lifecycle.c0$c */
    public static class C0980c implements C0978b {

        /* renamed from: b */
        public static final C0981a f3414b = new C0981a((C1920g) null);

        /* renamed from: c */
        public static final C1899a.C1901b<String> f3415c = C0981a.C0982a.f3416a;

        /* renamed from: androidx.lifecycle.c0$c$a */
        public static final class C0981a {

            /* renamed from: androidx.lifecycle.c0$c$a$a */
            private static final class C0982a implements C1899a.C1901b<String> {

                /* renamed from: a */
                public static final C0982a f3416a = new C0982a();

                private C0982a() {
                }
            }

            private C0981a() {
            }

            public /* synthetic */ C0981a(C1920g gVar) {
                this();
            }
        }
    }

    /* renamed from: androidx.lifecycle.c0$d */
    public static class C0983d {
        /* renamed from: a */
        public void mo3772a(C0972b0 b0Var) {
            C1924k.m9141g(b0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0974c0(C0994f0 f0Var, C0978b bVar) {
        this(f0Var, bVar, (C1899a) null, 4, (C1920g) null);
        C1924k.m9141g(f0Var, "store");
        C1924k.m9141g(bVar, "factory");
    }

    public C0974c0(C0994f0 f0Var, C0978b bVar, C1899a aVar) {
        C1924k.m9141g(f0Var, "store");
        C1924k.m9141g(bVar, "factory");
        C1924k.m9141g(aVar, "defaultCreationExtras");
        this.f3406a = f0Var;
        this.f3407b = bVar;
        this.f3408c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0974c0(C0994f0 f0Var, C0978b bVar, C1899a aVar, int i, C1920g gVar) {
        this(f0Var, bVar, (i & 4) != 0 ? C1899a.C1900a.f6872b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0974c0(C0996g0 g0Var, C0978b bVar) {
        this(g0Var.mo113o(), bVar, C0987e0.m4450a(g0Var));
        C1924k.m9141g(g0Var, "owner");
        C1924k.m9141g(bVar, "factory");
    }

    /* renamed from: a */
    public <T extends C0972b0> T mo3770a(Class<T> cls) {
        C1924k.m9141g(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo3771b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C0972b0> T mo3771b(String str, Class<T> cls) {
        T t;
        C1924k.m9141g(str, "key");
        C1924k.m9141g(cls, "modelClass");
        T b = this.f3406a.mo3784b(str);
        if (cls.isInstance(b)) {
            C0978b bVar = this.f3407b;
            C0983d dVar = bVar instanceof C0983d ? (C0983d) bVar : null;
            if (dVar != null) {
                C1924k.m9138d(b);
                dVar.mo3772a(b);
            }
            C1924k.m9139e(b, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b;
        }
        C1904d dVar2 = new C1904d(this.f3408c);
        dVar2.mo7622b(C0980c.f3415c, str);
        try {
            t = this.f3407b.mo3729b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t = this.f3407b.mo3728a(cls);
        }
        this.f3406a.mo3786d(str, t);
        return t;
    }
}
