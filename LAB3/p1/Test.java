public class Test {
    public static void main(String[] args) {
        Pandav arjun = new Arjun();
        Pandav bheem = new Bheem();
        Kaurav duryodhan = new Duryodhan();
        Kaurav vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.disobey();
        duryodhan.cruel();

        vikarn.fight();
        vikarn.disobey();
        vikarn.cruel();
    }
}
