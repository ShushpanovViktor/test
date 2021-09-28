package beepers;

public class FancyMusic implements Beeper{
    @Override
    public String makeSound() {
        return "What is Love? Baby dont hurt me";
    }
    public String checkArtist()
    {
        return "Various Artist";
    }
}
