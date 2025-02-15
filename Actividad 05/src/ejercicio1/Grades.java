package ejercicio1;

public class Grades {
    double[] gradeList;
    public Grades() {
        gradeList = new double[5];
    }
    double calculateAverage() {
        double sum = 0;
        for (double grade : gradeList) {
            sum += grade;
        }
        return sum / gradeList.length;
    }
    double calculateDeviation() {
        double avg = calculateAverage();
        double sum = 0;
        for (double grade : gradeList) {
            sum += Math.pow(grade - avg, 2);
        }
        return Math.sqrt(sum / gradeList.length);
    }
    double calculateLowest() {
        double lowest = gradeList[0];
        for (double grade : gradeList) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
    double calculateHighest() {
        double highest = gradeList[0];
        for (double grade : gradeList) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
}
