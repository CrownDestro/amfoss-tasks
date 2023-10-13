package p108q1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p108q1.C2978f;

/* renamed from: q1.r */
final class C3006r<K, V> extends C2978f<Map<K, V>> {

    /* renamed from: c */
    public static final C2978f.C2983e f9867c = new C3007a();

    /* renamed from: a */
    private final C2978f<K> f9868a;

    /* renamed from: b */
    private final C2978f<V> f9869b;

    /* renamed from: q1.r$a */
    class C3007a implements C2978f.C2983e {
        C3007a() {
        }

        @Nullable
        /* renamed from: a */
        public C2978f<?> mo10200a(Type type, Set<? extends Annotation> set, C3008s sVar) {
            Class<?> f;
            if (!set.isEmpty() || (f = C3026u.m13680f(type)) != Map.class) {
                return null;
            }
            Type[] i = C3026u.m13683i(type, f);
            return new C3006r(sVar, i[0], i[1]).mo10217d();
        }
    }

    C3006r(C3008s sVar, Type type, Type type2) {
        this.f9868a = sVar.mo10324d(type);
        this.f9869b = sVar.mo10324d(type2);
    }

    /* renamed from: g */
    public Map<K, V> mo10197b(C2988k kVar) {
        C2996q qVar = new C2996q();
        kVar.mo10236c();
        while (kVar.mo10245n()) {
            kVar.mo10230O();
            K b = this.f9868a.mo10197b(kVar);
            V b2 = this.f9869b.mo10197b(kVar);
            Object put = qVar.put(b, b2);
            if (put != null) {
                throw new C2985h("Map key '" + b + "' has multiple values at path " + kVar.mo10244k() + ": " + put + " and " + b2);
            }
        }
        kVar.mo10242h();
        return qVar;
    }

    /* renamed from: h */
    public void mo10198f(C2995p pVar, Map<K, V> map) {
        pVar.mo10257c();
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                pVar.mo10267F();
                this.f9868a.mo10198f(pVar, next.getKey());
                this.f9869b.mo10198f(pVar, next.getValue());
            } else {
                throw new C2985h("Map key is null at " + pVar.mo10273k());
            }
        }
        pVar.mo10262i();
    }

    public String toString() {
        return "JsonAdapter(" + this.f9868a + "=" + this.f9869b + ")";
    }
}
