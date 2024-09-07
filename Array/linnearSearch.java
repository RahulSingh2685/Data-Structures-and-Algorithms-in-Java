package Array4;

public class linnearSearch {
    public static void main(String[] args) {
        int number[]={2,4,6,8,12,14,16};
        String menu[]={"Dosa","Chole Bhature","Samose","Cold drink"};
        int key=10;
        String key1="Samose";
        int flag=0,i;
        for( i=0;i<number.length;i++){
            if(menu[i]==key1){
                flag=1;
                break;

            }
        }
        if(flag==1){
            System.out.println("Key is found at index no."+i);
        }
        else{
            System.out.println("Not found");
        }

    }
}
