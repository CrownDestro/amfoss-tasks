package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.m */
public final class C2420m {
    /* renamed from: a */
    public static final void m11275a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
        }
    }
}
