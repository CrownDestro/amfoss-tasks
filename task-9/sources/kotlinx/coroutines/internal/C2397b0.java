package kotlinx.coroutines.internal;

import p127t2.C3178l;
import p127t2.C3181m;

/* renamed from: kotlinx.coroutines.internal.b0 */
public final class C2397b0 {

    /* renamed from: a */
    private static final String f8308a;

    /* renamed from: b */
    private static final String f8309b;

    static {
        Object obj;
        Object obj2;
        try {
            C3178l.C3179a aVar = C3178l.f10555d;
            obj = C3178l.m14054a(Class.forName("y2.a").getCanonicalName());
        } catch (Throwable th) {
            C3178l.C3179a aVar2 = C3178l.f10555d;
            obj = C3178l.m14054a(C3181m.m14058a(th));
        }
        if (C3178l.m14055b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f8308a = (String) obj;
        try {
            C3178l.C3179a aVar3 = C3178l.f10555d;
            obj2 = C3178l.m14054a(C2397b0.class.getCanonicalName());
        } catch (Throwable th2) {
            C3178l.C3179a aVar4 = C3178l.f10555d;
            obj2 = C3178l.m14054a(C3181m.m14058a(th2));
        }
        if (C3178l.m14055b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f8309b = (String) obj2;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m11193a(E e) {
        return e;
    }
}
