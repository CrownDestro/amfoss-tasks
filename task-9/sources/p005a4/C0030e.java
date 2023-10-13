package p005a4;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p035e4.C1809h;
import p041f3.C1924k;
import p062i4.C2111f;
import p062i4.C2115i;
import p134u3.C3313f0;
import p134u3.C3323h;
import p134u3.C3337o;
import p134u3.C3339p;
import p134u3.C3359w;
import p134u3.C3362x;
import p140v3.C3423b;

/* renamed from: a4.e */
public final class C0030e {

    /* renamed from: a */
    private static final C2115i f118a;

    /* renamed from: b */
    private static final C2115i f119b;

    static {
        C2115i.C2116a aVar = C2115i.f7358h;
        f118a = aVar.mo8007d("\"\\");
        f119b = aVar.mo8007d("\t ,=");
    }

    /* renamed from: a */
    public static final List<C3323h> m100a(C3359w wVar, String str) {
        C1924k.m9142h(wVar, "$this$parseChallenges");
        C1924k.m9142h(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = wVar.size();
        for (int i = 0; i < size; i++) {
            if (C2646p.m11985o(str, wVar.mo11110x(i), true)) {
                try {
                    m102c(new C2111f().mo7908P(wVar.mo11102A(i)), arrayList);
                } catch (EOFException e) {
                    C1809h.f6654c.mo7501g().mo7497k("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m101b(C3313f0 f0Var) {
        C1924k.m9142h(f0Var, "$this$promisesBody");
        if (C1924k.m9136b(f0Var.mo10951Q().mo10917h(), "HEAD")) {
            return false;
        }
        int i = f0Var.mo10958i();
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && C3423b.m15101s(f0Var) == -1 && !C2646p.m11985o("chunked", C3313f0.m14621w(f0Var, "Transfer-Encoding", (String) null, 2, (Object) null), true)) ? false : true;
    }

    /* renamed from: c */
    private static final void m102c(C2111f fVar, List<C3323h> list) {
        String e;
        int H;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    m106g(fVar);
                    str = m104e(fVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean g = m106g(fVar);
                e = m104e(fVar);
                if (e != null) {
                    byte b = (byte) 61;
                    H = C3423b.m15068H(fVar, b);
                    boolean g2 = m106g(fVar);
                    if (g || (!g2 && !fVar.mo7911S())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int H2 = H + C3423b.m15068H(fVar, b);
                        while (true) {
                            if (e == null) {
                                e = m104e(fVar);
                                if (m106g(fVar)) {
                                    continue;
                                    break;
                                }
                                H2 = C3423b.m15068H(fVar, b);
                            }
                            if (H2 == 0) {
                                continue;
                                break;
                            } else if (H2 <= 1 && !m106g(fVar)) {
                                String d = m107h(fVar, (byte) 34) ? m103d(fVar) : m104e(fVar);
                                if (d != null && ((String) linkedHashMap.put(e, d)) == null) {
                                    if (m106g(fVar) || fVar.mo7911S()) {
                                        e = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new C3323h(str, linkedHashMap));
                        str = e;
                    }
                } else if (fVar.mo7911S()) {
                    list.add(new C3323h(str, C3248c0.m14286d()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, e + C2646p.m11990t("=", H));
            C1924k.m9137c(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new C3323h(str, singletonMap));
        }
    }

    /* renamed from: d */
    private static final String m103d(C2111f fVar) {
        byte b = (byte) 34;
        if (fVar.readByte() == b) {
            C2111f fVar2 = new C2111f();
            while (true) {
                long Y = fVar.mo7917Y(f118a);
                if (Y == -1) {
                    return null;
                }
                if (fVar.mo7900F(Y) == b) {
                    fVar2.mo5092I(fVar, Y);
                    fVar.readByte();
                    return fVar2.mo7926e0();
                } else if (fVar.mo7931h0() == Y + 1) {
                    return null;
                } else {
                    fVar2.mo5092I(fVar, Y);
                    fVar.readByte();
                    fVar2.mo5092I(fVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: e */
    private static final String m104e(C2111f fVar) {
        long Y = fVar.mo7917Y(f119b);
        if (Y == -1) {
            Y = fVar.mo7931h0();
        }
        if (Y != 0) {
            return fVar.mo7928f0(Y);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m105f(C3339p pVar, C3362x xVar, C3359w wVar) {
        C1924k.m9142h(pVar, "$this$receiveHeaders");
        C1924k.m9142h(xVar, "url");
        C1924k.m9142h(wVar, "headers");
        if (pVar != C3339p.f11044a) {
            List<C3337o> e = C3337o.f11034n.mo11047e(xVar, wVar);
            if (!e.isEmpty()) {
                pVar.mo11049b(xVar, e);
            }
        }
    }

    /* renamed from: g */
    private static final boolean m106g(C2111f fVar) {
        boolean z = false;
        while (!fVar.mo7911S()) {
            byte F = fVar.mo7900F(0);
            if (F == 9 || F == 32) {
                fVar.readByte();
            } else if (F != 44) {
                break;
            } else {
                fVar.readByte();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    private static final boolean m107h(C2111f fVar, byte b) {
        return !fVar.mo7911S() && fVar.mo7900F(0) == b;
    }
}
