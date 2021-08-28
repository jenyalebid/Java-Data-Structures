package Recursion;

public class TowerOfHanoi {

    public void move(int diskNum, char from, char to, char middle) {

        if (diskNum == 1)
            System.out.println("Moving Disk 1 From " + from + " To " + to);
        else {
            move(diskNum - 1, from, middle, to);
            System.out.println("Moving Disk " + diskNum + " From " + from + " To " + to);
            move(diskNum - 1, middle, to, from);
        }

    }
}
