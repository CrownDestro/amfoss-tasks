package kotlinx.coroutines.scheduling;

/* renamed from: kotlinx.coroutines.scheduling.c */
public final class C2446c extends C2449f {

    /* renamed from: l */
    public static final C2446c f8397l = new C2446c();

    private C2446c() {
        super(C2455l.f8409b, C2455l.f8410c, C2455l.f8411d, "DefaultDispatcher");
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
