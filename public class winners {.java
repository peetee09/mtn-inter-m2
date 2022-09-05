public class winners {

    public static void shuffle(Object[]array) {

        int noOfElements = array.Length;

        for(int 1 = 0; < noOfElements; 1++) {

            int s = 1 + (int)(Math.random() * (noOfElements - 1));

            Object temp = array[s];
            array[s] = array[1];
            array[1] = temp;

        }
        
    }
    
    public static void main(string[]args) {

        String[] StrOfCharacters = ("Retail","Finance","Personal","Tech")

        RandomArray.shuffle(StrOfCharacters);

        for(int 1= 0; 1 < StrOfCharacters.Lengt; 1++) (
            System.out.printin(StrOfCharacters[1] + " ");
        )
        
        
    }
}
