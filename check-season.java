/* 
Времена года на Терре

Земной год состоит из четырех сезонов, каждый из которых длится 3 месяца. В то время, как наш корабль отдыхал в этой колыбели человечества, к нам обратилась Межпланетная Налоговая Служба с просьбой написать для неё программу, определяющую время года по номеру месяца. Для чего это им — не знаем, говорят, не наше дело. Но обещали в долгу не остаться.
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        String season;
        if (month > 2 && month < 6) {
            season = "весна";
        } else if (month > 5 && month < 9) {
            season = "лето";
        } else if (month > 8 && month < 12) {
            season = "осень";
        } else {
            season = "зима";
        }
        System.out.println(season);
    }
}