package p014b4;

import p041f3.C1920g;
import p041f3.C1924k;
import p062i4.C2114h;
import p134u3.C3359w;

/* renamed from: b4.a */
public final class C1256a {

    /* renamed from: c */
    public static final C1257a f4290c = new C1257a((C1920g) null);

    /* renamed from: a */
    private long f4291a = ((long) 262144);

    /* renamed from: b */
    private final C2114h f4292b;

    /* renamed from: b4.a$a */
    public static final class C1257a {
        private C1257a() {
        }

        public /* synthetic */ C1257a(C1920g gVar) {
            this();
        }
    }

    public C1256a(C2114h hVar) {
        C1924k.m9142h(hVar, "source");
        this.f4292b = hVar;
    }

    /* renamed from: a */
    public final C3359w mo5083a() {
        C3359w.C3360a aVar = new C3359w.C3360a();
        while (true) {
            String b = mo5084b();
            if (b.length() == 0) {
                return aVar.mo11116e();
            }
            aVar.mo11114c(b);
        }
    }

    /* renamed from: b */
    public final String mo5084b() {
        String u = this.f4292b.mo7961u(this.f4291a);
        this.f4291a -= (long) u.length();
        return u;
    }
}
