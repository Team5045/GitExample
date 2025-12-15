public class Animal {
    private boolean hasTail;
    protected String vocals;
    private int age;

    public Animal(int age, String vocals){
        this.age = age;
        this.vocals = vocals;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int value) {
        if(value < 0){
            this.age = 0;
        }
        else if(value > 200){
            this.age = 200;
        } else {
            this.age = value;
        }
        
    }

    public void talk() {
        System.out.println(this.vocals);
    }
}
