package p108q1;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p114r1.C3064a;

/* renamed from: q1.b */
abstract class C2965b<T> {

    /* renamed from: q1.b$a */
    class C2966a extends C2965b<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f9764a;

        /* renamed from: b */
        final /* synthetic */ Class f9765b;

        C2966a(Constructor constructor, Class cls) {
            this.f9764a = constructor;
            this.f9765b = cls;
        }

        /* renamed from: b */
        public T mo10201b() {
            return this.f9764a.newInstance((Object[]) null);
        }

        public String toString() {
            return this.f9765b.getName();
        }
    }

    /* renamed from: q1.b$b */
    class C2967b extends C2965b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f9766a;

        /* renamed from: b */
        final /* synthetic */ Object f9767b;

        /* renamed from: c */
        final /* synthetic */ Class f9768c;

        C2967b(Method method, Object obj, Class cls) {
            this.f9766a = method;
            this.f9767b = obj;
            this.f9768c = cls;
        }

        /* renamed from: b */
        public T mo10201b() {
            return this.f9766a.invoke(this.f9767b, new Object[]{this.f9768c});
        }

        public String toString() {
            return this.f9768c.getName();
        }
    }

    /* renamed from: q1.b$c */
    class C2968c extends C2965b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f9769a;

        /* renamed from: b */
        final /* synthetic */ Class f9770b;

        /* renamed from: c */
        final /* synthetic */ int f9771c;

        C2968c(Method method, Class cls, int i) {
            this.f9769a = method;
            this.f9770b = cls;
            this.f9771c = i;
        }

        /* renamed from: b */
        public T mo10201b() {
            return this.f9769a.invoke((Object) null, new Object[]{this.f9770b, Integer.valueOf(this.f9771c)});
        }

        public String toString() {
            return this.f9770b.getName();
        }
    }

    /* renamed from: q1.b$d */
    class C2969d extends C2965b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f9772a;

        /* renamed from: b */
        final /* synthetic */ Class f9773b;

        C2969d(Method method, Class cls) {
            this.f9772a = method;
            this.f9773b = cls;
        }

        /* renamed from: b */
        public T mo10201b() {
            return this.f9772a.invoke((Object) null, new Object[]{this.f9773b, Object.class});
        }

        public String toString() {
            return this.f9773b.getName();
        }
    }

    C2965b() {
    }

    /* renamed from: a */
    public static <T> C2965b<T> m13435a(Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new C2966a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new C2967b(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null), cls);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                    declaredMethod2.setAccessible(true);
                    return new C2968c(declaredMethod2, cls, intValue);
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (InvocationTargetException e) {
                    throw C3064a.m13772m(e);
                } catch (NoSuchMethodException unused5) {
                    try {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                        declaredMethod3.setAccessible(true);
                        return new C2969d(declaredMethod3, cls);
                    } catch (Exception unused6) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo10201b();
}
