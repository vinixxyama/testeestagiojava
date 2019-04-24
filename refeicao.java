import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class refeicao{
    public ArrayList<String> manha(ArrayList<String> tipo){
        ArrayList<String> comidas = new ArrayList<>(tipo.size());
        int flag[] = new int[4];
        int i;
        int count=0;
        for(i=0;i<4;i++){
            flag[i] = 0;
        }
        for(i=0;i<3;i++){
            comidas.add("0");
        }
        for(i=0;i<tipo.size();i++){
            if(tipo.get(i).equals("1")){
                if(flag[0] == 0){
                    comidas.set(0,"eggs, ");
                    flag[0] = 1;
                }else{
                    comidas.removeAll(Collections.singleton("0"));
                    comidas.add("error");
                    break;
                }
            }else if(tipo.get(i).equals("2")){
                if(flag[1] == 0){
                    comidas.set(1,"toast, ");
                    flag[1] = 1;
                }else{
                    comidas.removeAll(Collections.singleton("0"));
                    comidas.add("error");
                    break;
                }
            }else if(tipo.get(i).equals("3")){
                count++;
                if(count > 1){
                    comidas.set(2,"coffee"+"(x"+ count + ")");
                }else{
                    comidas.set(2,"coffee");
                }
            }else if(tipo.get(i).equals("4") && flag[3] == 0){
                flag[3] = 1;
                comidas.add(", error");
            }
        }
        comidas.removeAll(Collections.singleton("0"));
        return comidas;
    }

    public ArrayList<String> noite(ArrayList<String> tipo){
        ArrayList<String> comidas = new ArrayList<>();
        int flag[] = new int[4];
        int i=0,count=0;

        for(i=0;i<4;i++){
            flag[i] = 0;
        }

        for(i=0;i<3;i++){
            comidas.add("0");
        }

        for(i=0;i<tipo.size();i++){
            if(tipo.get(i).equals("1")){
                if(flag[0] == 0){
                    comidas.set(0,"steak, ");
                    flag[0] = 1;
                }else{
                    comidas.removeAll(Collections.singleton("0"));
                    comidas.add("error");
                    break;
                }
            }else if(tipo.get(i).equals("2")){
                count++;
                if(count == 1){
                    comidas.set(1,"potato, ");
                }else{
                    comidas.set(1,"potato"+"(x"+ count + "), ");
                }
            }else if(tipo.get(i).equals("3")){
                if(flag[2] == 0){
                    comidas.set(2,"wine, ");
                    flag[2] = 1;
                }else{
                    comidas.removeAll(Collections.singleton("0"));
                    comidas.add("error");
                    break;
                }
            }else if(tipo.get(i).equals("4") && flag[3] == 0){
                if(flag[3] == 0){
                    comidas.add(3,"cake ");
                    flag[3] = 1;
                }else{
                    comidas.removeAll(Collections.singleton("0"));
                    comidas.add("error");
                    break;
                }
            }else if(tipo.get(i).equals("night")){
            }else{
                comidas.add("error");
            }
        }
        comidas.removeAll(Collections.singleton("0"));
        return comidas;
    }
}