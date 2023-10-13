package p108q1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;
import p108q1.C2978f;
import p108q1.C2988k;
import p114r1.C3064a;

/* renamed from: q1.c */
final class C2970c<T> extends C2978f<T> {

    /* renamed from: d */
    public static final C2978f.C2983e f9774d = new C2971a();

    /* renamed from: a */
    private final C2965b<T> f9775a;

    /* renamed from: b */
    private final C2972b<?>[] f9776b;

    /* renamed from: c */
    private final C2988k.C2989a f9777c;

    /* renamed from: q1.c$a */
    class C2971a implements C2978f.C2983e {
        C2971a() {
        }

        /* renamed from: b */
        private void m13443b(C3008s sVar, Type type, Map<String, C2972b<?>> map) {
            Class<?> f = C3026u.m13680f(type);
            boolean h = C3064a.m13767h(f);
            for (Field field : f.getDeclaredFields()) {
                if (m13444c(h, field.getModifiers())) {
                    Type k = C3064a.m13770k(type, f, field.getGenericType());
                    Set<? extends Annotation> i = C3064a.m13768i(field);
                    String name = field.getName();
                    C2978f<T> f2 = sVar.mo10326f(k, i, name);
                    field.setAccessible(true);
                    C2977e eVar = (C2977e) field.getAnnotation(C2977e.class);
                    if (eVar != null) {
                        name = eVar.name();
                    }
                    C2972b bVar = new C2972b(name, field, f2);
                    C2972b put = map.put(name, bVar);
                    if (put != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.f9779b + "\n    " + bVar.f9779b);
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m13444c(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            return Modifier.isPublic(i) || Modifier.isProtected(i) || !z;
        }

        @Nullable
        /* renamed from: a */
        public C2978f<?> mo10200a(Type type, Set<? extends Annotation> set, C3008s sVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> f = C3026u.m13680f(type);
            if (f.isInterface() || f.isEnum()) {
                return null;
            }
            if (C3064a.m13767h(f) && !C3026u.m13682h(f)) {
                throw new IllegalArgumentException("Platform " + C3064a.m13773n(type, set) + " requires explicit JsonAdapter to be registered");
            } else if (!set.isEmpty()) {
                return null;
            } else {
                if (f.isAnonymousClass()) {
                    throw new IllegalArgumentException("Cannot serialize anonymous class " + f.getName());
                } else if (f.isLocalClass()) {
                    throw new IllegalArgumentException("Cannot serialize local class " + f.getName());
                } else if (f.getEnclosingClass() != null && !Modifier.isStatic(f.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize non-static nested class " + f.getName());
                } else if (!Modifier.isAbstract(f.getModifiers())) {
                    C2965b<?> a = C2965b.m13435a(f);
                    TreeMap treeMap = new TreeMap();
                    while (type != Object.class) {
                        m13443b(sVar, type, treeMap);
                        type = C3026u.m13679e(type);
                    }
                    return new C2970c(a, treeMap).mo10217d();
                } else {
                    throw new IllegalArgumentException("Cannot serialize abstract class " + f.getName());
                }
            }
        }
    }

    /* renamed from: q1.c$b */
    static class C2972b<T> {

        /* renamed from: a */
        final String f9778a;

        /* renamed from: b */
        final Field f9779b;

        /* renamed from: c */
        final C2978f<T> f9780c;

        C2972b(String str, Field field, C2978f<T> fVar) {
            this.f9778a = str;
            this.f9779b = field;
            this.f9780c = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10207a(C2988k kVar, Object obj) {
            this.f9779b.set(obj, this.f9780c.mo10197b(kVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo10208b(C2995p pVar, Object obj) {
            this.f9780c.mo10198f(pVar, this.f9779b.get(obj));
        }
    }

    C2970c(C2965b<T> bVar, Map<String, C2972b<?>> map) {
        this.f9775a = bVar;
        this.f9776b = (C2972b[]) map.values().toArray(new C2972b[map.size()]);
        this.f9777c = C2988k.C2989a.m13501a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    /* renamed from: b */
    public T mo10197b(C2988k kVar) {
        try {
            T b = this.f9775a.mo10201b();
            try {
                kVar.mo10236c();
                while (kVar.mo10245n()) {
                    int T = kVar.mo10232T(this.f9777c);
                    if (T == -1) {
                        kVar.mo10238d0();
                        kVar.mo10239e0();
                    } else {
                        this.f9776b[T].mo10207a(kVar, b);
                    }
                }
                kVar.mo10242h();
                return b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw C3064a.m13772m(e2);
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    /* renamed from: f */
    public void mo10198f(C2995p pVar, T t) {
        try {
            pVar.mo10257c();
            for (C2972b<?> bVar : this.f9776b) {
                pVar.mo10263w(bVar.f9778a);
                bVar.mo10208b(pVar, t);
            }
            pVar.mo10262i();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f9775a + ")";
    }
}
