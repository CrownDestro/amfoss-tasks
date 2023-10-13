package p028d4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p041f3.C1924k;
import p062i4.C2100b0;
import p062i4.C2123p;
import p062i4.C2136z;

/* renamed from: d4.a */
public final class C1738a implements C1739b {
    C1738a() {
    }

    /* renamed from: a */
    public void mo7285a(File file) {
        C1924k.m9142h(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + file);
        }
    }

    /* renamed from: b */
    public C2100b0 mo7286b(File file) {
        C1924k.m9142h(file, "file");
        return C2123p.m9847j(file);
    }

    /* renamed from: c */
    public C2136z mo7287c(File file) {
        C1924k.m9142h(file, "file");
        try {
            return C2124q.m9855f(file, false, 1, (Object) null);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C2124q.m9855f(file, false, 1, (Object) null);
        }
    }

    /* renamed from: d */
    public void mo7288d(File file) {
        C1924k.m9142h(file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                C1924k.m9137c(file2, "file");
                if (file2.isDirectory()) {
                    mo7288d(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    /* renamed from: e */
    public C2136z mo7289e(File file) {
        C1924k.m9142h(file, "file");
        try {
            return C2123p.m9838a(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C2123p.m9838a(file);
        }
    }

    /* renamed from: f */
    public boolean mo7290f(File file) {
        C1924k.m9142h(file, "file");
        return file.exists();
    }

    /* renamed from: g */
    public long mo7291g(File file) {
        C1924k.m9142h(file, "file");
        return file.length();
    }

    /* renamed from: h */
    public void mo7292h(File file, File file2) {
        C1924k.m9142h(file, "from");
        C1924k.m9142h(file2, "to");
        mo7285a(file2);
        if (!file.renameTo(file2)) {
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    }

    public String toString() {
        return "FileSystem.SYSTEM";
    }
}
