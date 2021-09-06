package com.reset;

public class UltimateEmojiFighter {
    public static void main(String[] args) {
        Fighter[] fighters = new Fighter[6];
        fighters[0] = new Fighter(
                "Pretty Boy",
                "France",
                31,
                1.75,
                68.9,
                11,
                3,
                1);
        fighters[1] = new Fighter(
                "Putscript",
                "Brazil",
                29,
                1.68,
                67.8,
                14,
                2,
                3);
        fighters[2] = new Fighter(
                "Snapshadow",
                "USA",
                35,
                1.65,
                80.9,
                12,
                2,
                1);
        fighters[3] = new Fighter(
                "Dead Code",
                "Australia",
                28,
                1.93,
                81.6,
                13,
                0,
                2);
        fighters[4] = new Fighter(
                "Ufocobol",
                "Brasil",
                37,
                1.70,
                119.3,
                5,
                4,
                3);
        fighters[5] = new Fighter(
                "Nerdaard",
                "EUA",
                30,
                1.81,
                105.7,
                12,
                2,
                4);

        for (int i=0; i<6; i++) {
            fighters[i].presentFighter();
        }

        Fight fight1 = new Fight(fighters[3], fighters[2]);
    }
}
