package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p070k.C2348g;

/* renamed from: androidx.fragment.app.n */
public class C0925n {

    /* renamed from: a */
    private static final C2348g<ClassLoader, C2348g<String, Class<?>>> f3244a = new C2348g<>();

    /* renamed from: b */
    static boolean m4178b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m4179c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m4179c(ClassLoader classLoader, String str) {
        C2348g<ClassLoader, C2348g<String, Class<?>>> gVar = f3244a;
        C2348g gVar2 = gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new C2348g();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m4180d(ClassLoader classLoader, String str) {
        try {
            return m4179c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0853h("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0853h("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo3593a(ClassLoader classLoader, String str) {
        throw null;
    }
}
