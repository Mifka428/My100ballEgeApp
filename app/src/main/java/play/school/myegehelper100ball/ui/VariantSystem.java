package play.school.myegehelper100ball.ui;

import android.util.Log;

public class VariantSystem {

    public static String file_name_sadaniye = "";
    public static String file_name_otveti = "";
    public static String name_doc = "";

    private static String otvet_members = "Ваш ответ:\n";
    private static String otvet_system = "Правильный ответ:\n";
    private static int result = 0;
    public static int numVar = 0;
    public static int count = 0;
    public static String[] otveti_member = new String[11];

    public static void setName_doc(String name){
        name_doc+= name;
    }
    public static void setNumVar(int num){
            numVar = num;
        }
    public static void setResult(){
        for(int i = 0; i <= 10; i++){

            otvet_members+=Integer.toString(i + 1) + ". " + otveti_member[i] + "\n";
            otvet_system+=Integer.toString(i + 1) + " ." + "" + ReadFile.var_otvet[i] + "\n";
            if(otveti_member[i].contains(ReadFile.var_otvet[i])){
                result++;
            }
            }


    }
    public static String getOtvet_system(){
        return otvet_system;
    }
    public static String getOtvet_member(){
        return otvet_members;
    }
    public static String getResult(){
        return "Правильных ответов" + " " + Integer.toString(result);
    }
        public static int getNumVar(){
            return numVar;
        }

    }


