import java.util.Scanner;

public class nested_case {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empID=in.nextInt();
        String department=in.next();
        switch (empID){
            case 1:
            System.out.println("sacdia");
            break;
            case 2:
                System.out.println("cabdikariim");
             break;
            case 3:
                System.out.println("EMP numbers3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case"management":
                        System.out.println("management department");
                     break;
                    default :
                        System.out.println("nodepartment entered");

                }break;
            default:
                System.out.println("enter correct empID");
        }
    }
}
