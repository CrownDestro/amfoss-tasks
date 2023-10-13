package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.a */
final class C0967a {

    /* renamed from: c */
    static C0967a f3395c = new C0967a();

    /* renamed from: a */
    private final Map<Class<?>, C0968a> f3396a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f3397b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a */
    static class C0968a {

        /* renamed from: a */
        final Map<C0988f.C0989a, List<C0969b>> f3398a = new HashMap();

        /* renamed from: b */
        final Map<C0969b, C0988f.C0989a> f3399b;

        C0968a(Map<C0969b, C0988f.C0989a> map) {
            this.f3399b = map;
            for (Map.Entry next : map.entrySet()) {
                C0988f.C0989a aVar = (C0988f.C0989a) next.getValue();
                List list = this.f3398a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3398a.put(aVar, list);
                }
                list.add((C0969b) next.getKey());
            }
        }

        /* renamed from: b */
        private static void m4427b(List<C0969b> list, C1005m mVar, C0988f.C0989a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo3757a(mVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3756a(C1005m mVar, C0988f.C0989a aVar, Object obj) {
            m4427b(this.f3398a.get(aVar), mVar, aVar, obj);
            m4427b(this.f3398a.get(C0988f.C0989a.ON_ANY), mVar, aVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.a$b */
    static final class C0969b {

        /* renamed from: a */
        final int f3400a;

        /* renamed from: b */
        final Method f3401b;

        C0969b(int i, Method method) {
            this.f3400a = i;
            this.f3401b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3757a(C1005m mVar, C0988f.C0989a aVar, Object obj) {
            try {
                int i = this.f3400a;
                if (i == 0) {
                    this.f3401b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3401b.invoke(obj, new Object[]{mVar});
                } else if (i == 2) {
                    this.f3401b.invoke(obj, new Object[]{mVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0969b)) {
                return false;
            }
            C0969b bVar = (C0969b) obj;
            return this.f3400a == bVar.f3400a && this.f3401b.getName().equals(bVar.f3401b.getName());
        }

        public int hashCode() {
            return (this.f3400a * 31) + this.f3401b.getName().hashCode();
        }
    }

    C0967a() {
    }

    /* renamed from: a */
    private C0968a m4422a(Class<?> cls, Method[] methodArr) {
        int i;
        C0968a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo3754c(superclass)) == null)) {
            hashMap.putAll(c.f3399b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo3754c(c2).f3399b.entrySet()) {
                m4424e(hashMap, (C0969b) next.getKey(), (C0988f.C0989a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m4423b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1014t tVar = (C1014t) method.getAnnotation(C1014t.class);
            if (tVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (C1005m.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0988f.C0989a value = tVar.value();
                if (parameterTypes.length > 1) {
                    if (!C0988f.C0989a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0988f.C0989a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m4424e(hashMap, new C0969b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0968a aVar = new C0968a(hashMap);
        this.f3396a.put(cls, aVar);
        this.f3397b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m4423b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m4424e(Map<C0969b, C0988f.C0989a> map, C0969b bVar, C0988f.C0989a aVar, Class<?> cls) {
        C0988f.C0989a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f3401b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0968a mo3754c(Class<?> cls) {
        C0968a aVar = this.f3396a.get(cls);
        return aVar != null ? aVar : m4422a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3755d(Class<?> cls) {
        Boolean bool = this.f3397b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m4423b(cls);
        for (Method annotation : b) {
            if (((C1014t) annotation.getAnnotation(C1014t.class)) != null) {
                m4422a(cls, b);
                return true;
            }
        }
        this.f3397b.put(cls, Boolean.FALSE);
        return false;
    }
}
