package p042f4;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p035e4.C1809h;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: f4.l */
public final class C1954l extends C1944f {

    /* renamed from: i */
    public static final C1955a f6930i = new C1955a((C1920g) null);

    /* renamed from: g */
    private final Class<? super SSLSocketFactory> f6931g;

    /* renamed from: h */
    private final Class<?> f6932h;

    /* renamed from: f4.l$a */
    public static final class C1955a {
        private C1955a() {
        }

        public /* synthetic */ C1955a(C1920g gVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C1953k m9223b(C1955a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.mo7701a(str);
        }

        /* renamed from: a */
        public final C1953k mo7701a(String str) {
            C1924k.m9142h(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                C1924k.m9137c(cls3, "paramsClass");
                return new C1954l(cls, cls2, cls3);
            } catch (Exception e) {
                C1809h.f6654c.mo7501g().mo7497k("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1954l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        C1924k.m9142h(cls, "sslSocketClass");
        C1924k.m9142h(cls2, "sslSocketFactoryClass");
        C1924k.m9142h(cls3, "paramClass");
        this.f6931g = cls2;
        this.f6932h = cls3;
    }
}
