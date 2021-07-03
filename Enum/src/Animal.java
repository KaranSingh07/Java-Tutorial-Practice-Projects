public enum Animal {
    DOG("Shero"), CAT("Tom"), MOUSE("Jerry");
    private String name;

    // We can give methods and constructor also
    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name of this animal is " + name;
    }

}

/*
* BLACK, WHITE, RED are actually objects of type Color
* Whatever params supplied in constructor must be given to each of the object in parenthesis.
* */
