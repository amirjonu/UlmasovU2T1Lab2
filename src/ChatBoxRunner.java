public class ChatBoxRunner {
    public static void main(String[] args){
        ChatBot debbie= new ChatBot("debbie", 17);
        debbie.greeting("jeff");
        debbie.weather();
        System.out.println("");

        System.out.println(debbie.goodbye());


    }
}
