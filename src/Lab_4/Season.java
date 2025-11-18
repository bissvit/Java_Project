package Lab_4;

public class Season {
    public enum Seasons {
        SUMMER(30) {
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN(8),
        SPRING(12),
        WINTER(-15);

        private int temp;

        Seasons(int temp) {
            this.temp = temp;
        }

        public int getTemp() {
            return temp;
        }

        public String getDescription() {
            return "Холодное время";
        }

    }


}
