package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.util.C0612h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p070k.C2337b;

/* renamed from: androidx.emoji2.text.e */
public class C0811e {

    /* renamed from: n */
    private static final Object f2851n = new Object();

    /* renamed from: o */
    private static final Object f2852o = new Object();

    /* renamed from: p */
    private static volatile C0811e f2853p;

    /* renamed from: a */
    private final ReadWriteLock f2854a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private final Set<C0817e> f2855b;

    /* renamed from: c */
    private volatile int f2856c = 3;

    /* renamed from: d */
    private final Handler f2857d;

    /* renamed from: e */
    private final C0814b f2858e;

    /* renamed from: f */
    final C0819g f2859f;

    /* renamed from: g */
    final boolean f2860g;

    /* renamed from: h */
    final boolean f2861h;

    /* renamed from: i */
    final int[] f2862i;

    /* renamed from: j */
    private final boolean f2863j;

    /* renamed from: k */
    private final int f2864k;

    /* renamed from: l */
    private final int f2865l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C0816d f2866m;

    /* renamed from: androidx.emoji2.text.e$a */
    private static final class C0812a extends C0814b {

        /* renamed from: b */
        private volatile C0824h f2867b;

        /* renamed from: c */
        private volatile C0836m f2868c;

        /* renamed from: androidx.emoji2.text.e$a$a */
        class C0813a extends C0820h {
            C0813a() {
            }

            /* renamed from: a */
            public void mo3085a(Throwable th) {
                C0812a.this.f2870a.mo3099m(th);
            }

            /* renamed from: b */
            public void mo3086b(C0836m mVar) {
                C0812a.this.mo3111d(mVar);
            }
        }

