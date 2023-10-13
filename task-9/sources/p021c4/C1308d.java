package p021c4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p041f3.C1920g;
import p041f3.C1924k;
import p062i4.C2100b0;
import p062i4.C2111f;
import p062i4.C2114h;
import p062i4.C2115i;
import p062i4.C2123p;
import p140v3.C3423b;

/* renamed from: c4.d */
public final class C1308d {

    /* renamed from: a */
    private static final C1306c[] f4674a;

    /* renamed from: b */
    private static final Map<C2115i, Integer> f4675b;

    /* renamed from: c */
    public static final C1308d f4676c;

    /* renamed from: c4.d$a */
    public static final class C1309a {

        /* renamed from: a */
        private final List<C1306c> f4677a;

        /* renamed from: b */
        private final C2114h f4678b;

        /* renamed from: c */
        public C1306c[] f4679c;

        /* renamed from: d */
        private int f4680d;

        /* renamed from: e */
        public int f4681e;

        /* renamed from: f */
        public int f4682f;

        /* renamed from: g */
        private final int f4683g;

        /* renamed from: h */
        private int f4684h;

        public C1309a(C2100b0 b0Var, int i, int i2) {
            C1924k.m9142h(b0Var, "source");
            this.f4683g = i;
            this.f4684h = i2;
            this.f4677a = new ArrayList();
            this.f4678b = C2123p.m9841d(b0Var);
            C1306c[] cVarArr = new C1306c[8];
            this.f4679c = cVarArr;
            this.f4680d = cVarArr.length - 1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1309a(C2100b0 b0Var, int i, int i2, int i3, C1920g gVar) {
            this(b0Var, i, (i3 & 4) != 0 ? i : i2);
        }

        /* renamed from: a */
        private final void m6207a() {
            int i = this.f4684h;
            int i2 = this.f4682f;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m6208b();
            } else {
                m6210d(i2 - i);
            }
        }

        /* renamed from: b */
        private final void m6208b() {
            C3255g.m14317i(this.f4679c, (Object) null, 0, 0, 6, (Object) null);
            this.f4680d = this.f4679c.length - 1;
            this.f4681e = 0;
            this.f4682f = 0;
        }

        /* renamed from: c */
        private final int m6209c(int i) {
            return this.f4680d + 1 + i;
        }

