package p094o;

import java.util.ArrayList;
import p088n.C2658d;
import p094o.C2830e;

/* renamed from: o.g */
public class C2834g extends C2841l {
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public int f9295L0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public int f9296M0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public int f9297N0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public int f9298O0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public int f9299P0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public int f9300Q0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public float f9301R0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public float f9302S0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public float f9303T0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public float f9304U0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public float f9305V0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public float f9306W0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public int f9307X0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public int f9308Y0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: Z0 */
    public int f9309Z0 = 2;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public int f9310a1 = 2;

    /* renamed from: b1 */
    private int f9311b1 = 0;

    /* renamed from: c1 */
    private int f9312c1 = -1;

    /* renamed from: d1 */
    private int f9313d1 = 0;

    /* renamed from: e1 */
    private ArrayList<C2835a> f9314e1 = new ArrayList<>();

    /* renamed from: f1 */
    private C2830e[] f9315f1 = null;

    /* renamed from: g1 */
    private C2830e[] f9316g1 = null;

    /* renamed from: h1 */
    private int[] f9317h1 = null;
    /* access modifiers changed from: private */

    /* renamed from: i1 */
    public C2830e[] f9318i1;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public int f9319j1 = 0;

    /* renamed from: o.g$a */
    private class C2835a {

        /* renamed from: a */
        private int f9320a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C2830e f9321b = null;

        /* renamed from: c */
        int f9322c = 0;

        /* renamed from: d */
        private C2827d f9323d;

        /* renamed from: e */
        private C2827d f9324e;

        /* renamed from: f */
        private C2827d f9325f;

        /* renamed from: g */
        private C2827d f9326g;

        /* renamed from: h */
        private int f9327h = 0;

        /* renamed from: i */
        private int f9328i = 0;

        /* renamed from: j */
        private int f9329j = 0;

        /* renamed from: k */
        private int f9330k = 0;

        /* renamed from: l */
        private int f9331l = 0;

        /* renamed from: m */
        private int f9332m = 0;

        /* renamed from: n */
        private int f9333n = 0;

        /* renamed from: o */
        private int f9334o = 0;

        /* renamed from: p */
        private int f9335p = 0;

        /* renamed from: q */
        private int f9336q = 0;

        public C2835a(int i, C2827d dVar, C2827d dVar2, C2827d dVar3, C2827d dVar4, int i2) {
            this.f9320a = i;
            this.f9323d = dVar;
            this.f9324e = dVar2;
            this.f9325f = dVar3;
            this.f9326g = dVar4;
            this.f9327h = C2834g.this.mo9802P0();
            this.f9328i = C2834g.this.mo9804R0();
            this.f9329j = C2834g.this.mo9803Q0();
            this.f9330k = C2834g.this.mo9801O0();
            this.f9336q = i2;
        }

        /* renamed from: h */
        private void m12851h() {
            this.f9331l = 0;
            this.f9332m = 0;
            this.f9321b = null;
            this.f9322c = 0;
            int i = this.f9334o;
            int i2 = 0;
            while (i2 < i && this.f9333n + i2 < C2834g.this.f9319j1) {
                C2830e eVar = C2834g.this.f9318i1[this.f9333n + i2];
                if (this.f9320a == 0) {
                    int P = eVar.mo9682P();
                    int f1 = C2834g.this.f9307X0;
                    if (eVar.mo9681O() == 8) {
                        f1 = 0;
                    }
                    this.f9331l += P + f1;
                    int s1 = C2834g.this.m12803A1(eVar, this.f9336q);
                    if (this.f9321b == null || this.f9322c < s1) {
                        this.f9321b = eVar;
                        this.f9322c = s1;
                        this.f9332m = s1;
                    }
                } else {
                    int r1 = C2834g.this.m12804B1(eVar, this.f9336q);
                    int s12 = C2834g.this.m12803A1(eVar, this.f9336q);
                    int g1 = C2834g.this.f9308Y0;
                    if (eVar.mo9681O() == 8) {
                        g1 = 0;
                    }
                    this.f9332m += s12 + g1;
                    if (this.f9321b == null || this.f9322c < r1) {
                        this.f9321b = eVar;
                        this.f9322c = r1;
                        this.f9331l = r1;
                    }
                }
                i2++;
            }
        }

        /* renamed from: b */
        public void mo9778b(C2830e eVar) {
            int i = 0;
            if (this.f9320a == 0) {
                int r1 = C2834g.this.m12804B1(eVar, this.f9336q);
                if (eVar.mo9733y() == C2830e.C2832b.MATCH_CONSTRAINT) {
                    this.f9335p++;
                    r1 = 0;
                }
                int f1 = C2834g.this.f9307X0;
                if (eVar.mo9681O() != 8) {
                    i = f1;
                }
                this.f9331l += r1 + i;
                int s1 = C2834g.this.m12803A1(eVar, this.f9336q);
                if (this.f9321b == null || this.f9322c < s1) {
                    this.f9321b = eVar;
                    this.f9322c = s1;
                    this.f9332m = s1;
                }
            } else {
                int r12 = C2834g.this.m12804B1(eVar, this.f9336q);
                int s12 = C2834g.this.m12803A1(eVar, this.f9336q);
                if (eVar.mo9679M() == C2830e.C2832b.MATCH_CONSTRAINT) {
                    this.f9335p++;
                    s12 = 0;
                }
                int g1 = C2834g.this.f9308Y0;
                if (eVar.mo9681O() != 8) {
                    i = g1;
                }
                this.f9332m += s12 + i;
                if (this.f9321b == null || this.f9322c < r12) {
                    this.f9321b = eVar;
                    this.f9322c = r12;
                    this.f9331l = r12;
                }
            }
            this.f9334o++;
        }

