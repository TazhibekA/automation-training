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

        List<Student> list1 = new ArrayList<Student>();
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.add(student4);
        list1.add(student5);

        List<Student> list2 = new ArrayList<Student>();
        list2.add(student6);
        list2.add(student7);
        list2.add(student8);
        list2.add(student9);
        list2.add(student10);

        List<Student> list3 = new ArrayList<Student>();
        list3.add(student11);
        list3.add(student12);
        list3.add(student13);
        list3.add(student14);
        list3.add(student15);

        List<Student> list4 = new ArrayList<Student>();
        list4.add(student16);
        list4.add(student17);
        list4.add(student18);
        list4.add(student19);
        list4.add(student20);


        Group group1 = new Group(1,"AAAA", list1);
        Group group2 = new Group(2,"BBBB",list2);
        Group group3 = new Group(3,"CCCC",list3);
        Group group4 = new Group(4,"DDDD",list4);

        List<Group> groupList1 = new ArrayList<Group>();
        groupList1.add(group1);
        groupList1.add(group2);

        List<Group> groupList2 = new ArrayList<Group>();
        groupList2.add(group3);
        groupList2.add(group4);

        Grade grade1 = new Grade(1,groupList1);
        Grade grade2 = new Grade(2,groupList2);

        List<Grade> gradeList1 = new ArrayList<Grade>();
        gradeList1.add(grade1);
        gradeList1.add(grade2);

        Faculty faculty = new Faculty(1,"IT",gradeList1);

        System.out.println("Список студентов заданного факультета: ");
        List<Student> studentList = faculty.SaveAllStudents();
        for (Student student:studentList)
        System.out.println(student.toString());
        System.out.println();
        System.out.println();

        System.out.println("Cписки студентов для каждого факультета и курса: ");
        System.out.println(faculty.toString());
        System.out.println();
        System.out.println();

        System.out.println("Список студентов, родившихся после заданного года: ");
        Scanner scanner = new Scanner(System.in);
        int s= scanner.nextInt();
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getDateOfBirth().getYear()>s){
                System.out.println(studentList.get(i));
            }
        }
        System.out.println();
        System.out.println();


        System.out.println("Список учебной группы.: ");
        List<Group> groupList = faculty.SaveAllGroups();
        for (Group group:groupList)
            System.out.println(group.toString());

    }


}
