public class Other {

    public String guestGreeting(String name) {
        String message = "hello" + name;
        if (message.length() > 10) {
            return "hello too many words";
        }else {
            return "hello " + name;
        }
        // return message;
        // return String.format()
        // return "hello" + name ;
    }

    // new_feature branch 
    // add another method no params - overload 'guestGreeting'
    public void guestGreeting() {
        System.out.println("hello my friend!");
    }

}