public class Employee{
private String name outername="Alice"  ;
private int ID outerID="101";
public void display(){
System.out.println(outername);
System.out.println(outerID);
}
class Department{
private String Departmentname innername="HR";
private String location innerlocation= "New York";
public void display1(){
System.out.println(innername);
System.out.println(innerlocation);
}
}
}
public static void main(String args[])
{
Employee employee1=new Employee( );
Employee.Department inner=outer.new Department();
outer.display();
inner.display1();
}