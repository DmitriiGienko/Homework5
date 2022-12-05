public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("______Задача 1______");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если ваш возраст равен " + age + " то Вы совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если ваш возраст равен " + age + " то Вам нужно немного подождать!");
        }
    }

    public static void task2() {
        System.out.println("______Задача 2______");
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        }
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("______Задача 3______");
        int speed = 75;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + "км/ч, то придется заплатить штраф.");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("______Задача 4______");
        int age = 34;
        boolean age2to6 = age >= 2 && age <= 6;
        boolean age7to18 = age >= 7 && age <= 18;
        boolean age18to24 = age > 18 && age <= 24;
        boolean ageMoreThen24 = age > 24;
        if (age2to6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age7to18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age18to24) {
            System.out.println("Если возраст человека равен " + age + ", то ему место в университете.");
        }
        if (ageMoreThen24) {
            System.out.println("Если возраст человека равен " + age + ", то ему ему пора ходить на работу.");
        } else {
            System.out.println("Вы слишком малы!");
        }
    }

    public static void task5() {
        System.out.println("______Задача 5______");
        int age = 10;
        boolean ageLessThen5 = age < 5;
        boolean age5to14 = age >= 5 && age < 14;
        if (ageLessThen5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age5to14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

    }

    public static void task6() {
        System.out.println("______Задача 6______");
        int youTicket = 125;
        boolean less60 = youTicket <= 60;
        boolean more60 = youTicket > 60 && youTicket <= 102;
        boolean more102 = youTicket > 102;
        if (less60) {
            System.out.println("В вагоне есть сидячее место");
        } else {
            System.out.println("Сидячих мест не осталось");
        }
        if (more60) {
            System.out.println("В вагоне есть только стоячее место");
        }
        if (more102) {
            System.out.println("Вагон уже полностью забит");
        }
    }

    public static void task7() {
        System.out.println("______Задача 7______");
        int one = 10;
        int two = 7;
        int three = 11;
        boolean oneMore = (one > two && one > three);
        boolean twoMore = (two > one && two > three);
        boolean threeMore = (three > one && three > two);
        if (oneMore) {
            System.out.println("Большее число " + one);
        }
        if (twoMore) {
            System.out.println("Большее число " + two);
        }
        if (threeMore) {
            System.out.println("Большее число " + three);
        }
    }


}