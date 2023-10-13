package p108q1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import javax.annotation.Nullable;
import p108q1.C2978f;

/* renamed from: q1.a */
final class C2963a extends C2978f<Object> {

    /* renamed from: c */
    public static final C2978f.C2983e f9761c = new C2964a();

    /* renamed from: a */
    private final Class<?> f9762a;

    /* renamed from: b */
    private final C2978f<Object> f9763b;

    /* renamed from: q1.a$a */
    class C2964a implements C2978f.C2983e {
        C2964a() {
        }

        @Nullable
        /* renamed from: a */
        public C2978f<?> mo10200a(Type type, Set<? extends Annotation> set, C3008s sVar) {
            Type a = C3026u.m13675a(type);
            if (a != null && set.isEmpty()) {
                return new C2963a(C3026u.m13680f(a), sVar.mo10324d(a)).mo10217d();
            }
            return null;
        }
    }

    C2963a(Class<?> cls, C2978f<Object> fVar) {
        this.f9762a = cls;
        this.f9763b = fVar;
    }

    /* renamed from: b */
    public Object mo10197b(C2988k kVar) {
        ArrayList arrayList = new ArrayList();
        kVar.mo10233a();
        while (kVar.mo10245n()) {
            arrayList.add(this.f9763b.mo10197b(kVar));
        }
        kVar.mo10240f();
        Object newInstance = Array.newInstance(this.f9762a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: f */
    public void mo10198f(C2995p pVar, Object obj) {
        pVar.mo10254a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f9763b.mo10198f(pVar, Array.get(obj, i));
        }
        pVar.mo10261h();
    }

    public String toString() {
        return this.f9763b + ".array()";
    }
}
