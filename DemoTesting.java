public class DemoTesting 
{
    public static void main(String[] args) 
    {
            Testing ts = new Testing();
            // calling instance methods.
            ts.assign_values();
            ts.display_intance_variables();

            
            // call - static method
            ts.display_static_variables();

            // or you can call with class name also.
            // static variables and methods can be called using class name also.
           
            // calling static method using class name
            Testing.display_static_variables();
            // calling static varible using class name
            System.out.println(Testing.subject_name);
    }
}
