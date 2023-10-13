package p108q1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import p108q1.C2978f;

/* renamed from: q1.d */
abstract class C2973d<C extends Collection<T>, T> extends C2978f<C> {

    /* renamed from: b */
    public static final C2978f.C2983e f9781b = new C2974a();

    /* renamed from: a */
    private final C2978f<T> f9782a;

    /* renamed from: q1.d$a */
    class C2974a implements C2978f.C2983e {
        C2974a() {
        }

        @Nullable
        /* renamed from: a */
        public C2978f<?> mo10200a(Type type, Set<? extends Annotation> set, C3008s sVar) {
            C2978f h;
            Class<?> f = C3026u.m13680f(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (f == List.class || f == Collection.class) {
                h = C2973d.m13448h(type, sVar);
            } else if (f != Set.class) {
                return null;
            } else {
                h = C2973d.m13449j(type, sVar);
            }
            return h.mo10217d();
        }
    }

    /* renamed from: q1.d$b */
    class C2975b extends C2973d<Collection<T>, T> {
        C2975b(C2978f fVar) {
            super(fVar, (C2974a) null);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo10197b(C2988k kVar) {
            return C2973d.super.mo10209g(kVar);
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo10198f(C2995p pVar, Object obj) {
            C2973d.super.mo10211k(pVar, (Collection) obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Collection<T> mo10210i() {
            return new ArrayList();
        }
    }

    /* renamed from: q1.d$c */
    class C2976c extends C2973d<Set<T>, T> {
        C2976c(C2978f fVar) {
            super(fVar, (C2974a) null);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo10197b(C2988k kVar) {
            return C2973d.super.mo10209g(kVar);
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ void mo10198f(C2995p pVar, Object obj) {
            C2973d.super.mo10211k(pVar, (Set) obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Set<T> mo10210i() {
            return new LinkedHashSet();
        }
    }

    private C2973d(C2978f<T> fVar) {
        this.f9782a = fVar;
    }

    /* synthetic */ C2973d(C2978f fVar, C2974a aVar) {
        this(fVar);
    }

    /* renamed from: h */
    static <T> C2978f<Collection<T>> m13448h(Type type, C3008s sVar) {
        return new C2975b(sVar.mo10324d(C3026u.m13677c(type, Collection.class)));
    }

    /* renamed from: j */
    static <T> C2978f<Set<T>> m13449j(Type type, C3008s sVar) {
        return new C2976c(sVar.mo10324d(C3026u.m13677c(type, Collection.class)));
    }

    /* renamed from: g */
    public C mo10209g(C2988k kVar) {
        C i = mo10210i();
        kVar.mo10233a();
        while (kVar.mo10245n()) {
            i.add(this.f9782a.mo10197b(kVar));
        }
        kVar.mo10240f();
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract C mo10210i();

    /* renamed from: k */
    public void mo10211k(C2995p pVar, C c) {
        pVar.mo10254a();
        for (Object f : c) {
            this.f9782a.mo10198f(pVar, f);
        }
        pVar.mo10261h();
    }

    public String toString() {
        return this.f9782a + ".collection()";
    }
}
