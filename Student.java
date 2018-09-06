package studentdatabase;

import java.util.Scanner;

/**
 *
 * @author Khan Osman
 */
public class Student {
    private String fName;
    private String lName;
    private int studentYear;
    private String studentId;
    private String courses = "";
    private int tutionFee = 0;
    private static int costOfCourse = 16000;
    private static int id = 10101;
    private int totalCourseTaken = 0;
    private String[] cList = {"Eng101","Eng102","Phy101","Phy102","Mat101","Mat102","CSE101 + Lab","CSE102 + Lab"};
    private int size = cList.length;
    //Constructor:
    public Student(){
        Scanner jin = new Scanner(System.in);
        System.out.print("Enter your first name:");
        this.fName = jin.nextLine();
        System.out.print("Enter your last name:");
        this.lName = jin.nextLine();
        System.out.print("Choose your Student Year:\n");
        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior");
        System.out.print("Enter a key :");
        this.studentYear = jin.nextInt();
        setStudentID();
    }
    
    //Get Student Information
    public void studentInfromation(){
        System.out.println("\n\n\tStudent Infromation");
        System.out.println("\t" + "First Name :" + fName);
        System.out.println("\t" + "Last Name :" + lName);
        System.out.println("\t" + "Id :" + studentId);
        if(studentYear == 1){
           System.out.println("\t" + "Student Category :" + "Freshman"); 
        }else if(studentYear == 2){
             System.out.println("\t" + "Student Category :" + "Sophomore");
        }else if(studentYear == 3){
             System.out.println("\t" + "Student Category :" + "Junior");
        }else if(studentYear == 4){
             System.out.println("\t" + "Student Category :" + "Freshman");
        }else{
             System.out.println("\t" + "Student Category :" + "undefined");
        }
    }
    
    //Generate an Unique Id
    
    private void setStudentID(){
        //Student Id Formation: StudentYear + ID
        id++;
        this.studentId = studentYear + "" + id;
    }
    
    //Course List
    public void courseList(){
        System.out.println("Course List: ");
         for(int i=0;i<size;i++){
            int n =i+1;
            System.out.println(n + " - " + cList[i]);
        }
    }
    
    //Enroll in Courses
    public void enroll(){
        //Calling course list method
        courseList();
        int c=1;
        do{
          System.out.print("Enter Course No. to enroll (Q to quit)");
          Scanner jin = new Scanner(System.in);
          String course = jin.nextLine();
          switch(course){
              case "1":
                   
                    courses = courses + "\n" + cList[0];
                    tutionFee = tutionFee + costOfCourse;
                  
                  break;
              case "2":
                    
                    courses = courses + "\n" + cList[1];
                    tutionFee = tutionFee + costOfCourse;
                   
                  break;
              case "3":
                    
                    courses = courses + "\n" + cList[2];
                    tutionFee = tutionFee + costOfCourse;
                   
                  break;
              case "4":
                   
                    courses = courses + "\n" + cList[3];
                    tutionFee = tutionFee + costOfCourse;

                  break;
              case "5":
                 
                    courses = courses + "\n" + cList[4];
                    tutionFee = tutionFee + costOfCourse;
                
                  break;
              case "6":
                   
                    courses = courses + "\n" + cList[5];
                    tutionFee = tutionFee + costOfCourse;

                  break;
              case "7":
                  
                    courses = courses + "\n" + cList[6];
                    tutionFee = tutionFee + costOfCourse;

                  break;
              case "8":
                 
                    courses = courses + "\n" + cList[7];
                    tutionFee = tutionFee + costOfCourse;
                    
                  break;
              case "q":
                  c=0;
                  break;
              case "Q":
                  c=0;
                  break;
              default:
                      System.out.println("Invalid input");
                  break;
          }
         
          totalCourseTaken++;
        }while(c!=0);
    }
    
    //Print Bill
    public void printBill(){
        
        int tAmount = totalCourseTaken*costOfCourse;
        
        System.out.println("\n\n\t\tCourse Registration 2018");
        System.out.println("\n\n\tFirst Name :" + fName + "\t" + "Last Name :" + lName);
        System.out.println("\tEnrolled Courses :\n" +"\t"+ courses);
        System.out.println("\tEach Course Fee :" + costOfCourse);
        System.out.println("\tTotall Amount :" + totalCourseTaken + "*" + costOfCourse + " = " + tAmount );
            
    }
    
}
