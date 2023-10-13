package p105p4;

/* renamed from: p4.a */
public class C2954a {

    /* renamed from: a */
    private static C2956c f9706a;

    /* renamed from: a */
    public static synchronized C2956c m13328a() {
        C2956c cVar;
        synchronized (C2954a.class) {
            if (f9706a == null) {
                f9706a = new C2955b();
            }
            cVar = f9706a;
        }
        return cVar;
    }
}
