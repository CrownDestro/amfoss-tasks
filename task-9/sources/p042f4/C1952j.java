package p042f4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p035e4.C1809h;
import p041f3.C1924k;
import p134u3.C3299c0;

/* renamed from: f4.j */
public final class C1952j implements C1953k {

    /* renamed from: a */
    private boolean f6927a;

    /* renamed from: b */
    private C1953k f6928b;

    /* renamed from: c */
    private final String f6929c;

    public C1952j(String str) {
        C1924k.m9142h(str, "socketPackage");
        this.f6929c = str;
    }

    /* renamed from: e */
    private final synchronized C1953k m9214e(SSLSocket sSLSocket) {
        if (!this.f6927a) {
            try {
                Class cls = sSLSocket.getClass();
                while (true) {
                    String name = cls.getName();
                    if (!(!C1924k.m9136b(name, this.f6929c + ".OpenSSLSocketImpl"))) {
                        this.f6928b = new C1944f(cls);
                        break;
                    }
                    cls = cls.getSuperclass();
                    C1924k.m9137c(cls, "possibleClass.superclass");
                    if (cls == null) {
                        throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + sSLSocket);
                    }
                }
            } catch (Exception e) {
                C1809h g = C1809h.f6654c.mo7501g();
                g.mo7497k("Failed to initialize DeferredSocketAdapter " + this.f6929c, 5, e);
            }
            this.f6927a = true;
        }
        return this.f6928b;
    }

    /* renamed from: a */
    public String mo7681a(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1953k e = m9214e(sSLSocket);
        if (e != null) {
            return e.mo7681a(sSLSocket);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo7682b(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        C1924k.m9137c(name, "sslSocket.javaClass.name");
        return C2646p.m11982B(name, this.f6929c, false, 2, (Object) null);
    }

    /* renamed from: c */
    public boolean mo7683c() {
        return true;
    }

    /* renamed from: d */
    public void mo7684d(SSLSocket sSLSocket, String str, List<? extends C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        C1953k e = m9214e(sSLSocket);
        if (e != null) {
            e.mo7684d(sSLSocket, str, list);
        }
    }
}
