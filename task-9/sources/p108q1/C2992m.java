package p108q1;

import androidx.constraintlayout.widget.C0427j;
import java.io.EOFException;
import java.math.BigDecimal;
import java.util.Objects;
import javax.annotation.Nullable;
import p062i4.C2111f;
import p062i4.C2114h;
import p062i4.C2115i;
import p108q1.C2988k;

/* renamed from: q1.m */
final class C2992m extends C2988k {

    /* renamed from: p */
    private static final C2115i f9810p = C2115i.m9781e("'\\");

    /* renamed from: q */
    private static final C2115i f9811q = C2115i.m9781e("\"\\");

    /* renamed from: r */
    private static final C2115i f9812r = C2115i.m9781e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: s */
    private static final C2115i f9813s = C2115i.m9781e("\n\r");

    /* renamed from: t */
    private static final C2115i f9814t = C2115i.m9781e("*/");

    /* renamed from: j */
    private final C2114h f9815j;

    /* renamed from: k */
    private final C2111f f9816k;

    /* renamed from: l */
    private int f9817l = 0;

    /* renamed from: m */
    private long f9818m;

    /* renamed from: n */
    private int f9819n;
    @Nullable

    /* renamed from: o */
    private String f9820o;

    C2992m(C2114h hVar) {
        Objects.requireNonNull(hVar, "source == null");
        this.f9815j = hVar;
        this.f9816k = hVar.mo7920b();
        mo10231Q(6);
    }

