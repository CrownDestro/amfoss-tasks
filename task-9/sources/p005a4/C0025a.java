package p005a4;

import java.util.List;
import p041f3.C1924k;
import p062i4.C2120m;
import p062i4.C2123p;
import p134u3.C3304d0;
import p134u3.C3308e0;
import p134u3.C3313f0;
import p134u3.C3320g0;
import p134u3.C3337o;
import p134u3.C3339p;
import p134u3.C3366y;
import p134u3.C3368z;
import p140v3.C3423b;

/* renamed from: a4.a */
public final class C0025a implements C3366y {

    /* renamed from: a */
    private final C3339p f113a;

    public C0025a(C3339p pVar) {
        C1924k.m9142h(pVar, "cookieJar");
        this.f113a = pVar;
    }

    /* renamed from: b */
    private final String m86b(List<C3337o> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C3263l.m14376m();
            }
            C3337o oVar = (C3337o) next;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(oVar.mo11039e());
            sb.append('=');
            sb.append(oVar.mo11042g());
            i = i2;
        }
        String sb2 = sb.toString();
        C1924k.m9137c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: a */
    public C3313f0 mo58a(C3366y.C3367a aVar) {
        C3320g0 a;
        C1924k.m9142h(aVar, "chain");
        C3304d0 a2 = aVar.mo73a();
        C3304d0.C3305a i = a2.mo10918i();
        C3308e0 a3 = a2.mo10910a();
        if (a3 != null) {
            C3368z b = a3.mo7575b();
            if (b != null) {
                i.mo10925d("Content-Type", b.toString());
            }
            long a4 = a3.mo7574a();
            if (a4 != -1) {
                i.mo10925d("Content-Length", String.valueOf(a4));
                i.mo10928g("Transfer-Encoding");
            } else {
                i.mo10925d("Transfer-Encoding", "chunked");
                i.mo10928g("Content-Length");
            }
        }
        boolean z = false;
        if (a2.mo10913d("Host") == null) {
            i.mo10925d("Host", C3423b.m15074N(a2.mo10920k(), false, 1, (Object) null));
        }
        if (a2.mo10913d("Connection") == null) {
            i.mo10925d("Connection", "Keep-Alive");
        }
        if (a2.mo10913d("Accept-Encoding") == null && a2.mo10913d("Range") == null) {
            i.mo10925d("Accept-Encoding", "gzip");
            z = true;
        }
        List<C3337o> a5 = this.f113a.mo11048a(a2.mo10920k());
        if (!a5.isEmpty()) {
            i.mo10925d("Cookie", m86b(a5));
        }
        if (a2.mo10913d("User-Agent") == null) {
            i.mo10925d("User-Agent", "okhttp/4.7.2");
        }
        C3313f0 b2 = aVar.mo74b(i.mo10923b());
        C0030e.m105f(this.f113a, a2.mo10920k(), b2.mo10943B());
        C3313f0.C3314a r = b2.mo10947G().mo10978r(a2);
        if (z && C2646p.m11985o("gzip", C3313f0.m14621w(b2, "Content-Encoding", (String) null, 2, (Object) null), true) && C0030e.m101b(b2) && (a = b2.mo10953a()) != null) {
            C2120m mVar = new C2120m(a.mo86i());
            r.mo10971k(b2.mo10943B().mo11111y().mo11119h("Content-Encoding").mo11119h("Content-Length").mo11116e());
            r.mo10964b(new C0033h(C3313f0.m14621w(b2, "Content-Type", (String) null, 2, (Object) null), -1, C2123p.m9841d(mVar)));
        }
        return r.mo10965c();
    }
}
