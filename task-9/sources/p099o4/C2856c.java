package p099o4;

import java.util.ArrayList;
import java.util.Iterator;
import p147w4.C3472f;

/* renamed from: o4.c */
public class C2856c {
    /* renamed from: a */
    public static ArrayList<C3472f> m12938a(String str, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int length = str.length();
        ArrayList<C3472f> arrayList = new ArrayList<>(length / 3);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < length) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i2 = i5 + 1;
                int charAt = str.charAt(i5) - '?';
                i9 |= (charAt & 31) << i10;
                i10 += 5;
                if (charAt < 32) {
                    break;
                }
                i5 = i2;
            }
            int i11 = ((i9 & 1) != 0 ? (i9 >> 1) ^ -1 : i9 >> 1) + i6;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i3 = i2 + 1;
                int charAt2 = str.charAt(i2) - '?';
                i12 |= (charAt2 & 31) << i13;
                i13 += 5;
                if (charAt2 < 32) {
                    break;
                }
                i2 = i3;
            }
            int i14 = i12 & 1;
            int i15 = i12 >> 1;
            if (i14 != 0) {
                i15 ^= -1;
            }
            i7 += i15;
            if (z) {
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    i4 = i3 + 1;
                    int charAt3 = str.charAt(i3) - '?';
                    i16 |= (charAt3 & 31) << i17;
                    i17 += 5;
                    if (charAt3 < 32) {
                        break;
                    }
                    i3 = i4;
                }
                int i18 = i16 & 1;
                int i19 = i16 >> 1;
                if (i18 != 0) {
                    i19 ^= -1;
                }
                i8 += i19;
                i3 = i4;
            }
            arrayList.add(new C3472f(i11 * i, i7 * i, i8 / 100));
            i6 = i11;
            i5 = i3;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m12939b(ArrayList<C3472f> arrayList, int i) {
        StringBuilder sb = new StringBuilder();
        Iterator<C3472f> it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C3472f next = it.next();
            int w = next.mo11419w() / i;
            int x = next.mo11421x() / i;
            sb.append(m12941d(w - i2));
            sb.append(m12941d(x - i3));
            i3 = x;
            i2 = w;
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static StringBuffer m12940c(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        while (i >= 32) {
            stringBuffer.append((char) ((32 | (i & 31)) + 63));
            i >>= 5;
        }
        stringBuffer.append((char) (i + 63));
        return stringBuffer;
    }

    /* renamed from: d */
    private static StringBuffer m12941d(int i) {
        int i2 = i << 1;
        if (i < 0) {
            i2 ^= -1;
        }
        return m12940c(i2);
    }
}
