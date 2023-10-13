package androidx.emoji2.text;

import androidx.emoji2.text.C0811e;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.f */
public final /* synthetic */ class C0822f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiCompatInitializer.C0799b f2883d;

    /* renamed from: e */
    public final /* synthetic */ C0811e.C0820h f2884e;

    /* renamed from: f */
    public final /* synthetic */ ThreadPoolExecutor f2885f;

    public /* synthetic */ C0822f(EmojiCompatInitializer.C0799b bVar, C0811e.C0820h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2883d = bVar;
        this.f2884e = hVar;
        this.f2885f = threadPoolExecutor;
    }

    public final void run() {
        this.f2883d.m3596d(this.f2884e, this.f2885f);
    }
}
