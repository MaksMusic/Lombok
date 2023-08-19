import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
public class Student {
    @NonNull
    private String name;
    private int age;


}

@AllArgsConstructor
@RequiredArgsConstructor
class Employee {
    private String name;
    @NonNull
    private Long id;

}


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
class SmartPhone {
    Long id;
    @NonNull
    String model;
    @NonNull
    double price;

}

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
class Elf{
    String name;
    double str;
    double hp;

}


class Main {
    public static void main(String[] args) {
        Elf elf = Elf.builder().name("Falcone").str(200).build();
        System.out.println(elf);
        SmartPhone smartPhone = new SmartPhone("samsung",1000);


        Student student = new Student("Tom", 22);
        Student student2 = new Student("Tom", 22);

        System.out.println(student);
        System.out.println(student.equals(student2));
        System.out.println(student.getAge());

        Employee employee = new Employee("Tom", 1L);

    }
}


