package lesson21OOP2cihissee;

public class Main3 {
    public static void main(String[] args) {
        User user=new User();
        user.name="Jane";
        user.address=new Address();
        user.address.city="New York";
        user.address.street="5th Avenue";
        user.address.house="10B";

        Address address1=new Address();
        address1.city="Los Angeles";
        address1.street="Sunset Boulevard";
        address1.house="20A";

        School school=new School();
        school.name="Sunshine High";
        school.address=address1;

        SendMessage message=new SendMessage();
        SendMessage2 message1=new SendMessage2();
        SuperMessage superMessage=new SuperMessage();
        superMessage.sendMessage(message);
        superMessage.sendMessage(message1);
    }
}
