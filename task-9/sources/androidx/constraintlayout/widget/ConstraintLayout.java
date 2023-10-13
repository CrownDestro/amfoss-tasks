package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p094o.C2830e;
import p094o.C2833f;
import p094o.C2836h;
import p100p.C2885b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: d */
    SparseArray<View> f1588d = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList<C0411b> f1589e = new ArrayList<>(4);

    /* renamed from: f */
    protected C2833f f1590f = new C2833f();

    /* renamed from: g */
    private int f1591g = 0;

    /* renamed from: h */
    private int f1592h = 0;

    /* renamed from: i */
    private int f1593i = Integer.MAX_VALUE;

    /* renamed from: j */
    private int f1594j = Integer.MAX_VALUE;

    /* renamed from: k */
    protected boolean f1595k = true;

    /* renamed from: l */
    private int f1596l = 263;

    /* renamed from: m */
    private C0415d f1597m = null;

    /* renamed from: n */
    protected C0412c f1598n = null;

    /* renamed from: o */
    private int f1599o = -1;

    /* renamed from: p */
    private HashMap<String, Integer> f1600p = new HashMap<>();

    /* renamed from: q */
    private int f1601q = -1;

    /* renamed from: r */
    private int f1602r = -1;

    /* renamed from: s */
    int f1603s = -1;

    /* renamed from: t */
    int f1604t = -1;

    /* renamed from: u */
    int f1605u = 0;

    /* renamed from: v */
    int f1606v = 0;

    /* renamed from: w */
    private SparseArray<C2830e> f1607w = new SparseArray<>();

    /* renamed from: x */
    C0407c f1608x = new C0407c(this);

    /* renamed from: y */
    private int f1609y = 0;

    /* renamed from: z */
    private int f1610z = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0404a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1611a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.e$b[] r0 = p094o.C2830e.C2832b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1611a = r0
                o.e$b r1 = p094o.C2830e.C2832b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1611a     // Catch:{ NoSuchFieldError -> 0x001d }
                o.e$b r1 = p094o.C2830e.C2832b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1611a     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.e$b r1 = p094o.C2830e.C2832b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1611a     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0404a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0405b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f1612A = 0.5f;

        /* renamed from: B */
        public String f1613B = null;

        /* renamed from: C */
        float f1614C = 0.0f;

        /* renamed from: D */
        int f1615D = 1;

        /* renamed from: E */
        public float f1616E = -1.0f;

        /* renamed from: F */
        public float f1617F = -1.0f;

        /* renamed from: G */
        public int f1618G = 0;

        /* renamed from: H */
        public int f1619H = 0;

        /* renamed from: I */
        public int f1620I = 0;

        /* renamed from: J */
        public int f1621J = 0;

        /* renamed from: K */
        public int f1622K = 0;

        /* renamed from: L */
        public int f1623L = 0;

        /* renamed from: M */
        public int f1624M = 0;

        /* renamed from: N */
        public int f1625N = 0;

        /* renamed from: O */
        public float f1626O = 1.0f;

        /* renamed from: P */
        public float f1627P = 1.0f;

        /* renamed from: Q */
        public int f1628Q = -1;

        /* renamed from: R */
        public int f1629R = -1;

        /* renamed from: S */
        public int f1630S = -1;

        /* renamed from: T */
        public boolean f1631T = false;

        /* renamed from: U */
        public boolean f1632U = false;

        /* renamed from: V */
        public String f1633V = null;

        /* renamed from: W */
        boolean f1634W = true;

        /* renamed from: X */
        boolean f1635X = true;

        /* renamed from: Y */
        boolean f1636Y = false;

        /* renamed from: Z */
        boolean f1637Z = false;

        /* renamed from: a */
        public int f1638a = -1;

        /* renamed from: a0 */
        boolean f1639a0 = false;

        /* renamed from: b */
        public int f1640b = -1;

        /* renamed from: b0 */
        boolean f1641b0 = false;

        /* renamed from: c */
        public float f1642c = -1.0f;

        /* renamed from: c0 */
        boolean f1643c0 = false;

        /* renamed from: d */
        public int f1644d = -1;

        /* renamed from: d0 */
        int f1645d0 = -1;

        /* renamed from: e */
        public int f1646e = -1;

        /* renamed from: e0 */
        int f1647e0 = -1;

        /* renamed from: f */
        public int f1648f = -1;

        /* renamed from: f0 */
        int f1649f0 = -1;

        /* renamed from: g */
        public int f1650g = -1;

        /* renamed from: g0 */
        int f1651g0 = -1;

        /* renamed from: h */
        public int f1652h = -1;

        /* renamed from: h0 */
        int f1653h0 = -1;

        /* renamed from: i */
        public int f1654i = -1;

        /* renamed from: i0 */
        int f1655i0 = -1;

        /* renamed from: j */
        public int f1656j = -1;

        /* renamed from: j0 */
        float f1657j0 = 0.5f;

        /* renamed from: k */
        public int f1658k = -1;

        /* renamed from: k0 */
        int f1659k0;

        /* renamed from: l */
        public int f1660l = -1;

        /* renamed from: l0 */
        int f1661l0;

        /* renamed from: m */
        public int f1662m = -1;

        /* renamed from: m0 */
        float f1663m0;

        /* renamed from: n */
        public int f1664n = 0;

        /* renamed from: n0 */
        C2830e f1665n0 = new C2830e();

        /* renamed from: o */
        public float f1666o = 0.0f;

        /* renamed from: o0 */
        public boolean f1667o0 = false;

        /* renamed from: p */
        public int f1668p = -1;

        /* renamed from: q */
        public int f1669q = -1;

        /* renamed from: r */
        public int f1670r = -1;

        /* renamed from: s */
        public int f1671s = -1;

        /* renamed from: t */
        public int f1672t = -1;

        /* renamed from: u */
        public int f1673u = -1;

        /* renamed from: v */
        public int f1674v = -1;

        /* renamed from: w */
        public int f1675w = -1;

        /* renamed from: x */
        public int f1676x = -1;

        /* renamed from: y */
        public int f1677y = -1;

        /* renamed from: z */
        public float f1678z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class C0406a {

            /* renamed from: a */
            public static final SparseIntArray f1679a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1679a = sparseIntArray;
                sparseIntArray.append(C0427j.f2089l2, 8);
                sparseIntArray.append(C0427j.f2096m2, 9);
                sparseIntArray.append(C0427j.f2110o2, 10);
                sparseIntArray.append(C0427j.f2117p2, 11);
                sparseIntArray.append(C0427j.f2159v2, 12);
                sparseIntArray.append(C0427j.f2152u2, 13);
                sparseIntArray.append(C0427j.f1969T1, 14);
                sparseIntArray.append(C0427j.f1963S1, 15);
                sparseIntArray.append(C0427j.f1951Q1, 16);
                sparseIntArray.append(C0427j.f1975U1, 2);
                sparseIntArray.append(C0427j.f1987W1, 3);
                sparseIntArray.append(C0427j.f1981V1, 4);
                sparseIntArray.append(C0427j.f1869D2, 49);
                sparseIntArray.append(C0427j.f1876E2, 50);
                sparseIntArray.append(C0427j.f2012a2, 5);
                sparseIntArray.append(C0427j.f2019b2, 6);
                sparseIntArray.append(C0427j.f2026c2, 7);
                sparseIntArray.append(C0427j.f2018b1, 1);
                sparseIntArray.append(C0427j.f2124q2, 17);
                sparseIntArray.append(C0427j.f2131r2, 18);
                sparseIntArray.append(C0427j.f2005Z1, 19);
                sparseIntArray.append(C0427j.f1999Y1, 20);
                sparseIntArray.append(C0427j.f1897H2, 21);
                sparseIntArray.append(C0427j.f1916K2, 22);
                sparseIntArray.append(C0427j.f1904I2, 23);
                sparseIntArray.append(C0427j.f1883F2, 24);
                sparseIntArray.append(C0427j.f1910J2, 25);
                sparseIntArray.append(C0427j.f1890G2, 26);
                sparseIntArray.append(C0427j.f2061h2, 29);
                sparseIntArray.append(C0427j.f2166w2, 30);
                sparseIntArray.append(C0427j.f1993X1, 44);
                sparseIntArray.append(C0427j.f2075j2, 45);
                sparseIntArray.append(C0427j.f2180y2, 46);
                sparseIntArray.append(C0427j.f2068i2, 47);
                sparseIntArray.append(C0427j.f2173x2, 48);
                sparseIntArray.append(C0427j.f1939O1, 27);
                sparseIntArray.append(C0427j.f1933N1, 28);
                sparseIntArray.append(C0427j.f2187z2, 31);
                sparseIntArray.append(C0427j.f2033d2, 32);
                sparseIntArray.append(C0427j.f1855B2, 33);
                sparseIntArray.append(C0427j.f1848A2, 34);
                sparseIntArray.append(C0427j.f1862C2, 35);
                sparseIntArray.append(C0427j.f2047f2, 36);
                sparseIntArray.append(C0427j.f2040e2, 37);
                sparseIntArray.append(C0427j.f2054g2, 38);
                sparseIntArray.append(C0427j.f2082k2, 39);
                sparseIntArray.append(C0427j.f2145t2, 40);
                sparseIntArray.append(C0427j.f2103n2, 41);
                sparseIntArray.append(C0427j.f1957R1, 42);
                sparseIntArray.append(C0427j.f1945P1, 43);
                sparseIntArray.append(C0427j.f2138s2, 51);
            }
        }

        public C0405b(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0222, code lost:
            android.util.Log.e("ConstraintLayout", r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0405b(android.content.Context r11, android.util.AttributeSet r12) {
            /*
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.f1638a = r0
                r10.f1640b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.f1642c = r1
                r10.f1644d = r0
                r10.f1646e = r0
                r10.f1648f = r0
                r10.f1650g = r0
                r10.f1652h = r0
                r10.f1654i = r0
                r10.f1656j = r0
                r10.f1658k = r0
                r10.f1660l = r0
                r10.f1662m = r0
                r2 = 0
                r10.f1664n = r2
                r3 = 0
                r10.f1666o = r3
                r10.f1668p = r0
                r10.f1669q = r0
                r10.f1670r = r0
                r10.f1671s = r0
                r10.f1672t = r0
                r10.f1673u = r0
                r10.f1674v = r0
                r10.f1675w = r0
                r10.f1676x = r0
                r10.f1677y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r10.f1678z = r4
                r10.f1612A = r4
                r5 = 0
                r10.f1613B = r5
                r10.f1614C = r3
                r6 = 1
                r10.f1615D = r6
                r10.f1616E = r1
                r10.f1617F = r1
                r10.f1618G = r2
                r10.f1619H = r2
                r10.f1620I = r2
                r10.f1621J = r2
                r10.f1622K = r2
                r10.f1623L = r2
                r10.f1624M = r2
                r10.f1625N = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.f1626O = r1
                r10.f1627P = r1
                r10.f1628Q = r0
                r10.f1629R = r0
                r10.f1630S = r0
                r10.f1631T = r2
                r10.f1632U = r2
                r10.f1633V = r5
                r10.f1634W = r6
                r10.f1635X = r6
                r10.f1636Y = r2
                r10.f1637Z = r2
                r10.f1639a0 = r2
                r10.f1641b0 = r2
                r10.f1643c0 = r2
                r10.f1645d0 = r0
                r10.f1647e0 = r0
                r10.f1649f0 = r0
                r10.f1651g0 = r0
                r10.f1653h0 = r0
                r10.f1655i0 = r0
                r10.f1657j0 = r4
                o.e r1 = new o.e
                r1.<init>()
                r10.f1665n0 = r1
                r10.f1667o0 = r2
                int[] r1 = androidx.constraintlayout.widget.C0427j.f2011a1
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = 0
            L_0x009e:
                if (r1 >= r12) goto L_0x03c9
                int r4 = r11.getIndex(r1)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintLayout.C0405b.C0406a.f1679a
                int r5 = r5.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r5) {
                    case 1: goto L_0x03bd;
                    case 2: goto L_0x03ac;
                    case 3: goto L_0x03a3;
                    case 4: goto L_0x038e;
                    case 5: goto L_0x0385;
                    case 6: goto L_0x037c;
                    case 7: goto L_0x0373;
                    case 8: goto L_0x0362;
                    case 9: goto L_0x0351;
                    case 10: goto L_0x033f;
                    case 11: goto L_0x032d;
                    case 12: goto L_0x031b;
                    case 13: goto L_0x0309;
                    case 14: goto L_0x02f7;
                    case 15: goto L_0x02e5;
                    case 16: goto L_0x02d3;
                    case 17: goto L_0x02c1;
                    case 18: goto L_0x02af;
                    case 19: goto L_0x029d;
                    case 20: goto L_0x028b;
                    case 21: goto L_0x0281;
                    case 22: goto L_0x0277;
                    case 23: goto L_0x026d;
                    case 24: goto L_0x0263;
                    case 25: goto L_0x0259;
                    case 26: goto L_0x024f;
                    case 27: goto L_0x0245;
                    case 28: goto L_0x023b;
                    case 29: goto L_0x0231;
                    case 30: goto L_0x0227;
                    case 31: goto L_0x0218;
                    case 32: goto L_0x020d;
                    case 33: goto L_0x01f6;
                    case 34: goto L_0x01df;
                    case 35: goto L_0x01cf;
                    case 36: goto L_0x01b8;
                    case 37: goto L_0x01a1;
                    case 38: goto L_0x0191;
                    default: goto L_0x00b1;
                }
            L_0x00b1:
                switch(r5) {
                    case 44: goto L_0x00f6;
                    case 45: goto L_0x00ec;
                    case 46: goto L_0x00e2;
                    case 47: goto L_0x00da;
                    case 48: goto L_0x00d2;
                    case 49: goto L_0x00c8;
                    case 50: goto L_0x00be;
                    case 51: goto L_0x00b6;
                    default: goto L_0x00b4;
                }
            L_0x00b4:
                goto L_0x03c5
            L_0x00b6:
                java.lang.String r4 = r11.getString(r4)
                r10.f1633V = r4
                goto L_0x03c5
            L_0x00be:
                int r5 = r10.f1629R
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f1629R = r4
                goto L_0x03c5
            L_0x00c8:
                int r5 = r10.f1628Q
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f1628Q = r4
                goto L_0x03c5
            L_0x00d2:
                int r4 = r11.getInt(r4, r2)
                r10.f1619H = r4
                goto L_0x03c5
            L_0x00da:
                int r4 = r11.getInt(r4, r2)
                r10.f1618G = r4
                goto L_0x03c5
            L_0x00e2:
                float r5 = r10.f1617F
                float r4 = r11.getFloat(r4, r5)
                r10.f1617F = r4
                goto L_0x03c5
            L_0x00ec:
                float r5 = r10.f1616E
                float r4 = r11.getFloat(r4, r5)
                r10.f1616E = r4
                goto L_0x03c5
            L_0x00f6:
                java.lang.String r4 = r11.getString(r4)
                r10.f1613B = r4
                r5 = 2143289344(0x7fc00000, float:NaN)
                r10.f1614C = r5
                r10.f1615D = r0
                if (r4 == 0) goto L_0x03c5
                int r4 = r4.length()
                java.lang.String r5 = r10.f1613B
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L_0x0134
                int r7 = r4 + -1
                if (r5 >= r7) goto L_0x0134
                java.lang.String r7 = r10.f1613B
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0127
                r10.f1615D = r2
                goto L_0x0131
            L_0x0127:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x0131
                r10.f1615D = r6
            L_0x0131:
                int r5 = r5 + 1
                goto L_0x0135
            L_0x0134:
                r5 = 0
            L_0x0135:
                java.lang.String r7 = r10.f1613B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x0180
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x0180
                java.lang.String r4 = r10.f1613B
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r10.f1613B
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03c5
                int r7 = r5.length()
                if (r7 <= 0) goto L_0x03c5
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03c5 }
                float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x03c5 }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03c5
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03c5
                int r7 = r10.f1615D     // Catch:{ NumberFormatException -> 0x03c5 }
                if (r7 != r6) goto L_0x017a
                float r5 = r5 / r4
                float r4 = java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x03c5 }
            L_0x0176:
                r10.f1614C = r4     // Catch:{ NumberFormatException -> 0x03c5 }
                goto L_0x03c5
            L_0x017a:
                float r4 = r4 / r5
                float r4 = java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03c5 }
                goto L_0x0176
            L_0x0180:
                java.lang.String r4 = r10.f1613B
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L_0x03c5
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03c5 }
                goto L_0x0176
            L_0x0191:
                float r5 = r10.f1627P
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.f1627P = r4
                r10.f1621J = r8
                goto L_0x03c5
            L_0x01a1:
                int r5 = r10.f1625N     // Catch:{ Exception -> 0x01ab }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01ab }
                r10.f1625N = r5     // Catch:{ Exception -> 0x01ab }
                goto L_0x03c5
            L_0x01ab:
                int r5 = r10.f1625N
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03c5
                r10.f1625N = r9
                goto L_0x03c5
            L_0x01b8:
                int r5 = r10.f1623L     // Catch:{ Exception -> 0x01c2 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01c2 }
                r10.f1623L = r5     // Catch:{ Exception -> 0x01c2 }
                goto L_0x03c5
            L_0x01c2:
                int r5 = r10.f1623L
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03c5
                r10.f1623L = r9
                goto L_0x03c5
            L_0x01cf:
                float r5 = r10.f1626O
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.f1626O = r4
                r10.f1620I = r8
                goto L_0x03c5
            L_0x01df:
                int r5 = r10.f1624M     // Catch:{ Exception -> 0x01e9 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x01e9 }
                r10.f1624M = r5     // Catch:{ Exception -> 0x01e9 }
                goto L_0x03c5
            L_0x01e9:
                int r5 = r10.f1624M
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03c5
                r10.f1624M = r9
                goto L_0x03c5
            L_0x01f6:
                int r5 = r10.f1622K     // Catch:{ Exception -> 0x0200 }
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x0200 }
                r10.f1622K = r5     // Catch:{ Exception -> 0x0200 }
                goto L_0x03c5
            L_0x0200:
                int r5 = r10.f1622K
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L_0x03c5
                r10.f1622K = r9
                goto L_0x03c5
            L_0x020d:
                int r4 = r11.getInt(r4, r2)
                r10.f1621J = r4
                if (r4 != r6) goto L_0x03c5
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x0222
            L_0x0218:
                int r4 = r11.getInt(r4, r2)
                r10.f1620I = r4
                if (r4 != r6) goto L_0x03c5
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x0222:
                android.util.Log.e(r7, r4)
                goto L_0x03c5
            L_0x0227:
                float r5 = r10.f1612A
                float r4 = r11.getFloat(r4, r5)
                r10.f1612A = r4
                goto L_0x03c5
            L_0x0231:
                float r5 = r10.f1678z
                float r4 = r11.getFloat(r4, r5)
                r10.f1678z = r4
                goto L_0x03c5
            L_0x023b:
                boolean r5 = r10.f1632U
                boolean r4 = r11.getBoolean(r4, r5)
                r10.f1632U = r4
                goto L_0x03c5
            L_0x0245:
                boolean r5 = r10.f1631T
                boolean r4 = r11.getBoolean(r4, r5)
                r10.f1631T = r4
                goto L_0x03c5
            L_0x024f:
                int r5 = r10.f1677y
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1677y = r4
                goto L_0x03c5
            L_0x0259:
                int r5 = r10.f1676x
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1676x = r4
                goto L_0x03c5
            L_0x0263:
                int r5 = r10.f1675w
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1675w = r4
                goto L_0x03c5
            L_0x026d:
                int r5 = r10.f1674v
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1674v = r4
                goto L_0x03c5
            L_0x0277:
                int r5 = r10.f1673u
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1673u = r4
                goto L_0x03c5
            L_0x0281:
                int r5 = r10.f1672t
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1672t = r4
                goto L_0x03c5
            L_0x028b:
                int r5 = r10.f1671s
                int r5 = r11.getResourceId(r4, r5)
                r10.f1671s = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1671s = r4
                goto L_0x03c5
            L_0x029d:
                int r5 = r10.f1670r
                int r5 = r11.getResourceId(r4, r5)
                r10.f1670r = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1670r = r4
                goto L_0x03c5
            L_0x02af:
                int r5 = r10.f1669q
                int r5 = r11.getResourceId(r4, r5)
                r10.f1669q = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1669q = r4
                goto L_0x03c5
            L_0x02c1:
                int r5 = r10.f1668p
                int r5 = r11.getResourceId(r4, r5)
                r10.f1668p = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1668p = r4
                goto L_0x03c5
            L_0x02d3:
                int r5 = r10.f1660l
                int r5 = r11.getResourceId(r4, r5)
                r10.f1660l = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1660l = r4
                goto L_0x03c5
            L_0x02e5:
                int r5 = r10.f1658k
                int r5 = r11.getResourceId(r4, r5)
                r10.f1658k = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1658k = r4
                goto L_0x03c5
            L_0x02f7:
                int r5 = r10.f1656j
                int r5 = r11.getResourceId(r4, r5)
                r10.f1656j = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1656j = r4
                goto L_0x03c5
            L_0x0309:
                int r5 = r10.f1654i
                int r5 = r11.getResourceId(r4, r5)
                r10.f1654i = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1654i = r4
                goto L_0x03c5
            L_0x031b:
                int r5 = r10.f1652h
                int r5 = r11.getResourceId(r4, r5)
                r10.f1652h = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1652h = r4
                goto L_0x03c5
            L_0x032d:
                int r5 = r10.f1650g
                int r5 = r11.getResourceId(r4, r5)
                r10.f1650g = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1650g = r4
                goto L_0x03c5
            L_0x033f:
                int r5 = r10.f1648f
                int r5 = r11.getResourceId(r4, r5)
                r10.f1648f = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1648f = r4
                goto L_0x03c5
            L_0x0351:
                int r5 = r10.f1646e
                int r5 = r11.getResourceId(r4, r5)
                r10.f1646e = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1646e = r4
                goto L_0x03c5
            L_0x0362:
                int r5 = r10.f1644d
                int r5 = r11.getResourceId(r4, r5)
                r10.f1644d = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1644d = r4
                goto L_0x03c5
            L_0x0373:
                float r5 = r10.f1642c
                float r4 = r11.getFloat(r4, r5)
                r10.f1642c = r4
                goto L_0x03c5
            L_0x037c:
                int r5 = r10.f1640b
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f1640b = r4
                goto L_0x03c5
            L_0x0385:
                int r5 = r10.f1638a
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f1638a = r4
                goto L_0x03c5
            L_0x038e:
                float r5 = r10.f1666o
                float r4 = r11.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r10.f1666o = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03c5
                float r4 = r5 - r4
                float r4 = r4 % r5
                r10.f1666o = r4
                goto L_0x03c5
            L_0x03a3:
                int r5 = r10.f1664n
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.f1664n = r4
                goto L_0x03c5
            L_0x03ac:
                int r5 = r10.f1662m
                int r5 = r11.getResourceId(r4, r5)
                r10.f1662m = r5
                if (r5 != r0) goto L_0x03c5
                int r4 = r11.getInt(r4, r0)
                r10.f1662m = r4
                goto L_0x03c5
            L_0x03bd:
                int r5 = r10.f1630S
                int r4 = r11.getInt(r4, r5)
                r10.f1630S = r4
            L_0x03c5:
                int r1 = r1 + 1
                goto L_0x009e
            L_0x03c9:
                r11.recycle()
                r10.mo2236a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0405b.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0405b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo2236a() {
            this.f1637Z = false;
            this.f1634W = true;
            this.f1635X = true;
            int i = this.width;
            if (i == -2 && this.f1631T) {
                this.f1634W = false;
                if (this.f1620I == 0) {
                    this.f1620I = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f1632U) {
                this.f1635X = false;
                if (this.f1621J == 0) {
                    this.f1621J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f1634W = false;
                if (i == 0 && this.f1620I == 1) {
                    this.width = -2;
                    this.f1631T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f1635X = false;
                if (i2 == 0 && this.f1621J == 1) {
                    this.height = -2;
                    this.f1632U = true;
                }
            }
            if (this.f1642c != -1.0f || this.f1638a != -1 || this.f1640b != -1) {
                this.f1637Z = true;
                this.f1634W = true;
                this.f1635X = true;
                if (!(this.f1665n0 instanceof C2836h)) {
                    this.f1665n0 = new C2836h();
                }
                ((C2836h) this.f1665n0).mo9793R0(this.f1630S);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
            if (r1 > 0) goto L_0x00cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d9, code lost:
            if (r1 > 0) goto L_0x00cc;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00eb  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r10) goto L_0x0011
                r10 = 1
                goto L_0x0012
            L_0x0011:
                r10 = 0
            L_0x0012:
                r4 = -1
                r9.f1649f0 = r4
                r9.f1651g0 = r4
                r9.f1645d0 = r4
                r9.f1647e0 = r4
                int r5 = r9.f1672t
                r9.f1653h0 = r5
                int r5 = r9.f1674v
                r9.f1655i0 = r5
                float r5 = r9.f1678z
                r9.f1657j0 = r5
                int r6 = r9.f1638a
                r9.f1659k0 = r6
                int r7 = r9.f1640b
                r9.f1661l0 = r7
                float r8 = r9.f1642c
                r9.f1663m0 = r8
                if (r10 == 0) goto L_0x008c
                int r10 = r9.f1668p
                if (r10 == r4) goto L_0x003d
                r9.f1649f0 = r10
            L_0x003b:
                r2 = 1
                goto L_0x0044
            L_0x003d:
                int r10 = r9.f1669q
                if (r10 == r4) goto L_0x0044
                r9.f1651g0 = r10
                goto L_0x003b
            L_0x0044:
                int r10 = r9.f1670r
                if (r10 == r4) goto L_0x004b
                r9.f1647e0 = r10
                r2 = 1
            L_0x004b:
                int r10 = r9.f1671s
                if (r10 == r4) goto L_0x0052
                r9.f1645d0 = r10
                r2 = 1
            L_0x0052:
                int r10 = r9.f1676x
                if (r10 == r4) goto L_0x0058
                r9.f1655i0 = r10
            L_0x0058:
                int r10 = r9.f1677y
                if (r10 == r4) goto L_0x005e
                r9.f1653h0 = r10
            L_0x005e:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0066
                float r2 = r10 - r5
                r9.f1657j0 = r2
            L_0x0066:
                boolean r2 = r9.f1637Z
                if (r2 == 0) goto L_0x00b0
                int r2 = r9.f1630S
                if (r2 != r3) goto L_0x00b0
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x007c
                float r10 = r10 - r8
                r9.f1663m0 = r10
                r9.f1659k0 = r4
                r9.f1661l0 = r4
                goto L_0x00b0
            L_0x007c:
                if (r6 == r4) goto L_0x0085
                r9.f1661l0 = r6
                r9.f1659k0 = r4
            L_0x0082:
                r9.f1663m0 = r2
                goto L_0x00b0
            L_0x0085:
                if (r7 == r4) goto L_0x00b0
                r9.f1659k0 = r7
                r9.f1661l0 = r4
                goto L_0x0082
            L_0x008c:
                int r10 = r9.f1668p
                if (r10 == r4) goto L_0x0092
                r9.f1647e0 = r10
            L_0x0092:
                int r10 = r9.f1669q
                if (r10 == r4) goto L_0x0098
                r9.f1645d0 = r10
            L_0x0098:
                int r10 = r9.f1670r
                if (r10 == r4) goto L_0x009e
                r9.f1649f0 = r10
            L_0x009e:
                int r10 = r9.f1671s
                if (r10 == r4) goto L_0x00a4
                r9.f1651g0 = r10
            L_0x00a4:
                int r10 = r9.f1676x
                if (r10 == r4) goto L_0x00aa
                r9.f1653h0 = r10
            L_0x00aa:
                int r10 = r9.f1677y
                if (r10 == r4) goto L_0x00b0
                r9.f1655i0 = r10
            L_0x00b0:
                int r10 = r9.f1670r
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f1671s
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f1669q
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f1668p
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f1648f
                if (r10 == r4) goto L_0x00cf
                r9.f1649f0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00dc
                if (r1 <= 0) goto L_0x00dc
            L_0x00cc:
                r9.rightMargin = r1
                goto L_0x00dc
            L_0x00cf:
                int r10 = r9.f1650g
                if (r10 == r4) goto L_0x00dc
                r9.f1651g0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00dc
                if (r1 <= 0) goto L_0x00dc
                goto L_0x00cc
            L_0x00dc:
                int r10 = r9.f1644d
                if (r10 == r4) goto L_0x00eb
                r9.f1645d0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00f8
                if (r0 <= 0) goto L_0x00f8
            L_0x00e8:
                r9.leftMargin = r0
                goto L_0x00f8
            L_0x00eb:
                int r10 = r9.f1646e
                if (r10 == r4) goto L_0x00f8
                r9.f1647e0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00f8
                if (r0 <= 0) goto L_0x00f8
                goto L_0x00e8
            L_0x00f8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0405b.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0407c implements C2885b.C2887b {

        /* renamed from: a */
        ConstraintLayout f1680a;

        /* renamed from: b */
        int f1681b;

        /* renamed from: c */
        int f1682c;

        /* renamed from: d */
        int f1683d;

        /* renamed from: e */
        int f1684e;

        /* renamed from: f */
        int f1685f;

        /* renamed from: g */
        int f1686g;

        public C0407c(ConstraintLayout constraintLayout) {
            this.f1680a = constraintLayout;
        }

        /* renamed from: a */
        public final void mo2238a() {
            int childCount = this.f1680a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1680a.getChildAt(i);
                if (childAt instanceof C0425h) {
                    ((C0425h) childAt).mo2288a(this.f1680a);
                }
            }
            int size = this.f1680a.f1589e.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0411b) this.f1680a.f1589e.get(i2)).mo2246j(this.f1680a);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x016c A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0193  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x01d2  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01dc  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x01e4  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x01e9  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x01ee  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01f6 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x020e A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0220  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x0236  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x0238  */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x0244  */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0140  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x014a  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0154  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0156  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0161  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2239b(p094o.C2830e r20, p100p.C2885b.C2886a r21) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r20.mo9681O()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r20.mo9688W()
                if (r3 != 0) goto L_0x001f
                r2.f9563e = r5
                r2.f9564f = r5
                r2.f9565g = r5
                return
            L_0x001f:
                o.e$b r3 = r2.f9559a
                o.e$b r4 = r2.f9560b
                int r6 = r2.f9561c
                int r7 = r2.f9562d
                int r8 = r0.f1681b
                int r9 = r0.f1682c
                int r8 = r8 + r9
                int r9 = r0.f1683d
                java.lang.Object r10 = r20.mo9717q()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C0404a.f1611a
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r14 = 3
                r5 = 2
                r15 = 1
                if (r12 == r15) goto L_0x00a5
                if (r12 == r5) goto L_0x0098
                if (r12 == r14) goto L_0x0087
                if (r12 == r13) goto L_0x004b
                r6 = 0
            L_0x0049:
                r9 = 0
                goto L_0x00b1
            L_0x004b:
                int r6 = r0.f1685f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f9240l
                if (r9 != r15) goto L_0x0058
                r9 = 1
                goto L_0x0059
            L_0x0058:
                r9 = 0
            L_0x0059:
                int[] r12 = r1.f9232h
                r16 = 0
                r12[r5] = r16
                boolean r13 = r2.f9568j
                if (r13 == 0) goto L_0x00a3
                if (r9 == 0) goto L_0x0071
                r13 = r12[r14]
                if (r13 == 0) goto L_0x0071
                r12 = r12[r16]
                int r13 = r20.mo9682P()
                if (r12 != r13) goto L_0x0075
            L_0x0071:
                boolean r12 = r10 instanceof androidx.constraintlayout.widget.C0425h
                if (r12 == 0) goto L_0x0077
            L_0x0075:
                r12 = 1
                goto L_0x0078
            L_0x0077:
                r12 = 0
            L_0x0078:
                if (r9 == 0) goto L_0x007c
                if (r12 == 0) goto L_0x00a3
            L_0x007c:
                int r6 = r20.mo9682P()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x0049
            L_0x0087:
                int r6 = r0.f1685f
                int r12 = r20.mo9735z()
                int r9 = r9 + r12
                r12 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int[] r9 = r1.f9232h
                r9[r5] = r12
                goto L_0x0049
            L_0x0098:
                int r6 = r0.f1685f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int[] r9 = r1.f9232h
                r9[r5] = r12
            L_0x00a3:
                r9 = 1
                goto L_0x00b1
            L_0x00a5:
                r9 = 1073741824(0x40000000, float:2.0)
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                int[] r9 = r1.f9232h
                r9[r5] = r6
                r6 = r12
                goto L_0x0049
            L_0x00b1:
                int r12 = r4.ordinal()
                r11 = r11[r12]
                if (r11 == r15) goto L_0x011e
                if (r11 == r5) goto L_0x0110
                if (r11 == r14) goto L_0x00fe
                r7 = 4
                if (r11 == r7) goto L_0x00c3
                r7 = 0
                r11 = 0
                goto L_0x0129
            L_0x00c3:
                int r7 = r0.f1686g
                r11 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int r8 = r1.f9242m
                if (r8 != r15) goto L_0x00d0
                r8 = 1
                goto L_0x00d1
            L_0x00d0:
                r8 = 0
            L_0x00d1:
                int[] r11 = r1.f9232h
                r12 = 0
                r11[r14] = r12
                boolean r12 = r2.f9568j
                if (r12 == 0) goto L_0x011b
                if (r8 == 0) goto L_0x00e8
                r12 = r11[r5]
                if (r12 == 0) goto L_0x00e8
                r11 = r11[r15]
                int r12 = r20.mo9727v()
                if (r11 != r12) goto L_0x00ec
            L_0x00e8:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.C0425h
                if (r11 == 0) goto L_0x00ee
            L_0x00ec:
                r11 = 1
                goto L_0x00ef
            L_0x00ee:
                r11 = 0
            L_0x00ef:
                if (r8 == 0) goto L_0x00f3
                if (r11 == 0) goto L_0x011b
            L_0x00f3:
                int r7 = r20.mo9727v()
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                goto L_0x010e
            L_0x00fe:
                int r7 = r0.f1686g
                int r11 = r20.mo9680N()
                int r8 = r8 + r11
                r11 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int[] r8 = r1.f9232h
                r8[r14] = r11
            L_0x010e:
                r11 = r7
                goto L_0x0128
            L_0x0110:
                int r7 = r0.f1686g
                r11 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                int[] r8 = r1.f9232h
                r8[r14] = r11
            L_0x011b:
                r11 = r7
                r7 = 1
                goto L_0x0129
            L_0x011e:
                r8 = 1073741824(0x40000000, float:2.0)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                int[] r8 = r1.f9232h
                r8[r14] = r7
            L_0x0128:
                r7 = 0
            L_0x0129:
                o.e$b r8 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x012f
                r12 = 1
                goto L_0x0130
            L_0x012f:
                r12 = 0
            L_0x0130:
                if (r4 != r8) goto L_0x0134
                r8 = 1
                goto L_0x0135
            L_0x0134:
                r8 = 0
            L_0x0135:
                o.e$b r13 = p094o.C2830e.C2832b.MATCH_PARENT
                if (r4 == r13) goto L_0x0140
                o.e$b r14 = p094o.C2830e.C2832b.FIXED
                if (r4 != r14) goto L_0x013e
                goto L_0x0140
            L_0x013e:
                r4 = 0
                goto L_0x0141
            L_0x0140:
                r4 = 1
            L_0x0141:
                if (r3 == r13) goto L_0x014a
                o.e$b r13 = p094o.C2830e.C2832b.FIXED
                if (r3 != r13) goto L_0x0148
                goto L_0x014a
            L_0x0148:
                r3 = 0
                goto L_0x014b
            L_0x014a:
                r3 = 1
            L_0x014b:
                r13 = 0
                if (r12 == 0) goto L_0x0156
                float r14 = r1.f9208Q
                int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
                if (r14 <= 0) goto L_0x0156
                r14 = 1
                goto L_0x0157
            L_0x0156:
                r14 = 0
            L_0x0157:
                if (r8 == 0) goto L_0x0161
                float r15 = r1.f9208Q
                int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r13 <= 0) goto L_0x0161
                r13 = 1
                goto L_0x0162
            L_0x0161:
                r13 = 0
            L_0x0162:
                android.view.ViewGroup$LayoutParams r15 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$b r15 = (androidx.constraintlayout.widget.ConstraintLayout.C0405b) r15
                boolean r5 = r2.f9568j
                if (r5 != 0) goto L_0x0181
                if (r12 == 0) goto L_0x0181
                int r5 = r1.f9240l
                if (r5 != 0) goto L_0x0181
                if (r8 == 0) goto L_0x0181
                int r5 = r1.f9242m
                if (r5 == 0) goto L_0x0179
                goto L_0x0181
            L_0x0179:
                r0 = 0
                r3 = 0
                r4 = 0
                r5 = -1
                r16 = 0
                goto L_0x0234
            L_0x0181:
                boolean r5 = r10 instanceof androidx.constraintlayout.widget.C0428k
                if (r5 == 0) goto L_0x0193
                boolean r5 = r1 instanceof p094o.C2841l
                if (r5 == 0) goto L_0x0193
                r5 = r1
                o.l r5 = (p094o.C2841l) r5
                r8 = r10
                androidx.constraintlayout.widget.k r8 = (androidx.constraintlayout.widget.C0428k) r8
                r8.mo2168n(r5, r6, r11)
                goto L_0x0196
            L_0x0193:
                r10.measure(r6, r11)
            L_0x0196:
                int r5 = r10.getMeasuredWidth()
                int r8 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                if (r9 == 0) goto L_0x01af
                int[] r9 = r1.f9232h
                r16 = 0
                r9[r16] = r5
                r18 = 2
                r9[r18] = r8
                goto L_0x01b9
            L_0x01af:
                r16 = 0
                r18 = 2
                int[] r9 = r1.f9232h
                r9[r16] = r16
                r9[r18] = r16
            L_0x01b9:
                if (r7 == 0) goto L_0x01c5
                int[] r7 = r1.f9232h
                r9 = 1
                r7[r9] = r8
                r17 = 3
                r7[r17] = r5
                goto L_0x01ce
            L_0x01c5:
                r9 = 1
                r17 = 3
                int[] r7 = r1.f9232h
                r7[r9] = r16
                r7[r17] = r16
            L_0x01ce:
                int r7 = r1.f9246o
                if (r7 <= 0) goto L_0x01d7
                int r7 = java.lang.Math.max(r7, r5)
                goto L_0x01d8
            L_0x01d7:
                r7 = r5
            L_0x01d8:
                int r9 = r1.f9248p
                if (r9 <= 0) goto L_0x01e0
                int r7 = java.lang.Math.min(r9, r7)
            L_0x01e0:
                int r9 = r1.f9252r
                if (r9 <= 0) goto L_0x01e9
                int r9 = java.lang.Math.max(r9, r8)
                goto L_0x01ea
            L_0x01e9:
                r9 = r8
            L_0x01ea:
                int r0 = r1.f9254s
                if (r0 <= 0) goto L_0x01f2
                int r9 = java.lang.Math.min(r0, r9)
            L_0x01f2:
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r14 == 0) goto L_0x0201
                if (r4 == 0) goto L_0x0201
                float r3 = r1.f9208Q
                float r4 = (float) r9
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r7 = r0
                goto L_0x020c
            L_0x0201:
                if (r13 == 0) goto L_0x020c
                if (r3 == 0) goto L_0x020c
                float r3 = r1.f9208Q
                float r4 = (float) r7
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r9 = r0
            L_0x020c:
                if (r5 != r7) goto L_0x0216
                if (r8 == r9) goto L_0x0211
                goto L_0x0216
            L_0x0211:
                r0 = r7
                r3 = r9
                r4 = r12
            L_0x0214:
                r5 = -1
                goto L_0x0234
            L_0x0216:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r5 == r7) goto L_0x021e
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
            L_0x021e:
                if (r8 == r9) goto L_0x0224
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            L_0x0224:
                r10.measure(r6, r11)
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                goto L_0x0214
            L_0x0234:
                if (r4 == r5) goto L_0x0238
                r5 = 1
                goto L_0x0239
            L_0x0238:
                r5 = 0
            L_0x0239:
                int r6 = r2.f9561c
                if (r0 != r6) goto L_0x0244
                int r6 = r2.f9562d
                if (r3 == r6) goto L_0x0242
                goto L_0x0244
            L_0x0242:
                r6 = 0
                goto L_0x0245
            L_0x0244:
                r6 = 1
            L_0x0245:
                r2.f9567i = r6
                boolean r6 = r15.f1636Y
                if (r6 == 0) goto L_0x024d
                r9 = 1
                goto L_0x024e
            L_0x024d:
                r9 = r5
            L_0x024e:
                if (r9 == 0) goto L_0x025c
                r5 = -1
                if (r4 == r5) goto L_0x025c
                int r1 = r20.mo9711n()
                if (r1 == r4) goto L_0x025c
                r1 = 1
                r2.f9567i = r1
            L_0x025c:
                r2.f9563e = r0
                r2.f9564f = r3
                r2.f9566h = r9
                r2.f9565g = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0407c.mo2239b(o.e, p.b$a):void");
        }

        /* renamed from: c */
        public void mo2240c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f1681b = i3;
            this.f1682c = i4;
            this.f1683d = i5;
            this.f1684e = i6;
            this.f1685f = i;
            this.f1686g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1912j(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1912j(attributeSet, i, 0);
    }

    /* renamed from: g */
    private final C2830e m1911g(int i) {
        if (i == 0) {
            return this.f1590f;
        }
        View view = this.f1588d.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1590f;
        }
        if (view == null) {
            return null;
        }
        return ((C0405b) view.getLayoutParams()).f1665n0;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    /* renamed from: j */
    private void m1912j(AttributeSet attributeSet, int i, int i2) {
        this.f1590f.mo9694c0(this);
        this.f1590f.mo9753f1(this.f1608x);
        this.f1588d.put(getId(), this);
        this.f1597m = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0427j.f2011a1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0427j.f2081k1) {
                    this.f1591g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1591g);
                } else if (index == C0427j.f2088l1) {
                    this.f1592h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1592h);
                } else if (index == C0427j.f2067i1) {
                    this.f1593i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1593i);
                } else if (index == C0427j.f2074j1) {
                    this.f1594j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1594j);
                } else if (index == C0427j.f1922L2) {
                    this.f1596l = obtainStyledAttributes.getInt(index, this.f1596l);
                } else if (index == C0427j.f1927M1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2216m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1598n = null;
                        }
                    }
                } else if (index == C0427j.f2137s1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0415d dVar = new C0415d();
                        this.f1597m = dVar;
                        dVar.mo2262l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1597m = null;
                    }
                    this.f1599o = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1590f.mo9754g1(this.f1596l);
    }

    /* renamed from: l */
    private void m1913l() {
        this.f1595k = true;
        this.f1601q = -1;
        this.f1602r = -1;
        this.f1603s = -1;
        this.f1604t = -1;
        this.f1605u = 0;
        this.f1606v = 0;
    }

    /* renamed from: p */
    private void m1914p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C2830e i2 = mo2214i(getChildAt(i));
            if (i2 != null) {
                i2.mo9690Y();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo2223q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m1911g(childAt.getId()).mo9695d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1599o != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.f1599o && (childAt2 instanceof C0421e)) {
                    this.f1597m = ((C0421e) childAt2).getConstraintSet();
                }
            }
        }
        C0415d dVar = this.f1597m;
        if (dVar != null) {
            dVar.mo2257d(this, true);
        }
        this.f1590f.mo9818M0();
        int size = this.f1589e.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f1589e.get(i5).mo2248l(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof C0425h) {
                ((C0425h) childAt3).mo2289b(this);
            }
        }
        this.f1607w.clear();
        this.f1607w.put(0, this.f1590f);
        this.f1607w.put(getId(), this.f1590f);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.f1607w.put(childAt4.getId(), mo2214i(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            C2830e i9 = mo2214i(childAt5);
            if (i9 != null) {
                this.f1590f.mo9819a(i9);
                mo2198c(isInEditMode, childAt5, i9, (C0405b) childAt5.getLayoutParams(), this.f1607w);
            }
        }
    }

    /* renamed from: s */
    private boolean m1915s() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m1914p();
        }
        return z;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2198c(boolean r19, android.view.View r20, p094o.C2830e r21, androidx.constraintlayout.widget.ConstraintLayout.C0405b r22, android.util.SparseArray<p094o.C2830e> r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r22.mo2236a()
            r10 = 0
            r8.f1667o0 = r10
            int r2 = r20.getVisibility()
            r7.mo9664D0(r2)
            boolean r2 = r8.f1641b0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.mo9716p0(r11)
            r2 = 8
            r7.mo9664D0(r2)
        L_0x0024:
            r7.mo9694c0(r1)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.C0411b
            if (r2 == 0) goto L_0x0036
            androidx.constraintlayout.widget.b r1 = (androidx.constraintlayout.widget.C0411b) r1
            o.f r2 = r0.f1590f
            boolean r2 = r2.mo9749a1()
            r1.mo2167h(r7, r2)
        L_0x0036:
            boolean r1 = r8.f1637Z
            r12 = -1
            if (r1 == 0) goto L_0x005d
            r1 = r7
            o.h r1 = (p094o.C2836h) r1
            int r2 = r8.f1659k0
            int r3 = r8.f1661l0
            float r4 = r8.f1663m0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x004f
            r1.mo9792Q0(r4)
            goto L_0x026d
        L_0x004f:
            if (r2 == r12) goto L_0x0056
            r1.mo9790O0(r2)
            goto L_0x026d
        L_0x0056:
            if (r3 == r12) goto L_0x026d
            r1.mo9791P0(r3)
            goto L_0x026d
        L_0x005d:
            int r1 = r8.f1645d0
            int r2 = r8.f1647e0
            int r13 = r8.f1649f0
            int r14 = r8.f1651g0
            int r6 = r8.f1653h0
            int r15 = r8.f1655i0
            float r5 = r8.f1657j0
            int r3 = r8.f1662m
            if (r3 == r12) goto L_0x0080
            java.lang.Object r1 = r9.get(r3)
            o.e r1 = (p094o.C2830e) r1
            if (r1 == 0) goto L_0x01a4
            float r2 = r8.f1666o
            int r3 = r8.f1664n
            r7.mo9705k(r1, r2, r3)
            goto L_0x01a4
        L_0x0080:
            if (r1 == r12) goto L_0x009c
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            o.e r3 = (p094o.C2830e) r3
            if (r3 == 0) goto L_0x0099
            o.d$b r4 = p094o.C2827d.C2829b.LEFT
            int r2 = r8.leftMargin
            r1 = r21
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            goto L_0x00b1
        L_0x0099:
            r17 = r5
            goto L_0x00b4
        L_0x009c:
            r17 = r5
            if (r2 == r12) goto L_0x00b4
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            o.e r3 = (p094o.C2830e) r3
            if (r3 == 0) goto L_0x00b4
            o.d$b r2 = p094o.C2827d.C2829b.LEFT
            o.d$b r4 = p094o.C2827d.C2829b.RIGHT
            int r5 = r8.leftMargin
            r1 = r21
        L_0x00b1:
            r1.mo9686T(r2, r3, r4, r5, r6)
        L_0x00b4:
            if (r13 == r12) goto L_0x00c8
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            o.e r3 = (p094o.C2830e) r3
            if (r3 == 0) goto L_0x00de
            o.d$b r2 = p094o.C2827d.C2829b.RIGHT
            o.d$b r4 = p094o.C2827d.C2829b.LEFT
            int r5 = r8.rightMargin
            r1 = r21
            goto L_0x00da
        L_0x00c8:
            if (r14 == r12) goto L_0x00de
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            o.e r3 = (p094o.C2830e) r3
            if (r3 == 0) goto L_0x00de
            o.d$b r4 = p094o.C2827d.C2829b.RIGHT
            int r5 = r8.rightMargin
            r1 = r21
            r2 = r4
        L_0x00da:
            r6 = r15
            r1.mo9686T(r2, r3, r4, r5, r6)
        L_0x00de:
            int r1 = r8.f1652h
            if (r1 == r12) goto L_0x00f5
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            o.e r3 = (p094o.C2830e) r3
            if (r3 == 0) goto L_0x010f
            o.d$b r4 = p094o.C2827d.C2829b.TOP
            int r5 = r8.topMargin
            int r6 = r8.f1673u
            r1 = r21
            r2 = r4
            goto L_0x010c
        L_0x00f5:
            int r1 = r8.f1654i
            if (r1 == r12) goto L_0x010f
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            o.e r3 = (p094o.C2830e) r3
            if (r3 == 0) goto L_0x010f
            o.d$b r2 = p094o.C2827d.C2829b.TOP
            o.d$b r4 = p094o.C2827d.C2829b.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.f1673u
            r1 = r21
        L_0x010c:
            r1.mo9686T(r2, r3, r4, r5, r6)
        L_0x010f:
            int r1 = r8.f1656j
            if (r1 == r12) goto L_0x0127
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            o.e r3 = (p094o.C2830e) r3
            if (r3 == 0) goto L_0x0140
            o.d$b r2 = p094o.C2827d.C2829b.BOTTOM
            o.d$b r4 = p094o.C2827d.C2829b.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.f1675w
            r1 = r21
            goto L_0x013d
        L_0x0127:
            int r1 = r8.f1658k
            if (r1 == r12) goto L_0x0140
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            o.e r3 = (p094o.C2830e) r3
            if (r3 == 0) goto L_0x0140
            o.d$b r4 = p094o.C2827d.C2829b.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.f1675w
            r1 = r21
            r2 = r4
        L_0x013d:
            r1.mo9686T(r2, r3, r4, r5, r6)
        L_0x0140:
            int r1 = r8.f1660l
            if (r1 == r12) goto L_0x0191
            android.util.SparseArray<android.view.View> r2 = r0.f1588d
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f1660l
            java.lang.Object r2 = r9.get(r2)
            o.e r2 = (p094o.C2830e) r2
            if (r2 == 0) goto L_0x0191
            if (r1 == 0) goto L_0x0191
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0405b
            if (r3 == 0) goto L_0x0191
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0405b) r1
            r8.f1636Y = r11
            r1.f1636Y = r11
            o.d$b r3 = p094o.C2827d.C2829b.BASELINE
            o.d r4 = r7.mo9709m(r3)
            o.d r2 = r2.mo9709m(r3)
            r4.mo9643b(r2, r10, r12, r11)
            r7.mo9699g0(r11)
            o.e r1 = r1.f1665n0
            r1.mo9699g0(r11)
            o.d$b r1 = p094o.C2827d.C2829b.TOP
            o.d r1 = r7.mo9709m(r1)
            r1.mo9653l()
            o.d$b r1 = p094o.C2827d.C2829b.BOTTOM
            o.d r1 = r7.mo9709m(r1)
            r1.mo9653l()
        L_0x0191:
            r1 = 0
            r2 = r17
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x019b
            r7.mo9702i0(r2)
        L_0x019b:
            float r2 = r8.f1612A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x01a4
            r7.mo9732x0(r2)
        L_0x01a4:
            if (r19 == 0) goto L_0x01b3
            int r1 = r8.f1628Q
            if (r1 != r12) goto L_0x01ae
            int r2 = r8.f1629R
            if (r2 == r12) goto L_0x01b3
        L_0x01ae:
            int r2 = r8.f1629R
            r7.mo9728v0(r1, r2)
        L_0x01b3:
            boolean r1 = r8.f1634W
            r2 = -2
            if (r1 != 0) goto L_0x01e6
            int r1 = r8.width
            if (r1 != r12) goto L_0x01dd
            boolean r1 = r8.f1631T
            if (r1 == 0) goto L_0x01c3
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            goto L_0x01c5
        L_0x01c3:
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_PARENT
        L_0x01c5:
            r7.mo9708l0(r1)
            o.d$b r1 = p094o.C2827d.C2829b.LEFT
            o.d r1 = r7.mo9709m(r1)
            int r3 = r8.leftMargin
            r1.f9177e = r3
            o.d$b r1 = p094o.C2827d.C2829b.RIGHT
            o.d r1 = r7.mo9709m(r1)
            int r3 = r8.rightMargin
            r1.f9177e = r3
            goto L_0x01f9
        L_0x01dd:
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            r7.mo9708l0(r1)
            r7.mo9666E0(r10)
            goto L_0x01f9
        L_0x01e6:
            o.e$b r1 = p094o.C2830e.C2832b.FIXED
            r7.mo9708l0(r1)
            int r1 = r8.width
            r7.mo9666E0(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x01f9
            o.e$b r1 = p094o.C2830e.C2832b.WRAP_CONTENT
            r7.mo9708l0(r1)
        L_0x01f9:
            boolean r1 = r8.f1635X
            if (r1 != 0) goto L_0x022b
            int r1 = r8.height
            if (r1 != r12) goto L_0x0222
            boolean r1 = r8.f1632U
            if (r1 == 0) goto L_0x0208
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            goto L_0x020a
        L_0x0208:
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_PARENT
        L_0x020a:
            r7.mo9658A0(r1)
            o.d$b r1 = p094o.C2827d.C2829b.TOP
            o.d r1 = r7.mo9709m(r1)
            int r2 = r8.topMargin
            r1.f9177e = r2
            o.d$b r1 = p094o.C2827d.C2829b.BOTTOM
            o.d r1 = r7.mo9709m(r1)
            int r2 = r8.bottomMargin
            r1.f9177e = r2
            goto L_0x023e
        L_0x0222:
            o.e$b r1 = p094o.C2830e.C2832b.MATCH_CONSTRAINT
            r7.mo9658A0(r1)
            r7.mo9700h0(r10)
            goto L_0x023e
        L_0x022b:
            o.e$b r1 = p094o.C2830e.C2832b.FIXED
            r7.mo9658A0(r1)
            int r1 = r8.height
            r7.mo9700h0(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x023e
            o.e$b r1 = p094o.C2830e.C2832b.WRAP_CONTENT
            r7.mo9658A0(r1)
        L_0x023e:
            java.lang.String r1 = r8.f1613B
            r7.mo9697e0(r1)
            float r1 = r8.f1616E
            r7.mo9712n0(r1)
            float r1 = r8.f1617F
            r7.mo9662C0(r1)
            int r1 = r8.f1618G
            r7.mo9704j0(r1)
            int r1 = r8.f1619H
            r7.mo9734y0(r1)
            int r1 = r8.f1620I
            int r2 = r8.f1622K
            int r3 = r8.f1624M
            float r4 = r8.f1626O
            r7.mo9710m0(r1, r2, r3, r4)
            int r1 = r8.f1621J
            int r2 = r8.f1623L
            int r3 = r8.f1625N
            float r4 = r8.f1627P
            r7.mo9660B0(r1, r2, r3, r4)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo2198c(boolean, android.view.View, o.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0405b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0405b generateDefaultLayoutParams() {
        return new C0405b(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<C0411b> arrayList = this.f1589e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f1589e.get(i).mo2247k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public C0405b generateLayoutParams(AttributeSet attributeSet) {
        return new C0405b(getContext(), attributeSet);
    }

    /* renamed from: f */
    public Object mo2203f(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1600p;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1600p.get(str);
    }

    public void forceLayout() {
        m1913l();
        super.forceLayout();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0405b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1594j;
    }

    public int getMaxWidth() {
        return this.f1593i;
    }

    public int getMinHeight() {
        return this.f1592h;
    }

    public int getMinWidth() {
        return this.f1591g;
    }

    public int getOptimizationLevel() {
        return this.f1590f.mo9744V0();
    }

    /* renamed from: h */
    public View mo2213h(int i) {
        return this.f1588d.get(i);
    }

    /* renamed from: i */
    public final C2830e mo2214i(View view) {
        if (view == this) {
            return this.f1590f;
        }
        if (view == null) {
            return null;
        }
        return ((C0405b) view.getLayoutParams()).f1665n0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo2215k() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2216m(int i) {
        this.f1598n = new C0412c(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo2217n(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0407c cVar = this.f1608x;
        int i5 = cVar.f1684e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + cVar.f1683d, i, 0);
        int min = Math.min(this.f1593i, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1594j, ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f1601q = min;
        this.f1602r = min2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo2218o(C2833f fVar, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1608x.mo2240c(i2, i3, max, max2, paddingWidth, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? mo2215k() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        mo2224r(fVar, mode, i5, mode2, i6);
        fVar.mo9751c1(i, mode, i5, mode2, i6, this.f1601q, this.f1602r, max5, max);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0405b bVar = (C0405b) childAt.getLayoutParams();
            C2830e eVar = bVar.f1665n0;
            if ((childAt.getVisibility() != 8 || bVar.f1637Z || bVar.f1639a0 || bVar.f1643c0 || isInEditMode) && !bVar.f1641b0) {
                int Q = eVar.mo9683Q();
                int R = eVar.mo9684R();
                int P = eVar.mo9682P() + Q;
                int v = eVar.mo9727v() + R;
                childAt.layout(Q, R, P, v);
                if ((childAt instanceof C0425h) && (content = ((C0425h) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(Q, R, P, v);
                }
            }
        }
        int size = this.f1589e.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f1589e.get(i6).mo2245i(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f1609y = i;
        this.f1610z = i2;
        this.f1590f.mo9755h1(mo2215k());
        if (this.f1595k) {
            this.f1595k = false;
            if (m1915s()) {
                this.f1590f.mo9757j1();
            }
        }
        mo2218o(this.f1590f, this.f1596l, i, i2);
        mo2217n(i, i2, this.f1590f.mo9682P(), this.f1590f.mo9727v(), this.f1590f.mo9750b1(), this.f1590f.mo9748Z0());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C2830e i = mo2214i(view);
        if ((view instanceof C0424g) && !(i instanceof C2836h)) {
            C0405b bVar = (C0405b) view.getLayoutParams();
            C2836h hVar = new C2836h();
            bVar.f1665n0 = hVar;
            bVar.f1637Z = true;
            hVar.mo9793R0(bVar.f1630S);
        }
        if (view instanceof C0411b) {
            C0411b bVar2 = (C0411b) view;
            bVar2.mo2249m();
            ((C0405b) view.getLayoutParams()).f1639a0 = true;
            if (!this.f1589e.contains(bVar2)) {
                this.f1589e.add(bVar2);
            }
        }
        this.f1588d.put(view.getId(), view);
        this.f1595k = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1588d.remove(view.getId());
        this.f1590f.mo9817L0(mo2214i(view));
        this.f1589e.remove(view);
        this.f1595k = true;
    }

    /* renamed from: q */
    public void mo2223q(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1600p == null) {
                this.f1600p = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1600p.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2224r(p094o.C2833f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f1608x
            int r1 = r0.f1684e
            int r0 = r0.f1683d
            o.e$b r2 = p094o.C2830e.C2832b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L_0x0028
            if (r9 == 0) goto L_0x0023
            if (r9 == r4) goto L_0x001a
            r9 = r2
        L_0x0018:
            r10 = 0
            goto L_0x0032
        L_0x001a:
            int r9 = r7.f1593i
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L_0x0032
        L_0x0023:
            o.e$b r9 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0018
            goto L_0x002c
        L_0x0028:
            o.e$b r9 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0032
        L_0x002c:
            int r10 = r7.f1591g
            int r10 = java.lang.Math.max(r6, r10)
        L_0x0032:
            if (r11 == r5) goto L_0x0047
            if (r11 == 0) goto L_0x0042
            if (r11 == r4) goto L_0x003a
        L_0x0038:
            r12 = 0
            goto L_0x0051
        L_0x003a:
            int r11 = r7.f1594j
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L_0x0051
        L_0x0042:
            o.e$b r2 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0038
            goto L_0x004b
        L_0x0047:
            o.e$b r2 = p094o.C2830e.C2832b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0051
        L_0x004b:
            int r11 = r7.f1592h
            int r12 = java.lang.Math.max(r6, r11)
        L_0x0051:
            int r11 = r8.mo9682P()
            if (r10 != r11) goto L_0x005d
            int r11 = r8.mo9727v()
            if (r12 == r11) goto L_0x0060
        L_0x005d:
            r8.mo9747Y0()
        L_0x0060:
            r8.mo9668F0(r6)
            r8.mo9670G0(r6)
            int r11 = r7.f1593i
            int r11 = r11 - r0
            r8.mo9722s0(r11)
            int r11 = r7.f1594j
            int r11 = r11 - r1
            r8.mo9720r0(r11)
            r8.mo9726u0(r6)
            r8.mo9724t0(r6)
            r8.mo9708l0(r9)
            r8.mo9666E0(r10)
            r8.mo9658A0(r2)
            r8.mo9700h0(r12)
            int r9 = r7.f1591g
            int r9 = r9 - r0
            r8.mo9726u0(r9)
            int r9 = r7.f1592h
            int r9 = r9 - r1
            r8.mo9724t0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo2224r(o.f, int, int, int, int):void");
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        m1913l();
        super.requestLayout();
    }

    public void setConstraintSet(C0415d dVar) {
        this.f1597m = dVar;
    }

    public void setId(int i) {
        this.f1588d.remove(getId());
        super.setId(i);
        this.f1588d.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1594j) {
            this.f1594j = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1593i) {
            this.f1593i = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1592h) {
            this.f1592h = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1591g) {
            this.f1591g = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0423f fVar) {
        C0412c cVar = this.f1598n;
        if (cVar != null) {
            cVar.mo2254c(fVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1596l = i;
        this.f1590f.mo9754g1(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
