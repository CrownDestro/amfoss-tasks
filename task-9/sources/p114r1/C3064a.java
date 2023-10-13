package p114r1;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import p108q1.C2978f;
import p108q1.C2984g;
import p108q1.C2987j;
import p108q1.C3008s;
import p108q1.C3026u;

/* renamed from: r1.a */
public final class C3064a {

    /* renamed from: a */
    public static final Set<Annotation> f9979a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f9980b = new Type[0];

    /* renamed from: r1.a$a */
    public static final class C3065a implements GenericArrayType {

        /* renamed from: d */
        private final Type f9981d;

        public C3065a(Type type) {
            this.f9981d = C3064a.m13760a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C3026u.m13678d(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f9981d;
        }

        public int hashCode() {
            return this.f9981d.hashCode();
        }

        public String toString() {
            return C3064a.m13774o(this.f9981d) + "[]";
        }
    }

    /* renamed from: r1.a$b */
    public static final class C3066b implements ParameterizedType {
        @Nullable

        /* renamed from: d */
        private final Type f9982d;

        /* renamed from: e */
        private final Type f9983e;

        /* renamed from: f */
        public final Type[] f9984f;

        public C3066b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C3026u.m13680f(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f9982d = type == null ? null : C3064a.m13760a(type);
            this.f9983e = C3064a.m13760a(type2);
            this.f9984f = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f9984f;
                if (i < typeArr2.length) {
                    Objects.requireNonNull(typeArr2[i]);
                    C3064a.m13761b(typeArr2[i]);
                    Type[] typeArr3 = this.f9984f;
                    typeArr3[i] = C3064a.m13760a(typeArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C3026u.m13678d(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f9984f.clone();
        }

        @Nullable
        public Type getOwnerType() {
            return this.f9982d;
        }

        public Type getRawType() {
            return this.f9983e;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f9984f) ^ this.f9983e.hashCode()) ^ C3064a.m13765f(this.f9982d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f9984f.length + 1) * 30);
            sb.append(C3064a.m13774o(this.f9983e));
            if (this.f9984f.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C3064a.m13774o(this.f9984f[0]));
            for (int i = 1; i < this.f9984f.length; i++) {
                sb.append(", ");
                sb.append(C3064a.m13774o(this.f9984f[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: r1.a$c */
    public static final class C3067c implements WildcardType {

        /* renamed from: d */
        private final Type f9985d;
        @Nullable

        /* renamed from: e */
        private final Type f9986e;

        public C3067c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                C3064a.m13761b(typeArr2[0]);
                if (typeArr[0] == cls) {
                    this.f9986e = C3064a.m13760a(typeArr2[0]);
                    this.f9985d = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Objects.requireNonNull(typeArr[0]);
                C3064a.m13761b(typeArr[0]);
                this.f9986e = null;
                this.f9985d = C3064a.m13760a(typeArr[0]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C3026u.m13678d(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f9986e;
            if (type == null) {
                return C3064a.f9980b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f9985d};
        }

        public int hashCode() {
            Type type = this.f9986e;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f9985d.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f9986e != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f9986e;
            } else if (this.f9985d == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f9985d;
            }
            sb.append(C3064a.m13774o(type));
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static Type m13760a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C3065a(m13760a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C3066b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C3066b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof C3065a ? type : new C3065a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType) || (type instanceof C3067c)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C3067c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    static void m13761b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    @Nullable
    /* renamed from: c */
    static Class<?> m13762c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public static C2978f<?> m13763d(C3008s sVar, Type type, Class<?> cls) {
        Class<C3008s> cls2 = C3008s.class;
        C2984g gVar = (C2984g) cls.getAnnotation(C2984g.class);
        if (gVar == null || !gVar.generateAdapter()) {
            return null;
        }
        try {
            Class<?> cls3 = Class.forName(cls.getName().replace("$", "_") + "JsonAdapter", true, cls.getClassLoader());
            if (type instanceof ParameterizedType) {
                Constructor<?> declaredConstructor = cls3.getDeclaredConstructor(new Class[]{cls2, Type[].class});
                declaredConstructor.setAccessible(true);
                return ((C2978f) declaredConstructor.newInstance(new Object[]{sVar, ((ParameterizedType) type).getActualTypeArguments()})).mo10217d();
            }
            Constructor<?> declaredConstructor2 = cls3.getDeclaredConstructor(new Class[]{cls2});
            declaredConstructor2.setAccessible(true);
            return ((C2978f) declaredConstructor2.newInstance(new Object[]{sVar})).mo10217d();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + cls, e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + cls, e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + cls, e4);
        } catch (InvocationTargetException e5) {
            throw m13772m(e5);
        }
    }

    /* renamed from: e */
    public static Type m13764e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m13764e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m13764e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    static int m13765f(@Nullable Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: g */
    static int m13766g(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: h */
    public static boolean m13767h(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("scala.");
    }

    /* renamed from: i */
    public static Set<? extends Annotation> m13768i(AnnotatedElement annotatedElement) {
        return m13769j(annotatedElement.getAnnotations());
    }

    /* renamed from: j */
    public static Set<? extends Annotation> m13769j(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C2987j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f9979a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m13770k(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m13771l(r8, r9, r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m13770k(r8, r9, r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            java.lang.reflect.GenericArrayType r0 = p108q1.C3026u.m13676b(r8)
        L_0x002b:
            return r0
        L_0x002c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0042
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m13770k(r8, r9, r0)
            if (r0 != r8) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            java.lang.reflect.GenericArrayType r10 = p108q1.C3026u.m13676b(r8)
        L_0x0041:
            return r10
        L_0x0042:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0084
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m13770k(r8, r9, r0)
            if (r3 == r0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005c:
            if (r2 >= r5) goto L_0x0077
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m13770k(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0074
            if (r0 != 0) goto L_0x0072
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x0072:
            r4[r2] = r6
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x005c
        L_0x0077:
            if (r0 == 0) goto L_0x0083
            r1.a$b r8 = new r1.a$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x0083:
            return r10
        L_0x0084:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00b6
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00a4
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m13770k(r8, r9, r1)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00b6
            java.lang.reflect.WildcardType r8 = p108q1.C3026u.m13685k(r8)
            return r8
        L_0x00a4:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00b6
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m13770k(r8, r9, r0)     // Catch:{ all -> 0x00b7 }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00b6
            java.lang.reflect.WildcardType r8 = p108q1.C3026u.m13684j(r8)
            return r8
        L_0x00b6:
            return r10
        L_0x00b7:
            r8 = move-exception
            goto L_0x00ba
        L_0x00b9:
            throw r8
        L_0x00ba:
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: p114r1.C3064a.m13770k(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: l */
    static Type m13771l(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c = m13762c(typeVariable);
        if (c == null) {
            return typeVariable;
        }
        Type e = m13764e(type, cls, c);
        if (!(e instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e).getActualTypeArguments()[m13766g(c.getTypeParameters(), typeVariable)];
    }

    /* renamed from: m */
    public static RuntimeException m13772m(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* renamed from: n */
    public static String m13773n(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: o */
    static String m13774o(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
