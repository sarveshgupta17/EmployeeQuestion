
import java.util.Arrays;
import java.util.Scanner;
import Employee.EmployeeInfo;
public class EmployeeMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //declaring an array
        EmployeeInfo[] arr=new EmployeeInfo[3];
        System.out.println(Arrays.toString(arr));

        String firstname;
         String lastname;
         int salary;
         int empid;
         int empexp;
         long mob;
         String email;



        for(int i=0;i<arr.length;i++){
            System.out.println("enter the first name");
            firstname=sc.nextLine();
            System.out.println("enter the lastname");
            lastname=sc.nextLine();
            System.out.println("enter salary");
            salary=sc.nextInt();
            System.out.println("enter the emp. id");
            empid=sc.nextInt();
            System.out.println("enter experience");
            empexp=sc.nextInt();
            System.out.println("enter mobile number");
            mob=sc.nextLong();
            sc.nextLine();
            System.out.println("enter the email");
            email=sc.nextLine();
            arr[i]=new EmployeeInfo(firstname,lastname,salary,empid,empexp,mob,email);








        }

        System.out.println(Arrays.toString(arr));
        EmployeeInfo[] sorted=sortsalary(arr);
        System.out.println("sorted array on the basis of salary in decending order is="+Arrays.toString(sorted));
        EmployeeInfo[] sortedexp=sortexp(arr);
        System.out.println("sorted array in terms pf experience in decending order is="+Arrays.toString(sortedexp));

        //sorting on the basis of salary
        //we are going to define method
        //we then call

    }
    //defining method to sort aaray on the basis of salary in desending order
    public static EmployeeInfo[] sortsalary(EmployeeInfo[] arr){
        EmployeeInfo[] response=arr.clone();
        for(int i=0;i< response.length-1;i++){
            for(int j=0;j< response.length-1;j++){
                if(response[j].getSalary()<response[j+1].getSalary()){
                    EmployeeInfo temp=response[j];
                    response[j]=response[j+1];
                    response[j+1]=temp;
                }
            }
        }
        return response;
    }
    public static EmployeeInfo[] sortexp(EmployeeInfo[] arr){
        EmployeeInfo[] response=arr.clone();
        for(int i=0;i< response.length-1;i++){
            for(int j=0;j< response.length-1;j++){
                if(response[j].getEmpexp()<response[j+1].getEmpexp()){
                    EmployeeInfo temp=response[j];
                    response[j]=response[j+1];
                    response[j+1]=temp;
                }
            }
        }
        return response;
    }


}
