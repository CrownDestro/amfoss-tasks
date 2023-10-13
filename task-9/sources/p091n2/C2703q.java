package p091n2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p091n2.C2701p;
import p162z1.C3627b;

/* renamed from: n2.q */
public final class C2703q implements C2695j {

    /* renamed from: b */
    public static final C2703q f9016b = new C2703q(C2701p.f9013a);

    /* renamed from: a */
    private final C2701p f9017a;

    public C2703q(C2701p pVar) {
        this.f9017a = pVar;
    }

    /* renamed from: a */
    public ByteBuffer mo9424a(Object obj) {
        C2701p.C2702a aVar = new C2701p.C2702a();
        aVar.write(0);
        this.f9017a.mo9442p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo9443a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: b */
    public C2688h mo9425b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = this.f9017a.mo9440f(byteBuffer);
        Object f2 = this.f9017a.mo9440f(byteBuffer);
        if ((f instanceof String) && !byteBuffer.hasRemaining()) {
            return new C2688h((String) f, f2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x001e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo9426c(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            if (r0 != r1) goto L_0x004a
            goto L_0x001e
        L_0x0011:
            n2.p r0 = r4.f9017a
            java.lang.Object r0 = r0.mo9440f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            n2.p r0 = r4.f9017a
            java.lang.Object r0 = r0.mo9440f(r5)
            n2.p r1 = r4.f9017a
            java.lang.Object r1 = r1.mo9440f(r5)
            n2.p r2 = r4.f9017a
            java.lang.Object r2 = r2.mo9440f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x003a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
        L_0x003a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L_0x004a
            n2.c r5 = new n2.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L_0x004a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p091n2.C2703q.mo9426c(java.nio.ByteBuffer):java.lang.Object");
    }

    /* renamed from: d */
    public ByteBuffer mo9427d(String str, String str2, Object obj, String str3) {
        C2701p.C2702a aVar = new C2701p.C2702a();
        aVar.write(1);
        this.f9017a.mo9442p(aVar, str);
        this.f9017a.mo9442p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f9017a.mo9442p(aVar, C3627b.m16090d((Throwable) obj));
        } else {
            this.f9017a.mo9442p(aVar, obj);
        }
        this.f9017a.mo9442p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo9443a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: e */
    public ByteBuffer mo9428e(C2688h hVar) {
        C2701p.C2702a aVar = new C2701p.C2702a();
        this.f9017a.mo9442p(aVar, hVar.f9001a);
        this.f9017a.mo9442p(aVar, hVar.f9002b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo9443a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: f */
    public ByteBuffer mo9429f(String str, String str2, Object obj) {
        C2701p.C2702a aVar = new C2701p.C2702a();
        aVar.write(1);
        this.f9017a.mo9442p(aVar, str);
        this.f9017a.mo9442p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f9017a.mo9442p(aVar, C3627b.m16090d((Throwable) obj));
        } else {
            this.f9017a.mo9442p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo9443a(), 0, aVar.size());
        return allocateDirect;
    }
}
