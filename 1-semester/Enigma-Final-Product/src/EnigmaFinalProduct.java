import java.util.Scanner;

public class EnigmaFinalProduct {

  Scanner scanner = new Scanner(System.in);
  String questionForUser = " ";
  boolean isPlaying;

  public static void main(String[] args) {
    EnigmaFinalProduct demo = new EnigmaFinalProduct();
    demo.valueToLetter(0);
    demo.letterToValue('A');
    demo.userInput();
  }

  //Figures the letter of the value
  public char valueToLetter(int number) {
    if (number == 0) {
      return ' ';
    } else if (number == 1) {
      return 'A';
    } else if (number == 2) {
      return 'B';
    } else if (number == 3) {
      return 'C';
    } else if (number == 4) {
      return 'D';
    } else if (number == 5) {
      return 'E';
    } else if (number == 6) {
      return 'F';
    } else if (number == 7) {
      return 'G';
    } else if (number == 8) {
      return 'H';
    } else if (number == 9) {
      return 'I';
    } else if (number == 10) {
      return 'J';
    } else if (number == 11) {
      return 'K';
    } else if (number == 12) {
      return 'L';
    } else if (number == 13) {
      return 'M';
    } else if (number == 14) {
      return 'N';
    } else if (number == 15) {
      return 'O';
    } else if (number == 16) {
      return 'P';
    } else if (number == 17) {
      return 'Q';
    } else if (number == 18) {
      return 'R';
    } else if (number == 19) {
      return 'S';
    } else if (number == 20) {
      return 'T';
    } else if (number == 21) {
      return 'U';
    } else if (number == 22) {
      return 'V';
    } else if (number == 23) {
      return 'W';
    } else if (number == 24) {
      return 'X';
    } else if (number == 25) {
      return 'Y';
    } else if (number == 26) {
      return 'Z';
    } else if (number == 27) {
      return 'Æ';
    } else if (number == 28) {
      return 'Ø';
    } else if (number == 29) {
      return 'Å';
    } else
      return '?';
  }

  //Figures the value of the letter
  public int letterToValue(char c) {
    if (c == ' ') {
      return 0;
    } else if (c == 'A') {
      return 1;
    } else if (c == 'B') {
      return 2;
    } else if (c == 'C') {
      return 3;
    } else if (c == 'D') {
      return 4;
    } else if (c == 'E') {
      return 5;
    } else if (c == 'F') {
      return 6;
    } else if (c == 'G') {
      return 7;
    } else if (c == 'H') {
      return 8;
    } else if (c == 'I') {
      return 9;
    } else if (c == 'J') {
      return 10;
    } else if (c == 'K') {
      return 11;
    } else if (c == 'L') {
      return 12;
    } else if (c == 'M') {
      return 13;
    } else if (c == 'N') {
      return 14;
    } else if (c == 'O') {
      return 15;
    } else if (c == 'P') {
      return 16;
    } else if (c == 'Q') {
      return 17;
    } else if (c == 'R') {
      return 18;
    } else if (c == 'S') {
      return 19;
    } else if (c == 'T') {
      return 20;
    } else if (c == 'U') {
      return 21;
    } else if (c == 'V') {
      return 22;
    } else if (c == 'W') {
      return 23;
    } else if (c == 'X') {
      return 24;
    } else if (c == 'Y') {
      return 25;
    } else if (c == 'Z') {
      return 26;
    } else if (c == 'Æ') {
      return 27;
    } else if (c == 'Ø') {
      return 28;
    } else if (c == 'Å') {
      return 29;
    } else
      return '?';

  }

  public void userInput() {
    System.out.print("Do you want to encrypt or decrypt a message? ");
    questionForUser = scanner.nextLine();
    if (questionForUser.equals("encrypt")) {
      encryption();
    }
    if (questionForUser.equals("decrypt")) {
      decryption();
    }


  }

  public void encryption() {
    System.out.print("Type your plaintext: ");
    char[] plaintext = scanner.nextLine().toUpperCase().toCharArray();
    char[] ciphertext = new char[plaintext.length];
    System.out.print("Enter shift: ");
    int shifts = scanner.nextInt();

    for (int index = 0; index < plaintext.length; index++) {
      char b = plaintext[index];
      int newLetterValue = (letterToValue(b) + shifts);
      ciphertext[index] = valueToLetter(newLetterValue);
    }
    System.out.println(ciphertext);
    scanner.nextLine();
    System.out.print("Type (1) for decryption and (2) for exit: ");
    questionForUser = scanner.nextLine();
    if (questionForUser.equals("1")) {
      decryption();
    } if (questionForUser.equals("2")) {
      isPlaying = false;
    }
  }

  public void decryption() {
    System.out.print("Type your ciphertext: ");
    char[] ciphertext = scanner.nextLine().toUpperCase().toCharArray();
    char[] plaintext = new char[ciphertext.length];
    System.out.print("Enter shift: ");
    int shifts = scanner.nextInt();

    for (int index = 0; index < ciphertext.length; index++) {
      char b = ciphertext[index];
      int newLetterValue = (letterToValue(b) - shifts);
      plaintext[index] = valueToLetter(newLetterValue);
    }
    System.out.println(plaintext);
    scanner.nextLine();
    userInput();
  }
}
