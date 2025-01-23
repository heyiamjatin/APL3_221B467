class Two extends One{
    // two solutions 
    // each make two parametersized constructor and pass paramter to super
    // or make a defualt constructor in class One 
    Two(int x){
        super(x);
        System.out.println("two from default constructor");
    }
}