package repetera.objects.more_repetition;

public class AboutThatVar {
    public static void main(String[] args) {
        AboutThatVar aboutThatVar = new AboutThatVar();

        aboutThatVar.textSplitter("Some text over here.");
        aboutThatVar.reverseString("Reverse me... now!");
        System.out.println();
        aboutThatVar.addSpaces("UghThisTextIsHardToRead..");

    }


    //split text
    public void textSplitter(String text) {
        var words = text.split(" ");

        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }
    }

    //reversing String
    public void reverseString (String text){
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }

    //add spaces
    public void addSpaces(String text){
        var newText = new StringBuilder(text);

        for(int i=0; i<newText.length(); i++){
            if(i!=0 && Character.isUpperCase(newText.charAt(i))){
            newText.insert(i," ");
            i++;
            }
        }
        System.out.println(newText);

    }
}
