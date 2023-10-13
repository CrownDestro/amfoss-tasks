package p094o;

import p088n.C2658d;

/* renamed from: o.b */
class C2825b {
    /* renamed from: a */
    static void m12673a(C2833f fVar, C2658d dVar, int i) {
        C2826c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            int i4 = fVar.f9278G0;
            cVarArr = fVar.f9281J0;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            i2 = fVar.f9279H0;
            cVarArr = fVar.f9280I0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C2826c cVar = cVarArr[i5];
            cVar.mo9641a();
            m12674b(fVar, dVar, i, i3, cVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: n.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: n.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: n.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: n.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: n.i} */
    /* JADX WARNING: type inference failed for: r5v10, types: [n.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r8 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r8 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04c3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x04fd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0393 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:319:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m12674b(p094o.C2833f r37, p088n.C2658d r38, int r39, int r40, p094o.C2826c r41) {
        /*
            r0 = r37
            r9 = r38
            r1 = r41
            o.e r10 = r1.f9151a
            o.e r11 = r1.f9153c
            o.e r12 = r1.f9152b
            o.e r13 = r1.f9154d
            o.e r2 = r1.f9155e
            float r3 = r1.f9161k
            o.e$b[] r4 = r0.f9204M
            r4 = r4[r39]
            o.e$b r5 = p094o.C2830e.C2832b.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r39 != 0) goto L_0x0030
            int r8 = r2.f9243m0
            if (r8 != 0) goto L_0x0027
            r14 = 1
            goto L_0x0028
        L_0x0027:
            r14 = 0
        L_0x0028:
            if (r8 != r7) goto L_0x002c
            r15 = 1
            goto L_0x002d
        L_0x002c:
            r15 = 0
        L_0x002d:
            if (r8 != r5) goto L_0x0040
            goto L_0x003e
        L_0x0030:
            int r8 = r2.f9245n0
            if (r8 != 0) goto L_0x0036
            r14 = 1
            goto L_0x0037
        L_0x0036:
            r14 = 0
        L_0x0037:
            if (r8 != r7) goto L_0x003b
            r15 = 1
            goto L_0x003c
        L_0x003b:
            r15 = 0
        L_0x003c:
            if (r8 != r5) goto L_0x0040
        L_0x003e:
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            r7 = r10
            r8 = 0
        L_0x0043:
            r21 = 0
            if (r8 != 0) goto L_0x0123
            o.d[] r6 = r7.f9201J
            r6 = r6[r40]
            if (r5 == 0) goto L_0x0050
            r19 = 1
            goto L_0x0052
        L_0x0050:
            r19 = 4
        L_0x0052:
            int r22 = r6.mo9644c()
            r23 = r3
            o.e$b[] r3 = r7.f9204M
            r3 = r3[r39]
            r24 = r8
            o.e$b r8 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x006c
            int[] r3 = r7.f9244n
            r3 = r3[r39]
            if (r3 != 0) goto L_0x006c
            r25 = r15
            r3 = 1
            goto L_0x006f
        L_0x006c:
            r25 = r15
            r3 = 0
        L_0x006f:
            o.d r15 = r6.f9176d
            if (r15 == 0) goto L_0x007b
            if (r7 == r10) goto L_0x007b
            int r15 = r15.mo9644c()
            int r22 = r22 + r15
        L_0x007b:
            r15 = r22
            if (r5 == 0) goto L_0x0088
            if (r7 == r10) goto L_0x0088
            if (r7 == r12) goto L_0x0088
            r22 = r14
            r19 = 5
            goto L_0x008a
        L_0x0088:
            r22 = r14
        L_0x008a:
            o.d r14 = r6.f9176d
            r26 = r2
            if (r14 == 0) goto L_0x00ba
            if (r7 != r12) goto L_0x009d
            n.i r2 = r6.f9179g
            n.i r14 = r14.f9179g
            r27 = r10
            r10 = 6
            r9.mo9385h(r2, r14, r15, r10)
            goto L_0x00a8
        L_0x009d:
            r27 = r10
            n.i r2 = r6.f9179g
            n.i r10 = r14.f9179g
            r14 = 8
            r9.mo9385h(r2, r10, r15, r14)
        L_0x00a8:
            if (r3 == 0) goto L_0x00ae
            if (r5 != 0) goto L_0x00ae
            r2 = 5
            goto L_0x00b0
        L_0x00ae:
            r2 = r19
        L_0x00b0:
            n.i r3 = r6.f9179g
            o.d r6 = r6.f9176d
            n.i r6 = r6.f9179g
            r9.mo9382e(r3, r6, r15, r2)
            goto L_0x00bc
        L_0x00ba:
            r27 = r10
        L_0x00bc:
            if (r4 == 0) goto L_0x00f0
            int r2 = r7.mo9681O()
            r3 = 8
            if (r2 == r3) goto L_0x00de
            o.e$b[] r2 = r7.f9204M
            r2 = r2[r39]
            if (r2 != r8) goto L_0x00de
            o.d[] r2 = r7.f9201J
            int r3 = r40 + 1
            r3 = r2[r3]
            n.i r3 = r3.f9179g
            r2 = r2[r40]
            n.i r2 = r2.f9179g
            r6 = 5
            r8 = 0
            r9.mo9385h(r3, r2, r8, r6)
            goto L_0x00df
        L_0x00de:
            r8 = 0
        L_0x00df:
            o.d[] r2 = r7.f9201J
            r2 = r2[r40]
            n.i r2 = r2.f9179g
            o.d[] r3 = r0.f9201J
            r3 = r3[r40]
            n.i r3 = r3.f9179g
            r6 = 8
            r9.mo9385h(r2, r3, r8, r6)
        L_0x00f0:
            o.d[] r2 = r7.f9201J
            int r3 = r40 + 1
            r2 = r2[r3]
            o.d r2 = r2.f9176d
            if (r2 == 0) goto L_0x010f
            o.e r2 = r2.f9174b
            o.d[] r3 = r2.f9201J
            r6 = r3[r40]
            o.d r6 = r6.f9176d
            if (r6 == 0) goto L_0x010f
            r3 = r3[r40]
            o.d r3 = r3.f9176d
            o.e r3 = r3.f9174b
            if (r3 == r7) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r21 = r2
        L_0x010f:
            if (r21 == 0) goto L_0x0116
            r7 = r21
            r8 = r24
            goto L_0x0117
        L_0x0116:
            r8 = 1
        L_0x0117:
            r14 = r22
            r3 = r23
            r15 = r25
            r2 = r26
            r10 = r27
            goto L_0x0043
        L_0x0123:
            r26 = r2
            r23 = r3
            r27 = r10
            r22 = r14
            r25 = r15
            if (r13 == 0) goto L_0x0190
            o.d[] r2 = r11.f9201J
            int r3 = r40 + 1
            r2 = r2[r3]
            o.d r2 = r2.f9176d
            if (r2 == 0) goto L_0x0190
            o.d[] r2 = r13.f9201J
            r2 = r2[r3]
            o.e$b[] r6 = r13.f9204M
            r6 = r6[r39]
            o.e$b r7 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x014d
            int[] r6 = r13.f9244n
            r6 = r6[r39]
            if (r6 != 0) goto L_0x014d
            r6 = 1
            goto L_0x014e
        L_0x014d:
            r6 = 0
        L_0x014e:
            if (r6 == 0) goto L_0x0166
            if (r5 != 0) goto L_0x0166
            o.d r6 = r2.f9176d
            o.e r7 = r6.f9174b
            if (r7 != r0) goto L_0x0166
            n.i r7 = r2.f9179g
            n.i r6 = r6.f9179g
            int r8 = r2.mo9644c()
            int r8 = -r8
            r10 = 5
            r9.mo9382e(r7, r6, r8, r10)
            goto L_0x017c
        L_0x0166:
            r10 = 5
            if (r5 == 0) goto L_0x017c
            o.d r6 = r2.f9176d
            o.e r7 = r6.f9174b
            if (r7 != r0) goto L_0x017c
            n.i r7 = r2.f9179g
            n.i r6 = r6.f9179g
            int r8 = r2.mo9644c()
            int r8 = -r8
            r14 = 4
            r9.mo9382e(r7, r6, r8, r14)
        L_0x017c:
            n.i r6 = r2.f9179g
            o.d[] r7 = r11.f9201J
            r3 = r7[r3]
            o.d r3 = r3.f9176d
            n.i r3 = r3.f9179g
            int r2 = r2.mo9644c()
            int r2 = -r2
            r7 = 6
            r9.mo9387j(r6, r3, r2, r7)
            goto L_0x0191
        L_0x0190:
            r10 = 5
        L_0x0191:
            if (r4 == 0) goto L_0x01ac
            o.d[] r0 = r0.f9201J
            int r2 = r40 + 1
            r0 = r0[r2]
            n.i r0 = r0.f9179g
            o.d[] r3 = r11.f9201J
            r4 = r3[r2]
            n.i r4 = r4.f9179g
            r2 = r3[r2]
            int r2 = r2.mo9644c()
            r3 = 8
            r9.mo9385h(r0, r4, r2, r3)
        L_0x01ac:
            java.util.ArrayList<o.e> r0 = r1.f9158h
            if (r0 == 0) goto L_0x0252
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0252
            boolean r4 = r1.f9168r
            if (r4 == 0) goto L_0x01c3
            boolean r4 = r1.f9170t
            if (r4 != 0) goto L_0x01c3
            int r4 = r1.f9160j
            float r4 = (float) r4
            goto L_0x01c5
        L_0x01c3:
            r4 = r23
        L_0x01c5:
            r6 = 0
            r7 = r21
            r8 = 0
            r29 = 0
        L_0x01cb:
            if (r8 >= r2) goto L_0x0252
            java.lang.Object r14 = r0.get(r8)
            o.e r14 = (p094o.C2830e) r14
            float[] r15 = r14.f9251q0
            r15 = r15[r39]
            int r16 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x01f6
            boolean r15 = r1.f9170t
            if (r15 == 0) goto L_0x01f2
            o.d[] r14 = r14.f9201J
            int r15 = r40 + 1
            r15 = r14[r15]
            n.i r15 = r15.f9179g
            r14 = r14[r40]
            n.i r14 = r14.f9179g
            r3 = 0
            r10 = 4
            r9.mo9382e(r15, r14, r3, r10)
            r6 = 0
            goto L_0x020d
        L_0x01f2:
            r10 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01f7
        L_0x01f6:
            r10 = 4
        L_0x01f7:
            int r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0210
            o.d[] r3 = r14.f9201J
            int r14 = r40 + 1
            r14 = r3[r14]
            n.i r14 = r14.f9179g
            r3 = r3[r40]
            n.i r3 = r3.f9179g
            r6 = 0
            r15 = 8
            r9.mo9382e(r14, r3, r6, r15)
        L_0x020d:
            r17 = r0
            goto L_0x0249
        L_0x0210:
            r6 = 0
            if (r7 == 0) goto L_0x0244
            o.d[] r3 = r7.f9201J
            r7 = r3[r40]
            n.i r7 = r7.f9179g
            int r17 = r40 + 1
            r3 = r3[r17]
            n.i r3 = r3.f9179g
            o.d[] r6 = r14.f9201J
            r10 = r6[r40]
            n.i r10 = r10.f9179g
            r6 = r6[r17]
            n.i r6 = r6.f9179g
            r17 = r0
            n.b r0 = r38.mo9393r()
            r28 = r0
            r30 = r4
            r31 = r15
            r32 = r7
            r33 = r3
            r34 = r10
            r35 = r6
            r28.mo9363l(r29, r30, r31, r32, r33, r34, r35)
            r9.mo9381d(r0)
            goto L_0x0246
        L_0x0244:
            r17 = r0
        L_0x0246:
            r7 = r14
            r29 = r15
        L_0x0249:
            int r8 = r8 + 1
            r0 = r17
            r3 = 1
            r6 = 0
            r10 = 5
            goto L_0x01cb
        L_0x0252:
            if (r12 == 0) goto L_0x02a7
            if (r12 == r13) goto L_0x0258
            if (r5 == 0) goto L_0x02a7
        L_0x0258:
            r10 = r27
            o.d[] r0 = r10.f9201J
            r0 = r0[r40]
            o.d[] r1 = r11.f9201J
            int r2 = r40 + 1
            r1 = r1[r2]
            o.d r0 = r0.f9176d
            if (r0 == 0) goto L_0x026c
            n.i r0 = r0.f9179g
            r3 = r0
            goto L_0x026e
        L_0x026c:
            r3 = r21
        L_0x026e:
            o.d r0 = r1.f9176d
            if (r0 == 0) goto L_0x0276
            n.i r0 = r0.f9179g
            r5 = r0
            goto L_0x0278
        L_0x0276:
            r5 = r21
        L_0x0278:
            o.d[] r0 = r12.f9201J
            r0 = r0[r40]
            o.d[] r1 = r13.f9201J
            r1 = r1[r2]
            if (r3 == 0) goto L_0x04c1
            if (r5 == 0) goto L_0x04c1
            r2 = r26
            if (r39 != 0) goto L_0x028b
            float r2 = r2.f9221b0
            goto L_0x028d
        L_0x028b:
            float r2 = r2.f9223c0
        L_0x028d:
            r4 = r2
            int r6 = r0.mo9644c()
            int r7 = r1.mo9644c()
            n.i r2 = r0.f9179g
            n.i r8 = r1.f9179g
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo9380c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04c1
        L_0x02a7:
            r10 = r27
            if (r22 == 0) goto L_0x0397
            if (r12 == 0) goto L_0x0397
            int r0 = r1.f9160j
            if (r0 <= 0) goto L_0x02b8
            int r1 = r1.f9159i
            if (r1 != r0) goto L_0x02b8
            r16 = 1
            goto L_0x02ba
        L_0x02b8:
            r16 = 0
        L_0x02ba:
            r14 = r12
            r15 = r14
        L_0x02bc:
            if (r14 == 0) goto L_0x04c1
            o.e[] r0 = r14.f9255s0
            r0 = r0[r39]
            r8 = r0
        L_0x02c3:
            if (r8 == 0) goto L_0x02d2
            int r0 = r8.mo9681O()
            r6 = 8
            if (r0 != r6) goto L_0x02d4
            o.e[] r0 = r8.f9255s0
            r8 = r0[r39]
            goto L_0x02c3
        L_0x02d2:
            r6 = 8
        L_0x02d4:
            if (r8 != 0) goto L_0x02dd
            if (r14 != r13) goto L_0x02d9
            goto L_0x02dd
        L_0x02d9:
            r17 = r8
            goto L_0x038a
        L_0x02dd:
            o.d[] r0 = r14.f9201J
            r0 = r0[r40]
            n.i r1 = r0.f9179g
            o.d r2 = r0.f9176d
            if (r2 == 0) goto L_0x02ea
            n.i r2 = r2.f9179g
            goto L_0x02ec
        L_0x02ea:
            r2 = r21
        L_0x02ec:
            if (r15 == r14) goto L_0x02f7
            o.d[] r2 = r15.f9201J
            int r3 = r40 + 1
            r2 = r2[r3]
        L_0x02f4:
            n.i r2 = r2.f9179g
            goto L_0x030a
        L_0x02f7:
            if (r14 != r12) goto L_0x030a
            if (r15 != r14) goto L_0x030a
            o.d[] r2 = r10.f9201J
            r3 = r2[r40]
            o.d r3 = r3.f9176d
            if (r3 == 0) goto L_0x0308
            r2 = r2[r40]
            o.d r2 = r2.f9176d
            goto L_0x02f4
        L_0x0308:
            r2 = r21
        L_0x030a:
            int r0 = r0.mo9644c()
            o.d[] r3 = r14.f9201J
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.mo9644c()
            if (r8 == 0) goto L_0x032c
            o.d[] r5 = r8.f9201J
            r5 = r5[r40]
            n.i r7 = r5.f9179g
            o.d[] r6 = r14.f9201J
            r6 = r6[r4]
            n.i r6 = r6.f9179g
            r36 = r7
            r7 = r6
            r6 = r36
            goto L_0x033f
        L_0x032c:
            o.d[] r5 = r11.f9201J
            r5 = r5[r4]
            o.d r5 = r5.f9176d
            if (r5 == 0) goto L_0x0337
            n.i r6 = r5.f9179g
            goto L_0x0339
        L_0x0337:
            r6 = r21
        L_0x0339:
            o.d[] r7 = r14.f9201J
            r7 = r7[r4]
            n.i r7 = r7.f9179g
        L_0x033f:
            if (r5 == 0) goto L_0x0346
            int r5 = r5.mo9644c()
            int r3 = r3 + r5
        L_0x0346:
            if (r15 == 0) goto L_0x0351
            o.d[] r5 = r15.f9201J
            r5 = r5[r4]
            int r5 = r5.mo9644c()
            int r0 = r0 + r5
        L_0x0351:
            if (r1 == 0) goto L_0x02d9
            if (r2 == 0) goto L_0x02d9
            if (r6 == 0) goto L_0x02d9
            if (r7 == 0) goto L_0x02d9
            if (r14 != r12) goto L_0x0363
            o.d[] r0 = r12.f9201J
            r0 = r0[r40]
            int r0 = r0.mo9644c()
        L_0x0363:
            r5 = r0
            if (r14 != r13) goto L_0x0371
            o.d[] r0 = r13.f9201J
            r0 = r0[r4]
            int r0 = r0.mo9644c()
            r17 = r0
            goto L_0x0373
        L_0x0371:
            r17 = r3
        L_0x0373:
            if (r16 == 0) goto L_0x0378
            r18 = 8
            goto L_0x037a
        L_0x0378:
            r18 = 5
        L_0x037a:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r18
            r0.mo9380c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x038a:
            int r0 = r14.mo9681O()
            r8 = 8
            if (r0 == r8) goto L_0x0393
            r15 = r14
        L_0x0393:
            r14 = r17
            goto L_0x02bc
        L_0x0397:
            r8 = 8
            if (r25 == 0) goto L_0x04c1
            if (r12 == 0) goto L_0x04c1
            int r0 = r1.f9160j
            if (r0 <= 0) goto L_0x03a8
            int r1 = r1.f9159i
            if (r1 != r0) goto L_0x03a8
            r16 = 1
            goto L_0x03aa
        L_0x03a8:
            r16 = 0
        L_0x03aa:
            r14 = r12
            r15 = r14
        L_0x03ac:
            if (r14 == 0) goto L_0x0463
            o.e[] r0 = r14.f9255s0
            r0 = r0[r39]
        L_0x03b2:
            if (r0 == 0) goto L_0x03bf
            int r1 = r0.mo9681O()
            if (r1 != r8) goto L_0x03bf
            o.e[] r0 = r0.f9255s0
            r0 = r0[r39]
            goto L_0x03b2
        L_0x03bf:
            if (r14 == r12) goto L_0x044e
            if (r14 == r13) goto L_0x044e
            if (r0 == 0) goto L_0x044e
            if (r0 != r13) goto L_0x03ca
            r7 = r21
            goto L_0x03cb
        L_0x03ca:
            r7 = r0
        L_0x03cb:
            o.d[] r0 = r14.f9201J
            r0 = r0[r40]
            n.i r1 = r0.f9179g
            o.d r2 = r0.f9176d
            if (r2 == 0) goto L_0x03d7
            n.i r2 = r2.f9179g
        L_0x03d7:
            o.d[] r2 = r15.f9201J
            int r3 = r40 + 1
            r2 = r2[r3]
            n.i r2 = r2.f9179g
            int r0 = r0.mo9644c()
            o.d[] r4 = r14.f9201J
            r4 = r4[r3]
            int r4 = r4.mo9644c()
            if (r7 == 0) goto L_0x03fb
            o.d[] r5 = r7.f9201J
            r5 = r5[r40]
            n.i r6 = r5.f9179g
            o.d r8 = r5.f9176d
            if (r8 == 0) goto L_0x03f8
            goto L_0x040a
        L_0x03f8:
            r8 = r21
            goto L_0x040c
        L_0x03fb:
            o.d[] r5 = r13.f9201J
            r5 = r5[r40]
            if (r5 == 0) goto L_0x0404
            n.i r6 = r5.f9179g
            goto L_0x0406
        L_0x0404:
            r6 = r21
        L_0x0406:
            o.d[] r8 = r14.f9201J
            r8 = r8[r3]
        L_0x040a:
            n.i r8 = r8.f9179g
        L_0x040c:
            if (r5 == 0) goto L_0x0413
            int r5 = r5.mo9644c()
            int r4 = r4 + r5
        L_0x0413:
            r17 = r4
            o.d[] r4 = r15.f9201J
            r3 = r4[r3]
            int r3 = r3.mo9644c()
            int r3 = r3 + r0
            if (r16 == 0) goto L_0x0423
            r18 = 8
            goto L_0x0425
        L_0x0423:
            r18 = 4
        L_0x0425:
            if (r1 == 0) goto L_0x0443
            if (r2 == 0) goto L_0x0443
            if (r6 == 0) goto L_0x0443
            if (r8 == 0) goto L_0x0443
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r19 = 4
            r6 = r8
            r20 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r18
            r0.mo9380c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x044b
        L_0x0443:
            r20 = r7
            r17 = r15
            r15 = 8
            r19 = 4
        L_0x044b:
            r0 = r20
            goto L_0x0454
        L_0x044e:
            r17 = r15
            r15 = 8
            r19 = 4
        L_0x0454:
            int r1 = r14.mo9681O()
            if (r1 == r15) goto L_0x045b
            goto L_0x045d
        L_0x045b:
            r14 = r17
        L_0x045d:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x03ac
        L_0x0463:
            o.d[] r0 = r12.f9201J
            r0 = r0[r40]
            o.d[] r1 = r10.f9201J
            r1 = r1[r40]
            o.d r1 = r1.f9176d
            o.d[] r2 = r13.f9201J
            int r3 = r40 + 1
            r10 = r2[r3]
            o.d[] r2 = r11.f9201J
            r2 = r2[r3]
            o.d r14 = r2.f9176d
            if (r1 == 0) goto L_0x04b0
            if (r12 == r13) goto L_0x048a
            n.i r2 = r0.f9179g
            n.i r1 = r1.f9179g
            int r0 = r0.mo9644c()
            r15 = 5
            r9.mo9382e(r2, r1, r0, r15)
            goto L_0x04b1
        L_0x048a:
            r15 = 5
            if (r14 == 0) goto L_0x04b1
            n.i r2 = r0.f9179g
            n.i r3 = r1.f9179g
            int r4 = r0.mo9644c()
            r5 = 1056964608(0x3f000000, float:0.5)
            n.i r6 = r10.f9179g
            n.i r7 = r14.f9179g
            int r8 = r10.mo9644c()
            r16 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.mo9380c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04b1
        L_0x04b0:
            r15 = 5
        L_0x04b1:
            if (r14 == 0) goto L_0x04c1
            if (r12 == r13) goto L_0x04c1
            n.i r0 = r10.f9179g
            n.i r1 = r14.f9179g
            int r2 = r10.mo9644c()
            int r2 = -r2
            r9.mo9382e(r0, r1, r2, r15)
        L_0x04c1:
            if (r22 != 0) goto L_0x04c5
            if (r25 == 0) goto L_0x051d
        L_0x04c5:
            if (r12 == 0) goto L_0x051d
            if (r12 == r13) goto L_0x051d
            o.d[] r0 = r12.f9201J
            r1 = r0[r40]
            o.d[] r2 = r13.f9201J
            int r3 = r40 + 1
            r2 = r2[r3]
            o.d r4 = r1.f9176d
            if (r4 == 0) goto L_0x04da
            n.i r4 = r4.f9179g
            goto L_0x04dc
        L_0x04da:
            r4 = r21
        L_0x04dc:
            o.d r5 = r2.f9176d
            if (r5 == 0) goto L_0x04e3
            n.i r5 = r5.f9179g
            goto L_0x04e5
        L_0x04e3:
            r5 = r21
        L_0x04e5:
            if (r11 == r13) goto L_0x04f5
            o.d[] r5 = r11.f9201J
            r5 = r5[r3]
            o.d r5 = r5.f9176d
            if (r5 == 0) goto L_0x04f3
            n.i r5 = r5.f9179g
            r21 = r5
        L_0x04f3:
            r5 = r21
        L_0x04f5:
            if (r12 != r13) goto L_0x04fb
            r1 = r0[r40]
            r2 = r0[r3]
        L_0x04fb:
            if (r4 == 0) goto L_0x051d
            if (r5 == 0) goto L_0x051d
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.mo9644c()
            o.d[] r0 = r13.f9201J
            r0 = r0[r3]
            int r8 = r0.mo9644c()
            n.i r1 = r1.f9179g
            n.i r10 = r2.f9179g
            r11 = 5
            r0 = r38
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.mo9380c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x051d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p094o.C2825b.m12674b(o.f, n.d, int, int, o.c):void");
    }
}
