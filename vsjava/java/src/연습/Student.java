package 연습;

public class Student {
    // 필드 선언
    String name;
    int age;
    int grade;

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 10, 20);
        Student student2 = createStudent("학생2", 30, 40);

        printStudent(student1);
        printStudent(student2);
    }

    // 학생 객체를 생성하는 메서드
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //student의 참조값 반환 > student1, student2가 받음
    }

    // 학생 정보를 출력하는 메서드
    static void printStudent(Student student) {
        System.out.println(student.name + "의 나이는 " + student.age + "입니다.");
        System.out.println(student.name + "의 성적은 " + student.grade + "입니다.");
    }
}
