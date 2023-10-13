package p042f4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p035e4.C1794b;
import p035e4.C1809h;
import p041f3.C1920g;
import p041f3.C1924k;
import p134u3.C3299c0;

/* renamed from: f4.f */
public class C1944f implements C1953k {

    /* renamed from: f */
    public static final C1945a f6915f = new C1945a((C1920g) null);

    /* renamed from: a */
    private final Method f6916a;

    /* renamed from: b */
    private final Method f6917b;

    /* renamed from: c */
    private final Method f6918c;

    /* renamed from: d */
    private final Method f6919d;

    /* renamed from: e */
    private final Class<? super SSLSocket> f6920e;

    /* renamed from: f4.f$a */
    public static final class C1945a {
        private C1945a() {
        }

        public /* synthetic */ C1945a(C1920g gVar) {
            this();
        }
    }

    public C1944f(Class<? super SSLSocket> cls) {
        C1924k.m9142h(cls, "sslSocketClass");
        this.f6920e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        C1924k.m9137c(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f6916a = declaredMethod;
        this.f6917b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f6918c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f6919d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    /* renamed from: a */
    public String mo7681a(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        if (!mo7682b(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f6918c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            C1924k.m9137c(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e) {
            if (C1924k.m9136b(e.getMessage(), "ssl == null")) {
                return null;
            }
            throw e;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: b */
    public boolean mo7682b(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        return this.f6920e.isInstance(sSLSocket);
    }

    /* renamed from: c */
    public boolean mo7683c() {
        return C1794b.f6626g.mo7474b();
    }

    /* renamed from: d */
    public void mo7684d(SSLSocket sSLSocket, String str, List<? extends C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        if (mo7682b(sSLSocket)) {
            try {
                this.f6916a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f6917b.invoke(sSLSocket, new Object[]{str});
                }
                this.f6919d.invoke(sSLSocket, new Object[]{C1809h.f6654c.mo7500c(list)});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
