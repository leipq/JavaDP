package kingdee.base.ssc.day010.thread.base.jcip.examples;

import kingdee.base.ssc.day010.thread.base.jcip.annotations.GuardedBy;
import kingdee.base.ssc.day010.thread.base.jcip.annotations.ThreadSafe;

/**
 * SynchronizedInteger
 * <p/>
 * Thread-safe mutable integer holder
 *
 * @author Brian Goetz and Tim Peierls
 */
@ThreadSafe
public class SynchronizedInteger {
    @GuardedBy("this") private int value;

    public synchronized int get() {
        return value;
    }

    public synchronized void set(int value) {
        this.value = value;
    }
}
