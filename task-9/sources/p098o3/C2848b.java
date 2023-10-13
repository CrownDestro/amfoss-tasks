package p098o3;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p092n3.C2730e0;
import p145w2.C3439a;
import p145w2.C3448g;

/* renamed from: o3.b */
public final class C2848b extends C3439a implements C2730e0 {
    private volatile Object _preHandler = this;

    public C2848b() {
        super(C2730e0.f9038a);
    }

    /* renamed from: a0 */
    private final Method m12920a0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    /* renamed from: Q */
    public void mo9489Q(C3448g gVar, Throwable th) {
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            Method a0 = m12920a0();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            Object invoke = a0 != null ? a0.invoke((Object) null, new Object[0]) : null;
            if (invoke instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) invoke;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
