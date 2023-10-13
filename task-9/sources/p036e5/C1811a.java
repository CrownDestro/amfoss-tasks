package p036e5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p036e5.C1828f;
import p050g5.C1988w;
import p127t2.C3187s;
import p134u3.C3308e0;
import p134u3.C3320g0;

/* renamed from: e5.a */
final class C1811a extends C1828f.C1829a {

    /* renamed from: a */
    private boolean f6655a = true;

    /* renamed from: e5.a$a */
    static final class C1812a implements C1828f<C3320g0, C3320g0> {

        /* renamed from: a */
        static final C1812a f6656a = new C1812a();

        C1812a() {
        }

        /* renamed from: b */
        public C3320g0 mo7505a(C3320g0 g0Var) {
            try {
                return C1890y.m9057a(g0Var);
            } finally {
                g0Var.close();
            }
        }
    }

    /* renamed from: e5.a$b */
    static final class C1813b implements C1828f<C3308e0, C3308e0> {

        /* renamed from: a */
        static final C1813b f6657a = new C1813b();

        C1813b() {
        }

        /* renamed from: b */
        public C3308e0 mo7505a(C3308e0 e0Var) {
            return e0Var;
        }
    }

    /* renamed from: e5.a$c */
    static final class C1814c implements C1828f<C3320g0, C3320g0> {

        /* renamed from: a */
        static final C1814c f6658a = new C1814c();

        C1814c() {
        }

        /* renamed from: b */
        public C3320g0 mo7505a(C3320g0 g0Var) {
            return g0Var;
        }
    }

    /* renamed from: e5.a$d */
    static final class C1815d implements C1828f<Object, String> {

        /* renamed from: a */
        static final C1815d f6659a = new C1815d();

        C1815d() {
        }

        /* renamed from: b */
        public String mo7505a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: e5.a$e */
    static final class C1816e implements C1828f<C3320g0, C3187s> {

        /* renamed from: a */
        static final C1816e f6660a = new C1816e();

        C1816e() {
        }

        /* renamed from: b */
        public C3187s mo7505a(C3320g0 g0Var) {
            g0Var.close();
            return C3187s.f10561a;
        }
    }

    /* renamed from: e5.a$f */
    static final class C1817f implements C1828f<C3320g0, Void> {

        /* renamed from: a */
        static final C1817f f6661a = new C1817f();

        C1817f() {
        }

        /* renamed from: b */
        public Void mo7505a(C3320g0 g0Var) {
            g0Var.close();
            return null;
        }
    }

    C1811a() {
    }

    @Nullable
    /* renamed from: c */
    public C1828f<?, C3308e0> mo7503c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C1884u uVar) {
        if (C3308e0.class.isAssignableFrom(C1890y.m9064h(type))) {
            return C1813b.f6657a;
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public C1828f<C3320g0, ?> mo7504d(Type type, Annotation[] annotationArr, C1884u uVar) {
        if (type == C3320g0.class) {
            return C1890y.m9068l(annotationArr, C1988w.class) ? C1814c.f6658a : C1812a.f6656a;
        }
        if (type == Void.class) {
            return C1817f.f6661a;
        }
        if (!this.f6655a || type != C3187s.class) {
            return null;
        }
        try {
            return C1816e.f6660a;
        } catch (NoClassDefFoundError unused) {
            this.f6655a = false;
            return null;
        }
    }
}
