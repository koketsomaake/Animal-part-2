class MainProgram {
    public static void main(String[] args) {
        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        home.makeAllSounds();
        home.adoptPet(dog1);
        home.makeAllSounds();


        home.adoptPet(cat);
        home.makeAllSounds();


        home.adoptPet(dog2);
        home.makeAllSounds();
    }
}