        /* renamed from: c */
        public void mo9779c() {
            this.f9322c = 0;
            this.f9321b = null;
            this.f9331l = 0;
            this.f9332m = 0;
            this.f9333n = 0;
            this.f9334o = 0;
            this.f9335p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:125:0x023f  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9780d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f9334o
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f9333n
                int r4 = r4 + r3
                o.g r5 = p094o.C2834g.this
                int r5 = r5.f9319j1
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                o.g r4 = p094o.C2834g.this
                o.e[] r4 = r4.f9318i1
                int r5 = r0.f9333n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.mo9691Z()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x032b
                o.e r3 = r0.f9321b
                if (r3 != 0) goto L_0x002f
                goto L_0x032b
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = 0
            L_0x0036:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x003a:
                if (r6 >= r1) goto L_0x0067
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f9333n
                int r10 = r10 + r9
                o.g r11 = p094o.C2834g.this
                int r11 = r11.f9319j1
                if (r10 < r11) goto L_0x004f
                goto L_0x0067
            L_0x004f:
                o.g r10 = p094o.C2834g.this
                o.e[] r10 = r10.f9318i1
                int r11 = r0.f9333n
                int r11 = r11 + r9
                r9 = r10[r11]
                int r9 = r9.mo9681O()
                if (r9 != 0) goto L_0x0064
                if (r7 != r5) goto L_0x0063
                r7 = r6
            L_0x0063:
                r8 = r6
            L_0x0064:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0067:
                r6 = 0
                int r9 = r0.f9320a
                if (r9 != 0) goto L_0x01db
                o.e r9 = r0.f9321b
                o.g r10 = p094o.C2834g.this
                int r10 = r10.f9296M0
                r9.mo9734y0(r10)
                int r10 = r0.f9328i
                if (r18 <= 0) goto L_0x0082
                o.g r11 = p094o.C2834g.this
                int r11 = r11.f9308Y0
                int r10 = r10 + r11
            L_0x0082:
                o.d r11 = r9.f9194C
                o.d r12 = r0.f9324e
                r11.mo9642a(r12, r10)
                if (r19 == 0) goto L_0x0094
                o.d r10 = r9.f9196E
                o.d r11 = r0.f9326g
                int r12 = r0.f9330k
                r10.mo9642a(r11, r12)
            L_0x0094:
                if (r18 <= 0) goto L_0x00a1
                o.d r10 = r0.f9324e
                o.e r10 = r10.f9174b
                o.d r10 = r10.f9196E
                o.d r11 = r9.f9194C
                r10.mo9642a(r11, r2)
            L_0x00a1:
                o.g r10 = p094o.C2834g.this
                int r10 = r10.f9310a1
                r11 = 3
                if (r10 != r11) goto L_0x00db
                boolean r10 = r9.mo9685S()
                if (r10 != 0) goto L_0x00db
                r10 = 0
            L_0x00b1:
                if (r10 >= r1) goto L_0x00db
                if (r17 == 0) goto L_0x00b9
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00ba
            L_0x00b9:
                r12 = r10
            L_0x00ba:
                int r13 = r0.f9333n
                int r13 = r13 + r12
                o.g r14 = p094o.C2834g.this
                int r14 = r14.f9319j1
                if (r13 < r14) goto L_0x00c6
                goto L_0x00db
            L_0x00c6:
                o.g r13 = p094o.C2834g.this
                o.e[] r13 = r13.f9318i1
                int r14 = r0.f9333n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.mo9685S()
                if (r13 == 0) goto L_0x00d8
                goto L_0x00dc
            L_0x00d8:
                int r10 = r10 + 1
                goto L_0x00b1
            L_0x00db:
                r12 = r9
            L_0x00dc:
                r10 = 0
            L_0x00dd:
                if (r10 >= r1) goto L_0x032b
                if (r17 == 0) goto L_0x00e5
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e6
            L_0x00e5:
                r13 = r10
            L_0x00e6:
                int r14 = r0.f9333n
                int r14 = r14 + r13
                o.g r15 = p094o.C2834g.this
                int r15 = r15.f9319j1
                if (r14 < r15) goto L_0x00f3
                goto L_0x032b
            L_0x00f3:
                o.g r14 = p094o.C2834g.this
                o.e[] r14 = r14.f9318i1
                int r15 = r0.f9333n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r10 != 0) goto L_0x0109
                o.d r15 = r14.f9193B
                o.d r11 = r0.f9323d
                int r3 = r0.f9327h
                r14.mo9703j(r15, r11, r3)
            L_0x0109:
                if (r13 != 0) goto L_0x014c
                o.g r3 = p094o.C2834g.this
                int r3 = r3.f9295L0
                o.g r11 = p094o.C2834g.this
                float r11 = r11.f9301R0
                int r13 = r0.f9333n
                if (r13 != 0) goto L_0x0130
                o.g r13 = p094o.C2834g.this
                int r13 = r13.f9297N0
                if (r13 == r5) goto L_0x0130
                o.g r3 = p094o.C2834g.this
                int r3 = r3.f9297N0
                o.g r11 = p094o.C2834g.this
                float r11 = r11.f9303T0
                goto L_0x0146
            L_0x0130:
                if (r19 == 0) goto L_0x0146
                o.g r13 = p094o.C2834g.this
                int r13 = r13.f9299P0
                if (r13 == r5) goto L_0x0146
                o.g r3 = p094o.C2834g.this
                int r3 = r3.f9299P0
                o.g r11 = p094o.C2834g.this
                float r11 = r11.f9305V0
            L_0x0146:
                r14.mo9704j0(r3)
                r14.mo9702i0(r11)
            L_0x014c:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x0159
                o.d r3 = r14.f9195D
                o.d r11 = r0.f9325f
                int r13 = r0.f9329j
                r14.mo9703j(r3, r11, r13)
            L_0x0159:
                if (r6 == 0) goto L_0x0184
                o.d r3 = r14.f9193B
                o.d r11 = r6.f9195D
                o.g r13 = p094o.C2834g.this
                int r13 = r13.f9307X0
                r3.mo9642a(r11, r13)
                if (r10 != r7) goto L_0x0171
                o.d r3 = r14.f9193B
                int r11 = r0.f9327h
                r3.mo9655n(r11)
            L_0x0171:
                o.d r3 = r6.f9195D
                o.d r11 = r14.f9193B
                r3.mo9642a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x0184
                o.d r3 = r6.f9195D
                int r6 = r0.f9329j
                r3.mo9655n(r6)
            L_0x0184:
                if (r14 == r9) goto L_0x01d4
                o.g r3 = p094o.C2834g.this
                int r3 = r3.f9310a1
                r6 = 3
                if (r3 != r6) goto L_0x01a2
                boolean r3 = r12.mo9685S()
                if (r3 == 0) goto L_0x01a2
                if (r14 == r12) goto L_0x01a2
                boolean r3 = r14.mo9685S()
                if (r3 == 0) goto L_0x01a2
                o.d r3 = r14.f9197F
                o.d r11 = r12.f9197F
                goto L_0x01d0
            L_0x01a2:
                o.g r3 = p094o.C2834g.this
                int r3 = r3.f9310a1
                if (r3 == 0) goto L_0x01cc
                r11 = 1
                if (r3 == r11) goto L_0x01c7
                o.d r3 = r14.f9194C
                if (r4 == 0) goto L_0x01c2
                o.d r11 = r0.f9324e
                int r13 = r0.f9328i
                r3.mo9642a(r11, r13)
                o.d r3 = r14.f9196E
                o.d r11 = r0.f9326g
                int r13 = r0.f9330k
                r3.mo9642a(r11, r13)
                goto L_0x01d5
            L_0x01c2:
                o.d r11 = r9.f9194C
                r3.mo9642a(r11, r2)
            L_0x01c7:
                o.d r3 = r14.f9196E
                o.d r11 = r9.f9196E
                goto L_0x01d0
            L_0x01cc:
                o.d r3 = r14.f9194C
                o.d r11 = r9.f9194C
            L_0x01d0:
                r3.mo9642a(r11, r2)
                goto L_0x01d5
            L_0x01d4:
                r6 = 3
            L_0x01d5:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto L_0x00dd
            L_0x01db:
                o.e r3 = r0.f9321b
                o.g r9 = p094o.C2834g.this
                int r9 = r9.f9295L0
                r3.mo9704j0(r9)
                int r9 = r0.f9327h
                if (r18 <= 0) goto L_0x01f1
                o.g r10 = p094o.C2834g.this
                int r10 = r10.f9307X0
                int r9 = r9 + r10
            L_0x01f1:
                if (r17 == 0) goto L_0x0210
                o.d r10 = r3.f9195D
                o.d r11 = r0.f9325f
                r10.mo9642a(r11, r9)
                if (r19 == 0) goto L_0x0205
                o.d r9 = r3.f9193B
                o.d r10 = r0.f9323d
                int r11 = r0.f9329j
                r9.mo9642a(r10, r11)
            L_0x0205:
                if (r18 <= 0) goto L_0x022f
                o.d r9 = r0.f9325f
                o.e r9 = r9.f9174b
                o.d r9 = r9.f9193B
                o.d r10 = r3.f9195D
                goto L_0x022c
            L_0x0210:
                o.d r10 = r3.f9193B
                o.d r11 = r0.f9323d
                r10.mo9642a(r11, r9)
                if (r19 == 0) goto L_0x0222
                o.d r9 = r3.f9195D
                o.d r10 = r0.f9325f
                int r11 = r0.f9329j
                r9.mo9642a(r10, r11)
            L_0x0222:
                if (r18 <= 0) goto L_0x022f
                o.d r9 = r0.f9323d
                o.e r9 = r9.f9174b
                o.d r9 = r9.f9195D
                o.d r10 = r3.f9193B
            L_0x022c:
                r9.mo9642a(r10, r2)
            L_0x022f:
                r9 = 0
            L_0x0230:
                if (r9 >= r1) goto L_0x032b
                int r10 = r0.f9333n
                int r10 = r10 + r9
                o.g r11 = p094o.C2834g.this
                int r11 = r11.f9319j1
                if (r10 < r11) goto L_0x023f
                goto L_0x032b
            L_0x023f:
                o.g r10 = p094o.C2834g.this
                o.e[] r10 = r10.f9318i1
                int r11 = r0.f9333n
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r9 != 0) goto L_0x0296
                o.d r11 = r10.f9194C
                o.d r12 = r0.f9324e
                int r13 = r0.f9328i
                r10.mo9703j(r11, r12, r13)
                o.g r11 = p094o.C2834g.this
                int r11 = r11.f9296M0
                o.g r12 = p094o.C2834g.this
                float r12 = r12.f9302S0
                int r13 = r0.f9333n
                if (r13 != 0) goto L_0x027a
                o.g r13 = p094o.C2834g.this
                int r13 = r13.f9298O0
                if (r13 == r5) goto L_0x027a
                o.g r11 = p094o.C2834g.this
                int r11 = r11.f9298O0
                o.g r12 = p094o.C2834g.this
                float r12 = r12.f9304U0
                goto L_0x0290
            L_0x027a:
                if (r19 == 0) goto L_0x0290
                o.g r13 = p094o.C2834g.this
                int r13 = r13.f9300Q0
                if (r13 == r5) goto L_0x0290
                o.g r11 = p094o.C2834g.this
                int r11 = r11.f9300Q0
                o.g r12 = p094o.C2834g.this
                float r12 = r12.f9306W0
            L_0x0290:
                r10.mo9734y0(r11)
                r10.mo9732x0(r12)
            L_0x0296:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02a3
                o.d r11 = r10.f9196E
                o.d r12 = r0.f9326g
                int r13 = r0.f9330k
                r10.mo9703j(r11, r12, r13)
            L_0x02a3:
                if (r6 == 0) goto L_0x02ce
                o.d r11 = r10.f9194C
                o.d r12 = r6.f9196E
                o.g r13 = p094o.C2834g.this
                int r13 = r13.f9308Y0
                r11.mo9642a(r12, r13)
                if (r9 != r7) goto L_0x02bb
                o.d r11 = r10.f9194C
                int r12 = r0.f9328i
                r11.mo9655n(r12)
            L_0x02bb:
                o.d r11 = r6.f9196E
                o.d r12 = r10.f9194C
                r11.mo9642a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x02ce
                o.d r6 = r6.f9196E
                int r11 = r0.f9330k
                r6.mo9655n(r11)
            L_0x02ce:
                if (r10 == r3) goto L_0x0325
                r6 = 2
                o.g r11 = p094o.C2834g.this
                int r11 = r11.f9309Z0
                if (r17 == 0) goto L_0x02f6
                if (r11 == 0) goto L_0x02ee
                r12 = 1
                if (r11 == r12) goto L_0x02e9
                if (r11 == r6) goto L_0x02e1
                goto L_0x0325
            L_0x02e1:
                o.d r6 = r10.f9193B
                o.d r11 = r3.f9193B
                r6.mo9642a(r11, r2)
                goto L_0x02ee
            L_0x02e9:
                o.d r6 = r10.f9193B
                o.d r11 = r3.f9193B
                goto L_0x02f2
            L_0x02ee:
                o.d r6 = r10.f9195D
                o.d r11 = r3.f9195D
            L_0x02f2:
                r6.mo9642a(r11, r2)
                goto L_0x0325
            L_0x02f6:
                r12 = 1
                if (r11 == 0) goto L_0x031d
                if (r11 == r12) goto L_0x0318
                if (r11 == r6) goto L_0x02fe
                goto L_0x0326
            L_0x02fe:
                o.d r6 = r10.f9193B
                if (r4 == 0) goto L_0x0313
                o.d r11 = r0.f9323d
                int r13 = r0.f9327h
                r6.mo9642a(r11, r13)
                o.d r6 = r10.f9195D
                o.d r11 = r0.f9325f
                int r13 = r0.f9329j
                r6.mo9642a(r11, r13)
                goto L_0x0326
            L_0x0313:
                o.d r11 = r3.f9193B
                r6.mo9642a(r11, r2)
            L_0x0318:
                o.d r6 = r10.f9195D
                o.d r11 = r3.f9195D
                goto L_0x0321
            L_0x031d:
                o.d r6 = r10.f9193B
                o.d r11 = r3.f9193B
            L_0x0321:
                r6.mo9642a(r11, r2)
                goto L_0x0326
            L_0x0325:
                r12 = 1
            L_0x0326:
                int r9 = r9 + 1
                r6 = r10
                goto L_0x0230
            L_0x032b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p094o.C2834g.C2835a.mo9780d(boolean, int, boolean):void");
        }

        /* renamed from: e */
        public int mo9781e() {
            return this.f9320a == 1 ? this.f9332m - C2834g.this.f9308Y0 : this.f9332m;
        }

        /* renamed from: f */
        public int mo9782f() {
            return this.f9320a == 0 ? this.f9331l - C2834g.this.f9307X0 : this.f9331l;
        }

        /* renamed from: g */
        public void mo9783g(int i) {
            int i2;
            C2830e.C2832b bVar;
            int i3;
            C2830e.C2832b bVar2;
            C2834g gVar;
            int i4 = this.f9335p;
            if (i4 != 0) {
                int i5 = this.f9334o;
                int i6 = i / i4;
                int i7 = 0;
                while (i7 < i5 && this.f9333n + i7 < C2834g.this.f9319j1) {
                    C2830e eVar = C2834g.this.f9318i1[this.f9333n + i7];
                    if (this.f9320a == 0) {
                        if (eVar != null && eVar.mo9733y() == C2830e.C2832b.MATCH_CONSTRAINT && eVar.f9240l == 0) {
                            gVar = C2834g.this;
                            bVar2 = C2830e.C2832b.FIXED;
                            bVar = eVar.mo9679M();
                            i2 = eVar.mo9727v();
                            i3 = i6;
                        }
                        i7++;
                    } else {
                        if (eVar != null && eVar.mo9679M() == C2830e.C2832b.MATCH_CONSTRAINT && eVar.f9242m == 0) {
                            gVar = C2834g.this;
                            bVar2 = eVar.mo9733y();
                            i3 = eVar.mo9682P();
                            bVar = C2830e.C2832b.FIXED;
                            i2 = i6;
                        }
                        i7++;
                    }
                    gVar.mo9805T0(eVar, bVar2, i3, bVar, i2);
                    i7++;
                }
                m12851h();
            }
        }

        /* renamed from: i */
        public void mo9784i(int i) {
            this.f9333n = i;
        }

        /* renamed from: j */
        public void mo9785j(int i, C2827d dVar, C2827d dVar2, C2827d dVar3, C2827d dVar4, int i2, int i3, int i4, int i5, int i6) {
            this.f9320a = i;
            this.f9323d = dVar;
            this.f9324e = dVar2;
            this.f9325f = dVar3;
            this.f9326g = dVar4;
            this.f9327h = i2;
            this.f9328i = i3;
            this.f9329j = i4;
            this.f9330k = i5;
            this.f9336q = i6;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final int m12803A1(C2830e eVar, int i) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.mo9679M() == C2830e.C2832b.MATCH_CONSTRAINT) {
            int i2 = eVar.f9242m;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.f9256t * ((float) i));
                if (i3 != eVar.mo9727v()) {
                    mo9805T0(eVar, eVar.mo9733y(), eVar.mo9682P(), C2830e.C2832b.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return eVar.mo9727v();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) eVar.mo9682P()) * eVar.f9208Q) + 0.5f);
                }
            }
        }
        return eVar.mo9727v();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final int m12804B1(C2830e eVar, int i) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.mo9733y() == C2830e.C2832b.MATCH_CONSTRAINT) {
            int i2 = eVar.f9240l;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.f9250q * ((float) i));
                if (i3 != eVar.mo9682P()) {
                    mo9805T0(eVar, C2830e.C2832b.FIXED, i3, eVar.mo9679M(), eVar.mo9727v());
                }
                return i3;
            } else if (i2 == 1) {
                return eVar.mo9682P();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) eVar.mo9727v()) * eVar.f9208Q) + 0.5f);
                }
            }
        }
        return eVar.mo9682P();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0129 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* renamed from: C1 */
    private void m12805C1(p094o.C2830e[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            int r6 = r0.f9312c1
            if (r3 != 0) goto L_0x0030
            if (r6 > 0) goto L_0x002d
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0014:
            if (r7 >= r2) goto L_0x002d
            if (r7 <= 0) goto L_0x001b
            int r9 = r0.f9307X0
            int r8 = r8 + r9
        L_0x001b:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            int r9 = r0.m12804B1(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            int r6 = r6 + 1
        L_0x002a:
            int r7 = r7 + 1
            goto L_0x0014
        L_0x002d:
            r7 = r6
            r6 = 0
            goto L_0x004f
        L_0x0030:
            if (r6 > 0) goto L_0x004e
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0035:
            if (r7 >= r2) goto L_0x004e
            if (r7 <= 0) goto L_0x003c
            int r9 = r0.f9308Y0
            int r8 = r8 + r9
        L_0x003c:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0041
            goto L_0x004b
        L_0x0041:
            int r9 = r0.m12803A1(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            int r6 = r6 + 1
        L_0x004b:
            int r7 = r7 + 1
            goto L_0x0035
        L_0x004e:
            r7 = 0
        L_0x004f:
            int[] r8 = r0.f9317h1
            if (r8 != 0) goto L_0x0058
            r8 = 2
            int[] r8 = new int[r8]
            r0.f9317h1 = r8
        L_0x0058:
            r8 = 1
            if (r6 != 0) goto L_0x005d
            if (r3 == r8) goto L_0x0061
        L_0x005d:
            if (r7 != 0) goto L_0x0063
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            r9 = 1
            goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            if (r9 != 0) goto L_0x0129
            if (r3 != 0) goto L_0x0072
            float r6 = (float) r2
            float r10 = (float) r7
            float r6 = r6 / r10
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            int r6 = (int) r10
            goto L_0x007b
        L_0x0072:
            float r7 = (float) r2
            float r10 = (float) r6
            float r7 = r7 / r10
            double r10 = (double) r7
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
        L_0x007b:
            o.e[] r10 = r0.f9316g1
            r11 = 0
            if (r10 == 0) goto L_0x0088
            int r12 = r10.length
            if (r12 >= r7) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            java.util.Arrays.fill(r10, r11)
            goto L_0x008c
        L_0x0088:
            o.e[] r10 = new p094o.C2830e[r7]
            r0.f9316g1 = r10
        L_0x008c:
            o.e[] r10 = r0.f9315f1
            if (r10 == 0) goto L_0x0098
            int r12 = r10.length
            if (r12 >= r6) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            java.util.Arrays.fill(r10, r11)
            goto L_0x009c
        L_0x0098:
            o.e[] r10 = new p094o.C2830e[r6]
            r0.f9315f1 = r10
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 >= r7) goto L_0x00e5
            r11 = 0
        L_0x00a0:
            if (r11 >= r6) goto L_0x00e2
            int r12 = r11 * r7
            int r12 = r12 + r10
            if (r3 != r8) goto L_0x00aa
            int r12 = r10 * r6
            int r12 = r12 + r11
        L_0x00aa:
            int r13 = r1.length
            if (r12 < r13) goto L_0x00ae
            goto L_0x00df
        L_0x00ae:
            r12 = r1[r12]
            if (r12 != 0) goto L_0x00b3
            goto L_0x00df
        L_0x00b3:
            int r13 = r0.m12804B1(r12, r4)
            o.e[] r14 = r0.f9316g1
            r15 = r14[r10]
            if (r15 == 0) goto L_0x00c5
            r14 = r14[r10]
            int r14 = r14.mo9682P()
            if (r14 >= r13) goto L_0x00c9
        L_0x00c5:
            o.e[] r13 = r0.f9316g1
            r13[r10] = r12
        L_0x00c9:
            int r13 = r0.m12803A1(r12, r4)
            o.e[] r14 = r0.f9315f1
            r15 = r14[r11]
            if (r15 == 0) goto L_0x00db
            r14 = r14[r11]
            int r14 = r14.mo9727v()
            if (r14 >= r13) goto L_0x00df
        L_0x00db:
            o.e[] r13 = r0.f9315f1
            r13[r11] = r12
        L_0x00df:
            int r11 = r11 + 1
            goto L_0x00a0
        L_0x00e2:
            int r10 = r10 + 1
            goto L_0x009d
        L_0x00e5:
            r10 = 0
            r11 = 0
        L_0x00e7:
            if (r10 >= r7) goto L_0x00fc
            o.e[] r12 = r0.f9316g1
            r12 = r12[r10]
            if (r12 == 0) goto L_0x00f9
            if (r10 <= 0) goto L_0x00f4
            int r13 = r0.f9307X0
            int r11 = r11 + r13
        L_0x00f4:
            int r12 = r0.m12804B1(r12, r4)
            int r11 = r11 + r12
        L_0x00f9:
            int r10 = r10 + 1
            goto L_0x00e7
        L_0x00fc:
            r10 = 0
            r12 = 0
        L_0x00fe:
            if (r10 >= r6) goto L_0x0113
            o.e[] r13 = r0.f9315f1
            r13 = r13[r10]
            if (r13 == 0) goto L_0x0110
            if (r10 <= 0) goto L_0x010b
            int r14 = r0.f9308Y0
            int r12 = r12 + r14
        L_0x010b:
            int r13 = r0.m12803A1(r13, r4)
            int r12 = r12 + r13
        L_0x0110:
            int r10 = r10 + 1
            goto L_0x00fe
        L_0x0113:
            r21[r5] = r11
            r21[r8] = r12
            if (r3 != 0) goto L_0x0121
            if (r11 <= r4) goto L_0x0061
            if (r7 <= r8) goto L_0x0061
            int r7 = r7 + -1
            goto L_0x0064
        L_0x0121:
            if (r12 <= r4) goto L_0x0061
            if (r6 <= r8) goto L_0x0061
            int r6 = r6 + -1
            goto L_0x0064
        L_0x0129:
            int[] r1 = r0.f9317h1
            r1[r5] = r7
            r1[r8] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p094o.C2834g.m12805C1(o.e[], int, int, int, int[]):void");
    }

    /* renamed from: D1 */
    private void m12806D1(C2830e[] eVarArr, int i, int i2, int i3, int[] iArr) {
        C2827d dVar;
        int i4;
        int i5;
        int i6;
        C2827d dVar2;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.f9314e1.clear();
            C2835a aVar = new C2835a(i2, this.f9193B, this.f9194C, this.f9195D, this.f9196E, i3);
            this.f9314e1.add(aVar);
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            if (i2 == 0) {
                while (i14 < i10) {
                    C2830e eVar = eVarArr[i14];
                    int B1 = m12804B1(eVar, i11);
                    if (eVar.mo9733y() == C2830e.C2832b.MATCH_CONSTRAINT) {
                        i12++;
                    }
                    int i15 = i12;
                    boolean z = (i13 == i11 || (this.f9307X0 + i13) + B1 > i11) && aVar.f9321b != null;
                    if (!z && i14 > 0 && (i9 = this.f9312c1) > 0 && i14 % i9 == 0) {
                        z = true;
                    }
                    if (z) {
                        aVar = new C2835a(i2, this.f9193B, this.f9194C, this.f9195D, this.f9196E, i3);
                        aVar.mo9784i(i14);
                        this.f9314e1.add(aVar);
                    } else if (i14 > 0) {
                        i13 += this.f9307X0 + B1;
                        aVar.mo9778b(eVar);
                        i14++;
                        i12 = i15;
                    }
                    i13 = B1;
                    aVar.mo9778b(eVar);
                    i14++;
                    i12 = i15;
                }
            } else {
                while (i14 < i10) {
                    C2830e eVar2 = eVarArr[i14];
                    int A1 = m12803A1(eVar2, i11);
                    if (eVar2.mo9679M() == C2830e.C2832b.MATCH_CONSTRAINT) {
                        i12++;
                    }
                    int i16 = i12;
                    boolean z2 = (i13 == i11 || (this.f9308Y0 + i13) + A1 > i11) && aVar.f9321b != null;
                    if (!z2 && i14 > 0 && (i8 = this.f9312c1) > 0 && i14 % i8 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new C2835a(i2, this.f9193B, this.f9194C, this.f9195D, this.f9196E, i3);
                        aVar.mo9784i(i14);
                        this.f9314e1.add(aVar);
                    } else if (i14 > 0) {
                        i7 = i13 + this.f9308Y0 + A1;
                        aVar.mo9778b(eVar2);
                        i14++;
                        i12 = i16;
                    }
                    i7 = A1;
                    aVar.mo9778b(eVar2);
                    i14++;
                    i12 = i16;
                }
            }
            int size = this.f9314e1.size();
            C2827d dVar3 = this.f9193B;
            C2827d dVar4 = this.f9194C;
            C2827d dVar5 = this.f9195D;
            C2827d dVar6 = this.f9196E;
            int P0 = mo9802P0();
            int R0 = mo9804R0();
            int Q0 = mo9803Q0();
            int O0 = mo9801O0();
            C2830e.C2832b y = mo9733y();
            C2830e.C2832b bVar = C2830e.C2832b.WRAP_CONTENT;
            boolean z3 = y == bVar || mo9679M() == bVar;
            if (i12 > 0 && z3) {
                for (int i17 = 0; i17 < size; i17++) {
                    C2835a aVar2 = this.f9314e1.get(i17);
                    aVar2.mo9783g(i11 - (i2 == 0 ? aVar2.mo9782f() : aVar2.mo9781e()));
                }
            }
            int i18 = R0;
            int i19 = Q0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = P0;
            C2827d dVar7 = dVar4;
            C2827d dVar8 = dVar3;
            int i24 = O0;
            while (i22 < size) {
                C2835a aVar3 = this.f9314e1.get(i22);
                if (i2 == 0) {
                    if (i22 < size - 1) {
                        dVar2 = this.f9314e1.get(i22 + 1).f9321b.f9194C;
                        i6 = 0;
                    } else {
                        dVar2 = this.f9196E;
                        i6 = mo9801O0();
                    }
                    C2827d dVar9 = aVar3.f9321b.f9196E;
                    C2827d dVar10 = dVar8;
                    C2827d dVar11 = dVar8;
                    int i25 = i20;
                    C2827d dVar12 = dVar7;
                    int i26 = i21;
                    C2827d dVar13 = dVar5;
                    C2827d dVar14 = dVar5;
                    i4 = i22;
                    aVar3.mo9785j(i2, dVar10, dVar12, dVar13, dVar2, i23, i18, i19, i6, i3);
                    int max = Math.max(i26, aVar3.mo9782f());
                    i20 = i25 + aVar3.mo9781e();
                    if (i4 > 0) {
                        i20 += this.f9308Y0;
                    }
                    dVar8 = dVar11;
                    i21 = max;
                    dVar7 = dVar9;
                    i18 = 0;
                    dVar = dVar14;
                    int i27 = i6;
                    dVar6 = dVar2;
                    i24 = i27;
                } else {
                    C2827d dVar15 = dVar8;
                    int i28 = i20;
                    int i29 = i21;
                    i4 = i22;
                    if (i4 < size - 1) {
                        dVar = this.f9314e1.get(i4 + 1).f9321b.f9193B;
                        i5 = 0;
                    } else {
                        dVar = this.f9195D;
                        i5 = mo9803Q0();
                    }
                    C2827d dVar16 = aVar3.f9321b.f9195D;
                    aVar3.mo9785j(i2, dVar15, dVar7, dVar, dVar6, i23, i18, i5, i24, i3);
                    i21 = i29 + aVar3.mo9782f();
                    int max2 = Math.max(i28, aVar3.mo9781e());
                    if (i4 > 0) {
                        i21 += this.f9307X0;
                    }
                    i20 = max2;
                    i19 = i5;
                    dVar8 = dVar16;
                    i23 = 0;
                }
                i22 = i4 + 1;
                int i30 = i3;
                dVar5 = dVar;
            }
            iArr[0] = i21;
            iArr[1] = i20;
        }
    }

    /* renamed from: E1 */
    private void m12807E1(C2830e[] eVarArr, int i, int i2, int i3, int[] iArr) {
        C2835a aVar;
        int i4 = i;
        if (i4 != 0) {
            if (this.f9314e1.size() == 0) {
                aVar = new C2835a(i2, this.f9193B, this.f9194C, this.f9195D, this.f9196E, i3);
                this.f9314e1.add(aVar);
            } else {
                C2835a aVar2 = this.f9314e1.get(0);
                aVar2.mo9779c();
                aVar = aVar2;
                int i5 = i2;
                aVar.mo9785j(i5, this.f9193B, this.f9194C, this.f9195D, this.f9196E, mo9802P0(), mo9804R0(), mo9803Q0(), mo9801O0(), i3);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                aVar.mo9778b(eVarArr[i6]);
            }
            iArr[0] = aVar.mo9782f();
            iArr[1] = aVar.mo9781e();
        }
    }

    /* renamed from: z1 */
    private void m12828z1(boolean z) {
        C2830e eVar;
        if (this.f9317h1 != null && this.f9316g1 != null && this.f9315f1 != null) {
            for (int i = 0; i < this.f9319j1; i++) {
                this.f9318i1[i].mo9691Z();
            }
            int[] iArr = this.f9317h1;
            int i2 = iArr[0];
            int i3 = iArr[1];
            C2830e eVar2 = null;
            for (int i4 = 0; i4 < i2; i4++) {
                C2830e eVar3 = this.f9316g1[z ? (i2 - i4) - 1 : i4];
                if (!(eVar3 == null || eVar3.mo9681O() == 8)) {
                    if (i4 == 0) {
                        eVar3.mo9703j(eVar3.f9193B, this.f9193B, mo9802P0());
                        eVar3.mo9704j0(this.f9295L0);
                        eVar3.mo9702i0(this.f9301R0);
                    }
                    if (i4 == i2 - 1) {
                        eVar3.mo9703j(eVar3.f9195D, this.f9195D, mo9803Q0());
                    }
                    if (i4 > 0) {
                        eVar3.mo9703j(eVar3.f9193B, eVar2.f9195D, this.f9307X0);
                        eVar2.mo9703j(eVar2.f9195D, eVar3.f9193B, 0);
                    }
                    eVar2 = eVar3;
                }
            }
            for (int i5 = 0; i5 < i3; i5++) {
                C2830e eVar4 = this.f9315f1[i5];
                if (!(eVar4 == null || eVar4.mo9681O() == 8)) {
                    if (i5 == 0) {
                        eVar4.mo9703j(eVar4.f9194C, this.f9194C, mo9804R0());
                        eVar4.mo9734y0(this.f9296M0);
                        eVar4.mo9732x0(this.f9302S0);
                    }
                    if (i5 == i3 - 1) {
                        eVar4.mo9703j(eVar4.f9196E, this.f9196E, mo9801O0());
                    }
                    if (i5 > 0) {
                        eVar4.mo9703j(eVar4.f9194C, eVar2.f9196E, this.f9308Y0);
                        eVar2.mo9703j(eVar2.f9196E, eVar4.f9194C, 0);
                    }
                    eVar2 = eVar4;
                }
            }
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = (i7 * i2) + i6;
                    if (this.f9313d1 == 1) {
                        i8 = (i6 * i3) + i7;
                    }
                    C2830e[] eVarArr = this.f9318i1;
                    if (!(i8 >= eVarArr.length || (eVar = eVarArr[i8]) == null || eVar.mo9681O() == 8)) {
                        C2830e eVar5 = this.f9316g1[i6];
                        C2830e eVar6 = this.f9315f1[i7];
                        if (eVar != eVar5) {
                            eVar.mo9703j(eVar.f9193B, eVar5.f9193B, 0);
                            eVar.mo9703j(eVar.f9195D, eVar5.f9195D, 0);
                        }
                        if (eVar != eVar6) {
                            eVar.mo9703j(eVar.f9194C, eVar6.f9194C, 0);
                            eVar.mo9703j(eVar.f9196E, eVar6.f9196E, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: F1 */
    public void mo9758F1(float f) {
        this.f9303T0 = f;
    }

    /* renamed from: G1 */
    public void mo9759G1(int i) {
        this.f9297N0 = i;
    }

    /* renamed from: H1 */
    public void mo9760H1(float f) {
        this.f9304U0 = f;
    }

    /* renamed from: I1 */
    public void mo9761I1(int i) {
        this.f9298O0 = i;
    }

    /* renamed from: J1 */
    public void mo9762J1(int i) {
        this.f9309Z0 = i;
    }

    /* renamed from: K1 */
    public void mo9763K1(float f) {
        this.f9301R0 = f;
    }

    /* renamed from: L1 */
    public void mo9764L1(int i) {
        this.f9307X0 = i;
    }

    /* renamed from: M1 */
    public void mo9765M1(int i) {
        this.f9295L0 = i;
    }

    /* renamed from: N1 */
    public void mo9766N1(float f) {
        this.f9305V0 = f;
    }

    /* renamed from: O1 */
    public void mo9767O1(int i) {
        this.f9299P0 = i;
    }

    /* renamed from: P1 */
    public void mo9768P1(float f) {
        this.f9306W0 = f;
    }

    /* renamed from: Q1 */
    public void mo9769Q1(int i) {
        this.f9300Q0 = i;
    }

    /* renamed from: R1 */
    public void mo9770R1(int i) {
        this.f9312c1 = i;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r6.f9296M0 == -1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r6.f9296M0 == -1) goto L_0x0054;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9771S0(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.f9346x0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.mo9806U0()
            if (r0 != 0) goto L_0x001c
            r6.mo9809X0(r11, r11)
            r6.mo9808W0(r11)
            return
        L_0x001c:
            int r12 = r18.mo9802P0()
            int r13 = r18.mo9803Q0()
            int r14 = r18.mo9804R0()
            int r15 = r18.mo9801O0()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.f9313d1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004a
            int r2 = r6.f9295L0
            if (r2 != r1) goto L_0x0045
            r6.f9295L0 = r11
        L_0x0045:
            int r2 = r6.f9296M0
            if (r2 != r1) goto L_0x0056
            goto L_0x0054
        L_0x004a:
            int r2 = r6.f9295L0
            if (r2 != r1) goto L_0x0050
            r6.f9295L0 = r11
        L_0x0050:
            int r2 = r6.f9296M0
            if (r2 != r1) goto L_0x0056
        L_0x0054:
            r6.f9296M0 = r11
        L_0x0056:
            o.e[] r1 = r6.f9345w0
            r2 = 0
            r3 = 0
        L_0x005a:
            int r11 = r6.f9346x0
            r0 = 8
            if (r2 >= r11) goto L_0x0070
            o.e[] r11 = r6.f9345w0
            r11 = r11[r2]
            int r11 = r11.mo9681O()
            if (r11 != r0) goto L_0x006c
            int r3 = r3 + 1
        L_0x006c:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005a
        L_0x0070:
            if (r3 <= 0) goto L_0x008f
            int r11 = r11 - r3
            o.e[] r1 = new p094o.C2830e[r11]
            r2 = 0
            r3 = 0
        L_0x0077:
            int r11 = r6.f9346x0
            if (r2 >= r11) goto L_0x008d
            o.e[] r11 = r6.f9345w0
            r11 = r11[r2]
            int r4 = r11.mo9681O()
            if (r4 == r0) goto L_0x0089
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x0089:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0077
        L_0x008d:
            r2 = r3
            goto L_0x0090
        L_0x008f:
            r2 = r11
        L_0x0090:
            r6.f9318i1 = r1
            r6.f9319j1 = r2
            int r0 = r6.f9311b1
            if (r0 == 0) goto L_0x00bd
            r4 = 1
            if (r0 == r4) goto L_0x00b0
            r3 = 2
            if (r0 == r3) goto L_0x00a3
            r17 = r5
            r0 = 0
            r11 = 1
            goto L_0x00ca
        L_0x00a3:
            int r3 = r6.f9313d1
            r0 = r18
            r11 = 1
            r4 = r16
            r17 = r5
            r0.m12805C1(r1, r2, r3, r4, r5)
            goto L_0x00c9
        L_0x00b0:
            r17 = r5
            r11 = 1
            int r3 = r6.f9313d1
            r0 = r18
            r4 = r16
            r0.m12806D1(r1, r2, r3, r4, r5)
            goto L_0x00c9
        L_0x00bd:
            r17 = r5
            r11 = 1
            int r3 = r6.f9313d1
            r0 = r18
            r4 = r16
            r0.m12807E1(r1, r2, r3, r4, r5)
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00da
            r1 = r8
            goto L_0x00e5
        L_0x00da:
            if (r7 != r3) goto L_0x00e1
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00e5
        L_0x00e1:
            if (r7 != 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r1 = 0
        L_0x00e5:
            if (r9 != r4) goto L_0x00e9
            r2 = r10
            goto L_0x00f4
        L_0x00e9:
            if (r9 != r3) goto L_0x00f0
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x00f4
        L_0x00f0:
            if (r9 != 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            r6.mo9809X0(r1, r2)
            r6.mo9666E0(r1)
            r6.mo9700h0(r2)
            int r1 = r6.f9346x0
            if (r1 <= 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r11 = 0
        L_0x0103:
            r6.mo9808W0(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p094o.C2834g.mo9771S0(int, int, int, int):void");
    }

    /* renamed from: S1 */
    public void mo9772S1(int i) {
        this.f9313d1 = i;
    }

    /* renamed from: T1 */
    public void mo9773T1(int i) {
        this.f9310a1 = i;
    }

    /* renamed from: U1 */
    public void mo9774U1(float f) {
        this.f9302S0 = f;
    }

    /* renamed from: V1 */
    public void mo9775V1(int i) {
        this.f9308Y0 = i;
    }

    /* renamed from: W1 */
    public void mo9776W1(int i) {
        this.f9296M0 = i;
    }

    /* renamed from: X1 */
    public void mo9777X1(int i) {
        this.f9311b1 = i;
    }

    /* renamed from: f */
    public void mo9638f(C2658d dVar) {
        super.mo9638f(dVar);
        boolean a1 = mo9669G() != null ? ((C2833f) mo9669G()).mo9749a1() : false;
        int i = this.f9311b1;
        if (i != 0) {
            if (i == 1) {
                int size = this.f9314e1.size();
                int i2 = 0;
                while (i2 < size) {
                    this.f9314e1.get(i2).mo9780d(a1, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                m12828z1(a1);
            }
        } else if (this.f9314e1.size() > 0) {
            this.f9314e1.get(0).mo9780d(a1, 0, true);
        }
        mo9808W0(false);
    }
}
