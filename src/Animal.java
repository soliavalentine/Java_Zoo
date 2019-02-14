class Animal {
    String name;
    String favoriteFood;

    public Animal(String name, String favoriteFood) {
        this.name=name;
        this.favoriteFood=favoriteFood;
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours.");

    }

    public void eat(String food) {
        System.out.print(name + " eats " + food + ".");
        if(favoriteFood==food){
            System.out.println("Yum!!!" + name + " wants more " + food + ".");
        }else{
            this.sleep();
        }
    }
}
