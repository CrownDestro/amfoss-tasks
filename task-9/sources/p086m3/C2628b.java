package p086m3;

import p068j3.C2327c;

/* renamed from: m3.b */
class C2628b {
    /* renamed from: a */
    public static int m11919a(int i) {
        if (new C2327c(2, 36).mo8656B(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C2327c(2, 36));
    }

    /* renamed from: b */
    public static final int m11920b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static final boolean m11921c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
