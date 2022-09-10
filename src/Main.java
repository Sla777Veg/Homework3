public class Main {
    public static void main(String[] args) {
         //Задание 1,4
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("Bозраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

        //Задание 2,5
        int YearsOld = 23;
        if (YearsOld >= 7 && YearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (YearsOld >= 18 && YearsOld < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

            //Задание 3,6
        int NumWag = 87;
        if (NumWag < 60) {
            System.out.println("Есть сидячее и стоячее место место");
        }
        if (NumWag >= 60 && NumWag < 102) {
            System.out.println("Есть стоячее место");
        }
        else {
            System.out.println("Вагон уже полностью забит");
            }

        //Задание 7
        int PeopleOld = 10;
        if (PeopleOld >= 2 && PeopleOld < 6) {
            System.out.println("Если возраст человека равен "+PeopleOld+ " , то ему нужно ходить в детский сад");
        }
        if (PeopleOld >= 7 && PeopleOld < 18) {
            System.out.println("Если возраст человека равен "+PeopleOld+ " , то ему нужно ходить в школу");
        }
        if (PeopleOld >= 18 && PeopleOld < 24) {
            System.out.println("Если возраст человека равен "+ PeopleOld+ " , то его место в университете");
        }
        if (PeopleOld > 24) {
            System.out.println("Если возраст человека равен "+PeopleOld+ " , то ему нужно ходить на работу");
        }

        //Задание 8
        int KIdOld = 11;
        if (KIdOld < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        if (KIdOld > 5 && KIdOld < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        }
        else {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        //Задание 9
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two && one >free) {
            System.out.println(one);
        }
        if (two > one && two > free) {
            System.out.println(two);
        }
        else {
            System.out.println(free);
        }
        }
    }
