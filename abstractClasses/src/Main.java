public class Main {
    public static void main(String[] args) {
//        GameCalculator[] calculators = new GameCalculator[]{new KidsGameCalculator(),new ManGameCalculator(), new WomanGameCalculator() };
//
//        for (GameCalculator calculator : calculators){
//            calculator.calculate();
//            calculator.gameOver();
//        }

        GameCalculator gameCalculators = new WomanGameCalculator();
        gameCalculators.calculate();
    }
}