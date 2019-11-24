package lesson_02.task_01;

/**
 Необходимо написать программу «Heads or Tails?» («Орёл или решка?»), которая бы «подбрасывала» условно монету,
 к примеру, 1000 раз и сообщала, сколько раз выпал орёл, а сколько – решка.
 */

public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.chooseCountOfFlips();
        coin.flipCoin();
        coin.printCount();
    }
}

