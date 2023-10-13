package p005a4;

import java.net.Proxy;
import p041f3.C1924k;
import p134u3.C3304d0;
import p134u3.C3362x;

/* renamed from: a4.i */
public final class C0034i {

    /* renamed from: a */
    public static final C0034i f133a = new C0034i();

    private C0034i() {
    }

    /* renamed from: b */
    private final boolean m127b(C3304d0 d0Var, Proxy.Type type) {
        return !d0Var.mo10916g() && type == Proxy.Type.HTTP;
    }

    /* renamed from: a */
    public final String mo87a(C3304d0 d0Var, Proxy.Type type) {
        C1924k.m9142h(d0Var, "request");
        C1924k.m9142h(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(d0Var.mo10917h());
        sb.append(' ');
        C0034i iVar = f133a;
        boolean b = iVar.m127b(d0Var, type);
        C3362x k = d0Var.mo10920k();
        if (b) {
            sb.append(k);
        } else {
            sb.append(iVar.mo88c(k));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C1924k.m9137c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public final String mo88c(C3362x xVar) {
        C1924k.m9142h(xVar, "url");
        String d = xVar.mo11124d();
        String f = xVar.mo11127f();
        if (f == null) {
            return d;
        }
        return d + '?' + f;
    }
}
