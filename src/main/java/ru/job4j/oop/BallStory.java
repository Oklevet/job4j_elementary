package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zayka = new Hare();
        Wolf volchok = new Wolf();
        Fox lisichka = new Fox();
        kolobok.sing(zayka);
        zayka.listenSong(kolobok);
        kolobok.ranAway(zayka);
        kolobok.sing(volchok);
        volchok.listenSong(kolobok);
        kolobok.ranAway(volchok);
        kolobok.sing(lisichka);
        lisichka.listenSong(kolobok);
        lisichka.cheat(kolobok);
        kolobok.sing(lisichka);
        lisichka.ate(kolobok);
    }
}
