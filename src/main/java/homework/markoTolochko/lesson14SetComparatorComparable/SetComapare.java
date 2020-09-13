package homework.markoTolochko.lesson14SetComparatorComparable;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class SetComapare implements Comparable<SetComapare> {
   String letter = "aaaaa";
   String letter1 = "aa";
   int number = 0;
   int number1 = 1;

   public SetComapare() {
   }

   @Override
   public String toString() {
      return "SetComapare{" +
              "letter='" + letter + '\'' +
              ", letter1='" + letter1 + '\'' +
              ", number=" + number +
              ", number1=" + number1 +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      SetComapare that = (SetComapare) o;
      return number == that.number &&
              number1 == that.number1 &&
              Objects.equals(letter, that.letter) &&
              Objects.equals(letter1, that.letter1);
   }

   @Override
   public int hashCode() {
      return Objects.hash(letter, letter1, number, number1);
   }

   @Override
   public int compareTo(SetComapare o) {
      int number = this.number;
      int number1 = this.number1;
      String letter = this.letter;
      String letter1 = this.letter1;

      if (letter.length() > letter1.length()) {
         return 1;
      } else if (letter.length() < letter1.length()) {
         return -1;
      } else {
         if (letter.compareTo(letter1) != 0) {
            return letter.compareTo(letter1);
         } else {

            if (number > number1) {
               return 1;
            } else if (number < number1) {
               return -1;
            } else {
               return 0;
            }
         }
      }
   }
}
