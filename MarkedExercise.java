package Lab6;


import java.util.List;
import java.util.ArrayList;//constructs an array of lists of object
import java.util.ListIterator; //iterate element one by one from a list in a proper sequence


public class MarkedExercise {
    public static List<Integer> reverseIntegers(List<Integer> list) {

        List<Integer> reverse = new ArrayList<>(list.size());//declares an array list and stores it in the variable "reverse"


        ListIterator<Integer>loop_itr = list.listIterator(list.size());
        while (loop_itr.hasPrevious()){ //the hasprevious and previous have been used to support backward direction iteration.
            reverse.add(loop_itr.previous());//iterate through the list backwards and adds each element of the lists into the list of variable "reverse"
        }

        return reverse;


    }
}


