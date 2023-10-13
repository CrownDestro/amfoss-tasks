package p003a2;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p063io.flutter.embedding.engine.FlutterJNI;
import p091n2.C2679b;
import p121s2.C3115e;
import p162z1.C3623a;
import p162z1.C3627b;

/* renamed from: a2.c */
class C0014c implements C2679b, C0021d {

    /* renamed from: a */
    private final FlutterJNI f91a;

    /* renamed from: b */
    private final Map<String, C0018d> f92b;

    /* renamed from: c */
    private Map<String, List<C0015a>> f93c;

    /* renamed from: d */
    private final Object f94d;

    /* renamed from: e */
    private final AtomicBoolean f95e;

    /* renamed from: f */
    private final Map<Integer, C2679b.C2681b> f96f;

    /* renamed from: g */
    private int f97g;

    /* renamed from: h */
    private final C0016b f98h;

    /* renamed from: i */
    private WeakHashMap<C2679b.C2682c, C0016b> f99i;

    /* renamed from: j */
    private C0020f f100j;

    /* renamed from: a2.c$a */
    private static class C0015a {

        /* renamed from: a */
        public final ByteBuffer f101a;

        /* renamed from: b */
        int f102b;

        /* renamed from: c */
        long f103c;

        C0015a(ByteBuffer byteBuffer, int i, long j) {
            this.f101a = byteBuffer;
            this.f102b = i;
            this.f103c = j;
        }
    }

    /* renamed from: a2.c$b */
    interface C0016b {
        /* renamed from: a */
        void mo55a(Runnable runnable);
    }

    /* renamed from: a2.c$c */
    private static class C0017c implements C0020f {

        /* renamed from: a */
        ExecutorService f104a = C3623a.m16080e().mo11892b();

        C0017c() {
        }
    }

    /* renamed from: a2.c$d */
    private static class C0018d {

        /* renamed from: a */
        public final C2679b.C2680a f105a;

        /* renamed from: b */
        public final C0016b f106b;

        C0018d(C2679b.C2680a aVar, C0016b bVar) {
            this.f105a = aVar;
            this.f106b = bVar;
        }
    }

    /* renamed from: a2.c$e */
    static class C0019e implements C2679b.C2681b {

        /* renamed from: a */
        private final FlutterJNI f107a;

        /* renamed from: b */
        private final int f108b;

        /* renamed from: c */
        private final AtomicBoolean f109c = new AtomicBoolean(false);

        C0019e(FlutterJNI flutterJNI, int i) {
            this.f107a = flutterJNI;
            this.f108b = i;
        }

