package p100p;

import java.util.ArrayList;
import java.util.Iterator;
import p094o.C2830e;
import p094o.C2833f;

/* renamed from: p.c */
public class C2888c extends C2901m {

    /* renamed from: k */
    ArrayList<C2901m> f9569k = new ArrayList<>();

    /* renamed from: l */
    private int f9570l;

    public C2888c(C2830e eVar, int i) {
        super(eVar);
        this.f9620f = i;
        m13128q();
    }

    /* renamed from: q */
    private void m13128q() {
        C2830e eVar;
        C2830e eVar2 = this.f9616b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.mo9671H(this.f9620f);
        } while (eVar2 != null);
        this.f9616b = eVar;
        this.f9569k.add(eVar.mo9675J(this.f9620f));
        C2830e F = eVar.mo9667F(this.f9620f);
        while (F != null) {
            this.f9569k.add(F.mo9675J(this.f9620f));
            F = F.mo9667F(this.f9620f);
        }
        Iterator<C2901m> it = this.f9569k.iterator();
        while (it.hasNext()) {
            C2901m next = it.next();
            int i = this.f9620f;
            if (i == 0) {
                next.f9616b.f9222c = this;
            } else if (i == 1) {
                next.f9616b.f9224d = this;
            }
        }
        if ((this.f9620f == 0 && ((C2833f) this.f9616b.mo9669G()).mo9749a1()) && this.f9569k.size() > 1) {
            ArrayList<C2901m> arrayList = this.f9569k;
            this.f9616b = arrayList.get(arrayList.size() - 1).f9616b;
        }
        this.f9570l = this.f9620f == 0 ? this.f9616b.mo9731x() : this.f9616b.mo9678L();
    }

    /* renamed from: r */
    private C2830e m13129r() {
        for (int i = 0; i < this.f9569k.size(); i++) {
            C2901m mVar = this.f9569k.get(i);
            if (mVar.f9616b.mo9681O() != 8) {
                return mVar.f9616b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C2830e m13130s() {
        for (int size = this.f9569k.size() - 1; size >= 0; size--) {
            C2901m mVar = this.f9569k.get(size);
            if (mVar.f9616b.mo9681O() != 8) {
                return mVar.f9616b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a0, code lost:
        if (r1 != r7) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c6, code lost:
        if (r1 != r7) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10031a(p100p.C2889d r26) {
        /*
            r25 = this;
            r0 = r25
            p.f r1 = r0.f9622h
            boolean r1 = r1.f9589j
            if (r1 == 0) goto L_0x0409
            p.f r1 = r0.f9623i
            boolean r1 = r1.f9589j
            if (r1 != 0) goto L_0x0010
            goto L_0x0409
        L_0x0010:
            o.e r1 = r0.f9616b
            o.e r1 = r1.mo9669G()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof p094o.C2833f
            if (r3 == 0) goto L_0x0023
            o.f r1 = (p094o.C2833f) r1
            boolean r1 = r1.mo9749a1()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            p.f r3 = r0.f9623i
            int r3 = r3.f9586g
            p.f r4 = r0.f9622h
            int r4 = r4.f9586g
            int r3 = r3 - r4
            java.util.ArrayList<p.m> r4 = r0.f9569k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<p.m> r8 = r0.f9569k
            java.lang.Object r8 = r8.get(r5)
            p.m r8 = (p100p.C2901m) r8
            o.e r8 = r8.f9616b
            int r8 = r8.mo9681O()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = -1
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<p.m> r10 = r0.f9569k
            java.lang.Object r10 = r10.get(r9)
            p.m r10 = (p100p.C2901m) r10
            o.e r10 = r10.f9616b
            int r10 = r10.mo9681O()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            if (r9 >= r11) goto L_0x010b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0071:
            if (r13 >= r4) goto L_0x00fd
            java.util.ArrayList<p.m> r2 = r0.f9569k
            java.lang.Object r2 = r2.get(r13)
            p.m r2 = (p100p.C2901m) r2
            o.e r11 = r2.f9616b
            int r11 = r11.mo9681O()
            if (r11 != r7) goto L_0x0085
            goto L_0x00f6
        L_0x0085:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0090
            if (r13 < r5) goto L_0x0090
            p.f r11 = r2.f9622h
            int r11 = r11.f9585f
            int r14 = r14 + r11
        L_0x0090:
            p.g r11 = r2.f9619e
            int r7 = r11.f9586g
            o.e$b r10 = r2.f9618d
            o.e$b r12 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009c
            r10 = 1
            goto L_0x009d
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 == 0) goto L_0x00bf
            int r11 = r0.f9620f
            if (r11 != 0) goto L_0x00ae
            o.e r12 = r2.f9616b
            p.j r12 = r12.f9226e
            p.g r12 = r12.f9619e
            boolean r12 = r12.f9589j
            if (r12 != 0) goto L_0x00ae
            return
        L_0x00ae:
            r12 = 1
            if (r11 != r12) goto L_0x00bc
            o.e r11 = r2.f9616b
            p.l r11 = r11.f9228f
            p.g r11 = r11.f9619e
            boolean r11 = r11.f9589j
            if (r11 != 0) goto L_0x00bc
            return
        L_0x00bc:
            r19 = r7
            goto L_0x00d5
        L_0x00bf:
            r19 = r7
            r12 = 1
            int r7 = r2.f9615a
            if (r7 != r12) goto L_0x00cd
            if (r9 != 0) goto L_0x00cd
            int r7 = r11.f9601m
            int r15 = r15 + 1
            goto L_0x00d3
        L_0x00cd:
            boolean r7 = r11.f9589j
            if (r7 == 0) goto L_0x00d5
            r7 = r19
        L_0x00d3:
            r10 = 1
            goto L_0x00d7
        L_0x00d5:
            r7 = r19
        L_0x00d7:
            if (r10 != 0) goto L_0x00eb
            int r15 = r15 + 1
            o.e r7 = r2.f9616b
            float[] r7 = r7.f9251q0
            int r10 = r0.f9620f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ec
            float r17 = r17 + r7
            goto L_0x00ec
        L_0x00eb:
            int r14 = r14 + r7
        L_0x00ec:
            if (r13 >= r8) goto L_0x00f6
            if (r13 >= r6) goto L_0x00f6
            p.f r2 = r2.f9623i
            int r2 = r2.f9585f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f6:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0071
        L_0x00fd:
            if (r14 < r3) goto L_0x0108
            if (r15 != 0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0108:
            r2 = r16
            goto L_0x0110
        L_0x010b:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x0110:
            p.f r7 = r0.f9622h
            int r7 = r7.f9586g
            if (r1 == 0) goto L_0x011a
            p.f r7 = r0.f9623i
            int r7 = r7.f9586g
        L_0x011a:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x012b
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x012a
            int r7 = r7 + r10
            goto L_0x012b
        L_0x012a:
            int r7 = r7 - r10
        L_0x012b:
            if (r15 <= 0) goto L_0x0239
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x0137:
            if (r12 >= r4) goto L_0x01eb
            java.util.ArrayList<p.m> r9 = r0.f9569k
            java.lang.Object r9 = r9.get(r12)
            p.m r9 = (p100p.C2901m) r9
            r19 = r11
            o.e r11 = r9.f9616b
            int r11 = r11.mo9681O()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0151
            goto L_0x01d1
        L_0x0151:
            o.e$b r11 = r9.f9618d
            o.e$b r14 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01d1
            p.g r11 = r9.f9619e
            boolean r14 = r11.f9589j
            if (r14 != 0) goto L_0x01d1
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0175
            o.e r14 = r9.f9616b
            float[] r14 = r14.f9251q0
            r21 = r7
            int r7 = r0.f9620f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x0179
        L_0x0175:
            r21 = r7
            r7 = r19
        L_0x0179:
            int r14 = r0.f9620f
            if (r14 != 0) goto L_0x01a3
            o.e r14 = r9.f9616b
            r22 = r10
            int r10 = r14.f9248p
            int r14 = r14.f9246o
            r23 = r1
            int r1 = r9.f9615a
            r24 = r2
            r2 = 1
            if (r1 != r2) goto L_0x0195
            int r1 = r11.f9601m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x0196
        L_0x0195:
            r1 = r7
        L_0x0196:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01a0
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01a0:
            if (r1 == r7) goto L_0x01cb
            goto L_0x01c8
        L_0x01a3:
            r23 = r1
            r24 = r2
            r22 = r10
            o.e r1 = r9.f9616b
            int r2 = r1.f9254s
            int r1 = r1.f9252r
            int r10 = r9.f9615a
            r14 = 1
            if (r10 != r14) goto L_0x01bb
            int r10 = r11.f9601m
            int r10 = java.lang.Math.min(r7, r10)
            goto L_0x01bc
        L_0x01bb:
            r10 = r7
        L_0x01bc:
            int r1 = java.lang.Math.max(r1, r10)
            if (r2 <= 0) goto L_0x01c6
            int r1 = java.lang.Math.min(r2, r1)
        L_0x01c6:
            if (r1 == r7) goto L_0x01cb
        L_0x01c8:
            int r13 = r13 + 1
            r7 = r1
        L_0x01cb:
            p.g r1 = r9.f9619e
            r1.mo10049d(r7)
            goto L_0x01d9
        L_0x01d1:
            r23 = r1
            r24 = r2
            r21 = r7
            r22 = r10
        L_0x01d9:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r2 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0137
        L_0x01eb:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x022a
            int r15 = r15 - r13
            r1 = 0
            r2 = 0
        L_0x01f8:
            if (r1 >= r4) goto L_0x0228
            java.util.ArrayList<p.m> r7 = r0.f9569k
            java.lang.Object r7 = r7.get(r1)
            p.m r7 = (p100p.C2901m) r7
            o.e r9 = r7.f9616b
            int r9 = r9.mo9681O()
            r10 = 8
            if (r9 != r10) goto L_0x020d
            goto L_0x0225
        L_0x020d:
            if (r1 <= 0) goto L_0x0216
            if (r1 < r5) goto L_0x0216
            p.f r9 = r7.f9622h
            int r9 = r9.f9585f
            int r2 = r2 + r9
        L_0x0216:
            p.g r9 = r7.f9619e
            int r9 = r9.f9586g
            int r2 = r2 + r9
            if (r1 >= r8) goto L_0x0225
            if (r1 >= r6) goto L_0x0225
            p.f r7 = r7.f9623i
            int r7 = r7.f9585f
            int r7 = -r7
            int r2 = r2 + r7
        L_0x0225:
            int r1 = r1 + 1
            goto L_0x01f8
        L_0x0228:
            r14 = r2
            goto L_0x022c
        L_0x022a:
            r14 = r20
        L_0x022c:
            int r1 = r0.f9570l
            r2 = 2
            if (r1 != r2) goto L_0x0237
            if (r13 != 0) goto L_0x0237
            r1 = 0
            r0.f9570l = r1
            goto L_0x0243
        L_0x0237:
            r1 = 0
            goto L_0x0243
        L_0x0239:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            r1 = 0
            r2 = 2
        L_0x0243:
            if (r14 <= r3) goto L_0x0247
            r0.f9570l = r2
        L_0x0247:
            if (r24 <= 0) goto L_0x024f
            if (r15 != 0) goto L_0x024f
            if (r5 != r6) goto L_0x024f
            r0.f9570l = r2
        L_0x024f:
            int r2 = r0.f9570l
            r7 = 1
            r9 = r24
            if (r2 != r7) goto L_0x02e3
            if (r9 <= r7) goto L_0x025d
            int r3 = r3 - r14
            int r2 = r9 + -1
            int r3 = r3 / r2
            goto L_0x0264
        L_0x025d:
            if (r9 != r7) goto L_0x0263
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x0264
        L_0x0263:
            r3 = 0
        L_0x0264:
            if (r15 <= 0) goto L_0x0267
            r3 = 0
        L_0x0267:
            r7 = r21
            r2 = 0
        L_0x026a:
            if (r2 >= r4) goto L_0x0409
            if (r23 == 0) goto L_0x0273
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x0274
        L_0x0273:
            r1 = r2
        L_0x0274:
            java.util.ArrayList<p.m> r9 = r0.f9569k
            java.lang.Object r1 = r9.get(r1)
            p.m r1 = (p100p.C2901m) r1
            o.e r9 = r1.f9616b
            int r9 = r9.mo9681O()
            r10 = 8
            if (r9 != r10) goto L_0x0291
            p.f r9 = r1.f9622h
            r9.mo10049d(r7)
            p.f r1 = r1.f9623i
            r1.mo10049d(r7)
            goto L_0x02e0
        L_0x0291:
            if (r2 <= 0) goto L_0x0298
            if (r23 == 0) goto L_0x0297
            int r7 = r7 - r3
            goto L_0x0298
        L_0x0297:
            int r7 = r7 + r3
        L_0x0298:
            if (r2 <= 0) goto L_0x02a5
            if (r2 < r5) goto L_0x02a5
            p.f r9 = r1.f9622h
            int r9 = r9.f9585f
            if (r23 == 0) goto L_0x02a4
            int r7 = r7 - r9
            goto L_0x02a5
        L_0x02a4:
            int r7 = r7 + r9
        L_0x02a5:
            if (r23 == 0) goto L_0x02aa
            p.f r9 = r1.f9623i
            goto L_0x02ac
        L_0x02aa:
            p.f r9 = r1.f9622h
        L_0x02ac:
            r9.mo10049d(r7)
            p.g r9 = r1.f9619e
            int r10 = r9.f9586g
            o.e$b r11 = r1.f9618d
            o.e$b r12 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02c0
            int r11 = r1.f9615a
            r12 = 1
            if (r11 != r12) goto L_0x02c0
            int r10 = r9.f9601m
        L_0x02c0:
            if (r23 == 0) goto L_0x02c4
            int r7 = r7 - r10
            goto L_0x02c5
        L_0x02c4:
            int r7 = r7 + r10
        L_0x02c5:
            if (r23 == 0) goto L_0x02ca
            p.f r9 = r1.f9622h
            goto L_0x02cc
        L_0x02ca:
            p.f r9 = r1.f9623i
        L_0x02cc:
            r9.mo10049d(r7)
            r9 = 1
            r1.f9621g = r9
            if (r2 >= r8) goto L_0x02e0
            if (r2 >= r6) goto L_0x02e0
            p.f r1 = r1.f9623i
            int r1 = r1.f9585f
            int r1 = -r1
            if (r23 == 0) goto L_0x02df
            int r7 = r7 - r1
            goto L_0x02e0
        L_0x02df:
            int r7 = r7 + r1
        L_0x02e0:
            int r2 = r2 + 1
            goto L_0x026a
        L_0x02e3:
            if (r2 != 0) goto L_0x0368
            int r3 = r3 - r14
            r2 = 1
            int r7 = r9 + 1
            int r3 = r3 / r7
            if (r15 <= 0) goto L_0x02ed
            r3 = 0
        L_0x02ed:
            r7 = r21
            r2 = 0
        L_0x02f0:
            if (r2 >= r4) goto L_0x0409
            if (r23 == 0) goto L_0x02f9
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x02fa
        L_0x02f9:
            r1 = r2
        L_0x02fa:
            java.util.ArrayList<p.m> r9 = r0.f9569k
            java.lang.Object r1 = r9.get(r1)
            p.m r1 = (p100p.C2901m) r1
            o.e r9 = r1.f9616b
            int r9 = r9.mo9681O()
            r10 = 8
            if (r9 != r10) goto L_0x0317
            p.f r9 = r1.f9622h
            r9.mo10049d(r7)
            p.f r1 = r1.f9623i
            r1.mo10049d(r7)
            goto L_0x0365
        L_0x0317:
            if (r23 == 0) goto L_0x031b
            int r7 = r7 - r3
            goto L_0x031c
        L_0x031b:
            int r7 = r7 + r3
        L_0x031c:
            if (r2 <= 0) goto L_0x0329
            if (r2 < r5) goto L_0x0329
            p.f r9 = r1.f9622h
            int r9 = r9.f9585f
            if (r23 == 0) goto L_0x0328
            int r7 = r7 - r9
            goto L_0x0329
        L_0x0328:
            int r7 = r7 + r9
        L_0x0329:
            if (r23 == 0) goto L_0x032e
            p.f r9 = r1.f9623i
            goto L_0x0330
        L_0x032e:
            p.f r9 = r1.f9622h
        L_0x0330:
            r9.mo10049d(r7)
            p.g r9 = r1.f9619e
            int r10 = r9.f9586g
            o.e$b r11 = r1.f9618d
            o.e$b r12 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0348
            int r11 = r1.f9615a
            r12 = 1
            if (r11 != r12) goto L_0x0348
            int r9 = r9.f9601m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0348:
            if (r23 == 0) goto L_0x034c
            int r7 = r7 - r10
            goto L_0x034d
        L_0x034c:
            int r7 = r7 + r10
        L_0x034d:
            if (r23 == 0) goto L_0x0352
            p.f r9 = r1.f9622h
            goto L_0x0354
        L_0x0352:
            p.f r9 = r1.f9623i
        L_0x0354:
            r9.mo10049d(r7)
            if (r2 >= r8) goto L_0x0365
            if (r2 >= r6) goto L_0x0365
            p.f r1 = r1.f9623i
            int r1 = r1.f9585f
            int r1 = -r1
            if (r23 == 0) goto L_0x0364
            int r7 = r7 - r1
            goto L_0x0365
        L_0x0364:
            int r7 = r7 + r1
        L_0x0365:
            int r2 = r2 + 1
            goto L_0x02f0
        L_0x0368:
            r7 = 2
            if (r2 != r7) goto L_0x0409
            int r2 = r0.f9620f
            if (r2 != 0) goto L_0x0376
            o.e r2 = r0.f9616b
            float r2 = r2.mo9729w()
            goto L_0x037c
        L_0x0376:
            o.e r2 = r0.f9616b
            float r2 = r2.mo9677K()
        L_0x037c:
            if (r23 == 0) goto L_0x0382
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = r7 - r2
        L_0x0382:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x038e
            if (r15 <= 0) goto L_0x038f
        L_0x038e:
            r2 = 0
        L_0x038f:
            if (r23 == 0) goto L_0x0394
            int r7 = r21 - r2
            goto L_0x0396
        L_0x0394:
            int r7 = r21 + r2
        L_0x0396:
            r2 = 0
        L_0x0397:
            if (r2 >= r4) goto L_0x0409
            if (r23 == 0) goto L_0x03a0
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x03a1
        L_0x03a0:
            r1 = r2
        L_0x03a1:
            java.util.ArrayList<p.m> r3 = r0.f9569k
            java.lang.Object r1 = r3.get(r1)
            p.m r1 = (p100p.C2901m) r1
            o.e r3 = r1.f9616b
            int r3 = r3.mo9681O()
            r9 = 8
            if (r3 != r9) goto L_0x03bf
            p.f r3 = r1.f9622h
            r3.mo10049d(r7)
            p.f r1 = r1.f9623i
            r1.mo10049d(r7)
            r12 = 1
            goto L_0x0406
        L_0x03bf:
            if (r2 <= 0) goto L_0x03cc
            if (r2 < r5) goto L_0x03cc
            p.f r3 = r1.f9622h
            int r3 = r3.f9585f
            if (r23 == 0) goto L_0x03cb
            int r7 = r7 - r3
            goto L_0x03cc
        L_0x03cb:
            int r7 = r7 + r3
        L_0x03cc:
            if (r23 == 0) goto L_0x03d1
            p.f r3 = r1.f9623i
            goto L_0x03d3
        L_0x03d1:
            p.f r3 = r1.f9622h
        L_0x03d3:
            r3.mo10049d(r7)
            p.g r3 = r1.f9619e
            int r10 = r3.f9586g
            o.e$b r11 = r1.f9618d
            o.e$b r12 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03e8
            int r11 = r1.f9615a
            r12 = 1
            if (r11 != r12) goto L_0x03e9
            int r10 = r3.f9601m
            goto L_0x03e9
        L_0x03e8:
            r12 = 1
        L_0x03e9:
            if (r23 == 0) goto L_0x03ed
            int r7 = r7 - r10
            goto L_0x03ee
        L_0x03ed:
            int r7 = r7 + r10
        L_0x03ee:
            if (r23 == 0) goto L_0x03f3
            p.f r3 = r1.f9622h
            goto L_0x03f5
        L_0x03f3:
            p.f r3 = r1.f9623i
        L_0x03f5:
            r3.mo10049d(r7)
            if (r2 >= r8) goto L_0x0406
            if (r2 >= r6) goto L_0x0406
            p.f r1 = r1.f9623i
            int r1 = r1.f9585f
            int r1 = -r1
            if (r23 == 0) goto L_0x0405
            int r7 = r7 - r1
            goto L_0x0406
        L_0x0405:
            int r7 = r7 + r1
        L_0x0406:
            int r2 = r2 + 1
            goto L_0x0397
        L_0x0409:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p100p.C2888c.mo10031a(p.d):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10032d() {
        /*
            r5 = this;
            java.util.ArrayList<p.m> r0 = r5.f9569k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            p.m r1 = (p100p.C2901m) r1
            r1.mo10032d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<p.m> r0 = r5.f9569k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<p.m> r2 = r5.f9569k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            p.m r2 = (p100p.C2901m) r2
            o.e r2 = r2.f9616b
            java.util.ArrayList<p.m> r4 = r5.f9569k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            p.m r0 = (p100p.C2901m) r0
            o.e r0 = r0.f9616b
            int r4 = r5.f9620f
            if (r4 != 0) goto L_0x0070
            o.d r1 = r2.f9193B
            o.d r0 = r0.f9195D
            p.f r2 = r5.mo10061i(r1, r3)
            int r1 = r1.mo9644c()
            o.e r4 = r5.m13129r()
            if (r4 == 0) goto L_0x0052
            o.d r1 = r4.f9193B
            int r1 = r1.mo9644c()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            p.f r4 = r5.f9622h
            r5.mo10057b(r4, r2, r1)
        L_0x0059:
            p.f r1 = r5.mo10061i(r0, r3)
            int r0 = r0.mo9644c()
            o.e r2 = r5.m13130s()
            if (r2 == 0) goto L_0x006d
            o.d r0 = r2.f9195D
            int r0 = r0.mo9644c()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            o.d r2 = r2.f9194C
            o.d r0 = r0.f9196E
            p.f r3 = r5.mo10061i(r2, r1)
            int r2 = r2.mo9644c()
            o.e r4 = r5.m13129r()
            if (r4 == 0) goto L_0x0088
            o.d r2 = r4.f9194C
            int r2 = r2.mo9644c()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            p.f r4 = r5.f9622h
            r5.mo10057b(r4, r3, r2)
        L_0x008f:
            p.f r1 = r5.mo10061i(r0, r1)
            int r0 = r0.mo9644c()
            o.e r2 = r5.m13130s()
            if (r2 == 0) goto L_0x00a3
            o.d r0 = r2.f9196E
            int r0 = r0.mo9644c()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            p.f r2 = r5.f9623i
            int r0 = -r0
            r5.mo10057b(r2, r1, r0)
        L_0x00ab:
            p.f r0 = r5.f9622h
            r0.f9580a = r5
            p.f r0 = r5.f9623i
            r0.f9580a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p100p.C2888c.mo10032d():void");
    }

    /* renamed from: e */
    public void mo10033e() {
        for (int i = 0; i < this.f9569k.size(); i++) {
            this.f9569k.get(i).mo10033e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10034f() {
        this.f9617c = null;
        Iterator<C2901m> it = this.f9569k.iterator();
        while (it.hasNext()) {
            it.next().mo10034f();
        }
    }

    /* renamed from: j */
    public long mo10035j() {
        int size = this.f9569k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C2901m mVar = this.f9569k.get(i);
            j = j + ((long) mVar.f9622h.f9585f) + mVar.mo10035j() + ((long) mVar.f9623i.f9585f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10036m() {
        int size = this.f9569k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f9569k.get(i).mo10036m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f9620f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator<C2901m> it = this.f9569k.iterator();
        while (it.hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
