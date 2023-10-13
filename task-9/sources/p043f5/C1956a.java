package p043f5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import p036e5.C1828f;
import p036e5.C1884u;
import p108q1.C2978f;
import p108q1.C2987j;
import p108q1.C3008s;
import p134u3.C3308e0;
import p134u3.C3320g0;

/* renamed from: f5.a */
public final class C1956a extends C1828f.C1829a {

    /* renamed from: a */
    private final C3008s f6933a;

    /* renamed from: b */
    private final boolean f6934b;

    /* renamed from: c */
    private final boolean f6935c;

    /* renamed from: d */
    private final boolean f6936d;

    private C1956a(C3008s sVar, boolean z, boolean z2, boolean z3) {
        this.f6933a = sVar;
        this.f6934b = z;
        this.f6935c = z2;
        this.f6936d = z3;
    }

    /* renamed from: f */
    public static C1956a m9225f() {
        return m9226g(new C3008s.C3009a().mo10327a());
    }

    /* renamed from: g */
    public static C1956a m9226g(C3008s sVar) {
        Objects.requireNonNull(sVar, "moshi == null");
        return new C1956a(sVar, false, false, false);
    }

    /* renamed from: h */
    private static Set<? extends Annotation> m9227h(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C2987j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    /* renamed from: c */
    public C1828f<?, C3308e0> mo7503c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C1884u uVar) {
        C2978f<T> e = this.f6933a.mo10325e(type, m9227h(annotationArr));
        if (this.f6934b) {
            e = e.mo10216c();
        }
        if (this.f6935c) {
            e = e.mo10215a();
        }
        if (this.f6936d) {
            e = e.mo10218e();
        }
        return new C1957b(e);
    }

    /* renamed from: d */
    public C1828f<C3320g0, ?> mo7504d(Type type, Annotation[] annotationArr, C1884u uVar) {
        C2978f<T> e = this.f6933a.mo10325e(type, m9227h(annotationArr));
        if (this.f6934b) {
            e = e.mo10216c();
        }
        if (this.f6935c) {
            e = e.mo10215a();
        }
        if (this.f6936d) {
            e = e.mo10218e();
        }
        return new C1958c(e);
    }
}
