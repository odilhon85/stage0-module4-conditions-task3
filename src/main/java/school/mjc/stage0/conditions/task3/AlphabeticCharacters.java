package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int letter = character;
        if(letter>=65 && letter<=90 || letter>=97 && letter<=122){
            if(character=='a' || character=='A' || character=='e' || character=='E' ||
                    character=='u' || character=='U' || character=='i' || character=='I' ||
                    character=='o' || character=='O'){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }else{
            System.out.println("wrong alphabet!");
        }
    }
}
