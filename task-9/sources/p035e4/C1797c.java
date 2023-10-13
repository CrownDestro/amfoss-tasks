package p035e4;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p041f3.C1920g;
import p041f3.C1924k;
import p127t2.C3184p;
import p134u3.C3299c0;

/* renamed from: e4.c */
public final class C1797c extends C1809h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f6631e;

    /* renamed from: f */
    public static final C1798a f6632f;

    /* renamed from: d */
    private final Provider f6633d;

    /* renamed from: e4.c$a */
    public static final class C1798a {
        private C1798a() {
        }

        public /* synthetic */ C1798a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1797c mo7481a() {
            if (mo7482b()) {
                return new C1797c((C1920g) null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo7482b() {
            return C1797c.f6631e;
        }
    }

    static {
        C1798a aVar = new C1798a((C1920g) null);
        f6632f = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f6631e = z;
    }

    private C1797c() {
        this.f6633d = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ C1797c(C1920g gVar) {
        this();
    }

    /* renamed from: e */
    public void mo7464e(SSLSocket sSLSocket, String str, List<C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> b = C1809h.f6654c.mo7499b(list);
            C1924k.m9137c(parameters, "sslParameters");
            Object[] array = b.toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new C3184p("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.mo7464e(sSLSocket, str, list);
    }

    /* renamed from: h */
    public String mo7465h(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            return super.mo7465h(sSLSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !C1924k.m9136b(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: n */
    public SSLContext mo7479n() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f6633d);
        C1924k.m9137c(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: p */
    public X509TrustManager mo7480p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        instance.init((KeyStore) null);
        C1924k.m9137c(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers == null) {
            C1924k.m9150p();
        }
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new C3184p("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C1924k.m9137c(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }
}
