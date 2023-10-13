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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p041f3.C1920g;
import p041f3.C1924k;
import p127t2.C3184p;
import p134u3.C3299c0;

/* renamed from: e4.g */
public final class C1807g extends C1809h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f6649e;

    /* renamed from: f */
    public static final C1808a f6650f;

    /* renamed from: d */
    private final Provider f6651d;

    /* renamed from: e4.g$a */
    public static final class C1808a {
        private C1808a() {
        }

        public /* synthetic */ C1808a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1807g mo7494a() {
            if (mo7495b()) {
                return new C1807g((C1920g) null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo7495b() {
            return C1807g.f6649e;
        }
    }

    static {
        C1808a aVar = new C1808a((C1920g) null);
        f6650f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f6649e = z;
    }

    private C1807g() {
        this.f6651d = new OpenJSSE();
    }

    public /* synthetic */ C1807g(C1920g gVar) {
        this();
    }

    /* renamed from: e */
    public void mo7464e(SSLSocket sSLSocket, String str, List<C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = C1809h.f6654c.mo7499b(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new C3184p("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.mo7464e(sSLSocket, str, list);
    }

    /* renamed from: h */
    public String mo7465h(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.mo7465h(sSLSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !C1924k.m9136b(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: n */
    public SSLContext mo7479n() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f6651d);
        C1924k.m9137c(instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    /* renamed from: p */
    public X509TrustManager mo7480p() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f6651d);
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
