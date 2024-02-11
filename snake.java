public class snake extends animals {
    private int ID;
    String head = "snake";
    private String name;
    private int age;
    private String color;
    private String gender;
    private boolean isDisable;
    private int aggression;
    private int activity;
    private int monthlyCost;

    snake(String name,int age,String color,String gender,boolean isDisable,int aggression,int activity, int monthlyCost){
        this.ID= application.amount;
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.isDisable = isDisable;
        this.aggression = aggression;
        this.activity = activity;
        this.monthlyCost = monthlyCost;
        application.amount++;
    }
    public int getID() {
        return ID;
    }
    public int getActivity() {
        return activity;
    }
    public int getAge() {
        return age;
    }
    public int getAggression() {
        return aggression;
    }
    public String getColor() {
        return color;
    }
    public String getGender() {
        return gender;
    }
    public int getMonthlyCost() {
        return monthlyCost;
    }
    public String getName() {
        return name;
    }
    public boolean getIsDisable(){
        return isDisable;
    }
    @Override
    public String toString() {
        return head + name + age+ color + aggression + gender + isDisable+ activity; //TODO
    }
}

