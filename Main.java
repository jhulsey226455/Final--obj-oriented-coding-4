
import java.util.Scanner;

public class Main {

    public Students[] students;

    private Scanner input;

    public static void main(String[] args) {
        Main main = new Main();
    }




    public Main()
    {
        this.sEntry();
        this.sSearch();
        input = new Scanner(System.in);
        students = new Students[5];
    }

    private void sEntry(){
        int stuID = 0;


        System.out.println("Would you like to enter a student? Y/N");

        String response = input.nextLine();
        while (response.toLowerCase().equals("y"))
        {
            Students stu1 = new Students();

            System.out.println("Enter their first name.");
            String fname = input.next();
            stu1.setFirstName(fname);

            System.out.println("Enter their last name.");
            String lname = input.next();
            stu1.setLastName(lname);

            System.out.println("Enter their student ID.");
            int stu1ID = input.next();
            stu1.setStuID(stu1ID);


            System.out.println("Enter their grades.");
            String stuGrades = input.next();
            String[] gradeList = grades.split(",");
            int[] numgrade = new int[gradeList.length];
            int index = 0;
            for (String gString : gradeList);

        }
        numGrade[idx] = Integer.parseInt(gradeString);
        idx++;
    }
stu.setStuGrades(numGrade);
    {

        students[stuID] = stu;
        stuID++;
        if (stuID < 5)
        {
            System.out.println ("Would you like to enter a student? Y/N");
            String ans = input.next();
        }
        else
        {
            answer = "n";
        }
    }


    private void sSearch()
    {
        System.out.println("Would you like to search for a student? Y/N")
        String answer = input.nextLine();
        while )answer.toLowerCase().equals("y"))
        {
            System.out.println("Press the number corresponding to your preferred method of search.");
            System.out.println("1: Search by first");
            System.out.println("2: Search by last");
            System.out.println("3: Search by student ID");
            System.out.println("4: Search by numerical grade");
            System.out.println("5: Search by letter grade");
            int numAns = input.nextInt();

            switch (numAns)
            {
                case 1:
                    searchFName();
                    break;

                case 2:
                    searchLName();
                    break;

                case 3:
                    searchStuID();
                    break;

                case 4:
                    searchNumGrade();
                    break;

                case 5:
                    searchLetterGrade();
                    break;

            }
        }
    }

    public void searchFName(){
        System.out.println("Enter the student's first name.");
        String fName = input.next();
        Students[] studentList = new Students[5];
        for (int a= 0; a < students.length; a++)
        {
            Students stu = students[a];

            if (stu != null && stu.getFirstName().equals(fName))
            {
                studentList[a] = stu;
            }
        }

        showResults(studentList);
    }

    public void searchLName()
    {

        System.out.println("Enter the student's last name.");
        String lName = input.next();
        Students[] studentList = new Students[5];
        for (int a= 0; a < students.length; a++)
        {
            Students stu = students[a];

            if (stu != null && stu.getLastName().equals(lName))
            {
                studentList[a] = stu;
            }
        }

        showResults(studentList);
    }

    public void searchStuID()
    {
        System.out.println("Enter the student's idnetification number.");
        String stuID = input.next();
        Students[] studentList = new Students[5];
        for (int a= 0; a < students.length; a++)
        {
            Students stu = students[a];

            if (stu != null && stu.getStuID() == (stuID))
            {
                studentList[a] = stu;
            }
        }

        showResults(studentList);
    }

    public void searchNumGrade()
    {
        System.out.println("Enter the student's numerical grade.");
        int numGrade = input.nextInt();
        Students[] studentList = new Students[5];
        for (int a= 0; a < students.length; a++)
        {
            Students stu = students[a];

            if (stu != null && stu.getnumGrade() == (numGrade))
            {
                studentList[a] = stu;
            }
        }

        showResults(studentList);
    }

    public void searchLetterGrade()

    {
        System.out.println("Enter the student's letter grade.");
        String letterGrade = input.next();
        Students[] studentList = new Students[5];
        for (int a= 0; a < students.length; a++)
        {
            Students stu = students[a];

            if (stu != null)
            {
                if (stu.getFirstName().equals(fName))
                {
                    studentList[a] = stu;
                }
            }

            showResults(studentList);
        }
    }

    public void showResults(Students[] sResults)
    {
        for (Students stu : sResults)
        {
            if (stu != null)
            {

                System.out.println(stu.getFirstName + stu.getLastName);
                System.out.println(stu.getStuID);
                System.out.println(stu.getnumGrade);
                System.out.println(stu.getLettergrade);
            }

        }

    }


}
