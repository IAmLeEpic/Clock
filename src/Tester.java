public class Tester {
    public static void main (String[] args){
        Clock clock = new Clock();
        clock.getTime();
        clock.updateDisplay();

        System.out.println(clock.getTime());
    }
}
