package p021c4;

import p041f3.C1920g;

/* renamed from: c4.b */
public enum C1304b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: t */
    public static final C1305a f4662t = null;

    /* renamed from: d */
    private final int f4663d;

    /* renamed from: c4.b$a */
    public static final class C1305a {
        private C1305a() {
        }

        public /* synthetic */ C1305a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1304b mo5131a(int i) {
            for (C1304b bVar : C1304b.values()) {
                if (bVar.mo5130a() == i) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f4662t = new C1305a((C1920g) null);
    }

    private C1304b(int i) {
        this.f4663d = i;
    }

    /* renamed from: a */
    public final int mo5130a() {
        return this.f4663d;
    }
}
