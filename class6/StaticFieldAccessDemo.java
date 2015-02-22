class StaticField{
    // a static field is a class variable
    // NOT an instance variable
    static int maximumStories = 100; // static field
}

class StaticFieldAccessDemo{
    public static void main(String[] args){
        System.out.println("The number is " + StaticField.maximumStories);
    }
}
