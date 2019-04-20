package kingdee.base.ssc.day010.thread.base.jcip.examples;

import kingdee.base.ssc.day010.thread.base.jcip.annotations.NotThreadSafe;

/**
 * MutableInteger
 * <p/>
 * Non-thread-safe mutable integer holder
 *
 * @author Brian Goetz and Tim Peierls
 */

@NotThreadSafe
public class MutableInteger {
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}








