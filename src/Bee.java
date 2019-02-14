public class Bee extends Animal {
    String favoriteFood = "pollen";
    public Bee(String name) {
        super(name, "pollen");
    }
    public void sleep() {
        System.out.println(name + " never sleeps.");

    }
    public void eat(String food){
        if(favoriteFood==food){
            System.out.println("Yum!!" + name + " wants more " + food);
            this.sleep();
        }else{
            System.out.println("YUCK!!!" + name + " will not eat " + food);
        }
    }
}

