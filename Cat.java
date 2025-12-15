public class Cat extends Animal {
    private String breed;
    private String furColor;

    public Cat(int age, String vocals){
        super(age, vocals);
    }
    
    public void setVocals(String value){
        this.vocals = value;
    }

    @Override
    public void talk(){
        System.out.println("meow " + this.vocals + " meow");
    }
    
}
