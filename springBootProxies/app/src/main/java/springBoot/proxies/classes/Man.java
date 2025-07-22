package springBoot.proxies.classes;

public class Man implements Person{
    private String name;
    private int age;
    private String identity;

    public Man(String name, int age, String identity){
        this.name=name;
        this.age=age;
        this.identity=identity;
    }



    @Override
    public void personName(String name){
        System.out.println("My name is " + this.name + ".");
    }

    @Override
    public void personAge(int age){
        System.out.println("My age is " + this.age + ".");
    }

    @Override
    public void personIdentity(String identity){
        System.out.println("I am " + this.identity + ".");
    }

    public String getName() {
        return this.name;
    }
}
