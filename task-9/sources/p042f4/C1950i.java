package p042f4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p035e4.C1799d;
import p035e4.C1809h;
import p041f3.C1920g;
import p041f3.C1924k;
import p127t2.C3184p;
import p134u3.C3299c0;

/* renamed from: f4.i */
public final class C1950i implements C1953k {

    /* renamed from: a */
    public static final C1951a f6926a = new C1951a((C1920g) null);

    /* renamed from: f4.i$a */
    public static final class C1951a {
        private C1951a() {
        }

        public /* synthetic */ C1951a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1953k mo7700a() {
            if (C1799d.f6635f.mo7486c()) {
                return new C1950i();
            }
            return null;
        }
    }

    /* renamed from: a */
    public String mo7681a(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        if (mo7682b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo7682b(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    /* renamed from: c */
    public boolean mo7683c() {
        return C1799d.f6635f.mo7486c();
    }

    /* renamed from: d */
    public void mo7684d(SSLSocket sSLSocket, String str, List<? extends C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        if (mo7682b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C1809h.f6654c.mo7499b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new C3184p("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
