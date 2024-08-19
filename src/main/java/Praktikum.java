public class Praktikum {

    public static String nameSurname = "test test";

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

        Account account = new Account(nameSurname);
        boolean result = account.checkNameToEmboss();
        System.out.println(result);
    }

}
