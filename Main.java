class Main{
    public static void main(String[] args) {
        System.out.println("Training Repo");
        int a = 1;
        int b = 1;
        int c = a + b;
        System.out.println("a + b = " + c);

        Animal a1 = new Animal(5, "roar");
        System.out.println(a1.getAge());
        a1.setAge(250);
        System.out.println(a1.getAge());
        Cat c1 = new Cat(4, "purr");

        a1.talk();
        c1.talk();
    }
}