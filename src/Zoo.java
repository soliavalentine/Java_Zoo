public class Zoo {
    String favoriteFood = "bacon";
    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.sleep("Tigger");
        z.eat("Tigger", "meat");
        z.eat("Tigger", "bacon");

    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours.");
    }
    public void eat(String name, String food) {
        System.out.println(name + " eats " + food + ".");
        if(favoriteFood==food){
            System.out.println("Yum!!!" + name + " wants more " + food + ".");
        }
    }
}

