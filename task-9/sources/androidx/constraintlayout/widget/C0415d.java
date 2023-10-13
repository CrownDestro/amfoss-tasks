package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0421e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p076l.C2458a;
import p082m.C2495a;

/* renamed from: androidx.constraintlayout.widget.d */
public class C0415d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f1727d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f1728e;

    /* renamed from: a */
    private HashMap<String, C0408a> f1729a = new HashMap<>();

    /* renamed from: b */
    private boolean f1730b = true;

    /* renamed from: c */
    private HashMap<Integer, C0416a> f1731c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    public static class C0416a {

        /* renamed from: a */
        int f1732a;

        /* renamed from: b */
        public final C0419d f1733b = new C0419d();

        /* renamed from: c */
        public final C0418c f1734c = new C0418c();

        /* renamed from: d */
        public final C0417b f1735d = new C0417b();

        /* renamed from: e */
        public final C0420e f1736e = new C0420e();

        /* renamed from: f */
        public HashMap<String, C0408a> f1737f = new HashMap<>();

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m1971f(int i, ConstraintLayout.C0405b bVar) {
            this.f1732a = i;
            C0417b bVar2 = this.f1735d;
            bVar2.f1779h = bVar.f1644d;
            bVar2.f1781i = bVar.f1646e;
            bVar2.f1783j = bVar.f1648f;
            bVar2.f1785k = bVar.f1650g;
            bVar2.f1786l = bVar.f1652h;
            bVar2.f1787m = bVar.f1654i;
            bVar2.f1788n = bVar.f1656j;
            bVar2.f1789o = bVar.f1658k;
            bVar2.f1790p = bVar.f1660l;
            bVar2.f1791q = bVar.f1668p;
            bVar2.f1792r = bVar.f1669q;
            bVar2.f1793s = bVar.f1670r;
            bVar2.f1794t = bVar.f1671s;
            bVar2.f1795u = bVar.f1678z;
            bVar2.f1796v = bVar.f1612A;
            bVar2.f1797w = bVar.f1613B;
            bVar2.f1798x = bVar.f1662m;
            bVar2.f1799y = bVar.f1664n;
            bVar2.f1800z = bVar.f1666o;
            bVar2.f1739A = bVar.f1628Q;
            bVar2.f1740B = bVar.f1629R;
            bVar2.f1741C = bVar.f1630S;
            bVar2.f1777g = bVar.f1642c;
            bVar2.f1773e = bVar.f1638a;
            bVar2.f1775f = bVar.f1640b;
            bVar2.f1769c = bVar.width;
            bVar2.f1771d = bVar.height;
            bVar2.f1742D = bVar.leftMargin;
            bVar2.f1743E = bVar.rightMargin;
            bVar2.f1744F = bVar.topMargin;
            bVar2.f1745G = bVar.bottomMargin;
            bVar2.f1754P = bVar.f1617F;
            bVar2.f1755Q = bVar.f1616E;
            bVar2.f1757S = bVar.f1619H;
            bVar2.f1756R = bVar.f1618G;
            bVar2.f1780h0 = bVar.f1631T;
            bVar2.f1782i0 = bVar.f1632U;
            bVar2.f1758T = bVar.f1620I;
            bVar2.f1759U = bVar.f1621J;
            bVar2.f1760V = bVar.f1624M;
            bVar2.f1761W = bVar.f1625N;
            bVar2.f1762X = bVar.f1622K;
            bVar2.f1763Y = bVar.f1623L;
            bVar2.f1764Z = bVar.f1626O;
            bVar2.f1766a0 = bVar.f1627P;
            bVar2.f1778g0 = bVar.f1633V;
            bVar2.f1749K = bVar.f1673u;
            bVar2.f1751M = bVar.f1675w;
            bVar2.f1748J = bVar.f1672t;
            bVar2.f1750L = bVar.f1674v;
            bVar2.f1753O = bVar.f1676x;
            bVar2.f1752N = bVar.f1677y;
            bVar2.f1746H = bVar.getMarginEnd();
            this.f1735d.f1747I = bVar.getMarginStart();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m1972g(int i, C0421e.C0422a aVar) {
            m1971f(i, aVar);
            this.f1733b.f1812d = aVar.f1831p0;
            C0420e eVar = this.f1736e;
            eVar.f1816b = aVar.f1834s0;
            eVar.f1817c = aVar.f1835t0;
            eVar.f1818d = aVar.f1836u0;
            eVar.f1819e = aVar.f1837v0;
            eVar.f1820f = aVar.f1838w0;
            eVar.f1821g = aVar.f1839x0;
            eVar.f1822h = aVar.f1840y0;
            eVar.f1823i = aVar.f1841z0;
            eVar.f1824j = aVar.f1829A0;
            eVar.f1825k = aVar.f1830B0;
            eVar.f1827m = aVar.f1833r0;
            eVar.f1826l = aVar.f1832q0;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m1973h(C0411b bVar, int i, C0421e.C0422a aVar) {
            m1972g(i, aVar);
            if (bVar instanceof Barrier) {
                C0417b bVar2 = this.f1735d;
                bVar2.f1772d0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f1768b0 = barrier.getType();
                this.f1735d.f1774e0 = barrier.getReferencedIds();
                this.f1735d.f1770c0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void mo2265d(ConstraintLayout.C0405b bVar) {
            C0417b bVar2 = this.f1735d;
            bVar.f1644d = bVar2.f1779h;
            bVar.f1646e = bVar2.f1781i;
            bVar.f1648f = bVar2.f1783j;
            bVar.f1650g = bVar2.f1785k;
            bVar.f1652h = bVar2.f1786l;
            bVar.f1654i = bVar2.f1787m;
            bVar.f1656j = bVar2.f1788n;
            bVar.f1658k = bVar2.f1789o;
            bVar.f1660l = bVar2.f1790p;
            bVar.f1668p = bVar2.f1791q;
            bVar.f1669q = bVar2.f1792r;
            bVar.f1670r = bVar2.f1793s;
            bVar.f1671s = bVar2.f1794t;
            bVar.leftMargin = bVar2.f1742D;
            bVar.rightMargin = bVar2.f1743E;
            bVar.topMargin = bVar2.f1744F;
            bVar.bottomMargin = bVar2.f1745G;
            bVar.f1676x = bVar2.f1753O;
            bVar.f1677y = bVar2.f1752N;
            bVar.f1673u = bVar2.f1749K;
            bVar.f1675w = bVar2.f1751M;
            bVar.f1678z = bVar2.f1795u;
            bVar.f1612A = bVar2.f1796v;
            bVar.f1662m = bVar2.f1798x;
            bVar.f1664n = bVar2.f1799y;
            bVar.f1666o = bVar2.f1800z;
            bVar.f1613B = bVar2.f1797w;
            bVar.f1628Q = bVar2.f1739A;
            bVar.f1629R = bVar2.f1740B;
            bVar.f1617F = bVar2.f1754P;
            bVar.f1616E = bVar2.f1755Q;
            bVar.f1619H = bVar2.f1757S;
            bVar.f1618G = bVar2.f1756R;
            bVar.f1631T = bVar2.f1780h0;
            bVar.f1632U = bVar2.f1782i0;
            bVar.f1620I = bVar2.f1758T;
            bVar.f1621J = bVar2.f1759U;
            bVar.f1624M = bVar2.f1760V;
            bVar.f1625N = bVar2.f1761W;
            bVar.f1622K = bVar2.f1762X;
            bVar.f1623L = bVar2.f1763Y;
            bVar.f1626O = bVar2.f1764Z;
            bVar.f1627P = bVar2.f1766a0;
            bVar.f1630S = bVar2.f1741C;
            bVar.f1642c = bVar2.f1777g;
            bVar.f1638a = bVar2.f1773e;
            bVar.f1640b = bVar2.f1775f;
            bVar.width = bVar2.f1769c;
            bVar.height = bVar2.f1771d;
            String str = bVar2.f1778g0;
            if (str != null) {
                bVar.f1633V = str;
            }
            bVar.setMarginStart(bVar2.f1747I);
            bVar.setMarginEnd(this.f1735d.f1746H);
            bVar.mo2236a();
        }

        /* renamed from: e */
        public C0416a clone() {
            C0416a aVar = new C0416a();
            aVar.f1735d.mo2267a(this.f1735d);
            aVar.f1734c.mo2269a(this.f1734c);
            aVar.f1733b.mo2271a(this.f1733b);
            aVar.f1736e.mo2273a(this.f1736e);
            aVar.f1732a = this.f1732a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    public static class C0417b {

        /* renamed from: k0 */
        private static SparseIntArray f1738k0;

        /* renamed from: A */
        public int f1739A = -1;

        /* renamed from: B */
        public int f1740B = -1;

        /* renamed from: C */
        public int f1741C = -1;

        /* renamed from: D */
        public int f1742D = -1;

        /* renamed from: E */
        public int f1743E = -1;

        /* renamed from: F */
        public int f1744F = -1;

        /* renamed from: G */
        public int f1745G = -1;

        /* renamed from: H */
        public int f1746H = -1;

        /* renamed from: I */
        public int f1747I = -1;

        /* renamed from: J */
        public int f1748J = -1;

        /* renamed from: K */
        public int f1749K = -1;

        /* renamed from: L */
        public int f1750L = -1;

        /* renamed from: M */
        public int f1751M = -1;

        /* renamed from: N */
        public int f1752N = -1;

        /* renamed from: O */
        public int f1753O = -1;

        /* renamed from: P */
        public float f1754P = -1.0f;

        /* renamed from: Q */
        public float f1755Q = -1.0f;

        /* renamed from: R */
        public int f1756R = 0;

        /* renamed from: S */
        public int f1757S = 0;

        /* renamed from: T */
        public int f1758T = 0;

        /* renamed from: U */
        public int f1759U = 0;

        /* renamed from: V */
        public int f1760V = -1;

        /* renamed from: W */
        public int f1761W = -1;

        /* renamed from: X */
        public int f1762X = -1;

        /* renamed from: Y */
        public int f1763Y = -1;

        /* renamed from: Z */
        public float f1764Z = 1.0f;

        /* renamed from: a */
        public boolean f1765a = false;

        /* renamed from: a0 */
        public float f1766a0 = 1.0f;

        /* renamed from: b */
        public boolean f1767b = false;

        /* renamed from: b0 */
        public int f1768b0 = -1;

        /* renamed from: c */
        public int f1769c;

        /* renamed from: c0 */
        public int f1770c0 = 0;

        /* renamed from: d */
        public int f1771d;

        /* renamed from: d0 */
        public int f1772d0 = -1;

        /* renamed from: e */
        public int f1773e = -1;

        /* renamed from: e0 */
        public int[] f1774e0;

        /* renamed from: f */
        public int f1775f = -1;

        /* renamed from: f0 */
        public String f1776f0;

        /* renamed from: g */
        public float f1777g = -1.0f;

        /* renamed from: g0 */
        public String f1778g0;

        /* renamed from: h */
        public int f1779h = -1;

        /* renamed from: h0 */
        public boolean f1780h0 = false;

        /* renamed from: i */
        public int f1781i = -1;

        /* renamed from: i0 */
        public boolean f1782i0 = false;

        /* renamed from: j */
        public int f1783j = -1;

        /* renamed from: j0 */
        public boolean f1784j0 = true;

        /* renamed from: k */
        public int f1785k = -1;

        /* renamed from: l */
        public int f1786l = -1;

        /* renamed from: m */
        public int f1787m = -1;

        /* renamed from: n */
        public int f1788n = -1;

        /* renamed from: o */
        public int f1789o = -1;

        /* renamed from: p */
        public int f1790p = -1;

        /* renamed from: q */
        public int f1791q = -1;

        /* renamed from: r */
        public int f1792r = -1;

        /* renamed from: s */
        public int f1793s = -1;

        /* renamed from: t */
        public int f1794t = -1;

        /* renamed from: u */
        public float f1795u = 0.5f;

        /* renamed from: v */
        public float f1796v = 0.5f;

        /* renamed from: w */
        public String f1797w = null;

        /* renamed from: x */
        public int f1798x = -1;

        /* renamed from: y */
        public int f1799y = 0;

        /* renamed from: z */
        public float f1800z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1738k0 = sparseIntArray;
            sparseIntArray.append(C0427j.f2035d4, 24);
            f1738k0.append(C0427j.f2042e4, 25);
            f1738k0.append(C0427j.f2056g4, 28);
            f1738k0.append(C0427j.f2063h4, 29);
            f1738k0.append(C0427j.f2098m4, 35);
            f1738k0.append(C0427j.f2091l4, 34);
            f1738k0.append(C0427j.f1941O3, 4);
            f1738k0.append(C0427j.f1935N3, 3);
            f1738k0.append(C0427j.f1923L3, 1);
            f1738k0.append(C0427j.f2133r4, 6);
            f1738k0.append(C0427j.f2140s4, 7);
            f1738k0.append(C0427j.f1983V3, 17);
            f1738k0.append(C0427j.f1989W3, 18);
            f1738k0.append(C0427j.f1995X3, 19);
            f1738k0.append(C0427j.f2167w3, 26);
            f1738k0.append(C0427j.f2070i4, 31);
            f1738k0.append(C0427j.f2077j4, 32);
            f1738k0.append(C0427j.f1977U3, 10);
            f1738k0.append(C0427j.f1971T3, 9);
            f1738k0.append(C0427j.f2161v4, 13);
            f1738k0.append(C0427j.f2182y4, 16);
            f1738k0.append(C0427j.f2168w4, 14);
            f1738k0.append(C0427j.f2147t4, 11);
            f1738k0.append(C0427j.f2175x4, 15);
            f1738k0.append(C0427j.f2154u4, 12);
            f1738k0.append(C0427j.f2119p4, 38);
            f1738k0.append(C0427j.f2021b4, 37);
            f1738k0.append(C0427j.f2014a4, 39);
            f1738k0.append(C0427j.f2112o4, 40);
            f1738k0.append(C0427j.f2007Z3, 20);
            f1738k0.append(C0427j.f2105n4, 36);
            f1738k0.append(C0427j.f1965S3, 5);
            f1738k0.append(C0427j.f2028c4, 76);
            f1738k0.append(C0427j.f2084k4, 76);
            f1738k0.append(C0427j.f2049f4, 76);
            f1738k0.append(C0427j.f1929M3, 76);
            f1738k0.append(C0427j.f1917K3, 76);
            f1738k0.append(C0427j.f2188z3, 23);
            f1738k0.append(C0427j.f1856B3, 27);
            f1738k0.append(C0427j.f1870D3, 30);
            f1738k0.append(C0427j.f1877E3, 8);
            f1738k0.append(C0427j.f1849A3, 33);
            f1738k0.append(C0427j.f1863C3, 2);
            f1738k0.append(C0427j.f2174x3, 22);
            f1738k0.append(C0427j.f2181y3, 21);
            f1738k0.append(C0427j.f1947P3, 61);
            f1738k0.append(C0427j.f1959R3, 62);
            f1738k0.append(C0427j.f1953Q3, 63);
            f1738k0.append(C0427j.f2126q4, 69);
            f1738k0.append(C0427j.f2001Y3, 70);
            f1738k0.append(C0427j.f1905I3, 71);
            f1738k0.append(C0427j.f1891G3, 72);
            f1738k0.append(C0427j.f1898H3, 73);
            f1738k0.append(C0427j.f1911J3, 74);
            f1738k0.append(C0427j.f1884F3, 75);
        }

        /* renamed from: a */
        public void mo2267a(C0417b bVar) {
            this.f1765a = bVar.f1765a;
            this.f1769c = bVar.f1769c;
            this.f1767b = bVar.f1767b;
            this.f1771d = bVar.f1771d;
            this.f1773e = bVar.f1773e;
            this.f1775f = bVar.f1775f;
            this.f1777g = bVar.f1777g;
            this.f1779h = bVar.f1779h;
            this.f1781i = bVar.f1781i;
            this.f1783j = bVar.f1783j;
            this.f1785k = bVar.f1785k;
            this.f1786l = bVar.f1786l;
            this.f1787m = bVar.f1787m;
            this.f1788n = bVar.f1788n;
            this.f1789o = bVar.f1789o;
            this.f1790p = bVar.f1790p;
            this.f1791q = bVar.f1791q;
            this.f1792r = bVar.f1792r;
            this.f1793s = bVar.f1793s;
            this.f1794t = bVar.f1794t;
            this.f1795u = bVar.f1795u;
            this.f1796v = bVar.f1796v;
            this.f1797w = bVar.f1797w;
            this.f1798x = bVar.f1798x;
            this.f1799y = bVar.f1799y;
            this.f1800z = bVar.f1800z;
            this.f1739A = bVar.f1739A;
            this.f1740B = bVar.f1740B;
            this.f1741C = bVar.f1741C;
            this.f1742D = bVar.f1742D;
            this.f1743E = bVar.f1743E;
            this.f1744F = bVar.f1744F;
            this.f1745G = bVar.f1745G;
            this.f1746H = bVar.f1746H;
            this.f1747I = bVar.f1747I;
            this.f1748J = bVar.f1748J;
            this.f1749K = bVar.f1749K;
            this.f1750L = bVar.f1750L;
            this.f1751M = bVar.f1751M;
            this.f1752N = bVar.f1752N;
            this.f1753O = bVar.f1753O;
            this.f1754P = bVar.f1754P;
            this.f1755Q = bVar.f1755Q;
            this.f1756R = bVar.f1756R;
            this.f1757S = bVar.f1757S;
            this.f1758T = bVar.f1758T;
            this.f1759U = bVar.f1759U;
            this.f1760V = bVar.f1760V;
            this.f1761W = bVar.f1761W;
            this.f1762X = bVar.f1762X;
            this.f1763Y = bVar.f1763Y;
            this.f1764Z = bVar.f1764Z;
            this.f1766a0 = bVar.f1766a0;
            this.f1768b0 = bVar.f1768b0;
            this.f1770c0 = bVar.f1770c0;
            this.f1772d0 = bVar.f1772d0;
            this.f1778g0 = bVar.f1778g0;
            int[] iArr = bVar.f1774e0;
            if (iArr != null) {
                this.f1774e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1774e0 = null;
            }
            this.f1776f0 = bVar.f1776f0;
            this.f1780h0 = bVar.f1780h0;
            this.f1782i0 = bVar.f1782i0;
            this.f1784j0 = bVar.f1784j0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2268b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0427j.f2160v3);
            this.f1767b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f1738k0.get(index);
                if (i2 == 80) {
                    this.f1780h0 = obtainStyledAttributes.getBoolean(index, this.f1780h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f1790p = C0415d.m1958n(obtainStyledAttributes, index, this.f1790p);
                            break;
                        case 2:
                            this.f1745G = obtainStyledAttributes.getDimensionPixelSize(index, this.f1745G);
                            break;
                        case 3:
                            this.f1789o = C0415d.m1958n(obtainStyledAttributes, index, this.f1789o);
                            break;
                        case 4:
                            this.f1788n = C0415d.m1958n(obtainStyledAttributes, index, this.f1788n);
                            break;
                        case 5:
                            this.f1797w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f1739A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1739A);
                            break;
                        case 7:
                            this.f1740B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1740B);
                            break;
                        case 8:
                            this.f1746H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1746H);
                            break;
                        case 9:
                            this.f1794t = C0415d.m1958n(obtainStyledAttributes, index, this.f1794t);
                            break;
                        case 10:
                            this.f1793s = C0415d.m1958n(obtainStyledAttributes, index, this.f1793s);
                            break;
                        case 11:
                            this.f1751M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1751M);
                            break;
                        case 12:
                            this.f1752N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1752N);
                            break;
                        case 13:
                            this.f1748J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1748J);
                            break;
                        case 14:
                            this.f1750L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1750L);
                            break;
                        case 15:
                            this.f1753O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1753O);
                            break;
                        case 16:
                            this.f1749K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1749K);
                            break;
                        case 17:
                            this.f1773e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1773e);
                            break;
                        case 18:
                            this.f1775f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1775f);
                            break;
                        case 19:
                            this.f1777g = obtainStyledAttributes.getFloat(index, this.f1777g);
                            break;
                        case 20:
                            this.f1795u = obtainStyledAttributes.getFloat(index, this.f1795u);
                            break;
                        case 21:
                            this.f1771d = obtainStyledAttributes.getLayoutDimension(index, this.f1771d);
                            break;
                        case 22:
                            this.f1769c = obtainStyledAttributes.getLayoutDimension(index, this.f1769c);
                            break;
                        case 23:
                            this.f1742D = obtainStyledAttributes.getDimensionPixelSize(index, this.f1742D);
                            break;
                        case 24:
                            this.f1779h = C0415d.m1958n(obtainStyledAttributes, index, this.f1779h);
                            break;
                        case 25:
                            this.f1781i = C0415d.m1958n(obtainStyledAttributes, index, this.f1781i);
                            break;
                        case 26:
                            this.f1741C = obtainStyledAttributes.getInt(index, this.f1741C);
                            break;
                        case 27:
                            this.f1743E = obtainStyledAttributes.getDimensionPixelSize(index, this.f1743E);
                            break;
                        case 28:
                            this.f1783j = C0415d.m1958n(obtainStyledAttributes, index, this.f1783j);
                            break;
                        case 29:
                            this.f1785k = C0415d.m1958n(obtainStyledAttributes, index, this.f1785k);
                            break;
                        case 30:
                            this.f1747I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1747I);
                            break;
                        case 31:
                            this.f1791q = C0415d.m1958n(obtainStyledAttributes, index, this.f1791q);
                            break;
                        case 32:
                            this.f1792r = C0415d.m1958n(obtainStyledAttributes, index, this.f1792r);
                            break;
                        case 33:
                            this.f1744F = obtainStyledAttributes.getDimensionPixelSize(index, this.f1744F);
                            break;
                        case 34:
                            this.f1787m = C0415d.m1958n(obtainStyledAttributes, index, this.f1787m);
                            break;
                        case 35:
                            this.f1786l = C0415d.m1958n(obtainStyledAttributes, index, this.f1786l);
                            break;
                        case 36:
                            this.f1796v = obtainStyledAttributes.getFloat(index, this.f1796v);
                            break;
                        case 37:
                            this.f1755Q = obtainStyledAttributes.getFloat(index, this.f1755Q);
                            break;
                        case 38:
                            this.f1754P = obtainStyledAttributes.getFloat(index, this.f1754P);
                            break;
                        case 39:
                            this.f1756R = obtainStyledAttributes.getInt(index, this.f1756R);
                            break;
                        case 40:
                            this.f1757S = obtainStyledAttributes.getInt(index, this.f1757S);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f1758T = obtainStyledAttributes.getInt(index, this.f1758T);
                                    break;
                                case 55:
                                    this.f1759U = obtainStyledAttributes.getInt(index, this.f1759U);
                                    break;
                                case 56:
                                    this.f1760V = obtainStyledAttributes.getDimensionPixelSize(index, this.f1760V);
                                    break;
                                case 57:
                                    this.f1761W = obtainStyledAttributes.getDimensionPixelSize(index, this.f1761W);
                                    break;
                                case 58:
                                    this.f1762X = obtainStyledAttributes.getDimensionPixelSize(index, this.f1762X);
                                    break;
                                case 59:
                                    this.f1763Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1763Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f1798x = C0415d.m1958n(obtainStyledAttributes, index, this.f1798x);
                                            break;
                                        case 62:
                                            this.f1799y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1799y);
                                            break;
                                        case 63:
                                            this.f1800z = obtainStyledAttributes.getFloat(index, this.f1800z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f1764Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f1766a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f1768b0 = obtainStyledAttributes.getInt(index, this.f1768b0);
                                                    continue;
                                                case 73:
                                                    this.f1770c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1770c0);
                                                    continue;
                                                case 74:
                                                    this.f1776f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f1784j0 = obtainStyledAttributes.getBoolean(index, this.f1784j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f1778g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f1738k0.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f1782i0 = obtainStyledAttributes.getBoolean(index, this.f1782i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    public static class C0418c {

        /* renamed from: h */
        private static SparseIntArray f1801h;

        /* renamed from: a */
        public boolean f1802a = false;

        /* renamed from: b */
        public int f1803b = -1;

        /* renamed from: c */
        public String f1804c = null;

        /* renamed from: d */
        public int f1805d = -1;

        /* renamed from: e */
        public int f1806e = 0;

        /* renamed from: f */
        public float f1807f = Float.NaN;

        /* renamed from: g */
        public float f1808g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1801h = sparseIntArray;
            sparseIntArray.append(C0427j.f1912J4, 1);
            f1801h.append(C0427j.f1924L4, 2);
            f1801h.append(C0427j.f1930M4, 3);
            f1801h.append(C0427j.f1906I4, 4);
            f1801h.append(C0427j.f1899H4, 5);
            f1801h.append(C0427j.f1918K4, 6);
        }

        /* renamed from: a */
        public void mo2269a(C0418c cVar) {
            this.f1802a = cVar.f1802a;
            this.f1803b = cVar.f1803b;
            this.f1804c = cVar.f1804c;
            this.f1805d = cVar.f1805d;
            this.f1806e = cVar.f1806e;
            this.f1808g = cVar.f1808g;
            this.f1807f = cVar.f1807f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2270b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0427j.f1892G4);
            this.f1802a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1801h.get(index)) {
                    case 1:
                        this.f1808g = obtainStyledAttributes.getFloat(index, this.f1808g);
                        break;
                    case 2:
                        this.f1805d = obtainStyledAttributes.getInt(index, this.f1805d);
                        break;
                    case 3:
                        this.f1804c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C2458a.f8422c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1806e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1803b = C0415d.m1958n(obtainStyledAttributes, index, this.f1803b);
                        break;
                    case 6:
                        this.f1807f = obtainStyledAttributes.getFloat(index, this.f1807f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    public static class C0419d {

        /* renamed from: a */
        public boolean f1809a = false;

        /* renamed from: b */
        public int f1810b = 0;

        /* renamed from: c */
        public int f1811c = 0;

        /* renamed from: d */
        public float f1812d = 1.0f;

        /* renamed from: e */
        public float f1813e = Float.NaN;

        /* renamed from: a */
        public void mo2271a(C0419d dVar) {
            this.f1809a = dVar.f1809a;
            this.f1810b = dVar.f1810b;
            this.f1812d = dVar.f1812d;
            this.f1813e = dVar.f1813e;
            this.f1811c = dVar.f1811c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2272b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0427j.f1984V4);
            this.f1809a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0427j.f1996X4) {
                    this.f1812d = obtainStyledAttributes.getFloat(index, this.f1812d);
                } else if (index == C0427j.f1990W4) {
                    this.f1810b = obtainStyledAttributes.getInt(index, this.f1810b);
                    this.f1810b = C0415d.f1727d[this.f1810b];
                } else if (index == C0427j.f2008Z4) {
                    this.f1811c = obtainStyledAttributes.getInt(index, this.f1811c);
                } else if (index == C0427j.f2002Y4) {
                    this.f1813e = obtainStyledAttributes.getFloat(index, this.f1813e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    public static class C0420e {

        /* renamed from: n */
        private static SparseIntArray f1814n;

        /* renamed from: a */
        public boolean f1815a = false;

        /* renamed from: b */
        public float f1816b = 0.0f;

        /* renamed from: c */
        public float f1817c = 0.0f;

        /* renamed from: d */
        public float f1818d = 0.0f;

        /* renamed from: e */
        public float f1819e = 1.0f;

        /* renamed from: f */
        public float f1820f = 1.0f;

        /* renamed from: g */
        public float f1821g = Float.NaN;

        /* renamed from: h */
        public float f1822h = Float.NaN;

        /* renamed from: i */
        public float f1823i = 0.0f;

        /* renamed from: j */
        public float f1824j = 0.0f;

        /* renamed from: k */
        public float f1825k = 0.0f;

        /* renamed from: l */
        public boolean f1826l = false;

        /* renamed from: m */
        public float f1827m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1814n = sparseIntArray;
            sparseIntArray.append(C0427j.f2148t5, 1);
            f1814n.append(C0427j.f2155u5, 2);
            f1814n.append(C0427j.f2162v5, 3);
            f1814n.append(C0427j.f2134r5, 4);
            f1814n.append(C0427j.f2141s5, 5);
            f1814n.append(C0427j.f2106n5, 6);
            f1814n.append(C0427j.f2113o5, 7);
            f1814n.append(C0427j.f2120p5, 8);
            f1814n.append(C0427j.f2127q5, 9);
            f1814n.append(C0427j.f2169w5, 10);
            f1814n.append(C0427j.f2176x5, 11);
        }

        /* renamed from: a */
        public void mo2273a(C0420e eVar) {
            this.f1815a = eVar.f1815a;
            this.f1816b = eVar.f1816b;
            this.f1817c = eVar.f1817c;
            this.f1818d = eVar.f1818d;
            this.f1819e = eVar.f1819e;
            this.f1820f = eVar.f1820f;
            this.f1821g = eVar.f1821g;
            this.f1822h = eVar.f1822h;
            this.f1823i = eVar.f1823i;
            this.f1824j = eVar.f1824j;
            this.f1825k = eVar.f1825k;
            this.f1826l = eVar.f1826l;
            this.f1827m = eVar.f1827m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2274b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0427j.f2099m5);
            this.f1815a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1814n.get(index)) {
                    case 1:
                        this.f1816b = obtainStyledAttributes.getFloat(index, this.f1816b);
                        break;
                    case 2:
                        this.f1817c = obtainStyledAttributes.getFloat(index, this.f1817c);
                        break;
                    case 3:
                        this.f1818d = obtainStyledAttributes.getFloat(index, this.f1818d);
                        break;
                    case 4:
                        this.f1819e = obtainStyledAttributes.getFloat(index, this.f1819e);
                        break;
                    case 5:
                        this.f1820f = obtainStyledAttributes.getFloat(index, this.f1820f);
                        break;
                    case 6:
                        this.f1821g = obtainStyledAttributes.getDimension(index, this.f1821g);
                        break;
                    case 7:
                        this.f1822h = obtainStyledAttributes.getDimension(index, this.f1822h);
                        break;
                    case 8:
                        this.f1823i = obtainStyledAttributes.getDimension(index, this.f1823i);
                        break;
                    case 9:
                        this.f1824j = obtainStyledAttributes.getDimension(index, this.f1824j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1825k = obtainStyledAttributes.getDimension(index, this.f1825k);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1826l = true;
                            this.f1827m = obtainStyledAttributes.getDimension(index, this.f1827m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1728e = sparseIntArray;
        sparseIntArray.append(C0427j.f2150u0, 25);
        f1728e.append(C0427j.f2157v0, 26);
        f1728e.append(C0427j.f2171x0, 29);
        f1728e.append(C0427j.f2178y0, 30);
        f1728e.append(C0427j.f1874E0, 36);
        f1728e.append(C0427j.f1867D0, 35);
        f1728e.append(C0427j.f2024c0, 4);
        f1728e.append(C0427j.f2017b0, 3);
        f1728e.append(C0427j.f2003Z, 1);
        f1728e.append(C0427j.f1926M0, 6);
        f1728e.append(C0427j.f1932N0, 7);
        f1728e.append(C0427j.f2073j0, 17);
        f1728e.append(C0427j.f2080k0, 18);
        f1728e.append(C0427j.f2087l0, 19);
        f1728e.append(C0427j.f2135s, 27);
        f1728e.append(C0427j.f2185z0, 32);
        f1728e.append(C0427j.f1846A0, 33);
        f1728e.append(C0427j.f2066i0, 10);
        f1728e.append(C0427j.f2059h0, 9);
        f1728e.append(C0427j.f1950Q0, 13);
        f1728e.append(C0427j.f1968T0, 16);
        f1728e.append(C0427j.f1956R0, 14);
        f1728e.append(C0427j.f1938O0, 11);
        f1728e.append(C0427j.f1962S0, 15);
        f1728e.append(C0427j.f1944P0, 12);
        f1728e.append(C0427j.f1895H0, 40);
        f1728e.append(C0427j.f2136s0, 39);
        f1728e.append(C0427j.f2129r0, 41);
        f1728e.append(C0427j.f1888G0, 42);
        f1728e.append(C0427j.f2122q0, 20);
        f1728e.append(C0427j.f1881F0, 37);
        f1728e.append(C0427j.f2052g0, 5);
        f1728e.append(C0427j.f2143t0, 82);
        f1728e.append(C0427j.f1860C0, 82);
        f1728e.append(C0427j.f2164w0, 82);
        f1728e.append(C0427j.f2010a0, 82);
        f1728e.append(C0427j.f1997Y, 82);
        f1728e.append(C0427j.f2170x, 24);
        f1728e.append(C0427j.f2184z, 28);
        f1728e.append(C0427j.f1919L, 31);
        f1728e.append(C0427j.f1925M, 8);
        f1728e.append(C0427j.f2177y, 34);
        f1728e.append(C0427j.f1845A, 2);
        f1728e.append(C0427j.f2156v, 23);
        f1728e.append(C0427j.f2163w, 21);
        f1728e.append(C0427j.f2149u, 22);
        f1728e.append(C0427j.f1852B, 43);
        f1728e.append(C0427j.f1937O, 44);
        f1728e.append(C0427j.f1907J, 45);
        f1728e.append(C0427j.f1913K, 46);
        f1728e.append(C0427j.f1901I, 60);
        f1728e.append(C0427j.f1887G, 47);
        f1728e.append(C0427j.f1894H, 48);
        f1728e.append(C0427j.f1859C, 49);
        f1728e.append(C0427j.f1866D, 50);
        f1728e.append(C0427j.f1873E, 51);
        f1728e.append(C0427j.f1880F, 52);
        f1728e.append(C0427j.f1931N, 53);
        f1728e.append(C0427j.f1902I0, 54);
        f1728e.append(C0427j.f2094m0, 55);
        f1728e.append(C0427j.f1908J0, 56);
        f1728e.append(C0427j.f2101n0, 57);
        f1728e.append(C0427j.f1914K0, 58);
        f1728e.append(C0427j.f2108o0, 59);
        f1728e.append(C0427j.f2031d0, 61);
        f1728e.append(C0427j.f2045f0, 62);
        f1728e.append(C0427j.f2038e0, 63);
        f1728e.append(C0427j.f1943P, 64);
        f1728e.append(C0427j.f1992X0, 65);
        f1728e.append(C0427j.f1979V, 66);
        f1728e.append(C0427j.f1998Y0, 67);
        f1728e.append(C0427j.f1980V0, 79);
        f1728e.append(C0427j.f2142t, 38);
        f1728e.append(C0427j.f1974U0, 68);
        f1728e.append(C0427j.f1920L0, 69);
        f1728e.append(C0427j.f2115p0, 70);
        f1728e.append(C0427j.f1967T, 71);
        f1728e.append(C0427j.f1955R, 72);
        f1728e.append(C0427j.f1961S, 73);
        f1728e.append(C0427j.f1973U, 74);
        f1728e.append(C0427j.f1949Q, 75);
        f1728e.append(C0427j.f1986W0, 76);
        f1728e.append(C0427j.f1853B0, 77);
        f1728e.append(C0427j.f2004Z0, 78);
        f1728e.append(C0427j.f1991X, 80);
        f1728e.append(C0427j.f1985W, 81);
    }

    /* renamed from: i */
    private int[] m1955i(View view, String str) {
        int i;
        Object f;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0426i.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f = ((ConstraintLayout) view.getParent()).mo2203f(0, trim)) != null && (f instanceof Integer)) {
                i = ((Integer) f).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: j */
    private C0416a m1956j(Context context, AttributeSet attributeSet) {
        C0416a aVar = new C0416a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0427j.f2128r);
        m1959o(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: k */
    private C0416a m1957k(int i) {
        if (!this.f1731c.containsKey(Integer.valueOf(i))) {
            this.f1731c.put(Integer.valueOf(i), new C0416a());
        }
        return this.f1731c.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static int m1958n(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: o */
    private void m1959o(Context context, C0416a aVar, TypedArray typedArray) {
        C0418c cVar;
        String str;
        String str2;
        StringBuilder sb;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0427j.f2142t || C0427j.f1919L == index || C0427j.f1925M == index)) {
                aVar.f1734c.f1802a = true;
                aVar.f1735d.f1767b = true;
                aVar.f1733b.f1809a = true;
                aVar.f1736e.f1815a = true;
            }
            switch (f1728e.get(index)) {
                case 1:
                    C0417b bVar = aVar.f1735d;
                    bVar.f1790p = m1958n(typedArray, index, bVar.f1790p);
                    continue;
                case 2:
                    C0417b bVar2 = aVar.f1735d;
                    bVar2.f1745G = typedArray.getDimensionPixelSize(index, bVar2.f1745G);
                    continue;
                case 3:
                    C0417b bVar3 = aVar.f1735d;
                    bVar3.f1789o = m1958n(typedArray, index, bVar3.f1789o);
                    continue;
                case 4:
                    C0417b bVar4 = aVar.f1735d;
                    bVar4.f1788n = m1958n(typedArray, index, bVar4.f1788n);
                    continue;
                case 5:
                    aVar.f1735d.f1797w = typedArray.getString(index);
                    continue;
                case 6:
                    C0417b bVar5 = aVar.f1735d;
                    bVar5.f1739A = typedArray.getDimensionPixelOffset(index, bVar5.f1739A);
                    continue;
                case 7:
                    C0417b bVar6 = aVar.f1735d;
                    bVar6.f1740B = typedArray.getDimensionPixelOffset(index, bVar6.f1740B);
                    continue;
                case 8:
                    C0417b bVar7 = aVar.f1735d;
                    bVar7.f1746H = typedArray.getDimensionPixelSize(index, bVar7.f1746H);
                    continue;
                case 9:
                    C0417b bVar8 = aVar.f1735d;
                    bVar8.f1794t = m1958n(typedArray, index, bVar8.f1794t);
                    continue;
                case 10:
                    C0417b bVar9 = aVar.f1735d;
                    bVar9.f1793s = m1958n(typedArray, index, bVar9.f1793s);
                    continue;
                case 11:
                    C0417b bVar10 = aVar.f1735d;
                    bVar10.f1751M = typedArray.getDimensionPixelSize(index, bVar10.f1751M);
                    continue;
                case 12:
                    C0417b bVar11 = aVar.f1735d;
                    bVar11.f1752N = typedArray.getDimensionPixelSize(index, bVar11.f1752N);
                    continue;
                case 13:
                    C0417b bVar12 = aVar.f1735d;
                    bVar12.f1748J = typedArray.getDimensionPixelSize(index, bVar12.f1748J);
                    continue;
                case 14:
                    C0417b bVar13 = aVar.f1735d;
                    bVar13.f1750L = typedArray.getDimensionPixelSize(index, bVar13.f1750L);
                    continue;
                case 15:
                    C0417b bVar14 = aVar.f1735d;
                    bVar14.f1753O = typedArray.getDimensionPixelSize(index, bVar14.f1753O);
                    continue;
                case 16:
                    C0417b bVar15 = aVar.f1735d;
                    bVar15.f1749K = typedArray.getDimensionPixelSize(index, bVar15.f1749K);
                    continue;
                case 17:
                    C0417b bVar16 = aVar.f1735d;
                    bVar16.f1773e = typedArray.getDimensionPixelOffset(index, bVar16.f1773e);
                    continue;
                case 18:
                    C0417b bVar17 = aVar.f1735d;
                    bVar17.f1775f = typedArray.getDimensionPixelOffset(index, bVar17.f1775f);
                    continue;
                case 19:
                    C0417b bVar18 = aVar.f1735d;
                    bVar18.f1777g = typedArray.getFloat(index, bVar18.f1777g);
                    continue;
                case 20:
                    C0417b bVar19 = aVar.f1735d;
                    bVar19.f1795u = typedArray.getFloat(index, bVar19.f1795u);
                    continue;
                case 21:
                    C0417b bVar20 = aVar.f1735d;
                    bVar20.f1771d = typedArray.getLayoutDimension(index, bVar20.f1771d);
                    continue;
                case 22:
                    C0419d dVar = aVar.f1733b;
                    dVar.f1810b = typedArray.getInt(index, dVar.f1810b);
                    C0419d dVar2 = aVar.f1733b;
                    dVar2.f1810b = f1727d[dVar2.f1810b];
                    continue;
                case 23:
                    C0417b bVar21 = aVar.f1735d;
                    bVar21.f1769c = typedArray.getLayoutDimension(index, bVar21.f1769c);
                    continue;
                case 24:
                    C0417b bVar22 = aVar.f1735d;
                    bVar22.f1742D = typedArray.getDimensionPixelSize(index, bVar22.f1742D);
                    continue;
                case 25:
                    C0417b bVar23 = aVar.f1735d;
                    bVar23.f1779h = m1958n(typedArray, index, bVar23.f1779h);
                    continue;
                case 26:
                    C0417b bVar24 = aVar.f1735d;
                    bVar24.f1781i = m1958n(typedArray, index, bVar24.f1781i);
                    continue;
                case 27:
                    C0417b bVar25 = aVar.f1735d;
                    bVar25.f1741C = typedArray.getInt(index, bVar25.f1741C);
                    continue;
                case 28:
                    C0417b bVar26 = aVar.f1735d;
                    bVar26.f1743E = typedArray.getDimensionPixelSize(index, bVar26.f1743E);
                    continue;
                case 29:
                    C0417b bVar27 = aVar.f1735d;
                    bVar27.f1783j = m1958n(typedArray, index, bVar27.f1783j);
                    continue;
                case 30:
                    C0417b bVar28 = aVar.f1735d;
                    bVar28.f1785k = m1958n(typedArray, index, bVar28.f1785k);
                    continue;
                case 31:
                    C0417b bVar29 = aVar.f1735d;
                    bVar29.f1747I = typedArray.getDimensionPixelSize(index, bVar29.f1747I);
                    continue;
                case 32:
                    C0417b bVar30 = aVar.f1735d;
                    bVar30.f1791q = m1958n(typedArray, index, bVar30.f1791q);
                    continue;
                case 33:
                    C0417b bVar31 = aVar.f1735d;
                    bVar31.f1792r = m1958n(typedArray, index, bVar31.f1792r);
                    continue;
                case 34:
                    C0417b bVar32 = aVar.f1735d;
                    bVar32.f1744F = typedArray.getDimensionPixelSize(index, bVar32.f1744F);
                    continue;
                case 35:
                    C0417b bVar33 = aVar.f1735d;
                    bVar33.f1787m = m1958n(typedArray, index, bVar33.f1787m);
                    continue;
                case 36:
                    C0417b bVar34 = aVar.f1735d;
                    bVar34.f1786l = m1958n(typedArray, index, bVar34.f1786l);
                    continue;
                case 37:
                    C0417b bVar35 = aVar.f1735d;
                    bVar35.f1796v = typedArray.getFloat(index, bVar35.f1796v);
                    continue;
                case 38:
                    aVar.f1732a = typedArray.getResourceId(index, aVar.f1732a);
                    continue;
                case 39:
                    C0417b bVar36 = aVar.f1735d;
                    bVar36.f1755Q = typedArray.getFloat(index, bVar36.f1755Q);
                    continue;
                case 40:
                    C0417b bVar37 = aVar.f1735d;
                    bVar37.f1754P = typedArray.getFloat(index, bVar37.f1754P);
                    continue;
                case 41:
                    C0417b bVar38 = aVar.f1735d;
                    bVar38.f1756R = typedArray.getInt(index, bVar38.f1756R);
                    continue;
                case 42:
                    C0417b bVar39 = aVar.f1735d;
                    bVar39.f1757S = typedArray.getInt(index, bVar39.f1757S);
                    continue;
                case 43:
                    C0419d dVar3 = aVar.f1733b;
                    dVar3.f1812d = typedArray.getFloat(index, dVar3.f1812d);
                    continue;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0420e eVar = aVar.f1736e;
                        eVar.f1826l = true;
                        eVar.f1827m = typedArray.getDimension(index, eVar.f1827m);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    C0420e eVar2 = aVar.f1736e;
                    eVar2.f1817c = typedArray.getFloat(index, eVar2.f1817c);
                    continue;
                case 46:
                    C0420e eVar3 = aVar.f1736e;
                    eVar3.f1818d = typedArray.getFloat(index, eVar3.f1818d);
                    continue;
                case 47:
                    C0420e eVar4 = aVar.f1736e;
                    eVar4.f1819e = typedArray.getFloat(index, eVar4.f1819e);
                    continue;
                case 48:
                    C0420e eVar5 = aVar.f1736e;
                    eVar5.f1820f = typedArray.getFloat(index, eVar5.f1820f);
                    continue;
                case 49:
                    C0420e eVar6 = aVar.f1736e;
                    eVar6.f1821g = typedArray.getDimension(index, eVar6.f1821g);
                    continue;
                case 50:
                    C0420e eVar7 = aVar.f1736e;
                    eVar7.f1822h = typedArray.getDimension(index, eVar7.f1822h);
                    continue;
                case 51:
                    C0420e eVar8 = aVar.f1736e;
                    eVar8.f1823i = typedArray.getDimension(index, eVar8.f1823i);
                    continue;
                case 52:
                    C0420e eVar9 = aVar.f1736e;
                    eVar9.f1824j = typedArray.getDimension(index, eVar9.f1824j);
                    continue;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0420e eVar10 = aVar.f1736e;
                        eVar10.f1825k = typedArray.getDimension(index, eVar10.f1825k);
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    C0417b bVar40 = aVar.f1735d;
                    bVar40.f1758T = typedArray.getInt(index, bVar40.f1758T);
                    continue;
                case 55:
                    C0417b bVar41 = aVar.f1735d;
                    bVar41.f1759U = typedArray.getInt(index, bVar41.f1759U);
                    continue;
                case 56:
                    C0417b bVar42 = aVar.f1735d;
                    bVar42.f1760V = typedArray.getDimensionPixelSize(index, bVar42.f1760V);
                    continue;
                case 57:
                    C0417b bVar43 = aVar.f1735d;
                    bVar43.f1761W = typedArray.getDimensionPixelSize(index, bVar43.f1761W);
                    continue;
                case 58:
                    C0417b bVar44 = aVar.f1735d;
                    bVar44.f1762X = typedArray.getDimensionPixelSize(index, bVar44.f1762X);
                    continue;
                case 59:
                    C0417b bVar45 = aVar.f1735d;
                    bVar45.f1763Y = typedArray.getDimensionPixelSize(index, bVar45.f1763Y);
                    continue;
                case 60:
                    C0420e eVar11 = aVar.f1736e;
                    eVar11.f1816b = typedArray.getFloat(index, eVar11.f1816b);
                    continue;
                case 61:
                    C0417b bVar46 = aVar.f1735d;
                    bVar46.f1798x = m1958n(typedArray, index, bVar46.f1798x);
                    continue;
                case 62:
                    C0417b bVar47 = aVar.f1735d;
                    bVar47.f1799y = typedArray.getDimensionPixelSize(index, bVar47.f1799y);
                    continue;
                case 63:
                    C0417b bVar48 = aVar.f1735d;
                    bVar48.f1800z = typedArray.getFloat(index, bVar48.f1800z);
                    continue;
                case 64:
                    C0418c cVar2 = aVar.f1734c;
                    cVar2.f1803b = m1958n(typedArray, index, cVar2.f1803b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1734c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1734c;
                        str = C2458a.f8422c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1804c = str;
                    continue;
                case 66:
                    aVar.f1734c.f1806e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    C0418c cVar3 = aVar.f1734c;
                    cVar3.f1808g = typedArray.getFloat(index, cVar3.f1808g);
                    continue;
                case 68:
                    C0419d dVar4 = aVar.f1733b;
                    dVar4.f1813e = typedArray.getFloat(index, dVar4.f1813e);
                    continue;
                case 69:
                    aVar.f1735d.f1764Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1735d.f1766a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    C0417b bVar49 = aVar.f1735d;
                    bVar49.f1768b0 = typedArray.getInt(index, bVar49.f1768b0);
                    continue;
                case 73:
                    C0417b bVar50 = aVar.f1735d;
                    bVar50.f1770c0 = typedArray.getDimensionPixelSize(index, bVar50.f1770c0);
                    continue;
                case 74:
                    aVar.f1735d.f1776f0 = typedArray.getString(index);
                    continue;
                case 75:
                    C0417b bVar51 = aVar.f1735d;
                    bVar51.f1784j0 = typedArray.getBoolean(index, bVar51.f1784j0);
                    continue;
                case 76:
                    C0418c cVar4 = aVar.f1734c;
                    cVar4.f1805d = typedArray.getInt(index, cVar4.f1805d);
                    continue;
                case 77:
                    aVar.f1735d.f1778g0 = typedArray.getString(index);
                    continue;
                case 78:
                    C0419d dVar5 = aVar.f1733b;
                    dVar5.f1811c = typedArray.getInt(index, dVar5.f1811c);
                    continue;
                case 79:
                    C0418c cVar5 = aVar.f1734c;
                    cVar5.f1807f = typedArray.getFloat(index, cVar5.f1807f);
                    continue;
                case 80:
                    C0417b bVar52 = aVar.f1735d;
                    bVar52.f1780h0 = typedArray.getBoolean(index, bVar52.f1780h0);
                    continue;
                case 81:
                    C0417b bVar53 = aVar.f1735d;
                    bVar53.f1782i0 = typedArray.getBoolean(index, bVar53.f1782i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1728e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    /* renamed from: c */
    public void mo2256c(ConstraintLayout constraintLayout) {
        mo2257d(constraintLayout, true);
        constraintLayout.setConstraintSet((C0415d) null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2257d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1731c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f1731c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C2495a.m11495a(childAt));
            } else if (this.f1730b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f1731c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0416a aVar = this.f1731c.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f1735d.f1772d0 = 1;
                    }
                    int i2 = aVar.f1735d.f1772d0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f1735d.f1768b0);
                        barrier.setMargin(aVar.f1735d.f1770c0);
                        barrier.setAllowsGoneWidget(aVar.f1735d.f1784j0);
                        C0417b bVar = aVar.f1735d;
                        int[] iArr = bVar.f1774e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f1776f0;
                            if (str != null) {
                                bVar.f1774e0 = m1955i(barrier, str);
                                barrier.setReferencedIds(aVar.f1735d.f1774e0);
                            }
                        }
                    }
                    ConstraintLayout.C0405b bVar2 = (ConstraintLayout.C0405b) childAt.getLayoutParams();
                    bVar2.mo2236a();
                    aVar.mo2265d(bVar2);
                    if (z) {
                        C0408a.m1934c(childAt, aVar.f1737f);
                    }
                    childAt.setLayoutParams(bVar2);
                    C0419d dVar = aVar.f1733b;
                    if (dVar.f1811c == 0) {
                        childAt.setVisibility(dVar.f1810b);
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    childAt.setAlpha(aVar.f1733b.f1812d);
                    childAt.setRotation(aVar.f1736e.f1816b);
                    childAt.setRotationX(aVar.f1736e.f1817c);
                    childAt.setRotationY(aVar.f1736e.f1818d);
                    childAt.setScaleX(aVar.f1736e.f1819e);
                    childAt.setScaleY(aVar.f1736e.f1820f);
                    if (!Float.isNaN(aVar.f1736e.f1821g)) {
                        childAt.setPivotX(aVar.f1736e.f1821g);
                    }
                    if (!Float.isNaN(aVar.f1736e.f1822h)) {
                        childAt.setPivotY(aVar.f1736e.f1822h);
                    }
                    childAt.setTranslationX(aVar.f1736e.f1823i);
                    childAt.setTranslationY(aVar.f1736e.f1824j);
                    if (i3 >= 21) {
                        childAt.setTranslationZ(aVar.f1736e.f1825k);
                        C0420e eVar = aVar.f1736e;
                        if (eVar.f1826l) {
                            childAt.setElevation(eVar.f1827m);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0416a aVar2 = this.f1731c.get(num);
            int i4 = aVar2.f1735d.f1772d0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0417b bVar3 = aVar2.f1735d;
                int[] iArr2 = bVar3.f1774e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f1776f0;
                    if (str2 != null) {
                        bVar3.f1774e0 = m1955i(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f1735d.f1774e0);
                    }
                }
                barrier2.setType(aVar2.f1735d.f1768b0);
                barrier2.setMargin(aVar2.f1735d.f1770c0);
                ConstraintLayout.C0405b d = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo2249m();
                aVar2.mo2265d(d);
                constraintLayout.addView(barrier2, d);
            }
            if (aVar2.f1735d.f1765a) {
                C0424g gVar = new C0424g(constraintLayout.getContext());
                gVar.setId(num.intValue());
                ConstraintLayout.C0405b d2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo2265d(d2);
                constraintLayout.addView(gVar, d2);
            }
        }
    }

    /* renamed from: e */
    public void mo2258e(Context context, int i) {
        mo2259f((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: f */
    public void mo2259f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1731c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0405b bVar = (ConstraintLayout.C0405b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1730b || id != -1) {
                if (!this.f1731c.containsKey(Integer.valueOf(id))) {
                    this.f1731c.put(Integer.valueOf(id), new C0416a());
                }
                C0416a aVar = this.f1731c.get(Integer.valueOf(id));
                aVar.f1737f = C0408a.m1932a(this.f1729a, childAt);
                aVar.m1971f(id, bVar);
                aVar.f1733b.f1810b = childAt.getVisibility();
                int i2 = Build.VERSION.SDK_INT;
                aVar.f1733b.f1812d = childAt.getAlpha();
                aVar.f1736e.f1816b = childAt.getRotation();
                aVar.f1736e.f1817c = childAt.getRotationX();
                aVar.f1736e.f1818d = childAt.getRotationY();
                aVar.f1736e.f1819e = childAt.getScaleX();
                aVar.f1736e.f1820f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    C0420e eVar = aVar.f1736e;
                    eVar.f1821g = pivotX;
                    eVar.f1822h = pivotY;
                }
                aVar.f1736e.f1823i = childAt.getTranslationX();
                aVar.f1736e.f1824j = childAt.getTranslationY();
                if (i2 >= 21) {
                    aVar.f1736e.f1825k = childAt.getTranslationZ();
                    C0420e eVar2 = aVar.f1736e;
                    if (eVar2.f1826l) {
                        eVar2.f1827m = childAt.getElevation();
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1735d.f1784j0 = barrier.mo2192n();
                    aVar.f1735d.f1774e0 = barrier.getReferencedIds();
                    aVar.f1735d.f1768b0 = barrier.getType();
                    aVar.f1735d.f1770c0 = barrier.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: g */
    public void mo2260g(C0421e eVar) {
        int childCount = eVar.getChildCount();
        this.f1731c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = eVar.getChildAt(i);
            C0421e.C0422a aVar = (C0421e.C0422a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1730b || id != -1) {
                if (!this.f1731c.containsKey(Integer.valueOf(id))) {
                    this.f1731c.put(Integer.valueOf(id), new C0416a());
                }
                C0416a aVar2 = this.f1731c.get(Integer.valueOf(id));
                if (childAt instanceof C0411b) {
                    aVar2.m1973h((C0411b) childAt, id, aVar);
                }
                aVar2.m1972g(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: h */
    public void mo2261h(int i, int i2, int i3, float f) {
        C0417b bVar = m1957k(i).f1735d;
        bVar.f1798x = i2;
        bVar.f1799y = i3;
        bVar.f1800z = f;
    }

    /* renamed from: l */
    public void mo2262l(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0416a j = m1956j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        j.f1735d.f1765a = true;
                    }
                    this.f1731c.put(Integer.valueOf(j.f1732a), j);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0179, code lost:
        continue;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2263m(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x0188
            if (r0 == 0) goto L_0x0176
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x0179
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0179
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.d$a> r0 = r9.f1731c     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r3 = r2.f1732a     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2 = r1
            goto L_0x0179
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 2
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = -1
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016c;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0179
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f1737f     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.C0408a.m1933b(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.d$c r0 = r2.f1734c     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo2270b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.d$b r0 = r2.f1735d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo2268b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.d$e r0 = r2.f1736e     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo2274b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.d$d r0 = r2.f1733b     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo2272b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$a r0 = r9.m1956j(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$b r2 = r0.f1735d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f1772d0 = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$a r0 = r9.m1956j(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$b r2 = r0.f1735d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f1765a = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f1767b = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x016c:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$a r0 = r9.m1956j(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0174:
            r2 = r0
            goto L_0x0179
        L_0x0176:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0179:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0006
        L_0x017f:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0188
        L_0x0184:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0415d.mo2263m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
