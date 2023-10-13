package p069j4;

import p041f3.C1924k;
import p062i4.C2099b;
import p062i4.C2111f;
import p062i4.C2126s;
import p062i4.C2132w;

/* renamed from: j4.a */
public final class C2332a {

    /* renamed from: a */
    private static final byte[] f8052a = C2099b.m9629a("0123456789abcdef");

    /* renamed from: a */
    public static final byte[] m10824a() {
        return f8052a;
    }

    /* renamed from: b */
    public static final boolean m10825b(C2132w wVar, int i, byte[] bArr, int i2, int i3) {
        C1924k.m9142h(wVar, "segment");
        C1924k.m9142h(bArr, "bytes");
        int i4 = wVar.f7391c;
        byte[] bArr2 = wVar.f7389a;
        while (i2 < i3) {
            if (i == i4) {
                wVar = wVar.f7394f;
                if (wVar == null) {
                    C1924k.m9150p();
                }
                byte[] bArr3 = wVar.f7389a;
                int i5 = wVar.f7390b;
                bArr2 = bArr3;
                i = i5;
                i4 = wVar.f7391c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: c */
    public static final String m10826c(C2111f fVar, long j) {
        String str;
        C1924k.m9142h(fVar, "$this$readUtf8Line");
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (fVar.mo7900F(j3) == ((byte) 13)) {
                str = fVar.mo7928f0(j3);
                j2 = 2;
                fVar.mo7963v(j2);
                return str;
            }
        }
        str = fVar.mo7928f0(j);
        fVar.mo7963v(j2);
        return str;
    }

    /* renamed from: d */
    public static final int m10827d(C2111f fVar, C2126s sVar, boolean z) {
        int i;
        int i2;
        int i3;
        C2132w wVar;
        int i4;
        C2111f fVar2 = fVar;
        C1924k.m9142h(fVar2, "$this$selectPrefix");
        C1924k.m9142h(sVar, "options");
        C2132w wVar2 = fVar2.f7354d;
        if (wVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = wVar2.f7389a;
        int i5 = wVar2.f7390b;
        int i6 = wVar2.f7391c;
        int[] A = sVar.mo8017A();
        C2132w wVar3 = wVar2;
        int i7 = 0;
        int i8 = -1;
        loop0:
        while (true) {
            int i9 = i7 + 1;
            int i10 = A[i7];
            int i11 = i9 + 1;
            int i12 = A[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (wVar3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = i11 + (i10 * -1);
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != A[i11]) {
                        return i8;
                    }
                    boolean z2 = i15 == i13;
                    if (i14 == i6) {
                        if (wVar3 == null) {
                            C1924k.m9150p();
                        }
                        C2132w wVar4 = wVar3.f7394f;
                        if (wVar4 == null) {
                            C1924k.m9150p();
                        }
                        i4 = wVar4.f7390b;
                        byte[] bArr2 = wVar4.f7389a;
                        i3 = wVar4.f7391c;
                        if (wVar4 != wVar2) {
                            byte[] bArr3 = bArr2;
                            wVar = wVar4;
                            bArr = bArr3;
                        } else if (!z2) {
                            break loop0;
                        } else {
                            bArr = bArr2;
                            wVar = null;
                        }
                    } else {
                        C2132w wVar5 = wVar3;
                        i3 = i6;
                        i4 = i14;
                        wVar = wVar5;
                    }
                    if (z2) {
                        i2 = A[i15];
                        i = i4;
                        i6 = i3;
                        wVar3 = wVar;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    i11 = i15;
                    wVar3 = wVar;
                }
            } else {
                i = i5 + 1;
                byte b = bArr[i5] & 255;
                int i16 = i11 + i10;
                while (i11 != i16) {
                    if (b == A[i11]) {
                        i2 = A[i11 + i10];
                        if (i == i6) {
                            wVar3 = wVar3.f7394f;
                            if (wVar3 == null) {
                                C1924k.m9150p();
                            }
                            i = wVar3.f7390b;
                            bArr = wVar3.f7389a;
                            i6 = wVar3.f7391c;
                            if (wVar3 == wVar2) {
                                wVar3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            if (i2 >= 0) {
                return i2;
            }
            i7 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i8;
    }

    /* renamed from: e */
    public static /* synthetic */ int m10828e(C2111f fVar, C2126s sVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m10827d(fVar, sVar, z);
    }
}