        /* renamed from: d */
        private final int m6210d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f4679c.length;
                while (true) {
                    length--;
                    i2 = this.f4680d;
                    if (length < i2 || i <= 0) {
                        C1306c[] cVarArr = this.f4679c;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f4681e);
                        this.f4680d += i3;
                    } else {
                        C1306c cVar = this.f4679c[length];
                        if (cVar == null) {
                            C1924k.m9150p();
                        }
                        int i4 = cVar.f4671a;
                        i -= i4;
                        this.f4682f -= i4;
                        this.f4681e--;
                        i3++;
                    }
                }
                C1306c[] cVarArr2 = this.f4679c;
                System.arraycopy(cVarArr2, i2 + 1, cVarArr2, i2 + 1 + i3, this.f4681e);
                this.f4680d += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private final C2115i m6211f(int i) {
            C1306c cVar;
            if (m6213h(i)) {
                cVar = C1308d.f4676c.mo5139c()[i];
            } else {
                int c = m6209c(i - C1308d.f4676c.mo5139c().length);
                if (c >= 0) {
                    C1306c[] cVarArr = this.f4679c;
                    if (c < cVarArr.length) {
                        cVar = cVarArr[c];
                        if (cVar == null) {
                            C1924k.m9150p();
                        }
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            return cVar.f4672b;
        }

        /* renamed from: g */
        private final void m6212g(int i, C1306c cVar) {
            this.f4677a.add(cVar);
            int i2 = cVar.f4671a;
            if (i != -1) {
                C1306c cVar2 = this.f4679c[m6209c(i)];
                if (cVar2 == null) {
                    C1924k.m9150p();
                }
                i2 -= cVar2.f4671a;
            }
            int i3 = this.f4684h;
            if (i2 > i3) {
                m6208b();
                return;
            }
            int d = m6210d((this.f4682f + i2) - i3);
            if (i == -1) {
                int i4 = this.f4681e + 1;
                C1306c[] cVarArr = this.f4679c;
                if (i4 > cVarArr.length) {
                    C1306c[] cVarArr2 = new C1306c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f4680d = this.f4679c.length - 1;
                    this.f4679c = cVarArr2;
                }
                int i5 = this.f4680d;
                this.f4680d = i5 - 1;
                this.f4679c[i5] = cVar;
                this.f4681e++;
            } else {
                this.f4679c[i + m6209c(i) + d] = cVar;
            }
            this.f4682f += i2;
        }

        /* renamed from: h */
        private final boolean m6213h(int i) {
            return i >= 0 && i <= C1308d.f4676c.mo5139c().length - 1;
        }

        /* renamed from: i */
        private final int m6214i() {
            return C3423b.m15084b(this.f4678b.readByte(), 255);
        }

        /* renamed from: l */
        private final void m6215l(int i) {
            if (m6213h(i)) {
                this.f4677a.add(C1308d.f4676c.mo5139c()[i]);
                return;
            }
            int c = m6209c(i - C1308d.f4676c.mo5139c().length);
            if (c >= 0) {
                C1306c[] cVarArr = this.f4679c;
                if (c < cVarArr.length) {
                    List<C1306c> list = this.f4677a;
                    C1306c cVar = cVarArr[c];
                    if (cVar == null) {
                        C1924k.m9150p();
                    }
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        private final void m6216n(int i) {
            m6212g(-1, new C1306c(m6211f(i), mo5141j()));
        }

        /* renamed from: o */
        private final void m6217o() {
            m6212g(-1, new C1306c(C1308d.f4676c.mo5137a(mo5141j()), mo5141j()));
        }

        /* renamed from: p */
        private final void m6218p(int i) {
            this.f4677a.add(new C1306c(m6211f(i), mo5141j()));
        }

        /* renamed from: q */
        private final void m6219q() {
            this.f4677a.add(new C1306c(C1308d.f4676c.mo5137a(mo5141j()), mo5141j()));
        }

        /* renamed from: e */
        public final List<C1306c> mo5140e() {
            List<C1306c> M = C3271t.m14398M(this.f4677a);
            this.f4677a.clear();
            return M;
        }

        /* renamed from: j */
        public final C2115i mo5141j() {
            int i = m6214i();
            boolean z = (i & 128) == 128;
            long m = (long) mo5143m(i, 127);
            if (!z) {
                return this.f4678b.mo7958t(m);
            }
            C2111f fVar = new C2111f();
            C1344k.f4868d.mo5281b(this.f4678b, m, fVar);
            return fVar.mo7912T();
        }

        /* renamed from: k */
        public final void mo5142k() {
            while (!this.f4678b.mo7911S()) {
                int b = C3423b.m15084b(this.f4678b.readByte(), 255);
                if (b == 128) {
                    throw new IOException("index == 0");
                } else if ((b & 128) == 128) {
                    m6215l(mo5143m(b, 127) - 1);
                } else if (b == 64) {
                    m6217o();
                } else if ((b & 64) == 64) {
                    m6216n(mo5143m(b, 63) - 1);
                } else if ((b & 32) == 32) {
                    int m = mo5143m(b, 31);
                    this.f4684h = m;
                    if (m < 0 || m > this.f4683g) {
                        throw new IOException("Invalid dynamic table size update " + this.f4684h);
                    }
                    m6207a();
                } else if (b == 16 || b == 0) {
                    m6219q();
                } else {
                    m6218p(mo5143m(b, 15) - 1);
                }
            }
        }

        /* renamed from: m */
        public final int mo5143m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m6214i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: c4.d$b */
    public static final class C1310b {

        /* renamed from: a */
        private int f4685a;

        /* renamed from: b */
        private boolean f4686b;

        /* renamed from: c */
        public int f4687c;

        /* renamed from: d */
        public C1306c[] f4688d;

        /* renamed from: e */
        private int f4689e;

        /* renamed from: f */
        public int f4690f;

        /* renamed from: g */
        public int f4691g;

        /* renamed from: h */
        public int f4692h;

        /* renamed from: i */
        private final boolean f4693i;

        /* renamed from: j */
        private final C2111f f4694j;

        public C1310b(int i, boolean z, C2111f fVar) {
            C1924k.m9142h(fVar, "out");
            this.f4692h = i;
            this.f4693i = z;
            this.f4694j = fVar;
            this.f4685a = Integer.MAX_VALUE;
            this.f4687c = i;
            C1306c[] cVarArr = new C1306c[8];
            this.f4688d = cVarArr;
            this.f4689e = cVarArr.length - 1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1310b(int i, boolean z, C2111f fVar, int i2, C1920g gVar) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, fVar);
        }

        /* renamed from: a */
        private final void m6224a() {
            int i = this.f4687c;
            int i2 = this.f4691g;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m6225b();
            } else {
                m6226c(i2 - i);
            }
        }

        /* renamed from: b */
        private final void m6225b() {
            C3255g.m14317i(this.f4688d, (Object) null, 0, 0, 6, (Object) null);
            this.f4689e = this.f4688d.length - 1;
            this.f4690f = 0;
            this.f4691g = 0;
        }

        /* renamed from: c */
        private final int m6226c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f4688d.length;
                while (true) {
                    length--;
                    i2 = this.f4689e;
                    if (length < i2 || i <= 0) {
                        C1306c[] cVarArr = this.f4688d;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f4690f);
                        C1306c[] cVarArr2 = this.f4688d;
                        int i4 = this.f4689e;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f4689e += i3;
                    } else {
                        C1306c cVar = this.f4688d[length];
                        if (cVar == null) {
                            C1924k.m9150p();
                        }
                        i -= cVar.f4671a;
                        int i5 = this.f4691g;
                        C1306c cVar2 = this.f4688d[length];
                        if (cVar2 == null) {
                            C1924k.m9150p();
                        }
                        this.f4691g = i5 - cVar2.f4671a;
                        this.f4690f--;
                        i3++;
                    }
                }
                C1306c[] cVarArr3 = this.f4688d;
                System.arraycopy(cVarArr3, i2 + 1, cVarArr3, i2 + 1 + i3, this.f4690f);
                C1306c[] cVarArr22 = this.f4688d;
                int i42 = this.f4689e;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f4689e += i3;
            }
            return i3;
        }

        /* renamed from: d */
        private final void m6227d(C1306c cVar) {
            int i = cVar.f4671a;
            int i2 = this.f4687c;
            if (i > i2) {
                m6225b();
                return;
            }
            m6226c((this.f4691g + i) - i2);
            int i3 = this.f4690f + 1;
            C1306c[] cVarArr = this.f4688d;
            if (i3 > cVarArr.length) {
                C1306c[] cVarArr2 = new C1306c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f4689e = this.f4688d.length - 1;
                this.f4688d = cVarArr2;
            }
            int i4 = this.f4689e;
            this.f4689e = i4 - 1;
            this.f4688d[i4] = cVar;
            this.f4690f++;
            this.f4691g += i;
        }

        /* renamed from: e */
        public final void mo5144e(int i) {
            this.f4692h = i;
            int min = Math.min(i, 16384);
            int i2 = this.f4687c;
            if (i2 != min) {
                if (min < i2) {
                    this.f4685a = Math.min(this.f4685a, min);
                }
                this.f4686b = true;
                this.f4687c = min;
                m6224a();
            }
        }

        /* renamed from: f */
        public final void mo5145f(C2115i iVar) {
            int i;
            int i2;
            C1924k.m9142h(iVar, "data");
            if (this.f4693i) {
                C1344k kVar = C1344k.f4868d;
                if (kVar.mo5283d(iVar) < iVar.mo7999u()) {
                    C2111f fVar = new C2111f();
                    kVar.mo5282c(iVar, fVar);
                    iVar = fVar.mo7912T();
                    i2 = iVar.mo7999u();
                    i = 128;
                    mo5147h(i2, 127, i);
                    this.f4694j.mo7899E(iVar);
                }
            }
            i2 = iVar.mo7999u();
            i = 0;
            mo5147h(i2, 127, i);
            this.f4694j.mo7899E(iVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo5146g(java.util.List<p021c4.C1306c> r14) {
            /*
                r13 = this;
                java.lang.String r0 = "headerBlock"
                p041f3.C1924k.m9142h(r14, r0)
                boolean r0 = r13.f4686b
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r13.f4685a
                int r2 = r13.f4687c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0017
                r13.mo5147h(r0, r4, r3)
            L_0x0017:
                r13.f4686b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.f4685a = r0
                int r0 = r13.f4687c
                r13.mo5147h(r0, r4, r3)
            L_0x0023:
                int r0 = r14.size()
                r2 = 0
            L_0x0028:
                if (r2 >= r0) goto L_0x010a
                java.lang.Object r3 = r14.get(r2)
                c4.c r3 = (p021c4.C1306c) r3
                i4.i r4 = r3.f4672b
                i4.i r4 = r4.mo8001w()
                i4.i r5 = r3.f4673c
                c4.d r6 = p021c4.C1308d.f4676c
                java.util.Map r7 = r6.mo5138b()
                java.lang.Object r7 = r7.get(r4)
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = -1
                if (r7 == 0) goto L_0x007c
                int r7 = r7.intValue()
                int r7 = r7 + 1
                r9 = 7
                r10 = 2
                if (r10 <= r7) goto L_0x0052
                goto L_0x007a
            L_0x0052:
                if (r9 < r7) goto L_0x007a
                c4.c[] r9 = r6.mo5139c()
                int r10 = r7 + -1
                r9 = r9[r10]
                i4.i r9 = r9.f4673c
                boolean r9 = p041f3.C1924k.m9136b(r9, r5)
                if (r9 == 0) goto L_0x0066
                r6 = r7
                goto L_0x007e
            L_0x0066:
                c4.c[] r6 = r6.mo5139c()
                r6 = r6[r7]
                i4.i r6 = r6.f4673c
                boolean r6 = p041f3.C1924k.m9136b(r6, r5)
                if (r6 == 0) goto L_0x007a
                int r6 = r7 + 1
                r12 = r7
                r7 = r6
                r6 = r12
                goto L_0x007e
            L_0x007a:
                r6 = r7
                goto L_0x007d
            L_0x007c:
                r6 = -1
            L_0x007d:
                r7 = -1
            L_0x007e:
                if (r7 != r8) goto L_0x00c8
                int r9 = r13.f4689e
                int r9 = r9 + 1
                c4.c[] r10 = r13.f4688d
                int r10 = r10.length
            L_0x0087:
                if (r9 >= r10) goto L_0x00c8
                c4.c[] r11 = r13.f4688d
                r11 = r11[r9]
                if (r11 != 0) goto L_0x0092
                p041f3.C1924k.m9150p()
            L_0x0092:
                i4.i r11 = r11.f4672b
                boolean r11 = p041f3.C1924k.m9136b(r11, r4)
                if (r11 == 0) goto L_0x00c5
                c4.c[] r11 = r13.f4688d
                r11 = r11[r9]
                if (r11 != 0) goto L_0x00a3
                p041f3.C1924k.m9150p()
            L_0x00a3:
                i4.i r11 = r11.f4673c
                boolean r11 = p041f3.C1924k.m9136b(r11, r5)
                if (r11 == 0) goto L_0x00b7
                int r7 = r13.f4689e
                int r9 = r9 - r7
                c4.d r7 = p021c4.C1308d.f4676c
                c4.c[] r7 = r7.mo5139c()
                int r7 = r7.length
                int r7 = r7 + r9
                goto L_0x00c8
            L_0x00b7:
                if (r6 != r8) goto L_0x00c5
                int r6 = r13.f4689e
                int r6 = r9 - r6
                c4.d r11 = p021c4.C1308d.f4676c
                c4.c[] r11 = r11.mo5139c()
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00c5:
                int r9 = r9 + 1
                goto L_0x0087
            L_0x00c8:
                if (r7 == r8) goto L_0x00d2
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.mo5147h(r7, r3, r4)
                goto L_0x0106
            L_0x00d2:
                r7 = 64
                if (r6 != r8) goto L_0x00e5
                i4.f r6 = r13.f4694j
                r6.mo7913U(r7)
                r13.mo5145f(r4)
            L_0x00de:
                r13.mo5145f(r5)
                r13.m6227d(r3)
                goto L_0x0106
            L_0x00e5:
                i4.i r8 = p021c4.C1306c.f4664d
                boolean r8 = r4.mo8000v(r8)
                if (r8 == 0) goto L_0x0100
                i4.i r8 = p021c4.C1306c.f4669i
                boolean r4 = p041f3.C1924k.m9136b(r8, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x0100
                r3 = 15
                r13.mo5147h(r6, r3, r1)
                r13.mo5145f(r5)
                goto L_0x0106
            L_0x0100:
                r4 = 63
                r13.mo5147h(r6, r4, r7)
                goto L_0x00de
            L_0x0106:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x010a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p021c4.C1308d.C1310b.mo5146g(java.util.List):void");
        }

        /* renamed from: h */
        public final void mo5147h(int i, int i2, int i3) {
            int i4;
            C2111f fVar;
            if (i < i2) {
                fVar = this.f4694j;
                i4 = i | i3;
            } else {
                this.f4694j.mo7913U(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f4694j.mo7913U(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                fVar = this.f4694j;
            }
            fVar.mo7913U(i4);
        }
    }

    static {
        C1308d dVar = new C1308d();
        f4676c = dVar;
        C2115i iVar = C1306c.f4666f;
        C2115i iVar2 = C1306c.f4667g;
        C2115i iVar3 = C1306c.f4668h;
        C2115i iVar4 = C1306c.f4665e;
        f4674a = new C1306c[]{new C1306c(C1306c.f4669i, ""), new C1306c(iVar, "GET"), new C1306c(iVar, "POST"), new C1306c(iVar2, "/"), new C1306c(iVar2, "/index.html"), new C1306c(iVar3, "http"), new C1306c(iVar3, "https"), new C1306c(iVar4, "200"), new C1306c(iVar4, "204"), new C1306c(iVar4, "206"), new C1306c(iVar4, "304"), new C1306c(iVar4, "400"), new C1306c(iVar4, "404"), new C1306c(iVar4, "500"), new C1306c("accept-charset", ""), new C1306c("accept-encoding", "gzip, deflate"), new C1306c("accept-language", ""), new C1306c("accept-ranges", ""), new C1306c("accept", ""), new C1306c("access-control-allow-origin", ""), new C1306c("age", ""), new C1306c("allow", ""), new C1306c("authorization", ""), new C1306c("cache-control", ""), new C1306c("content-disposition", ""), new C1306c("content-encoding", ""), new C1306c("content-language", ""), new C1306c("content-length", ""), new C1306c("content-location", ""), new C1306c("content-range", ""), new C1306c("content-type", ""), new C1306c("cookie", ""), new C1306c("date", ""), new C1306c("etag", ""), new C1306c("expect", ""), new C1306c("expires", ""), new C1306c("from", ""), new C1306c("host", ""), new C1306c("if-match", ""), new C1306c("if-modified-since", ""), new C1306c("if-none-match", ""), new C1306c("if-range", ""), new C1306c("if-unmodified-since", ""), new C1306c("last-modified", ""), new C1306c("link", ""), new C1306c("location", ""), new C1306c("max-forwards", ""), new C1306c("proxy-authenticate", ""), new C1306c("proxy-authorization", ""), new C1306c("range", ""), new C1306c("referer", ""), new C1306c("refresh", ""), new C1306c("retry-after", ""), new C1306c("server", ""), new C1306c("set-cookie", ""), new C1306c("strict-transport-security", ""), new C1306c("transfer-encoding", ""), new C1306c("user-agent", ""), new C1306c("vary", ""), new C1306c("via", ""), new C1306c("www-authenticate", "")};
        f4675b = dVar.m6203d();
    }

    private C1308d() {
    }

    /* renamed from: d */
    private final Map<C2115i, Integer> m6203d() {
        C1306c[] cVarArr = f4674a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i = 0; i < length; i++) {
            C1306c[] cVarArr2 = f4674a;
            if (!linkedHashMap.containsKey(cVarArr2[i].f4672b)) {
                linkedHashMap.put(cVarArr2[i].f4672b, Integer.valueOf(i));
            }
        }
        Map<C2115i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C1924k.m9137c(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public final C2115i mo5137a(C2115i iVar) {
        C1924k.m9142h(iVar, "name");
        int u = iVar.mo7999u();
        for (int i = 0; i < u; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte f = iVar.mo7982f(i);
            if (b <= f && b2 >= f) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.mo8002x());
            }
        }
        return iVar;
    }

    /* renamed from: b */
    public final Map<C2115i, Integer> mo5138b() {
        return f4675b;
    }

    /* renamed from: c */
    public final C1306c[] mo5139c() {
        return f4674a;
    }
}
