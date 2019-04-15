package kingdee.base.ssc.day010.thread.base;
/**
 * 这个例子暂时还没有搞懂啊：尴尬了，回头再来研究一下
 *
 * */
public class SafeListener {
    private final EventListener listener;
    private SafeListener(){
        listener = new EventListener(){
            public void onEvent(Event e){
                doSomething(e);
            }
        };
    }

    public static SafeListener newInstance(EventSource source){
        SafeListener safe = new SafeListener();
        source.registerListener(safe.listener);
        return safe;
    }
    interface EventSource{
        void registerListener(EventListener listener);
    }
    interface EventListener{
        void onEvent(Event e);
    }
    interface Event{

    }
    void doSomething(Event e){

    }
}
