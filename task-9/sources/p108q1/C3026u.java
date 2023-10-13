package p108q1;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p114r1.C3064a;

@CheckReturnValue
/* renamed from: q1.u */
public final class C3026u {
    /* renamed from: a */
    static Type m13675a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* renamed from: b */
    public static GenericArrayType m13676b(Type type) {
        return new C3064a.C3065a(type);
    }

    /* renamed from: c */
    public static Type m13677c(Type type, Class<?> cls) {
        Type g = m13681g(type, cls, Collection.class);
        if (g instanceof WildcardType) {
            g = ((WildcardType) g).getUpperBounds()[0];
        }
        return g instanceof ParameterizedType ? ((ParameterizedType) g).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: d */
    public static boolean m13678d(@Nullable Type type, @Nullable Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m13678d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m13678d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C3064a.C3066b ? ((C3064a.C3066b) parameterizedType).f9984f : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C3064a.C3066b ? ((C3064a.C3066b) parameterizedType2).f9984f : parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m13678d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m13678d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    /* renamed from: e */
    static Type m13679e(Type type) {
        Class<?> f = m13680f(type);
        return C3064a.m13770k(type, f, f.getGenericSuperclass());
    }

    /* renamed from: f */
    public static Class<?> m13680f(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m13680f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m13680f(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    /* renamed from: g */
    static Type m13681g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C3064a.m13770k(type, cls, C3064a.m13764e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    static boolean m13682h(Type type) {
        return type == Boolean.class || type == Byte.class || type == Character.class || type == Double.class || type == Float.class || type == Integer.class || type == Long.class || type == Short.class || type == String.class || type == Object.class;
    }

    /* renamed from: i */
    static Type[] m13683i(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type g = m13681g(type, cls, Map.class);
        if (g instanceof ParameterizedType) {
            return ((ParameterizedType) g).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: j */
    public static WildcardType m13684j(Type type) {
        return new C3064a.C3067c(new Type[]{type}, C3064a.f9980b);
    }

    /* renamed from: k */
    public static WildcardType m13685k(Type type) {
        return new C3064a.C3067c(new Type[]{Object.class}, new Type[]{type});
    }
}
