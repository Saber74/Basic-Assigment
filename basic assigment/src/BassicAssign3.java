///*Basic Assignment #3
//Nizar Alrifai
//Given a single point and a line(formed by 2 other points) the program checks if the point is on the line
// */
//
//import java.awt.geom.*;
//import java.util.Scanner;
//
//public class BasicAssign3 {
//    public static void main(String[] args) {
//        double[] coordList=new double[6];
//        Scanner hi = new Scanner(System.in);
//        for(int i=0; i < 6; i++){
//            System.out.println("Enter x coordinate , hit enter then enter y coordinate. for all three points: ");
//            coordList[i]= hi.nextDouble(); //input of the numbers
//
//
//        }
//        Point2D point1=new Point2D.Double(coordList[0],coordList[1]); //first point
//        Line2D line1=new Line2D.Double(coordList[2],coordList[3],coordList[4],coordList[5]); //creating the line using 2 points
//        Double distance=line1.ptLineDist(point1); //checking for the distance between the point and line
//
//        System.out.println(distance);
//        if (distance==0){ //if there is no distance then the point is on the line!
//            System.out.println("Point is on the line!");
//        }
//        else System.out.println("Point is not on line!");
//
//
//    }
//    }
//
