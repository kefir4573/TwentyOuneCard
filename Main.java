
import java.util.Random;
import java.util.Scanner;

/**
 * Created by AcerV on 12.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        int cards[] = {3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();

        int a = random.nextInt(8);

        int b = random.nextInt(8);
        int sum = cards[a] + cards[b];


        Scanner scanner = new Scanner(System.in);
        Bot bot1 = new Bot();
        BotLvl2 botLvl2 = new BotLvl2();
        BotLvl3 botLvl3 = new BotLvl3();
        System.out.println("Введите уровень игры бота от 1 до 3. Например: 2");
        String bot = scanner.nextLine();
        if (bot.equals("1")) {
            System.out.println("Уровень бота: 1. Приятной игры!");
            sumCards(sum);
            gameBot1(cards, random, sum, scanner, bot1);
        }
        if (bot.equals("2")) {
            System.out.println("Уровень бота: 2. Приятной игры!");
            sumCards(sum);
            gameBot2(cards, random, sum, scanner, botLvl2);
        }
        if (bot.equals("3")) {
            System.out.println("Уровень бота: 3. Приятной игры!");
            sumCards(sum);
            gameBot3(cards, random, sum, scanner, botLvl3);

        }


    }

    public static void sumCards(int sum) {
        System.out.print("Сумма карт: ");
        System.out.println(sum);
        System.out.println("Чтобы взять еще одну карту, введите команду *give*. Но помните, что сумма карт не должна превышать 21!");
        System.out.println("Чтобы закончить игру и узнать победителя, введите команду *stop*");
    }

    public static void gameBot3(int[] cards, Random random, int sum, Scanner scanner, BotLvl3 botLvl3) {
        while (sum <= 21) {
            String s = scanner.nextLine();
            if (s.equals("give")) {
                int c = random.nextInt(7);

                sum = sum + cards[c];
                System.out.print("Сумма карт: ");
                System.out.println(sum);
            }

            if (s.equals("stop")) {
                if (botLvl3.sumBot < sum) {
                    System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + botLvl3.sumBot);
                    System.out.println("Поздравляем, ты выиграл!");
                } else if (botLvl3.sumBot > sum) {
                    System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + botLvl3.sumBot);
                    System.out.println("Неповезло, ты проиграл, попробуй еще раз!");
                } else {
                    System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + botLvl3.sumBot);
                    System.out.println("Победила механическая дружба!");
                }

            }
        }
        if (sum > 21) {
            System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + botLvl3.sumBot);
            System.out.println("Неповезло, сумма карт больше 21, попробуй еще раз!");
        }
    }

    public static void gameBot2(int[] cards, Random random, int sum, Scanner scanner, BotLvl2 botLvl2) {
        while (sum <= 21) {
            String s = scanner.nextLine();
            if (s.equals("give")) {
                int c = random.nextInt(7);

                sum = sum + cards[c];
                System.out.print("Сумма карт: ");
                System.out.println(sum);
            }

            if (s.equals("stop")) {
                if (botLvl2.sumBot < sum) {
                    System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + botLvl2.sumBot);
                    System.out.println("Поздравляем, ты выиграл!");
                } else if (botLvl2.sumBot > sum) {
                    System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + botLvl2.sumBot);
                    System.out.println("Неповезло, ты проиграл, попробуй еще раз!");
                } else {
                    System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + botLvl2.sumBot);
                    System.out.println("Победила механическая дружба!");
                }

            }
        }
        if (sum > 21) {
            System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + botLvl2.sumBot);
            System.out.println("Неповезло, сумма карт больше 21, попробуй еще раз!");
        }
    }

    public static void gameBot1(int[] cards, Random random, int sum, Scanner scanner, Bot bot1) {
        while (sum <= 21) {
            String s = scanner.nextLine();
            if (s.equals("give")) {
                int c = random.nextInt(7);

                sum = sum + cards[c];
                System.out.print("Сумма карт: ");
                System.out.println(sum);
            }

            if (s.equals("stop")) {
                if (bot1.sumBot < sum) {
                    System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + bot1.sumBot);
                    System.out.println("Поздравляем, ты выиграл!");
                } else if (bot1.sumBot > sum) {
                    System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + bot1.sumBot);
                    System.out.println("Неповезло, ты проиграл, попробуй еще раз!");
                } else {
                    System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + bot1.sumBot);
                    System.out.println("Победила механическая дружба!");
                }

            }
        }
        if (sum > 21) {
            System.out.println("Сумма твои карт: " + sum + " . Сумма карт бота: " + bot1.sumBot);
            System.out.println("Неповезло, сумма карт больше 21, попробуй еще раз!");
        }
    }
}
