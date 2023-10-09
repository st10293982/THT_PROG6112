/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_test_q1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class camera {
   /* 
    int[][]cameras = {
        {10500,8500},
        {9500,7200},
        {12000,8000},
    };

   public void displayCameraSpecifications() {
        StringBuilder message = new StringBuilder();

         int Diff1 = cameras[0][0] - cameras[0][1];
         int Diff2 = cameras[1][0] - cameras[1][1];
         int Diff3 = cameras[2][0] - cameras[2][1];
         int Diff;
         if(Diff1>Diff2&&Diff1>Diff3){
              Diff = Diff1;
         }else if(Diff2>Diff1&&Diff2>Diff3){
             Diff = Diff2; 
         }else{
              Diff = Diff3;
         }
        for (int i = 0; i < 3; i++) {
            if (cameras[i][i] != 0) {
                message.append("----------------------------------------\n")
                        .append("CAMERA TECHNOLOGY REPORT\n")
                        .append("----------------------------------------\n")
                        .append("          DSLR       MIRRORLESS\n")
                        .append("Canon: ").append(cameras[0][i]).append("\n")
                        .append("Sony: ").append(cameras[1][i]).append("\n")
                        .append("Nikon: ").append(cameras[2][i]).append("\n")
                        .append("----------------------------------------\n")
                        .append("CAMERA TECHNOLOGY RESULT\n")
                        .append("----------------------------------------\n")
                        .append("Canon: \n")
                        .append("Sony: \n")
                        .append("Nikon: \n")
                        .append("\n")
                        .append("THE CAMERA WITH THE MOST COST DIFFERENCE: \n" + Diff)
                        .append("----------------------------------------\n");
                
                
            }
        }

        JOptionPane.showMessageDialog(null, message.toString());
    }
} */
    
    int[][] cameras = {
        {10500, 8500},
        {9500, 7200},
        {12000, 8000},
    };

    public void displayCameraSpecifications() {
        StringBuilder message = new StringBuilder();

        int mostDiff = Integer.MIN_VALUE; 
        String maxDiffBrand = "";
        int diff = 0;

        for (int i = 1; i < 2; i++) {
            int mirrorlessCost = cameras[0][0];
            int dslrCost = cameras[0][1];
            int mirrorlessCostA = cameras[1][0];
            int dslrCostA = cameras[1][1];
            int mirrorlessCostB = cameras[2][0];
            int dslrCostB = cameras[2][1];
             int diffC = mirrorlessCost - dslrCost;
             int diffA = mirrorlessCostA - dslrCostA;
             int diffB = mirrorlessCostB - dslrCostB;



           message.append("----------------------------------------\n")
                        .append("CAMERA TECHNOLOGY REPORT\n")
                        .append("----------------------------------------\n")
                        .append("                MIRRORLESS   DSLR \n")
                        .append("Canon: ").append("R" +cameras[0][0]).append("            R" +cameras[0][1]+"\n")
                        .append("Sony: ").append("  R" +cameras[1][0]).append("              R" +cameras[1][1]+"\n")
                        .append("Nikon: ").append("R" +cameras[2][0]).append("            R" +cameras[2][1]+"\n")
                        .append("----------------------------------------\n")
                        .append("CAMERA TECHNOLOGY RESULT\n")
                        .append("----------------------------------------\n");
                        if (diffC > 2500) {message.append("Canon: R" + diffC+ "***\n");
                        } else {message.append("Canon: R" + diffC+ "\n");}
                        if (diffB > 2500) {message.append("Nikon: R" + diffB+"***\n");
                        } else {message.append("Nikon: R" + diffB+"\n");
                        }
                        if (diffA > 2500) {
                            message.append("Sony: R" + diffA+ "***\n");
                        } else {
                        message.append("Sony: R" + diffA+ "\n");
                        }
                       // message.append("\n")
                        message.append("----------------------------------------\n");

            if (diff > mostDiff) {
                mostDiff = diff;
                if (i == 0) {
                    maxDiffBrand = "Canon";
                } else if (i == 2) {
                    maxDiffBrand = "Sony";
                } else {
                    maxDiffBrand = "Nikon";
                }
            }
        
            }
        

        message.append("THE CAMERA WITH THE MOST COST DIFFERENCE: \n" + maxDiffBrand +  "\n")
                .append("----------------------------------------\n");

        JOptionPane.showMessageDialog(null, message.toString());
    }
}