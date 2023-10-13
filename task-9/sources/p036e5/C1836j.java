package p036e5;

import java.util.Objects;

/* renamed from: e5.j */
public class C1836j extends RuntimeException {

    /* renamed from: d */
    private final int f6684d;

    /* renamed from: e */
    private final String f6685e;

    /* renamed from: f */
    private final transient C1883t<?> f6686f;

    public C1836j(C1883t<?> tVar) {
        super(m8918a(tVar));
        this.f6684d = tVar.mo7580b();
        this.f6685e = tVar.mo7582e();
        this.f6686f = tVar;
    }

    /* renamed from: a */
    private static String m8918a(C1883t<?> tVar) {
        Objects.requireNonNull(tVar, "response == null");
        return "HTTP " + tVar.mo7580b() + " " + tVar.mo7582e();
    }
}
