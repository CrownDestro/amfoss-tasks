package p001a0;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: a0.a */
public class C0002a {

    /* renamed from: A */
    static final String[] f2A = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: B */
    static final int[] f3B = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: C */
    static final byte[] f4C = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: D */
    private static final C0005c[] f5D;

    /* renamed from: E */
    private static final C0005c[] f6E;

    /* renamed from: F */
    private static final C0005c[] f7F;

    /* renamed from: G */
    private static final C0005c[] f8G;

    /* renamed from: H */
    private static final C0005c[] f9H;

    /* renamed from: I */
    private static final C0005c f10I = new C0005c("StripOffsets", 273, 3);

    /* renamed from: J */
    private static final C0005c[] f11J;

    /* renamed from: K */
    private static final C0005c[] f12K;

    /* renamed from: L */
    private static final C0005c[] f13L;

    /* renamed from: M */
    private static final C0005c[] f14M;

    /* renamed from: N */
    static final C0005c[][] f15N;

    /* renamed from: O */
    private static final C0005c[] f16O = {new C0005c("SubIFDPointer", 330, 4), new C0005c("ExifIFDPointer", 34665, 4), new C0005c("GPSInfoIFDPointer", 34853, 4), new C0005c("InteroperabilityIFDPointer", 40965, 4), new C0005c("CameraSettingsIFDPointer", 8224, 1), new C0005c("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: P */
    private static final C0005c f17P = new C0005c("JPEGInterchangeFormat", 513, 4);

    /* renamed from: Q */
    private static final C0005c f18Q = new C0005c("JPEGInterchangeFormatLength", 514, 4);

    /* renamed from: R */
    private static final HashMap<Integer, C0005c>[] f19R;

    /* renamed from: S */
    private static final HashMap<String, C0005c>[] f20S;

    /* renamed from: T */
    private static final HashSet<String> f21T = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: U */
    private static final HashMap<Integer, Integer> f22U = new HashMap<>();

    /* renamed from: V */
    static final Charset f23V;

    /* renamed from: W */
    static final byte[] f24W;

    /* renamed from: X */
    private static final Pattern f25X = Pattern.compile(".*[1-9].*");

    /* renamed from: Y */
    private static final Pattern f26Y = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: r */
    private static final List<Integer> f27r = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: s */
    private static final List<Integer> f28s = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: t */
    public static final int[] f29t = {8, 8, 8};

    /* renamed from: u */
    public static final int[] f30u = {4};

    /* renamed from: v */
    public static final int[] f31v = {8};

    /* renamed from: w */
    static final byte[] f32w = {-1, -40, -1};

    /* renamed from: x */
    private static final byte[] f33x = {79, 76, 89, 77, 80, 0};

    /* renamed from: y */
    private static final byte[] f34y = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: z */
    private static SimpleDateFormat f35z;

    /* renamed from: a */
    private final String f36a;

    /* renamed from: b */
    private final AssetManager.AssetInputStream f37b;

    /* renamed from: c */
    private int f38c;

    /* renamed from: d */
    private final HashMap<String, C0004b>[] f39d;

    /* renamed from: e */
    private Set<Integer> f40e;

    /* renamed from: f */
    private ByteOrder f41f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g */
    private boolean f42g;

    /* renamed from: h */
    private int f43h;

    /* renamed from: i */
    private int f44i;

    /* renamed from: j */
    private byte[] f45j;

    /* renamed from: k */
    private int f46k;

    /* renamed from: l */
    private int f47l;

    /* renamed from: m */
    private int f48m;

    /* renamed from: n */
    private int f49n;

    /* renamed from: o */
    private int f50o;

    /* renamed from: p */
    private int f51p;

    /* renamed from: q */
    private boolean f52q;

    /* renamed from: a0.a$a */
    private static class C0003a extends InputStream implements DataInput {

        /* renamed from: h */
        private static final ByteOrder f53h = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: i */
        private static final ByteOrder f54i = ByteOrder.BIG_ENDIAN;

        /* renamed from: d */
        private DataInputStream f55d;

        /* renamed from: e */
        private ByteOrder f56e;

        /* renamed from: f */
        final int f57f;

        /* renamed from: g */
        int f58g;

        public C0003a(InputStream inputStream) {
            this.f56e = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f55d = dataInputStream;
            int available = dataInputStream.available();
            this.f57f = available;
            this.f58g = 0;
            this.f55d.mark(available);
        }

        public C0003a(byte[] bArr) {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        /* renamed from: a */
        public int mo7a() {
            return this.f58g;
        }

        public int available() {
            return this.f55d.available();
        }

        /* renamed from: c */
        public long mo9c() {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: f */
        public void mo10f(long j) {
            int i = this.f58g;
            if (((long) i) > j) {
                this.f58g = 0;
                this.f55d.reset();
                this.f55d.mark(this.f57f);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: h */
        public void mo11h(ByteOrder byteOrder) {
            this.f56e = byteOrder;
        }

        public int read() {
            this.f58g++;
            return this.f55d.read();
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = this.f55d.read(bArr, i, i2);
            this.f58g += read;
            return read;
        }

        public boolean readBoolean() {
            this.f58g++;
            return this.f55d.readBoolean();
        }

        public byte readByte() {
            int i = this.f58g + 1;
            this.f58g = i;
            if (i <= this.f57f) {
                int read = this.f55d.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f58g += 2;
            return this.f55d.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) {
            int length = this.f58g + bArr.length;
            this.f58g = length;
            if (length > this.f57f) {
                throw new EOFException();
            } else if (this.f55d.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public void readFully(byte[] bArr, int i, int i2) {
            int i3 = this.f58g + i2;
            this.f58g = i3;
            if (i3 > this.f57f) {
                throw new EOFException();
            } else if (this.f55d.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() {
            int i = this.f58g + 4;
            this.f58g = i;
            if (i <= this.f57f) {
                int read = this.f55d.read();
                int read2 = this.f55d.read();
                int read3 = this.f55d.read();
                int read4 = this.f55d.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f56e;
                    if (byteOrder == f53h) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f54i) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f56e);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            int i = this.f58g + 8;
            this.f58g = i;
            if (i <= this.f57f) {
                int read = this.f55d.read();
                int read2 = this.f55d.read();
                int read3 = this.f55d.read();
                int read4 = this.f55d.read();
                int read5 = this.f55d.read();
                int read6 = this.f55d.read();
                int read7 = this.f55d.read();
                int read8 = this.f55d.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f56e;
                    if (byteOrder == f53h) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == f54i) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f56e);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() {
            int i = this.f58g + 2;
            this.f58g = i;
            if (i <= this.f57f) {
                int read = this.f55d.read();
                int read2 = this.f55d.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f56e;
                    if (byteOrder == f53h) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f54i) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f56e);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f58g += 2;
            return this.f55d.readUTF();
        }

        public int readUnsignedByte() {
            this.f58g++;
            return this.f55d.readUnsignedByte();
        }

        public int readUnsignedShort() {
            int i = this.f58g + 2;
            this.f58g = i;
            if (i <= this.f57f) {
                int read = this.f55d.read();
                int read2 = this.f55d.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f56e;
                    if (byteOrder == f53h) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f54i) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f56e);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) {
            int min = Math.min(i, this.f57f - this.f58g);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f55d.skipBytes(min - i2);
            }
            this.f58g += i2;
            return i2;
        }
    }

    /* renamed from: a0.a$b */
    private static class C0004b {

        /* renamed from: a */
        public final int f59a;

        /* renamed from: b */
        public final int f60b;

        /* renamed from: c */
        public final byte[] f61c;

        C0004b(int i, int i2, byte[] bArr) {
            this.f59a = i;
            this.f60b = i2;
            this.f61c = bArr;
        }

        /* renamed from: a */
        public static C0004b m38a(String str) {
            byte[] bytes = (str + 0).getBytes(C0002a.f23V);
            return new C0004b(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C0004b m39b(long j, ByteOrder byteOrder) {
            return m40c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C0004b m40c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C0002a.f3B[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C0004b(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C0004b m41d(C0006d dVar, ByteOrder byteOrder) {
            return m42e(new C0006d[]{dVar}, byteOrder);
        }

        /* renamed from: e */
        public static C0004b m42e(C0006d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C0002a.f3B[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (C0006d dVar : dVarArr) {
                wrap.putInt((int) dVar.f66a);
                wrap.putInt((int) dVar.f67b);
            }
            return new C0004b(5, dVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C0004b m43f(int i, ByteOrder byteOrder) {
            return m44g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C0004b m44g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C0002a.f3B[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C0004b(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double mo29h(ByteOrder byteOrder) {
            Object k = mo32k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k instanceof String) {
                return Double.parseDouble((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof C0006d[]) {
                    C0006d[] dVarArr = (C0006d[]) k;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].mo35a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: i */
        public int mo30i(ByteOrder byteOrder) {
            Object k = mo32k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k instanceof String) {
                return Integer.parseInt((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: j */
        public String mo31j(ByteOrder byteOrder) {
            Object k = mo32k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k instanceof C0006d[])) {
                return null;
            } else {
                C0006d[] dVarArr = (C0006d[]) k;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].f66a);
                    sb.append('/');
                    sb.append(dVarArr[i].f67b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x019f A[SYNTHETIC, Splitter:B:164:0x019f] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo32k(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                a0.a$a r3 = new a0.a$a     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                byte[] r4 = r10.f61c     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                r3.mo11h(r11)     // Catch:{ IOException -> 0x0185 }
                int r11 = r10.f59a     // Catch:{ IOException -> 0x0185 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0185 }
            L_0x0016:
                goto L_0x017c
            L_0x0018:
                int r11 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x001c:
                int r4 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0036:
                int r4 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0185 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                a0.a$d[] r11 = new p001a0.C0002a.C0006d[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0051:
                int r4 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0185 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0185 }
                a0.a$d r4 = new a0.a$d     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0076:
                int r4 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0090:
                int r4 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                a0.a$d[] r11 = new p001a0.C0002a.C0006d[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00aa:
                int r4 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.mo9c()     // Catch:{ IOException -> 0x0185 }
                long r8 = r3.mo9c()     // Catch:{ IOException -> 0x0185 }
                a0.a$d r4 = new a0.a$d     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00cd:
                int r4 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.mo9c()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00e7:
                int r4 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                byte[] r6 = p001a0.C0002a.f4C     // Catch:{ IOException -> 0x0185 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0185 }
                if (r11 < r6) goto L_0x011a
                r11 = 0
            L_0x0105:
                byte[] r6 = p001a0.C0002a.f4C     // Catch:{ IOException -> 0x0185 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0185 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.f61c     // Catch:{ IOException -> 0x0185 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0185 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0185 }
                if (r7 == r8) goto L_0x0114
                r4 = 0
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r4 == 0) goto L_0x011a
                int r5 = r6.length     // Catch:{ IOException -> 0x0185 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0185 }
                r11.<init>()     // Catch:{ IOException -> 0x0185 }
            L_0x011f:
                int r4 = r10.f60b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x013b
                byte[] r4 = r10.f61c     // Catch:{ IOException -> 0x0185 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0185 }
                if (r4 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r4 < r6) goto L_0x0133
                char r4 = (char) r4     // Catch:{ IOException -> 0x0185 }
                r11.append(r4)     // Catch:{ IOException -> 0x0185 }
                goto L_0x0138
            L_0x0133:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0185 }
            L_0x0138:
                int r5 = r5 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.f61c     // Catch:{ IOException -> 0x0185 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0185 }
                if (r6 != r4) goto L_0x016c
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                if (r6 < 0) goto L_0x016c
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                if (r6 > r4) goto L_0x016c
                java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0185 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0185 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                int r11 = r11 + 48
                char r11 = (char) r11     // Catch:{ IOException -> 0x0185 }
                r4[r5] = r11     // Catch:{ IOException -> 0x0185 }
                r6.<init>(r4)     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0167 }
                goto L_0x016b
            L_0x0167:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x016b:
                return r6
            L_0x016c:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0185 }
                java.nio.charset.Charset r5 = p001a0.C0002a.f23V     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0177 }
                goto L_0x017b
            L_0x0177:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x017b:
                return r4
            L_0x017c:
                r3.close()     // Catch:{ IOException -> 0x0180 }
                goto L_0x0184
            L_0x0180:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0184:
                return r2
            L_0x0185:
                r11 = move-exception
                goto L_0x018b
            L_0x0187:
                r11 = move-exception
                goto L_0x019d
            L_0x0189:
                r11 = move-exception
                r3 = r2
            L_0x018b:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019b }
                if (r3 == 0) goto L_0x019a
                r3.close()     // Catch:{ IOException -> 0x0196 }
                goto L_0x019a
            L_0x0196:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019a:
                return r2
            L_0x019b:
                r11 = move-exception
                r2 = r3
            L_0x019d:
                if (r2 == 0) goto L_0x01a7
                r2.close()     // Catch:{ IOException -> 0x01a3 }
                goto L_0x01a7
            L_0x01a3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01a7:
                goto L_0x01a9
            L_0x01a8:
                throw r11
            L_0x01a9:
                goto L_0x01a8
            */
            throw new UnsupportedOperationException("Method not decompiled: p001a0.C0002a.C0004b.mo32k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C0002a.f2A[this.f59a] + ", data length:" + this.f61c.length + ")";
        }
    }

    /* renamed from: a0.a$c */
    static class C0005c {

        /* renamed from: a */
        public final int f62a;

        /* renamed from: b */
        public final String f63b;

        /* renamed from: c */
        public final int f64c;

        /* renamed from: d */
        public final int f65d;

        C0005c(String str, int i, int i2) {
            this.f63b = str;
            this.f62a = i;
            this.f64c = i2;
            this.f65d = -1;
        }

        C0005c(String str, int i, int i2, int i3) {
            this.f63b = str;
            this.f62a = i;
            this.f64c = i2;
            this.f65d = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo34a(int i) {
            int i2;
            int i3 = this.f64c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f65d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }
    }

    /* renamed from: a0.a$d */
    private static class C0006d {

        /* renamed from: a */
        public final long f66a;

        /* renamed from: b */
        public final long f67b;

        C0006d(long j, long j2) {
            if (j2 == 0) {
                this.f66a = 0;
                this.f67b = 1;
                return;
            }
            this.f66a = j;
            this.f67b = j2;
        }

        /* renamed from: a */
        public double mo35a() {
            double d = (double) this.f66a;
            double d2 = (double) this.f67b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            return this.f66a + "/" + this.f67b;
        }
    }

    static {
        C0005c[] cVarArr = {new C0005c("NewSubfileType", 254, 4), new C0005c("SubfileType", 255, 4), new C0005c("ImageWidth", 256, 3, 4), new C0005c("ImageLength", 257, 3, 4), new C0005c("BitsPerSample", 258, 3), new C0005c("Compression", 259, 3), new C0005c("PhotometricInterpretation", 262, 3), new C0005c("ImageDescription", 270, 2), new C0005c("Make", 271, 2), new C0005c("Model", 272, 2), new C0005c("StripOffsets", 273, 3, 4), new C0005c("Orientation", 274, 3), new C0005c("SamplesPerPixel", 277, 3), new C0005c("RowsPerStrip", 278, 3, 4), new C0005c("StripByteCounts", 279, 3, 4), new C0005c("XResolution", 282, 5), new C0005c("YResolution", 283, 5), new C0005c("PlanarConfiguration", 284, 3), new C0005c("ResolutionUnit", 296, 3), new C0005c("TransferFunction", 301, 3), new C0005c("Software", 305, 2), new C0005c("DateTime", 306, 2), new C0005c("Artist", 315, 2), new C0005c("WhitePoint", 318, 5), new C0005c("PrimaryChromaticities", 319, 5), new C0005c("SubIFDPointer", 330, 4), new C0005c("JPEGInterchangeFormat", 513, 4), new C0005c("JPEGInterchangeFormatLength", 514, 4), new C0005c("YCbCrCoefficients", 529, 5), new C0005c("YCbCrSubSampling", 530, 3), new C0005c("YCbCrPositioning", 531, 3), new C0005c("ReferenceBlackWhite", 532, 5), new C0005c("Copyright", 33432, 2), new C0005c("ExifIFDPointer", 34665, 4), new C0005c("GPSInfoIFDPointer", 34853, 4), new C0005c("SensorTopBorder", 4, 4), new C0005c("SensorLeftBorder", 5, 4), new C0005c("SensorBottomBorder", 6, 4), new C0005c("SensorRightBorder", 7, 4), new C0005c("ISO", 23, 3), new C0005c("JpgFromRaw", 46, 7)};
        f5D = cVarArr;
        C0005c[] cVarArr2 = {new C0005c("ExposureTime", 33434, 5), new C0005c("FNumber", 33437, 5), new C0005c("ExposureProgram", 34850, 3), new C0005c("SpectralSensitivity", 34852, 2), new C0005c("PhotographicSensitivity", 34855, 3), new C0005c("OECF", 34856, 7), new C0005c("ExifVersion", 36864, 2), new C0005c("DateTimeOriginal", 36867, 2), new C0005c("DateTimeDigitized", 36868, 2), new C0005c("ComponentsConfiguration", 37121, 7), new C0005c("CompressedBitsPerPixel", 37122, 5), new C0005c("ShutterSpeedValue", 37377, 10), new C0005c("ApertureValue", 37378, 5), new C0005c("BrightnessValue", 37379, 10), new C0005c("ExposureBiasValue", 37380, 10), new C0005c("MaxApertureValue", 37381, 5), new C0005c("SubjectDistance", 37382, 5), new C0005c("MeteringMode", 37383, 3), new C0005c("LightSource", 37384, 3), new C0005c("Flash", 37385, 3), new C0005c("FocalLength", 37386, 5), new C0005c("SubjectArea", 37396, 3), new C0005c("MakerNote", 37500, 7), new C0005c("UserComment", 37510, 7), new C0005c("SubSecTime", 37520, 2), new C0005c("SubSecTimeOriginal", 37521, 2), new C0005c("SubSecTimeDigitized", 37522, 2), new C0005c("FlashpixVersion", 40960, 7), new C0005c("ColorSpace", 40961, 3), new C0005c("PixelXDimension", 40962, 3, 4), new C0005c("PixelYDimension", 40963, 3, 4), new C0005c("RelatedSoundFile", 40964, 2), new C0005c("InteroperabilityIFDPointer", 40965, 4), new C0005c("FlashEnergy", 41483, 5), new C0005c("SpatialFrequencyResponse", 41484, 7), new C0005c("FocalPlaneXResolution", 41486, 5), new C0005c("FocalPlaneYResolution", 41487, 5), new C0005c("FocalPlaneResolutionUnit", 41488, 3), new C0005c("SubjectLocation", 41492, 3), new C0005c("ExposureIndex", 41493, 5), new C0005c("SensingMethod", 41495, 3), new C0005c("FileSource", 41728, 7), new C0005c("SceneType", 41729, 7), new C0005c("CFAPattern", 41730, 7), new C0005c("CustomRendered", 41985, 3), new C0005c("ExposureMode", 41986, 3), new C0005c("WhiteBalance", 41987, 3), new C0005c("DigitalZoomRatio", 41988, 5), new C0005c("FocalLengthIn35mmFilm", 41989, 3), new C0005c("SceneCaptureType", 41990, 3), new C0005c("GainControl", 41991, 3), new C0005c("Contrast", 41992, 3), new C0005c("Saturation", 41993, 3), new C0005c("Sharpness", 41994, 3), new C0005c("DeviceSettingDescription", 41995, 7), new C0005c("SubjectDistanceRange", 41996, 3), new C0005c("ImageUniqueID", 42016, 2), new C0005c("DNGVersion", 50706, 1), new C0005c("DefaultCropSize", 50720, 3, 4)};
        f6E = cVarArr2;
        C0005c[] cVarArr3 = {new C0005c("GPSVersionID", 0, 1), new C0005c("GPSLatitudeRef", 1, 2), new C0005c("GPSLatitude", 2, 5), new C0005c("GPSLongitudeRef", 3, 2), new C0005c("GPSLongitude", 4, 5), new C0005c("GPSAltitudeRef", 5, 1), new C0005c("GPSAltitude", 6, 5), new C0005c("GPSTimeStamp", 7, 5), new C0005c("GPSSatellites", 8, 2), new C0005c("GPSStatus", 9, 2), new C0005c("GPSMeasureMode", 10, 2), new C0005c("GPSDOP", 11, 5), new C0005c("GPSSpeedRef", 12, 2), new C0005c("GPSSpeed", 13, 5), new C0005c("GPSTrackRef", 14, 2), new C0005c("GPSTrack", 15, 5), new C0005c("GPSImgDirectionRef", 16, 2), new C0005c("GPSImgDirection", 17, 5), new C0005c("GPSMapDatum", 18, 2), new C0005c("GPSDestLatitudeRef", 19, 2), new C0005c("GPSDestLatitude", 20, 5), new C0005c("GPSDestLongitudeRef", 21, 2), new C0005c("GPSDestLongitude", 22, 5), new C0005c("GPSDestBearingRef", 23, 2), new C0005c("GPSDestBearing", 24, 5), new C0005c("GPSDestDistanceRef", 25, 2), new C0005c("GPSDestDistance", 26, 5), new C0005c("GPSProcessingMethod", 27, 7), new C0005c("GPSAreaInformation", 28, 7), new C0005c("GPSDateStamp", 29, 2), new C0005c("GPSDifferential", 30, 3)};
        f7F = cVarArr3;
        C0005c[] cVarArr4 = {new C0005c("InteroperabilityIndex", 1, 2)};
        f8G = cVarArr4;
        C0005c[] cVarArr5 = {new C0005c("NewSubfileType", 254, 4), new C0005c("SubfileType", 255, 4), new C0005c("ThumbnailImageWidth", 256, 3, 4), new C0005c("ThumbnailImageLength", 257, 3, 4), new C0005c("BitsPerSample", 258, 3), new C0005c("Compression", 259, 3), new C0005c("PhotometricInterpretation", 262, 3), new C0005c("ImageDescription", 270, 2), new C0005c("Make", 271, 2), new C0005c("Model", 272, 2), new C0005c("StripOffsets", 273, 3, 4), new C0005c("Orientation", 274, 3), new C0005c("SamplesPerPixel", 277, 3), new C0005c("RowsPerStrip", 278, 3, 4), new C0005c("StripByteCounts", 279, 3, 4), new C0005c("XResolution", 282, 5), new C0005c("YResolution", 283, 5), new C0005c("PlanarConfiguration", 284, 3), new C0005c("ResolutionUnit", 296, 3), new C0005c("TransferFunction", 301, 3), new C0005c("Software", 305, 2), new C0005c("DateTime", 306, 2), new C0005c("Artist", 315, 2), new C0005c("WhitePoint", 318, 5), new C0005c("PrimaryChromaticities", 319, 5), new C0005c("SubIFDPointer", 330, 4), new C0005c("JPEGInterchangeFormat", 513, 4), new C0005c("JPEGInterchangeFormatLength", 514, 4), new C0005c("YCbCrCoefficients", 529, 5), new C0005c("YCbCrSubSampling", 530, 3), new C0005c("YCbCrPositioning", 531, 3), new C0005c("ReferenceBlackWhite", 532, 5), new C0005c("Copyright", 33432, 2), new C0005c("ExifIFDPointer", 34665, 4), new C0005c("GPSInfoIFDPointer", 34853, 4), new C0005c("DNGVersion", 50706, 1), new C0005c("DefaultCropSize", 50720, 3, 4)};
        f9H = cVarArr5;
        C0005c[] cVarArr6 = {new C0005c("ThumbnailImage", 256, 7), new C0005c("CameraSettingsIFDPointer", 8224, 4), new C0005c("ImageProcessingIFDPointer", 8256, 4)};
        f11J = cVarArr6;
        C0005c[] cVarArr7 = {new C0005c("PreviewImageStart", 257, 4), new C0005c("PreviewImageLength", 258, 4)};
        f12K = cVarArr7;
        C0005c[] cVarArr8 = {new C0005c("AspectFrame", 4371, 3)};
        f13L = cVarArr8;
        C0005c[] cVarArr9 = {new C0005c("ColorSpace", 55, 3)};
        f14M = cVarArr9;
        C0005c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        f15N = cVarArr10;
        f19R = new HashMap[cVarArr10.length];
        f20S = new HashMap[cVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f23V = forName;
        f24W = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f35z = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0005c[][] cVarArr11 = f15N;
            if (i < cVarArr11.length) {
                f19R[i] = new HashMap<>();
                f20S[i] = new HashMap<>();
                for (C0005c cVar : cVarArr11[i]) {
                    f19R[i].put(Integer.valueOf(cVar.f62a), cVar);
                    f20S[i].put(cVar.f63b, cVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f22U;
                C0005c[] cVarArr12 = f16O;
                hashMap.put(Integer.valueOf(cVarArr12[0].f62a), 5);
                hashMap.put(Integer.valueOf(cVarArr12[1].f62a), 1);
                hashMap.put(Integer.valueOf(cVarArr12[2].f62a), 2);
                hashMap.put(Integer.valueOf(cVarArr12[3].f62a), 3);
                hashMap.put(Integer.valueOf(cVarArr12[4].f62a), 7);
                hashMap.put(Integer.valueOf(cVarArr12[5].f62a), 8);
                return;
            }
        }
    }

    public C0002a(String str) {
        C0005c[][] cVarArr = f15N;
        this.f39d = new HashMap[cVarArr.length];
        this.f40e = new HashSet(cVarArr.length);
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f37b = null;
            this.f36a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    m26u(fileInputStream2);
                    m9b(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    m9b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                m9b(fileInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    /* renamed from: A */
    private void m4A(C0003a aVar) {
        HashMap<String, C0004b> hashMap = this.f39d[4];
        C0004b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int i = bVar.mo30i(this.f41f);
            this.f46k = i;
            if (i != 1) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                }
            }
            if (m24s(hashMap)) {
                m19n(aVar, hashMap);
                return;
            }
            return;
        }
        this.f46k = 6;
        m18m(aVar, hashMap);
    }

    /* renamed from: B */
    private void m5B(int i, int i2) {
        if (!this.f39d[i].isEmpty() && !this.f39d[i2].isEmpty()) {
            C0004b bVar = this.f39d[i].get("ImageLength");
            C0004b bVar2 = this.f39d[i].get("ImageWidth");
            C0004b bVar3 = this.f39d[i2].get("ImageLength");
            C0004b bVar4 = this.f39d[i2].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int i3 = bVar.mo30i(this.f41f);
                int i4 = bVar2.mo30i(this.f41f);
                int i5 = bVar3.mo30i(this.f41f);
                int i6 = bVar4.mo30i(this.f41f);
                if (i3 < i5 && i4 < i6) {
                    HashMap<String, C0004b>[] hashMapArr = this.f39d;
                    HashMap<String, C0004b> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: C */
    private void m6C(C0003a aVar, int i) {
        C0004b bVar;
        C0004b bVar2;
        StringBuilder sb;
        String arrays;
        C0004b bVar3 = this.f39d[i].get("DefaultCropSize");
        C0004b bVar4 = this.f39d[i].get("SensorTopBorder");
        C0004b bVar5 = this.f39d[i].get("SensorLeftBorder");
        C0004b bVar6 = this.f39d[i].get("SensorBottomBorder");
        C0004b bVar7 = this.f39d[i].get("SensorRightBorder");
        if (bVar3 != null) {
            if (bVar3.f59a == 5) {
                C0006d[] dVarArr = (C0006d[]) bVar3.mo32k(this.f41f);
                if (dVarArr == null || dVarArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(dVarArr);
                } else {
                    bVar2 = C0004b.m41d(dVarArr[0], this.f41f);
                    bVar = C0004b.m41d(dVarArr[1], this.f41f);
                    this.f39d[i].put("ImageWidth", bVar2);
                    this.f39d[i].put("ImageLength", bVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) bVar3.mo32k(this.f41f);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    bVar2 = C0004b.m43f(iArr[0], this.f41f);
                    bVar = C0004b.m43f(iArr[1], this.f41f);
                    this.f39d[i].put("ImageWidth", bVar2);
                    this.f39d[i].put("ImageLength", bVar);
                    return;
                }
            }
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            m31z(aVar, i);
        } else {
            int i2 = bVar4.mo30i(this.f41f);
            int i3 = bVar6.mo30i(this.f41f);
            int i4 = bVar7.mo30i(this.f41f);
            int i5 = bVar5.mo30i(this.f41f);
            if (i3 > i2 && i4 > i5) {
                C0004b f = C0004b.m43f(i3 - i2, this.f41f);
                C0004b f2 = C0004b.m43f(i4 - i5, this.f41f);
                this.f39d[i].put("ImageLength", f);
                this.f39d[i].put("ImageWidth", f2);
            }
        }
    }

    /* renamed from: D */
    private void m7D(InputStream inputStream) {
        m5B(0, 5);
        m5B(0, 4);
        m5B(5, 4);
        C0004b bVar = this.f39d[1].get("PixelXDimension");
        C0004b bVar2 = this.f39d[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.f39d[0].put("ImageWidth", bVar);
            this.f39d[0].put("ImageLength", bVar2);
        }
        if (this.f39d[4].isEmpty() && m25t(this.f39d[5])) {
            HashMap<String, C0004b>[] hashMapArr = this.f39d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m25t(this.f39d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: a */
    private void m8a() {
        String d = mo5d("DateTimeOriginal");
        if (d != null && mo5d("DateTime") == null) {
            this.f39d[0].put("DateTime", C0004b.m38a(d));
        }
        if (mo5d("ImageWidth") == null) {
            this.f39d[0].put("ImageWidth", C0004b.m39b(0, this.f41f));
        }
        if (mo5d("ImageLength") == null) {
            this.f39d[0].put("ImageLength", C0004b.m39b(0, this.f41f));
        }
        if (mo5d("Orientation") == null) {
            this.f39d[0].put("Orientation", C0004b.m39b(0, this.f41f));
        }
        if (mo5d("LightSource") == null) {
            this.f39d[1].put("LightSource", C0004b.m39b(0, this.f41f));
        }
    }

    /* renamed from: b */
    private static void m9b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static long[] m10c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: f */
    private C0004b m11f(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f15N.length; i++) {
            C0004b bVar = this.f39d[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12g(p001a0.C0002a.C0003a r10, int r11, int r12) {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.mo11h(r0)
            long r0 = (long) r11
            r10.mo10f(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, a0.a$b>[] r0 = r9.f39d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f41f
            a0.a$b r5 = p001a0.C0002a.C0004b.m39b(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, a0.a$b>[] r0 = r9.f39d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f41f
            a0.a$b r5 = p001a0.C0002a.C0004b.m39b(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.mo5d(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, a0.a$b>[] r5 = r9.f39d
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = f23V
            r7.<init>(r0, r8)
            a0.a$b r0 = p001a0.C0002a.C0004b.m38a(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = 0
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = f24W
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.f47l = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.m29x(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.f41f
            r10.mo11h(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            goto L_0x016f
        L_0x016e:
            throw r10
        L_0x016f:
            goto L_0x016e
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0002a.m12g(a0.a$a, int, int):void");
    }

    /* renamed from: h */
    private int m13h(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m20o(bArr)) {
            return 4;
        }
        if (m22q(bArr)) {
            return 9;
        }
        if (m21p(bArr)) {
            return 7;
        }
        return m23r(bArr) ? 10 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14i(p001a0.C0002a.C0003a r7) {
        /*
            r6 = this;
            r6.m16k(r7)
            java.util.HashMap<java.lang.String, a0.a$b>[] r7 = r6.f39d
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            a0.a$b r7 = (p001a0.C0002a.C0004b) r7
            if (r7 == 0) goto L_0x00f5
            a0.a$a r1 = new a0.a$a
            byte[] r7 = r7.f61c
            r1.<init>((byte[]) r7)
            java.nio.ByteOrder r7 = r6.f41f
            r1.mo11h(r7)
            byte[] r7 = f33x
            int r2 = r7.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.mo10f(r3)
            byte[] r3 = f34y
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L_0x003f
            r2 = 8
        L_0x003b:
            r1.mo10f(r2)
            goto L_0x0048
        L_0x003f:
            boolean r7 = java.util.Arrays.equals(r4, r3)
            if (r7 == 0) goto L_0x0048
            r2 = 12
            goto L_0x003b
        L_0x0048:
            r7 = 6
            r6.m30y(r1, r7)
            java.util.HashMap<java.lang.String, a0.a$b>[] r7 = r6.f39d
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            a0.a$b r7 = (p001a0.C0002a.C0004b) r7
            java.util.HashMap<java.lang.String, a0.a$b>[] r2 = r6.f39d
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            a0.a$b r1 = (p001a0.C0002a.C0004b) r1
            if (r7 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            java.util.HashMap<java.lang.String, a0.a$b>[] r2 = r6.f39d
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, a0.a$b>[] r7 = r6.f39d
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L_0x007c:
            java.util.HashMap<java.lang.String, a0.a$b>[] r7 = r6.f39d
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            a0.a$b r7 = (p001a0.C0002a.C0004b) r7
            if (r7 == 0) goto L_0x00f5
            java.nio.ByteOrder r1 = r6.f41f
            java.lang.Object r7 = r7.mo32k(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x00db
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L_0x009b
            goto L_0x00db
        L_0x009b:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto L_0x00f5
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto L_0x00f5
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto L_0x00bc
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        L_0x00bc:
            java.nio.ByteOrder r7 = r6.f41f
            a0.a$b r7 = p001a0.C0002a.C0004b.m43f(r1, r7)
            java.nio.ByteOrder r0 = r6.f41f
            a0.a$b r0 = p001a0.C0002a.C0004b.m43f(r2, r0)
            java.util.HashMap<java.lang.String, a0.a$b>[] r1 = r6.f39d
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, a0.a$b>[] r7 = r6.f39d
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto L_0x00f5
        L_0x00db:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0002a.m14i(a0.a$a):void");
    }

    /* renamed from: j */
    private void m15j(C0003a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m12g(aVar, i, 5);
        aVar.mo10f((long) i2);
        aVar.mo11h(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f10I.f62a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                C0004b f = C0004b.m43f(readShort, this.f41f);
                C0004b f2 = C0004b.m43f(readShort2, this.f41f);
                this.f39d[0].put("ImageLength", f);
                this.f39d[0].put("ImageWidth", f2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: k */
    private void m16k(C0003a aVar) {
        C0004b bVar;
        m27v(aVar, aVar.available());
        m30y(aVar, 0);
        m6C(aVar, 0);
        m6C(aVar, 5);
        m6C(aVar, 4);
        m7D(aVar);
        if (this.f38c == 8 && (bVar = this.f39d[1].get("MakerNote")) != null) {
            C0003a aVar2 = new C0003a(bVar.f61c);
            aVar2.mo11h(this.f41f);
            aVar2.mo10f(6);
            m30y(aVar2, 9);
            C0004b bVar2 = this.f39d[9].get("ColorSpace");
            if (bVar2 != null) {
                this.f39d[1].put("ColorSpace", bVar2);
            }
        }
    }

    /* renamed from: l */
    private void m17l(C0003a aVar) {
        m16k(aVar);
        if (this.f39d[0].get("JpgFromRaw") != null) {
            m12g(aVar, this.f51p, 5);
        }
        C0004b bVar = this.f39d[0].get("ISO");
        C0004b bVar2 = this.f39d[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.f39d[1].put("PhotographicSensitivity", bVar);
        }
    }

    /* renamed from: m */
    private void m18m(C0003a aVar, HashMap hashMap) {
        int i;
        C0004b bVar = (C0004b) hashMap.get("JPEGInterchangeFormat");
        C0004b bVar2 = (C0004b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int i2 = bVar.mo30i(this.f41f);
            int min = Math.min(bVar2.mo30i(this.f41f), aVar.available() - i2);
            int i3 = this.f38c;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i = this.f47l;
            } else {
                if (i3 == 7) {
                    i = this.f48m;
                }
                if (i2 > 0 && min > 0) {
                    this.f42g = true;
                    this.f43h = i2;
                    this.f44i = min;
                    if (this.f36a == null && this.f37b == null) {
                        byte[] bArr = new byte[min];
                        aVar.mo10f((long) i2);
                        aVar.readFully(bArr);
                        this.f45j = bArr;
                        return;
                    }
                    return;
                }
            }
            i2 += i;
            if (i2 > 0) {
            }
        }
    }

    /* renamed from: n */
    private void m19n(C0003a aVar, HashMap hashMap) {
        String str;
        C0004b bVar = (C0004b) hashMap.get("StripOffsets");
        C0004b bVar2 = (C0004b) hashMap.get("StripByteCounts");
        if (bVar != null && bVar2 != null) {
            long[] c = m10c(bVar.mo32k(this.f41f));
            long[] c2 = m10c(bVar2.mo32k(this.f41f));
            if (c == null) {
                str = "stripOffsets should not be null.";
            } else if (c2 == null) {
                str = "stripByteCounts should not be null.";
            } else {
                long j = 0;
                for (long j2 : c2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < c.length; i4++) {
                    int i5 = (int) c[i4];
                    int i6 = (int) c2[i4];
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    aVar.mo10f((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    aVar.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f42g = true;
                this.f45j = bArr;
                this.f44i = i;
                return;
            }
            Log.w("ExifInterface", str);
        }
    }

    /* renamed from: o */
    private static boolean m20o(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f32w;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: p */
    private boolean m21p(byte[] bArr) {
        C0003a aVar = new C0003a(bArr);
        ByteOrder w = m28w(aVar);
        this.f41f = w;
        aVar.mo11h(w);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    /* renamed from: q */
    private boolean m22q(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private boolean m23r(byte[] bArr) {
        C0003a aVar = new C0003a(bArr);
        ByteOrder w = m28w(aVar);
        this.f41f = w;
        aVar.mo11h(w);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    /* renamed from: s */
    private boolean m24s(HashMap hashMap) {
        C0004b bVar;
        C0004b bVar2 = (C0004b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.mo32k(this.f41f);
        int[] iArr2 = f29t;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f38c != 3 || (bVar = (C0004b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i = bVar.mo30i(this.f41f);
        return (i == 1 && Arrays.equals(iArr, f31v)) || (i == 6 && Arrays.equals(iArr, iArr2));
    }

    /* renamed from: t */
    private boolean m25t(HashMap hashMap) {
        C0004b bVar = (C0004b) hashMap.get("ImageLength");
        C0004b bVar2 = (C0004b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.mo30i(this.f41f) <= 512 && bVar2.mo30i(this.f41f) <= 512;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f52q = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        m8a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26u(java.io.InputStream r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            a0.a$c[][] r2 = f15N     // Catch:{ IOException -> 0x0047 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0047 }
            if (r1 >= r2) goto L_0x0013
            java.util.HashMap<java.lang.String, a0.a$b>[] r2 = r4.f39d     // Catch:{ IOException -> 0x0047 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0047 }
            r3.<init>()     // Catch:{ IOException -> 0x0047 }
            r2[r1] = r3     // Catch:{ IOException -> 0x0047 }
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0013:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0047 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x0047 }
            int r5 = r4.m13h(r1)     // Catch:{ IOException -> 0x0047 }
            r4.f38c = r5     // Catch:{ IOException -> 0x0047 }
            a0.a$a r5 = new a0.a$a     // Catch:{ IOException -> 0x0047 }
            r5.<init>((java.io.InputStream) r1)     // Catch:{ IOException -> 0x0047 }
            int r1 = r4.f38c     // Catch:{ IOException -> 0x0047 }
            switch(r1) {
                case 0: goto L_0x003b;
                case 1: goto L_0x003b;
                case 2: goto L_0x003b;
                case 3: goto L_0x003b;
                case 4: goto L_0x0037;
                case 5: goto L_0x003b;
                case 6: goto L_0x003b;
                case 7: goto L_0x0033;
                case 8: goto L_0x003b;
                case 9: goto L_0x002f;
                case 10: goto L_0x002b;
                case 11: goto L_0x003b;
                default: goto L_0x002a;
            }     // Catch:{ IOException -> 0x0047 }
        L_0x002a:
            goto L_0x003e
        L_0x002b:
            r4.m17l(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x002f:
            r4.m15j(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0033:
            r4.m14i(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0037:
            r4.m12g(r5, r0, r0)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x003b:
            r4.m16k(r5)     // Catch:{ IOException -> 0x0047 }
        L_0x003e:
            r4.m4A(r5)     // Catch:{ IOException -> 0x0047 }
            r5 = 1
            r4.f52q = r5     // Catch:{ IOException -> 0x0047 }
            goto L_0x0049
        L_0x0045:
            r5 = move-exception
            goto L_0x004d
        L_0x0047:
            r4.f52q = r0     // Catch:{ all -> 0x0045 }
        L_0x0049:
            r4.m8a()
            return
        L_0x004d:
            r4.m8a()
            goto L_0x0052
        L_0x0051:
            throw r5
        L_0x0052:
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0002a.m26u(java.io.InputStream):void");
    }

    /* renamed from: v */
    private void m27v(C0003a aVar, int i) {
        ByteOrder w = m28w(aVar);
        this.f41f = w;
        aVar.mo11h(w);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.f38c;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && aVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: w */
    private ByteOrder m28w(C0003a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: x */
    private void m29x(byte[] bArr, int i) {
        C0003a aVar = new C0003a(bArr);
        m27v(aVar, bArr.length);
        m30y(aVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0240  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30y(p001a0.C0002a.C0003a r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.util.Set<java.lang.Integer> r3 = r0.f40e
            int r4 = r1.f58g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f58g
            int r3 = r3 + 2
            int r4 = r1.f57f
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r25.readShort()
            int r4 = r1.f58g
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.f57f
            if (r4 > r5) goto L_0x030e
            if (r3 > 0) goto L_0x002b
            goto L_0x030e
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.String r9 = "ExifInterface"
            if (r5 >= r3) goto L_0x02ae
            int r10 = r25.readUnsignedShort()
            int r11 = r25.readUnsignedShort()
            int r12 = r25.readInt()
            int r13 = r25.mo7a()
            long r13 = (long) r13
            r15 = 4
            long r13 = r13 + r15
            java.util.HashMap<java.lang.Integer, a0.a$c>[] r17 = f19R
            r4 = r17[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r8)
            a0.a$c r4 = (p001a0.C0002a.C0005c) r4
            r8 = 7
            if (r4 != 0) goto L_0x006e
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "Skip the tag entry since tag number is not defined: "
            r15.append(r6)
            r15.append(r10)
            java.lang.String r6 = r15.toString()
        L_0x0066:
            android.util.Log.w(r9, r6)
            r16 = r5
            r7 = r9
            goto L_0x00e5
        L_0x006e:
            if (r11 <= 0) goto L_0x00ce
            int[] r6 = f3B
            int r7 = r6.length
            if (r11 < r7) goto L_0x0076
            goto L_0x00ce
        L_0x0076:
            boolean r7 = r4.mo34a(r11)
            if (r7 != 0) goto L_0x009c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format ("
            r6.append(r7)
            java.lang.String[] r7 = f2A
            r7 = r7[r11]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r4.f63b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x0066
        L_0x009c:
            if (r11 != r8) goto L_0x00a0
            int r11 = r4.f64c
        L_0x00a0:
            r7 = r9
            long r8 = (long) r12
            r6 = r6[r11]
            r16 = r5
            long r5 = (long) r6
            long r5 = r5 * r8
            r8 = 0
            int r20 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r20 < 0) goto L_0x00b9
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r20 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r20 <= 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r8 = 1
            goto L_0x00e8
        L_0x00b9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r7, r8)
            goto L_0x00e7
        L_0x00ce:
            r16 = r5
            r7 = r9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Skip the tag entry since data format is invalid: "
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r7, r5)
        L_0x00e5:
            r5 = 0
        L_0x00e7:
            r8 = 0
        L_0x00e8:
            if (r8 != 0) goto L_0x00f1
            r1.mo10f(r13)
            r19 = r3
            goto L_0x02a7
        L_0x00f1:
            java.lang.String r8 = "Compression"
            r18 = 4
            int r9 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x01a5
            int r9 = r25.readInt()
            int r15 = r0.f38c
            r19 = r3
            r3 = 7
            if (r15 != r3) goto L_0x0163
            java.lang.String r3 = r4.f63b
            java.lang.String r15 = "MakerNote"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x0111
            r0.f48m = r9
            goto L_0x015c
        L_0x0111:
            r3 = 6
            if (r2 != r3) goto L_0x015c
            java.lang.String r15 = r4.f63b
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x015c
            r0.f49n = r9
            r0.f50o = r12
            java.nio.ByteOrder r3 = r0.f41f
            r15 = 6
            a0.a$b r3 = p001a0.C0002a.C0004b.m43f(r15, r3)
            int r15 = r0.f49n
            r20 = r11
            r18 = r12
            long r11 = (long) r15
            java.nio.ByteOrder r15 = r0.f41f
            a0.a$b r11 = p001a0.C0002a.C0004b.m39b(r11, r15)
            int r12 = r0.f50o
            r21 = r13
            long r12 = (long) r12
            java.nio.ByteOrder r14 = r0.f41f
            a0.a$b r12 = p001a0.C0002a.C0004b.m39b(r12, r14)
            java.util.HashMap<java.lang.String, a0.a$b>[] r13 = r0.f39d
            r14 = 4
            r13 = r13[r14]
            r13.put(r8, r3)
            java.util.HashMap<java.lang.String, a0.a$b>[] r3 = r0.f39d
            r3 = r3[r14]
            java.lang.String r13 = "JPEGInterchangeFormat"
            r3.put(r13, r11)
            java.util.HashMap<java.lang.String, a0.a$b>[] r3 = r0.f39d
            r3 = r3[r14]
            java.lang.String r11 = "JPEGInterchangeFormatLength"
            r3.put(r11, r12)
            goto L_0x0179
        L_0x015c:
            r20 = r11
            r18 = r12
            r21 = r13
            goto L_0x0179
        L_0x0163:
            r20 = r11
            r18 = r12
            r21 = r13
            r3 = 10
            if (r15 != r3) goto L_0x0179
            java.lang.String r3 = r4.f63b
            java.lang.String r11 = "JpgFromRaw"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0179
            r0.f51p = r9
        L_0x0179:
            long r11 = (long) r9
            long r13 = r11 + r5
            int r3 = r1.f57f
            r15 = r4
            long r3 = (long) r3
            int r23 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r23 > 0) goto L_0x018a
            r1.mo10f(r11)
            r13 = r21
            goto L_0x01ac
        L_0x018a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data offset is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r7, r3)
            r13 = r21
        L_0x01a0:
            r1.mo10f(r13)
            goto L_0x02a7
        L_0x01a5:
            r19 = r3
            r15 = r4
            r20 = r11
            r18 = r12
        L_0x01ac:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = f22U
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 8
            r9 = 3
            if (r3 == 0) goto L_0x0240
            r5 = -1
            r11 = r20
            if (r11 == r9) goto L_0x01e2
            r8 = 4
            if (r11 == r8) goto L_0x01dd
            if (r11 == r4) goto L_0x01d8
            r4 = 9
            if (r11 == r4) goto L_0x01d3
            r4 = 13
            if (r11 == r4) goto L_0x01d3
        L_0x01d0:
            r8 = 0
            goto L_0x01e8
        L_0x01d3:
            int r4 = r25.readInt()
            goto L_0x01e6
        L_0x01d8:
            short r4 = r25.readShort()
            goto L_0x01e6
        L_0x01dd:
            long r5 = r25.mo9c()
            goto L_0x01d0
        L_0x01e2:
            int r4 = r25.readUnsignedShort()
        L_0x01e6:
            long r5 = (long) r4
            goto L_0x01d0
        L_0x01e8:
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x022a
            int r4 = r1.f57f
            long r8 = (long) r4
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x022a
            java.util.Set<java.lang.Integer> r4 = r0.f40e
            int r8 = (int) r5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L_0x020b
            r1.mo10f(r5)
            int r3 = r3.intValue()
            r0.m30y(r1, r3)
            goto L_0x01a0
        L_0x020b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r4.append(r8)
            r4.append(r3)
            java.lang.String r3 = " (at "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x023b
        L_0x022a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
        L_0x023b:
            android.util.Log.w(r7, r3)
            goto L_0x01a0
        L_0x0240:
            r11 = r20
            int r3 = (int) r5
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            a0.a$b r5 = new a0.a$b
            r6 = r18
            r5.<init>(r11, r6, r3)
            java.util.HashMap<java.lang.String, a0.a$b>[] r3 = r0.f39d
            r3 = r3[r2]
            r6 = r15
            java.lang.String r7 = r6.f63b
            r3.put(r7, r5)
            java.lang.String r3 = r6.f63b
            java.lang.String r7 = "DNGVersion"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0265
            r0.f38c = r9
        L_0x0265:
            java.lang.String r3 = r6.f63b
            java.lang.String r7 = "Make"
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L_0x0279
            java.lang.String r3 = r6.f63b
            java.lang.String r7 = "Model"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0287
        L_0x0279:
            java.nio.ByteOrder r3 = r0.f41f
            java.lang.String r3 = r5.mo31j(r3)
            java.lang.String r7 = "PENTAX"
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x029a
        L_0x0287:
            java.lang.String r3 = r6.f63b
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x029c
            java.nio.ByteOrder r3 = r0.f41f
            int r3 = r5.mo30i(r3)
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r5) goto L_0x029c
        L_0x029a:
            r0.f38c = r4
        L_0x029c:
            int r3 = r25.mo7a()
            long r3 = (long) r3
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x02a7
            goto L_0x01a0
        L_0x02a7:
            int r5 = r16 + 1
            short r5 = (short) r5
            r3 = r19
            goto L_0x002c
        L_0x02ae:
            r7 = r9
            int r2 = r25.mo7a()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f57f
            if (r2 > r3) goto L_0x030e
            int r2 = r25.readInt()
            long r3 = (long) r2
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x02fa
            int r5 = r1.f57f
            if (r2 >= r5) goto L_0x02fa
            java.util.Set<java.lang.Integer> r5 = r0.f40e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02f2
            r1.mo10f(r3)
            java.util.HashMap<java.lang.String, a0.a$b>[] r2 = r0.f39d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02e6
        L_0x02e2:
            r0.m30y(r1, r3)
            goto L_0x030e
        L_0x02e6:
            java.util.HashMap<java.lang.String, a0.a$b>[] r2 = r0.f39d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x030e
            goto L_0x02e2
        L_0x02f2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x0301
        L_0x02fa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x0301:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r7, r1)
        L_0x030e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0002a.m30y(a0.a$a, int):void");
    }

    /* renamed from: z */
    private void m31z(C0003a aVar, int i) {
        C0004b bVar;
        C0004b bVar2 = this.f39d[i].get("ImageLength");
        C0004b bVar3 = this.f39d[i].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f39d[i].get("JPEGInterchangeFormat")) != null) {
            m12g(aVar, bVar.mo30i(this.f41f), i);
        }
    }

    /* renamed from: d */
    public String mo5d(String str) {
        String str2;
        C0004b f = m11f(str);
        if (f != null) {
            if (!f21T.contains(str)) {
                return f.mo31j(this.f41f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = f.f59a;
                if (i == 5 || i == 10) {
                    C0006d[] dVarArr = (C0006d[]) f.mo32k(this.f41f);
                    if (dVarArr == null || dVarArr.length != 3) {
                        str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr);
                    } else {
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].f66a) / ((float) dVarArr[0].f67b))), Integer.valueOf((int) (((float) dVarArr[1].f66a) / ((float) dVarArr[1].f67b))), Integer.valueOf((int) (((float) dVarArr[2].f66a) / ((float) dVarArr[2].f67b)))});
                    }
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + f.f59a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(f.mo29h(this.f41f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public int mo6e(String str, int i) {
        C0004b f = m11f(str);
        if (f == null) {
            return i;
        }
        try {
            return f.mo30i(this.f41f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
