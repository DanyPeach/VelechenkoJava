package Lab7;

public  class MessageAnon implements Mess{

    static MessageAnon ma = new MessageAnon(){
        @Override
        public void message() {
            System.out.println("Покупка завершена успешно!");
        }
    };

    @Override
    public void message() {

    }
}
