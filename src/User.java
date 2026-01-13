public class User {
    private  String name;
    private  int age;
    public User(String name, int age){
        this.name=name;
        this.age = age;
    }

    public User() {

    }

    public int setAge(int age){
        if(age<0 && age >150){

        }
        this.age=age;

        return age;
    }
    public String setName(String name){
        return name;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
}
