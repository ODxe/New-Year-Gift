import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Вы хотите самостоятельно выбрать сладости для подарка из ассортимента или " +
                "система автоматически подберет сладости для вашего подарка? Введите соответствующее: самостоятельно " +
                "или автоматически");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("самостоятельно")){
            userСonfectionChoise();
        }
        else if (answer.equals("автоматически")){
            systemСonfectionChoise();
        }

    }

    public static void userСonfectionChoise(){
        System.out.println("Пока тут ничего нет, но скоро будет :)");
    }

    public static void systemСonfectionChoise(){

        // Массивы хранят ассортимент и граммовки для динамичесвого формирования объектов. Соответствие 1 к 1.
        String[] sweetsAssortment = new String[] {"Конфеты \"Воронежские\"", "Конфеты \"Коровка\"",
                "Конфеты \"Барбарис\"", "Конфеты \"Огни Москвы\"", "Конфеты \"Птичье молоко\""};
        int[] sweetsAssortmentWeight = new int[] {11, 15, 5, 14, 13}; //вес одной конфеты в граммах

        int positionInSweetsAssortment1 = (int) (Math.random()*4);
        int positionInSweetsAssortment2 = (int) (Math.random()*4);

        while (positionInSweetsAssortment1 == positionInSweetsAssortment2){
            positionInSweetsAssortment2 = (int) (Math.random()*4);
        }

        // Формируем объекты - конфеты
        Sweets sweetType1 = new Sweets(sweetsAssortment[positionInSweetsAssortment1],
                sweetsAssortmentWeight[positionInSweetsAssortment1]);
        Sweets sweetType2 = new Sweets(sweetsAssortment[positionInSweetsAssortment2],
                sweetsAssortmentWeight[positionInSweetsAssortment2]);

        // Ассортимент мармелада
        String[] marmaladeAssortment = new String[] {"Мармедад \"Кислые червячки\"", "Мармелад \"Веселые мишки\"",
                "Мармелад \"Клубника 3D\"", "Мармелад \"Бабл Гам\"", "Мармелад \"Яркие паучки\""};
        int[] marmaladeAssortmentWeight = new int[] {3, 1, 2, 3, 1}; //вес одной мармеладки в граммах

        int positionInMarmaladeAssortment1 = (int) (Math.random()*4);
        int positionInMarmaladeAssortment2 = (int) (Math.random()*4);

        while (positionInMarmaladeAssortment1 == positionInMarmaladeAssortment2){
            positionInMarmaladeAssortment2 = (int) (Math.random()*4);
        }

        // Формируем объекты - мармеладки
        Marmalade marmaladeType1 = new Marmalade(marmaladeAssortment[positionInMarmaladeAssortment1],
                marmaladeAssortmentWeight[positionInMarmaladeAssortment1]);
        Marmalade marmaladeType2 = new Marmalade(marmaladeAssortment[positionInMarmaladeAssortment2],
                marmaladeAssortmentWeight[positionInMarmaladeAssortment2]);
        /*
        System.out.println(marmaladeType1.marmaladeName + " " + marmaladeType1.marmaladeWeight);
        System.out.println(marmaladeType2.marmaladeName + " " + marmaladeType2.marmaladeWeight);*/

        // Ассортимент шоколада
        String[] chocolateAssortment = new String[] {"Шоколад \"Молочный\"", "Шоколад \"Воздушный белый\"",
                "Молочный шоколад с карамельной начинкой \"Milka\"", "Молочный шоколад с лесными орехами \"Alpen Gold\"",
                "Молочный шоколад с печеньем \"Alpen Gold\""};
        int[] chocolateAssortmentWeight = new int[] {100, 85, 110, 120, 100}; //вес одной шоколадки в граммах

        int positionInChocolateAssortment1 = (int) (Math.random()*4);
        int positionInChocolateAssortment2 = (int) (Math.random()*4);

        while (positionInChocolateAssortment1 == positionInChocolateAssortment2){
            positionInChocolateAssortment2 = (int) (Math.random()*4);
        }

        // Формируем объекты - шоколадки
        Chocolate chocolateType1 = new Chocolate(chocolateAssortment[positionInChocolateAssortment1],
                chocolateAssortmentWeight[positionInChocolateAssortment1]);
        Chocolate chocolateType2 = new Chocolate(chocolateAssortment[positionInChocolateAssortment2],
                chocolateAssortmentWeight[positionInChocolateAssortment2]);

        // Ассортимент печенья
        String[] cookieAssortment = new String[] {"Печенье \"Аленка\" с клюквой и шоколадом",
                "Печенье \"Аленка\" шоколадное с ореховой начинкой",
                "Понч с вишневой начинкой \"Bite&Go\"", "Печенье \"Milka Sticks\" с шоколадной начинкой",
                "Печенье \"Milka Sensations\" с шоколадной крошкой"};
        int[] cookieAssortmentWeight = new int[] {140, 200, 150, 112, 312};

        int positionInСookieAssortment1 = (int) (Math.random()*4);
        int positionInСookieAssortment2 = (int) (Math.random()*4);

        while (positionInСookieAssortment1 == positionInСookieAssortment2){
            positionInСookieAssortment2= (int) (Math.random()*4);
        }

        // Формируем объекты - печенья
        Cookie cookieType1 = new Cookie(cookieAssortment[positionInСookieAssortment1],
                cookieAssortmentWeight[positionInСookieAssortment1]);
        Cookie cookieType2 = new Cookie(cookieAssortment[positionInСookieAssortment2],
                cookieAssortmentWeight[positionInСookieAssortment2]);

        System.out.println("Для вашего подарка были выбраны: ");
        System.out.println(sweetType1.sweetName);
        System.out.println(sweetType2.sweetName);
        System.out.println(marmaladeType1.marmaladeName);
        System.out.println(marmaladeType2.marmaladeName);
        System.out.println(chocolateType1.chocolateName);
        System.out.println(chocolateType2.chocolateName);
        System.out.println(cookieType1.cookieName);
        System.out.println(cookieType2.cookieName);
        System.out.println("Вы довольны подбором продукции? Если, да, то введите \"Да\" и мы приступим к " +
                "формированию подарка. Если нет, то введите \"Нет\" и система изменит выбор");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("Да")){
            System.out.println("Скоро будет :)");
        }
        else if (answer.equals("Нет")){
            systemСonfectionChoise();
        }
    }
}