        C0812a(C0811e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3108a() {
            try {
                this.f2870a.f2859f.mo3083a(new C0813a());
            } catch (Throwable th) {
                this.f2870a.mo3099m(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharSequence mo3109b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f2867b.mo3128h(charSequence, i, i2, i3, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3110c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2868c.mo3152e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2870a.f2860g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3111d(C0836m mVar) {
            if (mVar == null) {
                this.f2870a.mo3099m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2868c = mVar;
            C0836m mVar2 = this.f2868c;
            C0821i iVar = new C0821i();
            C0816d a = this.f2870a.f2866m;
            C0811e eVar = this.f2870a;
            this.f2867b = new C0824h(mVar2, iVar, a, eVar.f2861h, eVar.f2862i);
            this.f2870a.mo3100n();
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    private static class C0814b {

        /* renamed from: a */
        final C0811e f2870a;

        C0814b(C0811e eVar) {
            this.f2870a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3108a() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public CharSequence mo3109b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3110c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    public static abstract class C0815c {

        /* renamed from: a */
        final C0819g f2871a;

        /* renamed from: b */
        boolean f2872b;

        /* renamed from: c */
        boolean f2873c;

        /* renamed from: d */
        int[] f2874d;

        /* renamed from: e */
        Set<C0817e> f2875e;

        /* renamed from: f */
        boolean f2876f;

        /* renamed from: g */
        int f2877g = -16711936;

        /* renamed from: h */
        int f2878h = 0;

        /* renamed from: i */
        C0816d f2879i = new C0810d();

        protected C0815c(C0819g gVar) {
            C0612h.m2671h(gVar, "metadataLoader cannot be null.");
            this.f2871a = gVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C0819g mo3112a() {
            return this.f2871a;
        }

        /* renamed from: b */
        public C0815c mo3113b(int i) {
            this.f2878h = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.e$d */
    public interface C0816d {
        /* renamed from: a */
        boolean mo3094a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.e$e */
    public static abstract class C0817e {
        /* renamed from: a */
        public void mo1250a(Throwable th) {
        }

        /* renamed from: b */
        public void mo1251b() {
        }
    }

    /* renamed from: androidx.emoji2.text.e$f */
    private static class C0818f implements Runnable {

        /* renamed from: d */
        private final List<C0817e> f2880d;

        /* renamed from: e */
        private final Throwable f2881e;

        /* renamed from: f */
        private final int f2882f;

        C0818f(C0817e eVar, int i) {
            this(Arrays.asList(new C0817e[]{(C0817e) C0612h.m2671h(eVar, "initCallback cannot be null")}), i, (Throwable) null);
        }

        C0818f(Collection<C0817e> collection, int i) {
            this(collection, i, (Throwable) null);
        }

        C0818f(Collection<C0817e> collection, int i, Throwable th) {
            C0612h.m2671h(collection, "initCallbacks cannot be null");
            this.f2880d = new ArrayList(collection);
            this.f2882f = i;
            this.f2881e = th;
        }

        public void run() {
            int size = this.f2880d.size();
            int i = 0;
            if (this.f2882f != 1) {
                while (i < size) {
                    this.f2880d.get(i).mo1250a(this.f2881e);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f2880d.get(i).mo1251b();
                i++;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.e$g */
    public interface C0819g {
        /* renamed from: a */
        void mo3083a(C0820h hVar);
    }

    /* renamed from: androidx.emoji2.text.e$h */
    public static abstract class C0820h {
        /* renamed from: a */
        public abstract void mo3085a(Throwable th);

        /* renamed from: b */
        public abstract void mo3086b(C0836m mVar);
    }

    /* renamed from: androidx.emoji2.text.e$i */
    static class C0821i {
        C0821i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0827i mo3115a(C0823g gVar) {
            return new C0840o(gVar);
        }
    }

    private C0811e(C0815c cVar) {
        this.f2860g = cVar.f2872b;
        this.f2861h = cVar.f2873c;
        this.f2862i = cVar.f2874d;
        this.f2863j = cVar.f2876f;
        this.f2864k = cVar.f2877g;
        this.f2859f = cVar.f2871a;
        this.f2865l = cVar.f2878h;
        this.f2866m = cVar.f2879i;
        this.f2857d = new Handler(Looper.getMainLooper());
        C2337b bVar = new C2337b();
        this.f2855b = bVar;
        Set<C0817e> set = cVar.f2875e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2875e);
        }
        this.f2858e = new C0812a(this);
        m3630l();
    }

    /* renamed from: b */
    public static C0811e m3624b() {
        C0811e eVar;
        synchronized (f2851n) {
            eVar = f2853p;
            C0612h.m2672i(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    /* renamed from: e */
    public static boolean m3625e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return C0824h.m3675c(inputConnection, editable, i, i2, z);
    }

    /* renamed from: f */
    public static boolean m3626f(Editable editable, int i, KeyEvent keyEvent) {
        return C0824h.m3676d(editable, i, keyEvent);
    }

    /* renamed from: g */
    public static C0811e m3627g(C0815c cVar) {
        C0811e eVar = f2853p;
        if (eVar == null) {
            synchronized (f2851n) {
                eVar = f2853p;
                if (eVar == null) {
                    eVar = new C0811e(cVar);
                    f2853p = eVar;
                }
            }
        }
        return eVar;
    }

    /* renamed from: h */
    public static boolean m3628h() {
        return f2853p != null;
    }

    /* renamed from: j */
    private boolean m3629j() {
        return mo3096d() == 1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    private void m3630l() {
        this.f2854a.writeLock().lock();
        try {
            if (this.f2865l == 0) {
                this.f2856c = 0;
            }
            this.f2854a.writeLock().unlock();
            if (mo3096d() == 0) {
                this.f2858e.mo3108a();
            }
        } catch (Throwable th) {
            this.f2854a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public int mo3095c() {
        return this.f2864k;
    }

    /* renamed from: d */
    public int mo3096d() {
        this.f2854a.readLock().lock();
        try {
            return this.f2856c;
        } finally {
            this.f2854a.readLock().unlock();
        }
    }

    /* renamed from: i */
    public boolean mo3097i() {
        return this.f2863j;
    }

    /* renamed from: k */
    public void mo3098k() {
        boolean z = true;
        if (this.f2865l != 1) {
            z = false;
        }
        C0612h.m2672i(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!m3629j()) {
            this.f2854a.writeLock().lock();
            try {
                if (this.f2856c != 0) {
                    this.f2856c = 0;
                    this.f2854a.writeLock().unlock();
                    this.f2858e.mo3108a();
                }
            } finally {
                this.f2854a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3099m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2854a.writeLock().lock();
        try {
            this.f2856c = 2;
            arrayList.addAll(this.f2855b);
            this.f2855b.clear();
            this.f2854a.writeLock().unlock();
            this.f2857d.post(new C0818f(arrayList, this.f2856c, th));
        } catch (Throwable th2) {
            this.f2854a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3100n() {
        ArrayList arrayList = new ArrayList();
        this.f2854a.writeLock().lock();
        try {
            this.f2856c = 1;
            arrayList.addAll(this.f2855b);
            this.f2855b.clear();
            this.f2854a.writeLock().unlock();
            this.f2857d.post(new C0818f((Collection<C0817e>) arrayList, this.f2856c));
        } catch (Throwable th) {
            this.f2854a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: o */
    public CharSequence mo3101o(CharSequence charSequence) {
        return mo3102p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: p */
    public CharSequence mo3102p(CharSequence charSequence, int i, int i2) {
        return mo3103q(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: q */
    public CharSequence mo3103q(CharSequence charSequence, int i, int i2, int i3) {
        return mo3104r(charSequence, i, i2, i3, 0);
    }

    /* renamed from: r */
    public CharSequence mo3104r(CharSequence charSequence, int i, int i2, int i3, int i4) {
        C0612h.m2672i(m3629j(), "Not initialized yet");
        C0612h.m2668e(i, "start cannot be negative");
        C0612h.m2668e(i2, "end cannot be negative");
        C0612h.m2668e(i3, "maxEmojiCount cannot be negative");
        C0612h.m2665b(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        C0612h.m2665b(i <= charSequence.length(), "start should be < than charSequence length");
        C0612h.m2665b(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        return this.f2858e.mo3109b(charSequence, i, i2, i3, i4 != 1 ? i4 != 2 ? this.f2860g : false : true);
    }

    /* renamed from: s */
    public void mo3105s(C0817e eVar) {
        C0612h.m2671h(eVar, "initCallback cannot be null");
        this.f2854a.writeLock().lock();
        try {
            if (this.f2856c != 1) {
                if (this.f2856c != 2) {
                    this.f2855b.add(eVar);
                }
            }
            this.f2857d.post(new C0818f(eVar, this.f2856c));
        } finally {
            this.f2854a.writeLock().unlock();
        }
    }

    /* renamed from: t */
    public void mo3106t(C0817e eVar) {
        C0612h.m2671h(eVar, "initCallback cannot be null");
        this.f2854a.writeLock().lock();
        try {
            this.f2855b.remove(eVar);
        } finally {
            this.f2854a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void mo3107u(EditorInfo editorInfo) {
        if (m3629j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f2858e.mo3110c(editorInfo);
        }
    }
}
