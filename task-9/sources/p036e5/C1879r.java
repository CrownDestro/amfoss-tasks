package p036e5;

import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p062i4.C2111f;
import p062i4.C2113g;
import p134u3.C3280a0;
import p134u3.C3304d0;
import p134u3.C3308e0;
import p134u3.C3351u;
import p134u3.C3359w;
import p134u3.C3362x;
import p134u3.C3368z;

/* renamed from: e5.r */
final class C1879r {

    /* renamed from: l */
    private static final char[] f6774l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    private static final Pattern f6775m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    private final String f6776a;

    /* renamed from: b */
    private final C3362x f6777b;
    @Nullable

    /* renamed from: c */
    private String f6778c;
    @Nullable

    /* renamed from: d */
    private C3362x.C3363a f6779d;

    /* renamed from: e */
    private final C3304d0.C3305a f6780e = new C3304d0.C3305a();

    /* renamed from: f */
    private final C3359w.C3360a f6781f;
    @Nullable

    /* renamed from: g */
    private C3368z f6782g;

    /* renamed from: h */
    private final boolean f6783h;
    @Nullable

    /* renamed from: i */
    private C3280a0.C3281a f6784i;
    @Nullable

    /* renamed from: j */
    private C3351u.C3352a f6785j;
    @Nullable

    /* renamed from: k */
    private C3308e0 f6786k;

    /* renamed from: e5.r$a */
    private static class C1880a extends C3308e0 {

        /* renamed from: b */
        private final C3308e0 f6787b;

        /* renamed from: c */
        private final C3368z f6788c;

        C1880a(C3308e0 e0Var, C3368z zVar) {
            this.f6787b = e0Var;
            this.f6788c = zVar;
        }

        /* renamed from: a */
        public long mo7574a() {
            return this.f6787b.mo7574a();
        }

        /* renamed from: b */
        public C3368z mo7575b() {
            return this.f6788c;
        }

        /* renamed from: g */
        public void mo7576g(C2113g gVar) {
            this.f6787b.mo7576g(gVar);
        }
    }

    C1879r(String str, C3362x xVar, @Nullable String str2, @Nullable C3359w wVar, @Nullable C3368z zVar, boolean z, boolean z2, boolean z3) {
        this.f6776a = str;
        this.f6777b = xVar;
        this.f6778c = str2;
        this.f6782g = zVar;
        this.f6783h = z;
        this.f6781f = wVar != null ? wVar.mo11111y() : new C3359w.C3360a();
        if (z2) {
            this.f6785j = new C3351u.C3352a();
        } else if (z3) {
            C3280a0.C3281a aVar = new C3280a0.C3281a();
            this.f6784i = aVar;
            aVar.mo10797d(C3280a0.f10671k);
        }
    }

    /* renamed from: i */
    private static String m9004i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C2111f fVar = new C2111f();
                fVar.mo7936j(str, 0, i);
                m9005j(fVar, str, i, length, z);
                return fVar.mo7926e0();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: j */
    private static void m9005j(C2111f fVar, String str, int i, int i2, boolean z) {
        C2111f fVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (fVar2 == null) {
                        fVar2 = new C2111f();
                    }
                    fVar2.mo7969x0(codePointAt);
                    while (!fVar2.mo7911S()) {
                        byte readByte = fVar2.readByte() & 255;
                        fVar.mo7913U(37);
                        char[] cArr = f6774l;
                        fVar.mo7913U(cArr[(readByte >> 4) & 15]);
                        fVar.mo7913U(cArr[readByte & 15]);
                    }
                } else {
                    fVar.mo7969x0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7563a(String str, String str2, boolean z) {
        if (z) {
            this.f6785j.mo11088b(str, str2);
        } else {
            this.f6785j.mo11087a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7564b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f6782g = C3368z.m14895d(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        } else {
            this.f6781f.mo11112a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7565c(C3359w wVar) {
        this.f6781f.mo11113b(wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7566d(C3359w wVar, C3308e0 e0Var) {
        this.f6784i.mo10794a(wVar, e0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7567e(C3280a0.C3283c cVar) {
        this.f6784i.mo10795b(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7568f(String str, String str2, boolean z) {
        if (this.f6778c != null) {
            String i = m9004i(str2, z);
            String str3 = this.f6778c;
            String replace = str3.replace("{" + str + "}", i);
            if (!f6775m.matcher(replace).matches()) {
                this.f6778c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7569g(String str, @Nullable String str2, boolean z) {
        String str3 = this.f6778c;
        if (str3 != null) {
            C3362x.C3363a l = this.f6777b.mo11133l(str3);
            this.f6779d = l;
            if (l != null) {
                this.f6778c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f6777b + ", Relative: " + this.f6778c);
            }
        }
        if (z) {
            this.f6779d.mo11143a(str, str2);
        } else {
            this.f6779d.mo11144b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <T> void mo7570h(Class<T> cls, @Nullable T t) {
        this.f6780e.mo10929h(cls, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C3304d0.C3305a mo7571k() {
        C3362x xVar;
        C3362x.C3363a aVar = this.f6779d;
        if (aVar != null) {
            xVar = aVar.mo11145c();
        } else {
            xVar = this.f6777b.mo11138q(this.f6778c);
            if (xVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f6777b + ", Relative: " + this.f6778c);
            }
        }
        C1880a aVar2 = this.f6786k;
        if (aVar2 == null) {
            C3351u.C3352a aVar3 = this.f6785j;
            if (aVar3 != null) {
                aVar2 = aVar3.mo11089c();
            } else {
                C3280a0.C3281a aVar4 = this.f6784i;
                if (aVar4 != null) {
                    aVar2 = aVar4.mo10796c();
                } else if (this.f6783h) {
                    aVar2 = C3308e0.m14601d((C3368z) null, new byte[0]);
                }
            }
        }
        C3368z zVar = this.f6782g;
        if (zVar != null) {
            if (aVar2 != null) {
                aVar2 = new C1880a(aVar2, zVar);
            } else {
                this.f6781f.mo11112a("Content-Type", zVar.toString());
            }
        }
        return this.f6780e.mo10931j(xVar).mo10926e(this.f6781f.mo11116e()).mo10927f(this.f6776a, aVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo7572l(C3308e0 e0Var) {
        this.f6786k = e0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo7573m(Object obj) {
        this.f6778c = obj.toString();
    }
}
