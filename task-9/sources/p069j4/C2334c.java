package p069j4;

import p041f3.C1924k;
import p062i4.C2135y;

/* renamed from: j4.c */
public final class C2334c {
    /* renamed from: a */
    public static final int m10835a(int[] iArr, int i, int i2, int i3) {
        C1924k.m9142h(iArr, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m10836b(C2135y yVar, int i) {
        C1924k.m9142h(yVar, "$this$segment");
        int a = m10835a(yVar.mo8058z(), i + 1, 0, yVar.mo8056A().length);
        return a >= 0 ? a : a ^ -1;
    }
}
