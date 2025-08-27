public class DTraverseArrays {
    public static void main(String[] args) {
        int[] ages = new int[3];

        for (int age: ages){
            System.out.println(age);
        }
        for(int i = 0; i < 3; i++){
            System.out.println(ages[i]);
        }

        int i=0;
        while(i<3){
            System.out.println(ages[i]);
            i=i+1;
        }

        int[][] age = {{2, 3}, {4, 5}};
        for (int a = 0; a < age.length; a++) {
            for (int j = 0; j < age[a].length; j++) {
                System.out.println(age[a][j]);
            }
        }
    }
}