        /* renamed from: a */
        public void mo56a(ByteBuffer byteBuffer) {
            if (this.f109c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.f107a.invokePlatformMessageEmptyResponseCallback(this.f108b);
            } else {
                this.f107a.invokePlatformMessageResponseCallback(this.f108b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* renamed from: a2.c$f */
    interface C0020f {
    }

    C0014c(FlutterJNI flutterJNI) {
        this(flutterJNI, new C0017c());
    }

    C0014c(FlutterJNI flutterJNI, C0020f fVar) {
        this.f92b = new HashMap();
        this.f93c = new HashMap();
        this.f94d = new Object();
        this.f95e = new AtomicBoolean(false);
        this.f96f = new HashMap();
        this.f97g = 1;
        this.f98h = new C0022e();
        this.f99i = new WeakHashMap<>();
        this.f91a = flutterJNI;
        this.f100j = fVar;
    }

    /* renamed from: g */
    private void m70g(String str, C0018d dVar, ByteBuffer byteBuffer, int i, long j) {
        C0018d dVar2 = dVar;
        C0016b bVar = dVar2 != null ? dVar2.f106b : null;
        C3115e.m13859b("PlatformChannel ScheduleHandler on " + str, i);
        C0013b bVar2 = new C0013b(this, str, i, dVar, byteBuffer, j);
        if (bVar == null) {
            bVar = this.f98h;
        }
        bVar.mo55a(bVar2);
    }

    /* renamed from: h */
    private static void m71h(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    /* renamed from: i */
    private void m72i(C0018d dVar, ByteBuffer byteBuffer, int i) {
        if (dVar != null) {
            try {
                C3627b.m16092f("DartMessenger", "Deferring to registered handler to process message.");
                dVar.f105a.mo47a(byteBuffer, new C0019e(this.f91a, i));
            } catch (Exception e) {
                C3627b.m16089c("DartMessenger", "Uncaught exception in binary message listener", e);
            } catch (Error e2) {
                m71h(e2);
            }
        } else {
            C3627b.m16092f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f91a.invokePlatformMessageEmptyResponseCallback(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m73j(String str, int i, C0018d dVar, ByteBuffer byteBuffer, long j) {
        C3115e.m13862e("PlatformChannel ScheduleHandler on " + str, i);
        C3115e.m13858a("DartMessenger#handleMessageFromDart on " + str);
        try {
            m72i(dVar, byteBuffer, i);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f91a.cleanupMessageData(j);
            C3115e.m13861d();
        }
    }

    /* renamed from: a */
    public void mo38a(String str, C2679b.C2680a aVar) {
        mo39c(str, aVar, (C2679b.C2682c) null);
    }

    /* renamed from: b */
    public void mo53b(int i, ByteBuffer byteBuffer) {
        C3627b.m16092f("DartMessenger", "Received message reply from Dart.");
        C2679b.C2681b remove = this.f96f.remove(Integer.valueOf(i));
        if (remove != null) {
            try {
                C3627b.m16092f("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.mo56a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e) {
                C3627b.m16089c("DartMessenger", "Uncaught exception in binary message reply handler", e);
            } catch (Error e2) {
                m71h(e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r10.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r11 = (p003a2.C0014c.C0015a) r10.next();
        m70g(r9, r8.f92b.get(r9), r11.f101a, r11.f102b, r11.f103c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39c(java.lang.String r9, p091n2.C2679b.C2680a r10, p091n2.C2679b.C2682c r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x002a
            java.lang.String r10 = "DartMessenger"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Removing handler for channel '"
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            p162z1.C3627b.m16092f(r10, r11)
            java.lang.Object r0 = r8.f94d
            monitor-enter(r0)
            java.util.Map<java.lang.String, a2.c$d> r10 = r8.f92b     // Catch:{ all -> 0x0027 }
            r10.remove(r9)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r9
        L_0x002a:
            r0 = 0
            if (r11 == 0) goto L_0x0041
            java.util.WeakHashMap<n2.b$c, a2.c$b> r0 = r8.f99i
            java.lang.Object r11 = r0.get(r11)
            r0 = r11
            a2.c$b r0 = (p003a2.C0014c.C0016b) r0
            if (r0 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x0041:
            java.lang.String r11 = "DartMessenger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting handler for channel '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p162z1.C3627b.m16092f(r11, r1)
            java.lang.Object r11 = r8.f94d
            monitor-enter(r11)
            java.util.Map<java.lang.String, a2.c$d> r1 = r8.f92b     // Catch:{ all -> 0x009c }
            a2.c$d r2 = new a2.c$d     // Catch:{ all -> 0x009c }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x009c }
            r1.put(r9, r2)     // Catch:{ all -> 0x009c }
            java.util.Map<java.lang.String, java.util.List<a2.c$a>> r10 = r8.f93c     // Catch:{ all -> 0x009c }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x009c }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0075
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            return
        L_0x0075:
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            java.util.Iterator r10 = r10.iterator()
        L_0x007a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r10.next()
            a2.c$a r11 = (p003a2.C0014c.C0015a) r11
            java.util.Map<java.lang.String, a2.c$d> r0 = r8.f92b
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            a2.c$d r3 = (p003a2.C0014c.C0018d) r3
            java.nio.ByteBuffer r4 = r11.f101a
            int r5 = r11.f102b
            long r6 = r11.f103c
            r1 = r8
            r2 = r9
            r1.m70g(r2, r3, r4, r5, r6)
            goto L_0x007a
        L_0x009b:
            return
        L_0x009c:
            r9 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            goto L_0x00a0
        L_0x009f:
            throw r9
        L_0x00a0:
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.C0014c.mo39c(java.lang.String, n2.b$a, n2.b$c):void");
    }

    /* renamed from: d */
    public void mo40d(String str, ByteBuffer byteBuffer, C2679b.C2681b bVar) {
        C3115e.m13858a("DartMessenger#send on " + str);
        try {
            C3627b.m16092f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i = this.f97g;
            this.f97g = i + 1;
            if (bVar != null) {
                this.f96f.put(Integer.valueOf(i), bVar);
            }
            if (byteBuffer == null) {
                this.f91a.dispatchEmptyPlatformMessage(str, i);
            } else {
                this.f91a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
            }
        } finally {
            C3115e.m13861d();
        }
    }

    /* renamed from: e */
    public void mo54e(String str, ByteBuffer byteBuffer, int i, long j) {
        C0018d dVar;
        boolean z;
        C3627b.m16092f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f94d) {
            dVar = this.f92b.get(str);
            z = this.f95e.get() && dVar == null;
            if (z) {
                if (!this.f93c.containsKey(str)) {
                    this.f93c.put(str, new LinkedList());
                }
                this.f93c.get(str).add(new C0015a(byteBuffer, i, j));
            }
        }
        if (!z) {
            m70g(str, dVar, byteBuffer, i, j);
        }
    }
}
