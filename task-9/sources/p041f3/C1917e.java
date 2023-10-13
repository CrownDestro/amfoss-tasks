package p041f3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p027d3.C1737a;
import p034e3.C1769a;
import p034e3.C1770b;
import p034e3.C1771c;
import p034e3.C1772d;
import p034e3.C1773e;
import p034e3.C1774f;
import p034e3.C1775g;
import p034e3.C1776h;
import p034e3.C1777i;
import p034e3.C1778j;
import p034e3.C1779k;
import p034e3.C1780l;
import p034e3.C1781m;
import p034e3.C1782n;
import p034e3.C1783o;
import p034e3.C1784p;
import p034e3.C1785q;
import p034e3.C1786r;
import p034e3.C1787s;
import p034e3.C1788t;
import p034e3.C1789u;
import p034e3.C1790v;
import p034e3.C1791w;
import p074k3.C2385b;
import p127t2.C3169c;
import p127t2.C3177k;
import p127t2.C3183o;

/* renamed from: f3.e */
public final class C1917e implements C2385b<Object>, C1916d {

    /* renamed from: b */
    public static final C1918a f6887b = new C1918a((C1920g) null);

    /* renamed from: c */
    private static final Map<Class<? extends C3169c<?>>, Integer> f6888c;

    /* renamed from: d */
    private static final HashMap<String, String> f6889d;

    /* renamed from: e */
    private static final HashMap<String, String> f6890e;

    /* renamed from: f */
    private static final HashMap<String, String> f6891f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Map<String, String> f6892g;

    /* renamed from: a */
    private final Class<?> f6893a;

    /* renamed from: f3.e$a */
    public static final class C1918a {
        private C1918a() {
        }

        public /* synthetic */ C1918a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo7660a(Class<?> cls) {
            String str;
            C1924k.m9141g(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        C1924k.m9140f(simpleName, "name");
                        String t0 = C2647q.m12041t0(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (t0 != null) {
                            return t0;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    C1924k.m9140f(simpleName, "name");
                    if (enclosingConstructor == null) {
                        return C2647q.m12040s0(simpleName, '$', (String) null, 2, (Object) null);
                    }
                    return C2647q.m12041t0(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) C1917e.f6892g.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) C1917e.f6892g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i = 0;
        List h = C3263l.m14371h(C1769a.class, C1780l.class, C1784p.class, C1785q.class, C1786r.class, C1787s.class, C1788t.class, C1789u.class, C1790v.class, C1791w.class, C1770b.class, C1771c.class, C1772d.class, C1773e.class, C1774f.class, C1775g.class, C1776h.class, C1777i.class, C1778j.class, C1779k.class, C1781m.class, C1782n.class, C1783o.class);
        ArrayList arrayList = new ArrayList(C3264m.m14377n(h, 10));
        for (Object next : h) {
            int i2 = i + 1;
            if (i < 0) {
                C3263l.m14376m();
            }
            arrayList.add(C3183o.m14061a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f6888c = C3248c0.m14289g(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f6889d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f6890e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C1924k.m9140f(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C1924k.m9140f(str, "kotlinName");
            sb.append(C2647q.m12043v0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C3177k a = C3183o.m14061a(sb2, str + ".Companion");
            hashMap3.put(a.mo10542c(), a.mo10543d());
        }
        for (Map.Entry next2 : f6888c.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f6891f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C3246b0.m14282a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C2647q.m12043v0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f6892g = linkedHashMap;
    }

    public C1917e(Class<?> cls) {
        C1924k.m9141g(cls, "jClass");
        this.f6893a = cls;
    }

    /* renamed from: a */
    public String mo7656a() {
        return f6887b.mo7660a(mo7655b());
    }

    /* renamed from: b */
    public Class<?> mo7655b() {
        return this.f6893a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1917e) && C1924k.m9136b(C1737a.m8631b(this), C1737a.m8631b((C2385b) obj));
    }

    public int hashCode() {
        return C1737a.m8631b(this).hashCode();
    }

    public String toString() {
        return mo7655b().toString() + " (Kotlin reflection is not available)";
    }
}
