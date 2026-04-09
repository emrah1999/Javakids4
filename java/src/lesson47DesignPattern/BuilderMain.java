package lesson47DesignPattern;

public class BuilderMain {
    public static void main(String[] args) {
//        User user=new User();
//        user.setId(1L);
//        user.setName("John");
//        user.setSurname("Doe");
//        user.setAge(30);


        User user1=User.builder()
                .id(2L)
                .name("Jane")
                .surname("Smith")
                .age(25)
                .build();

        System.out.println(user1.getAge());
    }
}
