package p021c4;

import androidx.constraintlayout.widget.C0427j;
import p016c.C1279j;
import p041f3.C1924k;
import p062i4.C2113g;
import p062i4.C2114h;
import p062i4.C2115i;
import p140v3.C3423b;

/* renamed from: c4.k */
public final class C1344k {

    /* renamed from: a */
    private static final int[] f4865a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, C0427j.f1968T0, C0427j.f1974U0, C0427j.f1980V0, C0427j.f1986W0, 105, C0427j.f1992X0, C0427j.f1998Y0, C0427j.f2004Z0, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, C1279j.f4366C0, C1279j.f4371D0, 40, 41, 42, 7, 43, C1279j.f4375E0, 44, 8, 9, 45, C1279j.f4379F0, C1279j.f4383G0, C1279j.f4387H0, C1279j.f4391I0, C1279j.f4395J0, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: b */
    private static final byte[] f4866b;

    /* renamed from: c */
    private static final C1345a f4867c = new C1345a();

    /* renamed from: d */
    public static final C1344k f4868d;

    /* renamed from: c4.k$a */
    private static final class C1345a {

        /* renamed from: a */
        private final C1345a[] f4869a;

        /* renamed from: b */
        private final int f4870b;

        /* renamed from: c */
        private final int f4871c;

        public C1345a() {
            this.f4869a = new C1345a[256];
            this.f4870b = 0;
            this.f4871c = 0;
        }

        public C1345a(int i, int i2) {
            this.f4869a = null;
            this.f4870b = i;
            int i3 = i2 & 7;
            this.f4871c = i3 == 0 ? 8 : i3;
        }

        /* renamed from: a */
        public final C1345a[] mo5284a() {
            return this.f4869a;
        }

        /* renamed from: b */
        public final int mo5285b() {
            return this.f4870b;
        }

        /* renamed from: c */
        public final int mo5286c() {
            return this.f4871c;
        }
    }

    static {
        C1344k kVar = new C1344k();
        f4868d = kVar;
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f4866b = bArr;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            kVar.m6437a(i, f4865a[i], f4866b[i]);
        }
    }

    private C1344k() {
    }

    /* renamed from: a */
    private final void m6437a(int i, int i2, int i3) {
        C1345a aVar = new C1345a(i, i3);
        C1345a aVar2 = f4867c;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & 255;
            C1345a[] a = aVar2.mo5284a();
            if (a == null) {
                C1924k.m9150p();
            }
            C1345a aVar3 = a[i4];
            if (aVar3 == null) {
                aVar3 = new C1345a();
                a[i4] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & 255;
        int i7 = 1 << i5;
        C1345a[] a2 = aVar2.mo5284a();
        if (a2 == null) {
            C1924k.m9150p();
        }
        C3255g.m14316h(a2, aVar, i6, i7 + i6);
    }

    /* renamed from: b */
    public final void mo5281b(C2114h hVar, long j, C2113g gVar) {
        C1924k.m9142h(hVar, "source");
        C1924k.m9142h(gVar, "sink");
        C1345a aVar = f4867c;
        int i = 0;
        int i2 = 0;
        for (long j2 = 0; j2 < j; j2++) {
            i = (i << 8) | C3423b.m15084b(hVar.readByte(), 255);
            i2 += 8;
            while (i2 >= 8) {
                int i3 = i2 - 8;
                int i4 = (i >>> i3) & 255;
                C1345a[] a = aVar.mo5284a();
                if (a == null) {
                    C1924k.m9150p();
                }
                aVar = a[i4];
                if (aVar == null) {
                    C1924k.m9150p();
                }
                if (aVar.mo5284a() == null) {
                    gVar.mo7913U(aVar.mo5285b());
                    i2 -= aVar.mo5286c();
                    aVar = f4867c;
                } else {
                    i2 = i3;
                }
            }
        }
        while (i2 > 0) {
            int i5 = (i << (8 - i2)) & 255;
            C1345a[] a2 = aVar.mo5284a();
            if (a2 == null) {
                C1924k.m9150p();
            }
            C1345a aVar2 = a2[i5];
            if (aVar2 == null) {
                C1924k.m9150p();
            }
            if (aVar2.mo5284a() == null && aVar2.mo5286c() <= i2) {
                gVar.mo7913U(aVar2.mo5285b());
                i2 -= aVar2.mo5286c();
                aVar = f4867c;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5282c(p062i4.C2115i r9, p062i4.C2113g r10) {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            p041f3.C1924k.m9142h(r9, r0)
            java.lang.String r0 = "sink"
            p041f3.C1924k.m9142h(r10, r0)
            int r0 = r9.mo7999u()
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = 0
        L_0x0013:
            if (r1 >= r0) goto L_0x003b
            byte r5 = r9.mo7982f(r1)
            r6 = 255(0xff, float:3.57E-43)
            int r5 = p140v3.C3423b.m15084b(r5, r6)
            int[] r6 = f4865a
            r6 = r6[r5]
            byte[] r7 = f4866b
            byte r5 = r7[r5]
            long r3 = r3 << r5
            long r6 = (long) r6
            long r3 = r3 | r6
            int r2 = r2 + r5
        L_0x002b:
            r5 = 8
            if (r2 < r5) goto L_0x0038
            int r2 = r2 + -8
            long r5 = r3 >> r2
            int r6 = (int) r5
            r10.mo7913U(r6)
            goto L_0x002b
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x003b:
            if (r2 <= 0) goto L_0x004a
            int r9 = 8 - r2
            long r0 = r3 << r9
            r3 = 255(0xff, double:1.26E-321)
            long r2 = r3 >>> r2
            long r0 = r0 | r2
            int r9 = (int) r0
            r10.mo7913U(r9)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021c4.C1344k.mo5282c(i4.i, i4.g):void");
    }

    /* renamed from: d */
    public final int mo5283d(C2115i iVar) {
        C1924k.m9142h(iVar, "bytes");
        int u = iVar.mo7999u();
        long j = 0;
        for (int i = 0; i < u; i++) {
            j += (long) f4866b[C3423b.m15084b(iVar.mo7982f(i), 255)];
        }
        return (int) ((j + ((long) 7)) >> 3);
    }
}