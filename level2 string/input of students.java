import java.util.Random;

public static int[][] generateMarks(int numStudents) {
    Random rand = new Random();
    int[][] marks = new int[numStudents][3]; // 3 subjects

    for (int i = 0; i < numStudents; i++) {
        for (int j = 0; j < 3; j++) {
            marks[i][j] = 10 + rand.nextInt(90); // 10 to 99
        }
    }
    return marks;
}

public static double[][] calculateStats(int[][] marks) {
    int numStudents = marks.length;
    double[][] stats = new double[numStudents][3]; // total, average, percentage

    for (int i = 0; i < numStudents; i++) {
        int total = marks[i][0] + marks[i][1] + marks[i][2];
        double average = total / 3.0;
        double percentage = (total / 300.0) * 100;

        stats[i][0] = total;
        stats[i][1] = Math.round(average);
        stats[i][2] = Math.round(percentage);
    }
    return stats;
}

public static String[] calculateGrades(double[][] stats) {
    int numStudents = stats.length;
    String[] grades = new String[numStudents];

    for (int i = 0; i < numStudents; i++) {
        double percentage = stats[i][2];

        if (percentage >= 80) grades[i] = "A";
        else if (percentage >= 70) grades[i] = "B";
        else if (percentage >= 60) grades[i] = "C";
        else if (percentage >= 50) grades[i] = "D";
        else if (percentage >= 40) grades[i] = "E";
        else grades[i] = "R";
    }
    return grades;
}

public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
    System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
    for (int i = 0; i < marks.length; i++) {
        System.out.print((i+1) + "\t");
        for (int j = 0; j < 3; j++) {
            System.out.print(marks[i][j] + "\t");
        }
        System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "\t\t" + grades[i]);
    }
}

public static void main(String[] args) {
    int numStudents = 5; // example
    int[][] marks = generateMarks(numStudents);
    double[][] stats = calculateStats(marks);
    String[] grades = calculateGrades(stats);
    displayScorecard(marks, stats, grades);
}

