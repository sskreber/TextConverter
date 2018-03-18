# TextConverter
The script allows you to specify a text and then returns its encoded version (by shifting each character to the right in the alphabet based on the number of occurrences of the 1st letter of this word). CODED in IntelliJ.

History: this is modified version of FunExercises' Exercise2 activity (https://github.com/sskreber/FunExercises), adapted to the IntelliJ platform from Android Studio.

Fixed issues compared to FunExercises Exercise 2: (1) shifting occurs based on letter's number of occurrences, NOT its position in the alphabet (FunExercises was working with the latter); (2) fixed an eternal while loop at the creation of shiftByThisNumber; (3) introduced resetting of local variable alphabetItemNumber (a loop counter) during the creation of the transformed text (changedText) when the checking and transformation procedure moves onto the next letter of the input word, so that the next check starts from the beginning of the alphabet again.
