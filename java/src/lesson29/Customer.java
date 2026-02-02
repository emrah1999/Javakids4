package lesson29;

public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidUserInputException {
        if(name==null || name.isBlank()){
            throw new InvalidUserInputException("Name cannot be null or empty");
        }
        this.name = name;
    }
}
