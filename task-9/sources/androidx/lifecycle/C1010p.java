package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p041f3.C1924k;

/* renamed from: androidx.lifecycle.p */
public final class C1010p {

    /* renamed from: a */
    public static final C1010p f3439a = new C1010p();

    /* renamed from: b */
    private static final Map<Class<?>, Integer> f3440b = new HashMap();

    /* renamed from: c */
    private static final Map<Class<?>, List<Constructor<? extends C0984d>>> f3441c = new HashMap();

    private C1010p() {
    }

    /* renamed from: a */
    private final C0984d m4492a(Constructor<? extends C0984d> constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            C1924k.m9140f(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (C0984d) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private final Constructor<? extends C0984d> m4493b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            C1924k.m9140f(name, "fullPackage");
            if (!(name.length() == 0)) {
                C1924k.m9140f(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                C1924k.m9140f(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            C1924k.m9140f(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c = m4494c(canonicalName);
            if (!(name.length() == 0)) {
                c = name + '.' + c;
            }
            Class<?> cls2 = Class.forName(c);
            C1924k.m9139e(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static final String m4494c(String str) {
        C1924k.m9141g(str, "className");
        return C2646p.m11994x(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private final int m4495d(Class<?> cls) {
        Map<Class<?>, Integer> map = f3440b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m4498g(cls);
        map.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private final boolean m4496e(Class<?> cls) {
        return cls != null && C1004l.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    public static final C1002j m4497f(Object obj) {
        C1924k.m9141g(obj, "object");
        boolean z = obj instanceof C1002j;
        boolean z2 = obj instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (C1002j) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (C1002j) null);
        }
        if (z) {
            return (C1002j) obj;
        }
        Class<?> cls = obj.getClass();
        C1010p pVar = f3439a;
        if (pVar.m4495d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends C0984d>> list = f3441c.get(cls);
        C1924k.m9138d(list);
        List list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(pVar.m4492a((Constructor) list2.get(0), obj));
        }
        int size = list2.size();
        C0984d[] dVarArr = new C0984d[size];
        for (int i = 0; i < size; i++) {
            dVarArr[i] = f3439a.m4492a((Constructor) list2.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    /* renamed from: g */
    private final int m4498g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0984d> b = m4493b(cls);
        if (b != null) {
            f3441c.put(cls, C3262k.m14365b(b));
            return 2;
        } else if (C0967a.f3395c.mo3755d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m4496e(superclass)) {
                C1924k.m9140f(superclass, "superclass");
                if (m4495d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends C0984d>> list = f3441c.get(superclass);
                C1924k.m9138d(list);
                arrayList = new ArrayList(list);
            }
            Class[] interfaces = cls.getInterfaces();
            C1924k.m9140f(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (m4496e(cls2)) {
                    C1924k.m9140f(cls2, "intrface");
                    if (m4495d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends C0984d>> list2 = f3441c.get(cls2);
                    C1924k.m9138d(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3441c.put(cls, arrayList);
            return 2;
        }
    }
}
