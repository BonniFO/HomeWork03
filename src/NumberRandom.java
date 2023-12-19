import java.util.Random;
public class NumberRandom
{
    public int a;
    public int b;
    public NumberRandom(int a, int b)
    {
        this.a = this.a;
        this.b = this.b;
    }
    public int Length(int a, int b)
    {
        return b-a;
    }
    public int Number (int a, int b)
    {
        Random random = new Random();
        return random.nextInt(a, b);
    }
}