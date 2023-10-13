package p042f4;

import java.lang.reflect.Method;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: f4.h */
public final class C1948h {

    /* renamed from: d */
    public static final C1949a f6922d = new C1949a((C1920g) null);

    /* renamed from: a */
    private final Method f6923a;

    /* renamed from: b */
    private final Method f6924b;

    /* renamed from: c */
    private final Method f6925c;

    /* renamed from: f4.h$a */
    public static final class C1949a {
        private C1949a() {
        }

        public /* synthetic */ C1949a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1948h mo7699a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C1948h(method3, method, method2);
        }
    }

    public C1948h(Method method, Method method2, Method method3) {
        this.f6923a = method;
        this.f6924b = method2;
        this.f6925c = method3;
    }

    /* renamed from: a */
    public final Object mo7697a(String str) {
        C1924k.m9142h(str, "closer");
        Method method = this.f6923a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, new Object[0]);
                Method method2 = this.f6924b;
                if (method2 == null) {
                    C1924k.m9150p();
                }
                method2.invoke(invoke, new Object[]{str});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo7698b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f6925c;
            if (method == null) {
                C1924k.m9150p();
            }
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
