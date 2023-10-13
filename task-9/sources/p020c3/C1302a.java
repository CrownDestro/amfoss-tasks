package p020c3;

import java.io.Closeable;

/* renamed from: c3.a */
public final class C1302a {
    /* renamed from: a */
    public static final void m6198a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C3168b.m14046a(th, th2);
        }
    }
}
