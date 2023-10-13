package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p034e3.C1780l;
import p041f3.C1920g;
import p041f3.C1924k;
import p140v3.C3423b;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    private static final byte[] f9381e = {(byte) 42};

    /* renamed from: f */
    private static final List<String> f9382f = C3262k.m14365b("*");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final PublicSuffixDatabase f9383g = new PublicSuffixDatabase();

    /* renamed from: h */
    public static final C2857a f9384h = new C2857a((C1920g) null);

    /* renamed from: a */
    private final AtomicBoolean f9385a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f9386b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f9387c;

    /* renamed from: d */
    private byte[] f9388d;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C2857a {
        private C2857a() {
        }

        public /* synthetic */ C2857a(C1920g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m12948b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int b;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = C3423b.m15084b(bArr4[i9][i10], 255);
                    }
                    b = i3 - C3423b.m15084b(bArr3[i6 + i11], 255);
                    if (b == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            z2 = true;
                            i10 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (b >= 0) {
                    if (b <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C1924k.m9137c(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        /* renamed from: c */
        public final PublicSuffixDatabase mo9832c() {
            return PublicSuffixDatabase.f9383g;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dc  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m12943b(java.util.List<java.lang.String> r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f9385a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f9385a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0018
            r17.m12945e()
            goto L_0x0025
        L_0x0018:
            java.util.concurrent.CountDownLatch r1 = r0.f9386b     // Catch:{ InterruptedException -> 0x001e }
            r1.await()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0025
        L_0x001e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0025:
            byte[] r1 = r0.f9387c
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x011e
            int r1 = r18.size()
            byte[][] r4 = new byte[r1][]
            r5 = 0
        L_0x0035:
            if (r5 >= r1) goto L_0x005e
            r6 = r18
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            p041f3.C1924k.m9137c(r8, r9)
            if (r7 == 0) goto L_0x0056
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "(this as java.lang.String).getBytes(charset)"
            p041f3.C1924k.m9137c(r7, r8)
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0056:
            t2.p r1 = new t2.p
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            r5 = 0
        L_0x005f:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x0077
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = f9384h
            byte[] r9 = r0.f9387c
            if (r9 != 0) goto L_0x006d
            p041f3.C1924k.m9154t(r6)
        L_0x006d:
            java.lang.String r8 = r8.m12948b(r9, r4, r5)
            if (r8 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            int r5 = r5 + 1
            goto L_0x005f
        L_0x0077:
            r8 = r7
        L_0x0078:
            if (r1 <= r3) goto L_0x009d
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = 0
        L_0x0083:
            if (r10 >= r9) goto L_0x009d
            byte[] r11 = f9381e
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r11 = f9384h
            byte[] r12 = r0.f9387c
            if (r12 != 0) goto L_0x0092
            p041f3.C1924k.m9154t(r6)
        L_0x0092:
            java.lang.String r11 = r11.m12948b(r12, r5, r10)
            if (r11 == 0) goto L_0x009a
            r5 = r11
            goto L_0x009e
        L_0x009a:
            int r10 = r10 + 1
            goto L_0x0083
        L_0x009d:
            r5 = r7
        L_0x009e:
            if (r5 == 0) goto L_0x00ba
            int r1 = r1 - r3
            r6 = 0
        L_0x00a2:
            if (r6 >= r1) goto L_0x00ba
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r9 = f9384h
            byte[] r10 = r0.f9388d
            if (r10 != 0) goto L_0x00af
            java.lang.String r11 = "publicSuffixExceptionListBytes"
            p041f3.C1924k.m9154t(r11)
        L_0x00af:
            java.lang.String r9 = r9.m12948b(r10, r4, r6)
            if (r9 == 0) goto L_0x00b7
            r7 = r9
            goto L_0x00ba
        L_0x00b7:
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x00ba:
            r1 = 46
            if (r7 == 0) goto L_0x00dc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 33
            r4.append(r5)
            r4.append(r7)
            java.lang.String r8 = r4.toString()
            char[] r9 = new char[r3]
            r9[r2] = r1
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r1 = p086m3.C2647q.m12032k0(r8, r9, r10, r11, r12, r13)
            return r1
        L_0x00dc:
            if (r8 != 0) goto L_0x00e3
            if (r5 != 0) goto L_0x00e3
            java.util.List<java.lang.String> r1 = f9382f
            return r1
        L_0x00e3:
            if (r8 == 0) goto L_0x00f6
            char[] r7 = new char[r3]
            r7[r2] = r1
            r4 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r8
            r8 = r4
            java.util.List r4 = p086m3.C2647q.m12032k0(r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x00f6
            goto L_0x00fa
        L_0x00f6:
            java.util.List r4 = p133u2.C3263l.m14369f()
        L_0x00fa:
            if (r5 == 0) goto L_0x010d
            char[] r12 = new char[r3]
            r12[r2] = r1
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r5
            java.util.List r1 = p086m3.C2647q.m12032k0(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            java.util.List r1 = p133u2.C3263l.m14369f()
        L_0x0111:
            int r2 = r4.size()
            int r3 = r1.size()
            if (r2 <= r3) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r4 = r1
        L_0x011d:
            return r4
        L_0x011e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            goto L_0x012b
        L_0x012a:
            throw r1
        L_0x012b:
            goto L_0x012a
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m12943b(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        p020c3.C1302a.m6198a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        throw r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m12944d() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x004f
            i4.m r1 = new i4.m
            i4.b0 r0 = p062i4.C2123p.m9848k(r0)
            r1.<init>(r0)
            i4.h r0 = p062i4.C2123p.m9841d(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0048 }
            long r2 = (long) r2     // Catch:{ all -> 0x0048 }
            byte[] r2 = r0.mo7914V(r2)     // Catch:{ all -> 0x0048 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0048 }
            long r3 = (long) r3     // Catch:{ all -> 0x0048 }
            byte[] r3 = r0.mo7914V(r3)     // Catch:{ all -> 0x0048 }
            t2.s r4 = p127t2.C3187s.f10561a     // Catch:{ all -> 0x0048 }
            p020c3.C1302a.m6198a(r0, r1)
            monitor-enter(r5)
            if (r2 != 0) goto L_0x0035
            p041f3.C1924k.m9150p()     // Catch:{ all -> 0x0045 }
        L_0x0035:
            r5.f9387c = r2     // Catch:{ all -> 0x0045 }
            if (r3 != 0) goto L_0x003c
            p041f3.C1924k.m9150p()     // Catch:{ all -> 0x0045 }
        L_0x003c:
            r5.f9388d = r3     // Catch:{ all -> 0x0045 }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f9386b
            r0.countDown()
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r2 = move-exception
            p020c3.C1302a.m6198a(r0, r1)
            throw r2
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m12944d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0027 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m12945e() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.m12944d()     // Catch:{  }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            r1.interrupt()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            e4.h$a r2 = p035e4.C1809h.f6654c     // Catch:{ all -> 0x000e }
            e4.h r2 = r2.mo7501g()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.mo7497k(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            goto L_0x0037
        L_0x0036:
            throw r1
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m12945e():void");
    }

    /* renamed from: c */
    public final String mo9831c(String str) {
        C1924k.m9142h(str, "domain");
        String unicode = IDN.toUnicode(str);
        C1924k.m9137c(unicode, "unicodeDomain");
        List k0 = C2647q.m12032k0(unicode, new char[]{'.'}, false, 0, 6, (Object) null);
        List<String> b = m12943b(k0);
        if (k0.size() == b.size() && b.get(0).charAt(0) != '!') {
            return null;
        }
        char charAt = b.get(0).charAt(0);
        int size = k0.size();
        int size2 = b.size();
        if (charAt != '!') {
            size2++;
        }
        return C2487j.m11477g(C2487j.m11474d(C3271t.m14403w(C2647q.m12032k0(str, new char[]{'.'}, false, 0, 6, (Object) null)), size - size2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C1780l) null, 62, (Object) null);
    }
}
