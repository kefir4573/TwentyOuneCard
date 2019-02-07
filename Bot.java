import java.util.Random;


public class Bot {
    Random random = new Random();
    int botCards[]= {6,7,8,9,10};
    int a = random.nextInt(5);
    int b = random.nextInt(5);
    int sumBot = botCards[a] + botCards[b];
}
