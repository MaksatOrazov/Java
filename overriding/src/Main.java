public class Main {
    public static void main(String[] args) {
        BaseCrediManager[] crediManagers = new BaseCrediManager[]{new TeacherCrediManager(),
                new TarimCrediManager(),new StudentCrediManager()};
        for (BaseCrediManager crediManager: crediManagers ){
            System.out.println(crediManager.calculate(1000));
        }
    }
}