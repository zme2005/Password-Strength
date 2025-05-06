import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a new password the password should contains : \nAt least one Upper case character \nAt least one Lower case character \nAt least one Digit case character \nAt least one Special character \nDoes not contain any spaces");
        String Password = input.nextLine();
        int passwordStrength = 0;
        String passwordLevel = null;
        boolean hasLowerCase = false;
        boolean atLeast8Letters = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean HasSpecialCharacter = false;
        if (Password.contains(" ")) {
            System.out.println("Error : password can not have spaces!");
        } else {
            for (int i = 0; i < Password.length(); i++) {

                if (Character.isLowerCase(Password.charAt(i))) {
                    hasLowerCase = true;
                    passwordStrength++;
                    break;
                }
            }
            if (Password.length() >= 8) {
                atLeast8Letters = true;
                passwordStrength++;

            }
            for (int y = 0; y < Password.length(); y++) {
                if (Character.isUpperCase(Password.charAt(y))) {
                    hasUpperCase = true;
                    passwordStrength++;
                    break;
                }

            }
            for (int l = 0; l < Password.length(); l++) {
                if (Character.isDigit(Password.charAt(l))) {
                    hasDigit = true;
                    passwordStrength++;
                    break;
                }
            }
            for (int t = 0; t < Password.length(); t++) {
                if (hasSpecialCharacter(Password.charAt(t))) {
                    HasSpecialCharacter = true;
                    passwordStrength++;
                    break;
                }


            }
            if (passwordStrength == 0) {
                passwordLevel = "Very Weak";
            } else if (passwordStrength == 1) {
                passwordLevel = "Weak";
            } else if (passwordStrength == 2) {
                passwordLevel = "Very weak";
            } else if (passwordStrength == 3) {
                passwordLevel = "Moderate";
            } else if (passwordStrength == 4) {
                passwordLevel = "Strong";
            } else {
                passwordLevel = "Very Strong";
            }
            System.out.println("Has at least 8 letters : " + atLeast8Letters + "\nHas At least one Upper case character : " + hasUpperCase + "\nHas at least one Lower case character : " + hasLowerCase + "\nHas At least one Digit : " + hasDigit + "\nHas At least one special character : " + HasSpecialCharacter + "\nPassword Strength level : " + passwordLevel);
            System.out.println(passwordStrength);
        }
    }


    public static boolean hasSpecialCharacter(char c) {
        boolean CharacterHasSpace = true;
        char[] s = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '=', '+', '/', '`', '<', '>', '[', ']', '{', '}', ';', '~', ':'};
        for (int i = 0; i < s.length; i++) {
            if (s[i] == c) {
                CharacterHasSpace = true;
                break;
            } else {
                CharacterHasSpace = false;
            }
        }
        return CharacterHasSpace;
    }
}
