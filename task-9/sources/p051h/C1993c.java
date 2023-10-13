package p051h;

import java.util.concurrent.Executor;

/* renamed from: h.c */
public class C1993c extends C1997e {

    /* renamed from: c */
    private static volatile C1993c f6949c;

    /* renamed from: d */
    private static final Executor f6950d = C1992b.f6948d;

    /* renamed from: e */
    private static final Executor f6951e = C1991a.f6947d;

    /* renamed from: a */
    private C1997e f6952a;

    /* renamed from: b */
    private final C1997e f6953b;

    private C1993c() {
        C1994d dVar = new C1994d();
        this.f6953b = dVar;
        this.f6952a = dVar;
    }

    /* renamed from: f */
    public static C1993c m9238f() {
        if (f6949c != null) {
            return f6949c;
        }
        synchronized (C1993c.class) {
            if (f6949c == null) {
                f6949c = new C1993c();
            }
        }
        return f6949c;
    }

    /* renamed from: a */
    public void mo7738a(Runnable runnable) {
        this.f6952a.mo7738a(runnable);
    }

    /* renamed from: b */
    public boolean mo7739b() {
        return this.f6952a.mo7739b();
    }

    /* renamed from: c */
    public void mo7740c(Runnable runnable) {
        this.f6952a.mo7740c(runnable);
    }
}
