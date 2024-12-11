package week11.ArrayListDemo;

import java.util.ArrayList;

public class SystemManagement {
    private ArrayList<String> array = new ArrayList<String>();
    private ArrayList<String> array2 = new ArrayList<String>();
    private ArrayList<String> array3= new ArrayList<String>();

    public void add(String input, int listNum){
        if(listNum == 1){
            array.add(input);
        }if(listNum == 2){
            array2.add(input);
        }if(listNum == 3){
            array3.add(input);
        }

    }
    public void remove(String input, int listNum){
        if(listNum == 1){
            array.remove(input);
        }if(listNum == 2){
            array2.remove(input);
        }if(listNum == 3){
            array3.remove(input);
        }

    }
    public int size(int listNum){
        if(listNum == 1){
            return(array.size());
        } else if ((listNum == 2)) {
            return(array2.size());
        }else{
            return(array3.size());
        }
    }
    public String get(int input, int listNum){
        if(listNum == 1){
            return(array.get(input));
        }else if(listNum == 2){
            return(array2.get(input));
        }else{
            return(array3.get(input));
        }
    }
    public void printFor(){
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
            System.out.println(array2.get(i));
            System.out.println(array3.get(i));
        }
    }
    public void printForEach(int listNum){
        if(listNum == 1){
            for(String i : array){
                System.out.println(i);
            }
        }if(listNum == 2){
            for(String i : array2){
                System.out.println(i);
            }
        }if(listNum == 3){
            for(String i : array3){
                System.out.println(i);
            }
        }
    }

}
