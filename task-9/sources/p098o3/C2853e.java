package p098o3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import p041f3.C1920g;
import p127t2.C3178l;
import p127t2.C3181m;

/* renamed from: o3.e */
public final class C2853e {

    /* renamed from: a */
    public static final C2852d f9376a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C2852d dVar = null;
        try {
            C3178l.C3179a aVar = C3178l.f10555d;
            obj = C3178l.m14054a(new C2849c(m12931a(Looper.getMainLooper(), true), (String) null, 2, (C1920g) null));
        } catch (Throwable th) {
            C3178l.C3179a aVar2 = C3178l.f10555d;
            obj = C3178l.m14054a(C3181m.m14058a(th));
        }
        if (!C3178l.m14056c(obj)) {
            dVar = obj;
        }
        f9376a = dVar;
    }

    /* renamed from: a */
    public static final Handler m12931a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
