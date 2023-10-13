package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p154y.C3550b;

/* renamed from: androidx.emoji2.text.l */
class C0832l {

    /* renamed from: androidx.emoji2.text.l$a */
    private static class C0833a implements C0835c {

        /* renamed from: a */
        private final ByteBuffer f2920a;

        C0833a(ByteBuffer byteBuffer) {
            this.f2920a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public long mo3144a() {
            return C0832l.m3705c(this.f2920a.getInt());
        }

        /* renamed from: b */
        public void mo3145b(int i) {
            ByteBuffer byteBuffer = this.f2920a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        /* renamed from: c */
        public int mo3146c() {
            return this.f2920a.getInt();
        }

        /* renamed from: d */
        public long mo3147d() {
            return (long) this.f2920a.position();
        }

        public int readUnsignedShort() {
            return C0832l.m3706d(this.f2920a.getShort());
        }
    }

    /* renamed from: androidx.emoji2.text.l$b */
    private static class C0834b {

        /* renamed from: a */
        private final long f2921a;

        /* renamed from: b */
        private final long f2922b;

        C0834b(long j, long j2) {
            this.f2921a = j;
            this.f2922b = j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo3149a() {
            return this.f2921a;
        }
    }

    /* renamed from: androidx.emoji2.text.l$c */
    private interface C0835c {
        /* renamed from: a */
        long mo3144a();

        /* renamed from: b */
        void mo3145b(int i);

        /* renamed from: c */
        int mo3146c();

        /* renamed from: d */
        long mo3147d();

        int readUnsignedShort();
    }

    /* renamed from: a */
    private static C0834b m3703a(C0835c cVar) {
        long j;
        cVar.mo3145b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.mo3145b(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int c = cVar.mo3146c();
                cVar.mo3145b(4);
                j = cVar.mo3144a();
                cVar.mo3145b(4);
                if (1835365473 == c) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.mo3145b((int) (j - cVar.mo3147d()));
                cVar.mo3145b(12);
                long a = cVar.mo3144a();
                for (int i2 = 0; ((long) i2) < a; i2++) {
                    int c2 = cVar.mo3146c();
                    long a2 = cVar.mo3144a();
                    long a3 = cVar.mo3144a();
                    if (1164798569 == c2 || 1701669481 == c2) {
                        return new C0834b(a2 + j, a3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    static C3550b m3704b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m3703a(new C0833a(duplicate)).mo3149a());
        return C3550b.m15648h(duplicate);
    }

    /* renamed from: c */
    static long m3705c(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: d */
    static int m3706d(short s) {
        return s & 65535;
    }
}
