package p091n2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: n2.r */
public final class C2704r implements C2687g<String> {

    /* renamed from: a */
    private static final Charset f9018a = Charset.forName("UTF8");

    /* renamed from: b */
    public static final C2704r f9019b = new C2704r();

    private C2704r() {
    }

    /* renamed from: c */
    public String mo9422a(ByteBuffer byteBuffer) {
        int i;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, remaining, f9018a);
    }

    /* renamed from: d */
    public ByteBuffer mo9423b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f9018a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
