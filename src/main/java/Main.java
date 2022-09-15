import classroom.Classroom;
import school.School;
import student.Student;
import teacher.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
   /* public static void writeObjectToFile(Classroom obj, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            oos.flush();
        }
    }

    public static Classroom readObjectFromFile(File file) throws IOException, ClassNotFoundException {
        Classroom result = null;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = (Classroom) ois.readObject();
        }
        return result;
    }
    */

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Student> studentsList = new ArrayList<>();
        Student student = new Student("Maksim", "Pechkin", 18, 123456789,
                "@gmail.com", 76, 181, 1, "Man", "White",
                92, "Belarus");
        Student student1 = new Student("Alex", "Ivanov", 17, 112233445,
                "@mail.ru", 72, 176, 2, "Man", "White",
                67, "Polish");
        Student student2 = new Student("Minny", "Mouse", 20,
                556677889, "@yandex.ru", 50, 173,
                3, "Woman", "Black", 76, "Armenia");
        studentsList.add(student);
        studentsList.add(student1);
        studentsList.add(student2);

        ArrayList<Teacher> teacherList = new ArrayList<>();
        Teacher teacher = new Teacher();
        teacher.setStudents(studentsList);
        teacher.setTeacherAge(54);
        teacher.setTeacherEmail("teacher@gmail.com");
        teacher.setTeacherGender("Women");
        teacher.setTeacherId(12);
        teacher.setTeacherIQ(99);
        teacher.setTeacherName("Irina");
        teacher.setTeacherSurname("Ivanova");
        teacher.setTeacherNationality("Armenia");
        teacher.setTeacherNumberOfItems(2);
        teacher.setTeacherPhone(123456799);
        teacher.setTeacherQualificationLevel("Height");
        teacher.setTeacherWorkExperience(21);
        teacherList.add(teacher);

        Teacher teacher1 = new Teacher();
        teacher1.setStudents(studentsList);
        teacher1.setTeacherAge(34);
        teacher1.setTeacherEmail("teacherSchool@gmail.com");
        teacher1.setTeacherGender("Man");
        teacher1.setTeacherId(15);
        teacher1.setTeacherIQ(100);
        teacher1.setTeacherName("Valentin");
        teacher1.setTeacherSurname("Pirazhkov");
        teacher1.setTeacherNationality("Belarus");
        teacher1.setTeacherNumberOfItems(2);
        teacher1.setTeacherPhone(123212233);
        teacher1.setTeacherQualificationLevel("Middle");
        teacher1.setTeacherWorkExperience(11);
        teacherList.add(teacher1);

        Teacher teacher2 = new Teacher();
        teacher2.setStudents(studentsList);
        teacher2.setTeacherAge(40);
        teacher2.setTeacherEmail("teacherBest@gmail.com");
        teacher2.setTeacherGender("Women");
        teacher2.setTeacherId(21);
        teacher2.setTeacherIQ(111);
        teacher2.setTeacherName("Juliay");
        teacher2.setTeacherSurname("Kuzmenkova");
        teacher2.setTeacherNationality("Belarus");
        teacher2.setTeacherNumberOfItems(4);
        teacher2.setTeacherPhone(888765434);
        teacher2.setTeacherQualificationLevel("Height");
        teacher2.setTeacherWorkExperience(17);
        teacherList.add(teacher2);

        ArrayList<Classroom> classroomList = new ArrayList<>();
        Classroom classroom = new Classroom();
        classroom.setTeachers(teacherList);
        classroom.setCountDesk(2);
        classroom.setCountWindow(5);
        classroom.setFormatClass("math class");
        classroomList.add(classroom);

        Classroom classroom1 = new Classroom();
        classroom1.setTeachers(teacherList);
        classroom1.setCountDesk(1);
        classroom1.setCountWindow(6);
        classroom1.setFormatClass("physic class");
        classroomList.add(classroom1);

        Classroom classroom2 = new Classroom();
        classroom2.setTeachers(teacherList);
        classroom2.setCountDesk(1);
        classroom2.setCountWindow(6);
        classroom2.setFormatClass("IT class");
        classroomList.add(classroom2);

        School school = new School();
        school.setClassrooms(classroomList);

        printClassroomList(classroomList);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");

        List<Student> studentsNationality = studentsList.stream()
                .sorted(Comparator.comparing(Student::getStudentNationality)).toList();

        List<Student> studentNationalityFilter = studentsList.stream()
                .filter(studentNationality -> studentNationality.getStudentNationality().contains("a")).toList();

        List<Student> studentAge = studentsList.stream()
                .filter(studentX -> studentX.getStudentAge() > 18).toList();

        List<Student> studentAgeAndGender = studentsList.stream()
                .filter(student3 -> student3.getStudentGender().contains("M"))
                .filter(student3 -> student3.getStudentAge() >= 18).toList();

        List<List<Teacher>> teacherSum = classroomList.stream()
                .map(Classroom::getTeachers).toList();

        List<List<Student>> studentsSum = classroomList.stream()
                .map(Classroom::getStudents).toList();

        int sum = studentsList.stream()
                .map(Student::getStudentAge).mapToInt(Integer::intValue).sum();

        List<Student> students = studentsList.stream()
                .sorted(Comparator.comparing(Student::getStudentEmail))
                .sorted(Comparator.comparing(Student::getStudentHeight)
                        .thenComparing(x -> x.getStudentEmail().contains("@m"))
                        .thenComparing(p -> p.getStudentHeight() > 190)).toList();

        boolean studentAnyMatch = studentsList.stream()
                .skip(1)
                .anyMatch(student3 -> student3.getStudentSurname().contains("a"));

        boolean studentAllMatch = studentsList.stream()
                .distinct()
                .allMatch(studentMatch -> studentMatch.getStudentEmail().contains("@"));

        boolean studentNoneMatch = studentsList.stream()
                .noneMatch(studentNone -> studentNone.getStudentId() > 10);

        System.out.println("NoneMatch: " + studentNoneMatch
                + "\n" + "AllMatch: " + studentAllMatch
                + "\n" + "AnyMatch: " + studentAnyMatch
                + "\n" + "Сортировка по полям Email  и Рост: " + students
                + "\n" + "Сумма возрастов студентов: " + sum
                + "\n" + "Смапить студентов: " + studentsSum
                + "\n" + "Смапить учителей: " + teacherSum
                + "\n" + "Фильтрация по возрасту и полу: " + studentAgeAndGender
                + "\n" + "Фильтрация по возрасту: " + studentAge
                + "\n" + "Национальность с применением фильтра: " + studentNationalityFilter
                + "\n" + "Национальность: " + studentsNationality);

        File file = new File("School.txt");
        FileOutputStream f = new FileOutputStream(file);
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(studentsList);
        o.writeObject(teacherList);
        o.writeObject(classroomList);

        o.close();
        f.close();

        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        Student pr1 = (Student) oi.readObject();
        Teacher pr2 = (Teacher) oi.readObject();
        Classroom pr3 = (Classroom) oi.readObject();

        System.out.println(pr1.toString());
        System.out.println(pr2.toString());
        System.out.println(pr3.toString());

        oi.close();
        fi.close();
    }

    public static void printClassroomList(ArrayList<Classroom> classrooms) {
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
    }
}