    /* renamed from: g0 */
    private void m13503g0() {
        if (!this.f9795h) {
            throw mo10241f0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m13504h0() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f9792e
            int r2 = r0.f9791d
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 0
            r6 = 8
            r8 = 34
            r9 = 93
            r10 = 3
            r11 = 7
            r12 = 59
            r13 = 44
            r14 = 4
            r15 = 2
            r7 = 1
            if (r3 != r7) goto L_0x0022
            int r2 = r2 - r7
            r1[r2] = r15
            goto L_0x009a
        L_0x0022:
            if (r3 != r15) goto L_0x003d
            int r1 = r0.m13508m0(r7)
            i4.f r2 = r0.f9816k
            r2.readByte()
            if (r1 == r13) goto L_0x009a
            if (r1 == r12) goto L_0x0094
            if (r1 != r9) goto L_0x0036
            r0.f9817l = r14
            return r14
        L_0x0036:
            java.lang.String r1 = "Unterminated array"
            q1.i r1 = r0.mo10241f0(r1)
            throw r1
        L_0x003d:
            r15 = 5
            if (r3 == r10) goto L_0x0121
            if (r3 != r15) goto L_0x0044
            goto L_0x0121
        L_0x0044:
            if (r3 != r14) goto L_0x007e
            int r2 = r2 - r7
            r1[r2] = r15
            int r1 = r0.m13508m0(r7)
            i4.f r2 = r0.f9816k
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x009a
            r2 = 61
            if (r1 != r2) goto L_0x0077
            r16.m13503g0()
            i4.h r1 = r0.f9815j
            r14 = 1
            boolean r1 = r1.mo7970y(r14)
            if (r1 == 0) goto L_0x009a
            i4.f r1 = r0.f9816k
            byte r1 = r1.mo7900F(r4)
            r2 = 62
            if (r1 != r2) goto L_0x009a
            i4.f r1 = r0.f9816k
            r1.readByte()
            goto L_0x009a
        L_0x0077:
            java.lang.String r1 = "Expected ':'"
            q1.i r1 = r0.mo10241f0(r1)
            throw r1
        L_0x007e:
            r14 = 6
            if (r3 != r14) goto L_0x0085
            int r2 = r2 - r7
            r1[r2] = r11
            goto L_0x009a
        L_0x0085:
            if (r3 != r11) goto L_0x0098
            r1 = 0
            int r1 = r0.m13508m0(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r1 = 18
        L_0x0091:
            r0.f9817l = r1
            return r1
        L_0x0094:
            r16.m13503g0()
            goto L_0x009a
        L_0x0098:
            if (r3 == r6) goto L_0x0119
        L_0x009a:
            int r1 = r0.m13508m0(r7)
            if (r1 == r8) goto L_0x0110
            r2 = 39
            if (r1 == r2) goto L_0x0105
            if (r1 == r13) goto L_0x00f2
            if (r1 == r12) goto L_0x00f2
            r2 = 91
            if (r1 == r2) goto L_0x00ea
            if (r1 == r9) goto L_0x00e1
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x00d9
            int r1 = r16.m13511p0()
            if (r1 == 0) goto L_0x00b9
            return r1
        L_0x00b9:
            int r1 = r16.m13512q0()
            if (r1 == 0) goto L_0x00c0
            return r1
        L_0x00c0:
            i4.f r1 = r0.f9816k
            byte r1 = r1.mo7900F(r4)
            boolean r1 = r0.m13507k0(r1)
            if (r1 == 0) goto L_0x00d2
            r16.m13503g0()
            r1 = 10
            goto L_0x0091
        L_0x00d2:
            java.lang.String r1 = "Expected value"
            q1.i r1 = r0.mo10241f0(r1)
            throw r1
        L_0x00d9:
            i4.f r1 = r0.f9816k
            r1.readByte()
            r0.f9817l = r7
            return r7
        L_0x00e1:
            if (r3 != r7) goto L_0x00f2
            i4.f r1 = r0.f9816k
            r1.readByte()
            r1 = 4
            goto L_0x0091
        L_0x00ea:
            i4.f r1 = r0.f9816k
            r1.readByte()
            r0.f9817l = r10
            return r10
        L_0x00f2:
            if (r3 == r7) goto L_0x00ff
            r1 = 2
            if (r3 != r1) goto L_0x00f8
            goto L_0x00ff
        L_0x00f8:
            java.lang.String r1 = "Unexpected value"
            q1.i r1 = r0.mo10241f0(r1)
            throw r1
        L_0x00ff:
            r16.m13503g0()
            r0.f9817l = r11
            return r11
        L_0x0105:
            r16.m13503g0()
            i4.f r1 = r0.f9816k
            r1.readByte()
            r0.f9817l = r6
            return r6
        L_0x0110:
            i4.f r1 = r0.f9816k
            r1.readByte()
            r1 = 9
            goto L_0x0091
        L_0x0119:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0121:
            int r2 = r2 - r7
            r4 = 4
            r1[r2] = r4
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r15) goto L_0x0145
            int r2 = r0.m13508m0(r7)
            i4.f r4 = r0.f9816k
            r4.readByte()
            if (r2 == r13) goto L_0x0145
            if (r2 == r12) goto L_0x0142
            if (r2 != r1) goto L_0x013b
        L_0x0138:
            r1 = 2
            goto L_0x0091
        L_0x013b:
            java.lang.String r1 = "Unterminated object"
            q1.i r1 = r0.mo10241f0(r1)
            throw r1
        L_0x0142:
            r16.m13503g0()
        L_0x0145:
            int r2 = r0.m13508m0(r7)
            if (r2 == r8) goto L_0x017f
            r4 = 39
            if (r2 == r4) goto L_0x0173
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x0166
            r16.m13503g0()
            char r1 = (char) r2
            boolean r1 = r0.m13507k0(r1)
            if (r1 == 0) goto L_0x0161
            r1 = 14
            goto L_0x0091
        L_0x0161:
            q1.i r1 = r0.mo10241f0(r4)
            throw r1
        L_0x0166:
            if (r3 == r15) goto L_0x016e
            i4.f r1 = r0.f9816k
            r1.readByte()
            goto L_0x0138
        L_0x016e:
            q1.i r1 = r0.mo10241f0(r4)
            throw r1
        L_0x0173:
            i4.f r1 = r0.f9816k
            r1.readByte()
            r16.m13503g0()
            r1 = 12
            goto L_0x0091
        L_0x017f:
            i4.f r1 = r0.f9816k
            r1.readByte()
            r1 = 13
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: p108q1.C2992m.m13504h0():int");
    }

    /* renamed from: i0 */
    private int m13505i0(String str, C2988k.C2989a aVar) {
        int length = aVar.f9797a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f9797a[i])) {
                this.f9817l = 0;
                this.f9793f[this.f9791d - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j0 */
    private int m13506j0(String str, C2988k.C2989a aVar) {
        int length = aVar.f9797a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f9797a[i])) {
                this.f9817l = 0;
                int[] iArr = this.f9794g;
                int i2 = this.f9791d - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k0 */
    private boolean m13507k0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case C0427j.f1908J0:
                        case C0427j.f1920L0:
                            return false;
                        case C0427j.f1914K0:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m13503g0();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f9816k.mo7963v((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f9815j.mo7970y(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m13503g0();
        r3 = r6.f9816k.mo7900F(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f9816k.readByte();
        r6.f9816k.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        m13516u0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r6.f9816k.readByte();
        r6.f9816k.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (m13515t0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        throw mo10241f0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r1 != 35) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        m13503g0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        return r1;
     */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m13508m0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            i4.h r2 = r6.f9815j
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo7970y(r4)
            if (r2 == 0) goto L_0x007f
            i4.f r2 = r6.f9816k
            long r4 = (long) r1
            byte r1 = r2.mo7900F(r4)
            r2 = 10
            if (r1 == r2) goto L_0x007d
            r2 = 32
            if (r1 == r2) goto L_0x007d
            r2 = 13
            if (r1 == r2) goto L_0x007d
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x007d
        L_0x0025:
            i4.f r2 = r6.f9816k
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.mo7963v(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            i4.h r3 = r6.f9815j
            r4 = 2
            boolean r3 = r3.mo7970y(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m13503g0()
            i4.f r3 = r6.f9816k
            r4 = 1
            byte r3 = r3.mo7900F(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            i4.f r1 = r6.f9816k
            r1.readByte()
            i4.f r1 = r6.f9816k
            r1.readByte()
        L_0x0058:
            r6.m13516u0()
            goto L_0x0001
        L_0x005c:
            i4.f r1 = r6.f9816k
            r1.readByte()
            i4.f r1 = r6.f9816k
            r1.readByte()
            boolean r1 = r6.m13515t0()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            q1.i r7 = r6.mo10241f0(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007c
            r6.m13503g0()
            goto L_0x0058
        L_0x007c:
            return r1
        L_0x007d:
            r1 = r3
            goto L_0x0002
        L_0x007f:
            if (r7 != 0) goto L_0x0083
            r7 = -1
            return r7
        L_0x0083:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            goto L_0x008c
        L_0x008b:
            throw r7
        L_0x008c:
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: p108q1.C2992m.m13508m0(boolean):int");
    }

    /* renamed from: n0 */
    private String m13509n0(C2115i iVar) {
        StringBuilder sb = null;
        while (true) {
            long Y = this.f9815j.mo7917Y(iVar);
            if (Y == -1) {
                throw mo10241f0("Unterminated string");
            } else if (this.f9816k.mo7900F(Y) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f9816k.mo7928f0(Y));
                this.f9816k.readByte();
                sb.append(m13513r0());
            } else {
                String f0 = this.f9816k.mo7928f0(Y);
                if (sb == null) {
                    this.f9816k.readByte();
                    return f0;
                }
                sb.append(f0);
                this.f9816k.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: o0 */
    private String m13510o0() {
        long Y = this.f9815j.mo7917Y(f9812r);
        return Y != -1 ? this.f9816k.mo7928f0(Y) : this.f9816k.mo7926e0();
    }

    /* renamed from: p0 */
    private int m13511p0() {
        String str;
        String str2;
        int i;
        byte F = this.f9816k.mo7900F(0);
        if (F == 116 || F == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (F == 102 || F == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (F != 110 && F != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f9815j.mo7970y((long) i3)) {
                return 0;
            }
            byte F2 = this.f9816k.mo7900F((long) i2);
            if (F2 != str2.charAt(i2) && F2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f9815j.mo7970y((long) (length + 1)) && m13507k0(this.f9816k.mo7900F((long) length))) {
            return 0;
        }
        this.f9816k.mo7963v((long) length);
        this.f9817l = i;
        return i;
    }

    /* renamed from: q0 */
    private int m13512q0() {
        int i;
        byte F;
        boolean z = true;
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        char c = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i4 = i3 + 1;
            if (!this.f9815j.mo7970y((long) i4)) {
                break;
            }
            F = this.f9816k.mo7900F((long) i3);
            if (F != 43) {
                if (F != 69 && F != 101) {
                    if (F != 45) {
                        if (F != 46) {
                            if (F >= 48 && F <= 57) {
                                if (c == z || c == 0) {
                                    j = (long) (-(F - 48));
                                    i2 = 0;
                                    c = 2;
                                } else {
                                    if (c == 2) {
                                        if (j == 0) {
                                            return i2;
                                        }
                                        long j2 = (10 * j) - ((long) (F - 48));
                                        z2 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                        j = j2;
                                    } else if (c == 3) {
                                        i2 = 0;
                                        c = 4;
                                    } else if (c == 5 || c == 6) {
                                        i2 = 0;
                                        c = 7;
                                    }
                                    i2 = 0;
                                }
                            }
                        } else if (c != 2) {
                            return i2;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return i2;
                    }
                    i3 = i4;
                    z = true;
                } else if (c != 2 && c != 4) {
                    return i2;
                } else {
                    c = 5;
                    i3 = i4;
                    z = true;
                }
            } else if (c != 5) {
                return i2;
            }
            c = 6;
            i3 = i4;
            z = true;
        }
        if (m13507k0(F)) {
            return 0;
        }
        if (c == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f9818m = j;
            this.f9816k.mo7963v((long) i3);
            i = 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f9819n = i3;
            i = 17;
        }
        this.f9817l = i;
        return i;
    }

    /* renamed from: r0 */
    private char m13513r0() {
        int i;
        int i2;
        if (this.f9815j.mo7970y(1)) {
            byte readByte = this.f9816k.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f9795h) {
                    return (char) readByte;
                }
                throw mo10241f0("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f9815j.mo7970y(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte F = this.f9816k.mo7900F((long) i3);
                    char c2 = (char) (c << 4);
                    if (F < 48 || F > 57) {
                        if (F >= 97 && F <= 102) {
                            i = F - 97;
                        } else if (F < 65 || F > 70) {
                            throw mo10241f0("\\u" + this.f9816k.mo7928f0(4));
                        } else {
                            i = F - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = F - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f9816k.mo7963v(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + mo10244k());
            }
        } else {
            throw mo10241f0("Unterminated escape sequence");
        }
    }

    /* renamed from: s0 */
    private void m13514s0(C2115i iVar) {
        while (true) {
            long Y = this.f9815j.mo7917Y(iVar);
            if (Y == -1) {
                throw mo10241f0("Unterminated string");
            } else if (this.f9816k.mo7900F(Y) == 92) {
                this.f9816k.mo7963v(Y + 1);
                m13513r0();
            } else {
                this.f9816k.mo7963v(Y + 1);
                return;
            }
        }
    }

    /* renamed from: t0 */
    private boolean m13515t0() {
        C2114h hVar = this.f9815j;
        C2115i iVar = f9814t;
        long z = hVar.mo7971z(iVar);
        boolean z2 = z != -1;
        C2111f fVar = this.f9816k;
        fVar.mo7963v(z2 ? z + ((long) iVar.mo7999u()) : fVar.mo7931h0());
        return z2;
    }

    /* renamed from: u0 */
    private void m13516u0() {
        long Y = this.f9815j.mo7917Y(f9813s);
        C2111f fVar = this.f9816k;
        fVar.mo7963v(Y != -1 ? Y + 1 : fVar.mo7931h0());
    }

    /* renamed from: v0 */
    private void m13517v0() {
        long Y = this.f9815j.mo7917Y(f9812r);
        C2111f fVar = this.f9816k;
        if (Y == -1) {
            Y = fVar.mo7931h0();
        }
        fVar.mo7963v(Y);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double mo10224B() {
        /*
            r8 = this;
            int r0 = r8.f9817l
            if (r0 != 0) goto L_0x0008
            int r0 = r8.m13504h0()
        L_0x0008:
            r1 = 16
            r2 = 0
            if (r0 != r1) goto L_0x001f
            r8.f9817l = r2
            int[] r0 = r8.f9794g
            int r1 = r8.f9791d
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r8.f9818m
            double r0 = (double) r0
            return r0
        L_0x001f:
            r1 = 17
            java.lang.String r3 = "Expected a double but was "
            r4 = 11
            java.lang.String r5 = " at path "
            if (r0 != r1) goto L_0x0035
            i4.f r0 = r8.f9816k
            int r1 = r8.f9819n
            long r6 = (long) r1
            java.lang.String r0 = r0.mo7928f0(r6)
        L_0x0032:
            r8.f9820o = r0
            goto L_0x0052
        L_0x0035:
            r1 = 9
            if (r0 != r1) goto L_0x0040
            i4.i r0 = f9811q
        L_0x003b:
            java.lang.String r0 = r8.m13509n0(r0)
            goto L_0x0032
        L_0x0040:
            r1 = 8
            if (r0 != r1) goto L_0x0047
            i4.i r0 = f9810p
            goto L_0x003b
        L_0x0047:
            r1 = 10
            if (r0 != r1) goto L_0x0050
            java.lang.String r0 = r8.m13510o0()
            goto L_0x0032
        L_0x0050:
            if (r0 != r4) goto L_0x00bf
        L_0x0052:
            r8.f9817l = r4
            java.lang.String r0 = r8.f9820o     // Catch:{ NumberFormatException -> 0x009e }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x009e }
            boolean r3 = r8.f9795h
            if (r3 != 0) goto L_0x008c
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L_0x006b
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L_0x006b
            goto L_0x008c
        L_0x006b:
            q1.i r2 = new q1.i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r8.mo10244k()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x008c:
            r3 = 0
            r8.f9820o = r3
            r8.f9817l = r2
            int[] r2 = r8.f9794g
            int r3 = r8.f9791d
            int r3 = r3 + -1
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r0
        L_0x009e:
            q1.h r0 = new q1.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r8.f9820o
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.mo10244k()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            q1.h r0 = new q1.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            q1.k$b r2 = r8.mo10229J()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.mo10244k()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x00e3
        L_0x00e2:
            throw r0
        L_0x00e3:
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: p108q1.C2992m.mo10224B():double");
    }

    /* renamed from: C */
    public int mo10225C() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 16) {
            long j = this.f9818m;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f9817l = 0;
                int[] iArr = this.f9794g;
                int i3 = this.f9791d - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C2985h("Expected an int but was " + this.f9818m + " at path " + mo10244k());
        }
        if (i == 17) {
            this.f9820o = this.f9816k.mo7928f0((long) this.f9819n);
        } else if (i == 9 || i == 8) {
            String n0 = m13509n0(i == 9 ? f9811q : f9810p);
            this.f9820o = n0;
            try {
                int parseInt = Integer.parseInt(n0);
                this.f9817l = 0;
                int[] iArr2 = this.f9794g;
                int i4 = this.f9791d - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C2985h("Expected an int but was " + mo10229J() + " at path " + mo10244k());
        }
        this.f9817l = 11;
        try {
            double parseDouble = Double.parseDouble(this.f9820o);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f9820o = null;
                this.f9817l = 0;
                int[] iArr3 = this.f9794g;
                int i6 = this.f9791d - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C2985h("Expected an int but was " + this.f9820o + " at path " + mo10244k());
        } catch (NumberFormatException unused2) {
            throw new C2985h("Expected an int but was " + this.f9820o + " at path " + mo10244k());
        }
    }

    /* renamed from: D */
    public long mo10226D() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 16) {
            this.f9817l = 0;
            int[] iArr = this.f9794g;
            int i2 = this.f9791d - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f9818m;
        }
        if (i == 17) {
            this.f9820o = this.f9816k.mo7928f0((long) this.f9819n);
        } else if (i == 9 || i == 8) {
            String n0 = m13509n0(i == 9 ? f9811q : f9810p);
            this.f9820o = n0;
            try {
                long parseLong = Long.parseLong(n0);
                this.f9817l = 0;
                int[] iArr2 = this.f9794g;
                int i3 = this.f9791d - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C2985h("Expected a long but was " + mo10229J() + " at path " + mo10244k());
        }
        this.f9817l = 11;
        try {
            long longValueExact = new BigDecimal(this.f9820o).longValueExact();
            this.f9820o = null;
            this.f9817l = 0;
            int[] iArr3 = this.f9794g;
            int i4 = this.f9791d - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new C2985h("Expected a long but was " + this.f9820o + " at path " + mo10244k());
        }
    }

    @Nullable
    /* renamed from: F */
    public <T> T mo10227F() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 7) {
            this.f9817l = 0;
            int[] iArr = this.f9794g;
            int i2 = this.f9791d - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new C2985h("Expected null but was " + mo10229J() + " at path " + mo10244k());
    }

    /* renamed from: G */
    public String mo10228G() {
        String str;
        C2115i iVar;
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 10) {
            str = m13510o0();
        } else {
            if (i == 9) {
                iVar = f9811q;
            } else if (i == 8) {
                iVar = f9810p;
            } else if (i == 11) {
                str = this.f9820o;
                this.f9820o = null;
            } else if (i == 16) {
                str = Long.toString(this.f9818m);
            } else if (i == 17) {
                str = this.f9816k.mo7928f0((long) this.f9819n);
            } else {
                throw new C2985h("Expected a string but was " + mo10229J() + " at path " + mo10244k());
            }
            str = m13509n0(iVar);
        }
        this.f9817l = 0;
        int[] iArr = this.f9794g;
        int i2 = this.f9791d - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: J */
    public C2988k.C2990b mo10229J() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        switch (i) {
            case 1:
                return C2988k.C2990b.BEGIN_OBJECT;
            case 2:
                return C2988k.C2990b.END_OBJECT;
            case 3:
                return C2988k.C2990b.BEGIN_ARRAY;
            case 4:
                return C2988k.C2990b.END_ARRAY;
            case 5:
            case 6:
                return C2988k.C2990b.BOOLEAN;
            case 7:
                return C2988k.C2990b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C2988k.C2990b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C2988k.C2990b.NAME;
            case 16:
            case 17:
                return C2988k.C2990b.NUMBER;
            case 18:
                return C2988k.C2990b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo10230O() {
        if (mo10245n()) {
            this.f9820o = mo10249l0();
            this.f9817l = 11;
        }
    }

    /* renamed from: T */
    public int mo10232T(C2988k.C2989a aVar) {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m13505i0(this.f9820o, aVar);
        }
        int m = this.f9815j.mo7942m(aVar.f9798b);
        if (m != -1) {
            this.f9817l = 0;
            this.f9793f[this.f9791d - 1] = aVar.f9797a[m];
            return m;
        }
        String str = this.f9793f[this.f9791d - 1];
        String l0 = mo10249l0();
        int i0 = m13505i0(l0, aVar);
        if (i0 == -1) {
            this.f9817l = 15;
            this.f9820o = l0;
            this.f9793f[this.f9791d - 1] = str;
        }
        return i0;
    }

    /* renamed from: a */
    public void mo10233a() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 3) {
            mo10231Q(1);
            this.f9794g[this.f9791d - 1] = 0;
            this.f9817l = 0;
            return;
        }
        throw new C2985h("Expected BEGIN_ARRAY but was " + mo10229J() + " at path " + mo10244k());
    }

    /* renamed from: a0 */
    public int mo10234a0(C2988k.C2989a aVar) {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return m13506j0(this.f9820o, aVar);
        }
        int m = this.f9815j.mo7942m(aVar.f9798b);
        if (m != -1) {
            this.f9817l = 0;
            int[] iArr = this.f9794g;
            int i2 = this.f9791d - 1;
            iArr[i2] = iArr[i2] + 1;
            return m;
        }
        String G = mo10228G();
        int j0 = m13506j0(G, aVar);
        if (j0 == -1) {
            this.f9817l = 11;
            this.f9820o = G;
            int[] iArr2 = this.f9794g;
            int i3 = this.f9791d - 1;
            iArr2[i3] = iArr2[i3] - 1;
        }
        return j0;
    }

    /* renamed from: c */
    public void mo10236c() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 1) {
            mo10231Q(3);
            this.f9817l = 0;
            return;
        }
        throw new C2985h("Expected BEGIN_OBJECT but was " + mo10229J() + " at path " + mo10244k());
    }

    public void close() {
        this.f9817l = 0;
        this.f9792e[0] = 8;
        this.f9791d = 1;
        this.f9816k.mo7933i();
        this.f9815j.close();
    }

    /* renamed from: d0 */
    public void mo10238d0() {
        C2115i iVar;
        if (!this.f9796i) {
            int i = this.f9817l;
            if (i == 0) {
                i = m13504h0();
            }
            if (i == 14) {
                m13517v0();
            } else {
                if (i == 13) {
                    iVar = f9811q;
                } else if (i == 12) {
                    iVar = f9810p;
                } else if (i != 15) {
                    throw new C2985h("Expected a name but was " + mo10229J() + " at path " + mo10244k());
                }
                m13514s0(iVar);
            }
            this.f9817l = 0;
            this.f9793f[this.f9791d - 1] = "null";
            return;
        }
        throw new C2985h("Cannot skip unexpected " + mo10229J() + " at " + mo10244k());
    }

    /* renamed from: e0 */
    public void mo10239e0() {
        C2115i iVar;
        if (!this.f9796i) {
            int i = 0;
            do {
                int i2 = this.f9817l;
                if (i2 == 0) {
                    i2 = m13504h0();
                }
                if (i2 == 3) {
                    mo10231Q(1);
                } else if (i2 == 1) {
                    mo10231Q(3);
                } else if (i2 == 4 || i2 == 2) {
                    this.f9791d--;
                    i--;
                    this.f9817l = 0;
                } else if (i2 == 14 || i2 == 10) {
                    m13517v0();
                    this.f9817l = 0;
                } else {
                    if (i2 == 9 || i2 == 13) {
                        iVar = f9811q;
                    } else if (i2 == 8 || i2 == 12) {
                        iVar = f9810p;
                    } else {
                        if (i2 == 17) {
                            this.f9816k.mo7963v((long) this.f9819n);
                        }
                        this.f9817l = 0;
                    }
                    m13514s0(iVar);
                    this.f9817l = 0;
                }
                i++;
                this.f9817l = 0;
            } while (i != 0);
            int[] iArr = this.f9794g;
            int i3 = this.f9791d;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f9793f[i3 - 1] = "null";
            return;
        }
        throw new C2985h("Cannot skip unexpected " + mo10229J() + " at " + mo10244k());
    }

    /* renamed from: f */
    public void mo10240f() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 4) {
            int i2 = this.f9791d - 1;
            this.f9791d = i2;
            int[] iArr = this.f9794g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f9817l = 0;
            return;
        }
        throw new C2985h("Expected END_ARRAY but was " + mo10229J() + " at path " + mo10244k());
    }

    /* renamed from: h */
    public void mo10242h() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 2) {
            int i2 = this.f9791d - 1;
            this.f9791d = i2;
            this.f9793f[i2] = null;
            int[] iArr = this.f9794g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f9817l = 0;
            return;
        }
        throw new C2985h("Expected END_OBJECT but was " + mo10229J() + " at path " + mo10244k());
    }

    /* renamed from: l0 */
    public String mo10249l0() {
        String str;
        C2115i iVar;
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 14) {
            str = m13510o0();
        } else {
            if (i == 13) {
                iVar = f9811q;
            } else if (i == 12) {
                iVar = f9810p;
            } else if (i == 15) {
                str = this.f9820o;
            } else {
                throw new C2985h("Expected a name but was " + mo10229J() + " at path " + mo10244k());
            }
            str = m13509n0(iVar);
        }
        this.f9817l = 0;
        this.f9793f[this.f9791d - 1] = str;
        return str;
    }

    /* renamed from: n */
    public boolean mo10245n() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    public String toString() {
        return "JsonReader(" + this.f9815j + ")";
    }

    /* renamed from: w */
    public boolean mo10247w() {
        int i = this.f9817l;
        if (i == 0) {
            i = m13504h0();
        }
        if (i == 5) {
            this.f9817l = 0;
            int[] iArr = this.f9794g;
            int i2 = this.f9791d - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f9817l = 0;
            int[] iArr2 = this.f9794g;
            int i3 = this.f9791d - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C2985h("Expected a boolean but was " + mo10229J() + " at path " + mo10244k());
        }
    }
}
