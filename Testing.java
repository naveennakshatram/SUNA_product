public class Testing {
    // instance variables
    int idno;
    String name;
    float exp;
    String address;

    // static variables
    static String subject_name;
    static String time;
    static String topic;

    // instance method
    public void assign_values() {
        // intance variables
        idno = 456843;
        name = "Ravi";
        exp = 8.5f;
        address = "IG38ER Ilford London";

        // static variables
        // instasnce method can access static variables and methods also.
        subject_name = "Automation Testing";
        time = "8:00am to 10:00am";
        topic = "OOPS";
    }

    // instance method
    public void display_intance_variables() {
        // printing instance variables
        System.out.println(idno);
        System.out.println(name);
        System.out.println(exp);
        System.out.println(address); // print instance variables

        // printing static variables
        // instasnce method can access static variables and methods also.
        System.out.println(subject_name);
        System.out.println(time);
        System.out.println(topic);
    }

    // static method
    public static void display_static_variables() {
        System.out.println(subject_name);
        System.out.println(time);
        System.out.println(topic);
        // System.out.println(idno); --> You canot use instance variable directly in
        // static method
    }
}
