package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        //65-90 A-Z; 97-122 a-z
        int letter = symbol;
        if(letter>=65 && letter<=90 || letter>=97 && letter<=122){
            System.out.println("English");
        }else{
            System.out.println("Non English");
        }
    }
}
