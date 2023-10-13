package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.C0569e;
import androidx.core.provider.C0576g;
import androidx.core.util.C0612h;
import androidx.emoji2.text.C0811e;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.j */
public class C0828j extends C0811e.C0815c {

    /* renamed from: j */
    private static final C0829a f2908j = new C0829a();

    /* renamed from: androidx.emoji2.text.j$a */
    public static class C0829a {
        /* renamed from: a */
        public Typeface mo3137a(Context context, C0576g.C0578b bVar) {
            return C0576g.m2580a(context, (CancellationSignal) null, new C0576g.C0578b[]{bVar});
        }

        /* renamed from: b */
        public C0576g.C0577a mo3138b(Context context, C0569e eVar) {
            return C0576g.m2581b(context, (CancellationSignal) null, eVar);
        }

        /* renamed from: c */
        public void mo3139c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.j$b */
    private static class C0830b implements C0811e.C0819g {

        /* renamed from: a */
        private final Context f2909a;

        /* renamed from: b */
        private final C0569e f2910b;

        /* renamed from: c */
        private final C0829a f2911c;

        /* renamed from: d */
        private final Object f2912d = new Object();

        /* renamed from: e */
        private Handler f2913e;

        /* renamed from: f */
        private Executor f2914f;

        /* renamed from: g */
        private ThreadPoolExecutor f2915g;

        /* renamed from: h */
        C0811e.C0820h f2916h;

        /* renamed from: i */
        private ContentObserver f2917i;

        /* renamed from: j */
        private Runnable f2918j;

        C0830b(Context context, C0569e eVar, C0829a aVar) {
            C0612h.m2671h(context, "Context cannot be null");
            C0612h.m2671h(eVar, "FontRequest cannot be null");
            this.f2909a = context.getApplicationContext();
            this.f2910b = eVar;
            this.f2911c = aVar;
        }

        /* renamed from: b */
        private void m3697b() {
            synchronized (this.f2912d) {
                this.f2916h = null;
                ContentObserver contentObserver = this.f2917i;
                if (contentObserver != null) {
                    this.f2911c.mo3139c(this.f2909a, contentObserver);
                    this.f2917i = null;
                }
                Handler handler = this.f2913e;
                if (handler != null) {
                    handler.removeCallbacks(this.f2918j);
                }
                this.f2913e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2915g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2914f = null;
                this.f2915g = null;
            }
        }

