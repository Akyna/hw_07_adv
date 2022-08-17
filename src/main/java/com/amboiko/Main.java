package com.amboiko;

//1. Есть некая шахта с золотом. Изначально там 1000 золота.
// На старте программы существуют 3 рабочих, которые майнят 3 золота в секунду.
// Так же, существуют Бараки, которые каждые 10 секунд
// производят еще одного рабочего (у каждого рабочего есть имя).
// Программа завершается, как только заканчивается золото в шахте.
// Каждую Секунду выводить лог-  имя_рабочего: количество_золота_у _него
// и остаток золота в шахте. Рабочие майнят золото по очереди.

public class Main {
    public static void main(String[] args) {
        Barrack barrack = new Barrack();
        Mine mine = new Mine(1000);
        Manufacturing manufacturing = new Manufacturing(mine, barrack);
        new Logger(mine, manufacturing);
        manufacturing.startProcess();
    }
}
