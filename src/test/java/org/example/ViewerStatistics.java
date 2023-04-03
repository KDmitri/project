package org.example;

public class ViewerStatistics {
    public void averageAge(){
        Viewer viewer = new Viewer();
        int[] num = viewer;
        int result=0;
        for (int n : num){
            result += n;
        }
        int nums =result / num.length;
    }
}
