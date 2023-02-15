public class Empolyee extends  Person {
    private int id;


    @Override
    public void work() {
        if (id == 0) {
            System.out.println("Myndai jumushchu ishtebeit");
        } else
            System.out.println("Myndai jumushchu ishteit");

    }

    public Empolyee(String name, char gender, int id) {
        super(name, gender);
        this.id = id;
    }
}
