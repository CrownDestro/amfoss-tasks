package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C0569e;
import androidx.core.util.C0612h;
import androidx.emoji2.text.C0811e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.c */
public final class C0805c {

    /* renamed from: androidx.emoji2.text.c$a */
    public static class C0806a {

        /* renamed from: a */
        private final C0807b f2848a;

        public C0806a(C0807b bVar) {
            this.f2848a = bVar == null ? m3610e() : bVar;
        }

        /* renamed from: a */
        private C0811e.C0815c m3607a(Context context, C0569e eVar) {
            if (eVar == null) {
                return null;
            }
            return new C0828j(context, eVar);
        }

        /* renamed from: b */
        private List<List<byte[]>> m3608b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: d */
        private C0569e m3609d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C0569e(str, str2, "emojicompat-emoji-font", m3608b(this.f2848a.mo3092b(packageManager, str2)));
        }

        /* renamed from: e */
        private static C0807b m3610e() {
            return Build.VERSION.SDK_INT >= 28 ? new C0809d() : new C0808c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r2 = r2.applicationInfo;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m3611f(android.content.pm.ProviderInfo r2) {
            /*
                r1 = this;
                r0 = 1
                if (r2 == 0) goto L_0x000d
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto L_0x000d
                int r2 = r2.flags
                r2 = r2 & r0
                if (r2 != r0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0805c.C0806a.m3611f(android.content.pm.ProviderInfo):boolean");
        }

        /* renamed from: g */
        private ProviderInfo m3612g(PackageManager packageManager) {
            for (ResolveInfo a : this.f2848a.mo3093c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a2 = this.f2848a.mo3091a(a);
                if (m3611f(a2)) {
                    return a2;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C0811e.C0815c mo3089c(Context context) {
            return m3607a(context, mo3090h(context));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0569e mo3090h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C0612h.m2671h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = m3612g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return m3609d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    public static class C0807b {
        /* renamed from: a */
        public ProviderInfo mo3091a(ResolveInfo resolveInfo) {
            throw null;
        }

        /* renamed from: b */
        public Signature[] mo3092b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo3093c(PackageManager packageManager, Intent intent, int i) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    public static class C0808c extends C0807b {
        /* renamed from: a */
        public ProviderInfo mo3091a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo3093c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    public static class C0809d extends C0808c {
        /* renamed from: b */
        public Signature[] mo3092b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C0828j m3606a(Context context) {
        return (C0828j) new C0806a((C0807b) null).mo3089c(context);
    }
}
