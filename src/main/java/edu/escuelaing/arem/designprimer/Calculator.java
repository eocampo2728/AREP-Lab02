package edu.escuelaing.arem.designprimer;
/**
 * This class calculate the mean and the standard deviation of the values of a LinkedList.
 * @author eduardo.ocampo
 */
public class Calculator {

    /**
     * This method calculate the mean of the values of a LinkedList.
     * @param elements The LinkedList to calculate the mean.
     * @return the mean of the values of the LinkedList.
     */
    public static double mean(LinkedList elements){
        double ans = 0;
        for (int i = 0; i < elements.size(); i++){
            ans += new Double(elements.get(i).toString());
        }
        ans = ans/elements.size();
        ans = Math.round(ans * 100.0) / 100.0;
        return ans;
    }
    
    /**
     * This method calculate the standard deviation of the values of a LinkedList.
     * @param elements The LinkedList to calculate the standard deviation.
     * @return the standard deviation of the values of the LinkedList.
     */
    public static double standardDeviation(LinkedList elements){
        double mean = mean(elements);
        double ans = 0;
        for (int i = 0; i < elements.size(); i++){

            ans += Math.pow((new Double(elements.get(i).toString()) - mean) , 2 );
            
        }
        ans = Math.sqrt(ans / (elements.size()-1) );
        ans = Math.round(ans * 100.0) / 100.0;
        System.out.println(ans);
        
        return ans;
    }
}
