public class Robot {
    private String name;

    Robot(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Robot " + name + " started.");
        Brain brain = new Brain();
        brain.think();

        String word = "Hello";
        // --- Type-3 Class inside method ---
        class Speaker {
            public void speak() {
                System.out.println(word);
            }
        }

        Speaker speaker = new Speaker();
        speaker.speak();
    }

    /* --- Type-1 Non static --- */
    // Private Inner class
    private class Brain {
        public void think() {
            System.out.println("Robot " + name + " is thinking.");
        }
    }

    // Default Inner class
    class Chip {
        public void feedCode() {
            System.out.println("Code fed into Robot " + name + "'s chip.");
        }
    }

    /* --- Type-2 Static --- */
    static class Battery {
        // Static classes can only access static variable
        public void charge() {
            System.out.println("Battery charging...");
        }
    }

}
