package p042f4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p035e4.C1797c;
import p035e4.C1809h;
import p041f3.C1920g;
import p041f3.C1924k;
import p127t2.C3184p;
import p134u3.C3299c0;

/* renamed from: f4.g */
public final class C1946g implements C1953k {

    /* renamed from: a */
    public static final C1947a f6921a = new C1947a((C1920g) null);

    /* renamed from: f4.g$a */
    public static final class C1947a {
        private C1947a() {
        }

        public /* synthetic */ C1947a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1953k mo7696a() {
            if (C1797c.f6632f.mo7482b()) {
                return new C1946g();
            }
            return null;
        }
    }

    /* renamed from: a */
    public String mo7681a(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !C1924k.m9136b(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo7682b(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    /* renamed from: c */
    public boolean mo7683c() {
        return C1797c.f6632f.mo7482b();
    }

    /* renamed from: d */
    public void mo7684d(SSLSocket sSLSocket, String str, List<? extends C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        if (mo7682b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C1924k.m9137c(parameters, "sslParameters");
            Object[] array = C1809h.f6654c.mo7499b(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new C3184p("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
