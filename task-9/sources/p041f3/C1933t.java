package p041f3;

import p074k3.C2385b;
import p074k3.C2386c;
import p074k3.C2387d;
import p074k3.C2388e;

/* renamed from: f3.t */
public class C1933t {

    /* renamed from: a */
    private static final C1934u f6904a;

    /* renamed from: b */
    private static final C2385b[] f6905b = new C2385b[0];

    static {
        C1934u uVar = null;
        try {
            uVar = (C1934u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new C1934u();
        }
        f6904a = uVar;
    }

    /* renamed from: a */
    public static C2387d m9160a(C1922i iVar) {
        return f6904a.mo7675a(iVar);
    }

    /* renamed from: b */
    public static C2385b m9161b(Class cls) {
        return f6904a.mo7676b(cls);
    }

    /* renamed from: c */
    public static C2386c m9162c(Class cls) {
        return f6904a.mo7677c(cls, "");
    }

    /* renamed from: d */
    public static C2388e m9163d(C1927n nVar) {
        return f6904a.mo7678d(nVar);
    }

    /* renamed from: e */
    public static String m9164e(C1921h hVar) {
        return f6904a.mo7679e(hVar);
    }

    /* renamed from: f */
    public static String m9165f(C1925l lVar) {
        return f6904a.mo7680f(lVar);
    }
}
