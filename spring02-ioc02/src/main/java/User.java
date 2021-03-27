public class User {
    private String name;

    public User(String name) {
        this.name = name;
//        System.out.println("user的无参构造");
        System.out.println("有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
