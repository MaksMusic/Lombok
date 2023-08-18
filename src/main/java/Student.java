import lombok.*;


@Data
@AllArgsConstructor
public class Student {
    @NonNull
    private String name;
    private int age;


}

@AllArgsConstructor
@RequiredArgsConstructor
class Employee{
    private String name;
    @NonNull
    private Long id;

}


class Main{
    public static void main(String[] args) {
        Student student = new Student("Tom",22);
        Student student2 = new Student("Tom",22);

        System.out.println(student);
        System.out.println(student.equals(student2));
        System.out.println(student.getAge());

        Employee employee = new Employee("Tom",1L);

    }
}


