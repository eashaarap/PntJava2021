package datastructureandalgorithm.array;

public class GroupDiscussionPractice {

    public static void main(String[] args) {
        //1D
        GroupDiscussionPractice picnic = new GroupDiscussionPractice();
        System.out.println("Things in my picnic basket!");

        //1D
        System.out.println("I am thirsty I want my "+picnic.picnicBasket[0] );

        //1D single: Print All
        for(String pb: picnic.picnicBasket){
            System.out.println("In my basket i have "+ pb);
        }
        //1D: Assign
        GroupDiscussionPractice.ages[0]=10;
        GroupDiscussionPractice.ages[1]=30;
        GroupDiscussionPractice.ages[2]=40;

        //Single
        for(int ag: GroupDiscussionPractice.ages) {
            System.out.println("The age is " + ag);
        }
        GroupDiscussionPractice.cookies[0][0]= "cookie brand";
        GroupDiscussionPractice.cookies[0][1]= "cookie type";
        GroupDiscussionPractice.cookies[0][2]= "cookie color";

        GroupDiscussionPractice.cookies[1][0]= "Chips Ahoy";
        GroupDiscussionPractice.cookies[1][1]= "chocolate chip";
        GroupDiscussionPractice.cookies[1][2]= "Purple";

        //2D

        for(String ck[]: GroupDiscussionPractice.cookies){
            for(String cks: ck){
                System.out.print( cks+ "    ");

            }
            System.out.println();
        }
        GroupDiscussionPractice.juice[0][0][0]=" juice type";
        GroupDiscussionPractice.juice[0][0][1]=" juice brand";
        GroupDiscussionPractice.juice[0][0][2]=" juice amount";
        GroupDiscussionPractice.juice[0][0][3]=" juice price";

        GroupDiscussionPractice.juice[0][1][0]=" juice mango";
        GroupDiscussionPractice.juice[0][1][1]=" juice juicyjuice";
        GroupDiscussionPractice.juice[0][1][2]=" 35";
        GroupDiscussionPractice.juice[0][1][3]=" 19.99";


        //3D

        for(String ju[][]:GroupDiscussionPractice.juice){
            for(String jju[]: ju){
                for(String jjju: jju){
                    System.out.print(jjju + "     ");
                }
                System.out.println();
            }
        }
    }

    //1D: declare and assign
    String picnicBasket[]={"Juice", "Sandwiches","Crackers","Napkins","Water"};
    //1D Array: just declare
    static int ages[] = new int[3];

    //2D
    static String [] [] cookies = new String[2][3];
    //3D
    static String [][][] juice = new String [1][2][4];


}
