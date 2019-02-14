public class Bear extends Animal {
    String favoriteFood="fish";
    public Bear(String name) {
        super(name, "fish");
    }
    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food + ".");
        if(favoriteFood==food){
            System.out.println("Yum!!!" + name + " wants more " + food + ".");
        }else {
            this.sleep();
        }
    }



}
