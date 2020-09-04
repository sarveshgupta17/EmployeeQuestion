package Employee;

public class EmployeeInfo {
    private String firstname;
    private String lastname;
    private int salary;
    private int empid;
    private int empexp;
    private long mob;
    private String email;


    //const
    public EmployeeInfo(String fn,String ln,int sal,int id,int exp,long mobile,String e){
        firstname=fn;
        lastname=ln;
        salary=sal;
        empid=id;
        empexp=exp;
        mob=mobile;
        email=e;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public int getSalary(){
        return salary;
    }
    public int getEmpid(){
        return empid;
    }
    public int getEmpexp(){
        return empexp;
    }
    public long getMob(){
        return mob;
    }
    public String getEmail(){
        return email;
    }

    public String toString(){
        return firstname + ","+lastname+","+salary+","+empid+","+empexp+","+mob+","+email+"\n";
    }

}
