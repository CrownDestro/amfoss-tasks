package kotlinx.coroutines.internal;

import p127t2.C3178l;
import p127t2.C3181m;

/* renamed from: kotlinx.coroutines.internal.j */
public final class C2415j {

    /* renamed from: a */
    private static final boolean f8331a;

    static {
        Object obj;
        try {
            C3178l.C3179a aVar = C3178l.f10555d;
            obj = C3178l.m14054a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C3178l.C3179a aVar2 = C3178l.f10555d;
            obj = C3178l.m14054a(C3181m.m14058a(th));
        }
        f8331a = C3178l.m14057d(obj);
    }

    /* renamed from: a */
    public static final boolean m11265a() {
        return f8331a;
    }
}
