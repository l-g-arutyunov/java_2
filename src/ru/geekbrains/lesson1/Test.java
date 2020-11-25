package ru.geekbrains.lesson1;

public class Test {

    public static void main(String[] args) {
	    Sporters[] sporters = new Sporters[3];
	    Obstacles[] obstacles = new Obstacles[2];
        sporters[0] = new Human(2, 10);
        sporters[1] = new Cat(1, 20);
        sporters[2] = new Robot(100, 100);

        obstacles[0] = new Treadmill(15);
        obstacles[1] = new Wall(2);

        outer:
        for (Sporters sporter : sporters) {
            for (Obstacles obstacle : obstacles) {
                boolean result = false;
                if (obstacle instanceof  Treadmill) {
                    if (!sporter.doIt((Treadmill) obstacle)) {
                        continue outer;
                    }
                } else {
                    if (!sporter.doIt((Wall) obstacle));
                        continue outer;
                }
            }
        }

    }
}
