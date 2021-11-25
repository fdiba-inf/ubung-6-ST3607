package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean passValid = false;
        do {
          System.out.println("Enter password: ");
          String password = input.nextLine();
          if (password.length() < 8){
            continue;
          }

          boolean allLetersAndDigits = true;
          int digitCount = 0;
          for (int index = 0; index < password.length(); index++){
          char symbol = password.charAt(index);
          boolean letterOrDigit = Character.isLetterOrDigit(symbol);
          if(!letterOrDigit) {
            allLetersAndDigits = false;
            break;
          }
          boolean digtit = Character.isDigit(symbol);
          if (digtit) {
            digitCount++;
          }
          }

          if (allLetersAndDigits && digitCount >=2){
            passValid = true;
          }
        } while (!passValid);
        System.out.println("Password valid! ");

    }
}
