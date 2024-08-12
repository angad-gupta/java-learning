package aug6;

public class Person {

    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.person("Angad"));
        System.out.println( p.person("Angad","angad@gmail.com" ));
        System.out.println( p.person("Angad","angad@gmail.com" , "2324242424"));


    }

    public String person(String name){
        return "Hello "+name;
    }

    public String person(String name, String email){
        return "Hello "+name+"and your email is " + email;
    }

    public String person(String name, String email, String phone){
        return "Hello "+name+"and your email is " + email + "and you phone is " + phone;
    }
}
