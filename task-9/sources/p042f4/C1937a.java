package p042f4;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p035e4.C1809h;
import p041f3.C1920g;
import p041f3.C1924k;
import p127t2.C3184p;
import p134u3.C3299c0;

@SuppressLint({"NewApi"})
/* renamed from: f4.a */
public final class C1937a implements C1953k {

    /* renamed from: a */
    public static final C1938a f6907a = new C1938a((C1920g) null);

    /* renamed from: f4.a$a */
    public static final class C1938a {
        private C1938a() {
        }

        public /* synthetic */ C1938a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1953k mo7685a() {
            if (mo7686b()) {
                return new C1937a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo7686b() {
            return C1809h.f6654c.mo7502h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public String mo7681a(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && !C1924k.m9136b(applicationProtocol, "")) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo7682b(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    /* renamed from: c */
    public boolean mo7683c() {
        return f6907a.mo7686b();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo7684d(SSLSocket sSLSocket, String str, List<? extends C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C1924k.m9137c(sSLParameters, "sslParameters");
            Object[] array = C1809h.f6654c.mo7499b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new C3184p("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
