package kingdee.base.ssc.day010.thread.base.jcip.examples;

import kingdee.base.ssc.day010.thread.base.jcip.annotations.NotThreadSafe;

/**
 * UnsafeSequence
 *
 * @author Brian Goetz and Tim Peierls
 */

@NotThreadSafe
public class UnsafeSequence {
    private int value;

    /**
     * Returns a unique value.
     */
    public int getNext() {
        return value++;
    }
}
