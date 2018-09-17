interface CallbackEvent {  
    public void callbackMethod();
}

class EventRegistration {  
    private CallbackEvent callbackEvent;

    public EventRegistration(CallbackEvent event){
        callbackEvent = event;
    }

    public void doWork(){
        callbackEvent.callbackMethod();
    }
}

public class ExCallbackEvent {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CallbackEvent callbackEvent = new CallbackEvent(){
            @Override
            public void callbackMethod() {
                System.out.println("call callback method from callee");
            }
        };

        EventRegistration eventRegistration = new EventRegistration(callbackEvent);
        eventRegistration.doWork();
    }

}