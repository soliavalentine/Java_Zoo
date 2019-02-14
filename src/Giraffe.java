public class Giraffe extends Animal {
    String favoriteFood = "leaves";
    public Giraffe(String name) {
        super(name, "leaves");
    }

    public void eat(String food){
        if(favoriteFood==food){
            System.out.println("Yum!!" + name + " wants more " + food);
            super.sleep();
        }else{
            System.out.println("YUCK!!!" + name + " will not eat " + food);
        }
    }

    public void sleep() {
      //  System.out.println(name + " sleeps in a cloud.");

    }
}

