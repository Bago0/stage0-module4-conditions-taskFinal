package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean tr = false;
        switch (year % 4) {
            case 0:
                switch (year % 100) {
                    case 0:
                        tr = (year % 400 == 0);
                        break;
                    default:
                        tr = true;
                        break;
                }
                break;
            default:
                tr = false;
                break;
        }
        if (tr && month == 2) {
            System.out.println(29);
        }else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    break;
                case 2:
                    System.out.println(28);
                    break;
                default:
                    System.out.println("wrong number!");
                    break;

            }
        }

    }
    }

