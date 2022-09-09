import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            File file = new File("D:/Raman_Bohdan/Asist-lab/School_R.B/School.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(scanner.nextLine());
            bw.close();
            System.out.println("Запись завершена");
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");;
        }

        try {
            File file = new File("D:/Raman_Bohdan/Asist-lab/School_R.B/School.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
                System.out.println("Данные из файла прочитаны");
            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
        }

        Student student = new Student();
        ArrayList<Student> studentsList = new ArrayList<>();
        student.setStudentAge(18);
        student.setStudentEmail("@gmail.com");
        student.setStudentGender("Man");
        student.setStudentHeight(181);
        student.setStudentWeight(76);
        student.setStudentId(1);
        student.setStudentIQ(92);
        student.setStudentName("Maksim");
        student.setStudentSurname("Pechkin");
        student.setStudentNationality("Belarus");
        student.setStudentPhone(123456789);
        student.setStudentSkinColor("White");
        studentsList.add(student);

        Student student1 = new Student();
        student1.setStudentAge(17);
        student1.setStudentName("Alex");
        student1.setStudentSurname("Ivanov");
        student1.setStudentEmail("@mail.ru");
        student1.setStudentHeight(176);
        student1.setStudentWeight(72);
        student1.setStudentId(2);
        student1.setStudentIQ(67);
        student1.setStudentNationality("Polish");
        student1.setStudentGender("Man");
        student1.setStudentSkinColor("White");
        student1.setStudentPhone(112233445);
        studentsList.add(student1);

        Student student2 = new Student();
        student2.setStudentAge(20);
        student2.setStudentName("Minny");
        student2.setStudentSurname("Mouse");
        student2.setStudentEmail("@yandex.ru");
        student2.setStudentHeight(173);
        student2.setStudentWeight(50);
        student2.setStudentId(3);
        student2.setStudentIQ(76);
        student2.setStudentNationality("Armenia");
        student2.setStudentGender("Woman");
        student2.setStudentSkinColor("Black");
        student2.setStudentPhone(556677889);
        studentsList.add(student2);

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

        ArrayList<Teacher> teacherList = new ArrayList<>();
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

        Classroom classroom = new Classroom();
        classroom.setTeachers(teacherList);
        classroom.setCountDesk(2);
        classroom.setCountWindow(5);
        classroom.setFormatClass("math class");

        ArrayList<Classroom> classroomList = new ArrayList<>();
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
        System.out.println("Национальность: " + studentsNationality);

        List<Student> studentNationalityFilter = studentsList.stream()
                .filter(studentNationality -> studentNationality.getStudentNationality().contains("a")).toList();
        System.out.println("Национальность с применением фильтра: " + studentNationalityFilter);

        List<Student> studentAge = studentsList.stream()
                .filter(studentX -> studentX.getStudentAge() > 18).toList();
        System.out.println("Фильтрация по возрасту: " + studentAge);

        List<Student> studentAgeAndGender = studentsList.stream()
                .filter(student3 -> student3.getStudentGender().contains("M"))
                .filter(student3 -> student3.getStudentAge() >= 18).toList();
        System.out.println("Фильтрация по возрасту и полу: " + studentAgeAndGender);

        List<List<Teacher>> teacherSum = classroomList.stream()
                .map(Classroom::getTeachers).toList();
        System.out.println("Смапить учителей: " + teacherSum);

        List<List<Student>> studentsSum = classroomList.stream()
                .map(Classroom::getStudents).toList();
        System.out.println("Смапить студентов: " + studentsSum);

        int sum = studentsList.stream()
                .map(Student::getStudentAge).mapToInt(Integer::intValue).sum();
        System.out.println("Сумма возрастов студентов: " + sum);

        List<Student> students = studentsList.stream()
                .sorted(Comparator.comparing(Student::getStudentEmail))
                .sorted(Comparator.comparing(Student::getStudentHeight)
                        .thenComparing(x -> x.getStudentEmail().contains("@m"))
                        .thenComparing(p -> p.getStudentHeight() > 190)).toList();
        System.out.println("Сортировка по полям Email  и Рост: " + students);

        boolean studentAnyMatch = studentsList.stream()
                .skip(1)
                .anyMatch(student3 -> student3.getStudentSurname().contains("a"));
        System.out.println("AnyMatch: " + studentAnyMatch);

        boolean studentAllMatch = studentsList.stream()
                .distinct()
                .allMatch(studentMatch -> studentMatch.getStudentEmail().contains("@"));
        System.out.println("AllMatch: " + studentAllMatch);

        boolean studentNoneMatch = studentsList.stream()
                .noneMatch(studentNone -> studentNone.getStudentId() > 10);
        System.out.println("NoneMatch: " + studentNoneMatch);
    }

    public static void printClassroomList(ArrayList<Classroom> classrooms) {
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
    }

}