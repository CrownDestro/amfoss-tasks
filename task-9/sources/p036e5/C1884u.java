package p036e5;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p036e5.C1811a;
import p036e5.C1819c;
import p036e5.C1828f;
import p134u3.C3288b0;
import p134u3.C3306e;
import p134u3.C3308e0;
import p134u3.C3320g0;
import p134u3.C3362x;

/* renamed from: e5.u */
public final class C1884u {

    /* renamed from: a */
    private final Map<Method, C1887v<?>> f6828a = new ConcurrentHashMap();

    /* renamed from: b */
    final C3306e.C3307a f6829b;

    /* renamed from: c */
    final C3362x f6830c;

    /* renamed from: d */
    final List<C1828f.C1829a> f6831d;

    /* renamed from: e */
    final List<C1819c.C1820a> f6832e;
    @Nullable

    /* renamed from: f */
    final Executor f6833f;

    /* renamed from: g */
    final boolean f6834g;

    /* renamed from: e5.u$a */
    class C1885a implements InvocationHandler {

        /* renamed from: a */
        private final C1876q f6835a = C1876q.m8995f();

        /* renamed from: b */
        private final Object[] f6836b = new Object[0];

        /* renamed from: c */
        final /* synthetic */ Class f6837c;

        C1885a(Class cls) {
            this.f6837c = cls;
        }

        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f6836b;
            }
            return this.f6835a.mo7561h(method) ? this.f6835a.mo7560g(method, this.f6837c, obj, objArr) : C1884u.this.mo7586c(method).mo7530a(objArr);
        }
    }

    /* renamed from: e5.u$b */
    public static final class C1886b {

        /* renamed from: a */
        private final C1876q f6839a;
        @Nullable

        /* renamed from: b */
        private C3306e.C3307a f6840b;
        @Nullable

        /* renamed from: c */
        private C3362x f6841c;

        /* renamed from: d */
        private final List<C1828f.C1829a> f6842d;

        /* renamed from: e */
        private final List<C1819c.C1820a> f6843e;
        @Nullable

        /* renamed from: f */
        private Executor f6844f;

        /* renamed from: g */
        private boolean f6845g;

        public C1886b() {
            this(C1876q.m8995f());
        }

        C1886b(C1876q qVar) {
            this.f6842d = new ArrayList();
            this.f6843e = new ArrayList();
            this.f6839a = qVar;
        }

        /* renamed from: a */
        public C1886b mo7594a(C1828f.C1829a aVar) {
            List<C1828f.C1829a> list = this.f6842d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C1886b mo7595b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return mo7596c(C3362x.m14827h(str));
        }

        /* renamed from: c */
        public C1886b mo7596c(C3362x xVar) {
            Objects.requireNonNull(xVar, "baseUrl == null");
            List<String> m = xVar.mo11134m();
            if ("".equals(m.get(m.size() - 1))) {
                this.f6841c = xVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + xVar);
        }

        /* renamed from: d */
        public C1884u mo7597d() {
            if (this.f6841c != null) {
                C3306e.C3307a aVar = this.f6840b;
                if (aVar == null) {
                    aVar = new C3288b0();
                }
                C3306e.C3307a aVar2 = aVar;
                Executor executor = this.f6844f;
                if (executor == null) {
                    executor = this.f6839a.mo7557b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f6843e);
                arrayList.addAll(this.f6839a.mo7556a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f6842d.size() + 1 + this.f6839a.mo7559d());
                arrayList2.add(new C1811a());
                arrayList2.addAll(this.f6842d);
                arrayList2.addAll(this.f6839a.mo7558c());
                return new C1884u(aVar2, this.f6841c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f6845g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: e */
        public C1886b mo7598e(C3306e.C3307a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f6840b = aVar;
            return this;
        }

        /* renamed from: f */
        public C1886b mo7599f(C3288b0 b0Var) {
            Objects.requireNonNull(b0Var, "client == null");
            return mo7598e(b0Var);
        }
    }

    C1884u(C3306e.C3307a aVar, C3362x xVar, List<C1828f.C1829a> list, List<C1819c.C1820a> list2, @Nullable Executor executor, boolean z) {
        this.f6829b = aVar;
        this.f6830c = xVar;
        this.f6831d = list;
        this.f6832e = list2;
        this.f6833f = executor;
        this.f6834g = z;
    }

    /* renamed from: j */
    private void m9038j(Class<?> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f6834g) {
                C1876q f = C1876q.m8995f();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!f.mo7561h(method) && !Modifier.isStatic(method.getModifiers())) {
                        mo7586c(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: a */
    public C1819c<?, ?> mo7584a(Type type, Annotation[] annotationArr) {
        return mo7587d((C1819c.C1820a) null, type, annotationArr);
    }

    /* renamed from: b */
    public <T> T mo7585b(Class<T> cls) {
        m9038j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C1885a(cls));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1887v<?> mo7586c(Method method) {
        C1887v<?> vVar;
        C1887v<?> vVar2 = this.f6828a.get(method);
        if (vVar2 != null) {
            return vVar2;
        }
        synchronized (this.f6828a) {
            vVar = this.f6828a.get(method);
            if (vVar == null) {
                vVar = C1887v.m9054b(this, method);
                this.f6828a.put(method, vVar);
            }
        }
        return vVar;
    }

    /* renamed from: d */
    public C1819c<?, ?> mo7587d(@Nullable C1819c.C1820a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f6832e.indexOf(aVar) + 1;
        int size = this.f6832e.size();
        for (int i = indexOf; i < size; i++) {
            C1819c<?, ?> a = this.f6832e.get(i).mo7519a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f6832e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f6832e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f6832e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public <T> C1828f<T, C3308e0> mo7588e(@Nullable C1828f.C1829a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f6831d.indexOf(aVar) + 1;
        int size = this.f6831d.size();
        for (int i = indexOf; i < size; i++) {
            C1828f<?, C3308e0> c = this.f6831d.get(i).mo7503c(type, annotationArr, annotationArr2, this);
            if (c != null) {
                return c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f6831d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f6831d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f6831d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public <T> C1828f<C3320g0, T> mo7589f(@Nullable C1828f.C1829a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f6831d.indexOf(aVar) + 1;
        int size = this.f6831d.size();
        for (int i = indexOf; i < size; i++) {
            C1828f<C3320g0, ?> d = this.f6831d.get(i).mo7504d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f6831d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f6831d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f6831d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public <T> C1828f<T, C3308e0> mo7590g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo7588e((C1828f.C1829a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public <T> C1828f<C3320g0, T> mo7591h(Type type, Annotation[] annotationArr) {
        return mo7589f((C1828f.C1829a) null, type, annotationArr);
    }

    /* renamed from: i */
    public <T> C1828f<T, String> mo7592i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f6831d.size();
        for (int i = 0; i < size; i++) {
            C1828f<?, String> e = this.f6831d.get(i).mo7525e(type, annotationArr, this);
            if (e != null) {
                return e;
            }
        }
        return C1811a.C1815d.f6659a;
    }
}
