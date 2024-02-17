public abstract class animals {
    
    String type;
    String name;
    int age;
    String color;
    String gender;
    boolean isDisable;
    int aggression;
    int activity;
    int monthlyCost;
    int ID;
    animals(){

    }
    animals(String type, String name,int age,String color,String gender,boolean isDisable,int aggression,int activity, int monthlyCost){
        
        this.type = type;
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
    
    @Override
    public String toString() {
        return "\n Type: "+  this.type + "\n ID: " + this.ID +"\n Name: "+ this.name + "\n Age: "+ this.age + "\n Color: "+ this.color + "\n Gender: "+ this.gender + "\n Disability state: "+ this.isDisable + "\n Agression level out of 10: "+ this.aggression
        + "\n Activity level out of 10: "+ this.activity + "\n Monthly cost: "+this.monthlyCost + "$ \n ";
    }
}
