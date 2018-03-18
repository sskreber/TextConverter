public class Text {

    String content;
    // features it can have:
    // none upfront that could be passed in as parameters when creating an instance; they will be generated (from length, etc)

    // constructor to create text object

    public Text(String content) {
        this.content = content;
    }

    public void changeText() {

        String textString = content;
        // getting the length (the number of characters) of this String input by the user
        int textLength = textString.length();

        System.out.println("The text is: " + textString);
        System.out.println("The text length is: " + textLength + " characters");

        // creating an array of characters that is the same length as the input word itself,
        // to save the lowercased version of the input word in char form into.
        Character[] inputTextChar = new Character[textLength];
        int itemNumber = 0;
        // transforming the String text (from the original text instance) into an array of characters, all in lower case:
        while (itemNumber < textLength) {
            inputTextChar[itemNumber] = textString.charAt(itemNumber);

            inputTextChar[itemNumber] = Character.toLowerCase(inputTextChar[itemNumber]);

            itemNumber++;
        }
        Character firstCharOrigWord = inputTextChar[0];

        Character[] alphabetTwice = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int alphabetTwiceLength = alphabetTwice.length;

        int alphabetLength = alphabetTwiceLength / 2; //=26

        itemNumber = 0;

        // finding the number of occurrences of the letter of the alphabet the input word starts with
        // by comparing the first character of the input word to each letter of the alphabet on a character array.
        // If it is the same, that index is grabbed. That'll be the number we'll shift each letter by to the right in the alphabet later.
        int shiftByThisNumber = 0;
        while (itemNumber < textLength) {
            if (firstCharOrigWord.equals(inputTextChar[itemNumber])) {
                shiftByThisNumber++;
                itemNumber++;

            } else itemNumber++;
}
System.out.println("Text will be shifted by this number: " + shiftByThisNumber);

        // now changing all the rest of the letter-based characters:

        /**
         * This while loop iterates through all the characters of the input word, and compares each to characters of the alphabet.
         * It checks if it is an element of the alphabet (a letter) or not (special characters).
         * If it IS a letter, it shifts it by the number the shiftByThisNumber variable gave us (from the index of the first character),
         * and adds it to the changedText character array.
         * If it ISN'T a letter, it adds it to the changedText character array without inflicting any change.
         * The loop goes on until it has dealt with all the characters of the input word.
         */
        itemNumber = 0; // to keep track of where we are in the word during the loop (index)
        int alphabetItemNumber = 0; // to keep track of where we are in the alphabet during the loop (index)

        char[] changedText = new char[textLength];
        while (itemNumber < textLength) {
            // if the letter matches the first letter of the alphabet, it gets modified by shifting by a given number (shiftByThisNumber) in the alphabet

            if (inputTextChar[itemNumber].equals(alphabetTwice[alphabetItemNumber])) {
                inputTextChar[itemNumber] = alphabetTwice[alphabetItemNumber + shiftByThisNumber];
                // we update character array (the transformed version of the word) with this changed character
                changedText[itemNumber] = inputTextChar[itemNumber];
                // it can move onto checking the next character of the word.
                itemNumber++;
                alphabetItemNumber = 0;
            }
            // if the letter doesn't match the given letter of the alphabet, it keeps checking the next letters of the alphabet
            else {
                // if we haven't checked every letter of the alphabet yet for a match for this character,
                // it increases alphabetItemNumber, goes back into checking the while loop's if part, & keeps searching for a match
                // // to be able to modify the input word's character accordingly.
                if (alphabetItemNumber < alphabetLength) {
                    alphabetItemNumber++;
                }
                // if we have already checked the whole alphabet, it means we are dealing with a special character,
                // so let's add this special character to the transformed version of the word without changing it:
                else {
                    changedText[itemNumber] = inputTextChar[itemNumber];
                    // after adding this special character, we can move onto checking the next one of the lowercased version of the input word against the alphabet
                    itemNumber++;
                    alphabetItemNumber = 0;
                }
            }
        }

        // converting the Char array into a String
        String changedTextString;
        changedTextString = String.valueOf(changedText);
        System.out.println("The changed text is: " + changedTextString);
    }
}










