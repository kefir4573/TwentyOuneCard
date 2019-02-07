import java.util.Random;

/**
 * Created by AcerV on 12.11.2015.
 */
public class BotLvl2 {
    Random random = new Random();
    int botCards[]= {8,9,10};
    int a = random.nextInt(3);
    int b = random.nextInt(3);
    int sumBot = botCards[a] + botCards[b];
}
