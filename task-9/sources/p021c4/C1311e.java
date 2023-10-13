package p021c4;

import p041f3.C1924k;
import p062i4.C2115i;
import p140v3.C3423b;

/* renamed from: c4.e */
public final class C1311e {

    /* renamed from: a */
    public static final C2115i f4695a = C2115i.f7358h.mo8007d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f4696b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    private static final String[] f4697c = new String[64];

    /* renamed from: d */
    private static final String[] f4698d;

    /* renamed from: e */
    public static final C1311e f4699e = new C1311e();

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C1924k.m9137c(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = C2646p.m11993w(C3423b.m15099q("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f4698d = strArr;
        String[] strArr2 = f4697c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f4697c;
            strArr3[i3 | 8] = C1924k.m9147m(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = f4697c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f4697c;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + "|" + strArr5[i5] + "|PADDED";
            }
        }
        int length = f4697c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f4697c;
            if (strArr6[i9] == null) {
                strArr6[i9] = f4698d[i9];
            }
        }
    }

    private C1311e() {
    }

    /* renamed from: a */
    public final String mo5148a(int i, int i2) {
        String str;
        boolean z;
        int i3;
        Object obj;
        String str2;
        String str3;
        if (i2 == 0) {
            return "";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : f4698d[i2];
            }
            if (!(i == 7 || i == 8)) {
                String[] strArr = f4697c;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    if (str == null) {
                        C1924k.m9150p();
                    }
                } else {
                    str = f4698d[i2];
                }
                String str4 = str;
                if (i == 5 && (i2 & 4) != 0) {
                    z = false;
                    i3 = 4;
                    obj = null;
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else if (i != 0 || (i2 & 32) == 0) {
                    return str4;
                } else {
                    z = false;
                    i3 = 4;
                    obj = null;
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return C2646p.m11994x(str4, str2, str3, z, i3, obj);
            }
        }
        return f4698d[i2];
    }

    /* renamed from: b */
    public final String mo5149b(boolean z, int i, int i2, int i3, int i4) {
        String[] strArr = f4696b;
        return C3423b.m15099q("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), i3 < strArr.length ? strArr[i3] : C3423b.m15099q("0x%02x", Integer.valueOf(i3)), mo5148a(i3, i4));
    }
}
