import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Student student1 = new Student(1, "Иванова","Иван","Иванович", new Date(2000,11,10),"aaaa","123456789" );
        Student student2 = new Student(2, "Петров","Петр","Петрович", new Date(2000,11,10),"bbbb","123456789" );
        Student student3 = new Student(3, "Семенов","Семен","Семенович", new Date(2000,11,10),"cccc","123456789");
        Student student4 = new Student(4, "Галушко","Константин","Иванович", new Date(2000,11,10),"dddd","123456789" );
        Student student5 = new Student(5, "Пивоваров","Сергей","Петрович", new Date(2000,11,10),"ffff","123456789" );
        Student student6 = new Student(6, "Пупкин","Василий","Николаевич", new Date(2000,11,10),"gggg","123456789" );
        Student student7 = new Student(7, "Антонов","Анатолий","Сергеевич", new Date(2000,11,10),"hhhh","123456789" );
        Student student8 = new Student(8, "Жуков","Евгений","Анатольевич", new Date(2000,11,10),"eeee","123456789" );
        Student student9 = new Student(9, "Решетников","Роман","Семенович", new Date(2000,11,10),"iiii","123456789" );
        Student student10 = new Student(10, "Блинов","Федор","Викторович", new Date(2000,11,10),"ssss","123456789" );
        Student student11 = new Student(11, "Сидорченко","Виктор","Андреевич", new Date(2000,11,10),"kkkk","123456789" );
        Student student12 = new Student(12, "Ющенко","Всеволод","Богданович", new Date(2000,11,10),"llll","123456789" );
        Student student13 = new Student(13, "Порошенко","Геннадий","Николаевич", new Date(2000,11,10),"wwww","123456789" );
        Student student14 = new Student(14, "Соломатин","Николай","Петрович", new Date(2000,11,10),"mmmm","123456789" );
        Student student15 = new Student(15, "Соломатин","Николай","Петрович", new Date(2000,11,10),"mmmm","123456789" );
        Student student16 = new Student(16, "Антонов","Иван","Иванович", new Date(2000,11,10),"kkkk","123456789" );
        Student student17 = new Student(17, "Иванова","Иван","Иванович", new Date(2000,11,10),"aaaa","123456789" );
        Student student18 = new Student(18, "Иванова","Иван","Иванович", new Date(2000,11,10),"oooo","123456789" );
        Student student19 = new Student(19, "Иванова","Иван","Иванович", new Date(2000,11,10),"pppp","123456789" );
        Student student20 = new Student(20, "Иванова","Иван","Иванович", new Date(2000,11,10),"qqqq","123456789" );

        List<Student> firstList = new ArrayList<Student>();
        firstList.add(student1);
        firstList.add(student2);
        firstList.add(student3);
        firstList.add(student4);
        firstList.add(student5);

        List<Student> secondList = new ArrayList<Student>();
        secondList.add(student6);
        secondList.add(student7);
        secondList.add(student8);
        secondList.add(student9);
        secondList.add(student10);

        List<Student> thirdList = new ArrayList<Student>();
        thirdList.add(student11);
        thirdList.add(student12);
        thirdList.add(student13);
        thirdList.add(student14);
        thirdList.add(student15);

        List<Student> fourthList = new ArrayList<Student>();
        fourthList.add(student16);
        fourthList.add(student17);
        fourthList.add(student18);
        fourthList.add(student19);
        fourthList.add(student20);

        Group group1 = new Group(1,"AAAA", firstList);
        Group group2 = new Group(2,"BBBB",secondList);
        Group group3 = new Group(3,"CCCC",thirdList);
        Group group4 = new Group(4,"DDDD",fourthList);

        List<Group> firstGroupList = new ArrayList<Group>();
        firstGroupList.add(group1);
        firstGroupList.add(group2);

        List<Group>  secondGroupList = new ArrayList<Group>();
        secondGroupList.add(group3);
        secondGroupList.add(group4);

        Grade grade1 = new Grade(1,firstGroupList);
        Grade grade2 = new Grade(2,secondGroupList);

        List<Grade> firstGradeList = new ArrayList<Grade>();
        firstGradeList.add(grade1);
        firstGradeList.add(grade2);

        Faculty faculty = new Faculty(1,"IT",firstGradeList);
    }

    public static void getListOfStudentsByFaculty(Faculty faculty){
        System.out.println("Список студентов заданного факультета: ");
        List<Student> studentList = faculty.getAllStudents();
        for (Student student:studentList)
            System.out.println(student.toString());

    }

    public static void getListOfStudentsByFacultiesAndGrades(Faculty faculty){
        System.out.println("Cписки студентов для каждого факультета и курса: ");
        System.out.println(faculty.toString());
    }

    public static void getListOfStudentsByDateOfBirth(Faculty faculty, int year){
        System.out.println("Список студентов, родившихся после заданного года: ");
        List<Student> studentList = faculty.getAllStudents();
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getDateOfBirth().getYear()>year){
                System.out.println(studentList.get(i));
            }
        }
    }

    public static void getListOfGroupsbyFaculty(Faculty faculty){
        System.out.println("Список учебной группы.: ");
        List<Group> groupList = faculty.getAllGroups();
        for (Group group:groupList)
            System.out.println(group.toString());
    }
}
