import java.util.Random;

/**
 * Created by AcerV on 12.11.2015.
 */
public class BotLvl3 {
    Random random = new Random();
    int botCards[]= {9,10};
    int a = random.nextInt(2);
    int b = random.nextInt(2);

    int sumBot = botCards[a] + botCards[b];
}
