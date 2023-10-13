package p056h4;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import p035e4.C1809h;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: h4.c */
public abstract class C2025c {

    /* renamed from: a */
    public static final C2026a f7101a = new C2026a((C1920g) null);

    /* renamed from: h4.c$a */
    public static final class C2026a {
        private C2026a() {
        }

        public /* synthetic */ C2026a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2025c mo7764a(X509TrustManager x509TrustManager) {
            C1924k.m9142h(x509TrustManager, "trustManager");
            return C1809h.f6654c.mo7501g().mo7463c(x509TrustManager);
        }
    }

    /* renamed from: a */
    public abstract List<Certificate> mo7687a(List<? extends Certificate> list, String str);
}