        /* renamed from: e */
        private C0576g.C0578b m3698e() {
            try {
                C0576g.C0577a b = this.f2911c.mo3138b(this.f2909a, this.f2910b);
                if (b.mo2612c() == 0) {
                    C0576g.C0578b[] b2 = b.mo2611b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.mo2612c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: a */
        public void mo3083a(C0811e.C0820h hVar) {
            C0612h.m2671h(hVar, "LoaderCallback cannot be null");
            synchronized (this.f2912d) {
                this.f2916h = hVar;
            }
            mo3141d();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r4.f2912d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
            if (r1 != 0) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            androidx.core.p008os.C0560k.m2546a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
            r1 = r4.f2911c.mo3137a(r4.f2909a, r0);
            r0 = androidx.core.graphics.C0543o.m2506f(r4.f2909a, (android.os.CancellationSignal) null, r0.mo2615d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
            if (r0 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
            if (r1 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
            r0 = androidx.emoji2.text.C0836m.m3717b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            androidx.core.p008os.C0560k.m2547b();
            r1 = r4.f2912d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r2 = r4.f2916h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
            if (r2 == null) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
            r2.mo3086b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            m3697b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x005c, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            androidx.core.p008os.C0560k.m2547b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0061, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0081, code lost:
            monitor-enter(r4.f2912d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r2 = r4.f2916h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0084, code lost:
            if (r2 != null) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
            r2.mo3085a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x008a, code lost:
            m3697b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = m3698e();
            r1 = r0.mo2613b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3140c() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f2912d
                monitor-enter(r0)
                androidx.emoji2.text.e$h r1 = r4.f2916h     // Catch:{ all -> 0x0091 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                androidx.core.provider.g$b r0 = r4.m3698e()     // Catch:{ all -> 0x007e }
                int r1 = r0.mo2613b()     // Catch:{ all -> 0x007e }
                r2 = 2
                if (r1 != r2) goto L_0x001e
                java.lang.Object r2 = r4.f2912d     // Catch:{ all -> 0x007e }
                monitor-enter(r2)     // Catch:{ all -> 0x007e }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                goto L_0x001e
            L_0x001a:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x001c:
                r0 = move-exception
                goto L_0x001a
            L_0x001e:
                if (r1 != 0) goto L_0x0062
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.p008os.C0560k.m2546a(r1)     // Catch:{ all -> 0x005d }
                androidx.emoji2.text.j$a r1 = r4.f2911c     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f2909a     // Catch:{ all -> 0x005d }
                android.graphics.Typeface r1 = r1.mo3137a(r2, r0)     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f2909a     // Catch:{ all -> 0x005d }
                r3 = 0
                android.net.Uri r0 = r0.mo2615d()     // Catch:{ all -> 0x005d }
                java.nio.ByteBuffer r0 = androidx.core.graphics.C0543o.m2506f(r2, r3, r0)     // Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x0055
                if (r1 == 0) goto L_0x0055
                androidx.emoji2.text.m r0 = androidx.emoji2.text.C0836m.m3717b(r1, r0)     // Catch:{ all -> 0x005d }
                androidx.core.p008os.C0560k.m2547b()     // Catch:{ all -> 0x007e }
                java.lang.Object r1 = r4.f2912d     // Catch:{ all -> 0x007e }
                monitor-enter(r1)     // Catch:{ all -> 0x007e }
                androidx.emoji2.text.e$h r2 = r4.f2916h     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x004d
                r2.mo3086b(r0)     // Catch:{ all -> 0x0052 }
            L_0x004d:
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                r4.m3697b()     // Catch:{ all -> 0x007e }
                goto L_0x008d
            L_0x0052:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0055:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005d }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x005d }
                throw r0     // Catch:{ all -> 0x005d }
            L_0x005d:
                r0 = move-exception
                androidx.core.p008os.C0560k.m2547b()     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0062:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r2.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x007e }
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x007e }
                r0.<init>(r1)     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x007e:
                r0 = move-exception
                java.lang.Object r1 = r4.f2912d
                monitor-enter(r1)
                androidx.emoji2.text.e$h r2 = r4.f2916h     // Catch:{ all -> 0x008e }
                if (r2 == 0) goto L_0x0089
                r2.mo3085a(r0)     // Catch:{ all -> 0x008e }
            L_0x0089:
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                r4.m3697b()
            L_0x008d:
                return
            L_0x008e:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                throw r0
            L_0x0091:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                goto L_0x0095
            L_0x0094:
                throw r1
            L_0x0095:
                goto L_0x0094
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0828j.C0830b.mo3140c():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3141d() {
            synchronized (this.f2912d) {
                if (this.f2916h != null) {
                    if (this.f2914f == null) {
                        ThreadPoolExecutor b = C0803b.m3602b("emojiCompat");
                        this.f2915g = b;
                        this.f2914f = b;
                    }
                    this.f2914f.execute(new C0831k(this));
                }
            }
        }

        /* renamed from: f */
        public void mo3142f(Executor executor) {
            synchronized (this.f2912d) {
                this.f2914f = executor;
            }
        }
    }

    public C0828j(Context context, C0569e eVar) {
        super(new C0830b(context, eVar, f2908j));
    }

    /* renamed from: c */
    public C0828j mo3136c(Executor executor) {
        ((C0830b) mo3112a()).mo3142f(executor);
        return this;
    }
}
